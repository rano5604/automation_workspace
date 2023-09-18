
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attachedDoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="attachedDoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="data1" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="data2" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="data3" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="data4" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="docType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attachedDoc", propOrder = {
    "data",
    "data1",
    "data2",
    "data3",
    "data4",
    "docType",
    "id",
    "note"
})
public class AttachedDoc {

    protected byte[] data;
    protected byte[] data1;
    protected byte[] data2;
    protected byte[] data3;
    protected byte[] data4;
    protected String docType;
    protected Long id;
    protected String note;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setData(byte[] value) {
        this.data = value;
    }

    /**
     * Gets the value of the data1 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getData1() {
        return data1;
    }

    /**
     * Sets the value of the data1 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setData1(byte[] value) {
        this.data1 = value;
    }

    /**
     * Gets the value of the data2 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getData2() {
        return data2;
    }

    /**
     * Sets the value of the data2 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setData2(byte[] value) {
        this.data2 = value;
    }

    /**
     * Gets the value of the data3 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getData3() {
        return data3;
    }

    /**
     * Sets the value of the data3 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setData3(byte[] value) {
        this.data3 = value;
    }

    /**
     * Gets the value of the data4 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getData4() {
        return data4;
    }

    /**
     * Sets the value of the data4 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setData4(byte[] value) {
        this.data4 = value;
    }

    /**
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocType(String value) {
        this.docType = value;
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
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}
