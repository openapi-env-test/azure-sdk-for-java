// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.FrontendIpConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceIpConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceTapConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkTapInner;
import com.azure.resourcemanager.network.generated.models.FrontendIpConfiguration;
import com.azure.resourcemanager.network.generated.models.NetworkInterfaceIpConfiguration;
import com.azure.resourcemanager.network.generated.models.NetworkInterfaceTapConfiguration;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkTap;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class VirtualNetworkTapImpl
    implements VirtualNetworkTap, VirtualNetworkTap.Definition, VirtualNetworkTap.Update {
    private VirtualNetworkTapInner innerObject;

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

    public List<NetworkInterfaceTapConfiguration> networkInterfaceTapConfigurations() {
        List<NetworkInterfaceTapConfigurationInner> inner = this.innerModel().networkInterfaceTapConfigurations();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new NetworkInterfaceTapConfigurationImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String resourceGuid() {
        return this.innerModel().resourceGuid();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public NetworkInterfaceIpConfiguration destinationNetworkInterfaceIpConfiguration() {
        NetworkInterfaceIpConfigurationInner inner = this.innerModel().destinationNetworkInterfaceIpConfiguration();
        if (inner != null) {
            return new NetworkInterfaceIpConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public FrontendIpConfiguration destinationLoadBalancerFrontEndIpConfiguration() {
        FrontendIpConfigurationInner inner = this.innerModel().destinationLoadBalancerFrontEndIpConfiguration();
        if (inner != null) {
            return new FrontendIpConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Integer destinationPort() {
        return this.innerModel().destinationPort();
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

    public VirtualNetworkTapInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String tapName;

    private TagsObject updateTapParameters;

    public VirtualNetworkTapImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public VirtualNetworkTap create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkTaps()
                .createOrUpdate(resourceGroupName, tapName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualNetworkTap create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkTaps()
                .createOrUpdate(resourceGroupName, tapName, this.innerModel(), context);
        return this;
    }

    VirtualNetworkTapImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new VirtualNetworkTapInner();
        this.serviceManager = serviceManager;
        this.tapName = name;
    }

    public VirtualNetworkTapImpl update() {
        this.updateTapParameters = new TagsObject();
        return this;
    }

    public VirtualNetworkTap apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkTaps()
                .updateTags(resourceGroupName, tapName, updateTapParameters, Context.NONE);
        return this;
    }

    public VirtualNetworkTap apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkTaps()
                .updateTags(resourceGroupName, tapName, updateTapParameters, context);
        return this;
    }

    VirtualNetworkTapImpl(VirtualNetworkTapInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.tapName = Utils.getValueFromIdByName(innerObject.id(), "virtualNetworkTaps");
    }

    public VirtualNetworkTap refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkTaps()
                .getByResourceGroupWithResponse(resourceGroupName, tapName, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualNetworkTap refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkTaps()
                .getByResourceGroupWithResponse(resourceGroupName, tapName, context)
                .getValue();
        return this;
    }

    public VirtualNetworkTapImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public VirtualNetworkTapImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public VirtualNetworkTapImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateTapParameters.withTags(tags);
            return this;
        }
    }

    public VirtualNetworkTapImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public VirtualNetworkTapImpl withDestinationNetworkInterfaceIpConfiguration(
        NetworkInterfaceIpConfigurationInner destinationNetworkInterfaceIpConfiguration) {
        this.innerModel().withDestinationNetworkInterfaceIpConfiguration(destinationNetworkInterfaceIpConfiguration);
        return this;
    }

    public VirtualNetworkTapImpl withDestinationLoadBalancerFrontEndIpConfiguration(
        FrontendIpConfigurationInner destinationLoadBalancerFrontEndIpConfiguration) {
        this
            .innerModel()
            .withDestinationLoadBalancerFrontEndIpConfiguration(destinationLoadBalancerFrontEndIpConfiguration);
        return this;
    }

    public VirtualNetworkTapImpl withDestinationPort(Integer destinationPort) {
        this.innerModel().withDestinationPort(destinationPort);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
