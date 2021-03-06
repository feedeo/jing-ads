/**
 * GetConfigValueResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetConfigValueResponse implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetConfigValueResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetConfigValueResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConfigValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String configValue;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public GetConfigValueResponse() {
    }

    public GetConfigValueResponse(
            java.lang.String configValue) {
        this.configValue = configValue;
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
     * Gets the configValue value for this GetConfigValueResponse.
     *
     * @return configValue
     */
    public java.lang.String getConfigValue() {
        return configValue;
    }

    /**
     * Sets the configValue value for this GetConfigValueResponse.
     *
     * @param configValue
     */
    public void setConfigValue(java.lang.String configValue) {
        this.configValue = configValue;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetConfigValueResponse)) return false;
        GetConfigValueResponse other = (GetConfigValueResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.configValue == null && other.getConfigValue() == null) ||
                        (this.configValue != null &&
                                this.configValue.equals(other.getConfigValue())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getConfigValue() != null) {
            _hashCode += getConfigValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
