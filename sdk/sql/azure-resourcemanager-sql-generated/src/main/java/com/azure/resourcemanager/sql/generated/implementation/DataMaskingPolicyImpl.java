// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.DataMaskingPolicyInner;
import com.azure.resourcemanager.sql.generated.models.DataMaskingPolicy;
import com.azure.resourcemanager.sql.generated.models.DataMaskingState;

public final class DataMaskingPolicyImpl
    implements DataMaskingPolicy, DataMaskingPolicy.Definition, DataMaskingPolicy.Update {
    private DataMaskingPolicyInner innerObject;

    private final SqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public DataMaskingState dataMaskingState() {
        return this.innerModel().dataMaskingState();
    }

    public String exemptPrincipals() {
        return this.innerModel().exemptPrincipals();
    }

    public String applicationPrincipals() {
        return this.innerModel().applicationPrincipals();
    }

    public String maskingLevel() {
        return this.innerModel().maskingLevel();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public DataMaskingPolicyInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String databaseName;

    public DataMaskingPolicyImpl withExistingDatabase(
        String resourceGroupName, String serverName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        this.databaseName = databaseName;
        return this;
    }

    public DataMaskingPolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataMaskingPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, databaseName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public DataMaskingPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataMaskingPolicies()
                .createOrUpdateWithResponse(resourceGroupName, serverName, databaseName, this.innerModel(), context)
                .getValue();
        return this;
    }

    DataMaskingPolicyImpl(SqlManager serviceManager) {
        this.innerObject = new DataMaskingPolicyInner();
        this.serviceManager = serviceManager;
    }

    public DataMaskingPolicyImpl update() {
        return this;
    }

    public DataMaskingPolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataMaskingPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, databaseName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public DataMaskingPolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataMaskingPolicies()
                .createOrUpdateWithResponse(resourceGroupName, serverName, databaseName, this.innerModel(), context)
                .getValue();
        return this;
    }

    DataMaskingPolicyImpl(DataMaskingPolicyInner innerObject, SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.databaseName = Utils.getValueFromIdByName(innerObject.id(), "databases");
    }

    public DataMaskingPolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataMaskingPolicies()
                .getWithResponse(resourceGroupName, serverName, databaseName, Context.NONE)
                .getValue();
        return this;
    }

    public DataMaskingPolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataMaskingPolicies()
                .getWithResponse(resourceGroupName, serverName, databaseName, context)
                .getValue();
        return this;
    }

    public DataMaskingPolicyImpl withDataMaskingState(DataMaskingState dataMaskingState) {
        this.innerModel().withDataMaskingState(dataMaskingState);
        return this;
    }

    public DataMaskingPolicyImpl withExemptPrincipals(String exemptPrincipals) {
        this.innerModel().withExemptPrincipals(exemptPrincipals);
        return this;
    }
}
