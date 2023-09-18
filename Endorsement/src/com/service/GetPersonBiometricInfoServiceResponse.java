
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPersonBiometricInfoServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPersonBiometricInfoServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="primaryPerson" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}biometric" minOccurs="0"/>
 *         &lt;element name="secondaryPerson" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}biometric" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonBiometricInfoServiceResponse", propOrder = {
    "primaryPerson",
    "secondaryPerson"
})
public class GetPersonBiometricInfoServiceResponse
    extends ServiceResponse
{

    protected Biometric primaryPerson;
    protected Biometric secondaryPerson;

    /**
     * Gets the value of the primaryPerson property.
     * 
     * @return
     *     possible object is
     *     {@link Biometric }
     *     
     */
    public Biometric getPrimaryPerson() {
        return primaryPerson;
    }

    /**
     * Sets the value of the primaryPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link Biometric }
     *     
     */
    public void setPrimaryPerson(Biometric value) {
        this.primaryPerson = value;
    }

    /**
     * Gets the value of the secondaryPerson property.
     * 
     * @return
     *     possible object is
     *     {@link Biometric }
     *     
     */
    public Biometric getSecondaryPerson() {
        return secondaryPerson;
    }

    /**
     * Sets the value of the secondaryPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link Biometric }
     *     
     */
    public void setSecondaryPerson(Biometric value) {
        this.secondaryPerson = value;
    }

}
