// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.fluent.models.LabInner;
import com.azure.resourcemanager.devtestlabs.models.EnvironmentPermission;
import com.azure.resourcemanager.devtestlabs.models.ExportResourceUsageParameters;
import com.azure.resourcemanager.devtestlabs.models.GenerateUploadUriParameter;
import com.azure.resourcemanager.devtestlabs.models.GenerateUploadUriResponse;
import com.azure.resourcemanager.devtestlabs.models.ImportLabVirtualMachineRequest;
import com.azure.resourcemanager.devtestlabs.models.Lab;
import com.azure.resourcemanager.devtestlabs.models.LabAnnouncementProperties;
import com.azure.resourcemanager.devtestlabs.models.LabFragment;
import com.azure.resourcemanager.devtestlabs.models.LabSupportProperties;
import com.azure.resourcemanager.devtestlabs.models.LabVhd;
import com.azure.resourcemanager.devtestlabs.models.LabVirtualMachineCreationParameter;
import com.azure.resourcemanager.devtestlabs.models.PremiumDataDisk;
import com.azure.resourcemanager.devtestlabs.models.StorageType;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class LabImpl implements Lab, Lab.Definition, Lab.Update {
    private LabInner innerObject;

    private final com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager;

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

    public String defaultStorageAccount() {
        return this.innerModel().defaultStorageAccount();
    }

    public String defaultPremiumStorageAccount() {
        return this.innerModel().defaultPremiumStorageAccount();
    }

    public String artifactsStorageAccount() {
        return this.innerModel().artifactsStorageAccount();
    }

    public String premiumDataDiskStorageAccount() {
        return this.innerModel().premiumDataDiskStorageAccount();
    }

    public String vaultName() {
        return this.innerModel().vaultName();
    }

    public StorageType labStorageType() {
        return this.innerModel().labStorageType();
    }

    public List<String> mandatoryArtifactsResourceIdsLinux() {
        List<String> inner = this.innerModel().mandatoryArtifactsResourceIdsLinux();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> mandatoryArtifactsResourceIdsWindows() {
        List<String> inner = this.innerModel().mandatoryArtifactsResourceIdsWindows();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OffsetDateTime createdDate() {
        return this.innerModel().createdDate();
    }

    public PremiumDataDisk premiumDataDisks() {
        return this.innerModel().premiumDataDisks();
    }

    public EnvironmentPermission environmentPermission() {
        return this.innerModel().environmentPermission();
    }

    public LabAnnouncementProperties announcement() {
        return this.innerModel().announcement();
    }

    public LabSupportProperties support() {
        return this.innerModel().support();
    }

    public String vmCreationResourceGroup() {
        return this.innerModel().vmCreationResourceGroup();
    }

    public String publicIpId() {
        return this.innerModel().publicIpId();
    }

    public String loadBalancerId() {
        return this.innerModel().loadBalancerId();
    }

    public String networkSecurityGroupId() {
        return this.innerModel().networkSecurityGroupId();
    }

    public Map<String, String> extendedProperties() {
        Map<String, String> inner = this.innerModel().extendedProperties();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String uniqueIdentifier() {
        return this.innerModel().uniqueIdentifier();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public LabInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private LabFragment updateLab;

    public LabImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Lab create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLabs()
                .createOrUpdate(resourceGroupName, name, this.innerModel(), Context.NONE);
        return this;
    }

    public Lab create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLabs()
                .createOrUpdate(resourceGroupName, name, this.innerModel(), context);
        return this;
    }

    LabImpl(String name, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = new LabInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public LabImpl update() {
        this.updateLab = new LabFragment();
        return this;
    }

    public Lab apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLabs()
                .updateWithResponse(resourceGroupName, name, updateLab, Context.NONE)
                .getValue();
        return this;
    }

    public Lab apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLabs()
                .updateWithResponse(resourceGroupName, name, updateLab, context)
                .getValue();
        return this;
    }

    LabImpl(LabInner innerObject, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "labs");
    }

    public Lab refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLabs()
                .getByResourceGroupWithResponse(resourceGroupName, name, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public Lab refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLabs()
                .getByResourceGroupWithResponse(resourceGroupName, name, localExpand, context)
                .getValue();
        return this;
    }

    public void claimAnyVm() {
        serviceManager.labs().claimAnyVm(resourceGroupName, name);
    }

    public void claimAnyVm(Context context) {
        serviceManager.labs().claimAnyVm(resourceGroupName, name, context);
    }

    public void createEnvironment(LabVirtualMachineCreationParameter labVirtualMachineCreationParameter) {
        serviceManager.labs().createEnvironment(resourceGroupName, name, labVirtualMachineCreationParameter);
    }

    public void createEnvironment(
        LabVirtualMachineCreationParameter labVirtualMachineCreationParameter, Context context) {
        serviceManager.labs().createEnvironment(resourceGroupName, name, labVirtualMachineCreationParameter, context);
    }

    public void exportResourceUsage(ExportResourceUsageParameters exportResourceUsageParameters) {
        serviceManager.labs().exportResourceUsage(resourceGroupName, name, exportResourceUsageParameters);
    }

    public void exportResourceUsage(ExportResourceUsageParameters exportResourceUsageParameters, Context context) {
        serviceManager.labs().exportResourceUsage(resourceGroupName, name, exportResourceUsageParameters, context);
    }

    public GenerateUploadUriResponse generateUploadUri(GenerateUploadUriParameter generateUploadUriParameter) {
        return serviceManager.labs().generateUploadUri(resourceGroupName, name, generateUploadUriParameter);
    }

    public Response<GenerateUploadUriResponse> generateUploadUriWithResponse(
        GenerateUploadUriParameter generateUploadUriParameter, Context context) {
        return serviceManager
            .labs()
            .generateUploadUriWithResponse(resourceGroupName, name, generateUploadUriParameter, context);
    }

    public void importVirtualMachine(ImportLabVirtualMachineRequest importLabVirtualMachineRequest) {
        serviceManager.labs().importVirtualMachine(resourceGroupName, name, importLabVirtualMachineRequest);
    }

    public void importVirtualMachine(ImportLabVirtualMachineRequest importLabVirtualMachineRequest, Context context) {
        serviceManager.labs().importVirtualMachine(resourceGroupName, name, importLabVirtualMachineRequest, context);
    }

    public PagedIterable<LabVhd> listVhds() {
        return serviceManager.labs().listVhds(resourceGroupName, name);
    }

    public PagedIterable<LabVhd> listVhds(Context context) {
        return serviceManager.labs().listVhds(resourceGroupName, name, context);
    }

    public LabImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public LabImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public LabImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateLab.withTags(tags);
            return this;
        }
    }

    public LabImpl withLabStorageType(StorageType labStorageType) {
        this.innerModel().withLabStorageType(labStorageType);
        return this;
    }

    public LabImpl withMandatoryArtifactsResourceIdsLinux(List<String> mandatoryArtifactsResourceIdsLinux) {
        this.innerModel().withMandatoryArtifactsResourceIdsLinux(mandatoryArtifactsResourceIdsLinux);
        return this;
    }

    public LabImpl withMandatoryArtifactsResourceIdsWindows(List<String> mandatoryArtifactsResourceIdsWindows) {
        this.innerModel().withMandatoryArtifactsResourceIdsWindows(mandatoryArtifactsResourceIdsWindows);
        return this;
    }

    public LabImpl withPremiumDataDisks(PremiumDataDisk premiumDataDisks) {
        this.innerModel().withPremiumDataDisks(premiumDataDisks);
        return this;
    }

    public LabImpl withEnvironmentPermission(EnvironmentPermission environmentPermission) {
        this.innerModel().withEnvironmentPermission(environmentPermission);
        return this;
    }

    public LabImpl withAnnouncement(LabAnnouncementProperties announcement) {
        this.innerModel().withAnnouncement(announcement);
        return this;
    }

    public LabImpl withSupport(LabSupportProperties support) {
        this.innerModel().withSupport(support);
        return this;
    }

    public LabImpl withExtendedProperties(Map<String, String> extendedProperties) {
        this.innerModel().withExtendedProperties(extendedProperties);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
