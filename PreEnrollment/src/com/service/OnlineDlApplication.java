
package com.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for onlineDlApplication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="onlineDlApplication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicantType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="applicationStatus" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="applicationSubTypes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="applyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="biometricScheduleDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardStatus" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dctbDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dctbSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dlAppVehicalClassList" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}dlAppVehicleClass" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dlAttachmentList" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}dlAttachment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="duplicateReason" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="enrollmentStation" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="examDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="instructorLicenseNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instructorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="learnerReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licenseNumberBn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licenseNumberEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licenseType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="oldSystemApplication" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="onlineDlApplicationType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="onlineDlPerson" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}onlineDlPerson" minOccurs="0"/>
 *         &lt;element name="otherDuplicateReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previousAppVehicalClassList" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}dlAppVehicleClass" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="previousLicenseType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="previousPsvFlag" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="receiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recentLicenseExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recentLicenseIssueAuthority" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="recentLicenseIssueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recentLicenseNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "onlineDlApplication", propOrder = {
    "applicantType",
    "applicationStatus",
    "applicationSubTypes",
    "applyDate",
    "authorityId",
    "bankName",
    "bankTransactionId",
    "biometricScheduleDate",
    "cardStatus",
    "createdBy",
    "creationDate",
    "dctbDate",
    "dctbSerialNo",
    "dlAppVehicalClassList",
    "dlAttachmentList",
    "duplicateReason",
    "enrollmentStation",
    "examDate",
    "expiryDate",
    "id",
    "instructorLicenseNo",
    "instructorName",
    "issueDate",
    "language",
    "lastUpdateDate",
    "lastUpdatedBy",
    "learnerReferenceNumber",
    "licenseNumberBn",
    "licenseNumberEn",
    "licenseType",
    "oldSystemApplication",
    "onlineDlApplicationType",
    "onlineDlPerson",
    "otherDuplicateReason",
    "paymentMode",
    "paymentStatus",
    "previousAppVehicalClassList",
    "previousLicenseType",
    "previousPsvFlag",
    "receiveDate",
    "recentLicenseExpiryDate",
    "recentLicenseIssueAuthority",
    "recentLicenseIssueDate",
    "recentLicenseNo",
    "referenceDate",
    "referenceNumber",
    "status",
    "versionId"
})
public class OnlineDlApplication {

    protected Long applicantType;
    protected Long applicationStatus;
    protected Long applicationSubTypes;
    protected String applyDate;
    protected Long authorityId;
    protected String bankName;
    protected String bankTransactionId;
    protected String biometricScheduleDate;
    protected Long cardStatus;
    protected Long createdBy;
    protected String creationDate;
    protected String dctbDate;
    protected String dctbSerialNo;
    @XmlElement(nillable = true)
    protected List<DlAppVehicleClass> dlAppVehicalClassList;
    @XmlElement(nillable = true)
    protected List<DlAttachment> dlAttachmentList;
    protected Long duplicateReason;
    protected Long enrollmentStation;
    protected String examDate;
    protected String expiryDate;
    protected Long id;
    protected String instructorLicenseNo;
    protected String instructorName;
    protected String issueDate;
    protected Long language;
    protected String lastUpdateDate;
    protected Long lastUpdatedBy;
    protected String learnerReferenceNumber;
    protected String licenseNumberBn;
    protected String licenseNumberEn;
    protected Long licenseType;
    
	protected boolean oldSystemApplication;
    protected Long onlineDlApplicationType;
    protected OnlineDlPerson onlineDlPerson;
    protected String otherDuplicateReason;
    protected String paymentMode;
    protected String paymentStatus;
    @XmlElement(nillable = true)
    protected List<DlAppVehicleClass> previousAppVehicalClassList;
    protected Long previousLicenseType;
    protected Long previousPsvFlag;
    protected String receiveDate;
    protected String recentLicenseExpiryDate;
    protected Long recentLicenseIssueAuthority;
    protected String recentLicenseIssueDate;
    protected String recentLicenseNo;
    protected String referenceDate;
    protected String referenceNumber;
    protected Long status;
    protected Long versionId;

    /**
     * Gets the value of the applicantType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicantType() {
        return applicantType;
    }

    /**
     * Sets the value of the applicantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicantType(Long value) {
        this.applicantType = value;
    }

    /**
     * Gets the value of the applicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationStatus() {
        return applicationStatus;
    }

    /**
     * Sets the value of the applicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationStatus(Long value) {
        this.applicationStatus = value;
    }

    /**
     * Gets the value of the applicationSubTypes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationSubTypes() {
        return applicationSubTypes;
    }

    /**
     * Sets the value of the applicationSubTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationSubTypes(Long value) {
        this.applicationSubTypes = value;
    }

    /**
     * Gets the value of the applyDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyDate() {
        return applyDate;
    }

    /**
     * Sets the value of the applyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyDate(String value) {
        this.applyDate = value;
    }

    /**
     * Gets the value of the authorityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAuthorityId() {
        return authorityId;
    }

    /**
     * Sets the value of the authorityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAuthorityId(Long value) {
        this.authorityId = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the bankTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankTransactionId() {
        return bankTransactionId;
    }

    /**
     * Sets the value of the bankTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankTransactionId(String value) {
        this.bankTransactionId = value;
    }

    /**
     * Gets the value of the biometricScheduleDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiometricScheduleDate() {
        return biometricScheduleDate;
    }

    /**
     * Sets the value of the biometricScheduleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiometricScheduleDate(String value) {
        this.biometricScheduleDate = value;
    }

    /**
     * Gets the value of the cardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCardStatus() {
        return cardStatus;
    }

    /**
     * Sets the value of the cardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCardStatus(Long value) {
        this.cardStatus = value;
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
     * Gets the value of the dctbDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDctbDate() {
        return dctbDate;
    }

    /**
     * Sets the value of the dctbDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDctbDate(String value) {
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
     * Gets the value of the dlAppVehicalClassList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dlAppVehicalClassList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlAppVehicalClassList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DlAppVehicleClass }
     * 
     * 
     */
    public List<DlAppVehicleClass> getDlAppVehicalClassList() {
        if (dlAppVehicalClassList == null) {
            dlAppVehicalClassList = new ArrayList<DlAppVehicleClass>();
        }
        return this.dlAppVehicalClassList;
    }

    /**
     * Gets the value of the dlAttachmentList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dlAttachmentList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlAttachmentList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DlAttachment }
     * 
     * 
     */
    public List<DlAttachment> getDlAttachmentList() {
        if (dlAttachmentList == null) {
            dlAttachmentList = new ArrayList<DlAttachment>();
        }
        return this.dlAttachmentList;
    }

    /**
     * Gets the value of the duplicateReason property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDuplicateReason() {
        return duplicateReason;
    }

    /**
     * Sets the value of the duplicateReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDuplicateReason(Long value) {
        this.duplicateReason = value;
    }

    /**
     * Gets the value of the enrollmentStation property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEnrollmentStation() {
        return enrollmentStation;
    }

    /**
     * Sets the value of the enrollmentStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEnrollmentStation(Long value) {
        this.enrollmentStation = value;
    }

    /**
     * Gets the value of the examDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamDate() {
        return examDate;
    }

    /**
     * Sets the value of the examDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamDate(String value) {
        this.examDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
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
     * Gets the value of the instructorLicenseNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructorLicenseNo() {
        return instructorLicenseNo;
    }

    /**
     * Sets the value of the instructorLicenseNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructorLicenseNo(String value) {
        this.instructorLicenseNo = value;
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
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDate(String value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLanguage(Long value) {
        this.language = value;
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
     * Gets the value of the licenseNumberBn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumberBn() {
        return licenseNumberBn;
    }

    /**
     * Sets the value of the licenseNumberBn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumberBn(String value) {
        this.licenseNumberBn = value;
    }

    /**
     * Gets the value of the licenseNumberEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumberEn() {
        return licenseNumberEn;
    }

    /**
     * Sets the value of the licenseNumberEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumberEn(String value) {
        this.licenseNumberEn = value;
    }

    /**
     * Gets the value of the licenseType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLicenseType() {
        return licenseType;
    }

    /**
     * Sets the value of the licenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLicenseType(Long value) {
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
     * Gets the value of the onlineDlApplicationType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOnlineDlApplicationType() {
        return onlineDlApplicationType;
    }

    /**
     * Sets the value of the onlineDlApplicationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOnlineDlApplicationType(Long value) {
        this.onlineDlApplicationType = value;
    }

    /**
     * Gets the value of the onlineDlPerson property.
     * 
     * @return
     *     possible object is
     *     {@link OnlineDlPerson }
     *     
     */
    public OnlineDlPerson getOnlineDlPerson() {
        return onlineDlPerson;
    }

    /**
     * Sets the value of the onlineDlPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineDlPerson }
     *     
     */
    public void setOnlineDlPerson(OnlineDlPerson value) {
        this.onlineDlPerson = value;
    }

    /**
     * Gets the value of the otherDuplicateReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherDuplicateReason() {
        return otherDuplicateReason;
    }

    /**
     * Sets the value of the otherDuplicateReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherDuplicateReason(String value) {
        this.otherDuplicateReason = value;
    }

    /**
     * Gets the value of the paymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMode() {
        return paymentMode;
    }

    /**
     * Sets the value of the paymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMode(String value) {
        this.paymentMode = value;
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
     * Gets the value of the previousAppVehicalClassList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the previousAppVehicalClassList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviousAppVehicalClassList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DlAppVehicleClass }
     * 
     * 
     */
    public List<DlAppVehicleClass> getPreviousAppVehicalClassList() {
        if (previousAppVehicalClassList == null) {
            previousAppVehicalClassList = new ArrayList<DlAppVehicleClass>();
        }
        return this.previousAppVehicalClassList;
    }

    /**
     * Gets the value of the previousLicenseType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPreviousLicenseType() {
        return previousLicenseType;
    }

    /**
     * Sets the value of the previousLicenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPreviousLicenseType(Long value) {
        this.previousLicenseType = value;
    }

    /**
     * Gets the value of the previousPsvFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPreviousPsvFlag() {
        return previousPsvFlag;
    }

    /**
     * Sets the value of the previousPsvFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPreviousPsvFlag(Long value) {
        this.previousPsvFlag = value;
    }

    /**
     * Gets the value of the receiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveDate() {
        return receiveDate;
    }

    /**
     * Sets the value of the receiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveDate(String value) {
        this.receiveDate = value;
    }

    /**
     * Gets the value of the recentLicenseExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecentLicenseExpiryDate() {
        return recentLicenseExpiryDate;
    }

    /**
     * Sets the value of the recentLicenseExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecentLicenseExpiryDate(String value) {
        this.recentLicenseExpiryDate = value;
    }

    /**
     * Gets the value of the recentLicenseIssueAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecentLicenseIssueAuthority() {
        return recentLicenseIssueAuthority;
    }

    /**
     * Sets the value of the recentLicenseIssueAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecentLicenseIssueAuthority(Long value) {
        this.recentLicenseIssueAuthority = value;
    }

    /**
     * Gets the value of the recentLicenseIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecentLicenseIssueDate() {
        return recentLicenseIssueDate;
    }

    /**
     * Sets the value of the recentLicenseIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecentLicenseIssueDate(String value) {
        this.recentLicenseIssueDate = value;
    }

    /**
     * Gets the value of the recentLicenseNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecentLicenseNo() {
        return recentLicenseNo;
    }

    /**
     * Sets the value of the recentLicenseNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecentLicenseNo(String value) {
        this.recentLicenseNo = value;
    }

    /**
     * Gets the value of the referenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDate() {
        return referenceDate;
    }

    /**
     * Sets the value of the referenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDate(String value) {
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
    public void setDlAppVehicalClassList(List<DlAppVehicleClass> dlAppVehicalClassList) {
		this.dlAppVehicalClassList = dlAppVehicalClassList;
	}

	public void setDlAttachmentList(List<DlAttachment> dlAttachmentList) {
		this.dlAttachmentList = dlAttachmentList;
	}

	public void setPreviousAppVehicalClassList(List<DlAppVehicleClass> previousAppVehicalClassList) {
		this.previousAppVehicalClassList = previousAppVehicalClassList;
	}
}
