
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestHeader" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}requestHeader" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceRequest", propOrder = {
    "requestHeader"
})
@XmlSeeAlso({
    GetEndorsementApplicationServiceRequest.class,
    EnrollVehicleClassAddAppServiceRequest.class,
    GetApplicationDetailServiceRequest.class,
    GetApplicationStatusHistoryServiceRequest.class,
    GetEndorsementDetailsServiceRequest.class,
    UpdateEndorsementServiceRequest.class,
    UpdateApplicationStatusServiceRequest.class,
    EnrollRenewalAppServiceRequest.class,
    SearchEndorsementServiceRequest.class,
    MarkAsOnHoldApplicationServiceRequest.class,
    ApplicationDetailsEditRequest.class,
    EnrollEndorsementApplicationRequest.class,
    GetApplicationCountByStatusServiceRequest.class,
    AdjudcationPanelInfoServiceRequest.class,
    GetApplicationCountByAuthorityServiceRequest.class,
    GetApplicationIdServiceRequest.class,
    AddEndorsementServiceRequest.class,
    EnrollCorrectionTypeAppRequest.class,
    EnrollDuplicateAppServiceRequest.class,
    GetPersonBiometricInfoServiceRequest.class,
    RestoreApplicationServiceRequest.class,
    GetOldApplicationHistoryRequest.class,
    EnrollVehicleClassChangeAppServiceRequest.class,
    GetApplicationStatusSummaryServiceRequest.class,
    EditApplicationServiceRequest.class,
    GetApplicationQAPendingAuthoritiesServiceRequest.class,
    UpdatePaymentInfoServiceRequest.class,
    SetVipApplicationServiceRequest.class,
    BiometricDataRequest.class,
    GetDatabaseLogServiceRequest.class,
    EnrollPSVAppServiceRequest.class,
    SuspendApplicationServiceRequest.class,
    GetApplicationCountSummaryServiceRequest.class,
    AdjudicationPanelInfoRequest.class,
    MarkAsVipApplicationServiceRequest.class,
    EnrollTypeChangeAppServiceRequest.class
})
public class ServiceRequest {

    protected RequestHeader requestHeader;

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader }
     *     
     */
    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader }
     *     
     */
    public void setRequestHeader(RequestHeader value) {
        this.requestHeader = value;
    }

}
