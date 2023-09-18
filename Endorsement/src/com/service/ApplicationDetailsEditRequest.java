
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for applicationDetailsEditRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationDetailsEditRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="correction" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}applicationDetailsCorrection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationDetailsEditRequest", propOrder = {
    "correction"
})
public class ApplicationDetailsEditRequest
    extends ServiceRequest
{

    protected ApplicationDetailsCorrection correction;

    /**
     * Gets the value of the correction property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationDetailsCorrection }
     *     
     */
    public ApplicationDetailsCorrection getCorrection() {
        return correction;
    }

    /**
     * Sets the value of the correction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationDetailsCorrection }
     *     
     */
    public void setCorrection(ApplicationDetailsCorrection value) {
        this.correction = value;
    }

}
