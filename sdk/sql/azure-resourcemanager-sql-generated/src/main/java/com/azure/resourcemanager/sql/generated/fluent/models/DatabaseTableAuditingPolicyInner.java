// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** A database table auditing policy. */
@JsonFlatten
@Fluent
public class DatabaseTableAuditingPolicyInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabaseTableAuditingPolicyInner.class);

    /*
     * Resource kind.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * Resource location.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * The state of the policy.
     */
    @JsonProperty(value = "properties.auditingState")
    private String auditingState;

    /*
     * The audit logs table name.
     */
    @JsonProperty(value = "properties.auditLogsTableName")
    private String auditLogsTableName;

    /*
     * Comma-separated list of event types to audit.
     */
    @JsonProperty(value = "properties.eventTypesToAudit")
    private String eventTypesToAudit;

    /*
     * The full audit logs table name.
     */
    @JsonProperty(value = "properties.fullAuditLogsTableName")
    private String fullAuditLogsTableName;

    /*
     * The number of days to keep in the audit logs.
     */
    @JsonProperty(value = "properties.retentionDays")
    private String retentionDays;

    /*
     * The key of the auditing storage account.
     */
    @JsonProperty(value = "properties.storageAccountKey")
    private String storageAccountKey;

    /*
     * The table storage account name
     */
    @JsonProperty(value = "properties.storageAccountName")
    private String storageAccountName;

    /*
     * The table storage account resource group name
     */
    @JsonProperty(value = "properties.storageAccountResourceGroupName")
    private String storageAccountResourceGroupName;

    /*
     * The secondary key of the auditing storage account.
     */
    @JsonProperty(value = "properties.storageAccountSecondaryKey")
    private String storageAccountSecondaryKey;

    /*
     * The table storage subscription Id.
     */
    @JsonProperty(value = "properties.storageAccountSubscriptionId")
    private UUID storageAccountSubscriptionId;

    /*
     * The storage table endpoint.
     */
    @JsonProperty(value = "properties.storageTableEndpoint")
    private String storageTableEndpoint;

    /*
     * Whether server default is enabled or disabled.
     */
    @JsonProperty(value = "properties.useServerDefault")
    private String useServerDefault;

    /**
     * Get the kind property: Resource kind.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the location property: Resource location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the auditingState property: The state of the policy.
     *
     * @return the auditingState value.
     */
    public String auditingState() {
        return this.auditingState;
    }

    /**
     * Set the auditingState property: The state of the policy.
     *
     * @param auditingState the auditingState value to set.
     * @return the DatabaseTableAuditingPolicyInner object itself.
     */
    public DatabaseTableAuditingPolicyInner withAuditingState(String auditingState) {
        this.auditingState = auditingState;
        return this;
    }

    /**
     * Get the auditLogsTableName property: The audit logs table name.
     *
     * @return the auditLogsTableName value.
     */
    public String auditLogsTableName() {
        return this.auditLogsTableName;
    }

    /**
     * Set the auditLogsTableName property: The audit logs table name.
     *
     * @param auditLogsTableName the auditLogsTableName value to set.
     * @return the DatabaseTableAuditingPolicyInner object itself.
     */
    public DatabaseTableAuditingPolicyInner withAuditLogsTableName(String auditLogsTableName) {
        this.auditLogsTableName = auditLogsTableName;
        return this;
    }

    /**
     * Get the eventTypesToAudit property: Comma-separated list of event types to audit.
     *
     * @return the eventTypesToAudit value.
     */
    public String eventTypesToAudit() {
        return this.eventTypesToAudit;
    }

    /**
     * Set the eventTypesToAudit property: Comma-separated list of event types to audit.
     *
     * @param eventTypesToAudit the eventTypesToAudit value to set.
     * @return the DatabaseTableAuditingPolicyInner object itself.
     */
    public DatabaseTableAuditingPolicyInner withEventTypesToAudit(String eventTypesToAudit) {
        this.eventTypesToAudit = eventTypesToAudit;
        return this;
    }

    /**
     * Get the fullAuditLogsTableName property: The full audit logs table name.
     *
     * @return the fullAuditLogsTableName value.
     */
    public String fullAuditLogsTableName() {
        return this.fullAuditLogsTableName;
    }

    /**
     * Set the fullAuditLogsTableName property: The full audit logs table name.
     *
     * @param fullAuditLogsTableName the fullAuditLogsTableName value to set.
     * @return the DatabaseTableAuditingPolicyInner object itself.
     */
    public DatabaseTableAuditingPolicyInner withFullAuditLogsTableName(String fullAuditLogsTableName) {
        this.fullAuditLogsTableName = fullAuditLogsTableName;
        return this;
    }

    /**
     * Get the retentionDays property: The number of days to keep in the audit logs.
     *
     * @return the retentionDays value.
     */
    public String retentionDays() {
        return this.retentionDays;
    }

    /**
     * Set the retentionDays property: The number of days to keep in the audit logs.
     *
     * @param retentionDays the retentionDays value to set.
     * @return the DatabaseTableAuditingPolicyInner object itself.
     */
    public DatabaseTableAuditingPolicyInner withRetentionDays(String retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /**
     * Get the storageAccountKey property: The key of the auditing storage account.
     *
     * @return the storageAccountKey value.
     */
    public String storageAccountKey() {
        return this.storageAccountKey;
    }

    /**
     * Set the storageAccountKey property: The key of the auditing storage account.
     *
     * @param storageAccountKey the storageAccountKey value to set.
     * @return the DatabaseTableAuditingPolicyInner object itself.
     */
    public DatabaseTableAuditingPolicyInner withStorageAccountKey(String storageAccountKey) {
        this.storageAccountKey = storageAccountKey;
        return this;
    }

    /**
     * Get the storageAccountName property: The table storage account name.
     *
     * @return the storageAccountName value.
     */
    public String storageAccountName() {
        return this.storageAccountName;
    }

    /**
     * Set the storageAccountName property: The table storage account name.
     *
     * @param storageAccountName the storageAccountName value to set.
     * @return the DatabaseTableAuditingPolicyInner object itself.
     */
    public DatabaseTableAuditingPolicyInner withStorageAccountName(String storageAccountName) {
        this.storageAccountName = storageAccountName;
        return this;
    }

    /**
     * Get the storageAccountResourceGroupName property: The table storage account resource group name.
     *
     * @return the storageAccountResourceGroupName value.
     */
    public String storageAccountResourceGroupName() {
        return this.storageAccountResourceGroupName;
    }

    /**
     * Set the storageAccountResourceGroupName property: The table storage account resource group name.
     *
     * @param storageAccountResourceGroupName the storageAccountResourceGroupName value to set.
     * @return the DatabaseTableAuditingPolicyInner object itself.
     */
    public DatabaseTableAuditingPolicyInner withStorageAccountResourceGroupName(
        String storageAccountResourceGroupName) {
        this.storageAccountResourceGroupName = storageAccountResourceGroupName;
        return this;
    }

    /**
     * Get the storageAccountSecondaryKey property: The secondary key of the auditing storage account.
     *
     * @return the storageAccountSecondaryKey value.
     */
    public String storageAccountSecondaryKey() {
        return this.storageAccountSecondaryKey;
    }

    /**
     * Set the storageAccountSecondaryKey property: The secondary key of the auditing storage account.
     *
     * @param storageAccountSecondaryKey the storageAccountSecondaryKey value to set.
     * @return the DatabaseTableAuditingPolicyInner object itself.
     */
    public DatabaseTableAuditingPolicyInner withStorageAccountSecondaryKey(String storageAccountSecondaryKey) {
        this.storageAccountSecondaryKey = storageAccountSecondaryKey;
        return this;
    }

    /**
     * Get the storageAccountSubscriptionId property: The table storage subscription Id.
     *
     * @return the storageAccountSubscriptionId value.
     */
    public UUID storageAccountSubscriptionId() {
        return this.storageAccountSubscriptionId;
    }

    /**
     * Set the storageAccountSubscriptionId property: The table storage subscription Id.
     *
     * @param storageAccountSubscriptionId the storageAccountSubscriptionId value to set.
     * @return the DatabaseTableAuditingPolicyInner object itself.
     */
    public DatabaseTableAuditingPolicyInner withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId) {
        this.storageAccountSubscriptionId = storageAccountSubscriptionId;
        return this;
    }

    /**
     * Get the storageTableEndpoint property: The storage table endpoint.
     *
     * @return the storageTableEndpoint value.
     */
    public String storageTableEndpoint() {
        return this.storageTableEndpoint;
    }

    /**
     * Set the storageTableEndpoint property: The storage table endpoint.
     *
     * @param storageTableEndpoint the storageTableEndpoint value to set.
     * @return the DatabaseTableAuditingPolicyInner object itself.
     */
    public DatabaseTableAuditingPolicyInner withStorageTableEndpoint(String storageTableEndpoint) {
        this.storageTableEndpoint = storageTableEndpoint;
        return this;
    }

    /**
     * Get the useServerDefault property: Whether server default is enabled or disabled.
     *
     * @return the useServerDefault value.
     */
    public String useServerDefault() {
        return this.useServerDefault;
    }

    /**
     * Set the useServerDefault property: Whether server default is enabled or disabled.
     *
     * @param useServerDefault the useServerDefault value to set.
     * @return the DatabaseTableAuditingPolicyInner object itself.
     */
    public DatabaseTableAuditingPolicyInner withUseServerDefault(String useServerDefault) {
        this.useServerDefault = useServerDefault;
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
