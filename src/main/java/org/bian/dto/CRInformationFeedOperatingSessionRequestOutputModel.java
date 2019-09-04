package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInformationFeedOperatingSessionRequestOutputModelInformationFeedOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRInformationFeedOperatingSessionRequestOutputModel
 */
public class CRInformationFeedOperatingSessionRequestOutputModel   {
  private CRInformationFeedOperatingSessionRequestOutputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord = null;

  private String informationFeedOperatingSessionRequestActionTaskReference = null;

  private Object informationFeedOperatingSessionRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get informationFeedOperatingSessionInstanceRecord
   * @return informationFeedOperatingSessionInstanceRecord
  **/

  public CRInformationFeedOperatingSessionRequestOutputModelInformationFeedOperatingSessionInstanceRecord getInformationFeedOperatingSessionInstanceRecord() {
    return informationFeedOperatingSessionInstanceRecord;
  }

  public void setInformationFeedOperatingSessionInstanceRecord(CRInformationFeedOperatingSessionRequestOutputModelInformationFeedOperatingSessionInstanceRecord informationFeedOperatingSessionInstanceRecord) {
    this.informationFeedOperatingSessionInstanceRecord = informationFeedOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Information Feed Operating Session instance request service call 
   * @return informationFeedOperatingSessionRequestActionTaskReference
  **/

  public String getInformationFeedOperatingSessionRequestActionTaskReference() {
    return informationFeedOperatingSessionRequestActionTaskReference;
  }

  public void setInformationFeedOperatingSessionRequestActionTaskReference(String informationFeedOperatingSessionRequestActionTaskReference) {
    this.informationFeedOperatingSessionRequestActionTaskReference = informationFeedOperatingSessionRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
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

