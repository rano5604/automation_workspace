
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enrollVehicleClassAddAppResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enrollVehicleClassAddAppResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}enrollVehicleClassAddAppServiceResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enrollVehicleClassAddAppResponse", propOrder = {
    "_return"
})
public class EnrollVehicleClassAddAppResponse {

    @XmlElement(name = "return")
    protected EnrollVehicleClassAddAppServiceResponse _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollVehicleClassAddAppServiceResponse }
     *     
     */
    public EnrollVehicleClassAddAppServiceResponse getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollVehicleClassAddAppServiceResponse }
     *     
     */
    public void setReturn(EnrollVehicleClassAddAppServiceResponse value) {
        this._return = value;
    }

}
