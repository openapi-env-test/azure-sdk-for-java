// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Definition of generic ARM proxy resource. */
@Immutable
public final class DataCollectionRuleAssociationProxyOnlyResourceInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private DataCollectionRuleAssociationProxyOnlyResourceProperties innerProperties;

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

    /** Creates an instance of DataCollectionRuleAssociationProxyOnlyResourceInner class. */
    public DataCollectionRuleAssociationProxyOnlyResourceInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private DataCollectionRuleAssociationProxyOnlyResourceProperties innerProperties() {
        return this.innerProperties;
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
