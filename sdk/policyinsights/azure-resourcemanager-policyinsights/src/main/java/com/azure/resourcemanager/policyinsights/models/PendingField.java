// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A field that should be evaluated against Azure Policy to determine restrictions. */
@Fluent
public final class PendingField {
    /*
     * The name of the field. This can be a top-level property like 'name' or
     * 'type' or an Azure Policy field alias.
     */
    @JsonProperty(value = "field", required = true)
    private String field;

    /*
     * The list of potential values for the field that should be evaluated
     * against Azure Policy.
     */
    @JsonProperty(value = "values")
    private List<String> values;

    /**
     * Get the field property: The name of the field. This can be a top-level property like 'name' or 'type' or an Azure
     * Policy field alias.
     *
     * @return the field value.
     */
    public String field() {
        return this.field;
    }

    /**
     * Set the field property: The name of the field. This can be a top-level property like 'name' or 'type' or an Azure
     * Policy field alias.
     *
     * @param field the field value to set.
     * @return the PendingField object itself.
     */
    public PendingField withField(String field) {
        this.field = field;
        return this;
    }

    /**
     * Get the values property: The list of potential values for the field that should be evaluated against Azure
     * Policy.
     *
     * @return the values value.
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Set the values property: The list of potential values for the field that should be evaluated against Azure
     * Policy.
     *
     * @param values the values value to set.
     * @return the PendingField object itself.
     */
    public PendingField withValues(List<String> values) {
        this.values = values;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (field() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property field in model PendingField"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PendingField.class);
}
