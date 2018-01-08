/**
 * GetKeywordsByIdsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetKeywordsByIdsRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetKeywordsByIdsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetKeywordsByIdsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "KeywordIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnAdditionalFields");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ReturnAdditionalFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "KeywordAdditionalField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.Long adGroupId;
    private long[] keywordIds;
    private java.lang.String[] returnAdditionalFields;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public GetKeywordsByIdsRequest() {
    }


    public GetKeywordsByIdsRequest(
            java.lang.Long adGroupId,
            long[] keywordIds,
            java.lang.String[] returnAdditionalFields) {
        this.adGroupId = adGroupId;
        this.keywordIds = keywordIds;
        this.returnAdditionalFields = returnAdditionalFields;
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
     * Gets the adGroupId value for this GetKeywordsByIdsRequest.
     *
     * @return adGroupId
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }

    /**
     * Sets the adGroupId value for this GetKeywordsByIdsRequest.
     *
     * @param adGroupId
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }

    /**
     * Gets the keywordIds value for this GetKeywordsByIdsRequest.
     *
     * @return keywordIds
     */
    public long[] getKeywordIds() {
        return keywordIds;
    }

    /**
     * Sets the keywordIds value for this GetKeywordsByIdsRequest.
     *
     * @param keywordIds
     */
    public void setKeywordIds(long[] keywordIds) {
        this.keywordIds = keywordIds;
    }

    /**
     * Gets the returnAdditionalFields value for this GetKeywordsByIdsRequest.
     *
     * @return returnAdditionalFields
     */
    public java.lang.String[] getReturnAdditionalFields() {
        return returnAdditionalFields;
    }

    /**
     * Sets the returnAdditionalFields value for this GetKeywordsByIdsRequest.
     *
     * @param returnAdditionalFields
     */
    public void setReturnAdditionalFields(java.lang.String[] returnAdditionalFields) {
        this.returnAdditionalFields = returnAdditionalFields;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetKeywordsByIdsRequest)) return false;
        GetKeywordsByIdsRequest other = (GetKeywordsByIdsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.adGroupId == null && other.getAdGroupId() == null) ||
                        (this.adGroupId != null &&
                                this.adGroupId.equals(other.getAdGroupId()))) &&
                ((this.keywordIds == null && other.getKeywordIds() == null) ||
                        (this.keywordIds != null &&
                                java.util.Arrays.equals(this.keywordIds, other.getKeywordIds()))) &&
                ((this.returnAdditionalFields == null && other.getReturnAdditionalFields() == null) ||
                        (this.returnAdditionalFields != null &&
                                java.util.Arrays.equals(this.returnAdditionalFields, other.getReturnAdditionalFields())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAdGroupId() != null) {
            _hashCode += getAdGroupId().hashCode();
        }
        if (getKeywordIds() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getKeywordIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywordIds(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReturnAdditionalFields() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getReturnAdditionalFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReturnAdditionalFields(), i);
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
