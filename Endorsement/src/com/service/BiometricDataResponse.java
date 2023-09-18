
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for biometricDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="biometricDataResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="ansiLi" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="ansiLt" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="ansiRi" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="ansiRt" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="photo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="wsqLi" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="wsqLt" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="wsqRi" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="wsqRt" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "biometricDataResponse", propOrder = {
    "ansiLi",
    "ansiLt",
    "ansiRi",
    "ansiRt",
    "mobileNumber",
    "personId",
    "photo",
    "signature",
    "wsqLi",
    "wsqLt",
    "wsqRi",
    "wsqRt"
})
public class BiometricDataResponse
    extends ServiceResponse
{

    protected byte[] ansiLi;
    protected byte[] ansiLt;
    protected byte[] ansiRi;
    protected byte[] ansiRt;
    protected String mobileNumber;
    protected Long personId;
    protected byte[] photo;
    protected byte[] signature;
    protected byte[] wsqLi;
    protected byte[] wsqLt;
    protected byte[] wsqRi;
    protected byte[] wsqRt;

    /**
     * Gets the value of the ansiLi property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAnsiLi() {
        return ansiLi;
    }

    /**
     * Sets the value of the ansiLi property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAnsiLi(byte[] value) {
        this.ansiLi = value;
    }

    /**
     * Gets the value of the ansiLt property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAnsiLt() {
        return ansiLt;
    }

    /**
     * Sets the value of the ansiLt property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAnsiLt(byte[] value) {
        this.ansiLt = value;
    }

    /**
     * Gets the value of the ansiRi property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAnsiRi() {
        return ansiRi;
    }

    /**
     * Sets the value of the ansiRi property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAnsiRi(byte[] value) {
        this.ansiRi = value;
    }

    /**
     * Gets the value of the ansiRt property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAnsiRt() {
        return ansiRt;
    }

    /**
     * Sets the value of the ansiRt property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAnsiRt(byte[] value) {
        this.ansiRt = value;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
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
     * Gets the value of the wsqLi property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getWsqLi() {
        return wsqLi;
    }

    /**
     * Sets the value of the wsqLi property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setWsqLi(byte[] value) {
        this.wsqLi = value;
    }

    /**
     * Gets the value of the wsqLt property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getWsqLt() {
        return wsqLt;
    }

    /**
     * Sets the value of the wsqLt property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setWsqLt(byte[] value) {
        this.wsqLt = value;
    }

    /**
     * Gets the value of the wsqRi property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getWsqRi() {
        return wsqRi;
    }

    /**
     * Sets the value of the wsqRi property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setWsqRi(byte[] value) {
        this.wsqRi = value;
    }

    /**
     * Gets the value of the wsqRt property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getWsqRt() {
        return wsqRt;
    }

    /**
     * Sets the value of the wsqRt property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setWsqRt(byte[] value) {
        this.wsqRt = value;
    }

}
