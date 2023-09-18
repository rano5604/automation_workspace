/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client;


import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;

import org.apache.axis.message.MessageElement;
import org.w3c.dom.Element;

import com.service.ApplicationService;
import com.service.ApplicationService_Service;

/**
 *
 * @author Ataur Rahman
 */

public class ServiceManager {

	
	private static String serviceUser=null;
	
	
	public  void setUser(String user){
		serviceUser=user;
	}

    private static String APPLICATION_HOST = "192.168.1.31";//preenollment.brta.gov.bd";

    private static String APPLICATION_PORT = "7025";//7001";

    private static final String APPLICATION_PATH = "/hsdl";

    private static final String WSDL_EXTENSION = "?WSDL";
    private static String PROTOCOL = "http://";
    private final static String APPLICATION_SERVICE_NAME = "/ApplicationService";


    private final static QName APPLICATION_SERVICE_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "ApplicationService");

    private static ApplicationService appservice = null;


    private static URL getApplicationUrl(String serviceName) throws MalformedURLException {
        try {
           
            System.out.println(PROTOCOL + APPLICATION_HOST + ":" + APPLICATION_PORT + APPLICATION_PATH + serviceName + WSDL_EXTENSION);
    
            return new URL(PROTOCOL + APPLICATION_HOST + ":" + APPLICATION_PORT + APPLICATION_PATH + serviceName + WSDL_EXTENSION);
        } catch (MalformedURLException e) {

            throw new MalformedURLException("Unable to connect with wsdl file");
        }
    }
    


    public static ApplicationService getApplicationService(SecurityHandlerResolver r) {
        ApplicationService_Service applicationServiceBean = null;
        try {
            applicationServiceBean = new ApplicationService_Service(getApplicationUrl(APPLICATION_SERVICE_NAME), APPLICATION_SERVICE_QNAME);
        } catch (Exception e) {
            e.fillInStackTrace();
        }
        applicationServiceBean.setHandlerResolver(getSecurityToken());
        appservice = applicationServiceBean.getApplicationServicePort();
        return appservice;
    }



    public static SecurityHandlerResolver getSecurityToken() {
        UsernameTokenHandler hhr = new UsernameTokenHandler(serviceUser,"61bd60c60d9fb60cc8fc7767669d40a1");
        SecurityHandlerResolver handlerResolver = null;
        try {
            Element assertion = null;
            assertion = hhr.getToken();
            if (assertion != null) {
                MessageElement samlElement = new MessageElement(assertion);
                SOAPElement soapElement = (SOAPElement) samlElement;
                handlerResolver = new SecurityHandlerResolver(soapElement);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return handlerResolver;

    }
}
