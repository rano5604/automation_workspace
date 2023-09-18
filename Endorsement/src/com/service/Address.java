
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressLineBn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressLineEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="districtId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="unionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="upozilaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "address", propOrder = {
    "addressLineBn",
    "addressLineEn",
    "districtId",
    "id",
    "postcode",
    "unionId",
    "upozilaId"
})
public class Address {

    protected String addressLineBn;
    protected String addressLineEn;
    protected Long districtId;
    protected Long id;
    protected Long postcode;
    protected Long unionId;
    protected Long upozilaId;

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
     * Gets the value of the districtId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDistrictId() {
        return districtId;
    }

    /**
     * Sets the value of the districtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDistrictId(Long value) {
        this.districtId = value;
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
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPostcode(Long value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the unionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnionId() {
        return unionId;
    }

    /**
     * Sets the value of the unionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnionId(Long value) {
        this.unionId = value;
    }

    /**
     * Gets the value of the upozilaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUpozilaId() {
        return upozilaId;
    }

    /**
     * Sets the value of the upozilaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUpozilaId(Long value) {
        this.upozilaId = value;
    }

}
