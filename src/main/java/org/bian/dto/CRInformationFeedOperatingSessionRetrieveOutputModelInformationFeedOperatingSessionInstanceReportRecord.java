package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInformationFeedOperatingSessionRetrieveOutputModelInformationFeedOperatingSessionInstanceReportRecord
 */
public class CRInformationFeedOperatingSessionRetrieveOutputModelInformationFeedOperatingSessionInstanceReportRecord   {
  private String informationFeedOperatingSessionInstanceReportData = null;

  private String informationFeedOperatingSessionInstanceReportType = null;

  private Object informationFeedOperatingSessionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return informationFeedOperatingSessionInstanceReportData
  **/

  public String getInformationFeedOperatingSessionInstanceReportData() {
    return informationFeedOperatingSessionInstanceReportData;
  }

  public void setInformationFeedOperatingSessionInstanceReportData(String informationFeedOperatingSessionInstanceReportData) {
    this.informationFeedOperatingSessionInstanceReportData = informationFeedOperatingSessionInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return informationFeedOperatingSessionInstanceReportType
  **/

  public String getInformationFeedOperatingSessionInstanceReportType() {
    return informationFeedOperatingSessionInstanceReportType;
  }

  public void setInformationFeedOperatingSessionInstanceReportType(String informationFeedOperatingSessionInstanceReportType) {
    this.informationFeedOperatingSessionInstanceReportType = informationFeedOperatingSessionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return informationFeedOperatingSessionInstanceReport
  **/

  public Object getInformationFeedOperatingSessionInstanceReport() {
    return informationFeedOperatingSessionInstanceReport;
  }

  public void setInformationFeedOperatingSessionInstanceReport(Object informationFeedOperatingSessionInstanceReport) {
    this.informationFeedOperatingSessionInstanceReport = informationFeedOperatingSessionInstanceReport;
  }


}

