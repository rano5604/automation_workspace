
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for markAsOnHoldApplicationServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="markAsOnHoldApplicationServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceWarning" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "markAsOnHoldApplicationServiceResponse", propOrder = {
    "status"
})
public class MarkAsOnHoldApplicationServiceResponse
    extends ServiceResponse
{

    protected ServiceWarning status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceWarning }
     *     
     */
    public ServiceWarning getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceWarning }
     *     
     */
    public void setStatus(ServiceWarning value) {
        this.status = value;
    }

}
