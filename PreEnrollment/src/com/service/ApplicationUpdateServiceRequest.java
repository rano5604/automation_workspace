
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for applicationUpdateServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationUpdateServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="application" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}application" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationUpdateServiceRequest", propOrder = {
    "application"
})
public class ApplicationUpdateServiceRequest
    extends ServiceRequest
{

    protected Application application;

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link Application }
     *     
     */
    public Application getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link Application }
     *     
     */
    public void setApplication(Application value) {
        this.application = value;
    }

}
