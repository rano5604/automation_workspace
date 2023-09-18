
package com.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for applicationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}applicationSummary">
 *       &lt;sequence>
 *         &lt;element name="applicationStatusHistory" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}applicationStatusHistory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="applicationSubType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="attachedDocs" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}attachedDoc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="authorizationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="authorizer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataCheckedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataCheckedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataCreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataCreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataUploadedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataUploadedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="hasPreviousPSV" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="licenseHistory" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}licenseHistory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="personInfo" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}personInfo" minOccurs="0"/>
 *         &lt;element name="suspendMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="verifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verifierDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationDetails", propOrder = {
    "applicationStatusHistory",
    "applicationSubType",
    "attachedDocs",
    "authorizationDate",
    "authorizer",
    "dataCheckedBy",
    "dataCheckedOn",
    "dataCreatedBy",
    "dataCreatedOn",
    "dataUploadedBy",
    "dataUploadedOn",
    "hasPreviousPSV",
    "licenseHistory",
    "personInfo",
    "suspendMessage",
    "verificationDate",
    "verifier",
    "verifierDesignation"
})
public class ApplicationDetails
    extends ApplicationSummary
{

    @XmlElement(nillable = true)
    protected List<ApplicationStatusHistory> applicationStatusHistory;
    protected Long applicationSubType;
    @XmlElement(nillable = true)
    protected List<AttachedDoc> attachedDocs;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar authorizationDate;
    protected String authorizer;
    protected String dataCheckedBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCheckedOn;
    protected String dataCreatedBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCreatedOn;
    protected String dataUploadedBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataUploadedOn;
    protected boolean hasPreviousPSV;
    @XmlElement(nillable = true)
    protected List<LicenseHistory> licenseHistory;
    protected PersonInfo personInfo;
    protected String suspendMessage;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar verificationDate;
    protected String verifier;
    protected String verifierDesignation;

    /**
     * Gets the value of the applicationStatusHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationStatusHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationStatusHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationStatusHistory }
     * 
     * 
     */
    public List<ApplicationStatusHistory> getApplicationStatusHistory() {
        if (applicationStatusHistory == null) {
            applicationStatusHistory = new ArrayList<ApplicationStatusHistory>();
        }
        return this.applicationStatusHistory;
    }

    /**
     * Gets the value of the applicationSubType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationSubType() {
        return applicationSubType;
    }

    /**
     * Sets the value of the applicationSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationSubType(Long value) {
        this.applicationSubType = value;
    }

    /**
     * Gets the value of the attachedDocs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachedDocs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachedDocs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachedDoc }
     * 
     * 
     */
    public List<AttachedDoc> getAttachedDocs() {
        if (attachedDocs == null) {
            attachedDocs = new ArrayList<AttachedDoc>();
        }
        return this.attachedDocs;
    }

    /**
     * Gets the value of the authorizationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthorizationDate() {
        return authorizationDate;
    }

    /**
     * Sets the value of the authorizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthorizationDate(XMLGregorianCalendar value) {
        this.authorizationDate = value;
    }

    /**
     * Gets the value of the authorizer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizer() {
        return authorizer;
    }

    /**
     * Sets the value of the authorizer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizer(String value) {
        this.authorizer = value;
    }

    /**
     * Gets the value of the dataCheckedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCheckedBy() {
        return dataCheckedBy;
    }

    /**
     * Sets the value of the dataCheckedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCheckedBy(String value) {
        this.dataCheckedBy = value;
    }

    /**
     * Gets the value of the dataCheckedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCheckedOn() {
        return dataCheckedOn;
    }

    /**
     * Sets the value of the dataCheckedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCheckedOn(XMLGregorianCalendar value) {
        this.dataCheckedOn = value;
    }

    /**
     * Gets the value of the dataCreatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCreatedBy() {
        return dataCreatedBy;
    }

    /**
     * Sets the value of the dataCreatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCreatedBy(String value) {
        this.dataCreatedBy = value;
    }

    /**
     * Gets the value of the dataCreatedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCreatedOn() {
        return dataCreatedOn;
    }

    /**
     * Sets the value of the dataCreatedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCreatedOn(XMLGregorianCalendar value) {
        this.dataCreatedOn = value;
    }

    /**
     * Gets the value of the dataUploadedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataUploadedBy() {
        return dataUploadedBy;
    }

    /**
     * Sets the value of the dataUploadedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataUploadedBy(String value) {
        this.dataUploadedBy = value;
    }

    /**
     * Gets the value of the dataUploadedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataUploadedOn() {
        return dataUploadedOn;
    }

    /**
     * Sets the value of the dataUploadedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataUploadedOn(XMLGregorianCalendar value) {
        this.dataUploadedOn = value;
    }

    /**
     * Gets the value of the hasPreviousPSV property.
     * 
     */
    public boolean isHasPreviousPSV() {
        return hasPreviousPSV;
    }

    /**
     * Sets the value of the hasPreviousPSV property.
     * 
     */
    public void setHasPreviousPSV(boolean value) {
        this.hasPreviousPSV = value;
    }

    /**
     * Gets the value of the licenseHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licenseHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicenseHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseHistory }
     * 
     * 
     */
    public List<LicenseHistory> getLicenseHistory() {
        if (licenseHistory == null) {
            licenseHistory = new ArrayList<LicenseHistory>();
        }
        return this.licenseHistory;
    }

    /**
     * Gets the value of the personInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfo }
     *     
     */
    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    /**
     * Sets the value of the personInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfo }
     *     
     */
    public void setPersonInfo(PersonInfo value) {
        this.personInfo = value;
    }

    /**
     * Gets the value of the suspendMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspendMessage() {
        return suspendMessage;
    }

    /**
     * Sets the value of the suspendMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspendMessage(String value) {
        this.suspendMessage = value;
    }

    /**
     * Gets the value of the verificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVerificationDate() {
        return verificationDate;
    }

    /**
     * Sets the value of the verificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVerificationDate(XMLGregorianCalendar value) {
        this.verificationDate = value;
    }

    /**
     * Gets the value of the verifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifier() {
        return verifier;
    }

    /**
     * Sets the value of the verifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifier(String value) {
        this.verifier = value;
    }

    /**
     * Gets the value of the verifierDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifierDesignation() {
        return verifierDesignation;
    }

    /**
     * Sets the value of the verifierDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifierDesignation(String value) {
        this.verifierDesignation = value;
    }

}
