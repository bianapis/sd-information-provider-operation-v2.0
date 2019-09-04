package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInformationExportExecuteOutputModelInformationFeedOperatingSessionInstanceRecord
 */
public class BQInformationExportExecuteOutputModelInformationFeedOperatingSessionInstanceRecord   {
  private String informationFeedServiceContentRecordReference = null;

  private Object informationFeedServiceContentRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the packets of information exchanged during the access session  
   * @return informationFeedServiceContentRecordReference
  **/

  public String getInformationFeedServiceContentRecordReference() {
    return informationFeedServiceContentRecordReference;
  }

  public void setInformationFeedServiceContentRecordReference(String informationFeedServiceContentRecordReference) {
    this.informationFeedServiceContentRecordReference = informationFeedServiceContentRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Is the record of the information exchanged that can be a structured list or log of updated data sets 
   * @return informationFeedServiceContentRecord
  **/

  public Object getInformationFeedServiceContentRecord() {
    return informationFeedServiceContentRecord;
  }

  public void setInformationFeedServiceContentRecord(Object informationFeedServiceContentRecord) {
    this.informationFeedServiceContentRecord = informationFeedServiceContentRecord;
  }


}

