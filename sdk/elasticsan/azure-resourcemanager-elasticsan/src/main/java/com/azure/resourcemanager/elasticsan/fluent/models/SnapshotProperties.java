// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.elasticsan.models.SnapshotCreationData;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties for Snapshot. */
@Fluent
public final class SnapshotProperties {
    /*
     * State of the operation on the resource.
     */
    @JsonProperty(value = "creationData")
    private SnapshotCreationData creationData;

    /*
     * The snapshot provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the creationData property: State of the operation on the resource.
     *
     * @return the creationData value.
     */
    public SnapshotCreationData creationData() {
        return this.creationData;
    }

    /**
     * Set the creationData property: State of the operation on the resource.
     *
     * @param creationData the creationData value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withCreationData(SnapshotCreationData creationData) {
        this.creationData = creationData;
        return this;
    }

    /**
     * Get the provisioningState property: The snapshot provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (creationData() != null) {
            creationData().validate();
        }
    }
}
