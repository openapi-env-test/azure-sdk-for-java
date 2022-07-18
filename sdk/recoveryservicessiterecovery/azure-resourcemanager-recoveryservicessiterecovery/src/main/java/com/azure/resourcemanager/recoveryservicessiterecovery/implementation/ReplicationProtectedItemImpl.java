// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ReplicationProtectedItemInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.AddDisksInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ApplyRecoveryPointInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.DisableProtectionInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.EnableProtectionInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.EnableProtectionInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.PlannedFailoverInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RemoveDisksInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationProtectedItem;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationProtectedItemProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ResolveHealthInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReverseReplicationInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SwitchProviderInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TestFailoverCleanupInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TestFailoverInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UnplannedFailoverInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UpdateApplianceForReplicationProtectedItemInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UpdateReplicationProtectedItemInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UpdateReplicationProtectedItemInputProperties;

public final class ReplicationProtectedItemImpl
    implements ReplicationProtectedItem, ReplicationProtectedItem.Definition, ReplicationProtectedItem.Update {
    private ReplicationProtectedItemInner innerObject;

    private final com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public ReplicationProtectedItemProperties properties() {
        return this.innerModel().properties();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ReplicationProtectedItemInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager() {
        return this.serviceManager;
    }

    private String resourceName;

    private String resourceGroupName;

    private String fabricName;

    private String protectionContainerName;

    private String replicatedProtectedItemName;

    private EnableProtectionInput createInput;

    private UpdateReplicationProtectedItemInput updateUpdateProtectionInput;

    public ReplicationProtectedItemImpl withExistingReplicationProtectionContainer(
        String resourceName, String resourceGroupName, String fabricName, String protectionContainerName) {
        this.resourceName = resourceName;
        this.resourceGroupName = resourceGroupName;
        this.fabricName = fabricName;
        this.protectionContainerName = protectionContainerName;
        return this;
    }

    public ReplicationProtectedItem create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationProtectedItems()
                .create(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    createInput,
                    Context.NONE);
        return this;
    }

    public ReplicationProtectedItem create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationProtectedItems()
                .create(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    createInput,
                    context);
        return this;
    }

    ReplicationProtectedItemImpl(
        String name, com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerObject = new ReplicationProtectedItemInner();
        this.serviceManager = serviceManager;
        this.replicatedProtectedItemName = name;
        this.createInput = new EnableProtectionInput();
    }

    public ReplicationProtectedItemImpl update() {
        this.updateUpdateProtectionInput = new UpdateReplicationProtectedItemInput();
        return this;
    }

    public ReplicationProtectedItem apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationProtectedItems()
                .update(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    updateUpdateProtectionInput,
                    Context.NONE);
        return this;
    }

    public ReplicationProtectedItem apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationProtectedItems()
                .update(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    updateUpdateProtectionInput,
                    context);
        return this;
    }

    ReplicationProtectedItemImpl(
        ReplicationProtectedItemInner innerObject,
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceName = Utils.getValueFromIdByName(innerObject.id(), "vaults");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.fabricName = Utils.getValueFromIdByName(innerObject.id(), "replicationFabrics");
        this.protectionContainerName = Utils.getValueFromIdByName(innerObject.id(), "replicationProtectionContainers");
        this.replicatedProtectedItemName = Utils.getValueFromIdByName(innerObject.id(), "replicationProtectedItems");
    }

    public ReplicationProtectedItem refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationProtectedItems()
                .getWithResponse(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    Context.NONE)
                .getValue();
        return this;
    }

    public ReplicationProtectedItem refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationProtectedItems()
                .getWithResponse(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    context)
                .getValue();
        return this;
    }

    public ReplicationProtectedItem addDisks(AddDisksInput addDisksInput) {
        return serviceManager
            .replicationProtectedItems()
            .addDisks(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                addDisksInput);
    }

    public ReplicationProtectedItem addDisks(AddDisksInput addDisksInput, Context context) {
        return serviceManager
            .replicationProtectedItems()
            .addDisks(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                addDisksInput,
                context);
    }

    public ReplicationProtectedItem applyRecoveryPoint(ApplyRecoveryPointInput applyRecoveryPointInput) {
        return serviceManager
            .replicationProtectedItems()
            .applyRecoveryPoint(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                applyRecoveryPointInput);
    }

    public ReplicationProtectedItem applyRecoveryPoint(
        ApplyRecoveryPointInput applyRecoveryPointInput, Context context) {
        return serviceManager
            .replicationProtectedItems()
            .applyRecoveryPoint(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                applyRecoveryPointInput,
                context);
    }

    public ReplicationProtectedItem failoverCancel() {
        return serviceManager
            .replicationProtectedItems()
            .failoverCancel(
                resourceName, resourceGroupName, fabricName, protectionContainerName, replicatedProtectedItemName);
    }

    public ReplicationProtectedItem failoverCancel(Context context) {
        return serviceManager
            .replicationProtectedItems()
            .failoverCancel(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                context);
    }

    public ReplicationProtectedItem failoverCommit() {
        return serviceManager
            .replicationProtectedItems()
            .failoverCommit(
                resourceName, resourceGroupName, fabricName, protectionContainerName, replicatedProtectedItemName);
    }

    public ReplicationProtectedItem failoverCommit(Context context) {
        return serviceManager
            .replicationProtectedItems()
            .failoverCommit(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                context);
    }

    public ReplicationProtectedItem plannedFailover(PlannedFailoverInput failoverInput) {
        return serviceManager
            .replicationProtectedItems()
            .plannedFailover(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                failoverInput);
    }

    public ReplicationProtectedItem plannedFailover(PlannedFailoverInput failoverInput, Context context) {
        return serviceManager
            .replicationProtectedItems()
            .plannedFailover(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                failoverInput,
                context);
    }

    public void delete(DisableProtectionInput disableProtectionInput) {
        serviceManager
            .replicationProtectedItems()
            .delete(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                disableProtectionInput);
    }

    public void delete(DisableProtectionInput disableProtectionInput, Context context) {
        serviceManager
            .replicationProtectedItems()
            .delete(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                disableProtectionInput,
                context);
    }

    public ReplicationProtectedItem removeDisks(RemoveDisksInput removeDisksInput) {
        return serviceManager
            .replicationProtectedItems()
            .removeDisks(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                removeDisksInput);
    }

    public ReplicationProtectedItem removeDisks(RemoveDisksInput removeDisksInput, Context context) {
        return serviceManager
            .replicationProtectedItems()
            .removeDisks(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                removeDisksInput,
                context);
    }

    public ReplicationProtectedItem repairReplication() {
        return serviceManager
            .replicationProtectedItems()
            .repairReplication(
                resourceName, resourceGroupName, fabricName, protectionContainerName, replicatedProtectedItemName);
    }

    public ReplicationProtectedItem repairReplication(Context context) {
        return serviceManager
            .replicationProtectedItems()
            .repairReplication(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                context);
    }

    public ReplicationProtectedItem reprotect(ReverseReplicationInput reprotectInput) {
        return serviceManager
            .replicationProtectedItems()
            .reprotect(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                reprotectInput);
    }

    public ReplicationProtectedItem reprotect(ReverseReplicationInput reprotectInput, Context context) {
        return serviceManager
            .replicationProtectedItems()
            .reprotect(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                reprotectInput,
                context);
    }

    public ReplicationProtectedItem resolveHealthErrors(ResolveHealthInput resolveHealthInput) {
        return serviceManager
            .replicationProtectedItems()
            .resolveHealthErrors(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                resolveHealthInput);
    }

    public ReplicationProtectedItem resolveHealthErrors(ResolveHealthInput resolveHealthInput, Context context) {
        return serviceManager
            .replicationProtectedItems()
            .resolveHealthErrors(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                resolveHealthInput,
                context);
    }

    public ReplicationProtectedItem switchProvider(SwitchProviderInput switchProviderInput) {
        return serviceManager
            .replicationProtectedItems()
            .switchProvider(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                switchProviderInput);
    }

    public ReplicationProtectedItem switchProvider(SwitchProviderInput switchProviderInput, Context context) {
        return serviceManager
            .replicationProtectedItems()
            .switchProvider(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                switchProviderInput,
                context);
    }

    public ReplicationProtectedItem testFailover(TestFailoverInput testfailoverInput) {
        return serviceManager
            .replicationProtectedItems()
            .testFailover(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                testfailoverInput);
    }

    public ReplicationProtectedItem testFailover(TestFailoverInput testfailoverInput, Context context) {
        return serviceManager
            .replicationProtectedItems()
            .testFailover(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                testfailoverInput,
                context);
    }

    public ReplicationProtectedItem testFailoverCleanup(TestFailoverCleanupInput cleanupInput) {
        return serviceManager
            .replicationProtectedItems()
            .testFailoverCleanup(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                cleanupInput);
    }

    public ReplicationProtectedItem testFailoverCleanup(TestFailoverCleanupInput cleanupInput, Context context) {
        return serviceManager
            .replicationProtectedItems()
            .testFailoverCleanup(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                cleanupInput,
                context);
    }

    public ReplicationProtectedItem unplannedFailover(UnplannedFailoverInput failoverInput) {
        return serviceManager
            .replicationProtectedItems()
            .unplannedFailover(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                failoverInput);
    }

    public ReplicationProtectedItem unplannedFailover(UnplannedFailoverInput failoverInput, Context context) {
        return serviceManager
            .replicationProtectedItems()
            .unplannedFailover(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                failoverInput,
                context);
    }

    public ReplicationProtectedItem updateAppliance(
        UpdateApplianceForReplicationProtectedItemInput applianceUpdateInput) {
        return serviceManager
            .replicationProtectedItems()
            .updateAppliance(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                applianceUpdateInput);
    }

    public ReplicationProtectedItem updateAppliance(
        UpdateApplianceForReplicationProtectedItemInput applianceUpdateInput, Context context) {
        return serviceManager
            .replicationProtectedItems()
            .updateAppliance(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                applianceUpdateInput,
                context);
    }

    public ReplicationProtectedItemImpl withProperties(EnableProtectionInputProperties properties) {
        this.createInput.withProperties(properties);
        return this;
    }

    public ReplicationProtectedItemImpl withProperties(UpdateReplicationProtectedItemInputProperties properties) {
        this.updateUpdateProtectionInput.withProperties(properties);
        return this;
    }
}
