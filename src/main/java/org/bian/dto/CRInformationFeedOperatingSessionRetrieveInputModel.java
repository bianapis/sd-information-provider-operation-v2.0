package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInformationFeedOperatingSessionRetrieveInputModelInformationFeedOperatingSessionInstanceAnalysis;
import org.bian.dto.CRInformationFeedOperatingSessionRetrieveInputModelInformationFeedOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRInformationFeedOperatingSessionRetrieveInputModel
 */
public class CRInformationFeedOperatingSessionRetrieveInputModel   {
  private Object informationFeedOperatingSessionRetrieveActionTaskRecord = null;

  private String informationFeedOperatingSessionRetrieveActionRequest = null;

  private CRInformationFeedOperatingSessionRetrieveInputModelInformationFeedOperatingSessionInstanceReportRecord informationFeedOperatingSessionInstanceReportRecord = null;

  private CRInformationFeedOperatingSessionRetrieveInputModelInformationFeedOperatingSessionInstanceAnalysis informationFeedOperatingSessionInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return informationFeedOperatingSessionRetrieveActionRequest
  **/

  public String getInformationFeedOperatingSessionRetrieveActionRequest() {
    return informationFeedOperatingSessionRetrieveActionRequest;
  }

  public void setInformationFeedOperatingSessionRetrieveActionRequest(String informationFeedOperatingSessionRetrieveActionRequest) {
    this.informationFeedOperatingSessionRetrieveActionRequest = informationFeedOperatingSessionRetrieveActionRequest;
  }


  /**
   * Get informationFeedOperatingSessionInstanceReportRecord
   * @return informationFeedOperatingSessionInstanceReportRecord
  **/

  public CRInformationFeedOperatingSessionRetrieveInputModelInformationFeedOperatingSessionInstanceReportRecord getInformationFeedOperatingSessionInstanceReportRecord() {
    return informationFeedOperatingSessionInstanceReportRecord;
  }

  public void setInformationFeedOperatingSessionInstanceReportRecord(CRInformationFeedOperatingSessionRetrieveInputModelInformationFeedOperatingSessionInstanceReportRecord informationFeedOperatingSessionInstanceReportRecord) {
    this.informationFeedOperatingSessionInstanceReportRecord = informationFeedOperatingSessionInstanceReportRecord;
  }


  /**
   * Get informationFeedOperatingSessionInstanceAnalysis
   * @return informationFeedOperatingSessionInstanceAnalysis
  **/

  public CRInformationFeedOperatingSessionRetrieveInputModelInformationFeedOperatingSessionInstanceAnalysis getInformationFeedOperatingSessionInstanceAnalysis() {
    return informationFeedOperatingSessionInstanceAnalysis;
  }

  public void setInformationFeedOperatingSessionInstanceAnalysis(CRInformationFeedOperatingSessionRetrieveInputModelInformationFeedOperatingSessionInstanceAnalysis informationFeedOperatingSessionInstanceAnalysis) {
    this.informationFeedOperatingSessionInstanceAnalysis = informationFeedOperatingSessionInstanceAnalysis;
  }


}

