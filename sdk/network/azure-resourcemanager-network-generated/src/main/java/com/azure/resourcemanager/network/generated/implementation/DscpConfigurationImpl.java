// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.DscpConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceInner;
import com.azure.resourcemanager.network.generated.models.DscpConfiguration;
import com.azure.resourcemanager.network.generated.models.NetworkInterface;
import com.azure.resourcemanager.network.generated.models.ProtocolType;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.QosDefinition;
import com.azure.resourcemanager.network.generated.models.QosIpRange;
import com.azure.resourcemanager.network.generated.models.QosPortRange;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class DscpConfigurationImpl
    implements DscpConfiguration, DscpConfiguration.Definition, DscpConfiguration.Update {
    private DscpConfigurationInner innerObject;

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

    public String etag() {
        return this.innerModel().etag();
    }

    public String id() {
        return this.innerModel().id();
    }

    public List<Integer> markings() {
        List<Integer> inner = this.innerModel().markings();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<QosIpRange> sourceIpRanges() {
        List<QosIpRange> inner = this.innerModel().sourceIpRanges();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<QosIpRange> destinationIpRanges() {
        List<QosIpRange> inner = this.innerModel().destinationIpRanges();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<QosPortRange> sourcePortRanges() {
        List<QosPortRange> inner = this.innerModel().sourcePortRanges();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<QosPortRange> destinationPortRanges() {
        List<QosPortRange> inner = this.innerModel().destinationPortRanges();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProtocolType protocol() {
        return this.innerModel().protocol();
    }

    public List<QosDefinition> qosDefinitionCollection() {
        List<QosDefinition> inner = this.innerModel().qosDefinitionCollection();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String qosCollectionId() {
        return this.innerModel().qosCollectionId();
    }

    public List<NetworkInterface> associatedNetworkInterfaces() {
        List<NetworkInterfaceInner> inner = this.innerModel().associatedNetworkInterfaces();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new NetworkInterfaceImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String resourceGuid() {
        return this.innerModel().resourceGuid();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public DscpConfigurationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String dscpConfigurationName;

    public DscpConfigurationImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public DscpConfiguration create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDscpConfigurations()
                .createOrUpdate(resourceGroupName, dscpConfigurationName, this.innerModel(), Context.NONE);
        return this;
    }

    public DscpConfiguration create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDscpConfigurations()
                .createOrUpdate(resourceGroupName, dscpConfigurationName, this.innerModel(), context);
        return this;
    }

    DscpConfigurationImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new DscpConfigurationInner();
        this.serviceManager = serviceManager;
        this.dscpConfigurationName = name;
    }

    public DscpConfigurationImpl update() {
        return this;
    }

    public DscpConfiguration apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDscpConfigurations()
                .createOrUpdate(resourceGroupName, dscpConfigurationName, this.innerModel(), Context.NONE);
        return this;
    }

    public DscpConfiguration apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDscpConfigurations()
                .createOrUpdate(resourceGroupName, dscpConfigurationName, this.innerModel(), context);
        return this;
    }

    DscpConfigurationImpl(
        DscpConfigurationInner innerObject, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.dscpConfigurationName = Utils.getValueFromIdByName(innerObject.id(), "dscpConfigurations");
    }

    public DscpConfiguration refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDscpConfigurations()
                .getByResourceGroupWithResponse(resourceGroupName, dscpConfigurationName, Context.NONE)
                .getValue();
        return this;
    }

    public DscpConfiguration refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDscpConfigurations()
                .getByResourceGroupWithResponse(resourceGroupName, dscpConfigurationName, context)
                .getValue();
        return this;
    }

    public DscpConfigurationImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public DscpConfigurationImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public DscpConfigurationImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public DscpConfigurationImpl withMarkings(List<Integer> markings) {
        this.innerModel().withMarkings(markings);
        return this;
    }

    public DscpConfigurationImpl withSourceIpRanges(List<QosIpRange> sourceIpRanges) {
        this.innerModel().withSourceIpRanges(sourceIpRanges);
        return this;
    }

    public DscpConfigurationImpl withDestinationIpRanges(List<QosIpRange> destinationIpRanges) {
        this.innerModel().withDestinationIpRanges(destinationIpRanges);
        return this;
    }

    public DscpConfigurationImpl withSourcePortRanges(List<QosPortRange> sourcePortRanges) {
        this.innerModel().withSourcePortRanges(sourcePortRanges);
        return this;
    }

    public DscpConfigurationImpl withDestinationPortRanges(List<QosPortRange> destinationPortRanges) {
        this.innerModel().withDestinationPortRanges(destinationPortRanges);
        return this;
    }

    public DscpConfigurationImpl withProtocol(ProtocolType protocol) {
        this.innerModel().withProtocol(protocol);
        return this;
    }

    public DscpConfigurationImpl withQosDefinitionCollection(List<QosDefinition> qosDefinitionCollection) {
        this.innerModel().withQosDefinitionCollection(qosDefinitionCollection);
        return this;
    }
}
