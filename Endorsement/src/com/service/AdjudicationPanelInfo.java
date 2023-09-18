
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for adjudicationPanelInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adjudicationPanelInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateOfBirthStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="leftIndexWsq" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="leftThumbWsq" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="personName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="photo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="presentAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rightIndexWsq" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="rightThumbWsq" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="spouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adjudicationPanelInfo", propOrder = {
    "dateOfBirth",
    "dateOfBirthStr",
    "errMsg",
    "fatherName",
    "gender",
    "leftIndexWsq",
    "leftThumbWsq",
    "personId",
    "personName",
    "photo",
    "presentAddress",
    "referenceNumber",
    "rightIndexWsq",
    "rightThumbWsq",
    "score",
    "signature",
    "spouseName"
})
public class AdjudicationPanelInfo {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    protected String dateOfBirthStr;
    protected String errMsg;
    protected String fatherName;
    protected String gender;
    protected byte[] leftIndexWsq;
    protected byte[] leftThumbWsq;
    protected Long personId;
    protected String personName;
    protected byte[] photo;
    protected String presentAddress;
    protected String referenceNumber;
    protected byte[] rightIndexWsq;
    protected byte[] rightThumbWsq;
    protected Double score;
    protected byte[] signature;
    protected String spouseName;

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
     * Gets the value of the dateOfBirthStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirthStr() {
        return dateOfBirthStr;
    }

    /**
     * Sets the value of the dateOfBirthStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirthStr(String value) {
        this.dateOfBirthStr = value;
    }

    /**
     * Gets the value of the errMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrMsg() {
        return errMsg;
    }

    /**
     * Sets the value of the errMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrMsg(String value) {
        this.errMsg = value;
    }

    /**
     * Gets the value of the fatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherName() {
        return fatherName;
    }

    /**
     * Sets the value of the fatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherName(String value) {
        this.fatherName = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the leftIndexWsq property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLeftIndexWsq() {
        return leftIndexWsq;
    }

    /**
     * Sets the value of the leftIndexWsq property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLeftIndexWsq(byte[] value) {
        this.leftIndexWsq = value;
    }

    /**
     * Gets the value of the leftThumbWsq property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLeftThumbWsq() {
        return leftThumbWsq;
    }

    /**
     * Sets the value of the leftThumbWsq property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLeftThumbWsq(byte[] value) {
        this.leftThumbWsq = value;
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
     * Gets the value of the presentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentAddress() {
        return presentAddress;
    }

    /**
     * Sets the value of the presentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentAddress(String value) {
        this.presentAddress = value;
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
     * Gets the value of the rightIndexWsq property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRightIndexWsq() {
        return rightIndexWsq;
    }

    /**
     * Sets the value of the rightIndexWsq property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRightIndexWsq(byte[] value) {
        this.rightIndexWsq = value;
    }

    /**
     * Gets the value of the rightThumbWsq property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRightThumbWsq() {
        return rightThumbWsq;
    }

    /**
     * Sets the value of the rightThumbWsq property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRightThumbWsq(byte[] value) {
        this.rightThumbWsq = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setScore(Double value) {
        this.score = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSignature(byte[] value) {
        this.signature = value;
    }

    /**
     * Gets the value of the spouseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseName() {
        return spouseName;
    }

    /**
     * Sets the value of the spouseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseName(String value) {
        this.spouseName = value;
    }

}
