
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enrollEndorsementApplicationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enrollEndorsementApplicationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="enrollApplication" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}enrollApplication" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enrollEndorsementApplicationRequest", propOrder = {
    "enrollApplication"
})
public class EnrollEndorsementApplicationRequest
    extends ServiceRequest
{

    protected EnrollApplication enrollApplication;

    /**
     * Gets the value of the enrollApplication property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollApplication }
     *     
     */
    public EnrollApplication getEnrollApplication() {
        return enrollApplication;
    }

    /**
     * Sets the value of the enrollApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollApplication }
     *     
     */
    public void setEnrollApplication(EnrollApplication value) {
        this.enrollApplication = value;
    }

}
