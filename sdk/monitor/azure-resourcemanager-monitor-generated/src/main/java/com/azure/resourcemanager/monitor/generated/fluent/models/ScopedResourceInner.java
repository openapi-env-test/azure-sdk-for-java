// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A private link scoped resource. */
@Fluent
public final class ScopedResourceInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private ScopedResourceProperties innerProperties;

    /*
     * System data
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of ScopedResourceInner class. */
    public ScopedResourceInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private ScopedResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: System data.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the linkedResourceId property: The resource id of the scoped Azure monitor resource.
     *
     * @return the linkedResourceId value.
     */
    public String linkedResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().linkedResourceId();
    }

    /**
     * Set the linkedResourceId property: The resource id of the scoped Azure monitor resource.
     *
     * @param linkedResourceId the linkedResourceId value to set.
     * @return the ScopedResourceInner object itself.
     */
    public ScopedResourceInner withLinkedResourceId(String linkedResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScopedResourceProperties();
        }
        this.innerProperties().withLinkedResourceId(linkedResourceId);
        return this;
    }

    /**
     * Get the provisioningState property: State of the private endpoint connection.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
