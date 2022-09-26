// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The original source of the content item, where it comes from. */
@Fluent
public final class MetadataSource {
    /*
     * Source type of the content
     */
    @JsonProperty(value = "kind", required = true)
    private SourceKind kind;

    /*
     * Name of the content source.  The repo name, solution name, LA workspace name etc.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * ID of the content source.  The solution ID, workspace ID, etc
     */
    @JsonProperty(value = "sourceId")
    private String sourceId;

    /**
     * Get the kind property: Source type of the content.
     *
     * @return the kind value.
     */
    public SourceKind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Source type of the content.
     *
     * @param kind the kind value to set.
     * @return the MetadataSource object itself.
     */
    public MetadataSource withKind(SourceKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the name property: Name of the content source. The repo name, solution name, LA workspace name etc.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the content source. The repo name, solution name, LA workspace name etc.
     *
     * @param name the name value to set.
     * @return the MetadataSource object itself.
     */
    public MetadataSource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the sourceId property: ID of the content source. The solution ID, workspace ID, etc.
     *
     * @return the sourceId value.
     */
    public String sourceId() {
        return this.sourceId;
    }

    /**
     * Set the sourceId property: ID of the content source. The solution ID, workspace ID, etc.
     *
     * @param sourceId the sourceId value to set.
     * @return the MetadataSource object itself.
     */
    public MetadataSource withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (kind() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property kind in model MetadataSource"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MetadataSource.class);
}
