
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
 * <p>Java class for applicationDetailsCorrection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationDetailsCorrection">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}applicationCorrectionTypes">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}address" minOccurs="0"/>
 *         &lt;element name="afisStatus" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}afisStatusEnum" minOccurs="0"/>
 *         &lt;element name="applicantType" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}applicantTypeEnum" minOccurs="0"/>
 *         &lt;element name="authority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardStatus" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}cardStatusEnum" minOccurs="0"/>
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newLicenseType" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}licenseTypeEnum" minOccurs="0"/>
 *         &lt;element name="psvFlag" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="referenceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleClassList" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}applicationVehicleClass" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vipFlag" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationDetailsCorrection", propOrder = {
    "address",
    "afisStatus",
    "applicantType",
    "authority",
    "cardStatus",
    "issueDate",
    "mobileNumber",
    "motherNameEn",
    "newLicenseType",
    "psvFlag",
    "referenceDate",
    "referenceNumber",
    "vehicleClassList",
    "vipFlag"
})
public class ApplicationDetailsCorrection
    extends ApplicationCorrectionTypes
{

    protected Address address;
    @XmlSchemaType(name = "string")
    protected AfisStatusEnum afisStatus;
    @XmlSchemaType(name = "string")
    protected ApplicantTypeEnum applicantType;
    protected String authority;
    @XmlSchemaType(name = "string")
    protected CardStatusEnum cardStatus;
    protected String issueDate;
    protected String mobileNumber;
    protected String motherNameEn;
    @XmlSchemaType(name = "string")
    protected LicenseTypeEnum newLicenseType;
    protected Long psvFlag;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar referenceDate;
    protected String referenceNumber;
    @XmlElement(nillable = true)
    protected List<ApplicationVehicleClass> vehicleClassList;
    protected Long vipFlag;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the afisStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AfisStatusEnum }
     *     
     */
    public AfisStatusEnum getAfisStatus() {
        return afisStatus;
    }

    /**
     * Sets the value of the afisStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AfisStatusEnum }
     *     
     */
    public void setAfisStatus(AfisStatusEnum value) {
        this.afisStatus = value;
    }

    /**
     * Gets the value of the applicantType property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicantTypeEnum }
     *     
     */
    public ApplicantTypeEnum getApplicantType() {
        return applicantType;
    }

    /**
     * Sets the value of the applicantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicantTypeEnum }
     *     
     */
    public void setApplicantType(ApplicantTypeEnum value) {
        this.applicantType = value;
    }

    /**
     * Gets the value of the authority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * Sets the value of the authority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthority(String value) {
        this.authority = value;
    }

    /**
     * Gets the value of the cardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CardStatusEnum }
     *     
     */
    public CardStatusEnum getCardStatus() {
        return cardStatus;
    }

    /**
     * Sets the value of the cardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardStatusEnum }
     *     
     */
    public void setCardStatus(CardStatusEnum value) {
        this.cardStatus = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDate(String value) {
        this.issueDate = value;
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
     * Gets the value of the motherNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherNameEn() {
        return motherNameEn;
    }

    /**
     * Sets the value of the motherNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherNameEn(String value) {
        this.motherNameEn = value;
    }

    /**
     * Gets the value of the newLicenseType property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseTypeEnum }
     *     
     */
    public LicenseTypeEnum getNewLicenseType() {
        return newLicenseType;
    }

    /**
     * Sets the value of the newLicenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseTypeEnum }
     *     
     */
    public void setNewLicenseType(LicenseTypeEnum value) {
        this.newLicenseType = value;
    }

    /**
     * Gets the value of the psvFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPsvFlag() {
        return psvFlag;
    }

    /**
     * Sets the value of the psvFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPsvFlag(Long value) {
        this.psvFlag = value;
    }

    /**
     * Gets the value of the referenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReferenceDate() {
        return referenceDate;
    }

    /**
     * Sets the value of the referenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReferenceDate(XMLGregorianCalendar value) {
        this.referenceDate = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the vehicleClassList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleClassList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleClassList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationVehicleClass }
     * 
     * 
     */
    public List<ApplicationVehicleClass> getVehicleClassList() {
        if (vehicleClassList == null) {
            vehicleClassList = new ArrayList<ApplicationVehicleClass>();
        }
        return this.vehicleClassList;
    }

    /**
     * Gets the value of the vipFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVipFlag() {
        return vipFlag;
    }

    /**
     * Sets the value of the vipFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVipFlag(Long value) {
        this.vipFlag = value;
    }

}
