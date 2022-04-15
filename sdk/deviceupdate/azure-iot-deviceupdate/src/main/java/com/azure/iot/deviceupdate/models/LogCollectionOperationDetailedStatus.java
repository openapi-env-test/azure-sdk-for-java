package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Device diagnostics operation detailed status. */
@Fluent
public final class LogCollectionOperationDetailedStatus {
    /*
     * The device diagnostics operation id.
     */
    @JsonProperty(value = "operationId")
    private String operationId;

    /*
     * The timestamp when the operation was created.
     */
    @JsonProperty(value = "createdDateTime")
    private String createdDateTime;

    /*
     * A timestamp for when the current state was entered.
     */
    @JsonProperty(value = "lastActionDateTime")
    private String lastActionDateTime;

    /*
     * Operation status.
     */
    @JsonProperty(value = "status")
    private OperationStatus status;

    /*
     * Status of the devices in the operation
     */
    @JsonProperty(value = "deviceStatus")
    private List<LogCollectionOperationDeviceStatus> deviceStatus;

    /*
     * Device diagnostics operation description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the operationId property: The device diagnostics operation id.
     *
     * @return the operationId value.
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * Set the operationId property: The device diagnostics operation id.
     *
     * @param operationId the operationId value to set.
     * @return the LogCollectionOperationDetailedStatus object itself.
     */
    public LogCollectionOperationDetailedStatus setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * Get the createdDateTime property: The timestamp when the operation was created.
     *
     * @return the createdDateTime value.
     */
    public String getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: The timestamp when the operation was created.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the LogCollectionOperationDetailedStatus object itself.
     */
    public LogCollectionOperationDetailedStatus setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the lastActionDateTime property: A timestamp for when the current state was entered.
     *
     * @return the lastActionDateTime value.
     */
    public String getLastActionDateTime() {
        return this.lastActionDateTime;
    }

    /**
     * Set the lastActionDateTime property: A timestamp for when the current state was entered.
     *
     * @param lastActionDateTime the lastActionDateTime value to set.
     * @return the LogCollectionOperationDetailedStatus object itself.
     */
    public LogCollectionOperationDetailedStatus setLastActionDateTime(String lastActionDateTime) {
        this.lastActionDateTime = lastActionDateTime;
        return this;
    }

    /**
     * Get the status property: Operation status.
     *
     * @return the status value.
     */
    public OperationStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Operation status.
     *
     * @param status the status value to set.
     * @return the LogCollectionOperationDetailedStatus object itself.
     */
    public LogCollectionOperationDetailedStatus setStatus(OperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the deviceStatus property: Status of the devices in the operation.
     *
     * @return the deviceStatus value.
     */
    public List<LogCollectionOperationDeviceStatus> getDeviceStatus() {
        return this.deviceStatus;
    }

    /**
     * Set the deviceStatus property: Status of the devices in the operation.
     *
     * @param deviceStatus the deviceStatus value to set.
     * @return the LogCollectionOperationDetailedStatus object itself.
     */
    public LogCollectionOperationDetailedStatus setDeviceStatus(List<LogCollectionOperationDeviceStatus> deviceStatus) {
        this.deviceStatus = deviceStatus;
        return this;
    }

    /**
     * Get the description property: Device diagnostics operation description.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Device diagnostics operation description.
     *
     * @param description the description value to set.
     * @return the LogCollectionOperationDetailedStatus object itself.
     */
    public LogCollectionOperationDetailedStatus setDescription(String description) {
        this.description = description;
        return this;
    }
}
