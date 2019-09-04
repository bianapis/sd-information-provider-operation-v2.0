package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInformationExportUpdateOutputModelInformationExportInstanceRecord;
import org.bian.dto.BQInformationImportExecuteOutputModelInformationFeedOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInformationExportUpdateOutputModel
 */
public class BQInformationExportUpdateOutputModel   {
  private BQInformationImportExecuteOutputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord = null;

  private BQInformationExportUpdateOutputModelInformationExportInstanceRecord informationExportInstanceRecord = null;

  private String informationExportUpdateActionTaskReference = null;

  private Object informationExportUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return informationExportUpdateActionTaskReference
  **/

  public String getInformationExportUpdateActionTaskReference() {
    return informationExportUpdateActionTaskReference;
  }

  public void setInformationExportUpdateActionTaskReference(String informationExportUpdateActionTaskReference) {
    this.informationExportUpdateActionTaskReference = informationExportUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return informationExportUpdateActionTaskRecord
  **/

  public Object getInformationExportUpdateActionTaskRecord() {
    return informationExportUpdateActionTaskRecord;
  }

  public void setInformationExportUpdateActionTaskRecord(Object informationExportUpdateActionTaskRecord) {
    this.informationExportUpdateActionTaskRecord = informationExportUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

