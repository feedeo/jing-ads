/**
 * SetAccountPropertiesRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class SetAccountPropertiesRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SetAccountPropertiesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetAccountPropertiesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AccountProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AccountProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AccountProperty"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.AccountProperty[] accountProperties;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public SetAccountPropertiesRequest() {
    }

    public SetAccountPropertiesRequest(
            com.microsoft.bingads.v11.campaignmanagement.AccountProperty[] accountProperties) {
        this.accountProperties = accountProperties;
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
     * Gets the accountProperties value for this SetAccountPropertiesRequest.
     *
     * @return accountProperties
     */
    public com.microsoft.bingads.v11.campaignmanagement.AccountProperty[] getAccountProperties() {
        return accountProperties;
    }

    /**
     * Sets the accountProperties value for this SetAccountPropertiesRequest.
     *
     * @param accountProperties
     */
    public void setAccountProperties(com.microsoft.bingads.v11.campaignmanagement.AccountProperty[] accountProperties) {
        this.accountProperties = accountProperties;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetAccountPropertiesRequest)) return false;
        SetAccountPropertiesRequest other = (SetAccountPropertiesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.accountProperties == null && other.getAccountProperties() == null) ||
                        (this.accountProperties != null &&
                                java.util.Arrays.equals(this.accountProperties, other.getAccountProperties())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAccountProperties() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAccountProperties());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountProperties(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
