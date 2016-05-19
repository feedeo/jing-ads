/**
 * GetEstimatedPositionByKeywordsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight;

public class GetEstimatedPositionByKeywordsRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GetEstimatedPositionByKeywordsRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetEstimatedPositionByKeywordsRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("keywords");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "Keywords"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("maxBid");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "MaxBid"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("language");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "Language"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("publisherCountries");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "PublisherCountries"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("currency");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "Currency"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Currency"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("matchTypes");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "MatchTypes"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MatchType"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MatchType"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("campaignId");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "CampaignId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("adGroupId");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "AdGroupId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String[] keywords;
  private java.lang.Double maxBid;
  private java.lang.String language;
  private java.lang.String[] publisherCountries;
  private com.microsoft.bingads.v10.adinsight.entity.Currency currency;
  private com.microsoft.bingads.v10.adinsight.entity.MatchType[] matchTypes;
  private java.lang.Long campaignId;
  private java.lang.Long adGroupId;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GetEstimatedPositionByKeywordsRequest() {
  }

  public GetEstimatedPositionByKeywordsRequest(
          java.lang.String[] keywords,
          java.lang.Double maxBid,
          java.lang.String language,
          java.lang.String[] publisherCountries,
          com.microsoft.bingads.v10.adinsight.entity.Currency currency,
          com.microsoft.bingads.v10.adinsight.entity.MatchType[] matchTypes,
          java.lang.Long campaignId,
          java.lang.Long adGroupId) {
    this.keywords = keywords;
    this.maxBid = maxBid;
    this.language = language;
    this.publisherCountries = publisherCountries;
    this.currency = currency;
    this.matchTypes = matchTypes;
    this.campaignId = campaignId;
    this.adGroupId = adGroupId;
  }

  /**
   * Return type metadata object
   */
  public static org.apache.axis.description.TypeDesc getTypeDesc() {
    return typeDesc;
  }

  /**
   * Get Custom Serializer
   */
  public static org.apache.axis.encoding.Serializer getSerializer(
          java.lang.String mechType,
          java.lang.Class _javaType,
          javax.xml.namespace.QName _xmlType) {
    return
            new org.apache.axis.encoding.ser.BeanSerializer(
                    _javaType, _xmlType, typeDesc);
  }

  /**
   * Get Custom Deserializer
   */
  public static org.apache.axis.encoding.Deserializer getDeserializer(
          java.lang.String mechType,
          java.lang.Class _javaType,
          javax.xml.namespace.QName _xmlType) {
    return
            new org.apache.axis.encoding.ser.BeanDeserializer(
                    _javaType, _xmlType, typeDesc);
  }

  /**
   * Gets the keywords value for this GetEstimatedPositionByKeywordsRequest.
   *
   * @return keywords
   */
  public java.lang.String[] getKeywords() {
    return keywords;
  }

  /**
   * Sets the keywords value for this GetEstimatedPositionByKeywordsRequest.
   *
   * @param keywords
   */
  public void setKeywords(java.lang.String[] keywords) {
    this.keywords = keywords;
  }

  /**
   * Gets the maxBid value for this GetEstimatedPositionByKeywordsRequest.
   *
   * @return maxBid
   */
  public java.lang.Double getMaxBid() {
    return maxBid;
  }

  /**
   * Sets the maxBid value for this GetEstimatedPositionByKeywordsRequest.
   *
   * @param maxBid
   */
  public void setMaxBid(java.lang.Double maxBid) {
    this.maxBid = maxBid;
  }

  /**
   * Gets the language value for this GetEstimatedPositionByKeywordsRequest.
   *
   * @return language
   */
  public java.lang.String getLanguage() {
    return language;
  }

  /**
   * Sets the language value for this GetEstimatedPositionByKeywordsRequest.
   *
   * @param language
   */
  public void setLanguage(java.lang.String language) {
    this.language = language;
  }

  /**
   * Gets the publisherCountries value for this GetEstimatedPositionByKeywordsRequest.
   *
   * @return publisherCountries
   */
  public java.lang.String[] getPublisherCountries() {
    return publisherCountries;
  }

  /**
   * Sets the publisherCountries value for this GetEstimatedPositionByKeywordsRequest.
   *
   * @param publisherCountries
   */
  public void setPublisherCountries(java.lang.String[] publisherCountries) {
    this.publisherCountries = publisherCountries;
  }

  /**
   * Gets the currency value for this GetEstimatedPositionByKeywordsRequest.
   *
   * @return currency
   */
  public com.microsoft.bingads.v10.adinsight.entity.Currency getCurrency() {
    return currency;
  }

  /**
   * Sets the currency value for this GetEstimatedPositionByKeywordsRequest.
   *
   * @param currency
   */
  public void setCurrency(com.microsoft.bingads.v10.adinsight.entity.Currency currency) {
    this.currency = currency;
  }

  /**
   * Gets the matchTypes value for this GetEstimatedPositionByKeywordsRequest.
   *
   * @return matchTypes
   */
  public com.microsoft.bingads.v10.adinsight.entity.MatchType[] getMatchTypes() {
    return matchTypes;
  }

  /**
   * Sets the matchTypes value for this GetEstimatedPositionByKeywordsRequest.
   *
   * @param matchTypes
   */
  public void setMatchTypes(com.microsoft.bingads.v10.adinsight.entity.MatchType[] matchTypes) {
    this.matchTypes = matchTypes;
  }

  /**
   * Gets the campaignId value for this GetEstimatedPositionByKeywordsRequest.
   *
   * @return campaignId
   */
  public java.lang.Long getCampaignId() {
    return campaignId;
  }

  /**
   * Sets the campaignId value for this GetEstimatedPositionByKeywordsRequest.
   *
   * @param campaignId
   */
  public void setCampaignId(java.lang.Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Gets the adGroupId value for this GetEstimatedPositionByKeywordsRequest.
   *
   * @return adGroupId
   */
  public java.lang.Long getAdGroupId() {
    return adGroupId;
  }

  /**
   * Sets the adGroupId value for this GetEstimatedPositionByKeywordsRequest.
   *
   * @param adGroupId
   */
  public void setAdGroupId(java.lang.Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GetEstimatedPositionByKeywordsRequest)) return false;
    GetEstimatedPositionByKeywordsRequest other = (GetEstimatedPositionByKeywordsRequest) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.keywords == null && other.getKeywords() == null) ||
                    (this.keywords != null &&
                            java.util.Arrays.equals(this.keywords, other.getKeywords()))) &&
            ((this.maxBid == null && other.getMaxBid() == null) ||
                    (this.maxBid != null &&
                            this.maxBid.equals(other.getMaxBid()))) &&
            ((this.language == null && other.getLanguage() == null) ||
                    (this.language != null &&
                            this.language.equals(other.getLanguage()))) &&
            ((this.publisherCountries == null && other.getPublisherCountries() == null) ||
                    (this.publisherCountries != null &&
                            java.util.Arrays.equals(this.publisherCountries, other.getPublisherCountries()))) &&
            ((this.currency == null && other.getCurrency() == null) ||
                    (this.currency != null &&
                            this.currency.equals(other.getCurrency()))) &&
            ((this.matchTypes == null && other.getMatchTypes() == null) ||
                    (this.matchTypes != null &&
                            java.util.Arrays.equals(this.matchTypes, other.getMatchTypes()))) &&
            ((this.campaignId == null && other.getCampaignId() == null) ||
                    (this.campaignId != null &&
                            this.campaignId.equals(other.getCampaignId()))) &&
            ((this.adGroupId == null && other.getAdGroupId() == null) ||
                    (this.adGroupId != null &&
                            this.adGroupId.equals(other.getAdGroupId())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getKeywords() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getKeywords());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getKeywords(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getMaxBid() != null) {
      _hashCode += getMaxBid().hashCode();
    }
    if (getLanguage() != null) {
      _hashCode += getLanguage().hashCode();
    }
    if (getPublisherCountries() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getPublisherCountries());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getPublisherCountries(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getCurrency() != null) {
      _hashCode += getCurrency().hashCode();
    }
    if (getMatchTypes() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getMatchTypes());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getMatchTypes(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getCampaignId() != null) {
      _hashCode += getCampaignId().hashCode();
    }
    if (getAdGroupId() != null) {
      _hashCode += getAdGroupId().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
