package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInformationFeedOperatingSessionRetrieveOutputModelInformationFeedOperatingSessionInstanceAnalysis
 */
public class CRInformationFeedOperatingSessionRetrieveOutputModelInformationFeedOperatingSessionInstanceAnalysis   {
  private String informationFeedOperatingSessionInstanceAnalysisData = null;

  private String informationFeedOperatingSessionInstanceAnalysisReportType = null;

  private Object informationFeedOperatingSessionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return informationFeedOperatingSessionInstanceAnalysisData
  **/

  public String getInformationFeedOperatingSessionInstanceAnalysisData() {
    return informationFeedOperatingSessionInstanceAnalysisData;
  }

  public void setInformationFeedOperatingSessionInstanceAnalysisData(String informationFeedOperatingSessionInstanceAnalysisData) {
    this.informationFeedOperatingSessionInstanceAnalysisData = informationFeedOperatingSessionInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return informationFeedOperatingSessionInstanceAnalysisReportType
  **/

  public String getInformationFeedOperatingSessionInstanceAnalysisReportType() {
    return informationFeedOperatingSessionInstanceAnalysisReportType;
  }

  public void setInformationFeedOperatingSessionInstanceAnalysisReportType(String informationFeedOperatingSessionInstanceAnalysisReportType) {
    this.informationFeedOperatingSessionInstanceAnalysisReportType = informationFeedOperatingSessionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return informationFeedOperatingSessionInstanceAnalysisReport
  **/

  public Object getInformationFeedOperatingSessionInstanceAnalysisReport() {
    return informationFeedOperatingSessionInstanceAnalysisReport;
  }

  public void setInformationFeedOperatingSessionInstanceAnalysisReport(Object informationFeedOperatingSessionInstanceAnalysisReport) {
    this.informationFeedOperatingSessionInstanceAnalysisReport = informationFeedOperatingSessionInstanceAnalysisReport;
  }


}

