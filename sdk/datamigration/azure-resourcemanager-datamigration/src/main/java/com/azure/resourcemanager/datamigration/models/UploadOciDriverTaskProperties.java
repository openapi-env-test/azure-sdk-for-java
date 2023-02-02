// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Properties for the task that uploads an OCI driver. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "taskType")
@JsonTypeName("Service.Upload.OCI")
@Fluent
public final class UploadOciDriverTaskProperties extends ProjectTaskProperties {
    /*
     * Input for the service task to upload an OCI driver.
     */
    @JsonProperty(value = "input")
    private UploadOciDriverTaskInput input;

    /*
     * Task output. This is ignored if submitted.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private List<UploadOciDriverTaskOutput> output;

    /** Creates an instance of UploadOciDriverTaskProperties class. */
    public UploadOciDriverTaskProperties() {
    }

    /**
     * Get the input property: Input for the service task to upload an OCI driver.
     *
     * @return the input value.
     */
    public UploadOciDriverTaskInput input() {
        return this.input;
    }

    /**
     * Set the input property: Input for the service task to upload an OCI driver.
     *
     * @param input the input value to set.
     * @return the UploadOciDriverTaskProperties object itself.
     */
    public UploadOciDriverTaskProperties withInput(UploadOciDriverTaskInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get the output property: Task output. This is ignored if submitted.
     *
     * @return the output value.
     */
    public List<UploadOciDriverTaskOutput> output() {
        return this.output;
    }

    /** {@inheritDoc} */
    @Override
    public UploadOciDriverTaskProperties withClientData(Map<String, String> clientData) {
        super.withClientData(clientData);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (input() != null) {
            input().validate();
        }
        if (output() != null) {
            output().forEach(e -> e.validate());
        }
    }
}
