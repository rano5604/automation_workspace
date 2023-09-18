
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAppointmentDateServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAppointmentDateServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="appointmentDates" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}appointmentDates" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAppointmentDateServiceResponse", propOrder = {
    "appointmentDates"
})
public class GetAppointmentDateServiceResponse
    extends ServiceResponse
{

    protected AppointmentDates appointmentDates;

    /**
     * Gets the value of the appointmentDates property.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentDates }
     *     
     */
    public AppointmentDates getAppointmentDates() {
        return appointmentDates;
    }

    /**
     * Sets the value of the appointmentDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentDates }
     *     
     */
    public void setAppointmentDates(AppointmentDates value) {
        this.appointmentDates = value;
    }

}
