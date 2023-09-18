/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.soap.SOAPElement;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
/**
 *
 * @author Ataur Rahman
 */
public class SecurityHandlerResolver implements HandlerResolver {

    private SOAPElement soapElement = null;
    private String authType;// saml or wss (password based authentication)
    
    public SecurityHandlerResolver(SOAPElement elem) {
        soapElement = elem;
    }
    
    @SuppressWarnings({ "static-access", "rawtypes" })
	@Override
    public List<Handler> getHandlerChain(PortInfo portInfo) {
        SAMLHandler theHandler = new SAMLHandler();
        theHandler.setAssertion(soapElement);
        List<Handler> hchain = new ArrayList<Handler>();
        hchain.add(new SAMLHandler());
        return hchain;
    }
    
    public SOAPElement getSoapElement() {
        return soapElement;
    }
    
    public void setSoapElement(SOAPElement soapElement) {
        this.soapElement = soapElement;
    }


    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    
}
