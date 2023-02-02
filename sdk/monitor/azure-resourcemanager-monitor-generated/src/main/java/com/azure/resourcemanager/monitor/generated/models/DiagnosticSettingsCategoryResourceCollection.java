// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.monitor.generated.fluent.models.DiagnosticSettingsCategoryResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents a collection of diagnostic setting category resources. */
@Fluent
public final class DiagnosticSettingsCategoryResourceCollection {
    /*
     * The collection of diagnostic settings category resources.
     */
    @JsonProperty(value = "value")
    private List<DiagnosticSettingsCategoryResourceInner> value;

    /** Creates an instance of DiagnosticSettingsCategoryResourceCollection class. */
    public DiagnosticSettingsCategoryResourceCollection() {
    }

    /**
     * Get the value property: The collection of diagnostic settings category resources.
     *
     * @return the value value.
     */
    public List<DiagnosticSettingsCategoryResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The collection of diagnostic settings category resources.
     *
     * @param value the value value to set.
     * @return the DiagnosticSettingsCategoryResourceCollection object itself.
     */
    public DiagnosticSettingsCategoryResourceCollection withValue(List<DiagnosticSettingsCategoryResourceInner> value) {
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
