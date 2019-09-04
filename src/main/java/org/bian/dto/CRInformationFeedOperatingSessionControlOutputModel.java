package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInformationFeedOperatingSessionControlOutputModel
 */
public class CRInformationFeedOperatingSessionControlOutputModel   {
  private String informationFeedOperatingSessionControlActionTaskReference = null;

  private Object informationFeedOperatingSessionControlActionTaskRecord = null;

  private String informationFeedOperatingSessionControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Information Feed Operating Session instance control processing service call 
   * @return informationFeedOperatingSessionControlActionTaskReference
  **/

  public String getInformationFeedOperatingSessionControlActionTaskReference() {
    return informationFeedOperatingSessionControlActionTaskReference;
  }

  public void setInformationFeedOperatingSessionControlActionTaskReference(String informationFeedOperatingSessionControlActionTaskReference) {
    this.informationFeedOperatingSessionControlActionTaskReference = informationFeedOperatingSessionControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return informationFeedOperatingSessionControlActionTaskRecord
  **/

  public Object getInformationFeedOperatingSessionControlActionTaskRecord() {
    return informationFeedOperatingSessionControlActionTaskRecord;
  }

  public void setInformationFeedOperatingSessionControlActionTaskRecord(Object informationFeedOperatingSessionControlActionTaskRecord) {
    this.informationFeedOperatingSessionControlActionTaskRecord = informationFeedOperatingSessionControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return informationFeedOperatingSessionControlActionResponse
  **/

  public String getInformationFeedOperatingSessionControlActionResponse() {
    return informationFeedOperatingSessionControlActionResponse;
  }

  public void setInformationFeedOperatingSessionControlActionResponse(String informationFeedOperatingSessionControlActionResponse) {
    this.informationFeedOperatingSessionControlActionResponse = informationFeedOperatingSessionControlActionResponse;
  }


}

