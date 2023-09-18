
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
 *         &lt;element name="operationResult" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}operationResult" minOccurs="0"/>
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
    UpdateEndorsementServiceResponse.class,
    UpdateApplicationStatusServiceResponse.class,
    GetApplicationDetailServiceResponse.class,
    EnrollRenewalAppServiceResponse.class,
    GetApplicationQAPendingAuthoritiesServiceResponse.class,
    GetEndorsementDetailsServiceResponse.class,
    GetPersonBiometricInfoServiceResponse.class,
    RestoreApplicationServiceResponse.class,
    MarkAsOnHoldApplicationServiceResponse.class,
    GetOldApplicationHistoryResponse.class,
    GetApplicationStatusSummaryServiceResponse.class,
    GetDatabaseLogServiceResponse.class,
    UpdatePaymentInfoServiceResponse.class,
    GetApplicationIdServiceResponse.class,
    GetApplicationStatusHistoryServiceResponse.class,
    SuspendApplicationServiceResponse.class,
    EditApplicationServiceResponse.class,
    ApplicationDetailsEditResponse.class,
    AdjudcationPanelInfoServiceResponse.class,
    SetVipApplicationServiceResponse.class,
    AddEndorsementServiceResponse.class,
    SearchEndorsementServiceResponse.class,
    MarkAsVipApplicationServiceResponse.class,
    EnrollCorrectionTypeApplicationResponse.class,
    AdjudicationPanelInfoResponse.class,
    EnrollVehicleClassAddAppServiceResponse.class,
    EnrollVehicleClassChangeAppServiceResponse.class,
    GetApplicationCountSummaryServiceResponse.class,
    EnrollEndorsementApplicationResponse.class,
    GetEndorsementApplicationServiceResponse.class,
    GetApplicationCountByAuthorityServiceResponse.class,
    GetApplicationCountByStatusServiceResponse.class,
    EnrollDuplicateAppServiceResponse.class,
    EnrollPSVAppServiceResponse.class,
    BiometricDataResponse.class,
    EnrollTypeChangeAppServiceResponse.class
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
