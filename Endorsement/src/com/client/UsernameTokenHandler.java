/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client;

import java.io.ByteArrayOutputStream;
import java.util.Set;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.Name;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.axis.message.MessageElement;
import org.w3c.dom.Element;


/**
 *
 * @author Ataur Rahman
 */
public class UsernameTokenHandler implements SOAPHandler<SOAPMessageContext> {

    @SuppressWarnings("unused")
	private static final Logger cTRACE = Logger.getLogger(UsernameTokenHandler.class.getName());
    private static final String cNODE_USRTOKEN = "UsernameToken";
    private static final String cNODE_USERNAME = "Username";
    private static final String cNODE_PASSWORD = "Password";
    private static String iUsername;
    private static String iPassword;

    /**
     * Constructor for SOAP handler with specific wss credentials.
     *
     * @param aUsername wss username
     * @param aPassword wss password
     */
    public UsernameTokenHandler(String username, String token) {
        super();
        iUsername = username;
        iPassword = token;

    }

    
    public  Element getToken() 
    {
        
        
        Element assertion = null;
        try 
        {
            
            SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();
//            SOAPEnvelope envelope = 
            SOAPPart sOAPPart = soapMessage.getSOAPPart();
            SOAPEnvelope envelope = sOAPPart.getEnvelope();
            SOAPHeader header = envelope.getHeader(); 
            
            if (header==null) 
            {
                // no header yet, create one
                header = envelope.addHeader();
            }
            SOAPElement security = header.addChildElement("Security", "wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd")
                    .addNamespaceDeclaration("SOAP-ENV", "http://schemas.xmlsoap.org/soap/envelope/");

            

            Name tUserTokenElementName = envelope.createName(cNODE_USRTOKEN, "wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
            SOAPElement tUserTokenElement = security.addChildElement(tUserTokenElementName);
            tUserTokenElement.removeNamespaceDeclaration("wsse");
            tUserTokenElement.addNamespaceDeclaration("wsu", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");

            // user name child
            Name tUsernameElementName = envelope.createName(cNODE_USERNAME, "wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
            SOAPElement tUsernameElement = tUserTokenElement.addChildElement(tUsernameElementName);
            tUsernameElement.removeNamespaceDeclaration("wsse");
            tUsernameElement.addTextNode(iUsername);

            // password child
            Name tPasswordElementName = envelope.createName(cNODE_PASSWORD, "wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
            SOAPElement tPasswordElement = tUserTokenElement.addChildElement(tPasswordElementName);
            tPasswordElement.removeNamespaceDeclaration("wsse");
            tPasswordElement.addTextNode(iPassword);
            tPasswordElement.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
            
            assertion = (Element) security;
            
//            printAssertion(assertion);
//            MessageElement samlElement = new MessageElement(assertion);
//            SAMLHandler.setAssertion((SOAPElement) samlElement);
//            soapElement = (SOAPElement) samlElement;
            
        } 
        catch (Exception e) 
        {
            
            
            // stop processing
            return assertion;
        }

        // continue processing
        return assertion;
    }

    @SuppressWarnings("unused")
	private void printAssertion(Element assertion) throws Exception {
        TransformerFactory tranFactory = TransformerFactory.newInstance();
        Transformer aTransformer = tranFactory.newTransformer();
        Source src = new DOMSource(assertion);
        new ByteArrayOutputStream();
        Result dest = new StreamResult(System.out);
        aTransformer.transform(src, dest);
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

    @Override
    public void close(MessageContext context) {
    }

    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @SuppressWarnings("unused")
	public boolean handleMessage(SOAPMessageContext context) {
        SOAPElement security = new MessageElement();

        try {
            
            SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();
            SOAPEnvelope envelope = soapMessage.getSOAPPart().getEnvelope();
            
            SOAPHeader header = soapMessage.getSOAPHeader();
            
            security = header.addChildElement("Security", "wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");

            if (header == null) {
                // no header yet, create one
                header = envelope.addHeader();
            }

            Name tUserTokenElementName = envelope.createName(cNODE_USRTOKEN, "wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
            SOAPElement tUserTokenElement = security.addChildElement(tUserTokenElementName);
            tUserTokenElement.removeNamespaceDeclaration("wsse");
            tUserTokenElement.addNamespaceDeclaration("wsu", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");

            // user name child
            Name tUsernameElementName = envelope.createName(cNODE_USERNAME, "wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
            SOAPElement tUsernameElement = tUserTokenElement.addChildElement(tUsernameElementName);
            tUsernameElement.removeNamespaceDeclaration("wsse");
            tUsernameElement.addTextNode(iUsername);

            // password child
            Name tPasswordElementName = envelope.createName(cNODE_PASSWORD, "wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
            SOAPElement tPasswordElement = tUserTokenElement.addChildElement(tPasswordElementName);
            tPasswordElement.removeNamespaceDeclaration("wsse");
            tPasswordElement.addTextNode(iPassword);
            tPasswordElement.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
            
        } catch (Exception e) {
            

            // stop processing
            return false;
        }



        // continue processing
        return true;
    }
}
