// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.managementgroups.models.OperationDisplayProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Operation supported by the Microsoft.Management resource provider. */
@Fluent
public final class OperationInner {
    /*
     * Operation name: {provider}/{resource}/{operation}.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The object that represents the operation.
     */
    @JsonProperty(value = "display")
    private OperationDisplayProperties display;

    /**
     * Get the name property: Operation name: {provider}/{resource}/{operation}.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the display property: The object that represents the operation.
     *
     * @return the display value.
     */
    public OperationDisplayProperties display() {
        return this.display;
    }

    /**
     * Set the display property: The object that represents the operation.
     *
     * @param display the display value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplayProperties display) {
        this.display = display;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
    }
}
