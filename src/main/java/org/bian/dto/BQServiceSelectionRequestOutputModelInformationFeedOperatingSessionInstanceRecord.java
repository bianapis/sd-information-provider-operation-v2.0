package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceSelectionRequestOutputModelInformationFeedOperatingSessionInstanceRecord
 */
public class BQServiceSelectionRequestOutputModelInformationFeedOperatingSessionInstanceRecord   {
  private String informationFeedServiceConfigurationSetting = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The information feed service configuration record that defines the way the service is configured, including allowed access and subscription details 
   * @return informationFeedServiceConfigurationSetting
  **/

  public String getInformationFeedServiceConfigurationSetting() {
    return informationFeedServiceConfigurationSetting;
  }

  public void setInformationFeedServiceConfigurationSetting(String informationFeedServiceConfigurationSetting) {
    this.informationFeedServiceConfigurationSetting = informationFeedServiceConfigurationSetting;
  }


}

