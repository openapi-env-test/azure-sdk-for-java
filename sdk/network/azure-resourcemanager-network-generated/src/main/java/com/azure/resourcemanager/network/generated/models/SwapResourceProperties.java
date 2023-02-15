// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Swap resource properties. */
@Fluent
public final class SwapResourceProperties {
    /*
     * Specifies slot info on a cloud service
     */
    @JsonProperty(value = "slotType")
    private SlotType slotType;

    /** Creates an instance of SwapResourceProperties class. */
    public SwapResourceProperties() {
    }

    /**
     * Get the slotType property: Specifies slot info on a cloud service.
     *
     * @return the slotType value.
     */
    public SlotType slotType() {
        return this.slotType;
    }

    /**
     * Set the slotType property: Specifies slot info on a cloud service.
     *
     * @param slotType the slotType value to set.
     * @return the SwapResourceProperties object itself.
     */
    public SwapResourceProperties withSlotType(SlotType slotType) {
        this.slotType = slotType;
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
