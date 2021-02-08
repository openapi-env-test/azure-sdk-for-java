// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.NetworkInterfaceLoadBalancersClient;
import com.azure.resourcemanager.network.generated.fluent.models.LoadBalancerInner;
import com.azure.resourcemanager.network.generated.models.LoadBalancer;
import com.azure.resourcemanager.network.generated.models.NetworkInterfaceLoadBalancers;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class NetworkInterfaceLoadBalancersImpl implements NetworkInterfaceLoadBalancers {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkInterfaceLoadBalancersImpl.class);

    private final NetworkInterfaceLoadBalancersClient innerClient;

    private final NetworkManager serviceManager;

    public NetworkInterfaceLoadBalancersImpl(
        NetworkInterfaceLoadBalancersClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<LoadBalancer> list(String resourceGroupName, String networkInterfaceName) {
        PagedIterable<LoadBalancerInner> inner = this.serviceClient().list(resourceGroupName, networkInterfaceName);
        return inner.mapPage(inner1 -> new LoadBalancerImpl(inner1, this.manager()));
    }

    public PagedIterable<LoadBalancer> list(String resourceGroupName, String networkInterfaceName, Context context) {
        PagedIterable<LoadBalancerInner> inner =
            this.serviceClient().list(resourceGroupName, networkInterfaceName, context);
        return inner.mapPage(inner1 -> new LoadBalancerImpl(inner1, this.manager()));
    }

    private NetworkInterfaceLoadBalancersClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
