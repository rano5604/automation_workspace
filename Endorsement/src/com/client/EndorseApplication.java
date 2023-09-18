package com.client;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.service.AddEndorsementServiceRequest;
import com.service.AddEndorsementServiceResponse;
import com.service.ApplicantTypeEnum;
import com.service.Endorsement;
import com.service.LicenseTypeEnum;
import com.service.RequestHeader;

public class EndorseApplication{
	final JPanel panel = new JPanel();
	
	String name;
	String applicant_type;
	String dob;
	String mobile_no;
	String old_reference;
	String old_authority;
	String old_license;
	String license_type;
	String new_reference;
	String new_authority;
	String service_user;
	String card_type;
	
	
	public EndorseApplication(String old_reference,String old_authority,String old_license,String dl_type,String isPlactic,String new_reference, String new_authority, String applicant_type,String name, String dob, String mobile_no,String user){
		
		this.name=name;this.applicant_type=applicant_type;this.dob=dob;this.mobile_no=mobile_no;this.old_reference=old_reference;this.old_authority=old_authority;
		this.new_authority=new_authority;this.new_reference=new_reference;this.old_license=old_license;this.license_type=dl_type;this.service_user=user;this.card_type=isPlactic;
	}
	void addEndorse(){
		ServiceManager m = new ServiceManager();
		m.setUser(service_user);
		
		String attach="attachment";
		SecurityHandlerResolver r = new SecurityHandlerResolver(null);
		
		AddEndorsementServiceRequest req = new AddEndorsementServiceRequest();
		Endorsement endorse = new Endorsement();
		

		
		endorse.setDateOfBirth(dob);
		endorse.setFullName(name);
		endorse.setMobileNumber(mobile_no);
		
		endorse.setLicenseType(LicenseTypeEnum.valueOf(license_type));
		endorse.setApplicantType(ApplicantTypeEnum.valueOf(applicant_type));
		endorse.setNewAuthority(new_authority);
		endorse.setOldAuthority(old_authority);
		endorse.setNewReferenceNumber(new_reference);
		endorse.setOldReferenceNumber(old_reference);
		endorse.setOldLicenseNumber(old_license);
		
		
		if(card_type.equals("True"))
		{
			endorse.setPlasticCard(true);
		}
		else
			endorse.setPlasticCard(false);
		
		
		endorse.setAddressProofCopy(attach.getBytes());
		endorse.setPreviousDl(attach.getBytes());
		endorse.setEndorsementApplicationPage1(attach.getBytes());
		endorse.setEndorsementApplicationPage2(attach.getBytes());
		endorse.setEndorsementReplyLetter(attach.getBytes());
		endorse.setEndorsementVolumeCopy1(attach.getBytes());
		endorse.setEndorsementVolumeCopy2(attach.getBytes());
		
		req.setEndorsement(endorse);

	
		AddEndorsementServiceResponse res = addresponse(r, req);

		if (res.getOperationResult().isSuccess()) {
			String message = res.getStatus();
			

			JOptionPane.showMessageDialog(panel, ""+message);
			System.out.println(message);
			
		} else {
			
			int code =res.getOperationResult().getError().getErrorCode();
			String err_message= res.getOperationResult().getError().getErrorMessage();
			
			System.out.println(code+"::"+err_message);
			 JOptionPane.showMessageDialog(EndorseForm.panel,code+":"+err_message, "Error", 0);      
		}
		
	}

	public static AddEndorsementServiceResponse addresponse (SecurityHandlerResolver r,
			AddEndorsementServiceRequest request){
		AddEndorsementServiceResponse response = new AddEndorsementServiceResponse();
		RequestHeader requestHeader = new RequestHeader();
	
		request.setRequestHeader(requestHeader);

		try {
			response = ServiceManager.getApplicationService(r).addEndorsementApplication(request);
		} catch (Exception e) {
			response = null;
			System.out.println(e.getMessage());
			return response;
			
		}
		
				return response;	
	}

}