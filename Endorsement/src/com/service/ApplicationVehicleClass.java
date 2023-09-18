
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for applicationVehicleClass complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationVehicleClass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="add" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="othersDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationVehicleClass", propOrder = {
    "add",
    "id",
    "othersDescription",
    "vehicleClass"
})
public class ApplicationVehicleClass {

    protected boolean add;
    protected long id;
    protected String othersDescription;
    protected String vehicleClass;

    /**
     * Gets the value of the add property.
     * 
     */
    public boolean isAdd() {
        return add;
    }

    /**
     * Sets the value of the add property.
     * 
     */
    public void setAdd(boolean value) {
        this.add = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the othersDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthersDescription() {
        return othersDescription;
    }

    /**
     * Sets the value of the othersDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthersDescription(String value) {
        this.othersDescription = value;
    }

    /**
     * Gets the value of the vehicleClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleClass() {
        return vehicleClass;
    }

    /**
     * Sets the value of the vehicleClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleClass(String value) {
        this.vehicleClass = value;
    }

}
