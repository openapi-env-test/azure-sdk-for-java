// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.adp.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.adp.fluent.models.DataPoolInner;
import com.azure.resourcemanager.adp.models.DataPool;
import com.azure.resourcemanager.adp.models.DataPoolLocation;
import com.azure.resourcemanager.adp.models.DataPoolPatch;
import com.azure.resourcemanager.adp.models.ProvisioningState;
import com.azure.resourcemanager.adp.models.SystemData;
import java.util.Collections;
import java.util.List;

public final class DataPoolImpl implements DataPool, DataPool.Definition, DataPool.Update {
    private DataPoolInner innerObject;

    private final com.azure.resourcemanager.adp.AdpManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String dataPoolId() {
        return this.innerModel().dataPoolId();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<DataPoolLocation> locations() {
        List<DataPoolLocation> inner = this.innerModel().locations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public DataPoolInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.adp.AdpManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String dataPoolName;

    private DataPoolPatch updateParameters;

    public DataPoolImpl withExistingAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public DataPool create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataPools()
                .createOrUpdate(resourceGroupName, accountName, dataPoolName, this.innerModel(), Context.NONE);
        return this;
    }

    public DataPool create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataPools()
                .createOrUpdate(resourceGroupName, accountName, dataPoolName, this.innerModel(), context);
        return this;
    }

    DataPoolImpl(String name, com.azure.resourcemanager.adp.AdpManager serviceManager) {
        this.innerObject = new DataPoolInner();
        this.serviceManager = serviceManager;
        this.dataPoolName = name;
    }

    public DataPoolImpl update() {
        this.updateParameters = new DataPoolPatch();
        return this;
    }

    public DataPool apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataPools()
                .update(resourceGroupName, accountName, dataPoolName, updateParameters, Context.NONE);
        return this;
    }

    public DataPool apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataPools()
                .update(resourceGroupName, accountName, dataPoolName, updateParameters, context);
        return this;
    }

    DataPoolImpl(DataPoolInner innerObject, com.azure.resourcemanager.adp.AdpManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "accounts");
        this.dataPoolName = Utils.getValueFromIdByName(innerObject.id(), "dataPools");
    }

    public DataPool refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataPools()
                .getWithResponse(resourceGroupName, accountName, dataPoolName, Context.NONE)
                .getValue();
        return this;
    }

    public DataPool refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataPools()
                .getWithResponse(resourceGroupName, accountName, dataPoolName, context)
                .getValue();
        return this;
    }

    public DataPoolImpl withLocations(List<DataPoolLocation> locations) {
        if (isInCreateMode()) {
            this.innerModel().withLocations(locations);
            return this;
        } else {
            this.updateParameters.withLocations(locations);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
