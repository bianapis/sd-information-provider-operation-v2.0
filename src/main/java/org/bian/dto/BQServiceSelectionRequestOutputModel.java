package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceSelectionRequestOutputModelInformationFeedOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQServiceSelectionRequestOutputModel
 */
public class BQServiceSelectionRequestOutputModel   {
  private BQServiceSelectionRequestOutputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord = null;

  private Object serviceSelectionInstanceRecord = null;

  private String serviceSelectionRequestActionTaskReference = null;

  private Object serviceSelectionRequestActionTaskRecord = null;

  private String serviceSelectionRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get informationFeedOperatingSessionInstanceRecord
   * @return informationFeedOperatingSessionInstanceRecord
  **/

  public BQServiceSelectionRequestOutputModelInformationFeedOperatingSessionInstanceRecord getInformationFeedOperatingSessionInstanceRecord() {
    return informationFeedOperatingSessionInstanceRecord;
  }

  public void setInformationFeedOperatingSessionInstanceRecord(BQServiceSelectionRequestOutputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord) {
    this.informationFeedOperatingSessionInstanceRecord = informationFeedOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The behavior qualifier record informationFeedServiceContentRecordSubscriptionResponse:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: Is the detail of the service subscription response 
   * @return serviceSelectionInstanceRecord
  **/

  public Object getServiceSelectionInstanceRecord() {
    return serviceSelectionInstanceRecord;
  }

  public void setServiceSelectionInstanceRecord(Object serviceSelectionInstanceRecord) {
    this.serviceSelectionInstanceRecord = serviceSelectionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Service Selection instance request service call 
   * @return serviceSelectionRequestActionTaskReference
  **/

  public String getServiceSelectionRequestActionTaskReference() {
    return serviceSelectionRequestActionTaskReference;
  }

  public void setServiceSelectionRequestActionTaskReference(String serviceSelectionRequestActionTaskReference) {
    this.serviceSelectionRequestActionTaskReference = serviceSelectionRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return serviceSelectionRequestActionTaskRecord
  **/

  public Object getServiceSelectionRequestActionTaskRecord() {
    return serviceSelectionRequestActionTaskRecord;
  }

  public void setServiceSelectionRequestActionTaskRecord(Object serviceSelectionRequestActionTaskRecord) {
    this.serviceSelectionRequestActionTaskRecord = serviceSelectionRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Service Selection service request record 
   * @return serviceSelectionRequestRecordReference
  **/

  public String getServiceSelectionRequestRecordReference() {
    return serviceSelectionRequestRecordReference;
  }

  public void setServiceSelectionRequestRecordReference(String serviceSelectionRequestRecordReference) {
    this.serviceSelectionRequestRecordReference = serviceSelectionRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

