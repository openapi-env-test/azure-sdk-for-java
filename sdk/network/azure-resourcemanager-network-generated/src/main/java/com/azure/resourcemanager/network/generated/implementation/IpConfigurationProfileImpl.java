// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.IpConfigurationProfileInner;
import com.azure.resourcemanager.network.generated.fluent.models.SubnetInner;
import com.azure.resourcemanager.network.generated.models.IpConfigurationProfile;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.Subnet;

public final class IpConfigurationProfileImpl implements IpConfigurationProfile {
    private IpConfigurationProfileInner innerObject;

    private final NetworkManager serviceManager;

    IpConfigurationProfileImpl(IpConfigurationProfileInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public Subnet subnet() {
        SubnetInner inner = this.innerModel().subnet();
        if (inner != null) {
            return new SubnetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public IpConfigurationProfileInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
