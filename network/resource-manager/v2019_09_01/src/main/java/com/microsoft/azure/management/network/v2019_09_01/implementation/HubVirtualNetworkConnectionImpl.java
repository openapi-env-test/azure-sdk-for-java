/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01.implementation;

import com.microsoft.azure.management.network.v2019_09_01.HubVirtualNetworkConnection;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.network.v2019_09_01.ProvisioningState;
import com.microsoft.azure.SubResource;

class HubVirtualNetworkConnectionImpl extends IndexableRefreshableWrapperImpl<HubVirtualNetworkConnection, HubVirtualNetworkConnectionInner> implements HubVirtualNetworkConnection {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String virtualHubName;
    private String connectionName;

    HubVirtualNetworkConnectionImpl(HubVirtualNetworkConnectionInner inner,  NetworkManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.virtualHubName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualHubs");
        this.connectionName = IdParsingUtils.getValueFromIdByName(inner.id(), "hubVirtualNetworkConnections");
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<HubVirtualNetworkConnectionInner> getInnerAsync() {
        HubVirtualNetworkConnectionsInner client = this.manager().inner().hubVirtualNetworkConnections();
        return client.getAsync(this.resourceGroupName, this.virtualHubName, this.connectionName);
    }



    @Override
    public Boolean allowHubToRemoteVnetTransit() {
        return this.inner().allowHubToRemoteVnetTransit();
    }

    @Override
    public Boolean allowRemoteVnetToUseHubVnetGateways() {
        return this.inner().allowRemoteVnetToUseHubVnetGateways();
    }

    @Override
    public Boolean enableInternetSecurity() {
        return this.inner().enableInternetSecurity();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public SubResource remoteVirtualNetwork() {
        return this.inner().remoteVirtualNetwork();
    }

}
