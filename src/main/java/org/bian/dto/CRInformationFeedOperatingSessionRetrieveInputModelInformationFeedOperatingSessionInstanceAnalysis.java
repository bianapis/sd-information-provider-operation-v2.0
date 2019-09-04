package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInformationFeedOperatingSessionRetrieveInputModelInformationFeedOperatingSessionInstanceAnalysis
 */
public class CRInformationFeedOperatingSessionRetrieveInputModelInformationFeedOperatingSessionInstanceAnalysis   {
  private String informationFeedOperatingSessionInstanceAnalysisReference = null;

  private String informationFeedOperatingSessionInstanceAnalysisReportType = null;

  private String informationFeedOperatingSessionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return informationFeedOperatingSessionInstanceAnalysisReference
  **/

  public String getInformationFeedOperatingSessionInstanceAnalysisReference() {
    return informationFeedOperatingSessionInstanceAnalysisReference;
  }

  public void setInformationFeedOperatingSessionInstanceAnalysisReference(String informationFeedOperatingSessionInstanceAnalysisReference) {
    this.informationFeedOperatingSessionInstanceAnalysisReference = informationFeedOperatingSessionInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return informationFeedOperatingSessionInstanceAnalysisParameters
  **/

  public String getInformationFeedOperatingSessionInstanceAnalysisParameters() {
    return informationFeedOperatingSessionInstanceAnalysisParameters;
  }

  public void setInformationFeedOperatingSessionInstanceAnalysisParameters(String informationFeedOperatingSessionInstanceAnalysisParameters) {
    this.informationFeedOperatingSessionInstanceAnalysisParameters = informationFeedOperatingSessionInstanceAnalysisParameters;
  }


}

