// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedInstanceAdvancedThreatProtectionInner;
import com.azure.resourcemanager.sql.generated.models.AdvancedThreatProtectionName;
import com.azure.resourcemanager.sql.generated.models.AdvancedThreatProtectionState;
import com.azure.resourcemanager.sql.generated.models.ManagedInstanceAdvancedThreatProtection;
import java.time.OffsetDateTime;

public final class ManagedInstanceAdvancedThreatProtectionImpl
    implements ManagedInstanceAdvancedThreatProtection,
        ManagedInstanceAdvancedThreatProtection.Definition,
        ManagedInstanceAdvancedThreatProtection.Update {
    private ManagedInstanceAdvancedThreatProtectionInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public AdvancedThreatProtectionState state() {
        return this.innerModel().state();
    }

    public OffsetDateTime creationTime() {
        return this.innerModel().creationTime();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ManagedInstanceAdvancedThreatProtectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String managedInstanceName;

    private AdvancedThreatProtectionName advancedThreatProtectionName;

    public ManagedInstanceAdvancedThreatProtectionImpl withExistingManagedInstance(
        String resourceGroupName, String managedInstanceName) {
        this.resourceGroupName = resourceGroupName;
        this.managedInstanceName = managedInstanceName;
        return this;
    }

    public ManagedInstanceAdvancedThreatProtection create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedInstanceAdvancedThreatProtectionSettings()
                .createOrUpdate(
                    resourceGroupName,
                    managedInstanceName,
                    advancedThreatProtectionName,
                    this.innerModel(),
                    Context.NONE);
        return this;
    }

    public ManagedInstanceAdvancedThreatProtection create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedInstanceAdvancedThreatProtectionSettings()
                .createOrUpdate(
                    resourceGroupName, managedInstanceName, advancedThreatProtectionName, this.innerModel(), context);
        return this;
    }

    ManagedInstanceAdvancedThreatProtectionImpl(
        AdvancedThreatProtectionName name, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = new ManagedInstanceAdvancedThreatProtectionInner();
        this.serviceManager = serviceManager;
        this.advancedThreatProtectionName = name;
    }

    public ManagedInstanceAdvancedThreatProtectionImpl update() {
        return this;
    }

    public ManagedInstanceAdvancedThreatProtection apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedInstanceAdvancedThreatProtectionSettings()
                .createOrUpdate(
                    resourceGroupName,
                    managedInstanceName,
                    advancedThreatProtectionName,
                    this.innerModel(),
                    Context.NONE);
        return this;
    }

    public ManagedInstanceAdvancedThreatProtection apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedInstanceAdvancedThreatProtectionSettings()
                .createOrUpdate(
                    resourceGroupName, managedInstanceName, advancedThreatProtectionName, this.innerModel(), context);
        return this;
    }

    ManagedInstanceAdvancedThreatProtectionImpl(
        ManagedInstanceAdvancedThreatProtectionInner innerObject,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.managedInstanceName = Utils.getValueFromIdByName(innerObject.id(), "managedInstances");
        this.advancedThreatProtectionName =
            AdvancedThreatProtectionName
                .fromString(Utils.getValueFromIdByName(innerObject.id(), "advancedThreatProtectionSettings"));
    }

    public ManagedInstanceAdvancedThreatProtection refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedInstanceAdvancedThreatProtectionSettings()
                .getWithResponse(resourceGroupName, managedInstanceName, advancedThreatProtectionName, Context.NONE)
                .getValue();
        return this;
    }

    public ManagedInstanceAdvancedThreatProtection refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedInstanceAdvancedThreatProtectionSettings()
                .getWithResponse(resourceGroupName, managedInstanceName, advancedThreatProtectionName, context)
                .getValue();
        return this;
    }

    public ManagedInstanceAdvancedThreatProtectionImpl withState(AdvancedThreatProtectionState state) {
        this.innerModel().withState(state);
        return this;
    }
}
