// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.fluent.models.MetricNamespaceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents collection of metric namespaces. */
@Fluent
public final class MetricNamespaceCollection {
    /*
     * The values for the metric namespaces.
     */
    @JsonProperty(value = "value", required = true)
    private List<MetricNamespaceInner> value;

    /**
     * Get the value property: The values for the metric namespaces.
     *
     * @return the value value.
     */
    public List<MetricNamespaceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The values for the metric namespaces.
     *
     * @param value the value value to set.
     * @return the MetricNamespaceCollection object itself.
     */
    public MetricNamespaceCollection withValue(List<MetricNamespaceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model MetricNamespaceCollection"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MetricNamespaceCollection.class);
}
