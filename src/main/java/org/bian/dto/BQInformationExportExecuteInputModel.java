package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInformationExportExecuteInputModelInformationFeedOperatingSessionInstanceRecord;
import org.bian.dto.BQInformationExportUpdateInputModelInformationExportInstanceRecord;
import org.bian.dto.BQInformationImportExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQInformationExportExecuteInputModel
 */
public class BQInformationExportExecuteInputModel   {
  private BQInformationExportExecuteInputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord = null;

  private String informationFeedOperatingSessionInstanceReference = null;

  private String informationExportInstanceReference = null;

  private BQInformationExportUpdateInputModelInformationExportInstanceRecord informationExportInstanceRecord = null;

  private Object informationExportExecuteActionTaskRecord = null;

  private BQInformationImportExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * Get informationFeedOperatingSessionInstanceRecord
   * @return informationFeedOperatingSessionInstanceRecord
  **/

  public BQInformationExportExecuteInputModelInformationFeedOperatingSessionInstanceRecord getInformationFeedOperatingSessionInstanceRecord() {
    return informationFeedOperatingSessionInstanceRecord;
  }

  public void setInformationFeedOperatingSessionInstanceRecord(BQInformationExportExecuteInputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Information Export instance 
   * @return informationExportInstanceReference
  **/

  public String getInformationExportInstanceReference() {
    return informationExportInstanceReference;
  }

  public void setInformationExportInstanceReference(String informationExportInstanceReference) {
    this.informationExportInstanceReference = informationExportInstanceReference;
  }


  /**
   * Get informationExportInstanceRecord
   * @return informationExportInstanceRecord
  **/

  public BQInformationExportUpdateInputModelInformationExportInstanceRecord getInformationExportInstanceRecord() {
    return informationExportInstanceRecord;
  }

  public void setInformationExportInstanceRecord(BQInformationExportUpdateInputModelInformationExportInstanceRecord informationExportInstanceRecord) {
    this.informationExportInstanceRecord = informationExportInstanceRecord;
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

