package com.client;





import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.service.Endorsement;
import com.service.EndorsementSearchCriteria;
import com.service.EndorsementSearchType;
import com.service.RequestHeader;
import com.service.SearchEndorsementServiceRequest;
import com.service.SearchEndorsementServiceResponse;
import com.service.UpdateEndorsementServiceRequest;
import com.service.UpdateEndorsementServiceResponse;

public class ApproveEndorse {
	final JPanel panel = new JPanel();
	List<Endorsement>  listEndorsement=null;
	SecurityHandlerResolver r = new SecurityHandlerResolver(null);
	
	String service_user;
	String new_auth;
	String new_ref;
	String old_auth;
	String old_ref;

	public ApproveEndorse(String newauth,String newref,String oldauth, String oldref,String user){
		
		this.service_user=user;this.new_auth=newauth;this.new_ref=newref;this.old_auth=oldauth;this.old_ref=oldref;
	}
	
	int getId(){
		ServiceManager m = new ServiceManager();
		m.setUser(service_user);
		
		int end_id=0;
		SearchEndorsementServiceRequest searchr = new SearchEndorsementServiceRequest();
		EndorsementSearchCriteria search = new EndorsementSearchCriteria();
		search.setNewAuthority(new_auth);
		search.setNewReferenceNumber(new_ref);
		search.setEndorsementSearchType(EndorsementSearchType.ALL);
		
		//search.setOldAuthority(old_auth);
		//search.setOldReferenceNumber(old_ref);
		search.setStatus("PENDING");
		searchr.setCriteria(search);
		
		
		SearchEndorsementServiceResponse search_response = searchResponse(r,searchr);
		if(search_response.getOperationResult().isSuccess()){
			listEndorsement = search_response.getEndorsementList();
			if(!listEndorsement.isEmpty()){
				for(Endorsement r:listEndorsement){
					end_id=r.getId();
				}
			}
			
		}
		else {
			
			int code =search_response.getOperationResult().getError().getErrorCode();
			String err_message= search_response.getOperationResult().getError().getErrorMessage();
			
			System.out.println(code+"::"+err_message);
			 JOptionPane.showMessageDialog(EndorseForm.panel,code+":"+err_message, "Error", 0);      
		}
		return end_id;
	}
	void approveApplication(){
		ServiceManager m = new ServiceManager();
		m.setUser(service_user);
		int id =0;
		String attach="attachment";
		
		
		UpdateEndorsementServiceRequest update_req = new UpdateEndorsementServiceRequest();
		Endorsement endorse = new Endorsement();

		endorse.setEndorsementReplyLetter(attach.getBytes());
		endorse.setEndorsementVolumeCopy1(attach.getBytes());
		endorse.setEndorsementVolumeCopy2(attach.getBytes());
		
		id=getId();
		
		endorse.setId(id);
		endorse.setStatus("APPROVED");
		update_req.setEndorsement(endorse);
		
		UpdateEndorsementServiceResponse res = approveResponse(r, update_req);

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
	
	
	public static SearchEndorsementServiceResponse searchResponse (SecurityHandlerResolver r,
			SearchEndorsementServiceRequest request){
		SearchEndorsementServiceResponse response = new SearchEndorsementServiceResponse();
		RequestHeader requestHeader = new RequestHeader();
	
		request.setRequestHeader(requestHeader);

		try {
			response = ServiceManager.getApplicationService(r).searchEndorsementApplication(request);
		} catch (Exception e) {
			response = null;
			System.out.println(e.getMessage());
			return response;
			
		}
		
				return response;	
	}

	public static UpdateEndorsementServiceResponse approveResponse (SecurityHandlerResolver r,
			UpdateEndorsementServiceRequest request){
		UpdateEndorsementServiceResponse response = new UpdateEndorsementServiceResponse();
		RequestHeader requestHeader = new RequestHeader();
	
		request.setRequestHeader(requestHeader);

		try {
			response = ServiceManager.getApplicationService(r).updateEndorsementApplication(request);
		} catch (Exception e) {
			response = null;
			System.out.println(e.getMessage());
			return response;
			
		}
		
				return response;	
	}

}
