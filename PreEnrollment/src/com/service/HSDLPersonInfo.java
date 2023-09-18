
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HSDLPersonInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HSDLPersonInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="biometric" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}biometric" minOccurs="0"/>
 *         &lt;element name="bloodGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateOfBirthString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emergencyContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emergencyContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emergencyContactNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emergencyContactRelationship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherBn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="foreignAddress" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}HSDLForeignAddress" minOccurs="0"/>
 *         &lt;element name="foreignCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="foreignDrivingLicenseNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="foreignNational" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherBn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameBn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occupationOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="officePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permanentAddress" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}HSDLAddress" minOccurs="0"/>
 *         &lt;element name="presentAddress" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}HSDLAddress" minOccurs="0"/>
 *         &lt;element name="socialSecurityNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseBn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSDLPersonInfo", propOrder = {
    "biometric",
    "bloodGroup",
    "dateOfBirth",
    "dateOfBirthString",
    "email",
    "emergencyContactEmail",
    "emergencyContactName",
    "emergencyContactNo",
    "emergencyContactRelationship",
    "fatherBn",
    "fatherEn",
    "foreignAddress",
    "foreignCountry",
    "foreignDrivingLicenseNo",
    "foreignNational",
    "gender",
    "homePhone",
    "id",
    "maritalStatus",
    "mobile",
    "motherBn",
    "motherEn",
    "nameBn",
    "nameEn",
    "nationalId",
    "nationality",
    "occupation",
    "occupationOther",
    "officePhone",
    "passportNo",
    "permanentAddress",
    "presentAddress",
    "socialSecurityNo",
    "spouseBn",
    "spouseEn"
})
public class HSDLPersonInfo {

    protected Biometric biometric;
    protected String bloodGroup;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    protected String dateOfBirthString;
    protected String email;
    protected String emergencyContactEmail;
    protected String emergencyContactName;
    protected String emergencyContactNo;
    protected String emergencyContactRelationship;
    protected String fatherBn;
    protected String fatherEn;
    protected HSDLForeignAddress foreignAddress;
    protected String foreignCountry;
    protected String foreignDrivingLicenseNo;
    protected boolean foreignNational;
    protected String gender;
    protected String homePhone;
    protected Long id;
    protected String maritalStatus;
    protected String mobile;
    protected String motherBn;
    protected String motherEn;
    protected String nameBn;
    protected String nameEn;
    protected String nationalId;
    protected String nationality;
    protected String occupation;
    protected String occupationOther;
    protected String officePhone;
    protected String passportNo;
    protected HSDLAddress permanentAddress;
    protected HSDLAddress presentAddress;
    protected String socialSecurityNo;
    protected String spouseBn;
    protected String spouseEn;

    /**
     * Gets the value of the biometric property.
     * 
     * @return
     *     possible object is
     *     {@link Biometric }
     *     
     */
    public Biometric getBiometric() {
        return biometric;
    }

    /**
     * Sets the value of the biometric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Biometric }
     *     
     */
    public void setBiometric(Biometric value) {
        this.biometric = value;
    }

    /**
     * Gets the value of the bloodGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBloodGroup() {
        return bloodGroup;
    }

    /**
     * Sets the value of the bloodGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBloodGroup(String value) {
        this.bloodGroup = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the dateOfBirthString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirthString() {
        return dateOfBirthString;
    }

    /**
     * Sets the value of the dateOfBirthString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirthString(String value) {
        this.dateOfBirthString = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the emergencyContactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyContactEmail() {
        return emergencyContactEmail;
    }

    /**
     * Sets the value of the emergencyContactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactEmail(String value) {
        this.emergencyContactEmail = value;
    }

    /**
     * Gets the value of the emergencyContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    /**
     * Sets the value of the emergencyContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactName(String value) {
        this.emergencyContactName = value;
    }

    /**
     * Gets the value of the emergencyContactNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyContactNo() {
        return emergencyContactNo;
    }

    /**
     * Sets the value of the emergencyContactNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactNo(String value) {
        this.emergencyContactNo = value;
    }

    /**
     * Gets the value of the emergencyContactRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyContactRelationship() {
        return emergencyContactRelationship;
    }

    /**
     * Sets the value of the emergencyContactRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactRelationship(String value) {
        this.emergencyContactRelationship = value;
    }

    /**
     * Gets the value of the fatherBn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherBn() {
        return fatherBn;
    }

    /**
     * Sets the value of the fatherBn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherBn(String value) {
        this.fatherBn = value;
    }

    /**
     * Gets the value of the fatherEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherEn() {
        return fatherEn;
    }

    /**
     * Sets the value of the fatherEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherEn(String value) {
        this.fatherEn = value;
    }

    /**
     * Gets the value of the foreignAddress property.
     * 
     * @return
     *     possible object is
     *     {@link HSDLForeignAddress }
     *     
     */
    public HSDLForeignAddress getForeignAddress() {
        return foreignAddress;
    }

    /**
     * Sets the value of the foreignAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link HSDLForeignAddress }
     *     
     */
    public void setForeignAddress(HSDLForeignAddress value) {
        this.foreignAddress = value;
    }

    /**
     * Gets the value of the foreignCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignCountry() {
        return foreignCountry;
    }

    /**
     * Sets the value of the foreignCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignCountry(String value) {
        this.foreignCountry = value;
    }

    /**
     * Gets the value of the foreignDrivingLicenseNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignDrivingLicenseNo() {
        return foreignDrivingLicenseNo;
    }

    /**
     * Sets the value of the foreignDrivingLicenseNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignDrivingLicenseNo(String value) {
        this.foreignDrivingLicenseNo = value;
    }

    /**
     * Gets the value of the foreignNational property.
     * 
     */
    public boolean isForeignNational() {
        return foreignNational;
    }

    /**
     * Sets the value of the foreignNational property.
     * 
     */
    public void setForeignNational(boolean value) {
        this.foreignNational = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
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
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the motherBn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherBn() {
        return motherBn;
    }

    /**
     * Sets the value of the motherBn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherBn(String value) {
        this.motherBn = value;
    }

    /**
     * Gets the value of the motherEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherEn() {
        return motherEn;
    }

    /**
     * Sets the value of the motherEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherEn(String value) {
        this.motherEn = value;
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

    /**
     * Gets the value of the nationalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalId() {
        return nationalId;
    }

    /**
     * Sets the value of the nationalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalId(String value) {
        this.nationalId = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the occupationOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupationOther() {
        return occupationOther;
    }

    /**
     * Sets the value of the occupationOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupationOther(String value) {
        this.occupationOther = value;
    }

    /**
     * Gets the value of the officePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficePhone() {
        return officePhone;
    }

    /**
     * Sets the value of the officePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficePhone(String value) {
        this.officePhone = value;
    }

    /**
     * Gets the value of the passportNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNo() {
        return passportNo;
    }

    /**
     * Sets the value of the passportNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNo(String value) {
        this.passportNo = value;
    }

    /**
     * Gets the value of the permanentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link HSDLAddress }
     *     
     */
    public HSDLAddress getPermanentAddress() {
        return permanentAddress;
    }

    /**
     * Sets the value of the permanentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link HSDLAddress }
     *     
     */
    public void setPermanentAddress(HSDLAddress value) {
        this.permanentAddress = value;
    }

    /**
     * Gets the value of the presentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link HSDLAddress }
     *     
     */
    public HSDLAddress getPresentAddress() {
        return presentAddress;
    }

    /**
     * Sets the value of the presentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link HSDLAddress }
     *     
     */
    public void setPresentAddress(HSDLAddress value) {
        this.presentAddress = value;
    }

    /**
     * Gets the value of the socialSecurityNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSecurityNo() {
        return socialSecurityNo;
    }

    /**
     * Sets the value of the socialSecurityNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSecurityNo(String value) {
        this.socialSecurityNo = value;
    }

    /**
     * Gets the value of the spouseBn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseBn() {
        return spouseBn;
    }

    /**
     * Sets the value of the spouseBn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseBn(String value) {
        this.spouseBn = value;
    }

    /**
     * Gets the value of the spouseEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseEn() {
        return spouseEn;
    }

    /**
     * Sets the value of the spouseEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseEn(String value) {
        this.spouseEn = value;
    }

}
