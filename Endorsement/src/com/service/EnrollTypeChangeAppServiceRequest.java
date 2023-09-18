
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enrollTypeChangeAppServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enrollTypeChangeAppServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="application" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}enrollApplication" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enrollTypeChangeAppServiceRequest", propOrder = {
    "application"
})
public class EnrollTypeChangeAppServiceRequest
    extends ServiceRequest
{

    protected EnrollApplication application;

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollApplication }
     *     
     */
    public EnrollApplication getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollApplication }
     *     
     */
    public void setApplication(EnrollApplication value) {
        this.application = value;
    }

}
