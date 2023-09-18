package com.client;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.service.DlAppVehicleClass;
import com.service.DlAttachment;
import com.service.GetDlEnrollServiceRequest;
import com.service.GetDlEnrollServiceResponse;
import com.service.OnlineAddress;
import com.service.OnlineDlApplication;
import com.service.OnlineDlPerson;
import com.service.RequestHeader;
import com.service.ServiceError;

public class SubmitOnlineApplication {
	
	String Name;
	String DOB;
	String Mobile;
	String Father;
	String Mother;
	String Spouse;
	String NID;
	String Nationality;
	String Email;
	String MaritalS;
	String BloodGroup;
	String Gender;
	String Occupation;
	String Language;
	String Dctb;
	String DctbDate;
	String OnlineId;
	String OnlineRef;
	String OnlineType;
	String OnlineSubType;
	String Duplicate_Reason;
	String ApplicantType;
	String AuthorityId;
	String LicenseType;
	String VehicleClass;
	String OnlineAppType;
	String LearnerNo;
	String InstructorName;
	String InstructorLicense;
	String RecentDl;
	String CuurentDL;
	String BankTransaction;
	String BioDate;
	String DocType;
	String Attach1;
	String Attach2;
	String Attach3;
	String Photo;
	String AddressLine;
	String AddressLineP;
	String Division;
	String DivisionP;
	String District;
	String DistrictP;
	String Postcode;
	String PostcodeP;
	String Union;
	String UnionP;
	String Upozila;
	String UpozilaP;
	
	String er_message;
	int er_code;

	final JPanel panel = new JPanel();
	public SubmitOnlineApplication(String name, String mobile, String dob,
			String father, String mother, String spouse, String nid, String nationality,
			String email, String mStatus, String bloodGroup,String gender, String occupation,String language, String dctb, 
			String dctbDate, String onlineId, String onlineRef,String appType,String authority, 
			String DlType, String vClass,String onType,String subType,String duplicate_reason,String learnerNo,String LicenseNo,String recentLicenseNo,
			String instructorName, String instructorLicense,String bankT,
			String bioDate, String docType, String attach1, String attach2, String attach3,
			String photo, String addLine, String addLine_p, String division, String division_p,
			String district, String district_p, String postcode, String postcode_p,
			String union, String union_p, String upozila, String upozila_p){
		this.Name = name; this.DOB = dob; this.Mobile = mobile;
		this.Father = father; this.Mother = mother; this.Spouse = spouse;
		this.NID = nid;this.Nationality = nationality;this.Email = email;
		this.MaritalS = mStatus;this.BloodGroup=bloodGroup;this.Gender=gender;this.Occupation = occupation;this.Language = language;
		this.Dctb =  dctb;this.DctbDate = dctbDate;this.OnlineId = onlineId; this.OnlineType=onType;
		this.Duplicate_Reason=duplicate_reason; this.OnlineSubType=subType;
		this.OnlineRef = onlineRef; this.ApplicantType = appType; this.AuthorityId = authority;
		this.LicenseType = DlType; this.VehicleClass=vClass;
		this.LearnerNo=learnerNo; this.InstructorName=instructorName; this.InstructorLicense=instructorLicense;
		this.BankTransaction=bankT;this.BioDate=bioDate;
		this.DocType=docType;this.Attach1=attach1;this.Attach2=attach2;
		this.Attach3=attach3;this.Photo=photo;this.AddressLine=addLine;
		this.AddressLineP=addLine_p;this.Division=division;this.DivisionP=division_p;
		this.District=district;this.DistrictP=district_p;this.Postcode=postcode;
		this.PostcodeP=postcode_p;this.Union=union;this.UnionP=union_p; this.RecentDl=recentLicenseNo; this.CuurentDL=LicenseNo;
		this.Upozila=upozila; this.UpozilaP=upozila_p;}
	
	//List<String> result = new ArrayList<>();

	public void SubmitOnlineApp() {

		GetDlEnrollServiceRequest req = new GetDlEnrollServiceRequest();

		OnlineDlApplication app = new OnlineDlApplication();
		OnlineDlPerson per = new OnlineDlPerson();
		OnlineAddress on_add = new OnlineAddress();
		OnlineAddress on_add_p = new OnlineAddress();
		DlAppVehicleClass vcls = new DlAppVehicleClass();
		
		DlAttachment dlattach = new DlAttachment();
		
		
		
		dlattach.setAttachment1(Attach1.getBytes());
		dlattach.setAttachment2(Attach2.getBytes());
		dlattach.setAttachment3(Attach3.getBytes());
		dlattach.setPhoto(Photo.getBytes());
		dlattach.setType(Long.parseLong(DocType));
		
		vcls.setVehicleClass(VehicleClass);
		
		
		on_add.setAddressLineEn(AddressLine);
		on_add.setDivisionId(Long.parseLong(Division));
		on_add.setDistrictId(Long.parseLong(District));
		on_add.setPostcode(Long.parseLong(Postcode));
		on_add.setUnionId(Long.parseLong(Union));
		on_add.setUpozilaId(Long.parseLong(Upozila));
		
		on_add_p.setAddressLineEn(AddressLineP);
		on_add_p.setDivisionId(Long.parseLong(DivisionP));
		on_add_p.setDistrictId(Long.parseLong(DistrictP));
		on_add_p.setPostcode(Long.parseLong(PostcodeP));
		on_add_p.setUnionId(Long.parseLong(UnionP));
		on_add_p.setUpozilaId(Long.parseLong(UpozilaP));

		String sessionUuid = UUID.randomUUID().toString();

		per.setNameEn(Name);
		per.setDateOfBirth(DOB);
		per.setMobile(Mobile);
		per.setBloodGroup(Long.parseLong(BloodGroup));
		per.setEmail(Email);
		per.setFatherEn(Father);
		per.setGender(Long.parseLong(Gender));
		per.setMaritalStatus(Long.parseLong(MaritalS));
		per.setMotherEn(Mother);
		per.setNid(NID);
		per.setNationality(Nationality);
		per.setOccupation(Long.parseLong(Occupation));
		per.setSpouseEn(Spouse);
		per.setPermanentAddress(on_add);
		per.setPresentAddress(on_add_p);
		
		

		
		app.setOnlineDlPerson(per);
		app.setApplicantType(Long.parseLong(ApplicantType));
		app.setBankTransactionId(BankTransaction);
		app.setReferenceNumber(OnlineRef);
		app.setAuthorityId(Long.parseLong(AuthorityId));
		app.setBiometricScheduleDate(BioDate);
		app.setRecentLicenseNo(RecentDl);
		app.setLicenseNumberEn(CuurentDL);
		//app.setOnlineDlApplicationType(Long.parseLong(OnlineType));
		
		if(OnlineType.equals("NEW")){
			app.setOnlineDlApplicationType((long)2);
		}
		else if(OnlineType.equals("RENEWAL")){
			app.setOnlineDlApplicationType((long)3);
		}
		else
			app.setOnlineDlApplicationType((long)4);
			
		
		if (OnlineType.equals("DUPLICATE")){
			if(Duplicate_Reason.equals("LOST")){
				app.setDuplicateReason((long) 64);
			}
			else if(Duplicate_Reason.equals("DAMAGED")){
				app.setDuplicateReason((long) 65);
			}
			else
				app.setDuplicateReason((long) 66);
		}
		
		if (OnlineType.equals("DUPLICATE") && !OnlineSubType.isEmpty()){
			app.setApplicationSubTypes((long)3);
		}
	
		app.setDctbDate(DctbDate);
		app.setDctbSerialNo(Dctb);
		app.setId(Long.parseLong(OnlineId));
		app.setLicenseType(Long.parseLong(LicenseType));
		app.setLanguage(Long.parseLong(Language));
		app.setInstructorName(InstructorName);
		app.setInstructorLicenseNo(InstructorLicense);
		app.setLearnerReferenceNumber(LearnerNo);
		List<DlAttachment> attachmentList = new ArrayList<DlAttachment>();
		attachmentList.add(dlattach);
		app.setDlAttachmentList(attachmentList);
		
		List<DlAppVehicleClass> vlcList = new ArrayList<DlAppVehicleClass>();
		vlcList.add(vcls);
		
		app.setDlAppVehicalClassList(vlcList);
		req.setDlApplication(app);
		req.setPartialSave(false);
		
		SecurityHandlerResolver r = new SecurityHandlerResolver(null);

		GetDlEnrollServiceResponse res = enrollDLApplication(sessionUuid, r, req);

		if (res.getOperationResult().isSuccess()) {
			
			JOptionPane.showMessageDialog(panel, OnlineRef,"Complete" , 1, null);
			System.out.println("Successful");
		} else {
			
			//int code =res.getOperationResult().getError().getErrorCode();
			List<ServiceError> err_message= res.getOperationResult().getErrorList();
			for(ServiceError re:err_message){
				int er_code=re.getErrorCode();
				String er_message = re.getErrorMessage();
				System.out.println(er_code+":"+er_message);
				  JOptionPane.showMessageDialog(EnrollForm.panel,er_code+":"+er_message, "Error", 0);
			}
			
/*			System.out.println(er_code+":"+er_message);
			  JOptionPane.showMessageDialog(EnrollForm.panel,code+":"+err_message, "Error", 0);*/      
		}
	
	}

	public static GetDlEnrollServiceResponse enrollDLApplication(String sessionUuid, SecurityHandlerResolver r,
			GetDlEnrollServiceRequest request) {
		GetDlEnrollServiceResponse response = new GetDlEnrollServiceResponse();
		RequestHeader requestHeader = new RequestHeader();
		requestHeader.setClientIP("192.168.102.120");
		requestHeader.setSessionUuid(sessionUuid);
		request.setRequestHeader(requestHeader);

		try {
			response = ServiceManager.getEnrollmentService(r).addDLEnrollment(request);
		} catch (Exception e) {
			response = null;
			e.printStackTrace();
		}
		return response;
	}

}
