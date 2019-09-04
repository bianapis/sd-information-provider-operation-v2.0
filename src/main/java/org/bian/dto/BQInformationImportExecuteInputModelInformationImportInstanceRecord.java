package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInformationImportExecuteInputModelInformationImportInstanceRecord
 */
public class BQInformationImportExecuteInputModelInformationImportInstanceRecord   {
  private String informationFeedServiceContentRecordImportRequest = null;


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


}

