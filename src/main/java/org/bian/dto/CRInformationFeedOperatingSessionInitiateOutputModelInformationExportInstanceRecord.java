package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInformationFeedOperatingSessionInitiateOutputModelInformationExportInstanceRecord
 */
public class CRInformationFeedOperatingSessionInitiateOutputModelInformationExportInstanceRecord   {
  private String informationFeedServiceContentRecordExportRequestType = null;

  private String informationFeedServiceContentRecordExportRequest = null;

  private String informationFeedServiceContentRecordExportResponse = null;

  private String informationFeedServiceContentRecordExportRequestStatus = null;

  private Object informationFeedServiceContentRecordExportRequestRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the type of export exchange for example transaction reporting, price/quote feed 
   * @return informationFeedServiceContentRecordExportRequestType
  **/

  public String getInformationFeedServiceContentRecordExportRequestType() {
    return informationFeedServiceContentRecordExportRequestType;
  }

  public void setInformationFeedServiceContentRecordExportRequestType(String informationFeedServiceContentRecordExportRequestType) {
    this.informationFeedServiceContentRecordExportRequestType = informationFeedServiceContentRecordExportRequestType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Is the detail of the service export request 
   * @return informationFeedServiceContentRecordExportRequest
  **/

  public String getInformationFeedServiceContentRecordExportRequest() {
    return informationFeedServiceContentRecordExportRequest;
  }

  public void setInformationFeedServiceContentRecordExportRequest(String informationFeedServiceContentRecordExportRequest) {
    this.informationFeedServiceContentRecordExportRequest = informationFeedServiceContentRecordExportRequest;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Is the detail of the service export response - note this may be a dynamically updated set of information 
   * @return informationFeedServiceContentRecordExportResponse
  **/

  public String getInformationFeedServiceContentRecordExportResponse() {
    return informationFeedServiceContentRecordExportResponse;
  }

  public void setInformationFeedServiceContentRecordExportResponse(String informationFeedServiceContentRecordExportResponse) {
    this.informationFeedServiceContentRecordExportResponse = informationFeedServiceContentRecordExportResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Tracks the status of the export information request if for example confirmation is required from the service 
   * @return informationFeedServiceContentRecordExportRequestStatus
  **/

  public String getInformationFeedServiceContentRecordExportRequestStatus() {
    return informationFeedServiceContentRecordExportRequestStatus;
  }

  public void setInformationFeedServiceContentRecordExportRequestStatus(String informationFeedServiceContentRecordExportRequestStatus) {
    this.informationFeedServiceContentRecordExportRequestStatus = informationFeedServiceContentRecordExportRequestStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Is the content of the export request - note this may be a dynamically updated set of information 
   * @return informationFeedServiceContentRecordExportRequestRecord
  **/

  public Object getInformationFeedServiceContentRecordExportRequestRecord() {
    return informationFeedServiceContentRecordExportRequestRecord;
  }

  public void setInformationFeedServiceContentRecordExportRequestRecord(Object informationFeedServiceContentRecordExportRequestRecord) {
    this.informationFeedServiceContentRecordExportRequestRecord = informationFeedServiceContentRecordExportRequestRecord;
  }


}

