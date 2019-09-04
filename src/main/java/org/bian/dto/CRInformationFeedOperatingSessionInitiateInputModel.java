package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInformationFeedOperatingSessionInitiateInputModelInformationFeedOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRInformationFeedOperatingSessionInitiateInputModel
 */
public class CRInformationFeedOperatingSessionInitiateInputModel   {
  private String informationProviderOperationServicingSessionReference = null;

  private Object informationFeedOperatingSessionInitiateActionRecord = null;

  private String informationFeedOperatingSessionInstanceStatus = null;

  private CRInformationFeedOperatingSessionInitiateInputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord = null;

  private Object serviceSelectionInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return informationProviderOperationServicingSessionReference
  **/

  public String getInformationProviderOperationServicingSessionReference() {
    return informationProviderOperationServicingSessionReference;
  }

  public void setInformationProviderOperationServicingSessionReference(String informationProviderOperationServicingSessionReference) {
    this.informationProviderOperationServicingSessionReference = informationProviderOperationServicingSessionReference;
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

  public CRInformationFeedOperatingSessionInitiateInputModelInformationFeedOperatingSessionInstanceRecord getInformationFeedOperatingSessionInstanceRecord() {
    return informationFeedOperatingSessionInstanceRecord;
  }

  public void setInformationFeedOperatingSessionInstanceRecord(CRInformationFeedOperatingSessionInitiateInputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord) {
    this.informationFeedOperatingSessionInstanceRecord = informationFeedOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The behavior qualifier record informationFeedServiceContentRecordSubscriptionRequest:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: Is the detail of the information feed service subscription request 
   * @return serviceSelectionInstanceRecord
  **/

  public Object getServiceSelectionInstanceRecord() {
    return serviceSelectionInstanceRecord;
  }

  public void setServiceSelectionInstanceRecord(Object serviceSelectionInstanceRecord) {
    this.serviceSelectionInstanceRecord = serviceSelectionInstanceRecord;
  }


}

