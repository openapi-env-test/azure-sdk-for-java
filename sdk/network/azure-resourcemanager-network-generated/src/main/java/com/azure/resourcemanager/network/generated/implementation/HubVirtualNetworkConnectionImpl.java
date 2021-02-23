// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.HubVirtualNetworkConnectionInner;
import com.azure.resourcemanager.network.generated.models.HubVirtualNetworkConnection;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;

public final class HubVirtualNetworkConnectionImpl implements HubVirtualNetworkConnection {
    private HubVirtualNetworkConnectionInner innerObject;

    private final NetworkManager serviceManager;

    HubVirtualNetworkConnectionImpl(HubVirtualNetworkConnectionInner innerObject, NetworkManager serviceManager) {
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

    public SubResource remoteVirtualNetwork() {
        return this.innerModel().remoteVirtualNetwork();
    }

    public Boolean allowHubToRemoteVnetTransit() {
        return this.innerModel().allowHubToRemoteVnetTransit();
    }

    public Boolean allowRemoteVnetToUseHubVnetGateways() {
        return this.innerModel().allowRemoteVnetToUseHubVnetGateways();
    }

    public Boolean enableInternetSecurity() {
        return this.innerModel().enableInternetSecurity();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public HubVirtualNetworkConnectionInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
