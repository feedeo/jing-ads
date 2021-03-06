/**
 * Dimension.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class Dimension implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(Dimension.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Dimension"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("height");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Height"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("width");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Width"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Integer height;
  private java.lang.Integer width;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public Dimension() {
  }

  public Dimension(
          java.lang.Integer height,
          java.lang.Integer width) {
    this.height = height;
    this.width = width;
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
   * Gets the height value for this Dimension.
   *
   * @return height
   */
  public java.lang.Integer getHeight() {
    return height;
  }

  /**
   * Sets the height value for this Dimension.
   *
   * @param height
   */
  public void setHeight(java.lang.Integer height) {
    this.height = height;
  }

  /**
   * Gets the width value for this Dimension.
   *
   * @return width
   */
  public java.lang.Integer getWidth() {
    return width;
  }

  /**
   * Sets the width value for this Dimension.
   *
   * @param width
   */
  public void setWidth(java.lang.Integer width) {
    this.width = width;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof Dimension)) return false;
    Dimension other = (Dimension) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.height == null && other.getHeight() == null) ||
                    (this.height != null &&
                            this.height.equals(other.getHeight()))) &&
            ((this.width == null && other.getWidth() == null) ||
                    (this.width != null &&
                            this.width.equals(other.getWidth())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getHeight() != null) {
      _hashCode += getHeight().hashCode();
    }
    if (getWidth() != null) {
      _hashCode += getWidth().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
