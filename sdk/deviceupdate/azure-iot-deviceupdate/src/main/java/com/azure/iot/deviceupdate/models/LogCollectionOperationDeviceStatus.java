package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Diagnostics operation device status. */
@Fluent
public final class LogCollectionOperationDeviceStatus {
    /*
     * Device id
     */
    @JsonProperty(value = "deviceId", required = true)
    private String deviceId;

    /*
     * Module id.
     */
    @JsonProperty(value = "moduleId")
    private String moduleId;

    /*
     * Log upload status
     */
    @JsonProperty(value = "status", required = true)
    private OperationStatus status;

    /*
     * Log upload result code
     */
    @JsonProperty(value = "resultCode")
    private String resultCode;

    /*
     * Log upload extended result code
     */
    @JsonProperty(value = "extendedResultCode")
    private String extendedResultCode;

    /*
     * Log upload location
     */
    @JsonProperty(value = "logLocation")
    private String logLocation;

    /**
     * Get the deviceId property: Device id.
     *
     * @return the deviceId value.
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * Set the deviceId property: Device id.
     *
     * @param deviceId the deviceId value to set.
     * @return the LogCollectionOperationDeviceStatus object itself.
     */
    public LogCollectionOperationDeviceStatus setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Get the moduleId property: Module id.
     *
     * @return the moduleId value.
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * Set the moduleId property: Module id.
     *
     * @param moduleId the moduleId value to set.
     * @return the LogCollectionOperationDeviceStatus object itself.
     */
    public LogCollectionOperationDeviceStatus setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    /**
     * Get the status property: Log upload status.
     *
     * @return the status value.
     */
    public OperationStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Log upload status.
     *
     * @param status the status value to set.
     * @return the LogCollectionOperationDeviceStatus object itself.
     */
    public LogCollectionOperationDeviceStatus setStatus(OperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the resultCode property: Log upload result code.
     *
     * @return the resultCode value.
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * Set the resultCode property: Log upload result code.
     *
     * @param resultCode the resultCode value to set.
     * @return the LogCollectionOperationDeviceStatus object itself.
     */
    public LogCollectionOperationDeviceStatus setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * Get the extendedResultCode property: Log upload extended result code.
     *
     * @return the extendedResultCode value.
     */
    public String getExtendedResultCode() {
        return this.extendedResultCode;
    }

    /**
     * Set the extendedResultCode property: Log upload extended result code.
     *
     * @param extendedResultCode the extendedResultCode value to set.
     * @return the LogCollectionOperationDeviceStatus object itself.
     */
    public LogCollectionOperationDeviceStatus setExtendedResultCode(String extendedResultCode) {
        this.extendedResultCode = extendedResultCode;
        return this;
    }

    /**
     * Get the logLocation property: Log upload location.
     *
     * @return the logLocation value.
     */
    public String getLogLocation() {
        return this.logLocation;
    }

    /**
     * Set the logLocation property: Log upload location.
     *
     * @param logLocation the logLocation value to set.
     * @return the LogCollectionOperationDeviceStatus object itself.
     */
    public LogCollectionOperationDeviceStatus setLogLocation(String logLocation) {
        this.logLocation = logLocation;
        return this;
    }
}
