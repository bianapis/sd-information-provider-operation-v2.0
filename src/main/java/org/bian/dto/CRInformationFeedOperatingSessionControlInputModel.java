package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInformationFeedOperatingSessionControlInputModelInformationFeedOperatingSessionControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRInformationFeedOperatingSessionControlInputModel
 */
public class CRInformationFeedOperatingSessionControlInputModel   {
  private String informationProviderOperationServicingSessionReference = null;

  private String informationFeedOperatingSessionInstanceReference = null;

  private Object informationFeedOperatingSessionControlActionTaskRecord = null;

  private CRInformationFeedOperatingSessionControlInputModelInformationFeedOperatingSessionControlActionRequest informationFeedOperatingSessionControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return informationFeedOperatingSessionControlActionTaskRecord
  **/

  public Object getInformationFeedOperatingSessionControlActionTaskRecord() {
    return informationFeedOperatingSessionControlActionTaskRecord;
  }

  public void setInformationFeedOperatingSessionControlActionTaskRecord(Object informationFeedOperatingSessionControlActionTaskRecord) {
    this.informationFeedOperatingSessionControlActionTaskRecord = informationFeedOperatingSessionControlActionTaskRecord;
  }


  /**
   * Get informationFeedOperatingSessionControlActionRequest
   * @return informationFeedOperatingSessionControlActionRequest
  **/

  public CRInformationFeedOperatingSessionControlInputModelInformationFeedOperatingSessionControlActionRequest getInformationFeedOperatingSessionControlActionRequest() {
    return informationFeedOperatingSessionControlActionRequest;
  }

  public void setInformationFeedOperatingSessionControlActionRequest(CRInformationFeedOperatingSessionControlInputModelInformationFeedOperatingSessionControlActionRequest informationFeedOperatingSessionControlActionRequest) {
    this.informationFeedOperatingSessionControlActionRequest = informationFeedOperatingSessionControlActionRequest;
  }


}

