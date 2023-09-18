
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for learnerDistrict complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="learnerDistrict">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="divisionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nameBn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "learnerDistrict", propOrder = {
    "code",
    "divisionId",
    "id",
    "nameBn",
    "nameEn"
})
public class LearnerDistrict {

    protected String code;
    protected Long divisionId;
    protected Long id;
    protected String nameBn;
    protected String nameEn;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the divisionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDivisionId() {
        return divisionId;
    }

    /**
     * Sets the value of the divisionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDivisionId(Long value) {
        this.divisionId = value;
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

}
