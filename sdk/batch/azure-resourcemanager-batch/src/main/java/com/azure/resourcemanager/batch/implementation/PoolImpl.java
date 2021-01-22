// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.batch.BatchManager;
import com.azure.resourcemanager.batch.fluent.models.PoolInner;
import com.azure.resourcemanager.batch.models.AllocationState;
import com.azure.resourcemanager.batch.models.ApplicationPackageReference;
import com.azure.resourcemanager.batch.models.AutoScaleRun;
import com.azure.resourcemanager.batch.models.BatchPoolIdentity;
import com.azure.resourcemanager.batch.models.CertificateReference;
import com.azure.resourcemanager.batch.models.DeploymentConfiguration;
import com.azure.resourcemanager.batch.models.InterNodeCommunicationState;
import com.azure.resourcemanager.batch.models.MetadataItem;
import com.azure.resourcemanager.batch.models.MountConfiguration;
import com.azure.resourcemanager.batch.models.NetworkConfiguration;
import com.azure.resourcemanager.batch.models.Pool;
import com.azure.resourcemanager.batch.models.PoolProvisioningState;
import com.azure.resourcemanager.batch.models.ResizeOperationStatus;
import com.azure.resourcemanager.batch.models.ScaleSettings;
import com.azure.resourcemanager.batch.models.StartTask;
import com.azure.resourcemanager.batch.models.TaskSchedulingPolicy;
import com.azure.resourcemanager.batch.models.UserAccount;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class PoolImpl implements Pool, Pool.Definition, Pool.Update {
    private PoolInner innerObject;

    private final BatchManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public BatchPoolIdentity identity() {
        return this.innerModel().identity();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public OffsetDateTime lastModified() {
        return this.innerModel().lastModified();
    }

    public OffsetDateTime creationTime() {
        return this.innerModel().creationTime();
    }

    public PoolProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public OffsetDateTime provisioningStateTransitionTime() {
        return this.innerModel().provisioningStateTransitionTime();
    }

    public AllocationState allocationState() {
        return this.innerModel().allocationState();
    }

    public OffsetDateTime allocationStateTransitionTime() {
        return this.innerModel().allocationStateTransitionTime();
    }

    public String vmSize() {
        return this.innerModel().vmSize();
    }

    public DeploymentConfiguration deploymentConfiguration() {
        return this.innerModel().deploymentConfiguration();
    }

    public Integer currentDedicatedNodes() {
        return this.innerModel().currentDedicatedNodes();
    }

    public Integer currentLowPriorityNodes() {
        return this.innerModel().currentLowPriorityNodes();
    }

    public ScaleSettings scaleSettings() {
        return this.innerModel().scaleSettings();
    }

    public AutoScaleRun autoScaleRun() {
        return this.innerModel().autoScaleRun();
    }

    public InterNodeCommunicationState interNodeCommunication() {
        return this.innerModel().interNodeCommunication();
    }

    public NetworkConfiguration networkConfiguration() {
        return this.innerModel().networkConfiguration();
    }

    public Integer taskSlotsPerNode() {
        return this.innerModel().taskSlotsPerNode();
    }

    public TaskSchedulingPolicy taskSchedulingPolicy() {
        return this.innerModel().taskSchedulingPolicy();
    }

    public List<UserAccount> userAccounts() {
        List<UserAccount> inner = this.innerModel().userAccounts();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<MetadataItem> metadata() {
        List<MetadataItem> inner = this.innerModel().metadata();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public StartTask startTask() {
        return this.innerModel().startTask();
    }

    public List<CertificateReference> certificates() {
        List<CertificateReference> inner = this.innerModel().certificates();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ApplicationPackageReference> applicationPackages() {
        List<ApplicationPackageReference> inner = this.innerModel().applicationPackages();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> applicationLicenses() {
        List<String> inner = this.innerModel().applicationLicenses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ResizeOperationStatus resizeOperationStatus() {
        return this.innerModel().resizeOperationStatus();
    }

    public List<MountConfiguration> mountConfiguration() {
        List<MountConfiguration> inner = this.innerModel().mountConfiguration();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public PoolInner innerModel() {
        return this.innerObject;
    }

    private BatchManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String poolName;

    private String createIfMatch;

    private String createIfNoneMatch;

    private String updateIfMatch;

    public PoolImpl withExistingBatchAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public Pool create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPools()
                .createWithResponse(
                    resourceGroupName,
                    accountName,
                    poolName,
                    this.innerModel(),
                    createIfMatch,
                    createIfNoneMatch,
                    Context.NONE)
                .getValue();
        return this;
    }

    public Pool create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPools()
                .createWithResponse(
                    resourceGroupName,
                    accountName,
                    poolName,
                    this.innerModel(),
                    createIfMatch,
                    createIfNoneMatch,
                    context)
                .getValue();
        return this;
    }

    PoolImpl(String name, BatchManager serviceManager) {
        this.innerObject = new PoolInner();
        this.serviceManager = serviceManager;
        this.poolName = name;
        this.createIfMatch = null;
        this.createIfNoneMatch = null;
    }

    public PoolImpl update() {
        this.updateIfMatch = null;
        return this;
    }

    public Pool apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPools()
                .updateWithResponse(
                    resourceGroupName, accountName, poolName, this.innerModel(), updateIfMatch, Context.NONE)
                .getValue();
        return this;
    }

    public Pool apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPools()
                .updateWithResponse(resourceGroupName, accountName, poolName, this.innerModel(), updateIfMatch, context)
                .getValue();
        return this;
    }

    PoolImpl(PoolInner innerObject, BatchManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "batchAccounts");
        this.poolName = Utils.getValueFromIdByName(innerObject.id(), "pools");
    }

    public Pool refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPools()
                .getWithResponse(resourceGroupName, accountName, poolName, Context.NONE)
                .getValue();
        return this;
    }

    public Pool refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPools()
                .getWithResponse(resourceGroupName, accountName, poolName, context)
                .getValue();
        return this;
    }

    public Pool disableAutoScale() {
        return serviceManager.pools().disableAutoScale(resourceGroupName, accountName, poolName);
    }

    public Response<Pool> disableAutoScaleWithResponse(Context context) {
        return serviceManager.pools().disableAutoScaleWithResponse(resourceGroupName, accountName, poolName, context);
    }

    public Pool stopResize() {
        return serviceManager.pools().stopResize(resourceGroupName, accountName, poolName);
    }

    public Response<Pool> stopResizeWithResponse(Context context) {
        return serviceManager.pools().stopResizeWithResponse(resourceGroupName, accountName, poolName, context);
    }

    public PoolImpl withIdentity(BatchPoolIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public PoolImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public PoolImpl withVmSize(String vmSize) {
        this.innerModel().withVmSize(vmSize);
        return this;
    }

    public PoolImpl withDeploymentConfiguration(DeploymentConfiguration deploymentConfiguration) {
        this.innerModel().withDeploymentConfiguration(deploymentConfiguration);
        return this;
    }

    public PoolImpl withScaleSettings(ScaleSettings scaleSettings) {
        this.innerModel().withScaleSettings(scaleSettings);
        return this;
    }

    public PoolImpl withInterNodeCommunication(InterNodeCommunicationState interNodeCommunication) {
        this.innerModel().withInterNodeCommunication(interNodeCommunication);
        return this;
    }

    public PoolImpl withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.innerModel().withNetworkConfiguration(networkConfiguration);
        return this;
    }

    public PoolImpl withTaskSlotsPerNode(Integer taskSlotsPerNode) {
        this.innerModel().withTaskSlotsPerNode(taskSlotsPerNode);
        return this;
    }

    public PoolImpl withTaskSchedulingPolicy(TaskSchedulingPolicy taskSchedulingPolicy) {
        this.innerModel().withTaskSchedulingPolicy(taskSchedulingPolicy);
        return this;
    }

    public PoolImpl withUserAccounts(List<UserAccount> userAccounts) {
        this.innerModel().withUserAccounts(userAccounts);
        return this;
    }

    public PoolImpl withMetadata(List<MetadataItem> metadata) {
        this.innerModel().withMetadata(metadata);
        return this;
    }

    public PoolImpl withStartTask(StartTask startTask) {
        this.innerModel().withStartTask(startTask);
        return this;
    }

    public PoolImpl withCertificates(List<CertificateReference> certificates) {
        this.innerModel().withCertificates(certificates);
        return this;
    }

    public PoolImpl withApplicationPackages(List<ApplicationPackageReference> applicationPackages) {
        this.innerModel().withApplicationPackages(applicationPackages);
        return this;
    }

    public PoolImpl withApplicationLicenses(List<String> applicationLicenses) {
        this.innerModel().withApplicationLicenses(applicationLicenses);
        return this;
    }

    public PoolImpl withMountConfiguration(List<MountConfiguration> mountConfiguration) {
        this.innerModel().withMountConfiguration(mountConfiguration);
        return this;
    }

    public PoolImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    public PoolImpl withIfNoneMatch(String ifNoneMatch) {
        this.createIfNoneMatch = ifNoneMatch;
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
