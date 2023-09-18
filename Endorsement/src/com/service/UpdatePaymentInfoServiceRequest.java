
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updatePaymentInfoServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updatePaymentInfoServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="updatePayment" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}updatePayment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePaymentInfoServiceRequest", propOrder = {
    "updatePayment"
})
public class UpdatePaymentInfoServiceRequest
    extends ServiceRequest
{

    protected UpdatePayment updatePayment;

    /**
     * Gets the value of the updatePayment property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatePayment }
     *     
     */
    public UpdatePayment getUpdatePayment() {
        return updatePayment;
    }

    /**
     * Sets the value of the updatePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatePayment }
     *     
     */
    public void setUpdatePayment(UpdatePayment value) {
        this.updatePayment = value;
    }

}
