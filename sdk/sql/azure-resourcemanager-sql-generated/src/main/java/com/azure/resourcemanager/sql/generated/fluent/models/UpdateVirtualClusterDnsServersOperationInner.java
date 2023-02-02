// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.sql.generated.models.DnsRefreshOperationStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A refresh DNS servers operation. */
@Immutable
public final class UpdateVirtualClusterDnsServersOperationInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private VirtualClusterDnsServersProperties innerProperties;

    /** Creates an instance of UpdateVirtualClusterDnsServersOperationInner class. */
    public UpdateVirtualClusterDnsServersOperationInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private VirtualClusterDnsServersProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the status property: The status of the DNS refresh operation.
     *
     * @return the status value.
     */
    public DnsRefreshOperationStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
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
