// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the security settings like secure boot and vTPM used while creating the virtual machine.
 * &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-12-01.
 */
@Fluent
public final class UefiSettings {
    /*
     * Specifies whether secure boot should be enabled on the virtual machine.
     * <br><br>Minimum api-version: 2020-12-01
     */
    @JsonProperty(value = "secureBootEnabled")
    private Boolean secureBootEnabled;

    /*
     * Specifies whether vTPM should be enabled on the virtual machine.
     * <br><br>Minimum api-version: 2020-12-01
     */
    @JsonProperty(value = "vTpmEnabled")
    private Boolean vTpmEnabled;

    /**
     * Get the secureBootEnabled property: Specifies whether secure boot should be enabled on the virtual machine.
     * &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-12-01.
     *
     * @return the secureBootEnabled value.
     */
    public Boolean secureBootEnabled() {
        return this.secureBootEnabled;
    }

    /**
     * Set the secureBootEnabled property: Specifies whether secure boot should be enabled on the virtual machine.
     * &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-12-01.
     *
     * @param secureBootEnabled the secureBootEnabled value to set.
     * @return the UefiSettings object itself.
     */
    public UefiSettings withSecureBootEnabled(Boolean secureBootEnabled) {
        this.secureBootEnabled = secureBootEnabled;
        return this;
    }

    /**
     * Get the vTpmEnabled property: Specifies whether vTPM should be enabled on the virtual machine.
     * &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-12-01.
     *
     * @return the vTpmEnabled value.
     */
    public Boolean vTpmEnabled() {
        return this.vTpmEnabled;
    }

    /**
     * Set the vTpmEnabled property: Specifies whether vTPM should be enabled on the virtual machine.
     * &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-12-01.
     *
     * @param vTpmEnabled the vTpmEnabled value to set.
     * @return the UefiSettings object itself.
     */
    public UefiSettings withVTpmEnabled(Boolean vTpmEnabled) {
        this.vTpmEnabled = vTpmEnabled;
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
