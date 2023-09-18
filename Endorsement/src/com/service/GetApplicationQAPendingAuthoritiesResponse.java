
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getApplicationQAPendingAuthoritiesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getApplicationQAPendingAuthoritiesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}getApplicationQAPendingAuthoritiesServiceResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getApplicationQAPendingAuthoritiesResponse", propOrder = {
    "_return"
})
public class GetApplicationQAPendingAuthoritiesResponse {

    @XmlElement(name = "return")
    protected GetApplicationQAPendingAuthoritiesServiceResponse _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetApplicationQAPendingAuthoritiesServiceResponse }
     *     
     */
    public GetApplicationQAPendingAuthoritiesServiceResponse getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetApplicationQAPendingAuthoritiesServiceResponse }
     *     
     */
    public void setReturn(GetApplicationQAPendingAuthoritiesServiceResponse value) {
        this._return = value;
    }

}
