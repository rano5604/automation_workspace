
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for applicationCorrectionTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationCorrectionTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="afisStatusChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="applicantTypeChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="authorityChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cardStatusChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="expiryChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="generateCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="generateCardWithOldStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="licenseTypeChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mobileChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="motherNameChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="paymentFlagChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="psvMark" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="referenceDateChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="restoreApplication" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="vehicleChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationCorrectionTypes", propOrder = {
    "addressChange",
    "afisStatusChange",
    "applicantTypeChange",
    "authorityChange",
    "cardStatusChange",
    "expiryChange",
    "generateCard",
    "generateCardWithOldStatus",
    "licenseTypeChange",
    "mobileChange",
    "motherNameChange",
    "paymentFlagChange",
    "psvMark",
    "referenceDateChange",
    "restoreApplication",
    "vehicleChange"
})
@XmlSeeAlso({
    ApplicationDetailsCorrection.class
})
public class ApplicationCorrectionTypes {

    protected boolean addressChange;
    protected boolean afisStatusChange;
    protected boolean applicantTypeChange;
    protected boolean authorityChange;
    protected boolean cardStatusChange;
    protected boolean expiryChange;
    protected boolean generateCard;
    protected boolean generateCardWithOldStatus;
    protected boolean licenseTypeChange;
    protected boolean mobileChange;
    protected boolean motherNameChange;
    protected boolean paymentFlagChange;
    protected boolean psvMark;
    protected boolean referenceDateChange;
    protected boolean restoreApplication;
    protected boolean vehicleChange;

    /**
     * Gets the value of the addressChange property.
     * 
     */
    public boolean isAddressChange() {
        return addressChange;
    }

    /**
     * Sets the value of the addressChange property.
     * 
     */
    public void setAddressChange(boolean value) {
        this.addressChange = value;
    }

    /**
     * Gets the value of the afisStatusChange property.
     * 
     */
    public boolean isAfisStatusChange() {
        return afisStatusChange;
    }

    /**
     * Sets the value of the afisStatusChange property.
     * 
     */
    public void setAfisStatusChange(boolean value) {
        this.afisStatusChange = value;
    }

    /**
     * Gets the value of the applicantTypeChange property.
     * 
     */
    public boolean isApplicantTypeChange() {
        return applicantTypeChange;
    }

    /**
     * Sets the value of the applicantTypeChange property.
     * 
     */
    public void setApplicantTypeChange(boolean value) {
        this.applicantTypeChange = value;
    }

    /**
     * Gets the value of the authorityChange property.
     * 
     */
    public boolean isAuthorityChange() {
        return authorityChange;
    }

    /**
     * Sets the value of the authorityChange property.
     * 
     */
    public void setAuthorityChange(boolean value) {
        this.authorityChange = value;
    }

    /**
     * Gets the value of the cardStatusChange property.
     * 
     */
    public boolean isCardStatusChange() {
        return cardStatusChange;
    }

    /**
     * Sets the value of the cardStatusChange property.
     * 
     */
    public void setCardStatusChange(boolean value) {
        this.cardStatusChange = value;
    }

    /**
     * Gets the value of the expiryChange property.
     * 
     */
    public boolean isExpiryChange() {
        return expiryChange;
    }

    /**
     * Sets the value of the expiryChange property.
     * 
     */
    public void setExpiryChange(boolean value) {
        this.expiryChange = value;
    }

    /**
     * Gets the value of the generateCard property.
     * 
     */
    public boolean isGenerateCard() {
        return generateCard;
    }

    /**
     * Sets the value of the generateCard property.
     * 
     */
    public void setGenerateCard(boolean value) {
        this.generateCard = value;
    }

    /**
     * Gets the value of the generateCardWithOldStatus property.
     * 
     */
    public boolean isGenerateCardWithOldStatus() {
        return generateCardWithOldStatus;
    }

    /**
     * Sets the value of the generateCardWithOldStatus property.
     * 
     */
    public void setGenerateCardWithOldStatus(boolean value) {
        this.generateCardWithOldStatus = value;
    }

    /**
     * Gets the value of the licenseTypeChange property.
     * 
     */
    public boolean isLicenseTypeChange() {
        return licenseTypeChange;
    }

    /**
     * Sets the value of the licenseTypeChange property.
     * 
     */
    public void setLicenseTypeChange(boolean value) {
        this.licenseTypeChange = value;
    }

    /**
     * Gets the value of the mobileChange property.
     * 
     */
    public boolean isMobileChange() {
        return mobileChange;
    }

    /**
     * Sets the value of the mobileChange property.
     * 
     */
    public void setMobileChange(boolean value) {
        this.mobileChange = value;
    }

    /**
     * Gets the value of the motherNameChange property.
     * 
     */
    public boolean isMotherNameChange() {
        return motherNameChange;
    }

    /**
     * Sets the value of the motherNameChange property.
     * 
     */
    public void setMotherNameChange(boolean value) {
        this.motherNameChange = value;
    }

    /**
     * Gets the value of the paymentFlagChange property.
     * 
     */
    public boolean isPaymentFlagChange() {
        return paymentFlagChange;
    }

    /**
     * Sets the value of the paymentFlagChange property.
     * 
     */
    public void setPaymentFlagChange(boolean value) {
        this.paymentFlagChange = value;
    }

    /**
     * Gets the value of the psvMark property.
     * 
     */
    public boolean isPsvMark() {
        return psvMark;
    }

    /**
     * Sets the value of the psvMark property.
     * 
     */
    public void setPsvMark(boolean value) {
        this.psvMark = value;
    }

    /**
     * Gets the value of the referenceDateChange property.
     * 
     */
    public boolean isReferenceDateChange() {
        return referenceDateChange;
    }

    /**
     * Sets the value of the referenceDateChange property.
     * 
     */
    public void setReferenceDateChange(boolean value) {
        this.referenceDateChange = value;
    }

    /**
     * Gets the value of the restoreApplication property.
     * 
     */
    public boolean isRestoreApplication() {
        return restoreApplication;
    }

    /**
     * Sets the value of the restoreApplication property.
     * 
     */
    public void setRestoreApplication(boolean value) {
        this.restoreApplication = value;
    }

    /**
     * Gets the value of the vehicleChange property.
     * 
     */
    public boolean isVehicleChange() {
        return vehicleChange;
    }

    /**
     * Sets the value of the vehicleChange property.
     * 
     */
    public void setVehicleChange(boolean value) {
        this.vehicleChange = value;
    }

}
