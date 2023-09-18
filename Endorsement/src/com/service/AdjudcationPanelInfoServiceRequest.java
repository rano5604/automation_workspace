
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adjudcationPanelInfoServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adjudcationPanelInfoServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="biometric" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="refNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adjudcationPanelInfoServiceRequest", propOrder = {
    "biometric",
    "personId",
    "refNo"
})
public class AdjudcationPanelInfoServiceRequest
    extends ServiceRequest
{

    protected boolean biometric;
    protected Long personId;
    protected String refNo;

    /**
     * Gets the value of the biometric property.
     * 
     */
    public boolean isBiometric() {
        return biometric;
    }

    /**
     * Sets the value of the biometric property.
     * 
     */
    public void setBiometric(boolean value) {
        this.biometric = value;
    }

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonId(Long value) {
        this.personId = value;
    }

    /**
     * Gets the value of the refNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNo() {
        return refNo;
    }

    /**
     * Sets the value of the refNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNo(String value) {
        this.refNo = value;
    }

}
