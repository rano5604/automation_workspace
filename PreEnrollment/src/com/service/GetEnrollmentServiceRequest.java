
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEnrollmentServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEnrollmentServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="partialSave" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="preEnroll" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}learnerApplication" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEnrollmentServiceRequest", propOrder = {
    "partialSave",
    "preEnroll"
})
public class GetEnrollmentServiceRequest
    extends ServiceRequest
{

    protected boolean partialSave;
    protected LearnerApplication preEnroll;

    /**
     * Gets the value of the partialSave property.
     * 
     */
    public boolean isPartialSave() {
        return partialSave;
    }

    /**
     * Sets the value of the partialSave property.
     * 
     */
    public void setPartialSave(boolean value) {
        this.partialSave = value;
    }

    /**
     * Gets the value of the preEnroll property.
     * 
     * @return
     *     possible object is
     *     {@link LearnerApplication }
     *     
     */
    public LearnerApplication getPreEnroll() {
        return preEnroll;
    }

    /**
     * Sets the value of the preEnroll property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearnerApplication }
     *     
     */
    public void setPreEnroll(LearnerApplication value) {
        this.preEnroll = value;
    }

}
