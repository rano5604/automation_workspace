
package com.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for officeHoliday complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="officeHoliday">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorityId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="holidayList" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}holiday" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numberOfWeekend" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="slotCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="weekendDates" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="weekendList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "officeHoliday", propOrder = {
    "authorityId",
    "holidayList",
    "id",
    "numberOfWeekend",
    "slotCount",
    "type",
    "weekendDates",
    "weekendList",
    "year"
})
public class OfficeHoliday {

    protected Integer authorityId;
    @XmlElement(nillable = true)
    protected List<Holiday> holidayList;
    protected Long id;
    protected Long numberOfWeekend;
    protected Integer slotCount;
    protected Long type;
    @XmlElement(nillable = true)
    protected List<String> weekendDates;
    @XmlElement(nillable = true)
    protected List<String> weekendList;
    protected Long year;

    /**
     * Gets the value of the authorityId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuthorityId() {
        return authorityId;
    }

    /**
     * Sets the value of the authorityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuthorityId(Integer value) {
        this.authorityId = value;
    }

    /**
     * Gets the value of the holidayList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holidayList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHolidayList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Holiday }
     * 
     * 
     */
    public List<Holiday> getHolidayList() {
        if (holidayList == null) {
            holidayList = new ArrayList<Holiday>();
        }
        return this.holidayList;
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
     * Gets the value of the numberOfWeekend property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfWeekend() {
        return numberOfWeekend;
    }

    /**
     * Sets the value of the numberOfWeekend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfWeekend(Long value) {
        this.numberOfWeekend = value;
    }

    /**
     * Gets the value of the slotCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSlotCount() {
        return slotCount;
    }

    /**
     * Sets the value of the slotCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSlotCount(Integer value) {
        this.slotCount = value;
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

    /**
     * Gets the value of the weekendDates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weekendDates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeekendDates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWeekendDates() {
        if (weekendDates == null) {
            weekendDates = new ArrayList<String>();
        }
        return this.weekendDates;
    }

    /**
     * Gets the value of the weekendList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weekendList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeekendList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWeekendList() {
        if (weekendList == null) {
            weekendList = new ArrayList<String>();
        }
        return this.weekendList;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setYear(Long value) {
        this.year = value;
    }

}
