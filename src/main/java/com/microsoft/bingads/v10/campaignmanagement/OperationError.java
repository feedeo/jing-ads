/**
 * OperationError.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class OperationError implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(OperationError.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "OperationError"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("code");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Code"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("details");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Details"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("errorCode");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ErrorCode"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("message");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Message"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Integer code;
  private java.lang.String details;
  private java.lang.String errorCode;
  private java.lang.String message;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public OperationError() {
  }

  public OperationError(
          java.lang.Integer code,
          java.lang.String details,
          java.lang.String errorCode,
          java.lang.String message) {
    this.code = code;
    this.details = details;
    this.errorCode = errorCode;
    this.message = message;
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
   * Gets the code value for this OperationError.
   *
   * @return code
   */
  public java.lang.Integer getCode() {
    return code;
  }

  /**
   * Sets the code value for this OperationError.
   *
   * @param code
   */
  public void setCode(java.lang.Integer code) {
    this.code = code;
  }

  /**
   * Gets the details value for this OperationError.
   *
   * @return details
   */
  public java.lang.String getDetails() {
    return details;
  }

  /**
   * Sets the details value for this OperationError.
   *
   * @param details
   */
  public void setDetails(java.lang.String details) {
    this.details = details;
  }

  /**
   * Gets the errorCode value for this OperationError.
   *
   * @return errorCode
   */
  public java.lang.String getErrorCode() {
    return errorCode;
  }

  /**
   * Sets the errorCode value for this OperationError.
   *
   * @param errorCode
   */
  public void setErrorCode(java.lang.String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * Gets the message value for this OperationError.
   *
   * @return message
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * Sets the message value for this OperationError.
   *
   * @param message
   */
  public void setMessage(java.lang.String message) {
    this.message = message;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof OperationError)) return false;
    OperationError other = (OperationError) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.code == null && other.getCode() == null) ||
                    (this.code != null &&
                            this.code.equals(other.getCode()))) &&
            ((this.details == null && other.getDetails() == null) ||
                    (this.details != null &&
                            this.details.equals(other.getDetails()))) &&
            ((this.errorCode == null && other.getErrorCode() == null) ||
                    (this.errorCode != null &&
                            this.errorCode.equals(other.getErrorCode()))) &&
            ((this.message == null && other.getMessage() == null) ||
                    (this.message != null &&
                            this.message.equals(other.getMessage())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getCode() != null) {
      _hashCode += getCode().hashCode();
    }
    if (getDetails() != null) {
      _hashCode += getDetails().hashCode();
    }
    if (getErrorCode() != null) {
      _hashCode += getErrorCode().hashCode();
    }
    if (getMessage() != null) {
      _hashCode += getMessage().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
