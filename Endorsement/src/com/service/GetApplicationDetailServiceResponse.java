
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getApplicationDetailServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getApplicationDetailServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="application" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}applicationDetails" minOccurs="0"/>
 *         &lt;element name="applicationSubType" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}applicationSubType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getApplicationDetailServiceResponse", propOrder = {
    "application",
    "applicationSubType"
})
public class GetApplicationDetailServiceResponse
    extends ServiceResponse
{

    protected ApplicationDetails application;
    protected ApplicationSubType applicationSubType;

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationDetails }
     *     
     */
    public ApplicationDetails getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationDetails }
     *     
     */
    public void setApplication(ApplicationDetails value) {
        this.application = value;
    }

    /**
     * Gets the value of the applicationSubType property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationSubType }
     *     
     */
    public ApplicationSubType getApplicationSubType() {
        return applicationSubType;
    }

    /**
     * Sets the value of the applicationSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationSubType }
     *     
     */
    public void setApplicationSubType(ApplicationSubType value) {
        this.applicationSubType = value;
    }

}
