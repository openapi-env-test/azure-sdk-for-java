// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.SubnetsClient;
import com.azure.resourcemanager.network.generated.fluent.models.SubnetInner;
import com.azure.resourcemanager.network.generated.models.Subnet;
import com.azure.resourcemanager.network.generated.models.Subnets;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SubnetsImpl implements Subnets {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SubnetsImpl.class);

    private final SubnetsClient innerClient;

    private final NetworkManager serviceManager;

    public SubnetsImpl(SubnetsClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String virtualNetworkName, String subnetName) {
        this.serviceClient().delete(resourceGroupName, virtualNetworkName, subnetName);
    }

    public void delete(String resourceGroupName, String virtualNetworkName, String subnetName, Context context) {
        this.serviceClient().delete(resourceGroupName, virtualNetworkName, subnetName, context);
    }

    public Subnet get(String resourceGroupName, String virtualNetworkName, String subnetName) {
        SubnetInner inner = this.serviceClient().get(resourceGroupName, virtualNetworkName, subnetName);
        if (inner != null) {
            return new SubnetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Subnet> getWithResponse(
        String resourceGroupName, String virtualNetworkName, String subnetName, Context context) {
        Response<SubnetInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, virtualNetworkName, subnetName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SubnetImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Subnet createOrUpdate(
        String resourceGroupName, String virtualNetworkName, String subnetName, SubnetInner subnetParameters) {
        SubnetInner inner =
            this.serviceClient().createOrUpdate(resourceGroupName, virtualNetworkName, subnetName, subnetParameters);
        if (inner != null) {
            return new SubnetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Subnet createOrUpdate(
        String resourceGroupName,
        String virtualNetworkName,
        String subnetName,
        SubnetInner subnetParameters,
        Context context) {
        SubnetInner inner =
            this
                .serviceClient()
                .createOrUpdate(resourceGroupName, virtualNetworkName, subnetName, subnetParameters, context);
        if (inner != null) {
            return new SubnetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<Subnet> list(String resourceGroupName, String virtualNetworkName) {
        PagedIterable<SubnetInner> inner = this.serviceClient().list(resourceGroupName, virtualNetworkName);
        return inner.mapPage(inner1 -> new SubnetImpl(inner1, this.manager()));
    }

    public PagedIterable<Subnet> list(String resourceGroupName, String virtualNetworkName, Context context) {
        PagedIterable<SubnetInner> inner = this.serviceClient().list(resourceGroupName, virtualNetworkName, context);
        return inner.mapPage(inner1 -> new SubnetImpl(inner1, this.manager()));
    }

    private SubnetsClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
