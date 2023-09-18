
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getValidateDlApplicationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getValidateDlApplicationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}getDlEnrollServiceResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getValidateDlApplicationResponse", propOrder = {
    "_return"
})
public class GetValidateDlApplicationResponse {

    @XmlElement(name = "return")
    protected GetDlEnrollServiceResponse _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetDlEnrollServiceResponse }
     *     
     */
    public GetDlEnrollServiceResponse getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDlEnrollServiceResponse }
     *     
     */
    public void setReturn(GetDlEnrollServiceResponse value) {
        this._return = value;
    }

}
