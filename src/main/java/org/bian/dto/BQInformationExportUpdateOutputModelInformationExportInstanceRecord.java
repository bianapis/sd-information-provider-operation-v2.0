package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInformationExportUpdateOutputModelInformationExportInstanceRecord
 */
public class BQInformationExportUpdateOutputModelInformationExportInstanceRecord   {
  private String informationFeedServiceContentRecordExportResponse = null;

  private String informationFeedServiceContentRecordExportRequestStatus = null;


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


}

