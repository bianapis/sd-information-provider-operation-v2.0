package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInformationFeedOperatingSessionInitiateOutputModelInformationExportInstanceRecord;
import org.bian.dto.CRInformationFeedOperatingSessionInitiateOutputModelInformationImportInstanceRecord;
import org.bian.dto.CRInformationFeedOperatingSessionRetrieveOutputModelInformationFeedOperatingSessionInstanceAnalysis;
import org.bian.dto.CRInformationFeedOperatingSessionRetrieveOutputModelInformationFeedOperatingSessionInstanceRecord;
import org.bian.dto.CRInformationFeedOperatingSessionRetrieveOutputModelInformationFeedOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRInformationFeedOperatingSessionRetrieveOutputModel
 */
public class CRInformationFeedOperatingSessionRetrieveOutputModel   {
  private CRInformationFeedOperatingSessionRetrieveOutputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord = null;

  private String informationFeedOperatingSessionRetrieveActionTaskReference = null;

  private Object informationFeedOperatingSessionRetrieveActionTaskRecord = null;

  private String informationFeedOperatingSessionRetrieveActionResponse = null;

  private CRInformationFeedOperatingSessionRetrieveOutputModelInformationFeedOperatingSessionInstanceReportRecord informationFeedOperatingSessionInstanceReportRecord = null;

  private CRInformationFeedOperatingSessionRetrieveOutputModelInformationFeedOperatingSessionInstanceAnalysis informationFeedOperatingSessionInstanceAnalysis = null;

  private Object serviceSelectionInstanceRecord = null;

  private CRInformationFeedOperatingSessionInitiateOutputModelInformationImportInstanceRecord informationImportInstanceRecord = null;

  private CRInformationFeedOperatingSessionInitiateOutputModelInformationExportInstanceRecord informationExportInstanceRecord = null;


  /**
   * Get informationFeedOperatingSessionInstanceRecord
   * @return informationFeedOperatingSessionInstanceRecord
  **/

  public CRInformationFeedOperatingSessionRetrieveOutputModelInformationFeedOperatingSessionInstanceRecord getInformationFeedOperatingSessionInstanceRecord() {
    return informationFeedOperatingSessionInstanceRecord;
  }

  public void setInformationFeedOperatingSessionInstanceRecord(CRInformationFeedOperatingSessionRetrieveOutputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord) {
    this.informationFeedOperatingSessionInstanceRecord = informationFeedOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Information Feed Operating Session instance retrieve service call 
   * @return informationFeedOperatingSessionRetrieveActionTaskReference
  **/

  public String getInformationFeedOperatingSessionRetrieveActionTaskReference() {
    return informationFeedOperatingSessionRetrieveActionTaskReference;
  }

  public void setInformationFeedOperatingSessionRetrieveActionTaskReference(String informationFeedOperatingSessionRetrieveActionTaskReference) {
    this.informationFeedOperatingSessionRetrieveActionTaskReference = informationFeedOperatingSessionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return informationFeedOperatingSessionRetrieveActionTaskRecord
  **/

  public Object getInformationFeedOperatingSessionRetrieveActionTaskRecord() {
    return informationFeedOperatingSessionRetrieveActionTaskRecord;
  }

  public void setInformationFeedOperatingSessionRetrieveActionTaskRecord(Object informationFeedOperatingSessionRetrieveActionTaskRecord) {
    this.informationFeedOperatingSessionRetrieveActionTaskRecord = informationFeedOperatingSessionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return informationFeedOperatingSessionRetrieveActionResponse
  **/

  public String getInformationFeedOperatingSessionRetrieveActionResponse() {
    return informationFeedOperatingSessionRetrieveActionResponse;
  }

  public void setInformationFeedOperatingSessionRetrieveActionResponse(String informationFeedOperatingSessionRetrieveActionResponse) {
    this.informationFeedOperatingSessionRetrieveActionResponse = informationFeedOperatingSessionRetrieveActionResponse;
  }


  /**
   * Get informationFeedOperatingSessionInstanceReportRecord
   * @return informationFeedOperatingSessionInstanceReportRecord
  **/

  public CRInformationFeedOperatingSessionRetrieveOutputModelInformationFeedOperatingSessionInstanceReportRecord getInformationFeedOperatingSessionInstanceReportRecord() {
    return informationFeedOperatingSessionInstanceReportRecord;
  }

  public void setInformationFeedOperatingSessionInstanceReportRecord(CRInformationFeedOperatingSessionRetrieveOutputModelInformationFeedOperatingSessionInstanceReportRecord informationFeedOperatingSessionInstanceReportRecord) {
    this.informationFeedOperatingSessionInstanceReportRecord = informationFeedOperatingSessionInstanceReportRecord;
  }


  /**
   * Get informationFeedOperatingSessionInstanceAnalysis
   * @return informationFeedOperatingSessionInstanceAnalysis
  **/

  public CRInformationFeedOperatingSessionRetrieveOutputModelInformationFeedOperatingSessionInstanceAnalysis getInformationFeedOperatingSessionInstanceAnalysis() {
    return informationFeedOperatingSessionInstanceAnalysis;
  }

  public void setInformationFeedOperatingSessionInstanceAnalysis(CRInformationFeedOperatingSessionRetrieveOutputModelInformationFeedOperatingSessionInstanceAnalysis informationFeedOperatingSessionInstanceAnalysis) {
    this.informationFeedOperatingSessionInstanceAnalysis = informationFeedOperatingSessionInstanceAnalysis;
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

