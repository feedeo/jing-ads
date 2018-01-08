/**
 * GetPilotFeaturesCountriesResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.customermanagement;

public class GetPilotFeaturesCountriesResponse implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetPilotFeaturesCountriesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetPilotFeaturesCountriesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pilotFeatures");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "PilotFeatures"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "PilotFeature"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "PilotFeature"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.customermanagement.entities.PilotFeature[] pilotFeatures;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public GetPilotFeaturesCountriesResponse() {
    }

    public GetPilotFeaturesCountriesResponse(
            com.microsoft.bingads.v11.customermanagement.entities.PilotFeature[] pilotFeatures) {
        this.pilotFeatures = pilotFeatures;
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
     * Gets the pilotFeatures value for this GetPilotFeaturesCountriesResponse.
     *
     * @return pilotFeatures
     */
    public com.microsoft.bingads.v11.customermanagement.entities.PilotFeature[] getPilotFeatures() {
        return pilotFeatures;
    }

    /**
     * Sets the pilotFeatures value for this GetPilotFeaturesCountriesResponse.
     *
     * @param pilotFeatures
     */
    public void setPilotFeatures(com.microsoft.bingads.v11.customermanagement.entities.PilotFeature[] pilotFeatures) {
        this.pilotFeatures = pilotFeatures;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPilotFeaturesCountriesResponse)) return false;
        GetPilotFeaturesCountriesResponse other = (GetPilotFeaturesCountriesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.pilotFeatures == null && other.getPilotFeatures() == null) ||
                        (this.pilotFeatures != null &&
                                java.util.Arrays.equals(this.pilotFeatures, other.getPilotFeatures())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPilotFeatures() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getPilotFeatures());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPilotFeatures(), i);
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
