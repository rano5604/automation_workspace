
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for foreignMission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foreignMission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deleted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fixedStation" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="foreignMissionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="insertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="insertedBy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="missionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="missionEmailOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="missionEmailThree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="missionEmailTwo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="missionSeq" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mobileStation" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nationalityLookupTable" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}nationalityLookupTable" minOccurs="0"/>
 *         &lt;element name="registered" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "foreignMission", propOrder = {
    "deleted",
    "fixedStation",
    "foreignMissionName",
    "id",
    "insertDate",
    "insertedBy",
    "lastUpdateDate",
    "lastUpdatedBy",
    "missionCode",
    "missionEmailOne",
    "missionEmailThree",
    "missionEmailTwo",
    "missionSeq",
    "mobileStation",
    "nationalityLookupTable",
    "registered",
    "status"
})
public class ForeignMission {

    protected String deleted;
    protected Long fixedStation;
    protected String foreignMissionName;
    protected Long id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar insertDate;
    protected Long insertedBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDate;
    protected Long lastUpdatedBy;
    protected String missionCode;
    protected String missionEmailOne;
    protected String missionEmailThree;
    protected String missionEmailTwo;
    protected Long missionSeq;
    protected Long mobileStation;
    protected NationalityLookupTable nationalityLookupTable;
    protected Long registered;
    protected String status;

    /**
     * Gets the value of the deleted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * Sets the value of the deleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleted(String value) {
        this.deleted = value;
    }

    /**
     * Gets the value of the fixedStation property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFixedStation() {
        return fixedStation;
    }

    /**
     * Sets the value of the fixedStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFixedStation(Long value) {
        this.fixedStation = value;
    }

    /**
     * Gets the value of the foreignMissionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignMissionName() {
        return foreignMissionName;
    }

    /**
     * Sets the value of the foreignMissionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignMissionName(String value) {
        this.foreignMissionName = value;
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
     * Gets the value of the insertDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInsertDate() {
        return insertDate;
    }

    /**
     * Sets the value of the insertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInsertDate(XMLGregorianCalendar value) {
        this.insertDate = value;
    }

    /**
     * Gets the value of the insertedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInsertedBy() {
        return insertedBy;
    }

    /**
     * Sets the value of the insertedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInsertedBy(Long value) {
        this.insertedBy = value;
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
     * Gets the value of the missionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMissionCode() {
        return missionCode;
    }

    /**
     * Sets the value of the missionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMissionCode(String value) {
        this.missionCode = value;
    }

    /**
     * Gets the value of the missionEmailOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMissionEmailOne() {
        return missionEmailOne;
    }

    /**
     * Sets the value of the missionEmailOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMissionEmailOne(String value) {
        this.missionEmailOne = value;
    }

    /**
     * Gets the value of the missionEmailThree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMissionEmailThree() {
        return missionEmailThree;
    }

    /**
     * Sets the value of the missionEmailThree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMissionEmailThree(String value) {
        this.missionEmailThree = value;
    }

    /**
     * Gets the value of the missionEmailTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMissionEmailTwo() {
        return missionEmailTwo;
    }

    /**
     * Sets the value of the missionEmailTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMissionEmailTwo(String value) {
        this.missionEmailTwo = value;
    }

    /**
     * Gets the value of the missionSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMissionSeq() {
        return missionSeq;
    }

    /**
     * Sets the value of the missionSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMissionSeq(Long value) {
        this.missionSeq = value;
    }

    /**
     * Gets the value of the mobileStation property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMobileStation() {
        return mobileStation;
    }

    /**
     * Sets the value of the mobileStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMobileStation(Long value) {
        this.mobileStation = value;
    }

    /**
     * Gets the value of the nationalityLookupTable property.
     * 
     * @return
     *     possible object is
     *     {@link NationalityLookupTable }
     *     
     */
    public NationalityLookupTable getNationalityLookupTable() {
        return nationalityLookupTable;
    }

    /**
     * Sets the value of the nationalityLookupTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalityLookupTable }
     *     
     */
    public void setNationalityLookupTable(NationalityLookupTable value) {
        this.nationalityLookupTable = value;
    }

    /**
     * Gets the value of the registered property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegistered() {
        return registered;
    }

    /**
     * Sets the value of the registered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegistered(Long value) {
        this.registered = value;
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
