
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dlAttachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dlAttachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachment1" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="attachment2" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="attachment3" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="photo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dlAttachment", propOrder = {
    "attachment1",
    "attachment2",
    "attachment3",
    "id",
    "note",
    "photo",
    "type"
})
public class DlAttachment {

    protected byte[] attachment1;
    protected byte[] attachment2;
    protected byte[] attachment3;
    protected Long id;
    protected String note;
    protected byte[] photo;
    protected Long type;

    /**
     * Gets the value of the attachment1 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAttachment1() {
        return attachment1;
    }

    /**
     * Sets the value of the attachment1 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAttachment1(byte[] value) {
        this.attachment1 = value;
    }

    /**
     * Gets the value of the attachment2 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAttachment2() {
        return attachment2;
    }

    /**
     * Sets the value of the attachment2 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAttachment2(byte[] value) {
        this.attachment2 = value;
    }

    /**
     * Gets the value of the attachment3 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAttachment3() {
        return attachment3;
    }

    /**
     * Sets the value of the attachment3 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAttachment3(byte[] value) {
        this.attachment3 = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setType(Long value) {
        this.type = value;
    }

}
