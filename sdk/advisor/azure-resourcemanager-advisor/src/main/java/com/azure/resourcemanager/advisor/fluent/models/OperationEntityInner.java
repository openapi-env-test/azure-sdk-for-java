// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.advisor.models.OperationDisplayInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The operation supported by Advisor. */
@Fluent
public final class OperationEntityInner {
    /*
     * Operation name: {provider}/{resource}/{operation}.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The operation supported by Advisor.
     */
    @JsonProperty(value = "display")
    private OperationDisplayInfo display;

    /**
     * Get the name property: Operation name: {provider}/{resource}/{operation}.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Operation name: {provider}/{resource}/{operation}.
     *
     * @param name the name value to set.
     * @return the OperationEntityInner object itself.
     */
    public OperationEntityInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display property: The operation supported by Advisor.
     *
     * @return the display value.
     */
    public OperationDisplayInfo display() {
        return this.display;
    }

    /**
     * Set the display property: The operation supported by Advisor.
     *
     * @param display the display value to set.
     * @return the OperationEntityInner object itself.
     */
    public OperationEntityInner withDisplay(OperationDisplayInfo display) {
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
