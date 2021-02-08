// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.InterfaceEndpointInner;
import com.azure.resourcemanager.network.generated.fluent.models.IpConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.IpConfigurationProfileInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkSecurityGroupInner;
import com.azure.resourcemanager.network.generated.fluent.models.RouteTableInner;
import com.azure.resourcemanager.network.generated.fluent.models.ServiceEndpointPolicyInner;
import com.azure.resourcemanager.network.generated.fluent.models.SubnetInner;
import com.azure.resourcemanager.network.generated.models.Delegation;
import com.azure.resourcemanager.network.generated.models.InterfaceEndpoint;
import com.azure.resourcemanager.network.generated.models.IpConfiguration;
import com.azure.resourcemanager.network.generated.models.IpConfigurationProfile;
import com.azure.resourcemanager.network.generated.models.NetworkSecurityGroup;
import com.azure.resourcemanager.network.generated.models.ResourceNavigationLink;
import com.azure.resourcemanager.network.generated.models.RouteTable;
import com.azure.resourcemanager.network.generated.models.ServiceAssociationLink;
import com.azure.resourcemanager.network.generated.models.ServiceEndpointPolicy;
import com.azure.resourcemanager.network.generated.models.ServiceEndpointPropertiesFormat;
import com.azure.resourcemanager.network.generated.models.Subnet;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class SubnetImpl implements Subnet {
    private SubnetInner innerObject;

    private final NetworkManager serviceManager;

    SubnetImpl(SubnetInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String addressPrefix() {
        return this.innerModel().addressPrefix();
    }

    public List<String> addressPrefixes() {
        List<String> inner = this.innerModel().addressPrefixes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public NetworkSecurityGroup networkSecurityGroup() {
        NetworkSecurityGroupInner inner = this.innerModel().networkSecurityGroup();
        if (inner != null) {
            return new NetworkSecurityGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public RouteTable routeTable() {
        RouteTableInner inner = this.innerModel().routeTable();
        if (inner != null) {
            return new RouteTableImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public List<ServiceEndpointPropertiesFormat> serviceEndpoints() {
        List<ServiceEndpointPropertiesFormat> inner = this.innerModel().serviceEndpoints();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ServiceEndpointPolicy> serviceEndpointPolicies() {
        List<ServiceEndpointPolicyInner> inner = this.innerModel().serviceEndpointPolicies();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ServiceEndpointPolicyImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<InterfaceEndpoint> interfaceEndpoints() {
        List<InterfaceEndpointInner> inner = this.innerModel().interfaceEndpoints();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new InterfaceEndpointImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<IpConfiguration> ipConfigurations() {
        List<IpConfigurationInner> inner = this.innerModel().ipConfigurations();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new IpConfigurationImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<IpConfigurationProfile> ipConfigurationProfiles() {
        List<IpConfigurationProfileInner> inner = this.innerModel().ipConfigurationProfiles();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new IpConfigurationProfileImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<ResourceNavigationLink> resourceNavigationLinks() {
        List<ResourceNavigationLink> inner = this.innerModel().resourceNavigationLinks();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ServiceAssociationLink> serviceAssociationLinks() {
        List<ServiceAssociationLink> inner = this.innerModel().serviceAssociationLinks();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<Delegation> delegations() {
        List<Delegation> inner = this.innerModel().delegations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String purpose() {
        return this.innerModel().purpose();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public SubnetInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
