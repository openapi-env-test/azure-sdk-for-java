// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Active Directory Application. */
@Fluent
public final class AzureActiveDirectoryApp {
    /*
     * Application ID of the Azure Active Directory Application
     */
    @JsonProperty(value = "applicationId")
    private String applicationId;

    /*
     * Key used to authenticate to the Azure Active Directory Application
     */
    @JsonProperty(value = "appKey")
    private String appKey;

    /*
     * Tenant id of the customer
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * Ignore checking azure permissions on the AAD app
     */
    @JsonProperty(value = "ignoreAzurePermissions")
    private Boolean ignoreAzurePermissions;

    /**
     * Get the applicationId property: Application ID of the Azure Active Directory Application.
     *
     * @return the applicationId value.
     */
    public String applicationId() {
        return this.applicationId;
    }

    /**
     * Set the applicationId property: Application ID of the Azure Active Directory Application.
     *
     * @param applicationId the applicationId value to set.
     * @return the AzureActiveDirectoryApp object itself.
     */
    public AzureActiveDirectoryApp withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get the appKey property: Key used to authenticate to the Azure Active Directory Application.
     *
     * @return the appKey value.
     */
    public String appKey() {
        return this.appKey;
    }

    /**
     * Set the appKey property: Key used to authenticate to the Azure Active Directory Application.
     *
     * @param appKey the appKey value to set.
     * @return the AzureActiveDirectoryApp object itself.
     */
    public AzureActiveDirectoryApp withAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    /**
     * Get the tenantId property: Tenant id of the customer.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: Tenant id of the customer.
     *
     * @param tenantId the tenantId value to set.
     * @return the AzureActiveDirectoryApp object itself.
     */
    public AzureActiveDirectoryApp withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the ignoreAzurePermissions property: Ignore checking azure permissions on the AAD app.
     *
     * @return the ignoreAzurePermissions value.
     */
    public Boolean ignoreAzurePermissions() {
        return this.ignoreAzurePermissions;
    }

    /**
     * Set the ignoreAzurePermissions property: Ignore checking azure permissions on the AAD app.
     *
     * @param ignoreAzurePermissions the ignoreAzurePermissions value to set.
     * @return the AzureActiveDirectoryApp object itself.
     */
    public AzureActiveDirectoryApp withIgnoreAzurePermissions(Boolean ignoreAzurePermissions) {
        this.ignoreAzurePermissions = ignoreAzurePermissions;
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
