package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInformationImportExecuteOutputModelInformationFeedOperatingSessionInstanceRecord;
import org.bian.dto.BQInformationImportExecuteOutputModelInformationImportInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInformationImportExecuteOutputModel
 */
public class BQInformationImportExecuteOutputModel   {
  private BQInformationImportExecuteOutputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord = null;

  private BQInformationImportExecuteOutputModelInformationImportInstanceRecord informationImportInstanceRecord = null;

  private String informationImportExecuteActionTaskReference = null;

  private Object informationImportExecuteActionTaskRecord = null;

  private String informationImportExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get informationFeedOperatingSessionInstanceRecord
   * @return informationFeedOperatingSessionInstanceRecord
  **/

  public BQInformationImportExecuteOutputModelInformationFeedOperatingSessionInstanceRecord getInformationFeedOperatingSessionInstanceRecord() {
    return informationFeedOperatingSessionInstanceRecord;
  }

  public void setInformationFeedOperatingSessionInstanceRecord(BQInformationImportExecuteOutputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord) {
    this.informationFeedOperatingSessionInstanceRecord = informationFeedOperatingSessionInstanceRecord;
  }


  /**
   * Get informationImportInstanceRecord
   * @return informationImportInstanceRecord
  **/

  public BQInformationImportExecuteOutputModelInformationImportInstanceRecord getInformationImportInstanceRecord() {
    return informationImportInstanceRecord;
  }

  public void setInformationImportInstanceRecord(BQInformationImportExecuteOutputModelInformationImportInstanceRecord informationImportInstanceRecord) {
    this.informationImportInstanceRecord = informationImportInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Information Import instance execute service call 
   * @return informationImportExecuteActionTaskReference
  **/

  public String getInformationImportExecuteActionTaskReference() {
    return informationImportExecuteActionTaskReference;
  }

  public void setInformationImportExecuteActionTaskReference(String informationImportExecuteActionTaskReference) {
    this.informationImportExecuteActionTaskReference = informationImportExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return informationImportExecuteActionTaskRecord
  **/

  public Object getInformationImportExecuteActionTaskRecord() {
    return informationImportExecuteActionTaskRecord;
  }

  public void setInformationImportExecuteActionTaskRecord(Object informationImportExecuteActionTaskRecord) {
    this.informationImportExecuteActionTaskRecord = informationImportExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Information Import execute transaction/record 
   * @return informationImportExecuteRecordReference
  **/

  public String getInformationImportExecuteRecordReference() {
    return informationImportExecuteRecordReference;
  }

  public void setInformationImportExecuteRecordReference(String informationImportExecuteRecordReference) {
    this.informationImportExecuteRecordReference = informationImportExecuteRecordReference;
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

