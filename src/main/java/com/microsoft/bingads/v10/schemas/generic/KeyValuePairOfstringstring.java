/**
 * KeyValuePairOfstringstring.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.schemas.generic;

public class KeyValuePairOfstringstring implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(KeyValuePairOfstringstring.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("key");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "key"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("value");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "value"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String key;
  private java.lang.String value;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public KeyValuePairOfstringstring() {
  }

  public KeyValuePairOfstringstring(
          java.lang.String key,
          java.lang.String value) {
    this.key = key;
    this.value = value;
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
   * Gets the key value for this KeyValuePairOfstringstring.
   *
   * @return key
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Sets the key value for this KeyValuePairOfstringstring.
   *
   * @param key
   */
  public void setKey(java.lang.String key) {
    this.key = key;
  }

  /**
   * Gets the value value for this KeyValuePairOfstringstring.
   *
   * @return value
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Sets the value value for this KeyValuePairOfstringstring.
   *
   * @param value
   */
  public void setValue(java.lang.String value) {
    this.value = value;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof KeyValuePairOfstringstring)) return false;
    KeyValuePairOfstringstring other = (KeyValuePairOfstringstring) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.key == null && other.getKey() == null) ||
                    (this.key != null &&
                            this.key.equals(other.getKey()))) &&
            ((this.value == null && other.getValue() == null) ||
                    (this.value != null &&
                            this.value.equals(other.getValue())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getKey() != null) {
      _hashCode += getKey().hashCode();
    }
    if (getValue() != null) {
      _hashCode += getValue().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
