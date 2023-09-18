
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for suspendApplicationServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="suspendApplicationServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="suspendAttachment" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="suspendReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suspendApplicationServiceRequest", propOrder = {
    "applicationId",
    "suspendAttachment",
    "suspendReason"
})
public class SuspendApplicationServiceRequest
    extends ServiceRequest
{

    protected Long applicationId;
    protected byte[] suspendAttachment;
    protected String suspendReason;

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
     * Gets the value of the suspendAttachment property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSuspendAttachment() {
        return suspendAttachment;
    }

    /**
     * Sets the value of the suspendAttachment property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSuspendAttachment(byte[] value) {
        this.suspendAttachment = value;
    }

    /**
     * Gets the value of the suspendReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspendReason() {
        return suspendReason;
    }

    /**
     * Sets the value of the suspendReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspendReason(String value) {
        this.suspendReason = value;
    }

}
