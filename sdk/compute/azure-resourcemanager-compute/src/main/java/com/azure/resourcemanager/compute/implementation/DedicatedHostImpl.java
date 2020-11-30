// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.ComputeManager;
import com.azure.resourcemanager.compute.fluent.models.DedicatedHostInner;
import com.azure.resourcemanager.compute.models.DedicatedHost;
import com.azure.resourcemanager.compute.models.DedicatedHostInstanceView;
import com.azure.resourcemanager.compute.models.DedicatedHostLicenseTypes;
import com.azure.resourcemanager.compute.models.DedicatedHostUpdate;
import com.azure.resourcemanager.compute.models.InstanceViewTypes;
import com.azure.resourcemanager.compute.models.Sku;
import com.azure.resourcemanager.compute.models.SubResourceReadOnly;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class DedicatedHostImpl implements DedicatedHost, DedicatedHost.Definition, DedicatedHost.Update {
    private DedicatedHostInner innerObject;

    private final ComputeManager serviceManager;

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

    public Sku sku() {
        return this.innerModel().sku();
    }

    public Integer platformFaultDomain() {
        return this.innerModel().platformFaultDomain();
    }

    public Boolean autoReplaceOnFailure() {
        return this.innerModel().autoReplaceOnFailure();
    }

    public String hostId() {
        return this.innerModel().hostId();
    }

    public List<SubResourceReadOnly> virtualMachines() {
        List<SubResourceReadOnly> inner = this.innerModel().virtualMachines();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public DedicatedHostLicenseTypes licenseType() {
        return this.innerModel().licenseType();
    }

    public OffsetDateTime provisioningTime() {
        return this.innerModel().provisioningTime();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public DedicatedHostInstanceView instanceView() {
        return this.innerModel().instanceView();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public DedicatedHostInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String hostGroupName;

    private String hostname;

    private DedicatedHostUpdate updateParameters;

    public DedicatedHostImpl withExistingHostGroup(String resourceGroupName, String hostGroupName) {
        this.resourceGroupName = resourceGroupName;
        this.hostGroupName = hostGroupName;
        return this;
    }

    public DedicatedHost create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDedicatedHosts()
                .createOrUpdate(resourceGroupName, hostGroupName, hostname, this.innerModel(), Context.NONE);
        return this;
    }

    public DedicatedHost create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDedicatedHosts()
                .createOrUpdate(resourceGroupName, hostGroupName, hostname, this.innerModel(), context);
        return this;
    }

    public DedicatedHostImpl(String name, ComputeManager serviceManager) {
        this.innerObject = new DedicatedHostInner();
        this.serviceManager = serviceManager;
        this.hostname = name;
    }

    public DedicatedHostImpl update() {
        this.updateParameters = new DedicatedHostUpdate();
        return this;
    }

    public DedicatedHost apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDedicatedHosts()
                .update(resourceGroupName, hostGroupName, hostname, updateParameters, Context.NONE);
        return this;
    }

    public DedicatedHost apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDedicatedHosts()
                .update(resourceGroupName, hostGroupName, hostname, updateParameters, context);
        return this;
    }

    public DedicatedHostImpl(DedicatedHostInner innerObject, ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.hostGroupName = Utils.getValueFromIdByName(innerObject.id(), "hostGroups");
        this.hostname = Utils.getValueFromIdByName(innerObject.id(), "hosts");
    }

    public DedicatedHost refresh() {
        InstanceViewTypes localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDedicatedHosts()
                .getWithResponse(resourceGroupName, hostGroupName, hostname, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public DedicatedHost refresh(Context context) {
        InstanceViewTypes localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDedicatedHosts()
                .getWithResponse(resourceGroupName, hostGroupName, hostname, localExpand, context)
                .getValue();
        return this;
    }

    public DedicatedHostImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public DedicatedHostImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public DedicatedHostImpl withSku(Sku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public DedicatedHostImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public DedicatedHostImpl withPlatformFaultDomain(Integer platformFaultDomain) {
        if (isInCreateMode()) {
            this.innerModel().withPlatformFaultDomain(platformFaultDomain);
            return this;
        } else {
            this.updateParameters.withPlatformFaultDomain(platformFaultDomain);
            return this;
        }
    }

    public DedicatedHostImpl withAutoReplaceOnFailure(Boolean autoReplaceOnFailure) {
        if (isInCreateMode()) {
            this.innerModel().withAutoReplaceOnFailure(autoReplaceOnFailure);
            return this;
        } else {
            this.updateParameters.withAutoReplaceOnFailure(autoReplaceOnFailure);
            return this;
        }
    }

    public DedicatedHostImpl withLicenseType(DedicatedHostLicenseTypes licenseType) {
        if (isInCreateMode()) {
            this.innerModel().withLicenseType(licenseType);
            return this;
        } else {
            this.updateParameters.withLicenseType(licenseType);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
