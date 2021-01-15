// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.models.ContainerServiceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response from the List Container Services operation. */
@Fluent
public final class ContainerServiceListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerServiceListResult.class);

    /*
     * the list of container services.
     */
    @JsonProperty(value = "value")
    private List<ContainerServiceInner> value;

    /*
     * The URL to get the next set of container service results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: the list of container services.
     *
     * @return the value value.
     */
    public List<ContainerServiceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: the list of container services.
     *
     * @param value the value value to set.
     * @return the ContainerServiceListResult object itself.
     */
    public ContainerServiceListResult withValue(List<ContainerServiceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of container service results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of container service results.
     *
     * @param nextLink the nextLink value to set.
     * @return the ContainerServiceListResult object itself.
     */
    public ContainerServiceListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
