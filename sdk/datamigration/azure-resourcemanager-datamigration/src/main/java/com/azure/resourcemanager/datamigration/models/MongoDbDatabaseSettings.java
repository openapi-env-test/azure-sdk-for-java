// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Describes how an individual MongoDB database should be migrated. */
@Fluent
public final class MongoDbDatabaseSettings {
    /*
     * The collections on the source database to migrate to the target. The keys are the unqualified names of the
     * collections.
     */
    @JsonProperty(value = "collections", required = true)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, MongoDbCollectionSettings> collections;

    /*
     * The RUs that should be configured on a CosmosDB target, or null to use the default, or 0 if throughput should
     * not be provisioned for the database. This has no effect on non-CosmosDB targets.
     */
    @JsonProperty(value = "targetRUs")
    private Integer targetRUs;

    /** Creates an instance of MongoDbDatabaseSettings class. */
    public MongoDbDatabaseSettings() {
    }

    /**
     * Get the collections property: The collections on the source database to migrate to the target. The keys are the
     * unqualified names of the collections.
     *
     * @return the collections value.
     */
    public Map<String, MongoDbCollectionSettings> collections() {
        return this.collections;
    }

    /**
     * Set the collections property: The collections on the source database to migrate to the target. The keys are the
     * unqualified names of the collections.
     *
     * @param collections the collections value to set.
     * @return the MongoDbDatabaseSettings object itself.
     */
    public MongoDbDatabaseSettings withCollections(Map<String, MongoDbCollectionSettings> collections) {
        this.collections = collections;
        return this;
    }

    /**
     * Get the targetRUs property: The RUs that should be configured on a CosmosDB target, or null to use the default,
     * or 0 if throughput should not be provisioned for the database. This has no effect on non-CosmosDB targets.
     *
     * @return the targetRUs value.
     */
    public Integer targetRUs() {
        return this.targetRUs;
    }

    /**
     * Set the targetRUs property: The RUs that should be configured on a CosmosDB target, or null to use the default,
     * or 0 if throughput should not be provisioned for the database. This has no effect on non-CosmosDB targets.
     *
     * @param targetRUs the targetRUs value to set.
     * @return the MongoDbDatabaseSettings object itself.
     */
    public MongoDbDatabaseSettings withTargetRUs(Integer targetRUs) {
        this.targetRUs = targetRUs;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (collections() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property collections in model MongoDbDatabaseSettings"));
        } else {
            collections()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MongoDbDatabaseSettings.class);
}
