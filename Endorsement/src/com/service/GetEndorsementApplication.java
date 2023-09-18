
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEndorsementApplication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEndorsementApplication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}getEndorsementApplicationServiceRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEndorsementApplication", propOrder = {
    "request"
})
public class GetEndorsementApplication {

    protected GetEndorsementApplicationServiceRequest request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link GetEndorsementApplicationServiceRequest }
     *     
     */
    public GetEndorsementApplicationServiceRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetEndorsementApplicationServiceRequest }
     *     
     */
    public void setRequest(GetEndorsementApplicationServiceRequest value) {
        this.request = value;
    }

}
