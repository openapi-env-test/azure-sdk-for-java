// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridnetwork.fluent.models.NetworkFunctionInner;
import com.azure.resourcemanager.hybridnetwork.models.ExecuteRequestParameters;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunction;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionUserConfiguration;
import com.azure.resourcemanager.hybridnetwork.models.ProvisioningState;
import com.azure.resourcemanager.hybridnetwork.models.SkuType;
import com.azure.resourcemanager.hybridnetwork.models.TagsObject;
import com.azure.resourcemanager.hybridnetwork.models.VendorProvisioningState;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class NetworkFunctionImpl implements NetworkFunction, NetworkFunction.Definition, NetworkFunction.Update {
    private NetworkFunctionInner innerObject;

    private final com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager;

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

    public String etag() {
        return this.innerModel().etag();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public SubResource device() {
        return this.innerModel().device();
    }

    public String skuName() {
        return this.innerModel().skuName();
    }

    public SkuType skuType() {
        return this.innerModel().skuType();
    }

    public String vendorName() {
        return this.innerModel().vendorName();
    }

    public String serviceKey() {
        return this.innerModel().serviceKey();
    }

    public VendorProvisioningState vendorProvisioningState() {
        return this.innerModel().vendorProvisioningState();
    }

    public SubResource managedApplication() {
        return this.innerModel().managedApplication();
    }

    public Object managedApplicationParameters() {
        return this.innerModel().managedApplicationParameters();
    }

    public Object networkFunctionContainerConfigurations() {
        return this.innerModel().networkFunctionContainerConfigurations();
    }

    public List<NetworkFunctionUserConfiguration> networkFunctionUserConfigurations() {
        List<NetworkFunctionUserConfiguration> inner = this.innerModel().networkFunctionUserConfigurations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
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

    public NetworkFunctionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String networkFunctionName;

    private TagsObject updateParameters;

    public NetworkFunctionImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public NetworkFunction create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkFunctions()
                .createOrUpdate(resourceGroupName, networkFunctionName, this.innerModel(), Context.NONE);
        return this;
    }

    public NetworkFunction create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkFunctions()
                .createOrUpdate(resourceGroupName, networkFunctionName, this.innerModel(), context);
        return this;
    }

    NetworkFunctionImpl(String name, com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager) {
        this.innerObject = new NetworkFunctionInner();
        this.serviceManager = serviceManager;
        this.networkFunctionName = name;
    }

    public NetworkFunctionImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public NetworkFunction apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkFunctions()
                .updateTagsWithResponse(resourceGroupName, networkFunctionName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public NetworkFunction apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkFunctions()
                .updateTagsWithResponse(resourceGroupName, networkFunctionName, updateParameters, context)
                .getValue();
        return this;
    }

    NetworkFunctionImpl(
        NetworkFunctionInner innerObject, com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.networkFunctionName = Utils.getValueFromIdByName(innerObject.id(), "networkFunctions");
    }

    public NetworkFunction refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkFunctions()
                .getByResourceGroupWithResponse(resourceGroupName, networkFunctionName, Context.NONE)
                .getValue();
        return this;
    }

    public NetworkFunction refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkFunctions()
                .getByResourceGroupWithResponse(resourceGroupName, networkFunctionName, context)
                .getValue();
        return this;
    }

    public void executeRequest(ExecuteRequestParameters parameters) {
        serviceManager.networkFunctions().executeRequest(resourceGroupName, networkFunctionName, parameters);
    }

    public void executeRequest(ExecuteRequestParameters parameters, Context context) {
        serviceManager.networkFunctions().executeRequest(resourceGroupName, networkFunctionName, parameters, context);
    }

    public NetworkFunctionImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public NetworkFunctionImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public NetworkFunctionImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public NetworkFunctionImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public NetworkFunctionImpl withDevice(SubResource device) {
        this.innerModel().withDevice(device);
        return this;
    }

    public NetworkFunctionImpl withSkuName(String skuName) {
        this.innerModel().withSkuName(skuName);
        return this;
    }

    public NetworkFunctionImpl withVendorName(String vendorName) {
        this.innerModel().withVendorName(vendorName);
        return this;
    }

    public NetworkFunctionImpl withManagedApplicationParameters(Object managedApplicationParameters) {
        this.innerModel().withManagedApplicationParameters(managedApplicationParameters);
        return this;
    }

    public NetworkFunctionImpl withNetworkFunctionContainerConfigurations(
        Object networkFunctionContainerConfigurations) {
        this.innerModel().withNetworkFunctionContainerConfigurations(networkFunctionContainerConfigurations);
        return this;
    }

    public NetworkFunctionImpl withNetworkFunctionUserConfigurations(
        List<NetworkFunctionUserConfiguration> networkFunctionUserConfigurations) {
        this.innerModel().withNetworkFunctionUserConfigurations(networkFunctionUserConfigurations);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
