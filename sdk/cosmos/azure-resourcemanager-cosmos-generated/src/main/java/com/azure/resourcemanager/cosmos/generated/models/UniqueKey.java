// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The unique key on that enforces uniqueness constraint on documents in the collection in the Azure Cosmos DB service.
 */
@Fluent
public final class UniqueKey {
    /*
     * List of paths must be unique for each document in the Azure Cosmos DB
     * service
     */
    @JsonProperty(value = "paths")
    private List<String> paths;

    /**
     * Get the paths property: List of paths must be unique for each document in the Azure Cosmos DB service.
     *
     * @return the paths value.
     */
    public List<String> paths() {
        return this.paths;
    }

    /**
     * Set the paths property: List of paths must be unique for each document in the Azure Cosmos DB service.
     *
     * @param paths the paths value to set.
     * @return the UniqueKey object itself.
     */
    public UniqueKey withPaths(List<String> paths) {
        this.paths = paths;
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
