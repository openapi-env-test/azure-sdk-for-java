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
import com.azure.resourcemanager.network.generated.fluent.VirtualNetworkGatewaysClient;
import com.azure.resourcemanager.network.generated.fluent.models.BgpPeerStatusListResultInner;
import com.azure.resourcemanager.network.generated.fluent.models.GatewayRouteListResultInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkGatewayConnectionListEntityInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkGatewayInner;
import com.azure.resourcemanager.network.generated.models.BgpPeerStatusListResult;
import com.azure.resourcemanager.network.generated.models.GatewayRouteListResult;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGateway;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnectionListEntity;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGateways;
import com.azure.resourcemanager.network.generated.models.VpnClientParameters;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class VirtualNetworkGatewaysImpl implements VirtualNetworkGateways {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualNetworkGatewaysImpl.class);

    private final VirtualNetworkGatewaysClient innerClient;

    private final NetworkManager serviceManager;

    public VirtualNetworkGatewaysImpl(VirtualNetworkGatewaysClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public VirtualNetworkGateway getByResourceGroup(String resourceGroupName, String virtualNetworkGatewayName) {
        VirtualNetworkGatewayInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, virtualNetworkGatewayName);
        if (inner != null) {
            return new VirtualNetworkGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualNetworkGateway> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualNetworkGatewayName, Context context) {
        Response<VirtualNetworkGatewayInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, virtualNetworkGatewayName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualNetworkGatewayImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String virtualNetworkGatewayName) {
        this.serviceClient().delete(resourceGroupName, virtualNetworkGatewayName);
    }

    public void delete(String resourceGroupName, String virtualNetworkGatewayName, Context context) {
        this.serviceClient().delete(resourceGroupName, virtualNetworkGatewayName, context);
    }

    public PagedIterable<VirtualNetworkGateway> listByResourceGroup(String resourceGroupName) {
        PagedIterable<VirtualNetworkGatewayInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new VirtualNetworkGatewayImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualNetworkGateway> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<VirtualNetworkGatewayInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new VirtualNetworkGatewayImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualNetworkGatewayConnectionListEntity> listConnections(
        String resourceGroupName, String virtualNetworkGatewayName) {
        PagedIterable<VirtualNetworkGatewayConnectionListEntityInner> inner =
            this.serviceClient().listConnections(resourceGroupName, virtualNetworkGatewayName);
        return inner.mapPage(inner1 -> new VirtualNetworkGatewayConnectionListEntityImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualNetworkGatewayConnectionListEntity> listConnections(
        String resourceGroupName, String virtualNetworkGatewayName, Context context) {
        PagedIterable<VirtualNetworkGatewayConnectionListEntityInner> inner =
            this.serviceClient().listConnections(resourceGroupName, virtualNetworkGatewayName, context);
        return inner.mapPage(inner1 -> new VirtualNetworkGatewayConnectionListEntityImpl(inner1, this.manager()));
    }

    public VirtualNetworkGateway reset(String resourceGroupName, String virtualNetworkGatewayName, String gatewayVip) {
        VirtualNetworkGatewayInner inner =
            this.serviceClient().reset(resourceGroupName, virtualNetworkGatewayName, gatewayVip);
        if (inner != null) {
            return new VirtualNetworkGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualNetworkGateway reset(String resourceGroupName, String virtualNetworkGatewayName) {
        VirtualNetworkGatewayInner inner = this.serviceClient().reset(resourceGroupName, virtualNetworkGatewayName);
        if (inner != null) {
            return new VirtualNetworkGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualNetworkGateway reset(
        String resourceGroupName, String virtualNetworkGatewayName, String gatewayVip, Context context) {
        VirtualNetworkGatewayInner inner =
            this.serviceClient().reset(resourceGroupName, virtualNetworkGatewayName, gatewayVip, context);
        if (inner != null) {
            return new VirtualNetworkGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public String generatevpnclientpackage(
        String resourceGroupName, String virtualNetworkGatewayName, VpnClientParameters parameters) {
        return this.serviceClient().generatevpnclientpackage(resourceGroupName, virtualNetworkGatewayName, parameters);
    }

    public String generatevpnclientpackage(
        String resourceGroupName, String virtualNetworkGatewayName, VpnClientParameters parameters, Context context) {
        return this
            .serviceClient()
            .generatevpnclientpackage(resourceGroupName, virtualNetworkGatewayName, parameters, context);
    }

    public String generateVpnProfile(
        String resourceGroupName, String virtualNetworkGatewayName, VpnClientParameters parameters) {
        return this.serviceClient().generateVpnProfile(resourceGroupName, virtualNetworkGatewayName, parameters);
    }

    public String generateVpnProfile(
        String resourceGroupName, String virtualNetworkGatewayName, VpnClientParameters parameters, Context context) {
        return this
            .serviceClient()
            .generateVpnProfile(resourceGroupName, virtualNetworkGatewayName, parameters, context);
    }

    public String getVpnProfilePackageUrl(String resourceGroupName, String virtualNetworkGatewayName) {
        return this.serviceClient().getVpnProfilePackageUrl(resourceGroupName, virtualNetworkGatewayName);
    }

    public String getVpnProfilePackageUrl(String resourceGroupName, String virtualNetworkGatewayName, Context context) {
        return this.serviceClient().getVpnProfilePackageUrl(resourceGroupName, virtualNetworkGatewayName, context);
    }

    public BgpPeerStatusListResult getBgpPeerStatus(
        String resourceGroupName, String virtualNetworkGatewayName, String peer) {
        BgpPeerStatusListResultInner inner =
            this.serviceClient().getBgpPeerStatus(resourceGroupName, virtualNetworkGatewayName, peer);
        if (inner != null) {
            return new BgpPeerStatusListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public BgpPeerStatusListResult getBgpPeerStatus(String resourceGroupName, String virtualNetworkGatewayName) {
        BgpPeerStatusListResultInner inner =
            this.serviceClient().getBgpPeerStatus(resourceGroupName, virtualNetworkGatewayName);
        if (inner != null) {
            return new BgpPeerStatusListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public BgpPeerStatusListResult getBgpPeerStatus(
        String resourceGroupName, String virtualNetworkGatewayName, String peer, Context context) {
        BgpPeerStatusListResultInner inner =
            this.serviceClient().getBgpPeerStatus(resourceGroupName, virtualNetworkGatewayName, peer, context);
        if (inner != null) {
            return new BgpPeerStatusListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public GatewayRouteListResult getLearnedRoutes(String resourceGroupName, String virtualNetworkGatewayName) {
        GatewayRouteListResultInner inner =
            this.serviceClient().getLearnedRoutes(resourceGroupName, virtualNetworkGatewayName);
        if (inner != null) {
            return new GatewayRouteListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public GatewayRouteListResult getLearnedRoutes(
        String resourceGroupName, String virtualNetworkGatewayName, Context context) {
        GatewayRouteListResultInner inner =
            this.serviceClient().getLearnedRoutes(resourceGroupName, virtualNetworkGatewayName, context);
        if (inner != null) {
            return new GatewayRouteListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public GatewayRouteListResult getAdvertisedRoutes(
        String resourceGroupName, String virtualNetworkGatewayName, String peer) {
        GatewayRouteListResultInner inner =
            this.serviceClient().getAdvertisedRoutes(resourceGroupName, virtualNetworkGatewayName, peer);
        if (inner != null) {
            return new GatewayRouteListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public GatewayRouteListResult getAdvertisedRoutes(
        String resourceGroupName, String virtualNetworkGatewayName, String peer, Context context) {
        GatewayRouteListResultInner inner =
            this.serviceClient().getAdvertisedRoutes(resourceGroupName, virtualNetworkGatewayName, peer, context);
        if (inner != null) {
            return new GatewayRouteListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualNetworkGateway getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualNetworkGatewayName = Utils.getValueFromIdByName(id, "virtualNetworkGateways");
        if (virtualNetworkGatewayName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualNetworkGateways'.",
                                id)));
        }
        return this
            .getByResourceGroupWithResponse(resourceGroupName, virtualNetworkGatewayName, Context.NONE)
            .getValue();
    }

    public Response<VirtualNetworkGateway> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualNetworkGatewayName = Utils.getValueFromIdByName(id, "virtualNetworkGateways");
        if (virtualNetworkGatewayName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualNetworkGateways'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, virtualNetworkGatewayName, context);
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
        String virtualNetworkGatewayName = Utils.getValueFromIdByName(id, "virtualNetworkGateways");
        if (virtualNetworkGatewayName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualNetworkGateways'.",
                                id)));
        }
        this.delete(resourceGroupName, virtualNetworkGatewayName, Context.NONE);
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
        String virtualNetworkGatewayName = Utils.getValueFromIdByName(id, "virtualNetworkGateways");
        if (virtualNetworkGatewayName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualNetworkGateways'.",
                                id)));
        }
        this.delete(resourceGroupName, virtualNetworkGatewayName, context);
    }

    private VirtualNetworkGatewaysClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public VirtualNetworkGatewayImpl define(String name) {
        return new VirtualNetworkGatewayImpl(name, this.manager());
    }
}
