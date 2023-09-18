
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDlEnrollServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDlEnrollServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="dlApplication" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}onlineDlApplication" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDlEnrollServiceResponse", propOrder = {
    "dlApplication"
})
public class GetDlEnrollServiceResponse
    extends ServiceResponse
{

    protected OnlineDlApplication dlApplication;

    /**
     * Gets the value of the dlApplication property.
     * 
     * @return
     *     possible object is
     *     {@link OnlineDlApplication }
     *     
     */
    public OnlineDlApplication getDlApplication() {
        return dlApplication;
    }

    /**
     * Sets the value of the dlApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineDlApplication }
     *     
     */
    public void setDlApplication(OnlineDlApplication value) {
        this.dlApplication = value;
    }

}
