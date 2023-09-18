
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for holiday complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="holiday">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="examCapacity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="holidayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="officeHolidayId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="slotCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "holiday", propOrder = {
    "examCapacity",
    "holidayDate",
    "id",
    "officeHolidayId",
    "slotCount"
})
public class Holiday {

    protected Long examCapacity;
    protected String holidayDate;
    protected Long id;
    protected long officeHolidayId;
    protected Long slotCount;

    /**
     * Gets the value of the examCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExamCapacity() {
        return examCapacity;
    }

    /**
     * Sets the value of the examCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExamCapacity(Long value) {
        this.examCapacity = value;
    }

    /**
     * Gets the value of the holidayDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolidayDate() {
        return holidayDate;
    }

    /**
     * Sets the value of the holidayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolidayDate(String value) {
        this.holidayDate = value;
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
     * Gets the value of the officeHolidayId property.
     * 
     */
    public long getOfficeHolidayId() {
        return officeHolidayId;
    }

    /**
     * Sets the value of the officeHolidayId property.
     * 
     */
    public void setOfficeHolidayId(long value) {
        this.officeHolidayId = value;
    }

    /**
     * Gets the value of the slotCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSlotCount() {
        return slotCount;
    }

    /**
     * Sets the value of the slotCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSlotCount(Long value) {
        this.slotCount = value;
    }

}
