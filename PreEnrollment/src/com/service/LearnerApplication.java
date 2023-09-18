
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
 * <p>Java class for learnerApplication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="learnerApplication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bankTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bloodGroup" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dctbDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dctbNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emergencyEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emergencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emergencyPhoneNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emergencyRelation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="examDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="examStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fatherNameBn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="instructorAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instructorDlNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instructorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="learnerAppVehicalClassList" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}learnerAppVehicleClass" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="learnerAttachmentList" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}learnerAttachment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="licenceType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="licenseNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mobileNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherNameBn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameBn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="occupation" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="passportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="paymentStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="permanentAddress" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}address" minOccurs="0"/>
 *         &lt;element name="phoneHome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="presentAddress" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}address" minOccurs="0"/>
 *         &lt;element name="previousDlNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previousLearnerAppVehicalClassList" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}learnerAppVehicleClass" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="previousLearnerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rollNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseNameBn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="vehicleClass" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "learnerApplication", propOrder = {
    "amount",
    "applicationStatus",
    "applicationType",
    "authorityId",
    "bankTransactionId",
    "bloodGroup",
    "createdBy",
    "creationDate",
    "dateOfBirth",
    "dctbDate",
    "dctbNo",
    "email",
    "emergencyEmail",
    "emergencyName",
    "emergencyPhoneNo",
    "emergencyRelation",
    "examDate",
    "examStatus",
    "expiryDate",
    "fatherNameBn",
    "fatherNameEn",
    "gender",
    "id",
    "instructorAddress",
    "instructorDlNo",
    "instructorName",
    "issueDate",
    "lastUpdateDate",
    "lastUpdatedBy",
    "learnerAppVehicalClassList",
    "learnerAttachmentList",
    "licenceType",
    "licenseNo",
    "maritalStatus",
    "mobileNo",
    "motherNameBn",
    "motherNameEn",
    "nameBn",
    "nameEn",
    "nationalId",
    "nationality",
    "occupation",
    "passportNo",
    "paymentMode",
    "paymentStatus",
    "permanentAddress",
    "phoneHome",
    "phoneOffice",
    "presentAddress",
    "previousDlNo",
    "previousLearnerAppVehicalClassList",
    "previousLearnerNo",
    "referenceNumber",
    "rollNumber",
    "spouseNameBn",
    "spouseNameEn",
    "status",
    "vehicleClass",
    "versionId"
})
public class LearnerApplication {

    protected String amount;
    protected String applicationStatus;
    protected String applicationType;
    protected Long authorityId;
    protected String bankTransactionId;
    protected Long bloodGroup;
    protected Long createdBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    protected String dateOfBirth;
    protected String dctbDate;
    protected String dctbNo;
    protected String email;
    protected String emergencyEmail;
    protected String emergencyName;
    protected String emergencyPhoneNo;
    protected String emergencyRelation;
    protected String examDate;
    protected String examStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDate;
    protected String fatherNameBn;
    protected String fatherNameEn;
    protected Long gender;
    protected Long id;
    protected String instructorAddress;
    protected String instructorDlNo;
    protected String instructorName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDate;
    protected Long lastUpdatedBy;
    @XmlElement(nillable = true)
    protected List<LearnerAppVehicleClass> learnerAppVehicalClassList;
    @XmlElement(nillable = true)
    protected List<LearnerAttachment> learnerAttachmentList;
    protected Long licenceType;
    protected String licenseNo;
    protected Long maritalStatus;
    protected String mobileNo;
    protected String motherNameBn;
    protected String motherNameEn;
    protected String nameBn;
    protected String nameEn;
    protected String nationalId;
    protected Long nationality;
    protected Long occupation;
    protected String passportNo;
    protected Integer paymentMode;
    protected Integer paymentStatus;
    protected Address permanentAddress;
    protected String phoneHome;
    protected String phoneOffice;
    protected Address presentAddress;
    protected String previousDlNo;
    @XmlElement(nillable = true)
    protected List<LearnerAppVehicleClass> previousLearnerAppVehicalClassList;
    protected String previousLearnerNo;
    protected String referenceNumber;
    protected String rollNumber;
    protected String spouseNameBn;
    protected String spouseNameEn;
    protected Integer status;
    protected Long vehicleClass;
    protected Long versionId;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
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
     * Gets the value of the dctbNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDctbNo() {
        return dctbNo;
    }

    /**
     * Sets the value of the dctbNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDctbNo(String value) {
        this.dctbNo = value;
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
     * Gets the value of the emergencyEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyEmail() {
        return emergencyEmail;
    }

    /**
     * Sets the value of the emergencyEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyEmail(String value) {
        this.emergencyEmail = value;
    }

    /**
     * Gets the value of the emergencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyName() {
        return emergencyName;
    }

    /**
     * Sets the value of the emergencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyName(String value) {
        this.emergencyName = value;
    }

    /**
     * Gets the value of the emergencyPhoneNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyPhoneNo() {
        return emergencyPhoneNo;
    }

    /**
     * Sets the value of the emergencyPhoneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyPhoneNo(String value) {
        this.emergencyPhoneNo = value;
    }

    /**
     * Gets the value of the emergencyRelation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyRelation() {
        return emergencyRelation;
    }

    /**
     * Sets the value of the emergencyRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyRelation(String value) {
        this.emergencyRelation = value;
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
     * Gets the value of the examStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamStatus() {
        return examStatus;
    }

    /**
     * Sets the value of the examStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamStatus(String value) {
        this.examStatus = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the fatherNameBn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherNameBn() {
        return fatherNameBn;
    }

    /**
     * Sets the value of the fatherNameBn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherNameBn(String value) {
        this.fatherNameBn = value;
    }

    /**
     * Gets the value of the fatherNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherNameEn() {
        return fatherNameEn;
    }

    /**
     * Sets the value of the fatherNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherNameEn(String value) {
        this.fatherNameEn = value;
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
     * Gets the value of the instructorAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructorAddress() {
        return instructorAddress;
    }

    /**
     * Sets the value of the instructorAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructorAddress(String value) {
        this.instructorAddress = value;
    }

    /**
     * Gets the value of the instructorDlNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructorDlNo() {
        return instructorDlNo;
    }

    /**
     * Sets the value of the instructorDlNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructorDlNo(String value) {
        this.instructorDlNo = value;
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
     * Gets the value of the learnerAppVehicalClassList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the learnerAppVehicalClassList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLearnerAppVehicalClassList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LearnerAppVehicleClass }
     * 
     * 
     */
    public List<LearnerAppVehicleClass> getLearnerAppVehicalClassList() {
        if (learnerAppVehicalClassList == null) {
            learnerAppVehicalClassList = new ArrayList<LearnerAppVehicleClass>();
        }
        return this.learnerAppVehicalClassList;
    }

    /**
     * Gets the value of the learnerAttachmentList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the learnerAttachmentList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLearnerAttachmentList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LearnerAttachment }
     * 
     * 
     */
    public List<LearnerAttachment> getLearnerAttachmentList() {
        if (learnerAttachmentList == null) {
            learnerAttachmentList = new ArrayList<LearnerAttachment>();
        }
        return this.learnerAttachmentList;
    }

    /**
     * Gets the value of the licenceType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLicenceType() {
        return licenceType;
    }

    /**
     * Sets the value of the licenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLicenceType(Long value) {
        this.licenceType = value;
    }

    /**
     * Gets the value of the licenseNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNo() {
        return licenseNo;
    }

    /**
     * Sets the value of the licenseNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNo(String value) {
        this.licenseNo = value;
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
     * Gets the value of the mobileNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * Sets the value of the mobileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNo(String value) {
        this.mobileNo = value;
    }

    /**
     * Gets the value of the motherNameBn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherNameBn() {
        return motherNameBn;
    }

    /**
     * Sets the value of the motherNameBn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherNameBn(String value) {
        this.motherNameBn = value;
    }

    /**
     * Gets the value of the motherNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherNameEn() {
        return motherNameEn;
    }

    /**
     * Sets the value of the motherNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherNameEn(String value) {
        this.motherNameEn = value;
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
     * Gets the value of the nationalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalId() {
        return nationalId;
    }

    /**
     * Sets the value of the nationalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalId(String value) {
        this.nationalId = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNationality(Long value) {
        this.nationality = value;
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
     * Gets the value of the paymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentMode() {
        return paymentMode;
    }

    /**
     * Sets the value of the paymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentMode(Integer value) {
        this.paymentMode = value;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentStatus(Integer value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the permanentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getPermanentAddress() {
        return permanentAddress;
    }

    /**
     * Sets the value of the permanentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setPermanentAddress(Address value) {
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
     *     {@link Address }
     *     
     */
    public Address getPresentAddress() {
        return presentAddress;
    }

    /**
     * Sets the value of the presentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setPresentAddress(Address value) {
        this.presentAddress = value;
    }

    /**
     * Gets the value of the previousDlNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousDlNo() {
        return previousDlNo;
    }

    /**
     * Sets the value of the previousDlNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousDlNo(String value) {
        this.previousDlNo = value;
    }

    /**
     * Gets the value of the previousLearnerAppVehicalClassList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the previousLearnerAppVehicalClassList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviousLearnerAppVehicalClassList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LearnerAppVehicleClass }
     * 
     * 
     */
    public List<LearnerAppVehicleClass> getPreviousLearnerAppVehicalClassList() {
        if (previousLearnerAppVehicalClassList == null) {
            previousLearnerAppVehicalClassList = new ArrayList<LearnerAppVehicleClass>();
        }
        return this.previousLearnerAppVehicalClassList;
    }

    /**
     * Gets the value of the previousLearnerNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousLearnerNo() {
        return previousLearnerNo;
    }

    /**
     * Sets the value of the previousLearnerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousLearnerNo(String value) {
        this.previousLearnerNo = value;
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
     * Gets the value of the rollNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRollNumber() {
        return rollNumber;
    }

    /**
     * Sets the value of the rollNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRollNumber(String value) {
        this.rollNumber = value;
    }

    /**
     * Gets the value of the spouseNameBn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseNameBn() {
        return spouseNameBn;
    }

    /**
     * Sets the value of the spouseNameBn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseNameBn(String value) {
        this.spouseNameBn = value;
    }

    /**
     * Gets the value of the spouseNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseNameEn() {
        return spouseNameEn;
    }

    /**
     * Sets the value of the spouseNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseNameEn(String value) {
        this.spouseNameEn = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the vehicleClass property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVehicleClass() {
        return vehicleClass;
    }

    /**
     * Sets the value of the vehicleClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVehicleClass(Long value) {
        this.vehicleClass = value;
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
