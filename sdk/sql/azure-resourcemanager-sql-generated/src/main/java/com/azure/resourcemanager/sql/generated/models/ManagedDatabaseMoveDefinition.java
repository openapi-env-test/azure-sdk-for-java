// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains the information necessary to perform a managed database move. */
@Fluent
public final class ManagedDatabaseMoveDefinition {
    /*
     * The destination managed database ID
     */
    @JsonProperty(value = "destinationManagedDatabaseId", required = true)
    private String destinationManagedDatabaseId;

    /** Creates an instance of ManagedDatabaseMoveDefinition class. */
    public ManagedDatabaseMoveDefinition() {
    }

    /**
     * Get the destinationManagedDatabaseId property: The destination managed database ID.
     *
     * @return the destinationManagedDatabaseId value.
     */
    public String destinationManagedDatabaseId() {
        return this.destinationManagedDatabaseId;
    }

    /**
     * Set the destinationManagedDatabaseId property: The destination managed database ID.
     *
     * @param destinationManagedDatabaseId the destinationManagedDatabaseId value to set.
     * @return the ManagedDatabaseMoveDefinition object itself.
     */
    public ManagedDatabaseMoveDefinition withDestinationManagedDatabaseId(String destinationManagedDatabaseId) {
        this.destinationManagedDatabaseId = destinationManagedDatabaseId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (destinationManagedDatabaseId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property destinationManagedDatabaseId in model"
                            + " ManagedDatabaseMoveDefinition"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedDatabaseMoveDefinition.class);
}
