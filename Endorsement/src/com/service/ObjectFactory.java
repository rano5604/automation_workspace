
package com.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EditApplication_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "editApplication");
    private final static QName _SuspendApplication_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "suspendApplication");
    private final static QName _MarkAsOnHoldApplication_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "markAsOnHoldApplication");
    private final static QName _EnrollCorrectionTypeApp_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "enrollCorrectionTypeApp");
    private final static QName _MarkAsOnHoldApplicationResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "markAsOnHoldApplicationResponse");
    private final static QName _SuspendApplicationResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "suspendApplicationResponse");
    private final static QName _EditApplicationResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "editApplicationResponse");
    private final static QName _GetAdjudicationPanelInfo_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getAdjudicationPanelInfo");
    private final static QName _EnrollEndorseAppResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "enrollEndorseAppResponse");
    private final static QName _GetApplicationQAPendingAuthoritiesResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getApplicationQAPendingAuthoritiesResponse");
    private final static QName _AddEndorsementApplicationResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "addEndorsementApplicationResponse");
    private final static QName _EnrollPSVApp_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "enrollPSVApp");
    private final static QName _GetApplicationCountSummary_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getApplicationCountSummary");
    private final static QName _GetApplicationStatusSummaryResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getApplicationStatusSummaryResponse");
    private final static QName _EnrollPSVAppResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "enrollPSVAppResponse");
    private final static QName _GetBiometricDataResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getBiometricDataResponse");
    private final static QName _SearchEndorsementApplicationResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "searchEndorsementApplicationResponse");
    private final static QName _EnrollVehicleClassAddApp_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "enrollVehicleClassAddApp");
    private final static QName _UpdateEndorsementApplication_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "updateEndorsementApplication");
    private final static QName _SetVipApplication_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "setVipApplication");
    private final static QName _GetDatabaseLogsResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getDatabaseLogsResponse");
    private final static QName _GetEndorsementDetails_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getEndorsementDetails");
    private final static QName _GetApplicationStatusHistory_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getApplicationStatusHistory");
    private final static QName _MarkAsVipApplication_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "markAsVipApplication");
    private final static QName _GetInactiveApplicationHistory_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getInactiveApplicationHistory");
    private final static QName _GetPersonBiometricInfo_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getPersonBiometricInfo");
    private final static QName _ViewAdjudicationPanelInfoResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "viewAdjudicationPanelInfoResponse");
    private final static QName _GetApplicationIdResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getApplicationIdResponse");
    private final static QName _ViewAdjudicationPanelInfo_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "viewAdjudicationPanelInfo");
    private final static QName _EnrollTypeChangeApp_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "enrollTypeChangeApp");
    private final static QName _RestoreApplicationResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "restoreApplicationResponse");
    private final static QName _EnrollEndorseApp_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "enrollEndorseApp");
    private final static QName _GetEndorsementDetailsResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getEndorsementDetailsResponse");
    private final static QName _UpdateApplicationStatus_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "updateApplicationStatus");
    private final static QName _EditApplicationDetailsResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "editApplicationDetailsResponse");
    private final static QName _GetApplicationCountSummaryResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getApplicationCountSummaryResponse");
    private final static QName _GetApplicationStatusSummary_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getApplicationStatusSummary");
    private final static QName _UpdatePaymentInfoResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "updatePaymentInfoResponse");
    private final static QName _GetApplicationCountByStatusResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getApplicationCountByStatusResponse");
    private final static QName _MarkAsVipApplicationResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "markAsVipApplicationResponse");
    private final static QName _UpdateApplicationStatusResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "updateApplicationStatusResponse");
    private final static QName _GetAdjudicationPanelInfoResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getAdjudicationPanelInfoResponse");
    private final static QName _GetDatabaseLogs_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getDatabaseLogs");
    private final static QName _GetApplicationCountByAuthorityResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getApplicationCountByAuthorityResponse");
    private final static QName _GetApplicationDetail_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getApplicationDetail");
    private final static QName _GetApplicationId_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getApplicationId");
    private final static QName _GetEndorsementApplication_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getEndorsementApplication");
    private final static QName _GetApplicationQAPendingAuthorities_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getApplicationQAPendingAuthorities");
    private final static QName _EnrollRenewalApp_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "enrollRenewalApp");
    private final static QName _EnrollTypeChangeAppResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "enrollTypeChangeAppResponse");
    private final static QName _GetInactiveApplicationHistoryResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getInactiveApplicationHistoryResponse");
    private final static QName _GetApplicationCountByAuthority_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getApplicationCountByAuthority");
    private final static QName _GetApplicationStatusHistoryResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getApplicationStatusHistoryResponse");
    private final static QName _SearchEndorsementApplication_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "searchEndorsementApplication");
    private final static QName _EditApplicationDetails_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "editApplicationDetails");
    private final static QName _EnrollVehicleClassChangeApp_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "enrollVehicleClassChangeApp");
    private final static QName _GetPersonBiometricInfoResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getPersonBiometricInfoResponse");
    private final static QName _EnrollVehicleClassAddAppResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "enrollVehicleClassAddAppResponse");
    private final static QName _GetApplicationCountByStatus_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getApplicationCountByStatus");
    private final static QName _AddEndorsementApplication_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "addEndorsementApplication");
    private final static QName _EnrollDuplicateApp_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "enrollDuplicateApp");
    private final static QName _UpdateEndorsementApplicationResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "updateEndorsementApplicationResponse");
    private final static QName _UpdatePaymentInfo_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "updatePaymentInfo");
    private final static QName _GetApplicationDetailResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getApplicationDetailResponse");
    private final static QName _EnrollVehicleClassChangeAppResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "enrollVehicleClassChangeAppResponse");
    private final static QName _EnrollCorrectionTypeAppResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "enrollCorrectionTypeAppResponse");
    private final static QName _RestoreApplication_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "restoreApplication");
    private final static QName _GetBiometricData_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getBiometricData");
    private final static QName _SetVipApplicationResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "setVipApplicationResponse");
    private final static QName _GetEndorsementApplicationResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "getEndorsementApplicationResponse");
    private final static QName _EnrollDuplicateAppResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "enrollDuplicateAppResponse");
    private final static QName _EnrollRenewalAppResponse_QNAME = new QName("http://bean.license.ws.service.hsdl.soa.tigerit.com/", "enrollRenewalAppResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnrollPSVAppResponse }
     * 
     */
    public EnrollPSVAppResponse createEnrollPSVAppResponse() {
        return new EnrollPSVAppResponse();
    }

    /**
     * Create an instance of {@link GetBiometricDataResponse }
     * 
     */
    public GetBiometricDataResponse createGetBiometricDataResponse() {
        return new GetBiometricDataResponse();
    }

    /**
     * Create an instance of {@link EnrollVehicleClassAddApp }
     * 
     */
    public EnrollVehicleClassAddApp createEnrollVehicleClassAddApp() {
        return new EnrollVehicleClassAddApp();
    }

    /**
     * Create an instance of {@link SearchEndorsementApplicationResponse }
     * 
     */
    public SearchEndorsementApplicationResponse createSearchEndorsementApplicationResponse() {
        return new SearchEndorsementApplicationResponse();
    }

    /**
     * Create an instance of {@link UpdateEndorsementApplication }
     * 
     */
    public UpdateEndorsementApplication createUpdateEndorsementApplication() {
        return new UpdateEndorsementApplication();
    }

    /**
     * Create an instance of {@link GetApplicationQAPendingAuthoritiesResponse }
     * 
     */
    public GetApplicationQAPendingAuthoritiesResponse createGetApplicationQAPendingAuthoritiesResponse() {
        return new GetApplicationQAPendingAuthoritiesResponse();
    }

    /**
     * Create an instance of {@link AddEndorsementApplicationResponse }
     * 
     */
    public AddEndorsementApplicationResponse createAddEndorsementApplicationResponse() {
        return new AddEndorsementApplicationResponse();
    }

    /**
     * Create an instance of {@link EnrollPSVApp }
     * 
     */
    public EnrollPSVApp createEnrollPSVApp() {
        return new EnrollPSVApp();
    }

    /**
     * Create an instance of {@link GetApplicationStatusSummaryResponse }
     * 
     */
    public GetApplicationStatusSummaryResponse createGetApplicationStatusSummaryResponse() {
        return new GetApplicationStatusSummaryResponse();
    }

    /**
     * Create an instance of {@link GetApplicationCountSummary }
     * 
     */
    public GetApplicationCountSummary createGetApplicationCountSummary() {
        return new GetApplicationCountSummary();
    }

    /**
     * Create an instance of {@link EditApplicationResponse }
     * 
     */
    public EditApplicationResponse createEditApplicationResponse() {
        return new EditApplicationResponse();
    }

    /**
     * Create an instance of {@link GetAdjudicationPanelInfo }
     * 
     */
    public GetAdjudicationPanelInfo createGetAdjudicationPanelInfo() {
        return new GetAdjudicationPanelInfo();
    }

    /**
     * Create an instance of {@link SuspendApplicationResponse }
     * 
     */
    public SuspendApplicationResponse createSuspendApplicationResponse() {
        return new SuspendApplicationResponse();
    }

    /**
     * Create an instance of {@link EnrollEndorseAppResponse }
     * 
     */
    public EnrollEndorseAppResponse createEnrollEndorseAppResponse() {
        return new EnrollEndorseAppResponse();
    }

    /**
     * Create an instance of {@link MarkAsOnHoldApplication }
     * 
     */
    public MarkAsOnHoldApplication createMarkAsOnHoldApplication() {
        return new MarkAsOnHoldApplication();
    }

    /**
     * Create an instance of {@link EditApplication }
     * 
     */
    public EditApplication createEditApplication() {
        return new EditApplication();
    }

    /**
     * Create an instance of {@link SuspendApplication }
     * 
     */
    public SuspendApplication createSuspendApplication() {
        return new SuspendApplication();
    }

    /**
     * Create an instance of {@link MarkAsOnHoldApplicationResponse }
     * 
     */
    public MarkAsOnHoldApplicationResponse createMarkAsOnHoldApplicationResponse() {
        return new MarkAsOnHoldApplicationResponse();
    }

    /**
     * Create an instance of {@link EnrollCorrectionTypeApp }
     * 
     */
    public EnrollCorrectionTypeApp createEnrollCorrectionTypeApp() {
        return new EnrollCorrectionTypeApp();
    }

    /**
     * Create an instance of {@link GetApplicationCountSummaryResponse }
     * 
     */
    public GetApplicationCountSummaryResponse createGetApplicationCountSummaryResponse() {
        return new GetApplicationCountSummaryResponse();
    }

    /**
     * Create an instance of {@link EditApplicationDetailsResponse }
     * 
     */
    public EditApplicationDetailsResponse createEditApplicationDetailsResponse() {
        return new EditApplicationDetailsResponse();
    }

    /**
     * Create an instance of {@link UpdatePaymentInfoResponse }
     * 
     */
    public UpdatePaymentInfoResponse createUpdatePaymentInfoResponse() {
        return new UpdatePaymentInfoResponse();
    }

    /**
     * Create an instance of {@link GetApplicationStatusSummary }
     * 
     */
    public GetApplicationStatusSummary createGetApplicationStatusSummary() {
        return new GetApplicationStatusSummary();
    }

    /**
     * Create an instance of {@link EnrollTypeChangeApp }
     * 
     */
    public EnrollTypeChangeApp createEnrollTypeChangeApp() {
        return new EnrollTypeChangeApp();
    }

    /**
     * Create an instance of {@link RestoreApplicationResponse }
     * 
     */
    public RestoreApplicationResponse createRestoreApplicationResponse() {
        return new RestoreApplicationResponse();
    }

    /**
     * Create an instance of {@link EnrollEndorseApp }
     * 
     */
    public EnrollEndorseApp createEnrollEndorseApp() {
        return new EnrollEndorseApp();
    }

    /**
     * Create an instance of {@link GetEndorsementDetailsResponse }
     * 
     */
    public GetEndorsementDetailsResponse createGetEndorsementDetailsResponse() {
        return new GetEndorsementDetailsResponse();
    }

    /**
     * Create an instance of {@link UpdateApplicationStatus }
     * 
     */
    public UpdateApplicationStatus createUpdateApplicationStatus() {
        return new UpdateApplicationStatus();
    }

    /**
     * Create an instance of {@link GetInactiveApplicationHistory }
     * 
     */
    public GetInactiveApplicationHistory createGetInactiveApplicationHistory() {
        return new GetInactiveApplicationHistory();
    }

    /**
     * Create an instance of {@link ViewAdjudicationPanelInfoResponse }
     * 
     */
    public ViewAdjudicationPanelInfoResponse createViewAdjudicationPanelInfoResponse() {
        return new ViewAdjudicationPanelInfoResponse();
    }

    /**
     * Create an instance of {@link GetPersonBiometricInfo }
     * 
     */
    public GetPersonBiometricInfo createGetPersonBiometricInfo() {
        return new GetPersonBiometricInfo();
    }

    /**
     * Create an instance of {@link GetApplicationIdResponse }
     * 
     */
    public GetApplicationIdResponse createGetApplicationIdResponse() {
        return new GetApplicationIdResponse();
    }

    /**
     * Create an instance of {@link ViewAdjudicationPanelInfo }
     * 
     */
    public ViewAdjudicationPanelInfo createViewAdjudicationPanelInfo() {
        return new ViewAdjudicationPanelInfo();
    }

    /**
     * Create an instance of {@link GetDatabaseLogsResponse }
     * 
     */
    public GetDatabaseLogsResponse createGetDatabaseLogsResponse() {
        return new GetDatabaseLogsResponse();
    }

    /**
     * Create an instance of {@link SetVipApplication }
     * 
     */
    public SetVipApplication createSetVipApplication() {
        return new SetVipApplication();
    }

    /**
     * Create an instance of {@link GetEndorsementDetails }
     * 
     */
    public GetEndorsementDetails createGetEndorsementDetails() {
        return new GetEndorsementDetails();
    }

    /**
     * Create an instance of {@link GetApplicationStatusHistory }
     * 
     */
    public GetApplicationStatusHistory createGetApplicationStatusHistory() {
        return new GetApplicationStatusHistory();
    }

    /**
     * Create an instance of {@link MarkAsVipApplication }
     * 
     */
    public MarkAsVipApplication createMarkAsVipApplication() {
        return new MarkAsVipApplication();
    }

    /**
     * Create an instance of {@link GetApplicationId }
     * 
     */
    public GetApplicationId createGetApplicationId() {
        return new GetApplicationId();
    }

    /**
     * Create an instance of {@link GetEndorsementApplication }
     * 
     */
    public GetEndorsementApplication createGetEndorsementApplication() {
        return new GetEndorsementApplication();
    }

    /**
     * Create an instance of {@link EnrollRenewalApp }
     * 
     */
    public EnrollRenewalApp createEnrollRenewalApp() {
        return new EnrollRenewalApp();
    }

    /**
     * Create an instance of {@link GetApplicationQAPendingAuthorities }
     * 
     */
    public GetApplicationQAPendingAuthorities createGetApplicationQAPendingAuthorities() {
        return new GetApplicationQAPendingAuthorities();
    }

    /**
     * Create an instance of {@link EnrollTypeChangeAppResponse }
     * 
     */
    public EnrollTypeChangeAppResponse createEnrollTypeChangeAppResponse() {
        return new EnrollTypeChangeAppResponse();
    }

    /**
     * Create an instance of {@link GetInactiveApplicationHistoryResponse }
     * 
     */
    public GetInactiveApplicationHistoryResponse createGetInactiveApplicationHistoryResponse() {
        return new GetInactiveApplicationHistoryResponse();
    }

    /**
     * Create an instance of {@link GetApplicationCountByAuthorityResponse }
     * 
     */
    public GetApplicationCountByAuthorityResponse createGetApplicationCountByAuthorityResponse() {
        return new GetApplicationCountByAuthorityResponse();
    }

    /**
     * Create an instance of {@link GetApplicationDetail }
     * 
     */
    public GetApplicationDetail createGetApplicationDetail() {
        return new GetApplicationDetail();
    }

    /**
     * Create an instance of {@link GetDatabaseLogs }
     * 
     */
    public GetDatabaseLogs createGetDatabaseLogs() {
        return new GetDatabaseLogs();
    }

    /**
     * Create an instance of {@link GetApplicationCountByStatusResponse }
     * 
     */
    public GetApplicationCountByStatusResponse createGetApplicationCountByStatusResponse() {
        return new GetApplicationCountByStatusResponse();
    }

    /**
     * Create an instance of {@link MarkAsVipApplicationResponse }
     * 
     */
    public MarkAsVipApplicationResponse createMarkAsVipApplicationResponse() {
        return new MarkAsVipApplicationResponse();
    }

    /**
     * Create an instance of {@link GetAdjudicationPanelInfoResponse }
     * 
     */
    public GetAdjudicationPanelInfoResponse createGetAdjudicationPanelInfoResponse() {
        return new GetAdjudicationPanelInfoResponse();
    }

    /**
     * Create an instance of {@link UpdateApplicationStatusResponse }
     * 
     */
    public UpdateApplicationStatusResponse createUpdateApplicationStatusResponse() {
        return new UpdateApplicationStatusResponse();
    }

    /**
     * Create an instance of {@link GetEndorsementApplicationResponse }
     * 
     */
    public GetEndorsementApplicationResponse createGetEndorsementApplicationResponse() {
        return new GetEndorsementApplicationResponse();
    }

    /**
     * Create an instance of {@link SetVipApplicationResponse }
     * 
     */
    public SetVipApplicationResponse createSetVipApplicationResponse() {
        return new SetVipApplicationResponse();
    }

    /**
     * Create an instance of {@link EnrollDuplicateAppResponse }
     * 
     */
    public EnrollDuplicateAppResponse createEnrollDuplicateAppResponse() {
        return new EnrollDuplicateAppResponse();
    }

    /**
     * Create an instance of {@link EnrollRenewalAppResponse }
     * 
     */
    public EnrollRenewalAppResponse createEnrollRenewalAppResponse() {
        return new EnrollRenewalAppResponse();
    }

    /**
     * Create an instance of {@link GetBiometricData }
     * 
     */
    public GetBiometricData createGetBiometricData() {
        return new GetBiometricData();
    }

    /**
     * Create an instance of {@link UpdateEndorsementApplicationResponse }
     * 
     */
    public UpdateEndorsementApplicationResponse createUpdateEndorsementApplicationResponse() {
        return new UpdateEndorsementApplicationResponse();
    }

    /**
     * Create an instance of {@link UpdatePaymentInfo }
     * 
     */
    public UpdatePaymentInfo createUpdatePaymentInfo() {
        return new UpdatePaymentInfo();
    }

    /**
     * Create an instance of {@link EnrollDuplicateApp }
     * 
     */
    public EnrollDuplicateApp createEnrollDuplicateApp() {
        return new EnrollDuplicateApp();
    }

    /**
     * Create an instance of {@link EnrollVehicleClassChangeAppResponse }
     * 
     */
    public EnrollVehicleClassChangeAppResponse createEnrollVehicleClassChangeAppResponse() {
        return new EnrollVehicleClassChangeAppResponse();
    }

    /**
     * Create an instance of {@link GetApplicationDetailResponse }
     * 
     */
    public GetApplicationDetailResponse createGetApplicationDetailResponse() {
        return new GetApplicationDetailResponse();
    }

    /**
     * Create an instance of {@link EnrollCorrectionTypeAppResponse }
     * 
     */
    public EnrollCorrectionTypeAppResponse createEnrollCorrectionTypeAppResponse() {
        return new EnrollCorrectionTypeAppResponse();
    }

    /**
     * Create an instance of {@link RestoreApplication }
     * 
     */
    public RestoreApplication createRestoreApplication() {
        return new RestoreApplication();
    }

    /**
     * Create an instance of {@link GetApplicationStatusHistoryResponse }
     * 
     */
    public GetApplicationStatusHistoryResponse createGetApplicationStatusHistoryResponse() {
        return new GetApplicationStatusHistoryResponse();
    }

    /**
     * Create an instance of {@link SearchEndorsementApplication }
     * 
     */
    public SearchEndorsementApplication createSearchEndorsementApplication() {
        return new SearchEndorsementApplication();
    }

    /**
     * Create an instance of {@link GetApplicationCountByAuthority }
     * 
     */
    public GetApplicationCountByAuthority createGetApplicationCountByAuthority() {
        return new GetApplicationCountByAuthority();
    }

    /**
     * Create an instance of {@link GetPersonBiometricInfoResponse }
     * 
     */
    public GetPersonBiometricInfoResponse createGetPersonBiometricInfoResponse() {
        return new GetPersonBiometricInfoResponse();
    }

    /**
     * Create an instance of {@link EditApplicationDetails }
     * 
     */
    public EditApplicationDetails createEditApplicationDetails() {
        return new EditApplicationDetails();
    }

    /**
     * Create an instance of {@link EnrollVehicleClassChangeApp }
     * 
     */
    public EnrollVehicleClassChangeApp createEnrollVehicleClassChangeApp() {
        return new EnrollVehicleClassChangeApp();
    }

    /**
     * Create an instance of {@link AddEndorsementApplication }
     * 
     */
    public AddEndorsementApplication createAddEndorsementApplication() {
        return new AddEndorsementApplication();
    }

    /**
     * Create an instance of {@link EnrollVehicleClassAddAppResponse }
     * 
     */
    public EnrollVehicleClassAddAppResponse createEnrollVehicleClassAddAppResponse() {
        return new EnrollVehicleClassAddAppResponse();
    }

    /**
     * Create an instance of {@link GetApplicationCountByStatus }
     * 
     */
    public GetApplicationCountByStatus createGetApplicationCountByStatus() {
        return new GetApplicationCountByStatus();
    }

    /**
     * Create an instance of {@link GetEndorsementApplicationServiceRequest }
     * 
     */
    public GetEndorsementApplicationServiceRequest createGetEndorsementApplicationServiceRequest() {
        return new GetEndorsementApplicationServiceRequest();
    }

    /**
     * Create an instance of {@link UpdateEndorsementServiceResponse }
     * 
     */
    public UpdateEndorsementServiceResponse createUpdateEndorsementServiceResponse() {
        return new UpdateEndorsementServiceResponse();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link EnrollVehicleClassAddAppServiceRequest }
     * 
     */
    public EnrollVehicleClassAddAppServiceRequest createEnrollVehicleClassAddAppServiceRequest() {
        return new EnrollVehicleClassAddAppServiceRequest();
    }

    /**
     * Create an instance of {@link UpdatePayment }
     * 
     */
    public UpdatePayment createUpdatePayment() {
        return new UpdatePayment();
    }

    /**
     * Create an instance of {@link GetApplicationDetailServiceRequest }
     * 
     */
    public GetApplicationDetailServiceRequest createGetApplicationDetailServiceRequest() {
        return new GetApplicationDetailServiceRequest();
    }

    /**
     * Create an instance of {@link EndorsementDetails }
     * 
     */
    public EndorsementDetails createEndorsementDetails() {
        return new EndorsementDetails();
    }

    /**
     * Create an instance of {@link AdjudicationPanelInfo }
     * 
     */
    public AdjudicationPanelInfo createAdjudicationPanelInfo() {
        return new AdjudicationPanelInfo();
    }

    /**
     * Create an instance of {@link UpdateApplicationStatusServiceResponse }
     * 
     */
    public UpdateApplicationStatusServiceResponse createUpdateApplicationStatusServiceResponse() {
        return new UpdateApplicationStatusServiceResponse();
    }

    /**
     * Create an instance of {@link GetApplicationDetailServiceResponse }
     * 
     */
    public GetApplicationDetailServiceResponse createGetApplicationDetailServiceResponse() {
        return new GetApplicationDetailServiceResponse();
    }

    /**
     * Create an instance of {@link EnrollApplication }
     * 
     */
    public EnrollApplication createEnrollApplication() {
        return new EnrollApplication();
    }

    /**
     * Create an instance of {@link EnrollRenewalAppServiceResponse }
     * 
     */
    public EnrollRenewalAppServiceResponse createEnrollRenewalAppServiceResponse() {
        return new EnrollRenewalAppServiceResponse();
    }

    /**
     * Create an instance of {@link GetApplicationStatusHistoryServiceRequest }
     * 
     */
    public GetApplicationStatusHistoryServiceRequest createGetApplicationStatusHistoryServiceRequest() {
        return new GetApplicationStatusHistoryServiceRequest();
    }

    /**
     * Create an instance of {@link GetEndorsementDetailsServiceRequest }
     * 
     */
    public GetEndorsementDetailsServiceRequest createGetEndorsementDetailsServiceRequest() {
        return new GetEndorsementDetailsServiceRequest();
    }

    /**
     * Create an instance of {@link GetApplicationQAPendingAuthoritiesServiceResponse }
     * 
     */
    public GetApplicationQAPendingAuthoritiesServiceResponse createGetApplicationQAPendingAuthoritiesServiceResponse() {
        return new GetApplicationQAPendingAuthoritiesServiceResponse();
    }

    /**
     * Create an instance of {@link GetEndorsementDetailsServiceResponse }
     * 
     */
    public GetEndorsementDetailsServiceResponse createGetEndorsementDetailsServiceResponse() {
        return new GetEndorsementDetailsServiceResponse();
    }

    /**
     * Create an instance of {@link UpdateEndorsementServiceRequest }
     * 
     */
    public UpdateEndorsementServiceRequest createUpdateEndorsementServiceRequest() {
        return new UpdateEndorsementServiceRequest();
    }

    /**
     * Create an instance of {@link UpdateApplicationStatusServiceRequest }
     * 
     */
    public UpdateApplicationStatusServiceRequest createUpdateApplicationStatusServiceRequest() {
        return new UpdateApplicationStatusServiceRequest();
    }

    /**
     * Create an instance of {@link ApplicationStatusHistoryCriteria }
     * 
     */
    public ApplicationStatusHistoryCriteria createApplicationStatusHistoryCriteria() {
        return new ApplicationStatusHistoryCriteria();
    }

    /**
     * Create an instance of {@link GetPersonBiometricInfoServiceResponse }
     * 
     */
    public GetPersonBiometricInfoServiceResponse createGetPersonBiometricInfoServiceResponse() {
        return new GetPersonBiometricInfoServiceResponse();
    }

    /**
     * Create an instance of {@link EnrollRenewalAppServiceRequest }
     * 
     */
    public EnrollRenewalAppServiceRequest createEnrollRenewalAppServiceRequest() {
        return new EnrollRenewalAppServiceRequest();
    }

    /**
     * Create an instance of {@link RestoreApplicationServiceResponse }
     * 
     */
    public RestoreApplicationServiceResponse createRestoreApplicationServiceResponse() {
        return new RestoreApplicationServiceResponse();
    }

    /**
     * Create an instance of {@link SearchEndorsementServiceRequest }
     * 
     */
    public SearchEndorsementServiceRequest createSearchEndorsementServiceRequest() {
        return new SearchEndorsementServiceRequest();
    }

    /**
     * Create an instance of {@link MarkAsOnHoldApplicationServiceResponse }
     * 
     */
    public MarkAsOnHoldApplicationServiceResponse createMarkAsOnHoldApplicationServiceResponse() {
        return new MarkAsOnHoldApplicationServiceResponse();
    }

    /**
     * Create an instance of {@link ApplicationStatusHistory }
     * 
     */
    public ApplicationStatusHistory createApplicationStatusHistory() {
        return new ApplicationStatusHistory();
    }

    /**
     * Create an instance of {@link GetOldApplicationHistoryResponse }
     * 
     */
    public GetOldApplicationHistoryResponse createGetOldApplicationHistoryResponse() {
        return new GetOldApplicationHistoryResponse();
    }

    /**
     * Create an instance of {@link MarkAsOnHoldApplicationServiceRequest }
     * 
     */
    public MarkAsOnHoldApplicationServiceRequest createMarkAsOnHoldApplicationServiceRequest() {
        return new MarkAsOnHoldApplicationServiceRequest();
    }

    /**
     * Create an instance of {@link ForeignAddress }
     * 
     */
    public ForeignAddress createForeignAddress() {
        return new ForeignAddress();
    }

    /**
     * Create an instance of {@link GetApplicationStatusSummaryServiceResponse }
     * 
     */
    public GetApplicationStatusSummaryServiceResponse createGetApplicationStatusSummaryServiceResponse() {
        return new GetApplicationStatusSummaryServiceResponse();
    }

    /**
     * Create an instance of {@link ApplicationDetailsEditRequest }
     * 
     */
    public ApplicationDetailsEditRequest createApplicationDetailsEditRequest() {
        return new ApplicationDetailsEditRequest();
    }

    /**
     * Create an instance of {@link GetDatabaseLogServiceResponse }
     * 
     */
    public GetDatabaseLogServiceResponse createGetDatabaseLogServiceResponse() {
        return new GetDatabaseLogServiceResponse();
    }

    /**
     * Create an instance of {@link EnrollEndorsementApplicationRequest }
     * 
     */
    public EnrollEndorsementApplicationRequest createEnrollEndorsementApplicationRequest() {
        return new EnrollEndorsementApplicationRequest();
    }

    /**
     * Create an instance of {@link UpdatePaymentInfoServiceResponse }
     * 
     */
    public UpdatePaymentInfoServiceResponse createUpdatePaymentInfoServiceResponse() {
        return new UpdatePaymentInfoServiceResponse();
    }

    /**
     * Create an instance of {@link GetApplicationCountByStatusServiceRequest }
     * 
     */
    public GetApplicationCountByStatusServiceRequest createGetApplicationCountByStatusServiceRequest() {
        return new GetApplicationCountByStatusServiceRequest();
    }

    /**
     * Create an instance of {@link AdjudcationPanelInfoServiceRequest }
     * 
     */
    public AdjudcationPanelInfoServiceRequest createAdjudcationPanelInfoServiceRequest() {
        return new AdjudcationPanelInfoServiceRequest();
    }

    /**
     * Create an instance of {@link GetApplicationIdServiceResponse }
     * 
     */
    public GetApplicationIdServiceResponse createGetApplicationIdServiceResponse() {
        return new GetApplicationIdServiceResponse();
    }

    /**
     * Create an instance of {@link GetApplicationCountByAuthorityServiceRequest }
     * 
     */
    public GetApplicationCountByAuthorityServiceRequest createGetApplicationCountByAuthorityServiceRequest() {
        return new GetApplicationCountByAuthorityServiceRequest();
    }

    /**
     * Create an instance of {@link GetApplicationIdServiceRequest }
     * 
     */
    public GetApplicationIdServiceRequest createGetApplicationIdServiceRequest() {
        return new GetApplicationIdServiceRequest();
    }

    /**
     * Create an instance of {@link GetApplicationStatusHistoryServiceResponse }
     * 
     */
    public GetApplicationStatusHistoryServiceResponse createGetApplicationStatusHistoryServiceResponse() {
        return new GetApplicationStatusHistoryServiceResponse();
    }

    /**
     * Create an instance of {@link ServiceError }
     * 
     */
    public ServiceError createServiceError() {
        return new ServiceError();
    }

    /**
     * Create an instance of {@link SuspendApplicationServiceResponse }
     * 
     */
    public SuspendApplicationServiceResponse createSuspendApplicationServiceResponse() {
        return new SuspendApplicationServiceResponse();
    }

    /**
     * Create an instance of {@link EditApplicationServiceResponse }
     * 
     */
    public EditApplicationServiceResponse createEditApplicationServiceResponse() {
        return new EditApplicationServiceResponse();
    }

    /**
     * Create an instance of {@link OperationResult }
     * 
     */
    public OperationResult createOperationResult() {
        return new OperationResult();
    }

    /**
     * Create an instance of {@link ApplicationDetailsEditResponse }
     * 
     */
    public ApplicationDetailsEditResponse createApplicationDetailsEditResponse() {
        return new ApplicationDetailsEditResponse();
    }

    /**
     * Create an instance of {@link AddEndorsementServiceRequest }
     * 
     */
    public AddEndorsementServiceRequest createAddEndorsementServiceRequest() {
        return new AddEndorsementServiceRequest();
    }

    /**
     * Create an instance of {@link AppCountByAuthority }
     * 
     */
    public AppCountByAuthority createAppCountByAuthority() {
        return new AppCountByAuthority();
    }

    /**
     * Create an instance of {@link AdjudcationPanelInfoServiceResponse }
     * 
     */
    public AdjudcationPanelInfoServiceResponse createAdjudcationPanelInfoServiceResponse() {
        return new AdjudcationPanelInfoServiceResponse();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link DatabaseLog }
     * 
     */
    public DatabaseLog createDatabaseLog() {
        return new DatabaseLog();
    }

    /**
     * Create an instance of {@link StatusCount }
     * 
     */
    public StatusCount createStatusCount() {
        return new StatusCount();
    }

    /**
     * Create an instance of {@link EnrollCorrectionTypeAppRequest }
     * 
     */
    public EnrollCorrectionTypeAppRequest createEnrollCorrectionTypeAppRequest() {
        return new EnrollCorrectionTypeAppRequest();
    }

    /**
     * Create an instance of {@link EnrollDuplicateAppServiceRequest }
     * 
     */
    public EnrollDuplicateAppServiceRequest createEnrollDuplicateAppServiceRequest() {
        return new EnrollDuplicateAppServiceRequest();
    }

    /**
     * Create an instance of {@link GetPersonBiometricInfoServiceRequest }
     * 
     */
    public GetPersonBiometricInfoServiceRequest createGetPersonBiometricInfoServiceRequest() {
        return new GetPersonBiometricInfoServiceRequest();
    }

    /**
     * Create an instance of {@link SetVipApplicationServiceResponse }
     * 
     */
    public SetVipApplicationServiceResponse createSetVipApplicationServiceResponse() {
        return new SetVipApplicationServiceResponse();
    }

    /**
     * Create an instance of {@link EndorsementApplication }
     * 
     */
    public EndorsementApplication createEndorsementApplication() {
        return new EndorsementApplication();
    }

    /**
     * Create an instance of {@link AddEndorsementServiceResponse }
     * 
     */
    public AddEndorsementServiceResponse createAddEndorsementServiceResponse() {
        return new AddEndorsementServiceResponse();
    }

    /**
     * Create an instance of {@link AppCountByStatus }
     * 
     */
    public AppCountByStatus createAppCountByStatus() {
        return new AppCountByStatus();
    }

    /**
     * Create an instance of {@link AttachedDoc }
     * 
     */
    public AttachedDoc createAttachedDoc() {
        return new AttachedDoc();
    }

    /**
     * Create an instance of {@link EndorsementSearchCriteria }
     * 
     */
    public EndorsementSearchCriteria createEndorsementSearchCriteria() {
        return new EndorsementSearchCriteria();
    }

    /**
     * Create an instance of {@link RestoreApplicationServiceRequest }
     * 
     */
    public RestoreApplicationServiceRequest createRestoreApplicationServiceRequest() {
        return new RestoreApplicationServiceRequest();
    }

    /**
     * Create an instance of {@link ApplicationCorrectionTypes }
     * 
     */
    public ApplicationCorrectionTypes createApplicationCorrectionTypes() {
        return new ApplicationCorrectionTypes();
    }

    /**
     * Create an instance of {@link SearchEndorsementServiceResponse }
     * 
     */
    public SearchEndorsementServiceResponse createSearchEndorsementServiceResponse() {
        return new SearchEndorsementServiceResponse();
    }

    /**
     * Create an instance of {@link GetOldApplicationHistoryRequest }
     * 
     */
    public GetOldApplicationHistoryRequest createGetOldApplicationHistoryRequest() {
        return new GetOldApplicationHistoryRequest();
    }

    /**
     * Create an instance of {@link EnrollVehicleClassChangeAppServiceRequest }
     * 
     */
    public EnrollVehicleClassChangeAppServiceRequest createEnrollVehicleClassChangeAppServiceRequest() {
        return new EnrollVehicleClassChangeAppServiceRequest();
    }

    /**
     * Create an instance of {@link MarkAsVipApplicationServiceResponse }
     * 
     */
    public MarkAsVipApplicationServiceResponse createMarkAsVipApplicationServiceResponse() {
        return new MarkAsVipApplicationServiceResponse();
    }

    /**
     * Create an instance of {@link Endorsement }
     * 
     */
    public Endorsement createEndorsement() {
        return new Endorsement();
    }

    /**
     * Create an instance of {@link EnrollCorrectionTypeApplicationResponse }
     * 
     */
    public EnrollCorrectionTypeApplicationResponse createEnrollCorrectionTypeApplicationResponse() {
        return new EnrollCorrectionTypeApplicationResponse();
    }

    /**
     * Create an instance of {@link AdjudicationPanelInfoResponse }
     * 
     */
    public AdjudicationPanelInfoResponse createAdjudicationPanelInfoResponse() {
        return new AdjudicationPanelInfoResponse();
    }

    /**
     * Create an instance of {@link EnrollVehicleClassAddAppServiceResponse }
     * 
     */
    public EnrollVehicleClassAddAppServiceResponse createEnrollVehicleClassAddAppServiceResponse() {
        return new EnrollVehicleClassAddAppServiceResponse();
    }

    /**
     * Create an instance of {@link EnrollVehicleClassChangeAppServiceResponse }
     * 
     */
    public EnrollVehicleClassChangeAppServiceResponse createEnrollVehicleClassChangeAppServiceResponse() {
        return new EnrollVehicleClassChangeAppServiceResponse();
    }

    /**
     * Create an instance of {@link GetApplicationCountSummaryServiceResponse }
     * 
     */
    public GetApplicationCountSummaryServiceResponse createGetApplicationCountSummaryServiceResponse() {
        return new GetApplicationCountSummaryServiceResponse();
    }

    /**
     * Create an instance of {@link GetApplicationStatusSummaryServiceRequest }
     * 
     */
    public GetApplicationStatusSummaryServiceRequest createGetApplicationStatusSummaryServiceRequest() {
        return new GetApplicationStatusSummaryServiceRequest();
    }

    /**
     * Create an instance of {@link EnrollEndorsementApplicationResponse }
     * 
     */
    public EnrollEndorsementApplicationResponse createEnrollEndorsementApplicationResponse() {
        return new EnrollEndorsementApplicationResponse();
    }

    /**
     * Create an instance of {@link AppStatusSummary }
     * 
     */
    public AppStatusSummary createAppStatusSummary() {
        return new AppStatusSummary();
    }

    /**
     * Create an instance of {@link EditApplicationServiceRequest }
     * 
     */
    public EditApplicationServiceRequest createEditApplicationServiceRequest() {
        return new EditApplicationServiceRequest();
    }

    /**
     * Create an instance of {@link GetApplicationQAPendingAuthoritiesServiceRequest }
     * 
     */
    public GetApplicationQAPendingAuthoritiesServiceRequest createGetApplicationQAPendingAuthoritiesServiceRequest() {
        return new GetApplicationQAPendingAuthoritiesServiceRequest();
    }

    /**
     * Create an instance of {@link GetEndorsementApplicationServiceResponse }
     * 
     */
    public GetEndorsementApplicationServiceResponse createGetEndorsementApplicationServiceResponse() {
        return new GetEndorsementApplicationServiceResponse();
    }

    /**
     * Create an instance of {@link ApplicationRemark }
     * 
     */
    public ApplicationRemark createApplicationRemark() {
        return new ApplicationRemark();
    }

    /**
     * Create an instance of {@link Biometric }
     * 
     */
    public Biometric createBiometric() {
        return new Biometric();
    }

    /**
     * Create an instance of {@link ServiceWarning }
     * 
     */
    public ServiceWarning createServiceWarning() {
        return new ServiceWarning();
    }

    /**
     * Create an instance of {@link UpdatePaymentInfoServiceRequest }
     * 
     */
    public UpdatePaymentInfoServiceRequest createUpdatePaymentInfoServiceRequest() {
        return new UpdatePaymentInfoServiceRequest();
    }

    /**
     * Create an instance of {@link GetApplicationCountByAuthorityServiceResponse }
     * 
     */
    public GetApplicationCountByAuthorityServiceResponse createGetApplicationCountByAuthorityServiceResponse() {
        return new GetApplicationCountByAuthorityServiceResponse();
    }

    /**
     * Create an instance of {@link SetVipApplicationServiceRequest }
     * 
     */
    public SetVipApplicationServiceRequest createSetVipApplicationServiceRequest() {
        return new SetVipApplicationServiceRequest();
    }

    /**
     * Create an instance of {@link BiometricDataRequest }
     * 
     */
    public BiometricDataRequest createBiometricDataRequest() {
        return new BiometricDataRequest();
    }

    /**
     * Create an instance of {@link GetApplicationCountByStatusServiceResponse }
     * 
     */
    public GetApplicationCountByStatusServiceResponse createGetApplicationCountByStatusServiceResponse() {
        return new GetApplicationCountByStatusServiceResponse();
    }

    /**
     * Create an instance of {@link GetDatabaseLogServiceRequest }
     * 
     */
    public GetDatabaseLogServiceRequest createGetDatabaseLogServiceRequest() {
        return new GetDatabaseLogServiceRequest();
    }

    /**
     * Create an instance of {@link BrtaOffice }
     * 
     */
    public BrtaOffice createBrtaOffice() {
        return new BrtaOffice();
    }

    /**
     * Create an instance of {@link ApplicationSummary }
     * 
     */
    public ApplicationSummary createApplicationSummary() {
        return new ApplicationSummary();
    }

    /**
     * Create an instance of {@link EnrollPSVAppServiceRequest }
     * 
     */
    public EnrollPSVAppServiceRequest createEnrollPSVAppServiceRequest() {
        return new EnrollPSVAppServiceRequest();
    }

    /**
     * Create an instance of {@link SuspendApplicationServiceRequest }
     * 
     */
    public SuspendApplicationServiceRequest createSuspendApplicationServiceRequest() {
        return new SuspendApplicationServiceRequest();
    }

    /**
     * Create an instance of {@link GetApplicationCountSummaryServiceRequest }
     * 
     */
    public GetApplicationCountSummaryServiceRequest createGetApplicationCountSummaryServiceRequest() {
        return new GetApplicationCountSummaryServiceRequest();
    }

    /**
     * Create an instance of {@link AdjudicationPanelInfoRequest }
     * 
     */
    public AdjudicationPanelInfoRequest createAdjudicationPanelInfoRequest() {
        return new AdjudicationPanelInfoRequest();
    }

    /**
     * Create an instance of {@link LicenseHistory }
     * 
     */
    public LicenseHistory createLicenseHistory() {
        return new LicenseHistory();
    }

    /**
     * Create an instance of {@link MarkAsVipApplicationServiceRequest }
     * 
     */
    public MarkAsVipApplicationServiceRequest createMarkAsVipApplicationServiceRequest() {
        return new MarkAsVipApplicationServiceRequest();
    }

    /**
     * Create an instance of {@link PersonInfo }
     * 
     */
    public PersonInfo createPersonInfo() {
        return new PersonInfo();
    }

    /**
     * Create an instance of {@link ApplicationDetailsCorrection }
     * 
     */
    public ApplicationDetailsCorrection createApplicationDetailsCorrection() {
        return new ApplicationDetailsCorrection();
    }

    /**
     * Create an instance of {@link EnrollDuplicateAppServiceResponse }
     * 
     */
    public EnrollDuplicateAppServiceResponse createEnrollDuplicateAppServiceResponse() {
        return new EnrollDuplicateAppServiceResponse();
    }

    /**
     * Create an instance of {@link EnrollPSVAppServiceResponse }
     * 
     */
    public EnrollPSVAppServiceResponse createEnrollPSVAppServiceResponse() {
        return new EnrollPSVAppServiceResponse();
    }

    /**
     * Create an instance of {@link ServiceRequest }
     * 
     */
    public ServiceRequest createServiceRequest() {
        return new ServiceRequest();
    }

    /**
     * Create an instance of {@link ApplicationHistoryDetails }
     * 
     */
    public ApplicationHistoryDetails createApplicationHistoryDetails() {
        return new ApplicationHistoryDetails();
    }

    /**
     * Create an instance of {@link ApplicationSubType }
     * 
     */
    public ApplicationSubType createApplicationSubType() {
        return new ApplicationSubType();
    }

    /**
     * Create an instance of {@link DatabaseLogSearchCriteria }
     * 
     */
    public DatabaseLogSearchCriteria createDatabaseLogSearchCriteria() {
        return new DatabaseLogSearchCriteria();
    }

    /**
     * Create an instance of {@link BiometricDataResponse }
     * 
     */
    public BiometricDataResponse createBiometricDataResponse() {
        return new BiometricDataResponse();
    }

    /**
     * Create an instance of {@link ApplicationInfoEdit }
     * 
     */
    public ApplicationInfoEdit createApplicationInfoEdit() {
        return new ApplicationInfoEdit();
    }

    /**
     * Create an instance of {@link EnrollTypeChangeAppServiceRequest }
     * 
     */
    public EnrollTypeChangeAppServiceRequest createEnrollTypeChangeAppServiceRequest() {
        return new EnrollTypeChangeAppServiceRequest();
    }

    /**
     * Create an instance of {@link ApplicationVehicleClass }
     * 
     */
    public ApplicationVehicleClass createApplicationVehicleClass() {
        return new ApplicationVehicleClass();
    }

    /**
     * Create an instance of {@link Application }
     * 
     */
    public Application createApplication() {
        return new Application();
    }

    /**
     * Create an instance of {@link ApplicationDetails }
     * 
     */
    public ApplicationDetails createApplicationDetails() {
        return new ApplicationDetails();
    }

    /**
     * Create an instance of {@link RequestHeader }
     * 
     */
    public RequestHeader createRequestHeader() {
        return new RequestHeader();
    }

    /**
     * Create an instance of {@link EnrollTypeChangeAppServiceResponse }
     * 
     */
    public EnrollTypeChangeAppServiceResponse createEnrollTypeChangeAppServiceResponse() {
        return new EnrollTypeChangeAppServiceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditApplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "editApplication")
    public JAXBElement<EditApplication> createEditApplication(EditApplication value) {
        return new JAXBElement<EditApplication>(_EditApplication_QNAME, EditApplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuspendApplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "suspendApplication")
    public JAXBElement<SuspendApplication> createSuspendApplication(SuspendApplication value) {
        return new JAXBElement<SuspendApplication>(_SuspendApplication_QNAME, SuspendApplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkAsOnHoldApplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "markAsOnHoldApplication")
    public JAXBElement<MarkAsOnHoldApplication> createMarkAsOnHoldApplication(MarkAsOnHoldApplication value) {
        return new JAXBElement<MarkAsOnHoldApplication>(_MarkAsOnHoldApplication_QNAME, MarkAsOnHoldApplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrollCorrectionTypeApp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "enrollCorrectionTypeApp")
    public JAXBElement<EnrollCorrectionTypeApp> createEnrollCorrectionTypeApp(EnrollCorrectionTypeApp value) {
        return new JAXBElement<EnrollCorrectionTypeApp>(_EnrollCorrectionTypeApp_QNAME, EnrollCorrectionTypeApp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkAsOnHoldApplicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "markAsOnHoldApplicationResponse")
    public JAXBElement<MarkAsOnHoldApplicationResponse> createMarkAsOnHoldApplicationResponse(MarkAsOnHoldApplicationResponse value) {
        return new JAXBElement<MarkAsOnHoldApplicationResponse>(_MarkAsOnHoldApplicationResponse_QNAME, MarkAsOnHoldApplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuspendApplicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "suspendApplicationResponse")
    public JAXBElement<SuspendApplicationResponse> createSuspendApplicationResponse(SuspendApplicationResponse value) {
        return new JAXBElement<SuspendApplicationResponse>(_SuspendApplicationResponse_QNAME, SuspendApplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditApplicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "editApplicationResponse")
    public JAXBElement<EditApplicationResponse> createEditApplicationResponse(EditApplicationResponse value) {
        return new JAXBElement<EditApplicationResponse>(_EditApplicationResponse_QNAME, EditApplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdjudicationPanelInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getAdjudicationPanelInfo")
    public JAXBElement<GetAdjudicationPanelInfo> createGetAdjudicationPanelInfo(GetAdjudicationPanelInfo value) {
        return new JAXBElement<GetAdjudicationPanelInfo>(_GetAdjudicationPanelInfo_QNAME, GetAdjudicationPanelInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrollEndorseAppResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "enrollEndorseAppResponse")
    public JAXBElement<EnrollEndorseAppResponse> createEnrollEndorseAppResponse(EnrollEndorseAppResponse value) {
        return new JAXBElement<EnrollEndorseAppResponse>(_EnrollEndorseAppResponse_QNAME, EnrollEndorseAppResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationQAPendingAuthoritiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getApplicationQAPendingAuthoritiesResponse")
    public JAXBElement<GetApplicationQAPendingAuthoritiesResponse> createGetApplicationQAPendingAuthoritiesResponse(GetApplicationQAPendingAuthoritiesResponse value) {
        return new JAXBElement<GetApplicationQAPendingAuthoritiesResponse>(_GetApplicationQAPendingAuthoritiesResponse_QNAME, GetApplicationQAPendingAuthoritiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEndorsementApplicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "addEndorsementApplicationResponse")
    public JAXBElement<AddEndorsementApplicationResponse> createAddEndorsementApplicationResponse(AddEndorsementApplicationResponse value) {
        return new JAXBElement<AddEndorsementApplicationResponse>(_AddEndorsementApplicationResponse_QNAME, AddEndorsementApplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrollPSVApp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "enrollPSVApp")
    public JAXBElement<EnrollPSVApp> createEnrollPSVApp(EnrollPSVApp value) {
        return new JAXBElement<EnrollPSVApp>(_EnrollPSVApp_QNAME, EnrollPSVApp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationCountSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getApplicationCountSummary")
    public JAXBElement<GetApplicationCountSummary> createGetApplicationCountSummary(GetApplicationCountSummary value) {
        return new JAXBElement<GetApplicationCountSummary>(_GetApplicationCountSummary_QNAME, GetApplicationCountSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationStatusSummaryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getApplicationStatusSummaryResponse")
    public JAXBElement<GetApplicationStatusSummaryResponse> createGetApplicationStatusSummaryResponse(GetApplicationStatusSummaryResponse value) {
        return new JAXBElement<GetApplicationStatusSummaryResponse>(_GetApplicationStatusSummaryResponse_QNAME, GetApplicationStatusSummaryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrollPSVAppResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "enrollPSVAppResponse")
    public JAXBElement<EnrollPSVAppResponse> createEnrollPSVAppResponse(EnrollPSVAppResponse value) {
        return new JAXBElement<EnrollPSVAppResponse>(_EnrollPSVAppResponse_QNAME, EnrollPSVAppResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBiometricDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getBiometricDataResponse")
    public JAXBElement<GetBiometricDataResponse> createGetBiometricDataResponse(GetBiometricDataResponse value) {
        return new JAXBElement<GetBiometricDataResponse>(_GetBiometricDataResponse_QNAME, GetBiometricDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchEndorsementApplicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "searchEndorsementApplicationResponse")
    public JAXBElement<SearchEndorsementApplicationResponse> createSearchEndorsementApplicationResponse(SearchEndorsementApplicationResponse value) {
        return new JAXBElement<SearchEndorsementApplicationResponse>(_SearchEndorsementApplicationResponse_QNAME, SearchEndorsementApplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrollVehicleClassAddApp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "enrollVehicleClassAddApp")
    public JAXBElement<EnrollVehicleClassAddApp> createEnrollVehicleClassAddApp(EnrollVehicleClassAddApp value) {
        return new JAXBElement<EnrollVehicleClassAddApp>(_EnrollVehicleClassAddApp_QNAME, EnrollVehicleClassAddApp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEndorsementApplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "updateEndorsementApplication")
    public JAXBElement<UpdateEndorsementApplication> createUpdateEndorsementApplication(UpdateEndorsementApplication value) {
        return new JAXBElement<UpdateEndorsementApplication>(_UpdateEndorsementApplication_QNAME, UpdateEndorsementApplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetVipApplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "setVipApplication")
    public JAXBElement<SetVipApplication> createSetVipApplication(SetVipApplication value) {
        return new JAXBElement<SetVipApplication>(_SetVipApplication_QNAME, SetVipApplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDatabaseLogsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getDatabaseLogsResponse")
    public JAXBElement<GetDatabaseLogsResponse> createGetDatabaseLogsResponse(GetDatabaseLogsResponse value) {
        return new JAXBElement<GetDatabaseLogsResponse>(_GetDatabaseLogsResponse_QNAME, GetDatabaseLogsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEndorsementDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getEndorsementDetails")
    public JAXBElement<GetEndorsementDetails> createGetEndorsementDetails(GetEndorsementDetails value) {
        return new JAXBElement<GetEndorsementDetails>(_GetEndorsementDetails_QNAME, GetEndorsementDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationStatusHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getApplicationStatusHistory")
    public JAXBElement<GetApplicationStatusHistory> createGetApplicationStatusHistory(GetApplicationStatusHistory value) {
        return new JAXBElement<GetApplicationStatusHistory>(_GetApplicationStatusHistory_QNAME, GetApplicationStatusHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkAsVipApplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "markAsVipApplication")
    public JAXBElement<MarkAsVipApplication> createMarkAsVipApplication(MarkAsVipApplication value) {
        return new JAXBElement<MarkAsVipApplication>(_MarkAsVipApplication_QNAME, MarkAsVipApplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInactiveApplicationHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getInactiveApplicationHistory")
    public JAXBElement<GetInactiveApplicationHistory> createGetInactiveApplicationHistory(GetInactiveApplicationHistory value) {
        return new JAXBElement<GetInactiveApplicationHistory>(_GetInactiveApplicationHistory_QNAME, GetInactiveApplicationHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonBiometricInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getPersonBiometricInfo")
    public JAXBElement<GetPersonBiometricInfo> createGetPersonBiometricInfo(GetPersonBiometricInfo value) {
        return new JAXBElement<GetPersonBiometricInfo>(_GetPersonBiometricInfo_QNAME, GetPersonBiometricInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewAdjudicationPanelInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "viewAdjudicationPanelInfoResponse")
    public JAXBElement<ViewAdjudicationPanelInfoResponse> createViewAdjudicationPanelInfoResponse(ViewAdjudicationPanelInfoResponse value) {
        return new JAXBElement<ViewAdjudicationPanelInfoResponse>(_ViewAdjudicationPanelInfoResponse_QNAME, ViewAdjudicationPanelInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getApplicationIdResponse")
    public JAXBElement<GetApplicationIdResponse> createGetApplicationIdResponse(GetApplicationIdResponse value) {
        return new JAXBElement<GetApplicationIdResponse>(_GetApplicationIdResponse_QNAME, GetApplicationIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewAdjudicationPanelInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "viewAdjudicationPanelInfo")
    public JAXBElement<ViewAdjudicationPanelInfo> createViewAdjudicationPanelInfo(ViewAdjudicationPanelInfo value) {
        return new JAXBElement<ViewAdjudicationPanelInfo>(_ViewAdjudicationPanelInfo_QNAME, ViewAdjudicationPanelInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrollTypeChangeApp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "enrollTypeChangeApp")
    public JAXBElement<EnrollTypeChangeApp> createEnrollTypeChangeApp(EnrollTypeChangeApp value) {
        return new JAXBElement<EnrollTypeChangeApp>(_EnrollTypeChangeApp_QNAME, EnrollTypeChangeApp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestoreApplicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "restoreApplicationResponse")
    public JAXBElement<RestoreApplicationResponse> createRestoreApplicationResponse(RestoreApplicationResponse value) {
        return new JAXBElement<RestoreApplicationResponse>(_RestoreApplicationResponse_QNAME, RestoreApplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrollEndorseApp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "enrollEndorseApp")
    public JAXBElement<EnrollEndorseApp> createEnrollEndorseApp(EnrollEndorseApp value) {
        return new JAXBElement<EnrollEndorseApp>(_EnrollEndorseApp_QNAME, EnrollEndorseApp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEndorsementDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getEndorsementDetailsResponse")
    public JAXBElement<GetEndorsementDetailsResponse> createGetEndorsementDetailsResponse(GetEndorsementDetailsResponse value) {
        return new JAXBElement<GetEndorsementDetailsResponse>(_GetEndorsementDetailsResponse_QNAME, GetEndorsementDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateApplicationStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "updateApplicationStatus")
    public JAXBElement<UpdateApplicationStatus> createUpdateApplicationStatus(UpdateApplicationStatus value) {
        return new JAXBElement<UpdateApplicationStatus>(_UpdateApplicationStatus_QNAME, UpdateApplicationStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditApplicationDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "editApplicationDetailsResponse")
    public JAXBElement<EditApplicationDetailsResponse> createEditApplicationDetailsResponse(EditApplicationDetailsResponse value) {
        return new JAXBElement<EditApplicationDetailsResponse>(_EditApplicationDetailsResponse_QNAME, EditApplicationDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationCountSummaryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getApplicationCountSummaryResponse")
    public JAXBElement<GetApplicationCountSummaryResponse> createGetApplicationCountSummaryResponse(GetApplicationCountSummaryResponse value) {
        return new JAXBElement<GetApplicationCountSummaryResponse>(_GetApplicationCountSummaryResponse_QNAME, GetApplicationCountSummaryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationStatusSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getApplicationStatusSummary")
    public JAXBElement<GetApplicationStatusSummary> createGetApplicationStatusSummary(GetApplicationStatusSummary value) {
        return new JAXBElement<GetApplicationStatusSummary>(_GetApplicationStatusSummary_QNAME, GetApplicationStatusSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePaymentInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "updatePaymentInfoResponse")
    public JAXBElement<UpdatePaymentInfoResponse> createUpdatePaymentInfoResponse(UpdatePaymentInfoResponse value) {
        return new JAXBElement<UpdatePaymentInfoResponse>(_UpdatePaymentInfoResponse_QNAME, UpdatePaymentInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationCountByStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getApplicationCountByStatusResponse")
    public JAXBElement<GetApplicationCountByStatusResponse> createGetApplicationCountByStatusResponse(GetApplicationCountByStatusResponse value) {
        return new JAXBElement<GetApplicationCountByStatusResponse>(_GetApplicationCountByStatusResponse_QNAME, GetApplicationCountByStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkAsVipApplicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "markAsVipApplicationResponse")
    public JAXBElement<MarkAsVipApplicationResponse> createMarkAsVipApplicationResponse(MarkAsVipApplicationResponse value) {
        return new JAXBElement<MarkAsVipApplicationResponse>(_MarkAsVipApplicationResponse_QNAME, MarkAsVipApplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateApplicationStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "updateApplicationStatusResponse")
    public JAXBElement<UpdateApplicationStatusResponse> createUpdateApplicationStatusResponse(UpdateApplicationStatusResponse value) {
        return new JAXBElement<UpdateApplicationStatusResponse>(_UpdateApplicationStatusResponse_QNAME, UpdateApplicationStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdjudicationPanelInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getAdjudicationPanelInfoResponse")
    public JAXBElement<GetAdjudicationPanelInfoResponse> createGetAdjudicationPanelInfoResponse(GetAdjudicationPanelInfoResponse value) {
        return new JAXBElement<GetAdjudicationPanelInfoResponse>(_GetAdjudicationPanelInfoResponse_QNAME, GetAdjudicationPanelInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDatabaseLogs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getDatabaseLogs")
    public JAXBElement<GetDatabaseLogs> createGetDatabaseLogs(GetDatabaseLogs value) {
        return new JAXBElement<GetDatabaseLogs>(_GetDatabaseLogs_QNAME, GetDatabaseLogs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationCountByAuthorityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getApplicationCountByAuthorityResponse")
    public JAXBElement<GetApplicationCountByAuthorityResponse> createGetApplicationCountByAuthorityResponse(GetApplicationCountByAuthorityResponse value) {
        return new JAXBElement<GetApplicationCountByAuthorityResponse>(_GetApplicationCountByAuthorityResponse_QNAME, GetApplicationCountByAuthorityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getApplicationDetail")
    public JAXBElement<GetApplicationDetail> createGetApplicationDetail(GetApplicationDetail value) {
        return new JAXBElement<GetApplicationDetail>(_GetApplicationDetail_QNAME, GetApplicationDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getApplicationId")
    public JAXBElement<GetApplicationId> createGetApplicationId(GetApplicationId value) {
        return new JAXBElement<GetApplicationId>(_GetApplicationId_QNAME, GetApplicationId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEndorsementApplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getEndorsementApplication")
    public JAXBElement<GetEndorsementApplication> createGetEndorsementApplication(GetEndorsementApplication value) {
        return new JAXBElement<GetEndorsementApplication>(_GetEndorsementApplication_QNAME, GetEndorsementApplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationQAPendingAuthorities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getApplicationQAPendingAuthorities")
    public JAXBElement<GetApplicationQAPendingAuthorities> createGetApplicationQAPendingAuthorities(GetApplicationQAPendingAuthorities value) {
        return new JAXBElement<GetApplicationQAPendingAuthorities>(_GetApplicationQAPendingAuthorities_QNAME, GetApplicationQAPendingAuthorities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrollRenewalApp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "enrollRenewalApp")
    public JAXBElement<EnrollRenewalApp> createEnrollRenewalApp(EnrollRenewalApp value) {
        return new JAXBElement<EnrollRenewalApp>(_EnrollRenewalApp_QNAME, EnrollRenewalApp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrollTypeChangeAppResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "enrollTypeChangeAppResponse")
    public JAXBElement<EnrollTypeChangeAppResponse> createEnrollTypeChangeAppResponse(EnrollTypeChangeAppResponse value) {
        return new JAXBElement<EnrollTypeChangeAppResponse>(_EnrollTypeChangeAppResponse_QNAME, EnrollTypeChangeAppResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInactiveApplicationHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getInactiveApplicationHistoryResponse")
    public JAXBElement<GetInactiveApplicationHistoryResponse> createGetInactiveApplicationHistoryResponse(GetInactiveApplicationHistoryResponse value) {
        return new JAXBElement<GetInactiveApplicationHistoryResponse>(_GetInactiveApplicationHistoryResponse_QNAME, GetInactiveApplicationHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationCountByAuthority }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getApplicationCountByAuthority")
    public JAXBElement<GetApplicationCountByAuthority> createGetApplicationCountByAuthority(GetApplicationCountByAuthority value) {
        return new JAXBElement<GetApplicationCountByAuthority>(_GetApplicationCountByAuthority_QNAME, GetApplicationCountByAuthority.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationStatusHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getApplicationStatusHistoryResponse")
    public JAXBElement<GetApplicationStatusHistoryResponse> createGetApplicationStatusHistoryResponse(GetApplicationStatusHistoryResponse value) {
        return new JAXBElement<GetApplicationStatusHistoryResponse>(_GetApplicationStatusHistoryResponse_QNAME, GetApplicationStatusHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchEndorsementApplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "searchEndorsementApplication")
    public JAXBElement<SearchEndorsementApplication> createSearchEndorsementApplication(SearchEndorsementApplication value) {
        return new JAXBElement<SearchEndorsementApplication>(_SearchEndorsementApplication_QNAME, SearchEndorsementApplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditApplicationDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "editApplicationDetails")
    public JAXBElement<EditApplicationDetails> createEditApplicationDetails(EditApplicationDetails value) {
        return new JAXBElement<EditApplicationDetails>(_EditApplicationDetails_QNAME, EditApplicationDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrollVehicleClassChangeApp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "enrollVehicleClassChangeApp")
    public JAXBElement<EnrollVehicleClassChangeApp> createEnrollVehicleClassChangeApp(EnrollVehicleClassChangeApp value) {
        return new JAXBElement<EnrollVehicleClassChangeApp>(_EnrollVehicleClassChangeApp_QNAME, EnrollVehicleClassChangeApp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonBiometricInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getPersonBiometricInfoResponse")
    public JAXBElement<GetPersonBiometricInfoResponse> createGetPersonBiometricInfoResponse(GetPersonBiometricInfoResponse value) {
        return new JAXBElement<GetPersonBiometricInfoResponse>(_GetPersonBiometricInfoResponse_QNAME, GetPersonBiometricInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrollVehicleClassAddAppResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "enrollVehicleClassAddAppResponse")
    public JAXBElement<EnrollVehicleClassAddAppResponse> createEnrollVehicleClassAddAppResponse(EnrollVehicleClassAddAppResponse value) {
        return new JAXBElement<EnrollVehicleClassAddAppResponse>(_EnrollVehicleClassAddAppResponse_QNAME, EnrollVehicleClassAddAppResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationCountByStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getApplicationCountByStatus")
    public JAXBElement<GetApplicationCountByStatus> createGetApplicationCountByStatus(GetApplicationCountByStatus value) {
        return new JAXBElement<GetApplicationCountByStatus>(_GetApplicationCountByStatus_QNAME, GetApplicationCountByStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEndorsementApplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "addEndorsementApplication")
    public JAXBElement<AddEndorsementApplication> createAddEndorsementApplication(AddEndorsementApplication value) {
        return new JAXBElement<AddEndorsementApplication>(_AddEndorsementApplication_QNAME, AddEndorsementApplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrollDuplicateApp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "enrollDuplicateApp")
    public JAXBElement<EnrollDuplicateApp> createEnrollDuplicateApp(EnrollDuplicateApp value) {
        return new JAXBElement<EnrollDuplicateApp>(_EnrollDuplicateApp_QNAME, EnrollDuplicateApp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEndorsementApplicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "updateEndorsementApplicationResponse")
    public JAXBElement<UpdateEndorsementApplicationResponse> createUpdateEndorsementApplicationResponse(UpdateEndorsementApplicationResponse value) {
        return new JAXBElement<UpdateEndorsementApplicationResponse>(_UpdateEndorsementApplicationResponse_QNAME, UpdateEndorsementApplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePaymentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "updatePaymentInfo")
    public JAXBElement<UpdatePaymentInfo> createUpdatePaymentInfo(UpdatePaymentInfo value) {
        return new JAXBElement<UpdatePaymentInfo>(_UpdatePaymentInfo_QNAME, UpdatePaymentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getApplicationDetailResponse")
    public JAXBElement<GetApplicationDetailResponse> createGetApplicationDetailResponse(GetApplicationDetailResponse value) {
        return new JAXBElement<GetApplicationDetailResponse>(_GetApplicationDetailResponse_QNAME, GetApplicationDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrollVehicleClassChangeAppResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "enrollVehicleClassChangeAppResponse")
    public JAXBElement<EnrollVehicleClassChangeAppResponse> createEnrollVehicleClassChangeAppResponse(EnrollVehicleClassChangeAppResponse value) {
        return new JAXBElement<EnrollVehicleClassChangeAppResponse>(_EnrollVehicleClassChangeAppResponse_QNAME, EnrollVehicleClassChangeAppResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrollCorrectionTypeAppResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "enrollCorrectionTypeAppResponse")
    public JAXBElement<EnrollCorrectionTypeAppResponse> createEnrollCorrectionTypeAppResponse(EnrollCorrectionTypeAppResponse value) {
        return new JAXBElement<EnrollCorrectionTypeAppResponse>(_EnrollCorrectionTypeAppResponse_QNAME, EnrollCorrectionTypeAppResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestoreApplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "restoreApplication")
    public JAXBElement<RestoreApplication> createRestoreApplication(RestoreApplication value) {
        return new JAXBElement<RestoreApplication>(_RestoreApplication_QNAME, RestoreApplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBiometricData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getBiometricData")
    public JAXBElement<GetBiometricData> createGetBiometricData(GetBiometricData value) {
        return new JAXBElement<GetBiometricData>(_GetBiometricData_QNAME, GetBiometricData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetVipApplicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "setVipApplicationResponse")
    public JAXBElement<SetVipApplicationResponse> createSetVipApplicationResponse(SetVipApplicationResponse value) {
        return new JAXBElement<SetVipApplicationResponse>(_SetVipApplicationResponse_QNAME, SetVipApplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEndorsementApplicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "getEndorsementApplicationResponse")
    public JAXBElement<GetEndorsementApplicationResponse> createGetEndorsementApplicationResponse(GetEndorsementApplicationResponse value) {
        return new JAXBElement<GetEndorsementApplicationResponse>(_GetEndorsementApplicationResponse_QNAME, GetEndorsementApplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrollDuplicateAppResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "enrollDuplicateAppResponse")
    public JAXBElement<EnrollDuplicateAppResponse> createEnrollDuplicateAppResponse(EnrollDuplicateAppResponse value) {
        return new JAXBElement<EnrollDuplicateAppResponse>(_EnrollDuplicateAppResponse_QNAME, EnrollDuplicateAppResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrollRenewalAppResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.license.ws.service.hsdl.soa.tigerit.com/", name = "enrollRenewalAppResponse")
    public JAXBElement<EnrollRenewalAppResponse> createEnrollRenewalAppResponse(EnrollRenewalAppResponse value) {
        return new JAXBElement<EnrollRenewalAppResponse>(_EnrollRenewalAppResponse_QNAME, EnrollRenewalAppResponse.class, null, value);
    }

}
