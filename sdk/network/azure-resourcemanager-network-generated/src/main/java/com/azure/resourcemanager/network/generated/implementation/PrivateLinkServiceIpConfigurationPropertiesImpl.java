// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.PrivateLinkServiceIpConfigurationPropertiesInner;
import com.azure.resourcemanager.network.generated.fluent.models.SubnetInner;
import com.azure.resourcemanager.network.generated.models.IpAllocationMethod;
import com.azure.resourcemanager.network.generated.models.IpVersion;
import com.azure.resourcemanager.network.generated.models.PrivateLinkServiceIpConfigurationProperties;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.Subnet;

public final class PrivateLinkServiceIpConfigurationPropertiesImpl
    implements PrivateLinkServiceIpConfigurationProperties {
    private PrivateLinkServiceIpConfigurationPropertiesInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    PrivateLinkServiceIpConfigurationPropertiesImpl(
        PrivateLinkServiceIpConfigurationPropertiesInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String privateIpAddress() {
        return this.innerModel().privateIpAddress();
    }

    public IpAllocationMethod privateIpAllocationMethod() {
        return this.innerModel().privateIpAllocationMethod();
    }

    public Subnet subnet() {
        SubnetInner inner = this.innerModel().subnet();
        if (inner != null) {
            return new SubnetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Boolean primary() {
        return this.innerModel().primary();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public IpVersion privateIpAddressVersion() {
        return this.innerModel().privateIpAddressVersion();
    }

    public PrivateLinkServiceIpConfigurationPropertiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
