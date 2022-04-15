package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Diagnostics request body. */
@Fluent
public final class LogCollectionOperation {
    /*
     * The diagnostics operation id.
     */
    @JsonProperty(value = "operationId")
    private String operationId;

    /*
     * Array of Device Update agent ids
     */
    @JsonProperty(value = "deviceList", required = true)
    private List<DeviceUpdateAgentId> deviceList;

    /*
     * Description of the diagnostics operation.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The timestamp when the operation was created.
     */
    @JsonProperty(value = "createdDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private String createdDateTime;

    /*
     * A timestamp for when the current state was entered.
     */
    @JsonProperty(value = "lastActionDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private String lastActionDateTime;

    /*
     * Operation status.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private OperationStatus status;

    /**
     * Get the operationId property: The diagnostics operation id.
     *
     * @return the operationId value.
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * Set the operationId property: The diagnostics operation id.
     *
     * @param operationId the operationId value to set.
     * @return the LogCollectionOperation object itself.
     */
    public LogCollectionOperation setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * Get the deviceList property: Array of Device Update agent ids.
     *
     * @return the deviceList value.
     */
    public List<DeviceUpdateAgentId> getDeviceList() {
        return this.deviceList;
    }

    /**
     * Set the deviceList property: Array of Device Update agent ids.
     *
     * @param deviceList the deviceList value to set.
     * @return the LogCollectionOperation object itself.
     */
    public LogCollectionOperation setDeviceList(List<DeviceUpdateAgentId> deviceList) {
        this.deviceList = deviceList;
        return this;
    }

    /**
     * Get the description property: Description of the diagnostics operation.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Description of the diagnostics operation.
     *
     * @param description the description value to set.
     * @return the LogCollectionOperation object itself.
     */
    public LogCollectionOperation setDescription(String description) {
        this.description = description;
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
     * Get the lastActionDateTime property: A timestamp for when the current state was entered.
     *
     * @return the lastActionDateTime value.
     */
    public String getLastActionDateTime() {
        return this.lastActionDateTime;
    }

    /**
     * Get the status property: Operation status.
     *
     * @return the status value.
     */
    public OperationStatus getStatus() {
        return this.status;
    }
}
