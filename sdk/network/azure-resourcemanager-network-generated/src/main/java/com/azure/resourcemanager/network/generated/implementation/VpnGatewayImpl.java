// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.VpnConnectionInner;
import com.azure.resourcemanager.network.generated.fluent.models.VpnGatewayInner;
import com.azure.resourcemanager.network.generated.models.BgpSettings;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import com.azure.resourcemanager.network.generated.models.VpnConnection;
import com.azure.resourcemanager.network.generated.models.VpnGateway;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class VpnGatewayImpl implements VpnGateway, VpnGateway.Definition, VpnGateway.Update {
    private VpnGatewayInner innerObject;

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

    public SubResource virtualHub() {
        return this.innerModel().virtualHub();
    }

    public List<VpnConnection> connections() {
        List<VpnConnectionInner> inner = this.innerModel().connections();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new VpnConnectionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public BgpSettings bgpSettings() {
        return this.innerModel().bgpSettings();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Integer vpnGatewayScaleUnit() {
        return this.innerModel().vpnGatewayScaleUnit();
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

    public VpnGatewayInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String gatewayName;

    private TagsObject updateVpnGatewayParameters;

    public VpnGatewayImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public VpnGateway create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVpnGateways()
                .createOrUpdate(resourceGroupName, gatewayName, this.innerModel(), Context.NONE);
        return this;
    }

    public VpnGateway create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVpnGateways()
                .createOrUpdate(resourceGroupName, gatewayName, this.innerModel(), context);
        return this;
    }

    VpnGatewayImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new VpnGatewayInner();
        this.serviceManager = serviceManager;
        this.gatewayName = name;
    }

    public VpnGatewayImpl update() {
        this.updateVpnGatewayParameters = new TagsObject();
        return this;
    }

    public VpnGateway apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVpnGateways()
                .updateTagsWithResponse(resourceGroupName, gatewayName, updateVpnGatewayParameters, Context.NONE)
                .getValue();
        return this;
    }

    public VpnGateway apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVpnGateways()
                .updateTagsWithResponse(resourceGroupName, gatewayName, updateVpnGatewayParameters, context)
                .getValue();
        return this;
    }

    VpnGatewayImpl(VpnGatewayInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.gatewayName = Utils.getValueFromIdByName(innerObject.id(), "vpnGateways");
    }

    public VpnGateway refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVpnGateways()
                .getByResourceGroupWithResponse(resourceGroupName, gatewayName, Context.NONE)
                .getValue();
        return this;
    }

    public VpnGateway refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVpnGateways()
                .getByResourceGroupWithResponse(resourceGroupName, gatewayName, context)
                .getValue();
        return this;
    }

    public VpnGatewayImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public VpnGatewayImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public VpnGatewayImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateVpnGatewayParameters.withTags(tags);
            return this;
        }
    }

    public VpnGatewayImpl withVirtualHub(SubResource virtualHub) {
        this.innerModel().withVirtualHub(virtualHub);
        return this;
    }

    public VpnGatewayImpl withConnections(List<VpnConnectionInner> connections) {
        this.innerModel().withConnections(connections);
        return this;
    }

    public VpnGatewayImpl withBgpSettings(BgpSettings bgpSettings) {
        this.innerModel().withBgpSettings(bgpSettings);
        return this;
    }

    public VpnGatewayImpl withVpnGatewayScaleUnit(Integer vpnGatewayScaleUnit) {
        this.innerModel().withVpnGatewayScaleUnit(vpnGatewayScaleUnit);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
