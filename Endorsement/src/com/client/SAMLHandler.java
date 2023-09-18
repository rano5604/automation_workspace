/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client;




import java.util.Set;

import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
/**
 *
 * @author Ataur Rahman
 */
public class SAMLHandler implements SOAPHandler<SOAPMessageContext> {

    private static SOAPElement assertion;

    static {
        assertion = null;
    }

    public static void setAssertion(SOAPElement elem) {
        assertion = elem;
    }

    @SuppressWarnings("unused")
	public boolean handleMessage(SOAPMessageContext smc) {
        Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (outboundProperty.booleanValue()) {
            SOAPMessage message = smc.getMessage();
            try {
                SOAPEnvelope envelope = smc.getMessage().getSOAPPart().getEnvelope();
                SOAPHeader header = envelope.getHeader(); //envelope.addHeader();
                SOAPElement security = header.addChildElement("Security", "wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
                if (assertion != null) {
                    security.addChildElement(assertion);
                }

                //Print out the outbound SOAP message to System.out

/*                if (Defs.isDebug) {
                    message.writeTo(System.out);
                    System.out.println("");
                }*/
            } catch (Exception e) {
//                e.printStackTrace();
            }
        } else {
            try {
                //This handler does nothing with the response from the Web Service so
                //we just print out the SOAP message.
                SOAPMessage message = smc.getMessage();
/*                if (Defs.isDebug) {
                    message.writeTo(System.out);
                    System.out.println("");
                }*/
            } catch (Exception ex) {
//                UsefulMethods.debugPrint(ex);
            }
        }


        return outboundProperty;

    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
	public Set getHeaders() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return null;
    }

    public boolean handleFault(SOAPMessageContext context) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return true;
    }

    public void close(MessageContext context) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
