// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azuredata.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azuredata.AzureDataManager;
import com.azure.resourcemanager.azuredata.fluent.models.SqlManagedInstanceInner;
import com.azure.resourcemanager.azuredata.models.SqlManagedInstance;
import com.azure.resourcemanager.azuredata.models.SqlManagedInstanceUpdate;
import com.azure.resourcemanager.azuredata.models.SystemData;
import java.util.Collections;
import java.util.Map;

public final class SqlManagedInstanceImpl
    implements SqlManagedInstance, SqlManagedInstance.Definition, SqlManagedInstance.Update {
    private SqlManagedInstanceInner innerObject;

    private final AzureDataManager serviceManager;

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

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String dataControllerId() {
        return this.innerModel().dataControllerId();
    }

    public String instanceEndpoint() {
        return this.innerModel().instanceEndpoint();
    }

    public String admin() {
        return this.innerModel().admin();
    }

    public String startTime() {
        return this.innerModel().startTime();
    }

    public String endTime() {
        return this.innerModel().endTime();
    }

    public String vCore() {
        return this.innerModel().vCore();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public SqlManagedInstanceInner innerModel() {
        return this.innerObject;
    }

    private AzureDataManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String sqlManagedInstanceName;

    private SqlManagedInstanceUpdate updateParameters;

    public SqlManagedInstanceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public SqlManagedInstance create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlManagedInstances()
                .createWithResponse(resourceGroupName, sqlManagedInstanceName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public SqlManagedInstance create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlManagedInstances()
                .createWithResponse(resourceGroupName, sqlManagedInstanceName, this.innerModel(), context)
                .getValue();
        return this;
    }

    SqlManagedInstanceImpl(String name, AzureDataManager serviceManager) {
        this.innerObject = new SqlManagedInstanceInner();
        this.serviceManager = serviceManager;
        this.sqlManagedInstanceName = name;
    }

    public SqlManagedInstanceImpl update() {
        this.updateParameters = new SqlManagedInstanceUpdate();
        return this;
    }

    public SqlManagedInstance apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlManagedInstances()
                .updateWithResponse(resourceGroupName, sqlManagedInstanceName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public SqlManagedInstance apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlManagedInstances()
                .updateWithResponse(resourceGroupName, sqlManagedInstanceName, updateParameters, context)
                .getValue();
        return this;
    }

    SqlManagedInstanceImpl(SqlManagedInstanceInner innerObject, AzureDataManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.sqlManagedInstanceName = Utils.getValueFromIdByName(innerObject.id(), "sqlManagedInstances");
    }

    public SqlManagedInstance refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlManagedInstances()
                .getByResourceGroupWithResponse(resourceGroupName, sqlManagedInstanceName, Context.NONE)
                .getValue();
        return this;
    }

    public SqlManagedInstance refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlManagedInstances()
                .getByResourceGroupWithResponse(resourceGroupName, sqlManagedInstanceName, context)
                .getValue();
        return this;
    }

    public SqlManagedInstanceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public SqlManagedInstanceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public SqlManagedInstanceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public SqlManagedInstanceImpl withDataControllerId(String dataControllerId) {
        this.innerModel().withDataControllerId(dataControllerId);
        return this;
    }

    public SqlManagedInstanceImpl withInstanceEndpoint(String instanceEndpoint) {
        this.innerModel().withInstanceEndpoint(instanceEndpoint);
        return this;
    }

    public SqlManagedInstanceImpl withAdmin(String admin) {
        this.innerModel().withAdmin(admin);
        return this;
    }

    public SqlManagedInstanceImpl withStartTime(String startTime) {
        this.innerModel().withStartTime(startTime);
        return this;
    }

    public SqlManagedInstanceImpl withEndTime(String endTime) {
        this.innerModel().withEndTime(endTime);
        return this;
    }

    public SqlManagedInstanceImpl withVCore(String vCore) {
        this.innerModel().withVCore(vCore);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
