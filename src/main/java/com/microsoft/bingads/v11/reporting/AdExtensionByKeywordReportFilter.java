/**
 * AdExtensionByKeywordReportFilter.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.reporting;

public class AdExtensionByKeywordReportFilter implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AdExtensionByKeywordReportFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdExtensionByKeywordReportFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AccountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AccountStatusReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdGroupStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdGroupStatusReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "CampaignStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "CampaignStatusReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceOS");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DeviceOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DeviceOSReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DeviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DeviceTypeReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "KeywordStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "KeywordStatusReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String[] accountStatus;
    private java.lang.String[] adGroupStatus;
    private java.lang.String[] campaignStatus;
    private java.lang.String[] deviceOS;
    private java.lang.String[] deviceType;
    private java.lang.String[] keywordStatus;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public AdExtensionByKeywordReportFilter() {
    }


    public AdExtensionByKeywordReportFilter(
            java.lang.String[] accountStatus,
            java.lang.String[] adGroupStatus,
            java.lang.String[] campaignStatus,
            java.lang.String[] deviceOS,
            java.lang.String[] deviceType,
            java.lang.String[] keywordStatus) {
        this.accountStatus = accountStatus;
        this.adGroupStatus = adGroupStatus;
        this.campaignStatus = campaignStatus;
        this.deviceOS = deviceOS;
        this.deviceType = deviceType;
        this.keywordStatus = keywordStatus;
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
     * Gets the accountStatus value for this AdExtensionByKeywordReportFilter.
     *
     * @return accountStatus
     */
    public java.lang.String[] getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the accountStatus value for this AdExtensionByKeywordReportFilter.
     *
     * @param accountStatus
     */
    public void setAccountStatus(java.lang.String[] accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * Gets the adGroupStatus value for this AdExtensionByKeywordReportFilter.
     *
     * @return adGroupStatus
     */
    public java.lang.String[] getAdGroupStatus() {
        return adGroupStatus;
    }

    /**
     * Sets the adGroupStatus value for this AdExtensionByKeywordReportFilter.
     *
     * @param adGroupStatus
     */
    public void setAdGroupStatus(java.lang.String[] adGroupStatus) {
        this.adGroupStatus = adGroupStatus;
    }

    /**
     * Gets the campaignStatus value for this AdExtensionByKeywordReportFilter.
     *
     * @return campaignStatus
     */
    public java.lang.String[] getCampaignStatus() {
        return campaignStatus;
    }

    /**
     * Sets the campaignStatus value for this AdExtensionByKeywordReportFilter.
     *
     * @param campaignStatus
     */
    public void setCampaignStatus(java.lang.String[] campaignStatus) {
        this.campaignStatus = campaignStatus;
    }

    /**
     * Gets the deviceOS value for this AdExtensionByKeywordReportFilter.
     *
     * @return deviceOS
     */
    public java.lang.String[] getDeviceOS() {
        return deviceOS;
    }

    /**
     * Sets the deviceOS value for this AdExtensionByKeywordReportFilter.
     *
     * @param deviceOS
     */
    public void setDeviceOS(java.lang.String[] deviceOS) {
        this.deviceOS = deviceOS;
    }

    /**
     * Gets the deviceType value for this AdExtensionByKeywordReportFilter.
     *
     * @return deviceType
     */
    public java.lang.String[] getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the deviceType value for this AdExtensionByKeywordReportFilter.
     *
     * @param deviceType
     */
    public void setDeviceType(java.lang.String[] deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * Gets the keywordStatus value for this AdExtensionByKeywordReportFilter.
     *
     * @return keywordStatus
     */
    public java.lang.String[] getKeywordStatus() {
        return keywordStatus;
    }

    /**
     * Sets the keywordStatus value for this AdExtensionByKeywordReportFilter.
     *
     * @param keywordStatus
     */
    public void setKeywordStatus(java.lang.String[] keywordStatus) {
        this.keywordStatus = keywordStatus;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdExtensionByKeywordReportFilter)) return false;
        AdExtensionByKeywordReportFilter other = (AdExtensionByKeywordReportFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.accountStatus == null && other.getAccountStatus() == null) ||
                        (this.accountStatus != null &&
                                java.util.Arrays.equals(this.accountStatus, other.getAccountStatus()))) &&
                ((this.adGroupStatus == null && other.getAdGroupStatus() == null) ||
                        (this.adGroupStatus != null &&
                                java.util.Arrays.equals(this.adGroupStatus, other.getAdGroupStatus()))) &&
                ((this.campaignStatus == null && other.getCampaignStatus() == null) ||
                        (this.campaignStatus != null &&
                                java.util.Arrays.equals(this.campaignStatus, other.getCampaignStatus()))) &&
                ((this.deviceOS == null && other.getDeviceOS() == null) ||
                        (this.deviceOS != null &&
                                java.util.Arrays.equals(this.deviceOS, other.getDeviceOS()))) &&
                ((this.deviceType == null && other.getDeviceType() == null) ||
                        (this.deviceType != null &&
                                java.util.Arrays.equals(this.deviceType, other.getDeviceType()))) &&
                ((this.keywordStatus == null && other.getKeywordStatus() == null) ||
                        (this.keywordStatus != null &&
                                java.util.Arrays.equals(this.keywordStatus, other.getKeywordStatus())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAccountStatus() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAccountStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountStatus(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdGroupStatus() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAdGroupStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdGroupStatus(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCampaignStatus() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getCampaignStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignStatus(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeviceOS() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getDeviceOS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceOS(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeviceType() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getDeviceType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceType(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKeywordStatus() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getKeywordStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywordStatus(), i);
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
