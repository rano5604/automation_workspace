
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for restoreApplicationServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="restoreApplicationServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="restoreReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restoreApplicationServiceRequest", propOrder = {
    "applicationId",
    "restoreReason"
})
public class RestoreApplicationServiceRequest
    extends ServiceRequest
{

    protected Long applicationId;
    protected String restoreReason;

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
     * Gets the value of the restoreReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestoreReason() {
        return restoreReason;
    }

    /**
     * Sets the value of the restoreReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestoreReason(String value) {
        this.restoreReason = value;
    }

}
