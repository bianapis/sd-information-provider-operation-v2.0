package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInformationExportUpdateInputModelInformationExportInstanceRecord;
import org.bian.dto.BQInformationExportUpdateInputModelInformationFeedOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInformationExportUpdateInputModel
 */
public class BQInformationExportUpdateInputModel   {
  private BQInformationExportUpdateInputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord = null;

  private String informationFeedOperatingSessionInstanceReference = null;

  private String informationExportInstanceReference = null;

  private BQInformationExportUpdateInputModelInformationExportInstanceRecord informationExportInstanceRecord = null;

  private Object informationExportUpdateActionTaskRecord = null;

  private String informationExportUpdateActionRequest = null;


  /**
   * Get informationFeedOperatingSessionInstanceRecord
   * @return informationFeedOperatingSessionInstanceRecord
  **/

  public BQInformationExportUpdateInputModelInformationFeedOperatingSessionInstanceRecord getInformationFeedOperatingSessionInstanceRecord() {
    return informationFeedOperatingSessionInstanceRecord;
  }

  public void setInformationFeedOperatingSessionInstanceRecord(BQInformationExportUpdateInputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return informationExportUpdateActionRequest
  **/

  public String getInformationExportUpdateActionRequest() {
    return informationExportUpdateActionRequest;
  }

  public void setInformationExportUpdateActionRequest(String informationExportUpdateActionRequest) {
    this.informationExportUpdateActionRequest = informationExportUpdateActionRequest;
  }


}

