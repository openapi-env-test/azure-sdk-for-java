// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceIpConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceTapConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkSecurityGroupInner;
import com.azure.resourcemanager.network.generated.fluent.models.PrivateEndpointInner;
import com.azure.resourcemanager.network.generated.fluent.models.PrivateLinkServiceInner;
import com.azure.resourcemanager.network.generated.models.EffectiveNetworkSecurityGroupListResult;
import com.azure.resourcemanager.network.generated.models.EffectiveRouteListResult;
import com.azure.resourcemanager.network.generated.models.ExtendedLocation;
import com.azure.resourcemanager.network.generated.models.NetworkInterface;
import com.azure.resourcemanager.network.generated.models.NetworkInterfaceDnsSettings;
import com.azure.resourcemanager.network.generated.models.NetworkInterfaceIpConfiguration;
import com.azure.resourcemanager.network.generated.models.NetworkInterfaceMigrationPhase;
import com.azure.resourcemanager.network.generated.models.NetworkInterfaceNicType;
import com.azure.resourcemanager.network.generated.models.NetworkInterfaceTapConfiguration;
import com.azure.resourcemanager.network.generated.models.NetworkSecurityGroup;
import com.azure.resourcemanager.network.generated.models.PrivateEndpoint;
import com.azure.resourcemanager.network.generated.models.PrivateLinkService;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class NetworkInterfaceImpl
    implements NetworkInterface, NetworkInterface.Definition, NetworkInterface.Update {
    private NetworkInterfaceInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

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

    public ExtendedLocation extendedLocation() {
        return this.innerModel().extendedLocation();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String id() {
        return this.innerModel().id();
    }

    public SubResource virtualMachine() {
        return this.innerModel().virtualMachine();
    }

    public NetworkSecurityGroup networkSecurityGroup() {
        NetworkSecurityGroupInner inner = this.innerModel().networkSecurityGroup();
        if (inner != null) {
            return new NetworkSecurityGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PrivateEndpoint privateEndpoint() {
        PrivateEndpointInner inner = this.innerModel().privateEndpoint();
        if (inner != null) {
            return new PrivateEndpointImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public List<NetworkInterfaceIpConfiguration> ipConfigurations() {
        List<NetworkInterfaceIpConfigurationInner> inner = this.innerModel().ipConfigurations();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new NetworkInterfaceIpConfigurationImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<NetworkInterfaceTapConfiguration> tapConfigurations() {
        List<NetworkInterfaceTapConfigurationInner> inner = this.innerModel().tapConfigurations();
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

    public NetworkInterfaceDnsSettings dnsSettings() {
        return this.innerModel().dnsSettings();
    }

    public String macAddress() {
        return this.innerModel().macAddress();
    }

    public Boolean primary() {
        return this.innerModel().primary();
    }

    public Boolean vnetEncryptionSupported() {
        return this.innerModel().vnetEncryptionSupported();
    }

    public Boolean enableAcceleratedNetworking() {
        return this.innerModel().enableAcceleratedNetworking();
    }

    public Boolean enableIpForwarding() {
        return this.innerModel().enableIpForwarding();
    }

    public List<String> hostedWorkloads() {
        List<String> inner = this.innerModel().hostedWorkloads();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SubResource dscpConfiguration() {
        return this.innerModel().dscpConfiguration();
    }

    public String resourceGuid() {
        return this.innerModel().resourceGuid();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String workloadType() {
        return this.innerModel().workloadType();
    }

    public NetworkInterfaceNicType nicType() {
        return this.innerModel().nicType();
    }

    public PrivateLinkService privateLinkService() {
        PrivateLinkServiceInner inner = this.innerModel().privateLinkService();
        if (inner != null) {
            return new PrivateLinkServiceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public NetworkInterfaceMigrationPhase migrationPhase() {
        return this.innerModel().migrationPhase();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public NetworkInterfaceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String networkInterfaceName;

    private TagsObject updateParameters;

    public NetworkInterfaceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public NetworkInterface create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkInterfaces()
                .createOrUpdate(resourceGroupName, networkInterfaceName, this.innerModel(), Context.NONE);
        return this;
    }

    public NetworkInterface create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkInterfaces()
                .createOrUpdate(resourceGroupName, networkInterfaceName, this.innerModel(), context);
        return this;
    }

    NetworkInterfaceImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new NetworkInterfaceInner();
        this.serviceManager = serviceManager;
        this.networkInterfaceName = name;
    }

    public NetworkInterfaceImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public NetworkInterface apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkInterfaces()
                .updateTagsWithResponse(resourceGroupName, networkInterfaceName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public NetworkInterface apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkInterfaces()
                .updateTagsWithResponse(resourceGroupName, networkInterfaceName, updateParameters, context)
                .getValue();
        return this;
    }

    NetworkInterfaceImpl(
        NetworkInterfaceInner innerObject, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.networkInterfaceName = Utils.getValueFromIdByName(innerObject.id(), "networkInterfaces");
    }

    public NetworkInterface refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkInterfaces()
                .getByResourceGroupWithResponse(resourceGroupName, networkInterfaceName, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public NetworkInterface refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkInterfaces()
                .getByResourceGroupWithResponse(resourceGroupName, networkInterfaceName, localExpand, context)
                .getValue();
        return this;
    }

    public EffectiveRouteListResult getEffectiveRouteTable() {
        return serviceManager.networkInterfaces().getEffectiveRouteTable(resourceGroupName, networkInterfaceName);
    }

    public EffectiveRouteListResult getEffectiveRouteTable(Context context) {
        return serviceManager
            .networkInterfaces()
            .getEffectiveRouteTable(resourceGroupName, networkInterfaceName, context);
    }

    public EffectiveNetworkSecurityGroupListResult listEffectiveNetworkSecurityGroups() {
        return serviceManager
            .networkInterfaces()
            .listEffectiveNetworkSecurityGroups(resourceGroupName, networkInterfaceName);
    }

    public EffectiveNetworkSecurityGroupListResult listEffectiveNetworkSecurityGroups(Context context) {
        return serviceManager
            .networkInterfaces()
            .listEffectiveNetworkSecurityGroups(resourceGroupName, networkInterfaceName, context);
    }

    public NetworkInterfaceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public NetworkInterfaceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public NetworkInterfaceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public NetworkInterfaceImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public NetworkInterfaceImpl withNetworkSecurityGroup(NetworkSecurityGroupInner networkSecurityGroup) {
        this.innerModel().withNetworkSecurityGroup(networkSecurityGroup);
        return this;
    }

    public NetworkInterfaceImpl withIpConfigurations(List<NetworkInterfaceIpConfigurationInner> ipConfigurations) {
        this.innerModel().withIpConfigurations(ipConfigurations);
        return this;
    }

    public NetworkInterfaceImpl withDnsSettings(NetworkInterfaceDnsSettings dnsSettings) {
        this.innerModel().withDnsSettings(dnsSettings);
        return this;
    }

    public NetworkInterfaceImpl withEnableAcceleratedNetworking(Boolean enableAcceleratedNetworking) {
        this.innerModel().withEnableAcceleratedNetworking(enableAcceleratedNetworking);
        return this;
    }

    public NetworkInterfaceImpl withEnableIpForwarding(Boolean enableIpForwarding) {
        this.innerModel().withEnableIpForwarding(enableIpForwarding);
        return this;
    }

    public NetworkInterfaceImpl withWorkloadType(String workloadType) {
        this.innerModel().withWorkloadType(workloadType);
        return this;
    }

    public NetworkInterfaceImpl withNicType(NetworkInterfaceNicType nicType) {
        this.innerModel().withNicType(nicType);
        return this;
    }

    public NetworkInterfaceImpl withPrivateLinkService(PrivateLinkServiceInner privateLinkService) {
        this.innerModel().withPrivateLinkService(privateLinkService);
        return this;
    }

    public NetworkInterfaceImpl withMigrationPhase(NetworkInterfaceMigrationPhase migrationPhase) {
        this.innerModel().withMigrationPhase(migrationPhase);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
