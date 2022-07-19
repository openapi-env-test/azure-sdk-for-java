// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.monitor.generated.models.KnownDataCollectionRuleResourceKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Definition of ARM tracked top level resource. */
@Fluent
public final class DataCollectionRuleResourceInner extends Resource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private DataCollectionRuleResourceProperties innerProperties;

    /*
     * The kind of the resource.
     */
    @JsonProperty(value = "kind")
    private KnownDataCollectionRuleResourceKind kind;

    /*
     * Resource entity tag (ETag).
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private DataCollectionRuleResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the kind property: The kind of the resource.
     *
     * @return the kind value.
     */
    public KnownDataCollectionRuleResourceKind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind of the resource.
     *
     * @param kind the kind value to set.
     * @return the DataCollectionRuleResourceInner object itself.
     */
    public DataCollectionRuleResourceInner withKind(KnownDataCollectionRuleResourceKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the etag property: Resource entity tag (ETag).
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public DataCollectionRuleResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataCollectionRuleResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
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
