// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of recommended sensitivity label update operations. */
@Fluent
public final class RecommendedSensitivityLabelUpdateList {
    /*
     * The operations property.
     */
    @JsonProperty(value = "operations")
    private List<RecommendedSensitivityLabelUpdate> operations;

    /** Creates an instance of RecommendedSensitivityLabelUpdateList class. */
    public RecommendedSensitivityLabelUpdateList() {
    }

    /**
     * Get the operations property: The operations property.
     *
     * @return the operations value.
     */
    public List<RecommendedSensitivityLabelUpdate> operations() {
        return this.operations;
    }

    /**
     * Set the operations property: The operations property.
     *
     * @param operations the operations value to set.
     * @return the RecommendedSensitivityLabelUpdateList object itself.
     */
    public RecommendedSensitivityLabelUpdateList withOperations(List<RecommendedSensitivityLabelUpdate> operations) {
        this.operations = operations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (operations() != null) {
            operations().forEach(e -> e.validate());
        }
    }
}
