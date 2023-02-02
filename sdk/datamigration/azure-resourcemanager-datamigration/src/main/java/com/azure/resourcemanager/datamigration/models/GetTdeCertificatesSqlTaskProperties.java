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

/** Properties for the task that gets TDE certificates in Base64 encoded format. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "taskType")
@JsonTypeName("GetTDECertificates.Sql")
@Fluent
public final class GetTdeCertificatesSqlTaskProperties extends ProjectTaskProperties {
    /*
     * Task input
     */
    @JsonProperty(value = "input")
    private GetTdeCertificatesSqlTaskInput input;

    /*
     * Task output. This is ignored if submitted.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private List<GetTdeCertificatesSqlTaskOutput> output;

    /** Creates an instance of GetTdeCertificatesSqlTaskProperties class. */
    public GetTdeCertificatesSqlTaskProperties() {
    }

    /**
     * Get the input property: Task input.
     *
     * @return the input value.
     */
    public GetTdeCertificatesSqlTaskInput input() {
        return this.input;
    }

    /**
     * Set the input property: Task input.
     *
     * @param input the input value to set.
     * @return the GetTdeCertificatesSqlTaskProperties object itself.
     */
    public GetTdeCertificatesSqlTaskProperties withInput(GetTdeCertificatesSqlTaskInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get the output property: Task output. This is ignored if submitted.
     *
     * @return the output value.
     */
    public List<GetTdeCertificatesSqlTaskOutput> output() {
        return this.output;
    }

    /** {@inheritDoc} */
    @Override
    public GetTdeCertificatesSqlTaskProperties withClientData(Map<String, String> clientData) {
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
