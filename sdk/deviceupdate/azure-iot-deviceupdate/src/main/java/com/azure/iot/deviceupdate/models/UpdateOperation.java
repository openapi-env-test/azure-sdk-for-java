package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Operation metadata. */
@Fluent
public final class UpdateOperation {
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
     * The identity of update being imported or deleted. For import, this
     * property will only be populated after import manifest is processed
     * successfully.
     */
    @JsonProperty(value = "updateId")
    private UpdateId updateId;

    /*
     * Location of the imported update when operation is successful.
     */
    @JsonProperty(value = "resourceLocation")
    private String resourceLocation;

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
     * @return the UpdateOperation object itself.
     */
    public UpdateOperation setOperationId(String operationId) {
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
     * @return the UpdateOperation object itself.
     */
    public UpdateOperation setStatus(OperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the updateId property: The identity of update being imported or deleted. For import, this property will only
     * be populated after import manifest is processed successfully.
     *
     * @return the updateId value.
     */
    public UpdateId getUpdateId() {
        return this.updateId;
    }

    /**
     * Set the updateId property: The identity of update being imported or deleted. For import, this property will only
     * be populated after import manifest is processed successfully.
     *
     * @param updateId the updateId value to set.
     * @return the UpdateOperation object itself.
     */
    public UpdateOperation setUpdateId(UpdateId updateId) {
        this.updateId = updateId;
        return this;
    }

    /**
     * Get the resourceLocation property: Location of the imported update when operation is successful.
     *
     * @return the resourceLocation value.
     */
    public String getResourceLocation() {
        return this.resourceLocation;
    }

    /**
     * Set the resourceLocation property: Location of the imported update when operation is successful.
     *
     * @param resourceLocation the resourceLocation value to set.
     * @return the UpdateOperation object itself.
     */
    public UpdateOperation setResourceLocation(String resourceLocation) {
        this.resourceLocation = resourceLocation;
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
     * @return the UpdateOperation object itself.
     */
    public UpdateOperation setError(Error error) {
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
     * @return the UpdateOperation object itself.
     */
    public UpdateOperation setTraceId(String traceId) {
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
     * @return the UpdateOperation object itself.
     */
    public UpdateOperation setLastActionDateTime(OffsetDateTime lastActionDateTime) {
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
     * @return the UpdateOperation object itself.
     */
    public UpdateOperation setCreatedDateTime(OffsetDateTime createdDateTime) {
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
     * @return the UpdateOperation object itself.
     */
    public UpdateOperation setEtag(String etag) {
        this.etag = etag;
        return this;
    }
}
