/**
 * DeleteListItemsFromSharedListRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class DeleteListItemsFromSharedListRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(DeleteListItemsFromSharedListRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteListItemsFromSharedListRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listItemIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ListItemIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SharedList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SharedList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private long[] listItemIds;
    private com.microsoft.bingads.v11.campaignmanagement.SharedList sharedList;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public DeleteListItemsFromSharedListRequest() {
    }


    public DeleteListItemsFromSharedListRequest(
            long[] listItemIds,
            com.microsoft.bingads.v11.campaignmanagement.SharedList sharedList) {
        this.listItemIds = listItemIds;
        this.sharedList = sharedList;
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
     * Gets the listItemIds value for this DeleteListItemsFromSharedListRequest.
     *
     * @return listItemIds
     */
    public long[] getListItemIds() {
        return listItemIds;
    }

    /**
     * Sets the listItemIds value for this DeleteListItemsFromSharedListRequest.
     *
     * @param listItemIds
     */
    public void setListItemIds(long[] listItemIds) {
        this.listItemIds = listItemIds;
    }

    /**
     * Gets the sharedList value for this DeleteListItemsFromSharedListRequest.
     *
     * @return sharedList
     */
    public com.microsoft.bingads.v11.campaignmanagement.SharedList getSharedList() {
        return sharedList;
    }

    /**
     * Sets the sharedList value for this DeleteListItemsFromSharedListRequest.
     *
     * @param sharedList
     */
    public void setSharedList(com.microsoft.bingads.v11.campaignmanagement.SharedList sharedList) {
        this.sharedList = sharedList;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteListItemsFromSharedListRequest)) return false;
        DeleteListItemsFromSharedListRequest other = (DeleteListItemsFromSharedListRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.listItemIds == null && other.getListItemIds() == null) ||
                        (this.listItemIds != null &&
                                java.util.Arrays.equals(this.listItemIds, other.getListItemIds()))) &&
                ((this.sharedList == null && other.getSharedList() == null) ||
                        (this.sharedList != null &&
                                this.sharedList.equals(other.getSharedList())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getListItemIds() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getListItemIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListItemIds(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSharedList() != null) {
            _hashCode += getSharedList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
