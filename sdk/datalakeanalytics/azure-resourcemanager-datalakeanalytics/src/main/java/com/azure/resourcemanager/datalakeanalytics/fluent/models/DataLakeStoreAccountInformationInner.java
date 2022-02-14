// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Data Lake Store account information. */
@Fluent
public final class DataLakeStoreAccountInformationInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataLakeStoreAccountInformationInner.class);

    /*
     * The Data Lake Store account properties.
     */
    @JsonProperty(value = "properties")
    private DataLakeStoreAccountInformationProperties innerProperties;

    /*
     * The resource name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the innerProperties property: The Data Lake Store account properties.
     *
     * @return the innerProperties value.
     */
    private DataLakeStoreAccountInformationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /** {@inheritDoc} */
    @Override
    public DataLakeStoreAccountInformationInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the suffix property: The optional suffix for the Data Lake Store account.
     *
     * @return the suffix value.
     */
    public String suffix() {
        return this.innerProperties() == null ? null : this.innerProperties().suffix();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
