/**
 * AddNegativeKeywordsToEntitiesResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class AddNegativeKeywordsToEntitiesResponse implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AddNegativeKeywordsToEntitiesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddNegativeKeywordsToEntitiesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negativeKeywordIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "NegativeKeywordIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "IdCollection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "IdCollection"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nestedPartialErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "NestedPartialErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BatchErrorCollection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BatchErrorCollection"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.IdCollection[] negativeKeywordIds;
    private com.microsoft.bingads.v11.campaignmanagement.BatchErrorCollection[] nestedPartialErrors;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public AddNegativeKeywordsToEntitiesResponse() {
    }


    public AddNegativeKeywordsToEntitiesResponse(
            com.microsoft.bingads.v11.campaignmanagement.IdCollection[] negativeKeywordIds,
            com.microsoft.bingads.v11.campaignmanagement.BatchErrorCollection[] nestedPartialErrors) {
        this.negativeKeywordIds = negativeKeywordIds;
        this.nestedPartialErrors = nestedPartialErrors;
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
     * Gets the negativeKeywordIds value for this AddNegativeKeywordsToEntitiesResponse.
     *
     * @return negativeKeywordIds
     */
    public com.microsoft.bingads.v11.campaignmanagement.IdCollection[] getNegativeKeywordIds() {
        return negativeKeywordIds;
    }

    /**
     * Sets the negativeKeywordIds value for this AddNegativeKeywordsToEntitiesResponse.
     *
     * @param negativeKeywordIds
     */
    public void setNegativeKeywordIds(com.microsoft.bingads.v11.campaignmanagement.IdCollection[] negativeKeywordIds) {
        this.negativeKeywordIds = negativeKeywordIds;
    }

    /**
     * Gets the nestedPartialErrors value for this AddNegativeKeywordsToEntitiesResponse.
     *
     * @return nestedPartialErrors
     */
    public com.microsoft.bingads.v11.campaignmanagement.BatchErrorCollection[] getNestedPartialErrors() {
        return nestedPartialErrors;
    }

    /**
     * Sets the nestedPartialErrors value for this AddNegativeKeywordsToEntitiesResponse.
     *
     * @param nestedPartialErrors
     */
    public void setNestedPartialErrors(com.microsoft.bingads.v11.campaignmanagement.BatchErrorCollection[] nestedPartialErrors) {
        this.nestedPartialErrors = nestedPartialErrors;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddNegativeKeywordsToEntitiesResponse)) return false;
        AddNegativeKeywordsToEntitiesResponse other = (AddNegativeKeywordsToEntitiesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.negativeKeywordIds == null && other.getNegativeKeywordIds() == null) ||
                        (this.negativeKeywordIds != null &&
                                java.util.Arrays.equals(this.negativeKeywordIds, other.getNegativeKeywordIds()))) &&
                ((this.nestedPartialErrors == null && other.getNestedPartialErrors() == null) ||
                        (this.nestedPartialErrors != null &&
                                java.util.Arrays.equals(this.nestedPartialErrors, other.getNestedPartialErrors())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getNegativeKeywordIds() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getNegativeKeywordIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNegativeKeywordIds(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNestedPartialErrors() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getNestedPartialErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNestedPartialErrors(), i);
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
