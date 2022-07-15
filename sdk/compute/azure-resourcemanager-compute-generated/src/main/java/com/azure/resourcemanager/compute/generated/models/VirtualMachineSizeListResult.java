// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineSizeInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The List Virtual Machine operation response. */
@Fluent
public final class VirtualMachineSizeListResult {
    /*
     * The list of virtual machine sizes.
     */
    @JsonProperty(value = "value")
    private List<VirtualMachineSizeInner> value;

    /**
     * Get the value property: The list of virtual machine sizes.
     *
     * @return the value value.
     */
    public List<VirtualMachineSizeInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of virtual machine sizes.
     *
     * @param value the value value to set.
     * @return the VirtualMachineSizeListResult object itself.
     */
    public VirtualMachineSizeListResult withValue(List<VirtualMachineSizeInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
