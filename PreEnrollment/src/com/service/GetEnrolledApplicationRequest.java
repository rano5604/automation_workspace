
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEnrolledApplicationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEnrolledApplicationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="preEnrollReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEnrolledApplicationRequest", propOrder = {
    "preEnrollReference"
})
public class GetEnrolledApplicationRequest
    extends ServiceRequest
{

    protected String preEnrollReference;

    /**
     * Gets the value of the preEnrollReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreEnrollReference() {
        return preEnrollReference;
    }

    /**
     * Sets the value of the preEnrollReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreEnrollReference(String value) {
        this.preEnrollReference = value;
    }

}
