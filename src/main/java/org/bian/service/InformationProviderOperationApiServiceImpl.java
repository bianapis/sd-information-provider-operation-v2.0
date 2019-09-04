/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class InformationProviderOperationApiServiceImpl implements InformationProviderOperationApiService {

	public SDInformationProviderOperationActivateOutputModel activate(SDInformationProviderOperationActivateInputModel request){
		return JsonReader.read("activate-SDInformationProviderOperationActivateOutputModel.json",new TypeReference<SDInformationProviderOperationActivateOutputModel>(){});
	}
	
	public SDInformationProviderOperationConfigureOutputModel configure(String sdReferenceId, SDInformationProviderOperationConfigureInputModel request){
		return JsonReader.read("configure-SDInformationProviderOperationConfigureOutputModel.json",new TypeReference<SDInformationProviderOperationConfigureOutputModel>(){});
	}
	
	public CRInformationFeedOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRInformationFeedOperatingSessionControlInputModel request){
		return JsonReader.read("control-CRInformationFeedOperatingSessionControlOutputModel.json",new TypeReference<CRInformationFeedOperatingSessionControlOutputModel>(){});
	}
	
	public BQInformationExportExecuteOutputModel executeInformationexport(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInformationExportExecuteInputModel request){
		return JsonReader.read("execute-BQInformationExportExecuteOutputModel.json",new TypeReference<BQInformationExportExecuteOutputModel>(){});
	}
	
	public BQInformationImportExecuteOutputModel executeInformationimport(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInformationImportExecuteInputModel request){
		return JsonReader.read("execute-BQInformationImportExecuteOutputModel.json",new TypeReference<BQInformationImportExecuteOutputModel>(){});
	}
	
	public SDInformationProviderOperationFeedbackOutputModel feedback(String sdReferenceId, SDInformationProviderOperationFeedbackInputModel request){
		return JsonReader.read("feedback-SDInformationProviderOperationFeedbackOutputModel.json",new TypeReference<SDInformationProviderOperationFeedbackOutputModel>(){});
	}
	
	public CRInformationFeedOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRInformationFeedOperatingSessionInitiateInputModel request){
		return JsonReader.read("initiate-CRInformationFeedOperatingSessionInitiateOutputModel.json",new TypeReference<CRInformationFeedOperatingSessionInitiateOutputModel>(){});
	}
	
	public BQServiceSelectionRequestOutputModel requestServiceselection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceSelectionRequestInputModel request){
		return JsonReader.read("request-BQServiceSelectionRequestOutputModel.json",new TypeReference<BQServiceSelectionRequestOutputModel>(){});
	}
	
	public CRInformationFeedOperatingSessionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRInformationFeedOperatingSessionRequestInputModel request){
		return JsonReader.read("request-CRInformationFeedOperatingSessionRequestOutputModel.json",new TypeReference<CRInformationFeedOperatingSessionRequestOutputModel>(){});
	}
	
	public CRInformationFeedOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRInformationFeedOperatingSessionRetrieveOutputModel.json",new TypeReference<CRInformationFeedOperatingSessionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDInformationProviderOperationRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDInformationProviderOperationRetrieveOutputModel.json",new TypeReference<SDInformationProviderOperationRetrieveOutputModel>(){});
	}
	
	public BQInformationExportUpdateOutputModel updateInformationexport(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInformationExportUpdateInputModel request){
		return JsonReader.read("update-BQInformationExportUpdateOutputModel.json",new TypeReference<BQInformationExportUpdateOutputModel>(){});
	}
	
}
