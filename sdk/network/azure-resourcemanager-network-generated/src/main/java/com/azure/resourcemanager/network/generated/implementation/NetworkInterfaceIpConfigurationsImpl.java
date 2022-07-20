// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.NetworkInterfaceIpConfigurationsClient;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceIpConfigurationInner;
import com.azure.resourcemanager.network.generated.models.NetworkInterfaceIpConfiguration;
import com.azure.resourcemanager.network.generated.models.NetworkInterfaceIpConfigurations;

public final class NetworkInterfaceIpConfigurationsImpl implements NetworkInterfaceIpConfigurations {
    private static final ClientLogger LOGGER = new ClientLogger(NetworkInterfaceIpConfigurationsImpl.class);

    private final NetworkInterfaceIpConfigurationsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public NetworkInterfaceIpConfigurationsImpl(
        NetworkInterfaceIpConfigurationsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<NetworkInterfaceIpConfiguration> list(String resourceGroupName, String networkInterfaceName) {
        PagedIterable<NetworkInterfaceIpConfigurationInner> inner =
            this.serviceClient().list(resourceGroupName, networkInterfaceName);
        return Utils.mapPage(inner, inner1 -> new NetworkInterfaceIpConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkInterfaceIpConfiguration> list(
        String resourceGroupName, String networkInterfaceName, Context context) {
        PagedIterable<NetworkInterfaceIpConfigurationInner> inner =
            this.serviceClient().list(resourceGroupName, networkInterfaceName, context);
        return Utils.mapPage(inner, inner1 -> new NetworkInterfaceIpConfigurationImpl(inner1, this.manager()));
    }

    public NetworkInterfaceIpConfiguration get(
        String resourceGroupName, String networkInterfaceName, String ipConfigurationName) {
        NetworkInterfaceIpConfigurationInner inner =
            this.serviceClient().get(resourceGroupName, networkInterfaceName, ipConfigurationName);
        if (inner != null) {
            return new NetworkInterfaceIpConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NetworkInterfaceIpConfiguration> getWithResponse(
        String resourceGroupName, String networkInterfaceName, String ipConfigurationName, Context context) {
        Response<NetworkInterfaceIpConfigurationInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, networkInterfaceName, ipConfigurationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkInterfaceIpConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private NetworkInterfaceIpConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
