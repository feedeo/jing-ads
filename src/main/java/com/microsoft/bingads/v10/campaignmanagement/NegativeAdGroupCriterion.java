/**
 * NegativeAdGroupCriterion.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class NegativeAdGroupCriterion extends com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterion implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(NegativeAdGroupCriterion.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "NegativeAdGroupCriterion"));
  }

  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public NegativeAdGroupCriterion() {
  }

  public NegativeAdGroupCriterion(
          java.lang.Long adGroupId,
          com.microsoft.bingads.v10.campaignmanagement.Criterion criterion,
          java.lang.Long id,
          com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterionStatus status,
          java.lang.String type) {
    super(
            adGroupId,
            criterion,
            id,
            status,
            type);
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

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof NegativeAdGroupCriterion)) return false;
    NegativeAdGroupCriterion other = (NegativeAdGroupCriterion) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = super.equals(obj);
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = super.hashCode();
    __hashCodeCalc = false;
    return _hashCode;
  }

}
