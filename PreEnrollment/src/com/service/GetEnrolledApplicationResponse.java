
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEnrolledApplicationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEnrolledApplicationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="dlResponse" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}enrollApplication" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEnrolledApplicationResponse", propOrder = {
    "dlResponse"
})
public class GetEnrolledApplicationResponse
    extends ServiceResponse
{

    protected EnrollApplication dlResponse;

    /**
     * Gets the value of the dlResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollApplication }
     *     
     */
    public EnrollApplication getDlResponse() {
        return dlResponse;
    }

    /**
     * Sets the value of the dlResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollApplication }
     *     
     */
    public void setDlResponse(EnrollApplication value) {
        this.dlResponse = value;
    }

}
