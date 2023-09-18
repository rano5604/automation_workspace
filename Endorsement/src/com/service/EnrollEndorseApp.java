
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enrollEndorseApp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enrollEndorseApp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}enrollEndorsementApplicationRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enrollEndorseApp", propOrder = {
    "request"
})
public class EnrollEndorseApp {

    protected EnrollEndorsementApplicationRequest request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollEndorsementApplicationRequest }
     *     
     */
    public EnrollEndorsementApplicationRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollEndorsementApplicationRequest }
     *     
     */
    public void setRequest(EnrollEndorsementApplicationRequest value) {
        this.request = value;
    }

}
