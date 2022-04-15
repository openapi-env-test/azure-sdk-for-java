package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Operation metadata. */
@Fluent
public final class DeviceOperation {
    /*
     * Operation Id.
     */
    @JsonProperty(value = "operationId", required = true)
    private String operationId;

    /*
     * Operation status.
     */
    @JsonProperty(value = "status", required = true)
    private OperationStatus status;

    /*
     * Operation error encountered, if any.
     */
    @JsonProperty(value = "error")
    private Error error;

    /*
     * Operation correlation identity that can used by Microsoft Support for
     * troubleshooting.
     */
    @JsonProperty(value = "traceId")
    private String traceId;

    /*
     * Date and time in UTC when the operation status was last updated.
     */
    @JsonProperty(value = "lastActionDateTime", required = true)
    private OffsetDateTime lastActionDateTime;

    /*
     * Date and time in UTC when the operation was created.
     */
    @JsonProperty(value = "createdDateTime", required = true)
    private OffsetDateTime createdDateTime;

    /*
     * Operation ETag.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the operationId property: Operation Id.
     *
     * @return the operationId value.
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * Set the operationId property: Operation Id.
     *
     * @param operationId the operationId value to set.
     * @return the DeviceOperation object itself.
     */
    public DeviceOperation setOperationId(String operationId) {
        this.operationId = operationId;
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
     * @return the DeviceOperation object itself.
     */
    public DeviceOperation setStatus(OperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the error property: Operation error encountered, if any.
     *
     * @return the error value.
     */
    public Error getError() {
        return this.error;
    }

    /**
     * Set the error property: Operation error encountered, if any.
     *
     * @param error the error value to set.
     * @return the DeviceOperation object itself.
     */
    public DeviceOperation setError(Error error) {
        this.error = error;
        return this;
    }

    /**
     * Get the traceId property: Operation correlation identity that can used by Microsoft Support for troubleshooting.
     *
     * @return the traceId value.
     */
    public String getTraceId() {
        return this.traceId;
    }

    /**
     * Set the traceId property: Operation correlation identity that can used by Microsoft Support for troubleshooting.
     *
     * @param traceId the traceId value to set.
     * @return the DeviceOperation object itself.
     */
    public DeviceOperation setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * Get the lastActionDateTime property: Date and time in UTC when the operation status was last updated.
     *
     * @return the lastActionDateTime value.
     */
    public OffsetDateTime getLastActionDateTime() {
        return this.lastActionDateTime;
    }

    /**
     * Set the lastActionDateTime property: Date and time in UTC when the operation status was last updated.
     *
     * @param lastActionDateTime the lastActionDateTime value to set.
     * @return the DeviceOperation object itself.
     */
    public DeviceOperation setLastActionDateTime(OffsetDateTime lastActionDateTime) {
        this.lastActionDateTime = lastActionDateTime;
        return this;
    }

    /**
     * Get the createdDateTime property: Date and time in UTC when the operation was created.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: Date and time in UTC when the operation was created.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the DeviceOperation object itself.
     */
    public DeviceOperation setCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the etag property: Operation ETag.
     *
     * @return the etag value.
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the etag property: Operation ETag.
     *
     * @param etag the etag value to set.
     * @return the DeviceOperation object itself.
     */
    public DeviceOperation setEtag(String etag) {
        this.etag = etag;
        return this;
    }
}
