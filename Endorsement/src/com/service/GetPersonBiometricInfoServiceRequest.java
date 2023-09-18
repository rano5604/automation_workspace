
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPersonBiometricInfoServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPersonBiometricInfoServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="fingerprint" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="photo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="primaryPersonId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="secondaryPersonId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonBiometricInfoServiceRequest", propOrder = {
    "fingerprint",
    "photo",
    "primaryPersonId",
    "secondaryPersonId",
    "signature"
})
public class GetPersonBiometricInfoServiceRequest
    extends ServiceRequest
{

    protected boolean fingerprint;
    protected boolean photo;
    protected long primaryPersonId;
    protected long secondaryPersonId;
    protected boolean signature;

    /**
     * Gets the value of the fingerprint property.
     * 
     */
    public boolean isFingerprint() {
        return fingerprint;
    }

    /**
     * Sets the value of the fingerprint property.
     * 
     */
    public void setFingerprint(boolean value) {
        this.fingerprint = value;
    }

    /**
     * Gets the value of the photo property.
     * 
     */
    public boolean isPhoto() {
        return photo;
    }

    /**
     * Sets the value of the photo property.
     * 
     */
    public void setPhoto(boolean value) {
        this.photo = value;
    }

    /**
     * Gets the value of the primaryPersonId property.
     * 
     */
    public long getPrimaryPersonId() {
        return primaryPersonId;
    }

    /**
     * Sets the value of the primaryPersonId property.
     * 
     */
    public void setPrimaryPersonId(long value) {
        this.primaryPersonId = value;
    }

    /**
     * Gets the value of the secondaryPersonId property.
     * 
     */
    public long getSecondaryPersonId() {
        return secondaryPersonId;
    }

    /**
     * Sets the value of the secondaryPersonId property.
     * 
     */
    public void setSecondaryPersonId(long value) {
        this.secondaryPersonId = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     */
    public boolean isSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     */
    public void setSignature(boolean value) {
        this.signature = value;
    }

}
