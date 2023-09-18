
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for applicationSubType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationSubType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="correction" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="publicService" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="renewal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="vehicleAddition" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="vehicleChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationSubType", propOrder = {
    "correction",
    "publicService",
    "renewal",
    "vehicleAddition",
    "vehicleChange"
})
public class ApplicationSubType {

    protected boolean correction;
    protected boolean publicService;
    protected boolean renewal;
    protected boolean vehicleAddition;
    protected boolean vehicleChange;

    /**
     * Gets the value of the correction property.
     * 
     */
    public boolean isCorrection() {
        return correction;
    }

    /**
     * Sets the value of the correction property.
     * 
     */
    public void setCorrection(boolean value) {
        this.correction = value;
    }

    /**
     * Gets the value of the publicService property.
     * 
     */
    public boolean isPublicService() {
        return publicService;
    }

    /**
     * Sets the value of the publicService property.
     * 
     */
    public void setPublicService(boolean value) {
        this.publicService = value;
    }

    /**
     * Gets the value of the renewal property.
     * 
     */
    public boolean isRenewal() {
        return renewal;
    }

    /**
     * Sets the value of the renewal property.
     * 
     */
    public void setRenewal(boolean value) {
        this.renewal = value;
    }

    /**
     * Gets the value of the vehicleAddition property.
     * 
     */
    public boolean isVehicleAddition() {
        return vehicleAddition;
    }

    /**
     * Sets the value of the vehicleAddition property.
     * 
     */
    public void setVehicleAddition(boolean value) {
        this.vehicleAddition = value;
    }

    /**
     * Gets the value of the vehicleChange property.
     * 
     */
    public boolean isVehicleChange() {
        return vehicleChange;
    }

    /**
     * Sets the value of the vehicleChange property.
     * 
     */
    public void setVehicleChange(boolean value) {
        this.vehicleChange = value;
    }

}
