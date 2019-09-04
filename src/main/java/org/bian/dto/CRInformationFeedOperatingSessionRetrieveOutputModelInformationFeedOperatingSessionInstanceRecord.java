package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInformationFeedOperatingSessionRetrieveOutputModelInformationFeedOperatingSessionInstanceRecord
 */
public class CRInformationFeedOperatingSessionRetrieveOutputModelInformationFeedOperatingSessionInstanceRecord   {
  private String informationFeedProviderReference = null;

  private String informationFeedProviderServiceProfile = null;

  private String informationFeedProviderServiceReference = null;

  private String informationFeedServiceConfigurationSettingReference = null;

  private String informationFeedServiceConfigurationSetting = null;

  private String informationFeedServiceContentRecordReference = null;

  private Object informationFeedServiceContentRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the external information feed service supplier 
   * @return informationFeedProviderReference
  **/

  public String getInformationFeedProviderReference() {
    return informationFeedProviderReference;
  }

  public void setInformationFeedProviderReference(String informationFeedProviderReference) {
    this.informationFeedProviderReference = informationFeedProviderReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the information feed service configuration record that governs the access session 
   * @return informationFeedServiceConfigurationSettingReference
  **/

  public String getInformationFeedServiceConfigurationSettingReference() {
    return informationFeedServiceConfigurationSettingReference;
  }

  public void setInformationFeedServiceConfigurationSettingReference(String informationFeedServiceConfigurationSettingReference) {
    this.informationFeedServiceConfigurationSettingReference = informationFeedServiceConfigurationSettingReference;
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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the packets of information exchanged during the access session  
   * @return informationFeedServiceContentRecordReference
  **/

  public String getInformationFeedServiceContentRecordReference() {
    return informationFeedServiceContentRecordReference;
  }

  public void setInformationFeedServiceContentRecordReference(String informationFeedServiceContentRecordReference) {
    this.informationFeedServiceContentRecordReference = informationFeedServiceContentRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Is the record of the information exchanged that can be a structured list or log of updated data sets 
   * @return informationFeedServiceContentRecord
  **/

  public Object getInformationFeedServiceContentRecord() {
    return informationFeedServiceContentRecord;
  }

  public void setInformationFeedServiceContentRecord(Object informationFeedServiceContentRecord) {
    this.informationFeedServiceContentRecord = informationFeedServiceContentRecord;
  }


}

