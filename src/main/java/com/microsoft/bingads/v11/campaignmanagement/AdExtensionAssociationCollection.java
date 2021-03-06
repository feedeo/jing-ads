/**
 * AdExtensionAssociationCollection.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class AdExtensionAssociationCollection implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AdExtensionAssociationCollection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionAssociationCollection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExtensionAssociations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionAssociations"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionAssociation"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionAssociation"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.AdExtensionAssociation[] adExtensionAssociations;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public AdExtensionAssociationCollection() {
    }

    public AdExtensionAssociationCollection(
            com.microsoft.bingads.v11.campaignmanagement.AdExtensionAssociation[] adExtensionAssociations) {
        this.adExtensionAssociations = adExtensionAssociations;
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
     * Gets the adExtensionAssociations value for this AdExtensionAssociationCollection.
     *
     * @return adExtensionAssociations
     */
    public com.microsoft.bingads.v11.campaignmanagement.AdExtensionAssociation[] getAdExtensionAssociations() {
        return adExtensionAssociations;
    }

    /**
     * Sets the adExtensionAssociations value for this AdExtensionAssociationCollection.
     *
     * @param adExtensionAssociations
     */
    public void setAdExtensionAssociations(com.microsoft.bingads.v11.campaignmanagement.AdExtensionAssociation[] adExtensionAssociations) {
        this.adExtensionAssociations = adExtensionAssociations;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdExtensionAssociationCollection)) return false;
        AdExtensionAssociationCollection other = (AdExtensionAssociationCollection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.adExtensionAssociations == null && other.getAdExtensionAssociations() == null) ||
                        (this.adExtensionAssociations != null &&
                                java.util.Arrays.equals(this.adExtensionAssociations, other.getAdExtensionAssociations())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAdExtensionAssociations() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAdExtensionAssociations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdExtensionAssociations(), i);
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
