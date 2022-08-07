// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.sql.generated.models.Sku;
import com.azure.resourcemanager.sql.generated.models.SyncConflictResolutionPolicy;
import com.azure.resourcemanager.sql.generated.models.SyncGroupSchema;
import com.azure.resourcemanager.sql.generated.models.SyncGroupState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** An Azure SQL Database sync group. */
@Fluent
public final class SyncGroupInner extends ProxyResource {
    /*
     * The name and capacity of the SKU.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private SyncGroupProperties innerProperties;

    /**
     * Get the sku property: The name and capacity of the SKU.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The name and capacity of the SKU.
     *
     * @param sku the sku value to set.
     * @return the SyncGroupInner object itself.
     */
    public SyncGroupInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private SyncGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the interval property: Sync interval of the sync group.
     *
     * @return the interval value.
     */
    public Integer interval() {
        return this.innerProperties() == null ? null : this.innerProperties().interval();
    }

    /**
     * Set the interval property: Sync interval of the sync group.
     *
     * @param interval the interval value to set.
     * @return the SyncGroupInner object itself.
     */
    public SyncGroupInner withInterval(Integer interval) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SyncGroupProperties();
        }
        this.innerProperties().withInterval(interval);
        return this;
    }

    /**
     * Get the lastSyncTime property: Last sync time of the sync group.
     *
     * @return the lastSyncTime value.
     */
    public OffsetDateTime lastSyncTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastSyncTime();
    }

    /**
     * Get the conflictResolutionPolicy property: Conflict resolution policy of the sync group.
     *
     * @return the conflictResolutionPolicy value.
     */
    public SyncConflictResolutionPolicy conflictResolutionPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().conflictResolutionPolicy();
    }

    /**
     * Set the conflictResolutionPolicy property: Conflict resolution policy of the sync group.
     *
     * @param conflictResolutionPolicy the conflictResolutionPolicy value to set.
     * @return the SyncGroupInner object itself.
     */
    public SyncGroupInner withConflictResolutionPolicy(SyncConflictResolutionPolicy conflictResolutionPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SyncGroupProperties();
        }
        this.innerProperties().withConflictResolutionPolicy(conflictResolutionPolicy);
        return this;
    }

    /**
     * Get the syncDatabaseId property: ARM resource id of the sync database in the sync group.
     *
     * @return the syncDatabaseId value.
     */
    public String syncDatabaseId() {
        return this.innerProperties() == null ? null : this.innerProperties().syncDatabaseId();
    }

    /**
     * Set the syncDatabaseId property: ARM resource id of the sync database in the sync group.
     *
     * @param syncDatabaseId the syncDatabaseId value to set.
     * @return the SyncGroupInner object itself.
     */
    public SyncGroupInner withSyncDatabaseId(String syncDatabaseId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SyncGroupProperties();
        }
        this.innerProperties().withSyncDatabaseId(syncDatabaseId);
        return this;
    }

    /**
     * Get the hubDatabaseUsername property: User name for the sync group hub database credential.
     *
     * @return the hubDatabaseUsername value.
     */
    public String hubDatabaseUsername() {
        return this.innerProperties() == null ? null : this.innerProperties().hubDatabaseUsername();
    }

    /**
     * Set the hubDatabaseUsername property: User name for the sync group hub database credential.
     *
     * @param hubDatabaseUsername the hubDatabaseUsername value to set.
     * @return the SyncGroupInner object itself.
     */
    public SyncGroupInner withHubDatabaseUsername(String hubDatabaseUsername) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SyncGroupProperties();
        }
        this.innerProperties().withHubDatabaseUsername(hubDatabaseUsername);
        return this;
    }

    /**
     * Get the hubDatabasePassword property: Password for the sync group hub database credential.
     *
     * @return the hubDatabasePassword value.
     */
    public String hubDatabasePassword() {
        return this.innerProperties() == null ? null : this.innerProperties().hubDatabasePassword();
    }

    /**
     * Set the hubDatabasePassword property: Password for the sync group hub database credential.
     *
     * @param hubDatabasePassword the hubDatabasePassword value to set.
     * @return the SyncGroupInner object itself.
     */
    public SyncGroupInner withHubDatabasePassword(String hubDatabasePassword) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SyncGroupProperties();
        }
        this.innerProperties().withHubDatabasePassword(hubDatabasePassword);
        return this;
    }

    /**
     * Get the syncState property: Sync state of the sync group.
     *
     * @return the syncState value.
     */
    public SyncGroupState syncState() {
        return this.innerProperties() == null ? null : this.innerProperties().syncState();
    }

    /**
     * Get the schema property: Sync schema of the sync group.
     *
     * @return the schema value.
     */
    public SyncGroupSchema schema() {
        return this.innerProperties() == null ? null : this.innerProperties().schema();
    }

    /**
     * Set the schema property: Sync schema of the sync group.
     *
     * @param schema the schema value to set.
     * @return the SyncGroupInner object itself.
     */
    public SyncGroupInner withSchema(SyncGroupSchema schema) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SyncGroupProperties();
        }
        this.innerProperties().withSchema(schema);
        return this;
    }

    /**
     * Get the enableConflictLogging property: If conflict logging is enabled.
     *
     * @return the enableConflictLogging value.
     */
    public Boolean enableConflictLogging() {
        return this.innerProperties() == null ? null : this.innerProperties().enableConflictLogging();
    }

    /**
     * Set the enableConflictLogging property: If conflict logging is enabled.
     *
     * @param enableConflictLogging the enableConflictLogging value to set.
     * @return the SyncGroupInner object itself.
     */
    public SyncGroupInner withEnableConflictLogging(Boolean enableConflictLogging) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SyncGroupProperties();
        }
        this.innerProperties().withEnableConflictLogging(enableConflictLogging);
        return this;
    }

    /**
     * Get the conflictLoggingRetentionInDays property: Conflict logging retention period.
     *
     * @return the conflictLoggingRetentionInDays value.
     */
    public Integer conflictLoggingRetentionInDays() {
        return this.innerProperties() == null ? null : this.innerProperties().conflictLoggingRetentionInDays();
    }

    /**
     * Set the conflictLoggingRetentionInDays property: Conflict logging retention period.
     *
     * @param conflictLoggingRetentionInDays the conflictLoggingRetentionInDays value to set.
     * @return the SyncGroupInner object itself.
     */
    public SyncGroupInner withConflictLoggingRetentionInDays(Integer conflictLoggingRetentionInDays) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SyncGroupProperties();
        }
        this.innerProperties().withConflictLoggingRetentionInDays(conflictLoggingRetentionInDays);
        return this;
    }

    /**
     * Get the usePrivateLinkConnection property: If use private link connection is enabled.
     *
     * @return the usePrivateLinkConnection value.
     */
    public Boolean usePrivateLinkConnection() {
        return this.innerProperties() == null ? null : this.innerProperties().usePrivateLinkConnection();
    }

    /**
     * Set the usePrivateLinkConnection property: If use private link connection is enabled.
     *
     * @param usePrivateLinkConnection the usePrivateLinkConnection value to set.
     * @return the SyncGroupInner object itself.
     */
    public SyncGroupInner withUsePrivateLinkConnection(Boolean usePrivateLinkConnection) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SyncGroupProperties();
        }
        this.innerProperties().withUsePrivateLinkConnection(usePrivateLinkConnection);
        return this;
    }

    /**
     * Get the privateEndpointName property: Private endpoint name of the sync group if use private link connection is
     * enabled.
     *
     * @return the privateEndpointName value.
     */
    public String privateEndpointName() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointName();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
