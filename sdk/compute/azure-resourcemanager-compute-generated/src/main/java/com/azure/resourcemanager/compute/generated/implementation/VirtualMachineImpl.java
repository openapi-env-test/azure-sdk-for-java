// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineExtensionInner;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineInner;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineInstanceViewInner;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineUpdateInner;
import com.azure.resourcemanager.compute.generated.models.AdditionalCapabilities;
import com.azure.resourcemanager.compute.generated.models.ApplicationProfile;
import com.azure.resourcemanager.compute.generated.models.BillingProfile;
import com.azure.resourcemanager.compute.generated.models.CapacityReservationProfile;
import com.azure.resourcemanager.compute.generated.models.DiagnosticsProfile;
import com.azure.resourcemanager.compute.generated.models.ExtendedLocation;
import com.azure.resourcemanager.compute.generated.models.HardwareProfile;
import com.azure.resourcemanager.compute.generated.models.InstanceViewTypes;
import com.azure.resourcemanager.compute.generated.models.NetworkProfile;
import com.azure.resourcemanager.compute.generated.models.OSProfile;
import com.azure.resourcemanager.compute.generated.models.Plan;
import com.azure.resourcemanager.compute.generated.models.RetrieveBootDiagnosticsDataResult;
import com.azure.resourcemanager.compute.generated.models.RunCommandInput;
import com.azure.resourcemanager.compute.generated.models.RunCommandResult;
import com.azure.resourcemanager.compute.generated.models.ScheduledEventsProfile;
import com.azure.resourcemanager.compute.generated.models.SecurityProfile;
import com.azure.resourcemanager.compute.generated.models.StorageProfile;
import com.azure.resourcemanager.compute.generated.models.VirtualMachine;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineAssessPatchesResult;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineCaptureParameters;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineCaptureResult;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineEvictionPolicyTypes;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineExtension;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineIdentity;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineInstallPatchesParameters;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineInstallPatchesResult;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineInstanceView;
import com.azure.resourcemanager.compute.generated.models.VirtualMachinePriorityTypes;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineReimageParameters;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class VirtualMachineImpl implements VirtualMachine, VirtualMachine.Definition, VirtualMachine.Update {
    private VirtualMachineInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

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

    public Plan plan() {
        return this.innerModel().plan();
    }

    public List<VirtualMachineExtension> resources() {
        List<VirtualMachineExtensionInner> inner = this.innerModel().resources();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new VirtualMachineExtensionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public VirtualMachineIdentity identity() {
        return this.innerModel().identity();
    }

    public List<String> zones() {
        List<String> inner = this.innerModel().zones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ExtendedLocation extendedLocation() {
        return this.innerModel().extendedLocation();
    }

    public HardwareProfile hardwareProfile() {
        return this.innerModel().hardwareProfile();
    }

    public StorageProfile storageProfile() {
        return this.innerModel().storageProfile();
    }

    public AdditionalCapabilities additionalCapabilities() {
        return this.innerModel().additionalCapabilities();
    }

    public OSProfile osProfile() {
        return this.innerModel().osProfile();
    }

    public NetworkProfile networkProfile() {
        return this.innerModel().networkProfile();
    }

    public SecurityProfile securityProfile() {
        return this.innerModel().securityProfile();
    }

    public DiagnosticsProfile diagnosticsProfile() {
        return this.innerModel().diagnosticsProfile();
    }

    public SubResource availabilitySet() {
        return this.innerModel().availabilitySet();
    }

    public SubResource virtualMachineScaleSet() {
        return this.innerModel().virtualMachineScaleSet();
    }

    public SubResource proximityPlacementGroup() {
        return this.innerModel().proximityPlacementGroup();
    }

    public VirtualMachinePriorityTypes priority() {
        return this.innerModel().priority();
    }

    public VirtualMachineEvictionPolicyTypes evictionPolicy() {
        return this.innerModel().evictionPolicy();
    }

    public BillingProfile billingProfile() {
        return this.innerModel().billingProfile();
    }

    public SubResource host() {
        return this.innerModel().host();
    }

    public SubResource hostGroup() {
        return this.innerModel().hostGroup();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public VirtualMachineInstanceView instanceView() {
        VirtualMachineInstanceViewInner inner = this.innerModel().instanceView();
        if (inner != null) {
            return new VirtualMachineInstanceViewImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public String licenseType() {
        return this.innerModel().licenseType();
    }

    public String vmId() {
        return this.innerModel().vmId();
    }

    public String extensionsTimeBudget() {
        return this.innerModel().extensionsTimeBudget();
    }

    public Integer platformFaultDomain() {
        return this.innerModel().platformFaultDomain();
    }

    public ScheduledEventsProfile scheduledEventsProfile() {
        return this.innerModel().scheduledEventsProfile();
    }

    public String userData() {
        return this.innerModel().userData();
    }

    public CapacityReservationProfile capacityReservation() {
        return this.innerModel().capacityReservation();
    }

    public ApplicationProfile applicationProfile() {
        return this.innerModel().applicationProfile();
    }

    public OffsetDateTime timeCreated() {
        return this.innerModel().timeCreated();
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

    public VirtualMachineInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String vmName;

    private VirtualMachineUpdateInner updateParameters;

    public VirtualMachineImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public VirtualMachine create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachines()
                .createOrUpdate(resourceGroupName, vmName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualMachine create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachines()
                .createOrUpdate(resourceGroupName, vmName, this.innerModel(), context);
        return this;
    }

    VirtualMachineImpl(String name, com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = new VirtualMachineInner();
        this.serviceManager = serviceManager;
        this.vmName = name;
    }

    public VirtualMachineImpl update() {
        this.updateParameters = new VirtualMachineUpdateInner();
        return this;
    }

    public VirtualMachine apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachines()
                .update(resourceGroupName, vmName, updateParameters, Context.NONE);
        return this;
    }

    public VirtualMachine apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachines()
                .update(resourceGroupName, vmName, updateParameters, context);
        return this;
    }

    VirtualMachineImpl(
        VirtualMachineInner innerObject, com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.vmName = Utils.getValueFromIdByName(innerObject.id(), "virtualMachines");
    }

    public VirtualMachine refresh() {
        InstanceViewTypes localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachines()
                .getByResourceGroupWithResponse(resourceGroupName, vmName, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualMachine refresh(Context context) {
        InstanceViewTypes localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachines()
                .getByResourceGroupWithResponse(resourceGroupName, vmName, localExpand, context)
                .getValue();
        return this;
    }

    public VirtualMachineCaptureResult capture(VirtualMachineCaptureParameters parameters) {
        return serviceManager.virtualMachines().capture(resourceGroupName, vmName, parameters);
    }

    public VirtualMachineCaptureResult capture(VirtualMachineCaptureParameters parameters, Context context) {
        return serviceManager.virtualMachines().capture(resourceGroupName, vmName, parameters, context);
    }

    public void convertToManagedDisks() {
        serviceManager.virtualMachines().convertToManagedDisks(resourceGroupName, vmName);
    }

    public void convertToManagedDisks(Context context) {
        serviceManager.virtualMachines().convertToManagedDisks(resourceGroupName, vmName, context);
    }

    public void deallocate(Boolean hibernate) {
        serviceManager.virtualMachines().deallocate(resourceGroupName, vmName, hibernate);
    }

    public void deallocate() {
        serviceManager.virtualMachines().deallocate(resourceGroupName, vmName);
    }

    public void deallocate(Boolean hibernate, Context context) {
        serviceManager.virtualMachines().deallocate(resourceGroupName, vmName, hibernate, context);
    }

    public void generalize() {
        serviceManager.virtualMachines().generalize(resourceGroupName, vmName);
    }

    public Response<Void> generalizeWithResponse(Context context) {
        return serviceManager.virtualMachines().generalizeWithResponse(resourceGroupName, vmName, context);
    }

    public void powerOff(Boolean skipShutdown) {
        serviceManager.virtualMachines().powerOff(resourceGroupName, vmName, skipShutdown);
    }

    public void powerOff() {
        serviceManager.virtualMachines().powerOff(resourceGroupName, vmName);
    }

    public void powerOff(Boolean skipShutdown, Context context) {
        serviceManager.virtualMachines().powerOff(resourceGroupName, vmName, skipShutdown, context);
    }

    public void reapply() {
        serviceManager.virtualMachines().reapply(resourceGroupName, vmName);
    }

    public void reapply(Context context) {
        serviceManager.virtualMachines().reapply(resourceGroupName, vmName, context);
    }

    public void restart() {
        serviceManager.virtualMachines().restart(resourceGroupName, vmName);
    }

    public void restart(Context context) {
        serviceManager.virtualMachines().restart(resourceGroupName, vmName, context);
    }

    public void start() {
        serviceManager.virtualMachines().start(resourceGroupName, vmName);
    }

    public void start(Context context) {
        serviceManager.virtualMachines().start(resourceGroupName, vmName, context);
    }

    public void redeploy() {
        serviceManager.virtualMachines().redeploy(resourceGroupName, vmName);
    }

    public void redeploy(Context context) {
        serviceManager.virtualMachines().redeploy(resourceGroupName, vmName, context);
    }

    public void reimage(VirtualMachineReimageParameters parameters) {
        serviceManager.virtualMachines().reimage(resourceGroupName, vmName, parameters);
    }

    public void reimage() {
        serviceManager.virtualMachines().reimage(resourceGroupName, vmName);
    }

    public void reimage(VirtualMachineReimageParameters parameters, Context context) {
        serviceManager.virtualMachines().reimage(resourceGroupName, vmName, parameters, context);
    }

    public RetrieveBootDiagnosticsDataResult retrieveBootDiagnosticsData() {
        return serviceManager.virtualMachines().retrieveBootDiagnosticsData(resourceGroupName, vmName);
    }

    public Response<RetrieveBootDiagnosticsDataResult> retrieveBootDiagnosticsDataWithResponse(
        Integer sasUriExpirationTimeInMinutes, Context context) {
        return serviceManager
            .virtualMachines()
            .retrieveBootDiagnosticsDataWithResponse(resourceGroupName, vmName, sasUriExpirationTimeInMinutes, context);
    }

    public void performMaintenance() {
        serviceManager.virtualMachines().performMaintenance(resourceGroupName, vmName);
    }

    public void performMaintenance(Context context) {
        serviceManager.virtualMachines().performMaintenance(resourceGroupName, vmName, context);
    }

    public void simulateEviction() {
        serviceManager.virtualMachines().simulateEviction(resourceGroupName, vmName);
    }

    public Response<Void> simulateEvictionWithResponse(Context context) {
        return serviceManager.virtualMachines().simulateEvictionWithResponse(resourceGroupName, vmName, context);
    }

    public VirtualMachineAssessPatchesResult assessPatches() {
        return serviceManager.virtualMachines().assessPatches(resourceGroupName, vmName);
    }

    public VirtualMachineAssessPatchesResult assessPatches(Context context) {
        return serviceManager.virtualMachines().assessPatches(resourceGroupName, vmName, context);
    }

    public VirtualMachineInstallPatchesResult installPatches(
        VirtualMachineInstallPatchesParameters installPatchesInput) {
        return serviceManager.virtualMachines().installPatches(resourceGroupName, vmName, installPatchesInput);
    }

    public VirtualMachineInstallPatchesResult installPatches(
        VirtualMachineInstallPatchesParameters installPatchesInput, Context context) {
        return serviceManager.virtualMachines().installPatches(resourceGroupName, vmName, installPatchesInput, context);
    }

    public RunCommandResult runCommand(RunCommandInput parameters) {
        return serviceManager.virtualMachines().runCommand(resourceGroupName, vmName, parameters);
    }

    public RunCommandResult runCommand(RunCommandInput parameters, Context context) {
        return serviceManager.virtualMachines().runCommand(resourceGroupName, vmName, parameters, context);
    }

    public VirtualMachineImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public VirtualMachineImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public VirtualMachineImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public VirtualMachineImpl withPlan(Plan plan) {
        if (isInCreateMode()) {
            this.innerModel().withPlan(plan);
            return this;
        } else {
            this.updateParameters.withPlan(plan);
            return this;
        }
    }

    public VirtualMachineImpl withIdentity(VirtualMachineIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateParameters.withIdentity(identity);
            return this;
        }
    }

    public VirtualMachineImpl withZones(List<String> zones) {
        if (isInCreateMode()) {
            this.innerModel().withZones(zones);
            return this;
        } else {
            this.updateParameters.withZones(zones);
            return this;
        }
    }

    public VirtualMachineImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public VirtualMachineImpl withHardwareProfile(HardwareProfile hardwareProfile) {
        if (isInCreateMode()) {
            this.innerModel().withHardwareProfile(hardwareProfile);
            return this;
        } else {
            this.updateParameters.withHardwareProfile(hardwareProfile);
            return this;
        }
    }

    public VirtualMachineImpl withStorageProfile(StorageProfile storageProfile) {
        if (isInCreateMode()) {
            this.innerModel().withStorageProfile(storageProfile);
            return this;
        } else {
            this.updateParameters.withStorageProfile(storageProfile);
            return this;
        }
    }

    public VirtualMachineImpl withAdditionalCapabilities(AdditionalCapabilities additionalCapabilities) {
        if (isInCreateMode()) {
            this.innerModel().withAdditionalCapabilities(additionalCapabilities);
            return this;
        } else {
            this.updateParameters.withAdditionalCapabilities(additionalCapabilities);
            return this;
        }
    }

    public VirtualMachineImpl withOsProfile(OSProfile osProfile) {
        if (isInCreateMode()) {
            this.innerModel().withOsProfile(osProfile);
            return this;
        } else {
            this.updateParameters.withOsProfile(osProfile);
            return this;
        }
    }

    public VirtualMachineImpl withNetworkProfile(NetworkProfile networkProfile) {
        if (isInCreateMode()) {
            this.innerModel().withNetworkProfile(networkProfile);
            return this;
        } else {
            this.updateParameters.withNetworkProfile(networkProfile);
            return this;
        }
    }

    public VirtualMachineImpl withSecurityProfile(SecurityProfile securityProfile) {
        if (isInCreateMode()) {
            this.innerModel().withSecurityProfile(securityProfile);
            return this;
        } else {
            this.updateParameters.withSecurityProfile(securityProfile);
            return this;
        }
    }

    public VirtualMachineImpl withDiagnosticsProfile(DiagnosticsProfile diagnosticsProfile) {
        if (isInCreateMode()) {
            this.innerModel().withDiagnosticsProfile(diagnosticsProfile);
            return this;
        } else {
            this.updateParameters.withDiagnosticsProfile(diagnosticsProfile);
            return this;
        }
    }

    public VirtualMachineImpl withAvailabilitySet(SubResource availabilitySet) {
        if (isInCreateMode()) {
            this.innerModel().withAvailabilitySet(availabilitySet);
            return this;
        } else {
            this.updateParameters.withAvailabilitySet(availabilitySet);
            return this;
        }
    }

    public VirtualMachineImpl withVirtualMachineScaleSet(SubResource virtualMachineScaleSet) {
        if (isInCreateMode()) {
            this.innerModel().withVirtualMachineScaleSet(virtualMachineScaleSet);
            return this;
        } else {
            this.updateParameters.withVirtualMachineScaleSet(virtualMachineScaleSet);
            return this;
        }
    }

    public VirtualMachineImpl withProximityPlacementGroup(SubResource proximityPlacementGroup) {
        if (isInCreateMode()) {
            this.innerModel().withProximityPlacementGroup(proximityPlacementGroup);
            return this;
        } else {
            this.updateParameters.withProximityPlacementGroup(proximityPlacementGroup);
            return this;
        }
    }

    public VirtualMachineImpl withPriority(VirtualMachinePriorityTypes priority) {
        if (isInCreateMode()) {
            this.innerModel().withPriority(priority);
            return this;
        } else {
            this.updateParameters.withPriority(priority);
            return this;
        }
    }

    public VirtualMachineImpl withEvictionPolicy(VirtualMachineEvictionPolicyTypes evictionPolicy) {
        if (isInCreateMode()) {
            this.innerModel().withEvictionPolicy(evictionPolicy);
            return this;
        } else {
            this.updateParameters.withEvictionPolicy(evictionPolicy);
            return this;
        }
    }

    public VirtualMachineImpl withBillingProfile(BillingProfile billingProfile) {
        if (isInCreateMode()) {
            this.innerModel().withBillingProfile(billingProfile);
            return this;
        } else {
            this.updateParameters.withBillingProfile(billingProfile);
            return this;
        }
    }

    public VirtualMachineImpl withHost(SubResource host) {
        if (isInCreateMode()) {
            this.innerModel().withHost(host);
            return this;
        } else {
            this.updateParameters.withHost(host);
            return this;
        }
    }

    public VirtualMachineImpl withHostGroup(SubResource hostGroup) {
        if (isInCreateMode()) {
            this.innerModel().withHostGroup(hostGroup);
            return this;
        } else {
            this.updateParameters.withHostGroup(hostGroup);
            return this;
        }
    }

    public VirtualMachineImpl withLicenseType(String licenseType) {
        if (isInCreateMode()) {
            this.innerModel().withLicenseType(licenseType);
            return this;
        } else {
            this.updateParameters.withLicenseType(licenseType);
            return this;
        }
    }

    public VirtualMachineImpl withExtensionsTimeBudget(String extensionsTimeBudget) {
        if (isInCreateMode()) {
            this.innerModel().withExtensionsTimeBudget(extensionsTimeBudget);
            return this;
        } else {
            this.updateParameters.withExtensionsTimeBudget(extensionsTimeBudget);
            return this;
        }
    }

    public VirtualMachineImpl withPlatformFaultDomain(Integer platformFaultDomain) {
        if (isInCreateMode()) {
            this.innerModel().withPlatformFaultDomain(platformFaultDomain);
            return this;
        } else {
            this.updateParameters.withPlatformFaultDomain(platformFaultDomain);
            return this;
        }
    }

    public VirtualMachineImpl withScheduledEventsProfile(ScheduledEventsProfile scheduledEventsProfile) {
        if (isInCreateMode()) {
            this.innerModel().withScheduledEventsProfile(scheduledEventsProfile);
            return this;
        } else {
            this.updateParameters.withScheduledEventsProfile(scheduledEventsProfile);
            return this;
        }
    }

    public VirtualMachineImpl withUserData(String userData) {
        if (isInCreateMode()) {
            this.innerModel().withUserData(userData);
            return this;
        } else {
            this.updateParameters.withUserData(userData);
            return this;
        }
    }

    public VirtualMachineImpl withCapacityReservation(CapacityReservationProfile capacityReservation) {
        if (isInCreateMode()) {
            this.innerModel().withCapacityReservation(capacityReservation);
            return this;
        } else {
            this.updateParameters.withCapacityReservation(capacityReservation);
            return this;
        }
    }

    public VirtualMachineImpl withApplicationProfile(ApplicationProfile applicationProfile) {
        if (isInCreateMode()) {
            this.innerModel().withApplicationProfile(applicationProfile);
            return this;
        } else {
            this.updateParameters.withApplicationProfile(applicationProfile);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
