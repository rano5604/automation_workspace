
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for endorsementSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endorsementSearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endorsementSearchType" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}endorsementSearchType" minOccurs="0"/>
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="newAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endorsementSearchCriteria", propOrder = {
    "endorsementSearchType",
    "fromDate",
    "limit",
    "newAuthority",
    "newReferenceNumber",
    "oldAuthority",
    "oldReferenceNumber",
    "startIndex",
    "status",
    "toDate"
})
public class EndorsementSearchCriteria {

    @XmlSchemaType(name = "string")
    protected EndorsementSearchType endorsementSearchType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    protected Integer limit;
    protected String newAuthority;
    protected String newReferenceNumber;
    protected String oldAuthority;
    protected String oldReferenceNumber;
    protected Integer startIndex;
    protected String status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;

    /**
     * Gets the value of the endorsementSearchType property.
     * 
     * @return
     *     possible object is
     *     {@link EndorsementSearchType }
     *     
     */
    public EndorsementSearchType getEndorsementSearchType() {
        return endorsementSearchType;
    }

    /**
     * Sets the value of the endorsementSearchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndorsementSearchType }
     *     
     */
    public void setEndorsementSearchType(EndorsementSearchType value) {
        this.endorsementSearchType = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimit(Integer value) {
        this.limit = value;
    }

    /**
     * Gets the value of the newAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewAuthority() {
        return newAuthority;
    }

    /**
     * Sets the value of the newAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewAuthority(String value) {
        this.newAuthority = value;
    }

    /**
     * Gets the value of the newReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewReferenceNumber() {
        return newReferenceNumber;
    }

    /**
     * Sets the value of the newReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewReferenceNumber(String value) {
        this.newReferenceNumber = value;
    }

    /**
     * Gets the value of the oldAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldAuthority() {
        return oldAuthority;
    }

    /**
     * Sets the value of the oldAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldAuthority(String value) {
        this.oldAuthority = value;
    }

    /**
     * Gets the value of the oldReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldReferenceNumber() {
        return oldReferenceNumber;
    }

    /**
     * Sets the value of the oldReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldReferenceNumber(String value) {
        this.oldReferenceNumber = value;
    }

    /**
     * Gets the value of the startIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartIndex() {
        return startIndex;
    }

    /**
     * Sets the value of the startIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartIndex(Integer value) {
        this.startIndex = value;
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

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

}
