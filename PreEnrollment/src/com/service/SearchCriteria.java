
package com.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APP_INSERT_DATE_STR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTHORITY_ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="COUNTRY_ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CURRENT_YEAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENROLLED_APPLICATION_ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="INCLUDE_HOLIDAY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LIMIT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MISSION_ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OFFSET" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SCHEDULE_TYPE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="STATION_HOLIDAY_LIST" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}officeHoliday" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TOTAL_COUNT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="YEAR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchCriteria", propOrder = {
    "appinsertdatestr",
    "authorityid",
    "countryid",
    "currentyear",
    "enrolledapplicationid",
    "id",
    "includeholiday",
    "limit",
    "missionid",
    "offset",
    "scheduletype",
    "stationholidaylist",
    "totalcount",
    "year"
})
public class SearchCriteria {

    @XmlElement(name = "APP_INSERT_DATE_STR")
    protected String appinsertdatestr;
    @XmlElement(name = "AUTHORITY_ID")
    protected Integer authorityid;
    @XmlElement(name = "COUNTRY_ID")
    protected Integer countryid;
    @XmlElement(name = "CURRENT_YEAR")
    protected String currentyear;
    @XmlElement(name = "ENROLLED_APPLICATION_ID")
    protected Integer enrolledapplicationid;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElement(name = "INCLUDE_HOLIDAY")
    protected Boolean includeholiday;
    @XmlElement(name = "LIMIT")
    protected Integer limit;
    @XmlElement(name = "MISSION_ID")
    protected Integer missionid;
    @XmlElement(name = "OFFSET")
    protected Integer offset;
    @XmlElement(name = "SCHEDULE_TYPE")
    protected Integer scheduletype;
    @XmlElement(name = "STATION_HOLIDAY_LIST", nillable = true)
    protected List<OfficeHoliday> stationholidaylist;
    @XmlElement(name = "TOTAL_COUNT")
    protected Integer totalcount;
    @XmlElement(name = "YEAR")
    protected Integer year;

    /**
     * Gets the value of the appinsertdatestr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPINSERTDATESTR() {
        return appinsertdatestr;
    }

    /**
     * Sets the value of the appinsertdatestr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPINSERTDATESTR(String value) {
        this.appinsertdatestr = value;
    }

    /**
     * Gets the value of the authorityid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAUTHORITYID() {
        return authorityid;
    }

    /**
     * Sets the value of the authorityid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAUTHORITYID(Integer value) {
        this.authorityid = value;
    }

    /**
     * Gets the value of the countryid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCOUNTRYID() {
        return countryid;
    }

    /**
     * Sets the value of the countryid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCOUNTRYID(Integer value) {
        this.countryid = value;
    }

    /**
     * Gets the value of the currentyear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENTYEAR() {
        return currentyear;
    }

    /**
     * Sets the value of the currentyear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENTYEAR(String value) {
        this.currentyear = value;
    }

    /**
     * Gets the value of the enrolledapplicationid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getENROLLEDAPPLICATIONID() {
        return enrolledapplicationid;
    }

    /**
     * Sets the value of the enrolledapplicationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setENROLLEDAPPLICATIONID(Integer value) {
        this.enrolledapplicationid = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the includeholiday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isINCLUDEHOLIDAY() {
        return includeholiday;
    }

    /**
     * Sets the value of the includeholiday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setINCLUDEHOLIDAY(Boolean value) {
        this.includeholiday = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLIMIT() {
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
    public void setLIMIT(Integer value) {
        this.limit = value;
    }

    /**
     * Gets the value of the missionid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMISSIONID() {
        return missionid;
    }

    /**
     * Sets the value of the missionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMISSIONID(Integer value) {
        this.missionid = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOFFSET() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOFFSET(Integer value) {
        this.offset = value;
    }

    /**
     * Gets the value of the scheduletype property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSCHEDULETYPE() {
        return scheduletype;
    }

    /**
     * Sets the value of the scheduletype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSCHEDULETYPE(Integer value) {
        this.scheduletype = value;
    }

    /**
     * Gets the value of the stationholidaylist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stationholidaylist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTATIONHOLIDAYLIST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfficeHoliday }
     * 
     * 
     */
    public List<OfficeHoliday> getSTATIONHOLIDAYLIST() {
        if (stationholidaylist == null) {
            stationholidaylist = new ArrayList<OfficeHoliday>();
        }
        return this.stationholidaylist;
    }

    /**
     * Gets the value of the totalcount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTOTALCOUNT() {
        return totalcount;
    }

    /**
     * Sets the value of the totalcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTOTALCOUNT(Integer value) {
        this.totalcount = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYEAR() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYEAR(Integer value) {
        this.year = value;
    }

}
