// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** The MigrateMySqlAzureDbForMySqlOfflineTaskOutputTableLevel model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("TableLevelOutput")
@Immutable
public final class MigrateMySqlAzureDbForMySqlOfflineTaskOutputTableLevel
    extends MigrateMySqlAzureDbForMySqlOfflineTaskOutput {
    /*
     * Name of the item
     */
    @JsonProperty(value = "objectName", access = JsonProperty.Access.WRITE_ONLY)
    private String objectName;

    /*
     * Migration start time
     */
    @JsonProperty(value = "startedOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startedOn;

    /*
     * Migration end time
     */
    @JsonProperty(value = "endedOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endedOn;

    /*
     * Current state of migration
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private MigrationState state;

    /*
     * Status message
     */
    @JsonProperty(value = "statusMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String statusMessage;

    /*
     * Number of items
     */
    @JsonProperty(value = "itemsCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long itemsCount;

    /*
     * Number of successfully completed items
     */
    @JsonProperty(value = "itemsCompletedCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long itemsCompletedCount;

    /*
     * Wildcard string prefix to use for querying all errors of the item
     */
    @JsonProperty(value = "errorPrefix", access = JsonProperty.Access.WRITE_ONLY)
    private String errorPrefix;

    /*
     * Wildcard string prefix to use for querying all sub-tem results of the
     * item
     */
    @JsonProperty(value = "resultPrefix", access = JsonProperty.Access.WRITE_ONLY)
    private String resultPrefix;

    /*
     * Last time the storage was updated
     */
    @JsonProperty(value = "lastStorageUpdate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastStorageUpdate;

    /**
     * Get the objectName property: Name of the item.
     *
     * @return the objectName value.
     */
    public String objectName() {
        return this.objectName;
    }

    /**
     * Get the startedOn property: Migration start time.
     *
     * @return the startedOn value.
     */
    public OffsetDateTime startedOn() {
        return this.startedOn;
    }

    /**
     * Get the endedOn property: Migration end time.
     *
     * @return the endedOn value.
     */
    public OffsetDateTime endedOn() {
        return this.endedOn;
    }

    /**
     * Get the state property: Current state of migration.
     *
     * @return the state value.
     */
    public MigrationState state() {
        return this.state;
    }

    /**
     * Get the statusMessage property: Status message.
     *
     * @return the statusMessage value.
     */
    public String statusMessage() {
        return this.statusMessage;
    }

    /**
     * Get the itemsCount property: Number of items.
     *
     * @return the itemsCount value.
     */
    public Long itemsCount() {
        return this.itemsCount;
    }

    /**
     * Get the itemsCompletedCount property: Number of successfully completed items.
     *
     * @return the itemsCompletedCount value.
     */
    public Long itemsCompletedCount() {
        return this.itemsCompletedCount;
    }

    /**
     * Get the errorPrefix property: Wildcard string prefix to use for querying all errors of the item.
     *
     * @return the errorPrefix value.
     */
    public String errorPrefix() {
        return this.errorPrefix;
    }

    /**
     * Get the resultPrefix property: Wildcard string prefix to use for querying all sub-tem results of the item.
     *
     * @return the resultPrefix value.
     */
    public String resultPrefix() {
        return this.resultPrefix;
    }

    /**
     * Get the lastStorageUpdate property: Last time the storage was updated.
     *
     * @return the lastStorageUpdate value.
     */
    public OffsetDateTime lastStorageUpdate() {
        return this.lastStorageUpdate;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
