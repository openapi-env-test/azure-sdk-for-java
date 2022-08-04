// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.VirtualNetworkGatewayConnectionsClient;
import com.azure.resourcemanager.network.generated.fluent.models.ConnectionResetSharedKeyInner;
import com.azure.resourcemanager.network.generated.fluent.models.ConnectionSharedKeyInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkGatewayConnectionInner;
import com.azure.resourcemanager.network.generated.models.ConnectionResetSharedKey;
import com.azure.resourcemanager.network.generated.models.ConnectionSharedKey;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnection;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnections;
import com.azure.resourcemanager.network.generated.models.VpnPacketCaptureStartParameters;
import com.azure.resourcemanager.network.generated.models.VpnPacketCaptureStopParameters;

public final class VirtualNetworkGatewayConnectionsImpl implements VirtualNetworkGatewayConnections {
    private static final ClientLogger LOGGER = new ClientLogger(VirtualNetworkGatewayConnectionsImpl.class);

    private final VirtualNetworkGatewayConnectionsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public VirtualNetworkGatewayConnectionsImpl(
        VirtualNetworkGatewayConnectionsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public VirtualNetworkGatewayConnection getByResourceGroup(
        String resourceGroupName, String virtualNetworkGatewayConnectionName) {
        VirtualNetworkGatewayConnectionInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, virtualNetworkGatewayConnectionName);
        if (inner != null) {
            return new VirtualNetworkGatewayConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualNetworkGatewayConnection> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualNetworkGatewayConnectionName, Context context) {
        Response<VirtualNetworkGatewayConnectionInner> inner =
            this
                .serviceClient()
                .getByResourceGroupWithResponse(resourceGroupName, virtualNetworkGatewayConnectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualNetworkGatewayConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String virtualNetworkGatewayConnectionName) {
        this.serviceClient().delete(resourceGroupName, virtualNetworkGatewayConnectionName);
    }

    public void delete(String resourceGroupName, String virtualNetworkGatewayConnectionName, Context context) {
        this.serviceClient().delete(resourceGroupName, virtualNetworkGatewayConnectionName, context);
    }

    public ConnectionSharedKey setSharedKey(
        String resourceGroupName, String virtualNetworkGatewayConnectionName, ConnectionSharedKeyInner parameters) {
        ConnectionSharedKeyInner inner =
            this.serviceClient().setSharedKey(resourceGroupName, virtualNetworkGatewayConnectionName, parameters);
        if (inner != null) {
            return new ConnectionSharedKeyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ConnectionSharedKey setSharedKey(
        String resourceGroupName,
        String virtualNetworkGatewayConnectionName,
        ConnectionSharedKeyInner parameters,
        Context context) {
        ConnectionSharedKeyInner inner =
            this
                .serviceClient()
                .setSharedKey(resourceGroupName, virtualNetworkGatewayConnectionName, parameters, context);
        if (inner != null) {
            return new ConnectionSharedKeyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ConnectionSharedKey getSharedKey(String resourceGroupName, String virtualNetworkGatewayConnectionName) {
        ConnectionSharedKeyInner inner =
            this.serviceClient().getSharedKey(resourceGroupName, virtualNetworkGatewayConnectionName);
        if (inner != null) {
            return new ConnectionSharedKeyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ConnectionSharedKey> getSharedKeyWithResponse(
        String resourceGroupName, String virtualNetworkGatewayConnectionName, Context context) {
        Response<ConnectionSharedKeyInner> inner =
            this
                .serviceClient()
                .getSharedKeyWithResponse(resourceGroupName, virtualNetworkGatewayConnectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ConnectionSharedKeyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<VirtualNetworkGatewayConnection> listByResourceGroup(String resourceGroupName) {
        PagedIterable<VirtualNetworkGatewayConnectionInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new VirtualNetworkGatewayConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualNetworkGatewayConnection> listByResourceGroup(
        String resourceGroupName, Context context) {
        PagedIterable<VirtualNetworkGatewayConnectionInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new VirtualNetworkGatewayConnectionImpl(inner1, this.manager()));
    }

    public ConnectionResetSharedKey resetSharedKey(
        String resourceGroupName,
        String virtualNetworkGatewayConnectionName,
        ConnectionResetSharedKeyInner parameters) {
        ConnectionResetSharedKeyInner inner =
            this.serviceClient().resetSharedKey(resourceGroupName, virtualNetworkGatewayConnectionName, parameters);
        if (inner != null) {
            return new ConnectionResetSharedKeyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ConnectionResetSharedKey resetSharedKey(
        String resourceGroupName,
        String virtualNetworkGatewayConnectionName,
        ConnectionResetSharedKeyInner parameters,
        Context context) {
        ConnectionResetSharedKeyInner inner =
            this
                .serviceClient()
                .resetSharedKey(resourceGroupName, virtualNetworkGatewayConnectionName, parameters, context);
        if (inner != null) {
            return new ConnectionResetSharedKeyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public String startPacketCapture(
        String resourceGroupName,
        String virtualNetworkGatewayConnectionName,
        VpnPacketCaptureStartParameters parameters) {
        return this
            .serviceClient()
            .startPacketCapture(resourceGroupName, virtualNetworkGatewayConnectionName, parameters);
    }

    public String startPacketCapture(String resourceGroupName, String virtualNetworkGatewayConnectionName) {
        return this.serviceClient().startPacketCapture(resourceGroupName, virtualNetworkGatewayConnectionName);
    }

    public String startPacketCapture(
        String resourceGroupName,
        String virtualNetworkGatewayConnectionName,
        VpnPacketCaptureStartParameters parameters,
        Context context) {
        return this
            .serviceClient()
            .startPacketCapture(resourceGroupName, virtualNetworkGatewayConnectionName, parameters, context);
    }

    public String stopPacketCapture(
        String resourceGroupName,
        String virtualNetworkGatewayConnectionName,
        VpnPacketCaptureStopParameters parameters) {
        return this
            .serviceClient()
            .stopPacketCapture(resourceGroupName, virtualNetworkGatewayConnectionName, parameters);
    }

    public String stopPacketCapture(
        String resourceGroupName,
        String virtualNetworkGatewayConnectionName,
        VpnPacketCaptureStopParameters parameters,
        Context context) {
        return this
            .serviceClient()
            .stopPacketCapture(resourceGroupName, virtualNetworkGatewayConnectionName, parameters, context);
    }

    public String getIkeSas(String resourceGroupName, String virtualNetworkGatewayConnectionName) {
        return this.serviceClient().getIkeSas(resourceGroupName, virtualNetworkGatewayConnectionName);
    }

    public String getIkeSas(String resourceGroupName, String virtualNetworkGatewayConnectionName, Context context) {
        return this.serviceClient().getIkeSas(resourceGroupName, virtualNetworkGatewayConnectionName, context);
    }

    public void resetConnection(String resourceGroupName, String virtualNetworkGatewayConnectionName) {
        this.serviceClient().resetConnection(resourceGroupName, virtualNetworkGatewayConnectionName);
    }

    public void resetConnection(String resourceGroupName, String virtualNetworkGatewayConnectionName, Context context) {
        this.serviceClient().resetConnection(resourceGroupName, virtualNetworkGatewayConnectionName, context);
    }

    public VirtualNetworkGatewayConnection getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualNetworkGatewayConnectionName = Utils.getValueFromIdByName(id, "connections");
        if (virtualNetworkGatewayConnectionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'connections'.", id)));
        }
        return this
            .getByResourceGroupWithResponse(resourceGroupName, virtualNetworkGatewayConnectionName, Context.NONE)
            .getValue();
    }

    public Response<VirtualNetworkGatewayConnection> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualNetworkGatewayConnectionName = Utils.getValueFromIdByName(id, "connections");
        if (virtualNetworkGatewayConnectionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'connections'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, virtualNetworkGatewayConnectionName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualNetworkGatewayConnectionName = Utils.getValueFromIdByName(id, "connections");
        if (virtualNetworkGatewayConnectionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'connections'.", id)));
        }
        this.delete(resourceGroupName, virtualNetworkGatewayConnectionName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualNetworkGatewayConnectionName = Utils.getValueFromIdByName(id, "connections");
        if (virtualNetworkGatewayConnectionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'connections'.", id)));
        }
        this.delete(resourceGroupName, virtualNetworkGatewayConnectionName, context);
    }

    private VirtualNetworkGatewayConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public VirtualNetworkGatewayConnectionImpl define(String name) {
        return new VirtualNetworkGatewayConnectionImpl(name, this.manager());
    }
}
