// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.OperationDefinitionInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The result of a request to list container registry operations. */
@Fluent
public final class OperationListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationListResult.class);

    /*
     * The list of container registry operations. Since this list may be
     * incomplete, the nextLink field should be used to request the next list
     * of operations.
     */
    @JsonProperty(value = "value")
    private List<OperationDefinitionInner> value;

    /*
     * The URI that can be used to request the next list of container registry
     * operations.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of container registry operations. Since this list may be incomplete, the
     * nextLink field should be used to request the next list of operations.
     *
     * @return the value value.
     */
    public List<OperationDefinitionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of container registry operations. Since this list may be incomplete, the
     * nextLink field should be used to request the next list of operations.
     *
     * @param value the value value to set.
     * @return the OperationListResult object itself.
     */
    public OperationListResult withValue(List<OperationDefinitionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI that can be used to request the next list of container registry operations.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI that can be used to request the next list of container registry operations.
     *
     * @param nextLink the nextLink value to set.
     * @return the OperationListResult object itself.
     */
    public OperationListResult withNextLink(String nextLink) {
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
