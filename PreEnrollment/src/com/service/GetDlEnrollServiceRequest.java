
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDlEnrollServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDlEnrollServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="dlApplication" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}onlineDlApplication" minOccurs="0"/>
 *         &lt;element name="partialSave" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDlEnrollServiceRequest", propOrder = {
    "dlApplication",
    "partialSave"
})
public class GetDlEnrollServiceRequest
    extends ServiceRequest
{

    protected OnlineDlApplication dlApplication;
    protected boolean partialSave;

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

    /**
     * Gets the value of the partialSave property.
     * 
     */
    public boolean isPartialSave() {
        return partialSave;
    }

    /**
     * Sets the value of the partialSave property.
     * 
     */
    public void setPartialSave(boolean value) {
        this.partialSave = value;
    }

}
