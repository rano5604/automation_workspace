
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enrollApplication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enrollApplication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="application" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}HSDLApplication" minOccurs="0"/>
 *         &lt;element name="applicationSubType" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}applicationSubType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enrollApplication", propOrder = {
    "application",
    "applicationSubType"
})
public class EnrollApplication {

    protected HSDLApplication application;
    protected ApplicationSubType applicationSubType;

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link HSDLApplication }
     *     
     */
    public HSDLApplication getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link HSDLApplication }
     *     
     */
    public void setApplication(HSDLApplication value) {
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
