package com.client;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.service.GetDlEnrollServiceRequest;
import com.service.GetDlEnrollServiceResponse;
import com.service.OnlineDlApplication;
import com.service.OnlineDlPerson;
import com.service.RequestHeader;

public class PreEnroll {
	
	String Name;
	String DOB;
	String Mobile;
	
	public PreEnroll(String name, String mobile, String dob){
		this.Name = name;
		this.DOB = dob;
		this.Mobile = mobile;
	}
	final JPanel panel = new JPanel();
	List<String> result = new ArrayList<>();

	public List<String> GetPreEnrollID() {

		GetDlEnrollServiceRequest req = new GetDlEnrollServiceRequest();
		OnlineDlApplication app = new OnlineDlApplication();
		OnlineDlPerson per = new OnlineDlPerson();

		String sessionUuid = UUID.randomUUID().toString();

		per.setNameEn(Name);
		per.setDateOfBirth(DOB);
		per.setMobile(Mobile);

		app.setOnlineDlPerson(per);

		req.setDlApplication(app);
		req.setPartialSave(true);
		SecurityHandlerResolver r = new SecurityHandlerResolver(null);

		GetDlEnrollServiceResponse res = enrollDLApplication(sessionUuid, r, req);

		if (res.getOperationResult().isSuccess()) {
			String reference = res.getDlApplication().getReferenceNumber();
			String app_id = res.getDlApplication().getId().toString();
			result.add(reference);
			result.add(app_id);
			JOptionPane.showMessageDialog(panel, "ID:"+app_id+"\n"+"Pre-enroll ID:"+reference,"Complete" , 1, null);
			System.out.println(reference);
			System.out.println(app_id);
		} else {
			
			int code =res.getOperationResult().getError().getErrorCode();
			String err_message= res.getOperationResult().getError().getErrorMessage();
			
			System.out.println(code+":"+err_message);
			  JOptionPane.showMessageDialog(EnrollForm.panel,code+":"+err_message, "Error", 0);      
		}
		return result;
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
