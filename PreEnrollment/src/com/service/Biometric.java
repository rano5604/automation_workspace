
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for biometric complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="biometric">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="leftIndexMinex" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="leftIndexWsq" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="leftThumbMinex" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="leftThumbWsq" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="photo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="rightIndexMinex" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="rightIndexWsq" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="rightThumbMinex" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="rightThumbWsq" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "biometric", propOrder = {
    "id",
    "leftIndexMinex",
    "leftIndexWsq",
    "leftThumbMinex",
    "leftThumbWsq",
    "photo",
    "rightIndexMinex",
    "rightIndexWsq",
    "rightThumbMinex",
    "rightThumbWsq",
    "signature"
})
public class Biometric {

    protected Long id;
    protected byte[] leftIndexMinex;
    protected byte[] leftIndexWsq;
    protected byte[] leftThumbMinex;
    protected byte[] leftThumbWsq;
    protected byte[] photo;
    protected byte[] rightIndexMinex;
    protected byte[] rightIndexWsq;
    protected byte[] rightThumbMinex;
    protected byte[] rightThumbWsq;
    protected byte[] signature;

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
     * Gets the value of the leftIndexMinex property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLeftIndexMinex() {
        return leftIndexMinex;
    }

    /**
     * Sets the value of the leftIndexMinex property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLeftIndexMinex(byte[] value) {
        this.leftIndexMinex = value;
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
     * Gets the value of the leftThumbMinex property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLeftThumbMinex() {
        return leftThumbMinex;
    }

    /**
     * Sets the value of the leftThumbMinex property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLeftThumbMinex(byte[] value) {
        this.leftThumbMinex = value;
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
     * Gets the value of the rightIndexMinex property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRightIndexMinex() {
        return rightIndexMinex;
    }

    /**
     * Sets the value of the rightIndexMinex property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRightIndexMinex(byte[] value) {
        this.rightIndexMinex = value;
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
     * Gets the value of the rightThumbMinex property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRightThumbMinex() {
        return rightThumbMinex;
    }

    /**
     * Sets the value of the rightThumbMinex property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRightThumbMinex(byte[] value) {
        this.rightThumbMinex = value;
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

}
