/**
 * GetAdExtensionsEditorialReasonsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class GetAdExtensionsEditorialReasonsRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GetAdExtensionsEditorialReasonsRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdExtensionsEditorialReasonsRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("accountId");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AccountId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("adExtensionIdToEntityIdAssociations");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionIdToEntityIdAssociations"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionIdToEntityIdAssociation"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionIdToEntityIdAssociation"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("associationType");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AssociationType"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AssociationType"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Long accountId;
  private com.microsoft.bingads.v10.campaignmanagement.AdExtensionIdToEntityIdAssociation[] adExtensionIdToEntityIdAssociations;
  private com.microsoft.bingads.v10.campaignmanagement.AssociationType associationType;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GetAdExtensionsEditorialReasonsRequest() {
  }

  public GetAdExtensionsEditorialReasonsRequest(
          java.lang.Long accountId,
          com.microsoft.bingads.v10.campaignmanagement.AdExtensionIdToEntityIdAssociation[] adExtensionIdToEntityIdAssociations,
          com.microsoft.bingads.v10.campaignmanagement.AssociationType associationType) {
    this.accountId = accountId;
    this.adExtensionIdToEntityIdAssociations = adExtensionIdToEntityIdAssociations;
    this.associationType = associationType;
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
   * Gets the accountId value for this GetAdExtensionsEditorialReasonsRequest.
   *
   * @return accountId
   */
  public java.lang.Long getAccountId() {
    return accountId;
  }

  /**
   * Sets the accountId value for this GetAdExtensionsEditorialReasonsRequest.
   *
   * @param accountId
   */
  public void setAccountId(java.lang.Long accountId) {
    this.accountId = accountId;
  }

  /**
   * Gets the adExtensionIdToEntityIdAssociations value for this GetAdExtensionsEditorialReasonsRequest.
   *
   * @return adExtensionIdToEntityIdAssociations
   */
  public com.microsoft.bingads.v10.campaignmanagement.AdExtensionIdToEntityIdAssociation[] getAdExtensionIdToEntityIdAssociations() {
    return adExtensionIdToEntityIdAssociations;
  }

  /**
   * Sets the adExtensionIdToEntityIdAssociations value for this GetAdExtensionsEditorialReasonsRequest.
   *
   * @param adExtensionIdToEntityIdAssociations
   */
  public void setAdExtensionIdToEntityIdAssociations(com.microsoft.bingads.v10.campaignmanagement.AdExtensionIdToEntityIdAssociation[] adExtensionIdToEntityIdAssociations) {
    this.adExtensionIdToEntityIdAssociations = adExtensionIdToEntityIdAssociations;
  }

  /**
   * Gets the associationType value for this GetAdExtensionsEditorialReasonsRequest.
   *
   * @return associationType
   */
  public com.microsoft.bingads.v10.campaignmanagement.AssociationType getAssociationType() {
    return associationType;
  }

  /**
   * Sets the associationType value for this GetAdExtensionsEditorialReasonsRequest.
   *
   * @param associationType
   */
  public void setAssociationType(com.microsoft.bingads.v10.campaignmanagement.AssociationType associationType) {
    this.associationType = associationType;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GetAdExtensionsEditorialReasonsRequest)) return false;
    GetAdExtensionsEditorialReasonsRequest other = (GetAdExtensionsEditorialReasonsRequest) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.accountId == null && other.getAccountId() == null) ||
                    (this.accountId != null &&
                            this.accountId.equals(other.getAccountId()))) &&
            ((this.adExtensionIdToEntityIdAssociations == null && other.getAdExtensionIdToEntityIdAssociations() == null) ||
                    (this.adExtensionIdToEntityIdAssociations != null &&
                            java.util.Arrays.equals(this.adExtensionIdToEntityIdAssociations, other.getAdExtensionIdToEntityIdAssociations()))) &&
            ((this.associationType == null && other.getAssociationType() == null) ||
                    (this.associationType != null &&
                            this.associationType.equals(other.getAssociationType())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getAccountId() != null) {
      _hashCode += getAccountId().hashCode();
    }
    if (getAdExtensionIdToEntityIdAssociations() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getAdExtensionIdToEntityIdAssociations());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getAdExtensionIdToEntityIdAssociations(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getAssociationType() != null) {
      _hashCode += getAssociationType().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
