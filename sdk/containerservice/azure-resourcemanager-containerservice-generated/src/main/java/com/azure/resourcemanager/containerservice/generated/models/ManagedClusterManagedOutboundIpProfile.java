// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Profile of the managed outbound IP resources of the managed cluster. */
@Fluent
public final class ManagedClusterManagedOutboundIpProfile {
    /*
     * The desired number of outbound IPs created/managed by Azure. Allowed
     * values must be in the range of 1 to 16 (inclusive). The default value is
     * 1.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /**
     * Get the count property: The desired number of outbound IPs created/managed by Azure. Allowed values must be in
     * the range of 1 to 16 (inclusive). The default value is 1.
     *
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count property: The desired number of outbound IPs created/managed by Azure. Allowed values must be in
     * the range of 1 to 16 (inclusive). The default value is 1.
     *
     * @param count the count value to set.
     * @return the ManagedClusterManagedOutboundIpProfile object itself.
     */
    public ManagedClusterManagedOutboundIpProfile withCount(Integer count) {
        this.count = count;
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
