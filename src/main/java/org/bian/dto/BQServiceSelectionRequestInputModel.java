package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceSelectionRequestInputModelInformationFeedOperatingSessionInstanceRecord;
import org.bian.dto.CRInformationFeedOperatingSessionRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQServiceSelectionRequestInputModel
 */
public class BQServiceSelectionRequestInputModel   {
  private BQServiceSelectionRequestInputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord = null;

  private String informationFeedOperatingSessionInstanceReference = null;

  private String serviceSelectionInstanceReference = null;

  private Object serviceSelectionInstanceRecord = null;

  private Object serviceSelectionRequestActionTaskRecord = null;

  private CRInformationFeedOperatingSessionRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * Get informationFeedOperatingSessionInstanceRecord
   * @return informationFeedOperatingSessionInstanceRecord
  **/

  public BQServiceSelectionRequestInputModelInformationFeedOperatingSessionInstanceRecord getInformationFeedOperatingSessionInstanceRecord() {
    return informationFeedOperatingSessionInstanceRecord;
  }

  public void setInformationFeedOperatingSessionInstanceRecord(BQServiceSelectionRequestInputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Service Selection instance 
   * @return serviceSelectionInstanceReference
  **/

  public String getServiceSelectionInstanceReference() {
    return serviceSelectionInstanceReference;
  }

  public void setServiceSelectionInstanceReference(String serviceSelectionInstanceReference) {
    this.serviceSelectionInstanceReference = serviceSelectionInstanceReference;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRInformationFeedOperatingSessionRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRInformationFeedOperatingSessionRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

