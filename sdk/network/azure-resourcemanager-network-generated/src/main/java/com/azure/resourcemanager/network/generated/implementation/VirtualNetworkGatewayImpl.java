// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkGatewayInner;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGateway;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayIpConfiguration;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayType;
import com.azure.resourcemanager.network.generated.models.VpnType;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class VirtualNetworkGatewayImpl
    implements VirtualNetworkGateway, VirtualNetworkGateway.Definition, VirtualNetworkGateway.Update {
    private VirtualNetworkGatewayInner innerObject;

    private final NetworkManager serviceManager;

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

    public List<VirtualNetworkGatewayIpConfiguration> ipConfigurations() {
        List<VirtualNetworkGatewayIpConfiguration> inner = this.innerModel().ipConfigurations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public VirtualNetworkGatewayType gatewayType() {
        return this.innerModel().gatewayType();
    }

    public VpnType vpnType() {
        return this.innerModel().vpnType();
    }

    public Boolean enableBgp() {
        return this.innerModel().enableBgp();
    }

    public SubResource gatewayDefaultSite() {
        return this.innerModel().gatewayDefaultSite();
    }

    public String resourceGuid() {
        return this.innerModel().resourceGuid();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public VirtualNetworkGatewayInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String virtualNetworkGatewayName;

    public VirtualNetworkGatewayImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public VirtualNetworkGateway create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkGateways()
                .createOrUpdate(resourceGroupName, virtualNetworkGatewayName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualNetworkGateway create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkGateways()
                .createOrUpdate(resourceGroupName, virtualNetworkGatewayName, this.innerModel(), context);
        return this;
    }

    VirtualNetworkGatewayImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new VirtualNetworkGatewayInner();
        this.serviceManager = serviceManager;
        this.virtualNetworkGatewayName = name;
    }

    public VirtualNetworkGatewayImpl update() {
        return this;
    }

    public VirtualNetworkGateway apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkGateways()
                .createOrUpdate(resourceGroupName, virtualNetworkGatewayName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualNetworkGateway apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkGateways()
                .createOrUpdate(resourceGroupName, virtualNetworkGatewayName, this.innerModel(), context);
        return this;
    }

    VirtualNetworkGatewayImpl(VirtualNetworkGatewayInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.virtualNetworkGatewayName = Utils.getValueFromIdByName(innerObject.id(), "virtualnetworkgateways");
    }

    public VirtualNetworkGateway refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkGateways()
                .getByResourceGroupWithResponse(resourceGroupName, virtualNetworkGatewayName, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualNetworkGateway refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkGateways()
                .getByResourceGroupWithResponse(resourceGroupName, virtualNetworkGatewayName, context)
                .getValue();
        return this;
    }

    public VirtualNetworkGateway reset(VirtualNetworkGatewayInner parameters) {
        return serviceManager.virtualNetworkGateways().reset(resourceGroupName, virtualNetworkGatewayName, parameters);
    }

    public VirtualNetworkGateway reset(VirtualNetworkGatewayInner parameters, Context context) {
        return serviceManager
            .virtualNetworkGateways()
            .reset(resourceGroupName, virtualNetworkGatewayName, parameters, context);
    }

    public VirtualNetworkGatewayImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public VirtualNetworkGatewayImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public VirtualNetworkGatewayImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public VirtualNetworkGatewayImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public VirtualNetworkGatewayImpl withIpConfigurations(List<VirtualNetworkGatewayIpConfiguration> ipConfigurations) {
        this.innerModel().withIpConfigurations(ipConfigurations);
        return this;
    }

    public VirtualNetworkGatewayImpl withGatewayType(VirtualNetworkGatewayType gatewayType) {
        this.innerModel().withGatewayType(gatewayType);
        return this;
    }

    public VirtualNetworkGatewayImpl withVpnType(VpnType vpnType) {
        this.innerModel().withVpnType(vpnType);
        return this;
    }

    public VirtualNetworkGatewayImpl withEnableBgp(Boolean enableBgp) {
        this.innerModel().withEnableBgp(enableBgp);
        return this;
    }

    public VirtualNetworkGatewayImpl withGatewayDefaultSite(SubResource gatewayDefaultSite) {
        this.innerModel().withGatewayDefaultSite(gatewayDefaultSite);
        return this;
    }

    public VirtualNetworkGatewayImpl withResourceGuid(String resourceGuid) {
        this.innerModel().withResourceGuid(resourceGuid);
        return this;
    }

    public VirtualNetworkGatewayImpl withProvisioningState(String provisioningState) {
        this.innerModel().withProvisioningState(provisioningState);
        return this;
    }
}
