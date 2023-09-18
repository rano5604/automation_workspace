
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updatePayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updatePayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bankTransactionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentSlip" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePayment", propOrder = {
    "applicationId",
    "bankTransactionNumber",
    "paymentSlip"
})
public class UpdatePayment {

    protected Long applicationId;
    protected String bankTransactionNumber;
    protected byte[] paymentSlip;

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationId(Long value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the bankTransactionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankTransactionNumber() {
        return bankTransactionNumber;
    }

    /**
     * Sets the value of the bankTransactionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankTransactionNumber(String value) {
        this.bankTransactionNumber = value;
    }

    /**
     * Gets the value of the paymentSlip property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPaymentSlip() {
        return paymentSlip;
    }

    /**
     * Sets the value of the paymentSlip property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPaymentSlip(byte[] value) {
        this.paymentSlip = value;
    }

}
