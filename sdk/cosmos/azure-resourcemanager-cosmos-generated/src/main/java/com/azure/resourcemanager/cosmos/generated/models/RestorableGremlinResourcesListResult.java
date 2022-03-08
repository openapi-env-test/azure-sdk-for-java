// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.models.GremlinDatabaseRestoreResourceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The List operation response, that contains the restorable Gremlin resources. */
@Immutable
public final class RestorableGremlinResourcesListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestorableGremlinResourcesListResult.class);

    /*
     * List of restorable Gremlin resources, including the gremlin database and
     * graph names.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<GremlinDatabaseRestoreResourceInner> value;

    /**
     * Get the value property: List of restorable Gremlin resources, including the gremlin database and graph names.
     *
     * @return the value value.
     */
    public List<GremlinDatabaseRestoreResourceInner> value() {
        return this.value;
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
