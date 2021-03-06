/**
 * GetAdGroupBidLandscapeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.adintelligence;

public class GetAdGroupBidLandscapeRequest  implements java.io.Serializable {
    private com.microsoft.bingads.v9.datacontracts.AdGroupBidLandscapeInput[] adGroupBidLandscapeInputs;

    public GetAdGroupBidLandscapeRequest() {
    }

    public GetAdGroupBidLandscapeRequest(
           com.microsoft.bingads.v9.datacontracts.AdGroupBidLandscapeInput[] adGroupBidLandscapeInputs) {
           this.adGroupBidLandscapeInputs = adGroupBidLandscapeInputs;
    }


    /**
     * Gets the adGroupBidLandscapeInputs value for this GetAdGroupBidLandscapeRequest.
     * 
     * @return adGroupBidLandscapeInputs
     */
    public com.microsoft.bingads.v9.datacontracts.AdGroupBidLandscapeInput[] getAdGroupBidLandscapeInputs() {
        return adGroupBidLandscapeInputs;
    }


    /**
     * Sets the adGroupBidLandscapeInputs value for this GetAdGroupBidLandscapeRequest.
     * 
     * @param adGroupBidLandscapeInputs
     */
    public void setAdGroupBidLandscapeInputs(com.microsoft.bingads.v9.datacontracts.AdGroupBidLandscapeInput[] adGroupBidLandscapeInputs) {
        this.adGroupBidLandscapeInputs = adGroupBidLandscapeInputs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAdGroupBidLandscapeRequest)) return false;
        GetAdGroupBidLandscapeRequest other = (GetAdGroupBidLandscapeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adGroupBidLandscapeInputs==null && other.getAdGroupBidLandscapeInputs()==null) || 
             (this.adGroupBidLandscapeInputs!=null &&
              java.util.Arrays.equals(this.adGroupBidLandscapeInputs, other.getAdGroupBidLandscapeInputs())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAdGroupBidLandscapeInputs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdGroupBidLandscapeInputs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdGroupBidLandscapeInputs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAdGroupBidLandscapeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetAdGroupBidLandscapeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupBidLandscapeInputs");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "AdGroupBidLandscapeInputs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "AdGroupBidLandscapeInput"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "AdGroupBidLandscapeInput"));
        typeDesc.addFieldDesc(elemField);
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
          new  org.apache.axis.encoding.ser.BeanSerializer(
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
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
