// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.HubVirtualNetworkConnectionInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualHubInner;
import com.azure.resourcemanager.network.generated.models.HubVirtualNetworkConnection;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import com.azure.resourcemanager.network.generated.models.VirtualHub;
import com.azure.resourcemanager.network.generated.models.VirtualHubRouteTable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class VirtualHubImpl implements VirtualHub, VirtualHub.Definition, VirtualHub.Update {
    private VirtualHubInner innerObject;

    private final NetworkManager serviceManager;

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

    public SubResource virtualWan() {
        return this.innerModel().virtualWan();
    }

    public SubResource vpnGateway() {
        return this.innerModel().vpnGateway();
    }

    public SubResource p2SVpnGateway() {
        return this.innerModel().p2SVpnGateway();
    }

    public SubResource expressRouteGateway() {
        return this.innerModel().expressRouteGateway();
    }

    public List<HubVirtualNetworkConnection> virtualNetworkConnections() {
        List<HubVirtualNetworkConnectionInner> inner = this.innerModel().virtualNetworkConnections();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new HubVirtualNetworkConnectionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String addressPrefix() {
        return this.innerModel().addressPrefix();
    }

    public VirtualHubRouteTable routeTable() {
        return this.innerModel().routeTable();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String id() {
        return this.innerModel().id();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public VirtualHubInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String virtualHubName;

    private TagsObject updateVirtualHubParameters;

    public VirtualHubImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public VirtualHub create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualHubs()
                .createOrUpdate(resourceGroupName, virtualHubName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualHub create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualHubs()
                .createOrUpdate(resourceGroupName, virtualHubName, this.innerModel(), context);
        return this;
    }

    VirtualHubImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new VirtualHubInner();
        this.serviceManager = serviceManager;
        this.virtualHubName = name;
    }

    public VirtualHubImpl update() {
        this.updateVirtualHubParameters = new TagsObject();
        return this;
    }

    public VirtualHub apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualHubs()
                .updateTags(resourceGroupName, virtualHubName, updateVirtualHubParameters, Context.NONE);
        return this;
    }

    public VirtualHub apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualHubs()
                .updateTags(resourceGroupName, virtualHubName, updateVirtualHubParameters, context);
        return this;
    }

    VirtualHubImpl(VirtualHubInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.virtualHubName = Utils.getValueFromIdByName(innerObject.id(), "virtualHubs");
    }

    public VirtualHub refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualHubs()
                .getByResourceGroupWithResponse(resourceGroupName, virtualHubName, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualHub refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualHubs()
                .getByResourceGroupWithResponse(resourceGroupName, virtualHubName, context)
                .getValue();
        return this;
    }

    public VirtualHubImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public VirtualHubImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public VirtualHubImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateVirtualHubParameters.withTags(tags);
            return this;
        }
    }

    public VirtualHubImpl withVirtualWan(SubResource virtualWan) {
        this.innerModel().withVirtualWan(virtualWan);
        return this;
    }

    public VirtualHubImpl withVpnGateway(SubResource vpnGateway) {
        this.innerModel().withVpnGateway(vpnGateway);
        return this;
    }

    public VirtualHubImpl withP2SVpnGateway(SubResource p2SVpnGateway) {
        this.innerModel().withP2SVpnGateway(p2SVpnGateway);
        return this;
    }

    public VirtualHubImpl withExpressRouteGateway(SubResource expressRouteGateway) {
        this.innerModel().withExpressRouteGateway(expressRouteGateway);
        return this;
    }

    public VirtualHubImpl withVirtualNetworkConnections(
        List<HubVirtualNetworkConnectionInner> virtualNetworkConnections) {
        this.innerModel().withVirtualNetworkConnections(virtualNetworkConnections);
        return this;
    }

    public VirtualHubImpl withAddressPrefix(String addressPrefix) {
        this.innerModel().withAddressPrefix(addressPrefix);
        return this;
    }

    public VirtualHubImpl withRouteTable(VirtualHubRouteTable routeTable) {
        this.innerModel().withRouteTable(routeTable);
        return this;
    }

    public VirtualHubImpl withProvisioningState(ProvisioningState provisioningState) {
        this.innerModel().withProvisioningState(provisioningState);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
