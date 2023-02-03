// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The status of the operation. */
@Fluent
public final class SsisObjectMetadataStatusResponseInner {
    /*
     * The status of the operation.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * The operation name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The operation properties.
     */
    @JsonProperty(value = "properties")
    private String properties;

    /*
     * The operation error message.
     */
    @JsonProperty(value = "error")
    private String error;

    /** Creates an instance of SsisObjectMetadataStatusResponseInner class. */
    public SsisObjectMetadataStatusResponseInner() {
    }

    /**
     * Get the status property: The status of the operation.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the operation.
     *
     * @param status the status value to set.
     * @return the SsisObjectMetadataStatusResponseInner object itself.
     */
    public SsisObjectMetadataStatusResponseInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the name property: The operation name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The operation name.
     *
     * @param name the name value to set.
     * @return the SsisObjectMetadataStatusResponseInner object itself.
     */
    public SsisObjectMetadataStatusResponseInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties property: The operation properties.
     *
     * @return the properties value.
     */
    public String properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The operation properties.
     *
     * @param properties the properties value to set.
     * @return the SsisObjectMetadataStatusResponseInner object itself.
     */
    public SsisObjectMetadataStatusResponseInner withProperties(String properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the error property: The operation error message.
     *
     * @return the error value.
     */
    public String error() {
        return this.error;
    }

    /**
     * Set the error property: The operation error message.
     *
     * @param error the error value to set.
     * @return the SsisObjectMetadataStatusResponseInner object itself.
     */
    public SsisObjectMetadataStatusResponseInner withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
