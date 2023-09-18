
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for endorsementDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endorsementDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressProofCopy" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="applicantType" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}applicantTypeEnum" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endorsementApplicationPage1" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="endorsementApplicationPage2" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="endorsementReplyLetter" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="endorsementVolumeCopy1" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="endorsementVolumeCopy2" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licenseType" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}licenseTypeEnum" minOccurs="0"/>
 *         &lt;element name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldLicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plasticCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="previousDl" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="reviewDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reviewedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endorsementDetails", propOrder = {
    "addressProofCopy",
    "applicantType",
    "comment",
    "createdBy",
    "creationDate",
    "dateOfBirth",
    "endorsementApplicationPage1",
    "endorsementApplicationPage2",
    "endorsementReplyLetter",
    "endorsementVolumeCopy1",
    "endorsementVolumeCopy2",
    "fullName",
    "id",
    "lastUpdateDate",
    "lastUpdatedBy",
    "licenseType",
    "mobileNumber",
    "newAuthority",
    "newReferenceNumber",
    "oldAuthority",
    "oldLicenseNumber",
    "oldReferenceNumber",
    "plasticCard",
    "previousDl",
    "reviewDate",
    "reviewedBy",
    "status"
})
public class EndorsementDetails {

    protected byte[] addressProofCopy;
    @XmlSchemaType(name = "string")
    protected ApplicantTypeEnum applicantType;
    protected String comment;
    protected String createdBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    protected String dateOfBirth;
    protected byte[] endorsementApplicationPage1;
    protected byte[] endorsementApplicationPage2;
    protected byte[] endorsementReplyLetter;
    protected byte[] endorsementVolumeCopy1;
    protected byte[] endorsementVolumeCopy2;
    protected String fullName;
    protected Long id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDate;
    protected String lastUpdatedBy;
    @XmlSchemaType(name = "string")
    protected LicenseTypeEnum licenseType;
    protected String mobileNumber;
    protected String newAuthority;
    protected String newReferenceNumber;
    protected String oldAuthority;
    protected String oldLicenseNumber;
    protected String oldReferenceNumber;
    protected boolean plasticCard;
    protected byte[] previousDl;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reviewDate;
    protected String reviewedBy;
    protected String status;

    /**
     * Gets the value of the addressProofCopy property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAddressProofCopy() {
        return addressProofCopy;
    }

    /**
     * Sets the value of the addressProofCopy property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAddressProofCopy(byte[] value) {
        this.addressProofCopy = value;
    }

    /**
     * Gets the value of the applicantType property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicantTypeEnum }
     *     
     */
    public ApplicantTypeEnum getApplicantType() {
        return applicantType;
    }

    /**
     * Sets the value of the applicantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicantTypeEnum }
     *     
     */
    public void setApplicantType(ApplicantTypeEnum value) {
        this.applicantType = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the endorsementApplicationPage1 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEndorsementApplicationPage1() {
        return endorsementApplicationPage1;
    }

    /**
     * Sets the value of the endorsementApplicationPage1 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEndorsementApplicationPage1(byte[] value) {
        this.endorsementApplicationPage1 = value;
    }

    /**
     * Gets the value of the endorsementApplicationPage2 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEndorsementApplicationPage2() {
        return endorsementApplicationPage2;
    }

    /**
     * Sets the value of the endorsementApplicationPage2 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEndorsementApplicationPage2(byte[] value) {
        this.endorsementApplicationPage2 = value;
    }

    /**
     * Gets the value of the endorsementReplyLetter property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEndorsementReplyLetter() {
        return endorsementReplyLetter;
    }

    /**
     * Sets the value of the endorsementReplyLetter property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEndorsementReplyLetter(byte[] value) {
        this.endorsementReplyLetter = value;
    }

    /**
     * Gets the value of the endorsementVolumeCopy1 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEndorsementVolumeCopy1() {
        return endorsementVolumeCopy1;
    }

    /**
     * Sets the value of the endorsementVolumeCopy1 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEndorsementVolumeCopy1(byte[] value) {
        this.endorsementVolumeCopy1 = value;
    }

    /**
     * Gets the value of the endorsementVolumeCopy2 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEndorsementVolumeCopy2() {
        return endorsementVolumeCopy2;
    }

    /**
     * Sets the value of the endorsementVolumeCopy2 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEndorsementVolumeCopy2(byte[] value) {
        this.endorsementVolumeCopy2 = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the lastUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Sets the value of the lastUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedBy(String value) {
        this.lastUpdatedBy = value;
    }

    /**
     * Gets the value of the licenseType property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseTypeEnum }
     *     
     */
    public LicenseTypeEnum getLicenseType() {
        return licenseType;
    }

    /**
     * Sets the value of the licenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseTypeEnum }
     *     
     */
    public void setLicenseType(LicenseTypeEnum value) {
        this.licenseType = value;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

    /**
     * Gets the value of the newAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewAuthority() {
        return newAuthority;
    }

    /**
     * Sets the value of the newAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewAuthority(String value) {
        this.newAuthority = value;
    }

    /**
     * Gets the value of the newReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewReferenceNumber() {
        return newReferenceNumber;
    }

    /**
     * Sets the value of the newReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewReferenceNumber(String value) {
        this.newReferenceNumber = value;
    }

    /**
     * Gets the value of the oldAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldAuthority() {
        return oldAuthority;
    }

    /**
     * Sets the value of the oldAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldAuthority(String value) {
        this.oldAuthority = value;
    }

    /**
     * Gets the value of the oldLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldLicenseNumber() {
        return oldLicenseNumber;
    }

    /**
     * Sets the value of the oldLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldLicenseNumber(String value) {
        this.oldLicenseNumber = value;
    }

    /**
     * Gets the value of the oldReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldReferenceNumber() {
        return oldReferenceNumber;
    }

    /**
     * Sets the value of the oldReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldReferenceNumber(String value) {
        this.oldReferenceNumber = value;
    }

    /**
     * Gets the value of the plasticCard property.
     * 
     */
    public boolean isPlasticCard() {
        return plasticCard;
    }

    /**
     * Sets the value of the plasticCard property.
     * 
     */
    public void setPlasticCard(boolean value) {
        this.plasticCard = value;
    }

    /**
     * Gets the value of the previousDl property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPreviousDl() {
        return previousDl;
    }

    /**
     * Sets the value of the previousDl property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPreviousDl(byte[] value) {
        this.previousDl = value;
    }

    /**
     * Gets the value of the reviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReviewDate() {
        return reviewDate;
    }

    /**
     * Sets the value of the reviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReviewDate(XMLGregorianCalendar value) {
        this.reviewDate = value;
    }

    /**
     * Gets the value of the reviewedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewedBy() {
        return reviewedBy;
    }

    /**
     * Sets the value of the reviewedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewedBy(String value) {
        this.reviewedBy = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
