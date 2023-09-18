
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getNationalityLookupServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getNationalityLookupServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="activeMissions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nationality" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}learnerCountry" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNationalityLookupServiceRequest", propOrder = {
    "activeMissions",
    "nationality"
})
public class GetNationalityLookupServiceRequest
    extends ServiceRequest
{

    protected boolean activeMissions;
    protected LearnerCountry nationality;

    /**
     * Gets the value of the activeMissions property.
     * 
     */
    public boolean isActiveMissions() {
        return activeMissions;
    }

    /**
     * Sets the value of the activeMissions property.
     * 
     */
    public void setActiveMissions(boolean value) {
        this.activeMissions = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link LearnerCountry }
     *     
     */
    public LearnerCountry getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearnerCountry }
     *     
     */
    public void setNationality(LearnerCountry value) {
        this.nationality = value;
    }

}
