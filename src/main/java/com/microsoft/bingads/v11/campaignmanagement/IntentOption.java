/**
 * IntentOption.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class IntentOption implements java.io.Serializable {
    public static final java.lang.String _PeopleInOrSearchingForOrViewingPages = "PeopleInOrSearchingForOrViewingPages";
    public static final java.lang.String _PeopleIn = "PeopleIn";
    public static final java.lang.String _PeopleSearchingForOrViewingPages = "PeopleSearchingForOrViewingPages";
    public static final IntentOption PeopleInOrSearchingForOrViewingPages = new IntentOption(_PeopleInOrSearchingForOrViewingPages);
    public static final IntentOption PeopleIn = new IntentOption(_PeopleIn);
    public static final IntentOption PeopleSearchingForOrViewingPages = new IntentOption(_PeopleSearchingForOrViewingPages);
    private static java.util.HashMap _table_ = new java.util.HashMap();
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(IntentOption.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "IntentOption"));
    }

    private java.lang.String _value_;

    // Constructor
    protected IntentOption(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static IntentOption fromValue(java.lang.String value)
            throws java.lang.IllegalArgumentException {
        IntentOption enumeration = (IntentOption)
                _table_.get(value);
        if (enumeration == null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    public static IntentOption fromString(java.lang.String value)
            throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }

    public static org.apache.axis.encoding.Serializer getSerializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.EnumSerializer(
                        _javaType, _xmlType);
    }

    public static org.apache.axis.encoding.Deserializer getDeserializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.EnumDeserializer(
                        _javaType, _xmlType);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    public java.lang.String getValue() {
        return _value_;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj == this);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public java.lang.String toString() {
        return _value_;
    }

    public java.lang.Object readResolve() throws java.io.ObjectStreamException {
        return fromValue(_value_);
    }

}
