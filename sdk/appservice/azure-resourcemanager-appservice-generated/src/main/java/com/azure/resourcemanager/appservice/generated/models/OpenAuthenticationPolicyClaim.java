// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Open authentication policy claim. */
@Fluent
public final class OpenAuthenticationPolicyClaim {
    /*
     * The name of the claim.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The value of the claim.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the name property: The name of the claim.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the claim.
     *
     * @param name the name value to set.
     * @return the OpenAuthenticationPolicyClaim object itself.
     */
    public OpenAuthenticationPolicyClaim withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The value of the claim.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The value of the claim.
     *
     * @param value the value value to set.
     * @return the OpenAuthenticationPolicyClaim object itself.
     */
    public OpenAuthenticationPolicyClaim withValue(String value) {
        this.value = value;
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
