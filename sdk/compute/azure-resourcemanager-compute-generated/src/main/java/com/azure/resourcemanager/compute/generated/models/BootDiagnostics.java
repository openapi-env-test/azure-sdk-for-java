// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Boot Diagnostics is a debugging feature which allows you to view Console Output and Screenshot to diagnose VM status.
 * &lt;br&gt;&lt;br&gt; You can easily view the output of your console log. &lt;br&gt;&lt;br&gt; Azure also enables you
 * to see a screenshot of the VM from the hypervisor.
 */
@Fluent
public final class BootDiagnostics {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BootDiagnostics.class);

    /*
     * Whether boot diagnostics should be enabled on the Virtual Machine.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * Uri of the storage account to use for placing the console output and
     * screenshot. <br><br>If storageUri is not specified while enabling boot
     * diagnostics, managed storage will be used.
     */
    @JsonProperty(value = "storageUri")
    private String storageUri;

    /**
     * Get the enabled property: Whether boot diagnostics should be enabled on the Virtual Machine.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether boot diagnostics should be enabled on the Virtual Machine.
     *
     * @param enabled the enabled value to set.
     * @return the BootDiagnostics object itself.
     */
    public BootDiagnostics withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the storageUri property: Uri of the storage account to use for placing the console output and screenshot.
     * &lt;br&gt;&lt;br&gt;If storageUri is not specified while enabling boot diagnostics, managed storage will be used.
     *
     * @return the storageUri value.
     */
    public String storageUri() {
        return this.storageUri;
    }

    /**
     * Set the storageUri property: Uri of the storage account to use for placing the console output and screenshot.
     * &lt;br&gt;&lt;br&gt;If storageUri is not specified while enabling boot diagnostics, managed storage will be used.
     *
     * @param storageUri the storageUri value to set.
     * @return the BootDiagnostics object itself.
     */
    public BootDiagnostics withStorageUri(String storageUri) {
        this.storageUri = storageUri;
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
