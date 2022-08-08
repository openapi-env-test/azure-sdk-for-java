// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.VirtualApplianceSkusClient;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkVirtualApplianceSkuInner;
import com.azure.resourcemanager.network.generated.models.NetworkVirtualApplianceSku;
import com.azure.resourcemanager.network.generated.models.VirtualApplianceSkus;

public final class VirtualApplianceSkusImpl implements VirtualApplianceSkus {
    private static final ClientLogger LOGGER = new ClientLogger(VirtualApplianceSkusImpl.class);

    private final VirtualApplianceSkusClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public VirtualApplianceSkusImpl(
        VirtualApplianceSkusClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<NetworkVirtualApplianceSku> list() {
        PagedIterable<NetworkVirtualApplianceSkuInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new NetworkVirtualApplianceSkuImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkVirtualApplianceSku> list(Context context) {
        PagedIterable<NetworkVirtualApplianceSkuInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new NetworkVirtualApplianceSkuImpl(inner1, this.manager()));
    }

    public NetworkVirtualApplianceSku get(String skuName) {
        NetworkVirtualApplianceSkuInner inner = this.serviceClient().get(skuName);
        if (inner != null) {
            return new NetworkVirtualApplianceSkuImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NetworkVirtualApplianceSku> getWithResponse(String skuName, Context context) {
        Response<NetworkVirtualApplianceSkuInner> inner = this.serviceClient().getWithResponse(skuName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkVirtualApplianceSkuImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private VirtualApplianceSkusClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
