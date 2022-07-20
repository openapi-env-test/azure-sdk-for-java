// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.generated.fluent.models.DatabaseRestoreResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Parameters to indicate the information about the restore. */
@Fluent
public final class RestoreParameters {
    /*
     * Describes the mode of the restore.
     */
    @JsonProperty(value = "restoreMode")
    private RestoreMode restoreMode;

    /*
     * The id of the restorable database account from which the restore has to
     * be initiated. For example:
     * /subscriptions/{subscriptionId}/providers/Microsoft.DocumentDB/locations/{location}/restorableDatabaseAccounts/{restorableDatabaseAccountName}
     */
    @JsonProperty(value = "restoreSource")
    private String restoreSource;

    /*
     * Time to which the account has to be restored (ISO-8601 format).
     */
    @JsonProperty(value = "restoreTimestampInUtc")
    private OffsetDateTime restoreTimestampInUtc;

    /*
     * List of specific databases available for restore.
     */
    @JsonProperty(value = "databasesToRestore")
    private List<DatabaseRestoreResourceInner> databasesToRestore;

    /*
     * List of specific gremlin databases available for restore.
     */
    @JsonProperty(value = "gremlinDatabasesToRestore")
    private List<GremlinDatabaseRestoreResource> gremlinDatabasesToRestore;

    /*
     * List of specific tables available for restore.
     */
    @JsonProperty(value = "tablesToRestore")
    private List<String> tablesToRestore;

    /**
     * Get the restoreMode property: Describes the mode of the restore.
     *
     * @return the restoreMode value.
     */
    public RestoreMode restoreMode() {
        return this.restoreMode;
    }

    /**
     * Set the restoreMode property: Describes the mode of the restore.
     *
     * @param restoreMode the restoreMode value to set.
     * @return the RestoreParameters object itself.
     */
    public RestoreParameters withRestoreMode(RestoreMode restoreMode) {
        this.restoreMode = restoreMode;
        return this;
    }

    /**
     * Get the restoreSource property: The id of the restorable database account from which the restore has to be
     * initiated. For example:
     * /subscriptions/{subscriptionId}/providers/Microsoft.DocumentDB/locations/{location}/restorableDatabaseAccounts/{restorableDatabaseAccountName}.
     *
     * @return the restoreSource value.
     */
    public String restoreSource() {
        return this.restoreSource;
    }

    /**
     * Set the restoreSource property: The id of the restorable database account from which the restore has to be
     * initiated. For example:
     * /subscriptions/{subscriptionId}/providers/Microsoft.DocumentDB/locations/{location}/restorableDatabaseAccounts/{restorableDatabaseAccountName}.
     *
     * @param restoreSource the restoreSource value to set.
     * @return the RestoreParameters object itself.
     */
    public RestoreParameters withRestoreSource(String restoreSource) {
        this.restoreSource = restoreSource;
        return this;
    }

    /**
     * Get the restoreTimestampInUtc property: Time to which the account has to be restored (ISO-8601 format).
     *
     * @return the restoreTimestampInUtc value.
     */
    public OffsetDateTime restoreTimestampInUtc() {
        return this.restoreTimestampInUtc;
    }

    /**
     * Set the restoreTimestampInUtc property: Time to which the account has to be restored (ISO-8601 format).
     *
     * @param restoreTimestampInUtc the restoreTimestampInUtc value to set.
     * @return the RestoreParameters object itself.
     */
    public RestoreParameters withRestoreTimestampInUtc(OffsetDateTime restoreTimestampInUtc) {
        this.restoreTimestampInUtc = restoreTimestampInUtc;
        return this;
    }

    /**
     * Get the databasesToRestore property: List of specific databases available for restore.
     *
     * @return the databasesToRestore value.
     */
    public List<DatabaseRestoreResourceInner> databasesToRestore() {
        return this.databasesToRestore;
    }

    /**
     * Set the databasesToRestore property: List of specific databases available for restore.
     *
     * @param databasesToRestore the databasesToRestore value to set.
     * @return the RestoreParameters object itself.
     */
    public RestoreParameters withDatabasesToRestore(List<DatabaseRestoreResourceInner> databasesToRestore) {
        this.databasesToRestore = databasesToRestore;
        return this;
    }

    /**
     * Get the gremlinDatabasesToRestore property: List of specific gremlin databases available for restore.
     *
     * @return the gremlinDatabasesToRestore value.
     */
    public List<GremlinDatabaseRestoreResource> gremlinDatabasesToRestore() {
        return this.gremlinDatabasesToRestore;
    }

    /**
     * Set the gremlinDatabasesToRestore property: List of specific gremlin databases available for restore.
     *
     * @param gremlinDatabasesToRestore the gremlinDatabasesToRestore value to set.
     * @return the RestoreParameters object itself.
     */
    public RestoreParameters withGremlinDatabasesToRestore(
        List<GremlinDatabaseRestoreResource> gremlinDatabasesToRestore) {
        this.gremlinDatabasesToRestore = gremlinDatabasesToRestore;
        return this;
    }

    /**
     * Get the tablesToRestore property: List of specific tables available for restore.
     *
     * @return the tablesToRestore value.
     */
    public List<String> tablesToRestore() {
        return this.tablesToRestore;
    }

    /**
     * Set the tablesToRestore property: List of specific tables available for restore.
     *
     * @param tablesToRestore the tablesToRestore value to set.
     * @return the RestoreParameters object itself.
     */
    public RestoreParameters withTablesToRestore(List<String> tablesToRestore) {
        this.tablesToRestore = tablesToRestore;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (databasesToRestore() != null) {
            databasesToRestore().forEach(e -> e.validate());
        }
        if (gremlinDatabasesToRestore() != null) {
            gremlinDatabasesToRestore().forEach(e -> e.validate());
        }
    }
}
