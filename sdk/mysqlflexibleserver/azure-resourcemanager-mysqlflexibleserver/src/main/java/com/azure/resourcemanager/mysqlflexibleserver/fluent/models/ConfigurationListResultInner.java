// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of server configurations. */
@Fluent
public final class ConfigurationListResultInner {
    /*
     * The list of server configurations.
     */
    @JsonProperty(value = "value")
    private List<ConfigurationInner> value;

    /**
     * Get the value property: The list of server configurations.
     *
     * @return the value value.
     */
    public List<ConfigurationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of server configurations.
     *
     * @param value the value value to set.
     * @return the ConfigurationListResultInner object itself.
     */
    public ConfigurationListResultInner withValue(List<ConfigurationInner> value) {
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
