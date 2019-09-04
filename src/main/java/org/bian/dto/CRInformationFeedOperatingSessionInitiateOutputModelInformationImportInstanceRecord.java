package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInformationFeedOperatingSessionInitiateOutputModelInformationImportInstanceRecord
 */
public class CRInformationFeedOperatingSessionInitiateOutputModelInformationImportInstanceRecord   {
  private String informationFeedServiceContentRecordImportRequest = null;

  private String informationFeedServiceContentRecordImportResponse = null;

  private Object informationFeedServiceContentRecordImportRequestRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Is the detail of the service import request 
   * @return informationFeedServiceContentRecordImportRequest
  **/

  public String getInformationFeedServiceContentRecordImportRequest() {
    return informationFeedServiceContentRecordImportRequest;
  }

  public void setInformationFeedServiceContentRecordImportRequest(String informationFeedServiceContentRecordImportRequest) {
    this.informationFeedServiceContentRecordImportRequest = informationFeedServiceContentRecordImportRequest;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Is the response to the service import request for example terms/confirmation of acceptance but excludes the actual information content 
   * @return informationFeedServiceContentRecordImportResponse
  **/

  public String getInformationFeedServiceContentRecordImportResponse() {
    return informationFeedServiceContentRecordImportResponse;
  }

  public void setInformationFeedServiceContentRecordImportResponse(String informationFeedServiceContentRecordImportResponse) {
    this.informationFeedServiceContentRecordImportResponse = informationFeedServiceContentRecordImportResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Is the content of the import request - note this may be a dynamically updated set of information 
   * @return informationFeedServiceContentRecordImportRequestRecord
  **/

  public Object getInformationFeedServiceContentRecordImportRequestRecord() {
    return informationFeedServiceContentRecordImportRequestRecord;
  }

  public void setInformationFeedServiceContentRecordImportRequestRecord(Object informationFeedServiceContentRecordImportRequestRecord) {
    this.informationFeedServiceContentRecordImportRequestRecord = informationFeedServiceContentRecordImportRequestRecord;
  }


}

