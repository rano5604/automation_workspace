
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operationResult" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}operationResult" minOccurs="0"/>
 *         &lt;element name="serviceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceResponse", propOrder = {
    "operationResult",
    "serviceDescription",
    "serviceId"
})
@XmlSeeAlso({
    GetEnrolledApplicationResponse.class,
    GetDistrictServiceResponse.class,
    GetNationalityLookupServiceResponse.class,
    GetDlEnrollServiceResponse.class,
    UpdatePaymentStatusServiceResponse.class,
    GetEnrollmentServiceResponse.class,
    SmsSendResponse.class,
    GetLearnerApplicationServiceResponse.class,
    UpdateDLPaymentStatusServiceResponse.class,
    ApplicationUpdateServiceResponse.class,
    GetForeignMissionShortNameResponse.class,
    GetAppointmentDateServiceResponse.class,
    GetForeignMissionServiceResponse.class,
    LoginServiceResponse.class,
    GetLookupServiceResponse.class
})
public class ServiceResponse {

    protected OperationResult operationResult;
    protected String serviceDescription;
    protected Long serviceId;

    /**
     * Gets the value of the operationResult property.
     * 
     * @return
     *     possible object is
     *     {@link OperationResult }
     *     
     */
    public OperationResult getOperationResult() {
        return operationResult;
    }

    /**
     * Sets the value of the operationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationResult }
     *     
     */
    public void setOperationResult(OperationResult value) {
        this.operationResult = value;
    }

    /**
     * Gets the value of the serviceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDescription() {
        return serviceDescription;
    }

    /**
     * Sets the value of the serviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDescription(String value) {
        this.serviceDescription = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServiceId(Long value) {
        this.serviceId = value;
    }

}
