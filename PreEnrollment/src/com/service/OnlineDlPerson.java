
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for onlineDlPerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="onlineDlPerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bloodGroup" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emrgncyEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emrgncyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emrgncyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emrgncyRelation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherBn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="foreignAddress" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}onlineAddress" minOccurs="0"/>
 *         &lt;element name="foreignCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="foreignDlNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="foreignNational" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherBn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameBn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noFinger" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="noFingerprint" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="occupation" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="passportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permanentAddress" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}onlineAddress" minOccurs="0"/>
 *         &lt;element name="phoneHome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="presentAddress" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}onlineAddress" minOccurs="0"/>
 *         &lt;element name="spouseBn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="versionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "onlineDlPerson", propOrder = {
    "bloodGroup",
    "createdBy",
    "creationDate",
    "dateOfBirth",
    "email",
    "emrgncyEmail",
    "emrgncyName",
    "emrgncyNo",
    "emrgncyRelation",
    "fatherBn",
    "fatherEn",
    "foreignAddress",
    "foreignCountry",
    "foreignDlNo",
    "foreignNational",
    "gender",
    "id",
    "lastUpdateDate",
    "lastUpdatedBy",
    "maritalStatus",
    "mobile",
    "motherBn",
    "motherEn",
    "nameBn",
    "nameEn",
    "nationality",
    "nid",
    "noFinger",
    "noFingerprint",
    "occupation",
    "passportNo",
    "permanentAddress",
    "phoneHome",
    "phoneOffice",
    "presentAddress",
    "spouseBn",
    "spouseEn",
    "ssn",
    "status",
    "versionId"
})
public class OnlineDlPerson {

    protected Long bloodGroup;
    protected Long createdBy;
    protected String creationDate;
    protected String dateOfBirth;
    protected String email;
    protected String emrgncyEmail;
    protected String emrgncyName;
    protected String emrgncyNo;
    protected String emrgncyRelation;
    protected String fatherBn;
    protected String fatherEn;
    protected OnlineAddress foreignAddress;
    protected String foreignCountry;
    protected String foreignDlNo;
    protected Long foreignNational;
    protected Long gender;
    protected Long id;
    protected String lastUpdateDate;
    protected Long lastUpdatedBy;
    protected Long maritalStatus;
    protected String mobile;
    protected String motherBn;
    protected String motherEn;
    protected String nameBn;
    protected String nameEn;
    protected String nationality;
    protected String nid;
    protected Long noFinger;
    protected Long noFingerprint;
    protected Long occupation;
    protected String passportNo;
    protected OnlineAddress permanentAddress;
    protected String phoneHome;
    protected String phoneOffice;
    protected OnlineAddress presentAddress;
    protected String spouseBn;
    protected String spouseEn;
    protected String ssn;
    protected Long status;
    protected Long versionId;

    /**
     * Gets the value of the bloodGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBloodGroup() {
        return bloodGroup;
    }

    /**
     * Sets the value of the bloodGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBloodGroup(Long value) {
        this.bloodGroup = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreatedBy(Long value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDate(String value) {
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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the emrgncyEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmrgncyEmail() {
        return emrgncyEmail;
    }

    /**
     * Sets the value of the emrgncyEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmrgncyEmail(String value) {
        this.emrgncyEmail = value;
    }

    /**
     * Gets the value of the emrgncyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmrgncyName() {
        return emrgncyName;
    }

    /**
     * Sets the value of the emrgncyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmrgncyName(String value) {
        this.emrgncyName = value;
    }

    /**
     * Gets the value of the emrgncyNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmrgncyNo() {
        return emrgncyNo;
    }

    /**
     * Sets the value of the emrgncyNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmrgncyNo(String value) {
        this.emrgncyNo = value;
    }

    /**
     * Gets the value of the emrgncyRelation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmrgncyRelation() {
        return emrgncyRelation;
    }

    /**
     * Sets the value of the emrgncyRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmrgncyRelation(String value) {
        this.emrgncyRelation = value;
    }

    /**
     * Gets the value of the fatherBn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherBn() {
        return fatherBn;
    }

    /**
     * Sets the value of the fatherBn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherBn(String value) {
        this.fatherBn = value;
    }

    /**
     * Gets the value of the fatherEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherEn() {
        return fatherEn;
    }

    /**
     * Sets the value of the fatherEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherEn(String value) {
        this.fatherEn = value;
    }

    /**
     * Gets the value of the foreignAddress property.
     * 
     * @return
     *     possible object is
     *     {@link OnlineAddress }
     *     
     */
    public OnlineAddress getForeignAddress() {
        return foreignAddress;
    }

    /**
     * Sets the value of the foreignAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineAddress }
     *     
     */
    public void setForeignAddress(OnlineAddress value) {
        this.foreignAddress = value;
    }

    /**
     * Gets the value of the foreignCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignCountry() {
        return foreignCountry;
    }

    /**
     * Sets the value of the foreignCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignCountry(String value) {
        this.foreignCountry = value;
    }

    /**
     * Gets the value of the foreignDlNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignDlNo() {
        return foreignDlNo;
    }

    /**
     * Sets the value of the foreignDlNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignDlNo(String value) {
        this.foreignDlNo = value;
    }

    /**
     * Gets the value of the foreignNational property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getForeignNational() {
        return foreignNational;
    }

    /**
     * Sets the value of the foreignNational property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setForeignNational(Long value) {
        this.foreignNational = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGender(Long value) {
        this.gender = value;
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
     *     {@link String }
     *     
     */
    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateDate(String value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the lastUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Sets the value of the lastUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastUpdatedBy(Long value) {
        this.lastUpdatedBy = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaritalStatus(Long value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the motherBn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherBn() {
        return motherBn;
    }

    /**
     * Sets the value of the motherBn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherBn(String value) {
        this.motherBn = value;
    }

    /**
     * Gets the value of the motherEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherEn() {
        return motherEn;
    }

    /**
     * Sets the value of the motherEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherEn(String value) {
        this.motherEn = value;
    }

    /**
     * Gets the value of the nameBn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameBn() {
        return nameBn;
    }

    /**
     * Sets the value of the nameBn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameBn(String value) {
        this.nameBn = value;
    }

    /**
     * Gets the value of the nameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameEn() {
        return nameEn;
    }

    /**
     * Sets the value of the nameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameEn(String value) {
        this.nameEn = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the nid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNid() {
        return nid;
    }

    /**
     * Sets the value of the nid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNid(String value) {
        this.nid = value;
    }

    /**
     * Gets the value of the noFinger property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNoFinger() {
        return noFinger;
    }

    /**
     * Sets the value of the noFinger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNoFinger(Long value) {
        this.noFinger = value;
    }

    /**
     * Gets the value of the noFingerprint property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNoFingerprint() {
        return noFingerprint;
    }

    /**
     * Sets the value of the noFingerprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNoFingerprint(Long value) {
        this.noFingerprint = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOccupation(Long value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the passportNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNo() {
        return passportNo;
    }

    /**
     * Sets the value of the passportNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNo(String value) {
        this.passportNo = value;
    }

    /**
     * Gets the value of the permanentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link OnlineAddress }
     *     
     */
    public OnlineAddress getPermanentAddress() {
        return permanentAddress;
    }

    /**
     * Sets the value of the permanentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineAddress }
     *     
     */
    public void setPermanentAddress(OnlineAddress value) {
        this.permanentAddress = value;
    }

    /**
     * Gets the value of the phoneHome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneHome() {
        return phoneHome;
    }

    /**
     * Sets the value of the phoneHome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneHome(String value) {
        this.phoneHome = value;
    }

    /**
     * Gets the value of the phoneOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneOffice() {
        return phoneOffice;
    }

    /**
     * Sets the value of the phoneOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneOffice(String value) {
        this.phoneOffice = value;
    }

    /**
     * Gets the value of the presentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link OnlineAddress }
     *     
     */
    public OnlineAddress getPresentAddress() {
        return presentAddress;
    }

    /**
     * Sets the value of the presentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineAddress }
     *     
     */
    public void setPresentAddress(OnlineAddress value) {
        this.presentAddress = value;
    }

    /**
     * Gets the value of the spouseBn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseBn() {
        return spouseBn;
    }

    /**
     * Sets the value of the spouseBn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseBn(String value) {
        this.spouseBn = value;
    }

    /**
     * Gets the value of the spouseEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseEn() {
        return spouseEn;
    }

    /**
     * Sets the value of the spouseEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseEn(String value) {
        this.spouseEn = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsn(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStatus(Long value) {
        this.status = value;
    }

    /**
     * Gets the value of the versionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersionId() {
        return versionId;
    }

    /**
     * Sets the value of the versionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersionId(Long value) {
        this.versionId = value;
    }

}
