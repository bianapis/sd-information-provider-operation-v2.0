/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface InformationProviderOperationApiService {

	SDInformationProviderOperationActivateOutputModel activate(SDInformationProviderOperationActivateInputModel request);
	
	SDInformationProviderOperationConfigureOutputModel configure(String sdReferenceId, SDInformationProviderOperationConfigureInputModel request);
	
	CRInformationFeedOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRInformationFeedOperatingSessionControlInputModel request);
	
	BQInformationExportExecuteOutputModel executeInformationexport(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInformationExportExecuteInputModel request);
	
	BQInformationImportExecuteOutputModel executeInformationimport(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInformationImportExecuteInputModel request);
	
	SDInformationProviderOperationFeedbackOutputModel feedback(String sdReferenceId, SDInformationProviderOperationFeedbackInputModel request);
	
	CRInformationFeedOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRInformationFeedOperatingSessionInitiateInputModel request);
	
	BQServiceSelectionRequestOutputModel requestServiceselection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceSelectionRequestInputModel request);
	
	CRInformationFeedOperatingSessionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRInformationFeedOperatingSessionRequestInputModel request);
	
	CRInformationFeedOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDInformationProviderOperationRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	BQInformationExportUpdateOutputModel updateInformationexport(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInformationExportUpdateInputModel request);
	
}
