package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInformationImportExecuteInputModelExecuteRecordType;
import org.bian.dto.BQInformationImportExecuteInputModelInformationFeedOperatingSessionInstanceRecord;
import org.bian.dto.BQInformationImportExecuteInputModelInformationImportInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInformationImportExecuteInputModel
 */
public class BQInformationImportExecuteInputModel   {
  private BQInformationImportExecuteInputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord = null;

  private String informationFeedOperatingSessionInstanceReference = null;

  private String informationImportInstanceReference = null;

  private BQInformationImportExecuteInputModelInformationImportInstanceRecord informationImportInstanceRecord = null;

  private Object informationImportExecuteActionTaskRecord = null;

  private BQInformationImportExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * Get informationFeedOperatingSessionInstanceRecord
   * @return informationFeedOperatingSessionInstanceRecord
  **/

  public BQInformationImportExecuteInputModelInformationFeedOperatingSessionInstanceRecord getInformationFeedOperatingSessionInstanceRecord() {
    return informationFeedOperatingSessionInstanceRecord;
  }

  public void setInformationFeedOperatingSessionInstanceRecord(BQInformationImportExecuteInputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord) {
    this.informationFeedOperatingSessionInstanceRecord = informationFeedOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Information Feed Operating Session instance 
   * @return informationFeedOperatingSessionInstanceReference
  **/

  public String getInformationFeedOperatingSessionInstanceReference() {
    return informationFeedOperatingSessionInstanceReference;
  }

  public void setInformationFeedOperatingSessionInstanceReference(String informationFeedOperatingSessionInstanceReference) {
    this.informationFeedOperatingSessionInstanceReference = informationFeedOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Information Import instance 
   * @return informationImportInstanceReference
  **/

  public String getInformationImportInstanceReference() {
    return informationImportInstanceReference;
  }

  public void setInformationImportInstanceReference(String informationImportInstanceReference) {
    this.informationImportInstanceReference = informationImportInstanceReference;
  }


  /**
   * Get informationImportInstanceRecord
   * @return informationImportInstanceRecord
  **/

  public BQInformationImportExecuteInputModelInformationImportInstanceRecord getInformationImportInstanceRecord() {
    return informationImportInstanceRecord;
  }

  public void setInformationImportInstanceRecord(BQInformationImportExecuteInputModelInformationImportInstanceRecord informationImportInstanceRecord) {
    this.informationImportInstanceRecord = informationImportInstanceRecord;
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
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQInformationImportExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQInformationImportExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

