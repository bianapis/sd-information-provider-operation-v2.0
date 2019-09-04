package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInformationFeedOperatingSessionRequestOutputModelInformationFeedOperatingSessionInstanceRecord
 */
public class CRInformationFeedOperatingSessionRequestOutputModelInformationFeedOperatingSessionInstanceRecord   {
  private String informationFeedProviderServiceProfile = null;

  private String informationFeedProviderServiceReference = null;

  private String informationFeedServiceConfigurationSetting = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Sets out the range of information feed services available from the information provider - possibly with some form of selection menu 
   * @return informationFeedProviderServiceProfile
  **/

  public String getInformationFeedProviderServiceProfile() {
    return informationFeedProviderServiceProfile;
  }

  public void setInformationFeedProviderServiceProfile(String informationFeedProviderServiceProfile) {
    this.informationFeedProviderServiceProfile = informationFeedProviderServiceProfile;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the subscribed to information feed service from the information provider accessed in this session 
   * @return informationFeedProviderServiceReference
  **/

  public String getInformationFeedProviderServiceReference() {
    return informationFeedProviderServiceReference;
  }

  public void setInformationFeedProviderServiceReference(String informationFeedProviderServiceReference) {
    this.informationFeedProviderServiceReference = informationFeedProviderServiceReference;
  }


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

