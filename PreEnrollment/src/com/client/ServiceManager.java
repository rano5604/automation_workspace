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

import com.service.EnrollmentServiceBeanService;
import com.service.EnrollmentServiceBeanService_Service;

/**
 *
 * @author Ataur Rahman
 */

public class ServiceManager {

	//private static String PREENROLLMENT_HOST = "192.168.1.31";//preenollment.brta.gov.bd";

   // private static String PREENROLLMENT_PORT = "7025";

    private static final String PREENROLLMENT_PATH = "/preenrollment";

    private static final String WSDL_EXTENSION = "?WSDL";
    private static String PROTOCOL = "http://";
    private final static String PREENROLLMENT_SERVICE_NAME = "/EnrollmentService";


    private final static QName PREENROLLMENT_SERVICE_QNAME = new QName("http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/", "EnrollmentServiceBeanService");

    private static EnrollmentServiceBeanService enrollmentService = null;


    private static URL getPreenrollmentUrl(String serviceName) throws MalformedURLException {
        EnrollForm ef = new EnrollForm();
    	try {
           
            System.out.println(PROTOCOL + ef.url_service + ":" + ef.port_service + PREENROLLMENT_PATH + serviceName + WSDL_EXTENSION);
    
            return new URL(PROTOCOL + ef.url_service + ":" + ef.port_service + PREENROLLMENT_PATH + serviceName + WSDL_EXTENSION);
        } catch (MalformedURLException e) {

            throw new MalformedURLException("Unable to connect with wsdl file");
        }
    }

    public static EnrollmentServiceBeanService getEnrollmentService(SecurityHandlerResolver r) {
        EnrollmentServiceBeanService_Service enrollmentServiceBean = null;
        try {
            enrollmentServiceBean = new EnrollmentServiceBeanService_Service(getPreenrollmentUrl(PREENROLLMENT_SERVICE_NAME), PREENROLLMENT_SERVICE_QNAME);
        } catch (Exception e) {
            e.fillInStackTrace();
        }
        enrollmentServiceBean.setHandlerResolver(getSecurityToken());
        enrollmentService = enrollmentServiceBean.getEnrollmentServicePort();
        return enrollmentService;
    }



    public static SecurityHandlerResolver getSecurityToken() {
        UsernameTokenHandler hhr = new UsernameTokenHandler("A2ILEARNER","a504e5a6dd58673e34d99ff6f4c428ff");
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
