// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The List Extension operation response. */
@Fluent
public final class VirtualMachineExtensionsListResultInner {
    /*
     * The list of extensions
     */
    @JsonProperty(value = "value")
    private List<VirtualMachineExtensionInner> value;

    /** Creates an instance of VirtualMachineExtensionsListResultInner class. */
    public VirtualMachineExtensionsListResultInner() {
    }

    /**
     * Get the value property: The list of extensions.
     *
     * @return the value value.
     */
    public List<VirtualMachineExtensionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of extensions.
     *
     * @param value the value value to set.
     * @return the VirtualMachineExtensionsListResultInner object itself.
     */
    public VirtualMachineExtensionsListResultInner withValue(List<VirtualMachineExtensionInner> value) {
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
