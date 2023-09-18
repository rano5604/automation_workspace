
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDlApplicationServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDlApplicationServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="onlineDlApp" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}onlineDlApplication" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDlApplicationServiceRequest", propOrder = {
    "onlineDlApp"
})
public class GetDlApplicationServiceRequest
    extends ServiceRequest
{

    protected OnlineDlApplication onlineDlApp;

    /**
     * Gets the value of the onlineDlApp property.
     * 
     * @return
     *     possible object is
     *     {@link OnlineDlApplication }
     *     
     */
    public OnlineDlApplication getOnlineDlApp() {
        return onlineDlApp;
    }

    /**
     * Sets the value of the onlineDlApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineDlApplication }
     *     
     */
    public void setOnlineDlApp(OnlineDlApplication value) {
        this.onlineDlApp = value;
    }

}
