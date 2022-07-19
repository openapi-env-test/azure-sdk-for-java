// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCrossConnectionPeeringInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitPeeringConfig;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCrossConnectionPeering;
import com.azure.resourcemanager.network.generated.models.ExpressRoutePeeringState;
import com.azure.resourcemanager.network.generated.models.ExpressRoutePeeringType;
import com.azure.resourcemanager.network.generated.models.Ipv6ExpressRouteCircuitPeeringConfig;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;

public final class ExpressRouteCrossConnectionPeeringImpl implements ExpressRouteCrossConnectionPeering {
    private ExpressRouteCrossConnectionPeeringInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    ExpressRouteCrossConnectionPeeringImpl(
        ExpressRouteCrossConnectionPeeringInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
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

    public ExpressRoutePeeringType peeringType() {
        return this.innerModel().peeringType();
    }

    public ExpressRoutePeeringState state() {
        return this.innerModel().state();
    }

    public Integer azureAsn() {
        return this.innerModel().azureAsn();
    }

    public Long peerAsn() {
        return this.innerModel().peerAsn();
    }

    public String primaryPeerAddressPrefix() {
        return this.innerModel().primaryPeerAddressPrefix();
    }

    public String secondaryPeerAddressPrefix() {
        return this.innerModel().secondaryPeerAddressPrefix();
    }

    public String primaryAzurePort() {
        return this.innerModel().primaryAzurePort();
    }

    public String secondaryAzurePort() {
        return this.innerModel().secondaryAzurePort();
    }

    public String sharedKey() {
        return this.innerModel().sharedKey();
    }

    public Integer vlanId() {
        return this.innerModel().vlanId();
    }

    public ExpressRouteCircuitPeeringConfig microsoftPeeringConfig() {
        return this.innerModel().microsoftPeeringConfig();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String gatewayManagerEtag() {
        return this.innerModel().gatewayManagerEtag();
    }

    public String lastModifiedBy() {
        return this.innerModel().lastModifiedBy();
    }

    public Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig() {
        return this.innerModel().ipv6PeeringConfig();
    }

    public ExpressRouteCrossConnectionPeeringInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
