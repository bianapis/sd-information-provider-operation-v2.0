package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInformationFeedOperatingSessionInitiateOutputModelInformationExportInstanceRecord;
import org.bian.dto.CRInformationFeedOperatingSessionInitiateOutputModelInformationFeedOperatingSessionInstanceRecord;
import org.bian.dto.CRInformationFeedOperatingSessionInitiateOutputModelInformationImportInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRInformationFeedOperatingSessionInitiateOutputModel
 */
public class CRInformationFeedOperatingSessionInitiateOutputModel   {
  private String informationFeedOperatingSessionInstanceReference = null;

  private String informationFeedOperatingSessionInitiateActionReference = null;

  private Object informationFeedOperatingSessionInitiateActionRecord = null;

  private String informationFeedOperatingSessionInstanceStatus = null;

  private CRInformationFeedOperatingSessionInitiateOutputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord = null;

  private Object serviceSelectionInstanceRecord = null;

  private CRInformationFeedOperatingSessionInitiateOutputModelInformationImportInstanceRecord informationImportInstanceRecord = null;

  private CRInformationFeedOperatingSessionInitiateOutputModelInformationExportInstanceRecord informationExportInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Information Feed Operating Session instance 
   * @return informationFeedOperatingSessionInstanceReference
  **/

  public String getInformationFeedOperatingSessionInstanceReference() {
    return informationFeedOperatingSessionInstanceReference;
  }

  public void setInformationFeedOperatingSessionInstanceReference(String informationFeedOperatingSessionInstanceReference) {
    this.informationFeedOperatingSessionInstanceReference = informationFeedOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return informationFeedOperatingSessionInitiateActionReference
  **/

  public String getInformationFeedOperatingSessionInitiateActionReference() {
    return informationFeedOperatingSessionInitiateActionReference;
  }

  public void setInformationFeedOperatingSessionInitiateActionReference(String informationFeedOperatingSessionInitiateActionReference) {
    this.informationFeedOperatingSessionInitiateActionReference = informationFeedOperatingSessionInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return informationFeedOperatingSessionInitiateActionRecord
  **/

  public Object getInformationFeedOperatingSessionInitiateActionRecord() {
    return informationFeedOperatingSessionInitiateActionRecord;
  }

  public void setInformationFeedOperatingSessionInitiateActionRecord(Object informationFeedOperatingSessionInitiateActionRecord) {
    this.informationFeedOperatingSessionInitiateActionRecord = informationFeedOperatingSessionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Information Feed Operating Session instance (e.g. initialised, pending, active) 
   * @return informationFeedOperatingSessionInstanceStatus
  **/

  public String getInformationFeedOperatingSessionInstanceStatus() {
    return informationFeedOperatingSessionInstanceStatus;
  }

  public void setInformationFeedOperatingSessionInstanceStatus(String informationFeedOperatingSessionInstanceStatus) {
    this.informationFeedOperatingSessionInstanceStatus = informationFeedOperatingSessionInstanceStatus;
  }


  /**
   * Get informationFeedOperatingSessionInstanceRecord
   * @return informationFeedOperatingSessionInstanceRecord
  **/

  public CRInformationFeedOperatingSessionInitiateOutputModelInformationFeedOperatingSessionInstanceRecord getInformationFeedOperatingSessionInstanceRecord() {
    return informationFeedOperatingSessionInstanceRecord;
  }

  public void setInformationFeedOperatingSessionInstanceRecord(CRInformationFeedOperatingSessionInitiateOutputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord) {
    this.informationFeedOperatingSessionInstanceRecord = informationFeedOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The behavior qualifier record informationFeedServiceContentRecordSubscriptionRequest:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: Is the detail of the information feed service subscription request informationFeedServiceContentRecordSubscriptionResponse:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: Is the detail of the service subscription response 
   * @return serviceSelectionInstanceRecord
  **/

  public Object getServiceSelectionInstanceRecord() {
    return serviceSelectionInstanceRecord;
  }

  public void setServiceSelectionInstanceRecord(Object serviceSelectionInstanceRecord) {
    this.serviceSelectionInstanceRecord = serviceSelectionInstanceRecord;
  }


  /**
   * Get informationImportInstanceRecord
   * @return informationImportInstanceRecord
  **/

  public CRInformationFeedOperatingSessionInitiateOutputModelInformationImportInstanceRecord getInformationImportInstanceRecord() {
    return informationImportInstanceRecord;
  }

  public void setInformationImportInstanceRecord(CRInformationFeedOperatingSessionInitiateOutputModelInformationImportInstanceRecord informationImportInstanceRecord) {
    this.informationImportInstanceRecord = informationImportInstanceRecord;
  }


  /**
   * Get informationExportInstanceRecord
   * @return informationExportInstanceRecord
  **/

  public CRInformationFeedOperatingSessionInitiateOutputModelInformationExportInstanceRecord getInformationExportInstanceRecord() {
    return informationExportInstanceRecord;
  }

  public void setInformationExportInstanceRecord(CRInformationFeedOperatingSessionInitiateOutputModelInformationExportInstanceRecord informationExportInstanceRecord) {
    this.informationExportInstanceRecord = informationExportInstanceRecord;
  }


}

