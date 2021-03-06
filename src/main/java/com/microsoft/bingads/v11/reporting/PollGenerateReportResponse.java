/**
 * PollGenerateReportResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.reporting;

public class PollGenerateReportResponse implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PollGenerateReportResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", ">PollGenerateReportResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportRequestStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ReportRequestStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ReportRequestStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.reporting.ReportRequestStatus reportRequestStatus;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public PollGenerateReportResponse() {
    }

    public PollGenerateReportResponse(
            com.microsoft.bingads.v11.reporting.ReportRequestStatus reportRequestStatus) {
        this.reportRequestStatus = reportRequestStatus;
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
     * Gets the reportRequestStatus value for this PollGenerateReportResponse.
     *
     * @return reportRequestStatus
     */
    public com.microsoft.bingads.v11.reporting.ReportRequestStatus getReportRequestStatus() {
        return reportRequestStatus;
    }

    /**
     * Sets the reportRequestStatus value for this PollGenerateReportResponse.
     *
     * @param reportRequestStatus
     */
    public void setReportRequestStatus(com.microsoft.bingads.v11.reporting.ReportRequestStatus reportRequestStatus) {
        this.reportRequestStatus = reportRequestStatus;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PollGenerateReportResponse)) return false;
        PollGenerateReportResponse other = (PollGenerateReportResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.reportRequestStatus == null && other.getReportRequestStatus() == null) ||
                        (this.reportRequestStatus != null &&
                                this.reportRequestStatus.equals(other.getReportRequestStatus())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getReportRequestStatus() != null) {
            _hashCode += getReportRequestStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
