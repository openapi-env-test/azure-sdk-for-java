// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AzureBlob CSI Driver settings for the storage profile. */
@Fluent
public final class ManagedClusterStorageProfileBlobCsiDriver {
    /*
     * Whether to enable AzureBlob CSI Driver. The default value is false.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Get the enabled property: Whether to enable AzureBlob CSI Driver. The default value is false.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether to enable AzureBlob CSI Driver. The default value is false.
     *
     * @param enabled the enabled value to set.
     * @return the ManagedClusterStorageProfileBlobCsiDriver object itself.
     */
    public ManagedClusterStorageProfileBlobCsiDriver withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
