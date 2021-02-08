// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.models.SecurityAlertPolicyState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** A managed database security alert policy. */
@JsonFlatten
@Fluent
public class ManagedDatabaseSecurityAlertPolicyInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedDatabaseSecurityAlertPolicyInner.class);

    /*
     * Specifies the state of the policy, whether it is enabled or disabled or
     * a policy has not been applied yet on the specific database.
     */
    @JsonProperty(value = "properties.state")
    private SecurityAlertPolicyState state;

    /*
     * Specifies an array of alerts that are disabled. Allowed values are:
     * Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly,
     * Data_Exfiltration, Unsafe_Action, Brute_Force
     */
    @JsonProperty(value = "properties.disabledAlerts")
    private List<String> disabledAlerts;

    /*
     * Specifies an array of e-mail addresses to which the alert is sent.
     */
    @JsonProperty(value = "properties.emailAddresses")
    private List<String> emailAddresses;

    /*
     * Specifies that the alert is sent to the account administrators.
     */
    @JsonProperty(value = "properties.emailAccountAdmins")
    private Boolean emailAccountAdmins;

    /*
     * Specifies the blob storage endpoint (e.g.
     * https://MyAccount.blob.core.windows.net). This blob storage will hold
     * all Threat Detection audit logs.
     */
    @JsonProperty(value = "properties.storageEndpoint")
    private String storageEndpoint;

    /*
     * Specifies the identifier key of the Threat Detection audit storage
     * account.
     */
    @JsonProperty(value = "properties.storageAccountAccessKey")
    private String storageAccountAccessKey;

    /*
     * Specifies the number of days to keep in the Threat Detection audit logs.
     */
    @JsonProperty(value = "properties.retentionDays")
    private Integer retentionDays;

    /*
     * Specifies the UTC creation time of the policy.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /**
     * Get the state property: Specifies the state of the policy, whether it is enabled or disabled or a policy has not
     * been applied yet on the specific database.
     *
     * @return the state value.
     */
    public SecurityAlertPolicyState state() {
        return this.state;
    }

    /**
     * Set the state property: Specifies the state of the policy, whether it is enabled or disabled or a policy has not
     * been applied yet on the specific database.
     *
     * @param state the state value to set.
     * @return the ManagedDatabaseSecurityAlertPolicyInner object itself.
     */
    public ManagedDatabaseSecurityAlertPolicyInner withState(SecurityAlertPolicyState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the disabledAlerts property: Specifies an array of alerts that are disabled. Allowed values are:
     * Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly, Data_Exfiltration, Unsafe_Action, Brute_Force.
     *
     * @return the disabledAlerts value.
     */
    public List<String> disabledAlerts() {
        return this.disabledAlerts;
    }

    /**
     * Set the disabledAlerts property: Specifies an array of alerts that are disabled. Allowed values are:
     * Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly, Data_Exfiltration, Unsafe_Action, Brute_Force.
     *
     * @param disabledAlerts the disabledAlerts value to set.
     * @return the ManagedDatabaseSecurityAlertPolicyInner object itself.
     */
    public ManagedDatabaseSecurityAlertPolicyInner withDisabledAlerts(List<String> disabledAlerts) {
        this.disabledAlerts = disabledAlerts;
        return this;
    }

    /**
     * Get the emailAddresses property: Specifies an array of e-mail addresses to which the alert is sent.
     *
     * @return the emailAddresses value.
     */
    public List<String> emailAddresses() {
        return this.emailAddresses;
    }

    /**
     * Set the emailAddresses property: Specifies an array of e-mail addresses to which the alert is sent.
     *
     * @param emailAddresses the emailAddresses value to set.
     * @return the ManagedDatabaseSecurityAlertPolicyInner object itself.
     */
    public ManagedDatabaseSecurityAlertPolicyInner withEmailAddresses(List<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
        return this;
    }

    /**
     * Get the emailAccountAdmins property: Specifies that the alert is sent to the account administrators.
     *
     * @return the emailAccountAdmins value.
     */
    public Boolean emailAccountAdmins() {
        return this.emailAccountAdmins;
    }

    /**
     * Set the emailAccountAdmins property: Specifies that the alert is sent to the account administrators.
     *
     * @param emailAccountAdmins the emailAccountAdmins value to set.
     * @return the ManagedDatabaseSecurityAlertPolicyInner object itself.
     */
    public ManagedDatabaseSecurityAlertPolicyInner withEmailAccountAdmins(Boolean emailAccountAdmins) {
        this.emailAccountAdmins = emailAccountAdmins;
        return this;
    }

    /**
     * Get the storageEndpoint property: Specifies the blob storage endpoint (e.g.
     * https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
     *
     * @return the storageEndpoint value.
     */
    public String storageEndpoint() {
        return this.storageEndpoint;
    }

    /**
     * Set the storageEndpoint property: Specifies the blob storage endpoint (e.g.
     * https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
     *
     * @param storageEndpoint the storageEndpoint value to set.
     * @return the ManagedDatabaseSecurityAlertPolicyInner object itself.
     */
    public ManagedDatabaseSecurityAlertPolicyInner withStorageEndpoint(String storageEndpoint) {
        this.storageEndpoint = storageEndpoint;
        return this;
    }

    /**
     * Get the storageAccountAccessKey property: Specifies the identifier key of the Threat Detection audit storage
     * account.
     *
     * @return the storageAccountAccessKey value.
     */
    public String storageAccountAccessKey() {
        return this.storageAccountAccessKey;
    }

    /**
     * Set the storageAccountAccessKey property: Specifies the identifier key of the Threat Detection audit storage
     * account.
     *
     * @param storageAccountAccessKey the storageAccountAccessKey value to set.
     * @return the ManagedDatabaseSecurityAlertPolicyInner object itself.
     */
    public ManagedDatabaseSecurityAlertPolicyInner withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.storageAccountAccessKey = storageAccountAccessKey;
        return this;
    }

    /**
     * Get the retentionDays property: Specifies the number of days to keep in the Threat Detection audit logs.
     *
     * @return the retentionDays value.
     */
    public Integer retentionDays() {
        return this.retentionDays;
    }

    /**
     * Set the retentionDays property: Specifies the number of days to keep in the Threat Detection audit logs.
     *
     * @param retentionDays the retentionDays value to set.
     * @return the ManagedDatabaseSecurityAlertPolicyInner object itself.
     */
    public ManagedDatabaseSecurityAlertPolicyInner withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /**
     * Get the creationTime property: Specifies the UTC creation time of the policy.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
