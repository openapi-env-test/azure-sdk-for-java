// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a private link scoped resource. */
@Fluent
public final class ScopedResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ScopedResourceProperties.class);

    /*
     * The resource id of the scoped Azure monitor resource.
     */
    @JsonProperty(value = "linkedResourceId")
    private String linkedResourceId;

    /*
     * State of the private endpoint connection.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the linkedResourceId property: The resource id of the scoped Azure monitor resource.
     *
     * @return the linkedResourceId value.
     */
    public String linkedResourceId() {
        return this.linkedResourceId;
    }

    /**
     * Set the linkedResourceId property: The resource id of the scoped Azure monitor resource.
     *
     * @param linkedResourceId the linkedResourceId value to set.
     * @return the ScopedResourceProperties object itself.
     */
    public ScopedResourceProperties withLinkedResourceId(String linkedResourceId) {
        this.linkedResourceId = linkedResourceId;
        return this;
    }

    /**
     * Get the provisioningState property: State of the private endpoint connection.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
