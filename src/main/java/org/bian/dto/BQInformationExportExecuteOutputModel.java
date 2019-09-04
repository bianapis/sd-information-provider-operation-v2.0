package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInformationExportExecuteOutputModelInformationFeedOperatingSessionInstanceRecord;
import org.bian.dto.BQInformationExportUpdateOutputModelInformationExportInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInformationExportExecuteOutputModel
 */
public class BQInformationExportExecuteOutputModel   {
  private BQInformationExportExecuteOutputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord = null;

  private BQInformationExportUpdateOutputModelInformationExportInstanceRecord informationExportInstanceRecord = null;

  private String informationExportExecuteActionTaskReference = null;

  private Object informationExportExecuteActionTaskRecord = null;

  private String informationExportExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get informationFeedOperatingSessionInstanceRecord
   * @return informationFeedOperatingSessionInstanceRecord
  **/

  public BQInformationExportExecuteOutputModelInformationFeedOperatingSessionInstanceRecord getInformationFeedOperatingSessionInstanceRecord() {
    return informationFeedOperatingSessionInstanceRecord;
  }

  public void setInformationFeedOperatingSessionInstanceRecord(BQInformationExportExecuteOutputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord) {
    this.informationFeedOperatingSessionInstanceRecord = informationFeedOperatingSessionInstanceRecord;
  }


  /**
   * Get informationExportInstanceRecord
   * @return informationExportInstanceRecord
  **/

  public BQInformationExportUpdateOutputModelInformationExportInstanceRecord getInformationExportInstanceRecord() {
    return informationExportInstanceRecord;
  }

  public void setInformationExportInstanceRecord(BQInformationExportUpdateOutputModelInformationExportInstanceRecord informationExportInstanceRecord) {
    this.informationExportInstanceRecord = informationExportInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Information Export instance execute service call 
   * @return informationExportExecuteActionTaskReference
  **/

  public String getInformationExportExecuteActionTaskReference() {
    return informationExportExecuteActionTaskReference;
  }

  public void setInformationExportExecuteActionTaskReference(String informationExportExecuteActionTaskReference) {
    this.informationExportExecuteActionTaskReference = informationExportExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return informationExportExecuteActionTaskRecord
  **/

  public Object getInformationExportExecuteActionTaskRecord() {
    return informationExportExecuteActionTaskRecord;
  }

  public void setInformationExportExecuteActionTaskRecord(Object informationExportExecuteActionTaskRecord) {
    this.informationExportExecuteActionTaskRecord = informationExportExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Information Export execute transaction/record 
   * @return informationExportExecuteRecordReference
  **/

  public String getInformationExportExecuteRecordReference() {
    return informationExportExecuteRecordReference;
  }

  public void setInformationExportExecuteRecordReference(String informationExportExecuteRecordReference) {
    this.informationExportExecuteRecordReference = informationExportExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

