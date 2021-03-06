/**
 * SiteLink.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class SiteLink implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SiteLink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SiteLink"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Description1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Description2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DestinationUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicePreference");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DevicePreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DisplayText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalAppUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "FinalAppUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "AppUrl"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "AppUrl"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalMobileUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "FinalMobileUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "FinalUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduling");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Scheduling"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Schedule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingUrlTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "TrackingUrlTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlCustomParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UrlCustomParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "CustomParameters"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String description1;
    private java.lang.String description2;
    private java.lang.String destinationUrl;
    private java.lang.Long devicePreference;
    private java.lang.String displayText;
    private com.microsoft.bingads.v11.datacontracts.AppUrl[] finalAppUrls;
    private java.lang.String[] finalMobileUrls;
    private java.lang.String[] finalUrls;
    private com.microsoft.bingads.v11.campaignmanagement.Schedule scheduling;
    private java.lang.String trackingUrlTemplate;
    private com.microsoft.bingads.v11.datacontracts.CustomParameters urlCustomParameters;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public SiteLink() {
    }


    public SiteLink(
            java.lang.String description1,
            java.lang.String description2,
            java.lang.String destinationUrl,
            java.lang.Long devicePreference,
            java.lang.String displayText,
            com.microsoft.bingads.v11.datacontracts.AppUrl[] finalAppUrls,
            java.lang.String[] finalMobileUrls,
            java.lang.String[] finalUrls,
            com.microsoft.bingads.v11.campaignmanagement.Schedule scheduling,
            java.lang.String trackingUrlTemplate,
            com.microsoft.bingads.v11.datacontracts.CustomParameters urlCustomParameters) {
        this.description1 = description1;
        this.description2 = description2;
        this.destinationUrl = destinationUrl;
        this.devicePreference = devicePreference;
        this.displayText = displayText;
        this.finalAppUrls = finalAppUrls;
        this.finalMobileUrls = finalMobileUrls;
        this.finalUrls = finalUrls;
        this.scheduling = scheduling;
        this.trackingUrlTemplate = trackingUrlTemplate;
        this.urlCustomParameters = urlCustomParameters;
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
     * Gets the description1 value for this SiteLink.
     *
     * @return description1
     */
    public java.lang.String getDescription1() {
        return description1;
    }

    /**
     * Sets the description1 value for this SiteLink.
     *
     * @param description1
     */
    public void setDescription1(java.lang.String description1) {
        this.description1 = description1;
    }

    /**
     * Gets the description2 value for this SiteLink.
     *
     * @return description2
     */
    public java.lang.String getDescription2() {
        return description2;
    }

    /**
     * Sets the description2 value for this SiteLink.
     *
     * @param description2
     */
    public void setDescription2(java.lang.String description2) {
        this.description2 = description2;
    }

    /**
     * Gets the destinationUrl value for this SiteLink.
     *
     * @return destinationUrl
     */
    public java.lang.String getDestinationUrl() {
        return destinationUrl;
    }

    /**
     * Sets the destinationUrl value for this SiteLink.
     *
     * @param destinationUrl
     */
    public void setDestinationUrl(java.lang.String destinationUrl) {
        this.destinationUrl = destinationUrl;
    }

    /**
     * Gets the devicePreference value for this SiteLink.
     *
     * @return devicePreference
     */
    public java.lang.Long getDevicePreference() {
        return devicePreference;
    }

    /**
     * Sets the devicePreference value for this SiteLink.
     *
     * @param devicePreference
     */
    public void setDevicePreference(java.lang.Long devicePreference) {
        this.devicePreference = devicePreference;
    }

    /**
     * Gets the displayText value for this SiteLink.
     *
     * @return displayText
     */
    public java.lang.String getDisplayText() {
        return displayText;
    }

    /**
     * Sets the displayText value for this SiteLink.
     *
     * @param displayText
     */
    public void setDisplayText(java.lang.String displayText) {
        this.displayText = displayText;
    }

    /**
     * Gets the finalAppUrls value for this SiteLink.
     *
     * @return finalAppUrls
     */
    public com.microsoft.bingads.v11.datacontracts.AppUrl[] getFinalAppUrls() {
        return finalAppUrls;
    }

    /**
     * Sets the finalAppUrls value for this SiteLink.
     *
     * @param finalAppUrls
     */
    public void setFinalAppUrls(com.microsoft.bingads.v11.datacontracts.AppUrl[] finalAppUrls) {
        this.finalAppUrls = finalAppUrls;
    }

    /**
     * Gets the finalMobileUrls value for this SiteLink.
     *
     * @return finalMobileUrls
     */
    public java.lang.String[] getFinalMobileUrls() {
        return finalMobileUrls;
    }

    /**
     * Sets the finalMobileUrls value for this SiteLink.
     *
     * @param finalMobileUrls
     */
    public void setFinalMobileUrls(java.lang.String[] finalMobileUrls) {
        this.finalMobileUrls = finalMobileUrls;
    }

    /**
     * Gets the finalUrls value for this SiteLink.
     *
     * @return finalUrls
     */
    public java.lang.String[] getFinalUrls() {
        return finalUrls;
    }

    /**
     * Sets the finalUrls value for this SiteLink.
     *
     * @param finalUrls
     */
    public void setFinalUrls(java.lang.String[] finalUrls) {
        this.finalUrls = finalUrls;
    }

    /**
     * Gets the scheduling value for this SiteLink.
     *
     * @return scheduling
     */
    public com.microsoft.bingads.v11.campaignmanagement.Schedule getScheduling() {
        return scheduling;
    }

    /**
     * Sets the scheduling value for this SiteLink.
     *
     * @param scheduling
     */
    public void setScheduling(com.microsoft.bingads.v11.campaignmanagement.Schedule scheduling) {
        this.scheduling = scheduling;
    }

    /**
     * Gets the trackingUrlTemplate value for this SiteLink.
     *
     * @return trackingUrlTemplate
     */
    public java.lang.String getTrackingUrlTemplate() {
        return trackingUrlTemplate;
    }

    /**
     * Sets the trackingUrlTemplate value for this SiteLink.
     *
     * @param trackingUrlTemplate
     */
    public void setTrackingUrlTemplate(java.lang.String trackingUrlTemplate) {
        this.trackingUrlTemplate = trackingUrlTemplate;
    }

    /**
     * Gets the urlCustomParameters value for this SiteLink.
     *
     * @return urlCustomParameters
     */
    public com.microsoft.bingads.v11.datacontracts.CustomParameters getUrlCustomParameters() {
        return urlCustomParameters;
    }

    /**
     * Sets the urlCustomParameters value for this SiteLink.
     *
     * @param urlCustomParameters
     */
    public void setUrlCustomParameters(com.microsoft.bingads.v11.datacontracts.CustomParameters urlCustomParameters) {
        this.urlCustomParameters = urlCustomParameters;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteLink)) return false;
        SiteLink other = (SiteLink) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.description1 == null && other.getDescription1() == null) ||
                        (this.description1 != null &&
                                this.description1.equals(other.getDescription1()))) &&
                ((this.description2 == null && other.getDescription2() == null) ||
                        (this.description2 != null &&
                                this.description2.equals(other.getDescription2()))) &&
                ((this.destinationUrl == null && other.getDestinationUrl() == null) ||
                        (this.destinationUrl != null &&
                                this.destinationUrl.equals(other.getDestinationUrl()))) &&
                ((this.devicePreference == null && other.getDevicePreference() == null) ||
                        (this.devicePreference != null &&
                                this.devicePreference.equals(other.getDevicePreference()))) &&
                ((this.displayText == null && other.getDisplayText() == null) ||
                        (this.displayText != null &&
                                this.displayText.equals(other.getDisplayText()))) &&
                ((this.finalAppUrls == null && other.getFinalAppUrls() == null) ||
                        (this.finalAppUrls != null &&
                                java.util.Arrays.equals(this.finalAppUrls, other.getFinalAppUrls()))) &&
                ((this.finalMobileUrls == null && other.getFinalMobileUrls() == null) ||
                        (this.finalMobileUrls != null &&
                                java.util.Arrays.equals(this.finalMobileUrls, other.getFinalMobileUrls()))) &&
                ((this.finalUrls == null && other.getFinalUrls() == null) ||
                        (this.finalUrls != null &&
                                java.util.Arrays.equals(this.finalUrls, other.getFinalUrls()))) &&
                ((this.scheduling == null && other.getScheduling() == null) ||
                        (this.scheduling != null &&
                                this.scheduling.equals(other.getScheduling()))) &&
                ((this.trackingUrlTemplate == null && other.getTrackingUrlTemplate() == null) ||
                        (this.trackingUrlTemplate != null &&
                                this.trackingUrlTemplate.equals(other.getTrackingUrlTemplate()))) &&
                ((this.urlCustomParameters == null && other.getUrlCustomParameters() == null) ||
                        (this.urlCustomParameters != null &&
                                this.urlCustomParameters.equals(other.getUrlCustomParameters())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDescription1() != null) {
            _hashCode += getDescription1().hashCode();
        }
        if (getDescription2() != null) {
            _hashCode += getDescription2().hashCode();
        }
        if (getDestinationUrl() != null) {
            _hashCode += getDestinationUrl().hashCode();
        }
        if (getDevicePreference() != null) {
            _hashCode += getDevicePreference().hashCode();
        }
        if (getDisplayText() != null) {
            _hashCode += getDisplayText().hashCode();
        }
        if (getFinalAppUrls() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getFinalAppUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinalAppUrls(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFinalMobileUrls() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getFinalMobileUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinalMobileUrls(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFinalUrls() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getFinalUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinalUrls(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScheduling() != null) {
            _hashCode += getScheduling().hashCode();
        }
        if (getTrackingUrlTemplate() != null) {
            _hashCode += getTrackingUrlTemplate().hashCode();
        }
        if (getUrlCustomParameters() != null) {
            _hashCode += getUrlCustomParameters().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
