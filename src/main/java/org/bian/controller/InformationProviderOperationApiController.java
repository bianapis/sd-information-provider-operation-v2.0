/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Operate;

@BianRestController
public class InformationProviderOperationApiController {

	@Autowired
	InformationProviderOperationApiService service;
	
	@Operate.Activate
	public BianResponse<SDInformationProviderOperationActivateOutputModel> activate(@RequestBody BianRequest<SDInformationProviderOperationActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Operate.Configure
	public BianResponse<SDInformationProviderOperationConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDInformationProviderOperationConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Operate.Control
	public BianResponse<CRInformationFeedOperatingSessionControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRInformationFeedOperatingSessionControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("informationexport")
	@Operate.Execute
	public BianResponse<BQInformationExportExecuteOutputModel> executeInformationexport(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInformationExportExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeInformationexport(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("informationimport")
	@Operate.Execute
	public BianResponse<BQInformationImportExecuteOutputModel> executeInformationimport(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInformationImportExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeInformationimport(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Feedback
	public BianResponse<SDInformationProviderOperationFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDInformationProviderOperationFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Operate.Initiate
	public BianResponse<CRInformationFeedOperatingSessionInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRInformationFeedOperatingSessionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("serviceselection")
	@Operate.Request
	public BianResponse<BQServiceSelectionRequestOutputModel> requestServiceselection(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServiceSelectionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestServiceselection(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Request
	public BianResponse<CRInformationFeedOperatingSessionRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRInformationFeedOperatingSessionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Retrieve
	public BianResponse<CRInformationFeedOperatingSessionRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Operate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Operate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Operate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Operate.RetrieveSD
	public BianResponse<SDInformationProviderOperationRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@BQ("informationexport")
	@Operate.Update
	public BianResponse<BQInformationExportUpdateOutputModel> updateInformationexport(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInformationExportUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateInformationexport(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
