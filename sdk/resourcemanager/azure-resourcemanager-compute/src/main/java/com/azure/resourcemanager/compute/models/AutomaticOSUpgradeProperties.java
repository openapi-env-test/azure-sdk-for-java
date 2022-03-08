// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes automatic OS upgrade properties on the image. */
@Fluent
public final class AutomaticOSUpgradeProperties {
    /*
     * Specifies whether automatic OS upgrade is supported on the image.
     */
    @JsonProperty(value = "automaticOSUpgradeSupported", required = true)
    private boolean automaticOSUpgradeSupported;

    /**
     * Get the automaticOSUpgradeSupported property: Specifies whether automatic OS upgrade is supported on the image.
     *
     * @return the automaticOSUpgradeSupported value.
     */
    public boolean automaticOSUpgradeSupported() {
        return this.automaticOSUpgradeSupported;
    }

    /**
     * Set the automaticOSUpgradeSupported property: Specifies whether automatic OS upgrade is supported on the image.
     *
     * @param automaticOSUpgradeSupported the automaticOSUpgradeSupported value to set.
     * @return the AutomaticOSUpgradeProperties object itself.
     */
    public AutomaticOSUpgradeProperties withAutomaticOSUpgradeSupported(boolean automaticOSUpgradeSupported) {
        this.automaticOSUpgradeSupported = automaticOSUpgradeSupported;
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
