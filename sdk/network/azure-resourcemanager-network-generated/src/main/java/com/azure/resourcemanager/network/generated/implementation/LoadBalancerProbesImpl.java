// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.LoadBalancerProbesClient;
import com.azure.resourcemanager.network.generated.fluent.models.ProbeInner;
import com.azure.resourcemanager.network.generated.models.LoadBalancerProbes;
import com.azure.resourcemanager.network.generated.models.Probe;

public final class LoadBalancerProbesImpl implements LoadBalancerProbes {
    private static final ClientLogger LOGGER = new ClientLogger(LoadBalancerProbesImpl.class);

    private final LoadBalancerProbesClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public LoadBalancerProbesImpl(
        LoadBalancerProbesClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Probe> list(String resourceGroupName, String loadBalancerName) {
        PagedIterable<ProbeInner> inner = this.serviceClient().list(resourceGroupName, loadBalancerName);
        return Utils.mapPage(inner, inner1 -> new ProbeImpl(inner1, this.manager()));
    }

    public PagedIterable<Probe> list(String resourceGroupName, String loadBalancerName, Context context) {
        PagedIterable<ProbeInner> inner = this.serviceClient().list(resourceGroupName, loadBalancerName, context);
        return Utils.mapPage(inner, inner1 -> new ProbeImpl(inner1, this.manager()));
    }

    public Probe get(String resourceGroupName, String loadBalancerName, String probeName) {
        ProbeInner inner = this.serviceClient().get(resourceGroupName, loadBalancerName, probeName);
        if (inner != null) {
            return new ProbeImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Probe> getWithResponse(
        String resourceGroupName, String loadBalancerName, String probeName, Context context) {
        Response<ProbeInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, loadBalancerName, probeName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProbeImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private LoadBalancerProbesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
