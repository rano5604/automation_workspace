
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foreignMissionShort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foreignMissionShort">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="foreignMissionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="missionEmailOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="missionEmailThree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="missionEmailTwo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "foreignMissionShort", propOrder = {
    "foreignMissionName",
    "id",
    "missionEmailOne",
    "missionEmailThree",
    "missionEmailTwo",
    "status"
})
public class ForeignMissionShort {

    protected String foreignMissionName;
    protected Long id;
    protected String missionEmailOne;
    protected String missionEmailThree;
    protected String missionEmailTwo;
    protected String status;

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
