package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInformationFeedOperatingSessionRequestInputModelInformationFeedOperatingSessionInstanceRecord;
import org.bian.dto.CRInformationFeedOperatingSessionRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRInformationFeedOperatingSessionRequestInputModel
 */
public class CRInformationFeedOperatingSessionRequestInputModel   {
  private String informationProviderOperationServicingSessionReference = null;

  private String informationFeedOperatingSessionInstanceReference = null;

  private CRInformationFeedOperatingSessionRequestInputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord = null;

  private Object informationFeedOperatingSessionRequestActionTaskRecord = null;

  private CRInformationFeedOperatingSessionRequestInputModelRequestRecordType requestRecordType = null;


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
   * Get informationFeedOperatingSessionInstanceRecord
   * @return informationFeedOperatingSessionInstanceRecord
  **/

  public CRInformationFeedOperatingSessionRequestInputModelInformationFeedOperatingSessionInstanceRecord getInformationFeedOperatingSessionInstanceRecord() {
    return informationFeedOperatingSessionInstanceRecord;
  }

  public void setInformationFeedOperatingSessionInstanceRecord(CRInformationFeedOperatingSessionRequestInputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord) {
    this.informationFeedOperatingSessionInstanceRecord = informationFeedOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return informationFeedOperatingSessionRequestActionTaskRecord
  **/

  public Object getInformationFeedOperatingSessionRequestActionTaskRecord() {
    return informationFeedOperatingSessionRequestActionTaskRecord;
  }

  public void setInformationFeedOperatingSessionRequestActionTaskRecord(Object informationFeedOperatingSessionRequestActionTaskRecord) {
    this.informationFeedOperatingSessionRequestActionTaskRecord = informationFeedOperatingSessionRequestActionTaskRecord;
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

