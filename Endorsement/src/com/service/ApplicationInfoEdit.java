
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for applicationInfoEdit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationInfoEdit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressLineBn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressLineEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bloodGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cardId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="correctionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="enrollClient" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fatherBn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nameBn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permanentAddressId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseBn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationInfoEdit", propOrder = {
    "addressLineBn",
    "addressLineEn",
    "applicationId",
    "bloodGroupId",
    "cardId",
    "correctionReason",
    "dateOfBirth",
    "enrollClient",
    "fatherBn",
    "fatherEn",
    "issueDate",
    "nameBn",
    "nameEn",
    "permanentAddressId",
    "personId",
    "phoneNumber",
    "spouseBn",
    "spouseEn"
})
public class ApplicationInfoEdit {

    protected String addressLineBn;
    protected String addressLineEn;
    protected Long applicationId;
    protected Long bloodGroupId;
    protected Long cardId;
    protected String correctionReason;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    protected boolean enrollClient;
    protected String fatherBn;
    protected String fatherEn;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDate;
    protected String nameBn;
    protected String nameEn;
    protected Long permanentAddressId;
    protected Long personId;
    protected String phoneNumber;
    protected String spouseBn;
    protected String spouseEn;

    /**
     * Gets the value of the addressLineBn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLineBn() {
        return addressLineBn;
    }

    /**
     * Sets the value of the addressLineBn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLineBn(String value) {
        this.addressLineBn = value;
    }

    /**
     * Gets the value of the addressLineEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLineEn() {
        return addressLineEn;
    }

    /**
     * Sets the value of the addressLineEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLineEn(String value) {
        this.addressLineEn = value;
    }

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
     * Gets the value of the bloodGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBloodGroupId() {
        return bloodGroupId;
    }

    /**
     * Sets the value of the bloodGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBloodGroupId(Long value) {
        this.bloodGroupId = value;
    }

    /**
     * Gets the value of the cardId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCardId() {
        return cardId;
    }

    /**
     * Sets the value of the cardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCardId(Long value) {
        this.cardId = value;
    }

    /**
     * Gets the value of the correctionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrectionReason() {
        return correctionReason;
    }

    /**
     * Sets the value of the correctionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrectionReason(String value) {
        this.correctionReason = value;
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
     * Gets the value of the enrollClient property.
     * 
     */
    public boolean isEnrollClient() {
        return enrollClient;
    }

    /**
     * Sets the value of the enrollClient property.
     * 
     */
    public void setEnrollClient(boolean value) {
        this.enrollClient = value;
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
     * Gets the value of the permanentAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPermanentAddressId() {
        return permanentAddressId;
    }

    /**
     * Sets the value of the permanentAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPermanentAddressId(Long value) {
        this.permanentAddressId = value;
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
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
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

}
