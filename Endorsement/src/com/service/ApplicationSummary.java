
package com.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for applicationSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="afisStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicantType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="bankTransactionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brtaOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentVehicleClassList" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}applicationVehicleClass" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dctbDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dctbSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duplicateReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expireDateString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="issueDateString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licenseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldSystemApplication" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="paymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="personName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="photo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="previousVehicleClassList" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}applicationVehicleClass" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="receiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="recentLicenseExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="recentLicenseIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="recentLicenseIssuingAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recentLicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recentLicenseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="referenceDateString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="testStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vip" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationSummary", propOrder = {
    "afisStatus",
    "applicantType",
    "applicationStatus",
    "applicationType",
    "applyDate",
    "bankTransactionNumber",
    "brtaOffice",
    "cardStatus",
    "currentVehicleClassList",
    "dateOfBirth",
    "dctbDate",
    "dctbSerialNo",
    "duplicateReason",
    "expireDate",
    "expireDateString",
    "id",
    "issueDate",
    "issueDateString",
    "language",
    "licenseNumber",
    "licenseType",
    "oldSystemApplication",
    "paymentStatus",
    "personId",
    "personName",
    "photo",
    "previousVehicleClassList",
    "receiveDate",
    "recentLicenseExpiryDate",
    "recentLicenseIssueDate",
    "recentLicenseIssuingAuthority",
    "recentLicenseNumber",
    "recentLicenseType",
    "referenceDate",
    "referenceDateString",
    "referenceNumber",
    "testStatus",
    "vip"
})
@XmlSeeAlso({
    ApplicationDetails.class
})
public class ApplicationSummary {

    protected String afisStatus;
    protected String applicantType;
    protected String applicationStatus;
    protected String applicationType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applyDate;
    protected String bankTransactionNumber;
    protected String brtaOffice;
    protected String cardStatus;
    @XmlElement(nillable = true)
    protected List<ApplicationVehicleClass> currentVehicleClassList;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dctbDate;
    protected String dctbSerialNo;
    protected String duplicateReason;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expireDate;
    protected String expireDateString;
    protected Long id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDate;
    protected String issueDateString;
    protected String language;
    protected String licenseNumber;
    protected String licenseType;
    protected boolean oldSystemApplication;
    protected String paymentStatus;
    protected Long personId;
    protected String personName;
    protected byte[] photo;
    @XmlElement(nillable = true)
    protected List<ApplicationVehicleClass> previousVehicleClassList;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receiveDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recentLicenseExpiryDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recentLicenseIssueDate;
    protected String recentLicenseIssuingAuthority;
    protected String recentLicenseNumber;
    protected String recentLicenseType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar referenceDate;
    protected String referenceDateString;
    protected String referenceNumber;
    protected String testStatus;
    protected boolean vip;

    /**
     * Gets the value of the afisStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfisStatus() {
        return afisStatus;
    }

    /**
     * Sets the value of the afisStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfisStatus(String value) {
        this.afisStatus = value;
    }

    /**
     * Gets the value of the applicantType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantType() {
        return applicantType;
    }

    /**
     * Sets the value of the applicantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantType(String value) {
        this.applicantType = value;
    }

    /**
     * Gets the value of the applicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationStatus() {
        return applicationStatus;
    }

    /**
     * Sets the value of the applicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationStatus(String value) {
        this.applicationStatus = value;
    }

    /**
     * Gets the value of the applicationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationType() {
        return applicationType;
    }

    /**
     * Sets the value of the applicationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationType(String value) {
        this.applicationType = value;
    }

    /**
     * Gets the value of the applyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplyDate() {
        return applyDate;
    }

    /**
     * Sets the value of the applyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplyDate(XMLGregorianCalendar value) {
        this.applyDate = value;
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
     * Gets the value of the brtaOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrtaOffice() {
        return brtaOffice;
    }

    /**
     * Sets the value of the brtaOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrtaOffice(String value) {
        this.brtaOffice = value;
    }

    /**
     * Gets the value of the cardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardStatus() {
        return cardStatus;
    }

    /**
     * Sets the value of the cardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardStatus(String value) {
        this.cardStatus = value;
    }

    /**
     * Gets the value of the currentVehicleClassList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentVehicleClassList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentVehicleClassList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationVehicleClass }
     * 
     * 
     */
    public List<ApplicationVehicleClass> getCurrentVehicleClassList() {
        if (currentVehicleClassList == null) {
            currentVehicleClassList = new ArrayList<ApplicationVehicleClass>();
        }
        return this.currentVehicleClassList;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the dctbDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDctbDate() {
        return dctbDate;
    }

    /**
     * Sets the value of the dctbDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDctbDate(XMLGregorianCalendar value) {
        this.dctbDate = value;
    }

    /**
     * Gets the value of the dctbSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDctbSerialNo() {
        return dctbSerialNo;
    }

    /**
     * Sets the value of the dctbSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDctbSerialNo(String value) {
        this.dctbSerialNo = value;
    }

    /**
     * Gets the value of the duplicateReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuplicateReason() {
        return duplicateReason;
    }

    /**
     * Sets the value of the duplicateReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuplicateReason(String value) {
        this.duplicateReason = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the expireDateString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireDateString() {
        return expireDateString;
    }

    /**
     * Sets the value of the expireDateString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireDateString(String value) {
        this.expireDateString = value;
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
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the issueDateString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDateString() {
        return issueDateString;
    }

    /**
     * Sets the value of the issueDateString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDateString(String value) {
        this.issueDateString = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the licenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the value of the licenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
    }

    /**
     * Gets the value of the licenseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseType() {
        return licenseType;
    }

    /**
     * Sets the value of the licenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseType(String value) {
        this.licenseType = value;
    }

    /**
     * Gets the value of the oldSystemApplication property.
     * 
     */
    public boolean isOldSystemApplication() {
        return oldSystemApplication;
    }

    /**
     * Sets the value of the oldSystemApplication property.
     * 
     */
    public void setOldSystemApplication(boolean value) {
        this.oldSystemApplication = value;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatus(String value) {
        this.paymentStatus = value;
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
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonName(String value) {
        this.personName = value;
    }

    /**
     * Gets the value of the photo property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPhoto() {
        return photo;
    }

    /**
     * Sets the value of the photo property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPhoto(byte[] value) {
        this.photo = value;
    }

    /**
     * Gets the value of the previousVehicleClassList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the previousVehicleClassList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviousVehicleClassList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationVehicleClass }
     * 
     * 
     */
    public List<ApplicationVehicleClass> getPreviousVehicleClassList() {
        if (previousVehicleClassList == null) {
            previousVehicleClassList = new ArrayList<ApplicationVehicleClass>();
        }
        return this.previousVehicleClassList;
    }

    /**
     * Gets the value of the receiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiveDate() {
        return receiveDate;
    }

    /**
     * Sets the value of the receiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiveDate(XMLGregorianCalendar value) {
        this.receiveDate = value;
    }

    /**
     * Gets the value of the recentLicenseExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecentLicenseExpiryDate() {
        return recentLicenseExpiryDate;
    }

    /**
     * Sets the value of the recentLicenseExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecentLicenseExpiryDate(XMLGregorianCalendar value) {
        this.recentLicenseExpiryDate = value;
    }

    /**
     * Gets the value of the recentLicenseIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecentLicenseIssueDate() {
        return recentLicenseIssueDate;
    }

    /**
     * Sets the value of the recentLicenseIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecentLicenseIssueDate(XMLGregorianCalendar value) {
        this.recentLicenseIssueDate = value;
    }

    /**
     * Gets the value of the recentLicenseIssuingAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecentLicenseIssuingAuthority() {
        return recentLicenseIssuingAuthority;
    }

    /**
     * Sets the value of the recentLicenseIssuingAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecentLicenseIssuingAuthority(String value) {
        this.recentLicenseIssuingAuthority = value;
    }

    /**
     * Gets the value of the recentLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecentLicenseNumber() {
        return recentLicenseNumber;
    }

    /**
     * Sets the value of the recentLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecentLicenseNumber(String value) {
        this.recentLicenseNumber = value;
    }

    /**
     * Gets the value of the recentLicenseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecentLicenseType() {
        return recentLicenseType;
    }

    /**
     * Sets the value of the recentLicenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecentLicenseType(String value) {
        this.recentLicenseType = value;
    }

    /**
     * Gets the value of the referenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReferenceDate() {
        return referenceDate;
    }

    /**
     * Sets the value of the referenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReferenceDate(XMLGregorianCalendar value) {
        this.referenceDate = value;
    }

    /**
     * Gets the value of the referenceDateString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDateString() {
        return referenceDateString;
    }

    /**
     * Sets the value of the referenceDateString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDateString(String value) {
        this.referenceDateString = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the testStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestStatus() {
        return testStatus;
    }

    /**
     * Sets the value of the testStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestStatus(String value) {
        this.testStatus = value;
    }

    /**
     * Gets the value of the vip property.
     * 
     */
    public boolean isVip() {
        return vip;
    }

    /**
     * Sets the value of the vip property.
     * 
     */
    public void setVip(boolean value) {
        this.vip = value;
    }

}
