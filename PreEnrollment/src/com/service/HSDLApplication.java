
package com.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HSDLApplication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HSDLApplication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicantType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationSubType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="applicationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="attchedDocs" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}HSDLAttachedDoc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="authorizationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="authorizer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankTransactionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brtaOfficeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentDrivingLicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataCheckedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataCheckedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataCreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataCreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataUploadedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataUploadedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dtcbDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dtcbSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duplicateReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duplicateReasonOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enrollmentStation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fingerprintUpdating" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasPreviousPSV" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="instructorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instructorsLicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learnerReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licenseHistory" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}licenseHistory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="licenseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldSystemApplication" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="personInfo" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}HSDLPersonInfo" minOccurs="0"/>
 *         &lt;element name="photoUpdating" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="previousLicenseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previousVehicleClassList" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}HSDLApplicationVehicleClass" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="receiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="recentLicenseExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="recentLicenseIssueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recentLicenseIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="recentLicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signatureUpdating" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specialCase" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="typeChangeWithVehicle" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="vehicleClassList" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}HSDLApplicationVehicleClass" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="verificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="verifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verifierDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSDLApplication", propOrder = {
    "applicantType",
    "applicationStatus",
    "applicationSubType",
    "applicationType",
    "applyDate",
    "attchedDocs",
    "authorizationDate",
    "authorizer",
    "bankTransactionNumber",
    "brtaOfficeCode",
    "currentDrivingLicenseNumber",
    "dataCheckedBy",
    "dataCheckedOn",
    "dataCreatedBy",
    "dataCreatedOn",
    "dataUploadedBy",
    "dataUploadedOn",
    "dtcbDate",
    "dtcbSerialNo",
    "duplicateReason",
    "duplicateReasonOther",
    "enrollmentStation",
    "fingerprintUpdating",
    "hasPreviousPSV",
    "id",
    "instructorName",
    "instructorsLicenseNumber",
    "language",
    "learnerReferenceNumber",
    "licenseHistory",
    "licenseType",
    "oldSystemApplication",
    "personInfo",
    "photoUpdating",
    "previousLicenseType",
    "previousVehicleClassList",
    "receiveDate",
    "recentLicenseExpiryDate",
    "recentLicenseIssueAuthority",
    "recentLicenseIssueDate",
    "recentLicenseNumber",
    "referenceDate",
    "referenceNumber",
    "signatureUpdating",
    "source",
    "specialCase",
    "typeChangeWithVehicle",
    "vehicleClassList",
    "verificationDate",
    "verifier",
    "verifierDesignation"
})
public class HSDLApplication {

    protected String applicantType;
    protected String applicationStatus;
    protected Long applicationSubType;
    protected String applicationType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applyDate;
    @XmlElement(nillable = true)
    protected List<HSDLAttachedDoc> attchedDocs;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar authorizationDate;
    protected String authorizer;
    protected String bankTransactionNumber;
    protected String brtaOfficeCode;
    protected String currentDrivingLicenseNumber;
    protected String dataCheckedBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCheckedOn;
    protected String dataCreatedBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCreatedOn;
    protected String dataUploadedBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataUploadedOn;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtcbDate;
    protected String dtcbSerialNo;
    protected String duplicateReason;
    protected String duplicateReasonOther;
    protected String enrollmentStation;
    protected boolean fingerprintUpdating;
    protected boolean hasPreviousPSV;
    protected Long id;
    protected String instructorName;
    protected String instructorsLicenseNumber;
    protected String language;
    protected String learnerReferenceNumber;
    @XmlElement(nillable = true)
    protected List<LicenseHistory> licenseHistory;
    protected String licenseType;
    protected boolean oldSystemApplication;
    protected HSDLPersonInfo personInfo;
    protected boolean photoUpdating;
    protected String previousLicenseType;
    @XmlElement(nillable = true)
    protected List<HSDLApplicationVehicleClass> previousVehicleClassList;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receiveDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recentLicenseExpiryDate;
    protected String recentLicenseIssueAuthority;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recentLicenseIssueDate;
    protected String recentLicenseNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar referenceDate;
    protected String referenceNumber;
    protected boolean signatureUpdating;
    protected String source;
    protected boolean specialCase;
    protected boolean typeChangeWithVehicle;
    @XmlElement(nillable = true)
    protected List<HSDLApplicationVehicleClass> vehicleClassList;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar verificationDate;
    protected String verifier;
    protected String verifierDesignation;

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
     * Gets the value of the applicationSubType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationSubType() {
        return applicationSubType;
    }

    /**
     * Sets the value of the applicationSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationSubType(Long value) {
        this.applicationSubType = value;
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
     * Gets the value of the attchedDocs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attchedDocs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchedDocs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HSDLAttachedDoc }
     * 
     * 
     */
    public List<HSDLAttachedDoc> getAttchedDocs() {
        if (attchedDocs == null) {
            attchedDocs = new ArrayList<HSDLAttachedDoc>();
        }
        return this.attchedDocs;
    }

    /**
     * Gets the value of the authorizationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthorizationDate() {
        return authorizationDate;
    }

    /**
     * Sets the value of the authorizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthorizationDate(XMLGregorianCalendar value) {
        this.authorizationDate = value;
    }

    /**
     * Gets the value of the authorizer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizer() {
        return authorizer;
    }

    /**
     * Sets the value of the authorizer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizer(String value) {
        this.authorizer = value;
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
     * Gets the value of the brtaOfficeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrtaOfficeCode() {
        return brtaOfficeCode;
    }

    /**
     * Sets the value of the brtaOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrtaOfficeCode(String value) {
        this.brtaOfficeCode = value;
    }

    /**
     * Gets the value of the currentDrivingLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentDrivingLicenseNumber() {
        return currentDrivingLicenseNumber;
    }

    /**
     * Sets the value of the currentDrivingLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentDrivingLicenseNumber(String value) {
        this.currentDrivingLicenseNumber = value;
    }

    /**
     * Gets the value of the dataCheckedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCheckedBy() {
        return dataCheckedBy;
    }

    /**
     * Sets the value of the dataCheckedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCheckedBy(String value) {
        this.dataCheckedBy = value;
    }

    /**
     * Gets the value of the dataCheckedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCheckedOn() {
        return dataCheckedOn;
    }

    /**
     * Sets the value of the dataCheckedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCheckedOn(XMLGregorianCalendar value) {
        this.dataCheckedOn = value;
    }

    /**
     * Gets the value of the dataCreatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCreatedBy() {
        return dataCreatedBy;
    }

    /**
     * Sets the value of the dataCreatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCreatedBy(String value) {
        this.dataCreatedBy = value;
    }

    /**
     * Gets the value of the dataCreatedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCreatedOn() {
        return dataCreatedOn;
    }

    /**
     * Sets the value of the dataCreatedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCreatedOn(XMLGregorianCalendar value) {
        this.dataCreatedOn = value;
    }

    /**
     * Gets the value of the dataUploadedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataUploadedBy() {
        return dataUploadedBy;
    }

    /**
     * Sets the value of the dataUploadedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataUploadedBy(String value) {
        this.dataUploadedBy = value;
    }

    /**
     * Gets the value of the dataUploadedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataUploadedOn() {
        return dataUploadedOn;
    }

    /**
     * Sets the value of the dataUploadedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataUploadedOn(XMLGregorianCalendar value) {
        this.dataUploadedOn = value;
    }

    /**
     * Gets the value of the dtcbDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtcbDate() {
        return dtcbDate;
    }

    /**
     * Sets the value of the dtcbDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtcbDate(XMLGregorianCalendar value) {
        this.dtcbDate = value;
    }

    /**
     * Gets the value of the dtcbSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtcbSerialNo() {
        return dtcbSerialNo;
    }

    /**
     * Sets the value of the dtcbSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtcbSerialNo(String value) {
        this.dtcbSerialNo = value;
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
     * Gets the value of the duplicateReasonOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuplicateReasonOther() {
        return duplicateReasonOther;
    }

    /**
     * Sets the value of the duplicateReasonOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuplicateReasonOther(String value) {
        this.duplicateReasonOther = value;
    }

    /**
     * Gets the value of the enrollmentStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollmentStation() {
        return enrollmentStation;
    }

    /**
     * Sets the value of the enrollmentStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentStation(String value) {
        this.enrollmentStation = value;
    }

    /**
     * Gets the value of the fingerprintUpdating property.
     * 
     */
    public boolean isFingerprintUpdating() {
        return fingerprintUpdating;
    }

    /**
     * Sets the value of the fingerprintUpdating property.
     * 
     */
    public void setFingerprintUpdating(boolean value) {
        this.fingerprintUpdating = value;
    }

    /**
     * Gets the value of the hasPreviousPSV property.
     * 
     */
    public boolean isHasPreviousPSV() {
        return hasPreviousPSV;
    }

    /**
     * Sets the value of the hasPreviousPSV property.
     * 
     */
    public void setHasPreviousPSV(boolean value) {
        this.hasPreviousPSV = value;
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
     * Gets the value of the instructorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructorName() {
        return instructorName;
    }

    /**
     * Sets the value of the instructorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructorName(String value) {
        this.instructorName = value;
    }

    /**
     * Gets the value of the instructorsLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructorsLicenseNumber() {
        return instructorsLicenseNumber;
    }

    /**
     * Sets the value of the instructorsLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructorsLicenseNumber(String value) {
        this.instructorsLicenseNumber = value;
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
     * Gets the value of the learnerReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerReferenceNumber() {
        return learnerReferenceNumber;
    }

    /**
     * Sets the value of the learnerReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerReferenceNumber(String value) {
        this.learnerReferenceNumber = value;
    }

    /**
     * Gets the value of the licenseHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licenseHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicenseHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseHistory }
     * 
     * 
     */
    public List<LicenseHistory> getLicenseHistory() {
        if (licenseHistory == null) {
            licenseHistory = new ArrayList<LicenseHistory>();
        }
        return this.licenseHistory;
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
     * Gets the value of the personInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HSDLPersonInfo }
     *     
     */
    public HSDLPersonInfo getPersonInfo() {
        return personInfo;
    }

    /**
     * Sets the value of the personInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HSDLPersonInfo }
     *     
     */
    public void setPersonInfo(HSDLPersonInfo value) {
        this.personInfo = value;
    }

    /**
     * Gets the value of the photoUpdating property.
     * 
     */
    public boolean isPhotoUpdating() {
        return photoUpdating;
    }

    /**
     * Sets the value of the photoUpdating property.
     * 
     */
    public void setPhotoUpdating(boolean value) {
        this.photoUpdating = value;
    }

    /**
     * Gets the value of the previousLicenseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousLicenseType() {
        return previousLicenseType;
    }

    /**
     * Sets the value of the previousLicenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousLicenseType(String value) {
        this.previousLicenseType = value;
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
     * {@link HSDLApplicationVehicleClass }
     * 
     * 
     */
    public List<HSDLApplicationVehicleClass> getPreviousVehicleClassList() {
        if (previousVehicleClassList == null) {
            previousVehicleClassList = new ArrayList<HSDLApplicationVehicleClass>();
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
     * Gets the value of the recentLicenseIssueAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecentLicenseIssueAuthority() {
        return recentLicenseIssueAuthority;
    }

    /**
     * Sets the value of the recentLicenseIssueAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecentLicenseIssueAuthority(String value) {
        this.recentLicenseIssueAuthority = value;
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
     * Gets the value of the signatureUpdating property.
     * 
     */
    public boolean isSignatureUpdating() {
        return signatureUpdating;
    }

    /**
     * Sets the value of the signatureUpdating property.
     * 
     */
    public void setSignatureUpdating(boolean value) {
        this.signatureUpdating = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the specialCase property.
     * 
     */
    public boolean isSpecialCase() {
        return specialCase;
    }

    /**
     * Sets the value of the specialCase property.
     * 
     */
    public void setSpecialCase(boolean value) {
        this.specialCase = value;
    }

    /**
     * Gets the value of the typeChangeWithVehicle property.
     * 
     */
    public boolean isTypeChangeWithVehicle() {
        return typeChangeWithVehicle;
    }

    /**
     * Sets the value of the typeChangeWithVehicle property.
     * 
     */
    public void setTypeChangeWithVehicle(boolean value) {
        this.typeChangeWithVehicle = value;
    }

    /**
     * Gets the value of the vehicleClassList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleClassList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleClassList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HSDLApplicationVehicleClass }
     * 
     * 
     */
    public List<HSDLApplicationVehicleClass> getVehicleClassList() {
        if (vehicleClassList == null) {
            vehicleClassList = new ArrayList<HSDLApplicationVehicleClass>();
        }
        return this.vehicleClassList;
    }

    /**
     * Gets the value of the verificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVerificationDate() {
        return verificationDate;
    }

    /**
     * Sets the value of the verificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVerificationDate(XMLGregorianCalendar value) {
        this.verificationDate = value;
    }

    /**
     * Gets the value of the verifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifier() {
        return verifier;
    }

    /**
     * Sets the value of the verifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifier(String value) {
        this.verifier = value;
    }

    /**
     * Gets the value of the verifierDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifierDesignation() {
        return verifierDesignation;
    }

    /**
     * Sets the value of the verifierDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifierDesignation(String value) {
        this.verifierDesignation = value;
    }

}
