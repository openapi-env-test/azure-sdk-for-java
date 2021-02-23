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
import com.azure.resourcemanager.network.generated.fluent.P2SVpnGatewaysClient;
import com.azure.resourcemanager.network.generated.fluent.models.P2SVpnConnectionHealthInner;
import com.azure.resourcemanager.network.generated.fluent.models.P2SVpnGatewayInner;
import com.azure.resourcemanager.network.generated.fluent.models.VpnProfileResponseInner;
import com.azure.resourcemanager.network.generated.models.P2SVpnConnectionHealth;
import com.azure.resourcemanager.network.generated.models.P2SVpnConnectionHealthRequest;
import com.azure.resourcemanager.network.generated.models.P2SVpnConnectionRequest;
import com.azure.resourcemanager.network.generated.models.P2SVpnGateway;
import com.azure.resourcemanager.network.generated.models.P2SVpnGateways;
import com.azure.resourcemanager.network.generated.models.P2SVpnProfileParameters;
import com.azure.resourcemanager.network.generated.models.VpnProfileResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class P2SVpnGatewaysImpl implements P2SVpnGateways {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(P2SVpnGatewaysImpl.class);

    private final P2SVpnGatewaysClient innerClient;

    private final NetworkManager serviceManager;

    public P2SVpnGatewaysImpl(P2SVpnGatewaysClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public P2SVpnGateway getByResourceGroup(String resourceGroupName, String gatewayName) {
        P2SVpnGatewayInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, gatewayName);
        if (inner != null) {
            return new P2SVpnGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<P2SVpnGateway> getByResourceGroupWithResponse(
        String resourceGroupName, String gatewayName, Context context) {
        Response<P2SVpnGatewayInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, gatewayName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new P2SVpnGatewayImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String gatewayName) {
        this.serviceClient().delete(resourceGroupName, gatewayName);
    }

    public void delete(String resourceGroupName, String gatewayName, Context context) {
        this.serviceClient().delete(resourceGroupName, gatewayName, context);
    }

    public PagedIterable<P2SVpnGateway> listByResourceGroup(String resourceGroupName) {
        PagedIterable<P2SVpnGatewayInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new P2SVpnGatewayImpl(inner1, this.manager()));
    }

    public PagedIterable<P2SVpnGateway> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<P2SVpnGatewayInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new P2SVpnGatewayImpl(inner1, this.manager()));
    }

    public PagedIterable<P2SVpnGateway> list() {
        PagedIterable<P2SVpnGatewayInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new P2SVpnGatewayImpl(inner1, this.manager()));
    }

    public PagedIterable<P2SVpnGateway> list(Context context) {
        PagedIterable<P2SVpnGatewayInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new P2SVpnGatewayImpl(inner1, this.manager()));
    }

    public VpnProfileResponse generateVpnProfile(
        String resourceGroupName, String gatewayName, P2SVpnProfileParameters parameters) {
        VpnProfileResponseInner inner =
            this.serviceClient().generateVpnProfile(resourceGroupName, gatewayName, parameters);
        if (inner != null) {
            return new VpnProfileResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VpnProfileResponse generateVpnProfile(
        String resourceGroupName, String gatewayName, P2SVpnProfileParameters parameters, Context context) {
        VpnProfileResponseInner inner =
            this.serviceClient().generateVpnProfile(resourceGroupName, gatewayName, parameters, context);
        if (inner != null) {
            return new VpnProfileResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public P2SVpnGateway getP2SVpnConnectionHealth(String resourceGroupName, String gatewayName) {
        P2SVpnGatewayInner inner = this.serviceClient().getP2SVpnConnectionHealth(resourceGroupName, gatewayName);
        if (inner != null) {
            return new P2SVpnGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public P2SVpnGateway getP2SVpnConnectionHealth(String resourceGroupName, String gatewayName, Context context) {
        P2SVpnGatewayInner inner =
            this.serviceClient().getP2SVpnConnectionHealth(resourceGroupName, gatewayName, context);
        if (inner != null) {
            return new P2SVpnGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public P2SVpnConnectionHealth getP2SVpnConnectionHealthDetailed(
        String resourceGroupName, String gatewayName, P2SVpnConnectionHealthRequest request) {
        P2SVpnConnectionHealthInner inner =
            this.serviceClient().getP2SVpnConnectionHealthDetailed(resourceGroupName, gatewayName, request);
        if (inner != null) {
            return new P2SVpnConnectionHealthImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public P2SVpnConnectionHealth getP2SVpnConnectionHealthDetailed(
        String resourceGroupName, String gatewayName, P2SVpnConnectionHealthRequest request, Context context) {
        P2SVpnConnectionHealthInner inner =
            this.serviceClient().getP2SVpnConnectionHealthDetailed(resourceGroupName, gatewayName, request, context);
        if (inner != null) {
            return new P2SVpnConnectionHealthImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void disconnectP2SVpnConnections(
        String resourceGroupName, String p2SVpnGatewayName, P2SVpnConnectionRequest request) {
        this.serviceClient().disconnectP2SVpnConnections(resourceGroupName, p2SVpnGatewayName, request);
    }

    public void disconnectP2SVpnConnections(
        String resourceGroupName, String p2SVpnGatewayName, P2SVpnConnectionRequest request, Context context) {
        this.serviceClient().disconnectP2SVpnConnections(resourceGroupName, p2SVpnGatewayName, request, context);
    }

    public P2SVpnGateway getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String gatewayName = Utils.getValueFromIdByName(id, "p2svpnGateways");
        if (gatewayName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'p2svpnGateways'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, gatewayName, Context.NONE).getValue();
    }

    public Response<P2SVpnGateway> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String gatewayName = Utils.getValueFromIdByName(id, "p2svpnGateways");
        if (gatewayName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'p2svpnGateways'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, gatewayName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String gatewayName = Utils.getValueFromIdByName(id, "p2svpnGateways");
        if (gatewayName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'p2svpnGateways'.", id)));
        }
        this.delete(resourceGroupName, gatewayName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String gatewayName = Utils.getValueFromIdByName(id, "p2svpnGateways");
        if (gatewayName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'p2svpnGateways'.", id)));
        }
        this.delete(resourceGroupName, gatewayName, context);
    }

    private P2SVpnGatewaysClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public P2SVpnGatewayImpl define(String name) {
        return new P2SVpnGatewayImpl(name, this.manager());
    }
}
