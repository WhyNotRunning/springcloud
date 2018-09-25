package com.test.springcloud.client.entity;

import java.io.Serializable;

public class ZipkinAnnotations implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zipkin_annotations.trace_id_high
     *
     * @mbggenerated
     */
    private Long traceIdHigh;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zipkin_annotations.trace_id
     *
     * @mbggenerated
     */
    private Long traceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zipkin_annotations.span_id
     *
     * @mbggenerated
     */
    private Long spanId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zipkin_annotations.a_key
     *
     * @mbggenerated
     */
    private String aKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zipkin_annotations.a_type
     *
     * @mbggenerated
     */
    private Integer aType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zipkin_annotations.a_timestamp
     *
     * @mbggenerated
     */
    private Long aTimestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zipkin_annotations.endpoint_ipv4
     *
     * @mbggenerated
     */
    private Integer endpointIpv4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zipkin_annotations.endpoint_port
     *
     * @mbggenerated
     */
    private Short endpointPort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zipkin_annotations.endpoint_service_name
     *
     * @mbggenerated
     */
    private String endpointServiceName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zipkin_annotations.a_value
     *
     * @mbggenerated
     */
    private byte[] aValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zipkin_annotations.endpoint_ipv6
     *
     * @mbggenerated
     */
    private byte[] endpointIpv6;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zipkin_annotations
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zipkin_annotations.trace_id_high
     *
     * @return the value of zipkin_annotations.trace_id_high
     *
     * @mbggenerated
     */
    public Long getTraceIdHigh() {
        return traceIdHigh;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zipkin_annotations.trace_id_high
     *
     * @param traceIdHigh the value for zipkin_annotations.trace_id_high
     *
     * @mbggenerated
     */
    public void setTraceIdHigh(Long traceIdHigh) {
        this.traceIdHigh = traceIdHigh;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zipkin_annotations.trace_id
     *
     * @return the value of zipkin_annotations.trace_id
     *
     * @mbggenerated
     */
    public Long getTraceId() {
        return traceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zipkin_annotations.trace_id
     *
     * @param traceId the value for zipkin_annotations.trace_id
     *
     * @mbggenerated
     */
    public void setTraceId(Long traceId) {
        this.traceId = traceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zipkin_annotations.span_id
     *
     * @return the value of zipkin_annotations.span_id
     *
     * @mbggenerated
     */
    public Long getSpanId() {
        return spanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zipkin_annotations.span_id
     *
     * @param spanId the value for zipkin_annotations.span_id
     *
     * @mbggenerated
     */
    public void setSpanId(Long spanId) {
        this.spanId = spanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zipkin_annotations.a_key
     *
     * @return the value of zipkin_annotations.a_key
     *
     * @mbggenerated
     */
    public String getaKey() {
        return aKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zipkin_annotations.a_key
     *
     * @param aKey the value for zipkin_annotations.a_key
     *
     * @mbggenerated
     */
    public void setaKey(String aKey) {
        this.aKey = aKey == null ? null : aKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zipkin_annotations.a_type
     *
     * @return the value of zipkin_annotations.a_type
     *
     * @mbggenerated
     */
    public Integer getaType() {
        return aType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zipkin_annotations.a_type
     *
     * @param aType the value for zipkin_annotations.a_type
     *
     * @mbggenerated
     */
    public void setaType(Integer aType) {
        this.aType = aType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zipkin_annotations.a_timestamp
     *
     * @return the value of zipkin_annotations.a_timestamp
     *
     * @mbggenerated
     */
    public Long getaTimestamp() {
        return aTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zipkin_annotations.a_timestamp
     *
     * @param aTimestamp the value for zipkin_annotations.a_timestamp
     *
     * @mbggenerated
     */
    public void setaTimestamp(Long aTimestamp) {
        this.aTimestamp = aTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zipkin_annotations.endpoint_ipv4
     *
     * @return the value of zipkin_annotations.endpoint_ipv4
     *
     * @mbggenerated
     */
    public Integer getEndpointIpv4() {
        return endpointIpv4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zipkin_annotations.endpoint_ipv4
     *
     * @param endpointIpv4 the value for zipkin_annotations.endpoint_ipv4
     *
     * @mbggenerated
     */
    public void setEndpointIpv4(Integer endpointIpv4) {
        this.endpointIpv4 = endpointIpv4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zipkin_annotations.endpoint_port
     *
     * @return the value of zipkin_annotations.endpoint_port
     *
     * @mbggenerated
     */
    public Short getEndpointPort() {
        return endpointPort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zipkin_annotations.endpoint_port
     *
     * @param endpointPort the value for zipkin_annotations.endpoint_port
     *
     * @mbggenerated
     */
    public void setEndpointPort(Short endpointPort) {
        this.endpointPort = endpointPort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zipkin_annotations.endpoint_service_name
     *
     * @return the value of zipkin_annotations.endpoint_service_name
     *
     * @mbggenerated
     */
    public String getEndpointServiceName() {
        return endpointServiceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zipkin_annotations.endpoint_service_name
     *
     * @param endpointServiceName the value for zipkin_annotations.endpoint_service_name
     *
     * @mbggenerated
     */
    public void setEndpointServiceName(String endpointServiceName) {
        this.endpointServiceName = endpointServiceName == null ? null : endpointServiceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zipkin_annotations.a_value
     *
     * @return the value of zipkin_annotations.a_value
     *
     * @mbggenerated
     */
    public byte[] getaValue() {
        return aValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zipkin_annotations.a_value
     *
     * @param aValue the value for zipkin_annotations.a_value
     *
     * @mbggenerated
     */
    public void setaValue(byte[] aValue) {
        this.aValue = aValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zipkin_annotations.endpoint_ipv6
     *
     * @return the value of zipkin_annotations.endpoint_ipv6
     *
     * @mbggenerated
     */
    public byte[] getEndpointIpv6() {
        return endpointIpv6;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zipkin_annotations.endpoint_ipv6
     *
     * @param endpointIpv6 the value for zipkin_annotations.endpoint_ipv6
     *
     * @mbggenerated
     */
    public void setEndpointIpv6(byte[] endpointIpv6) {
        this.endpointIpv6 = endpointIpv6;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zipkin_annotations
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", traceIdHigh=").append(traceIdHigh);
        sb.append(", traceId=").append(traceId);
        sb.append(", spanId=").append(spanId);
        sb.append(", aKey=").append(aKey);
        sb.append(", aType=").append(aType);
        sb.append(", aTimestamp=").append(aTimestamp);
        sb.append(", endpointIpv4=").append(endpointIpv4);
        sb.append(", endpointPort=").append(endpointPort);
        sb.append(", endpointServiceName=").append(endpointServiceName);
        sb.append(", aValue=").append(aValue);
        sb.append(", endpointIpv6=").append(endpointIpv6);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}