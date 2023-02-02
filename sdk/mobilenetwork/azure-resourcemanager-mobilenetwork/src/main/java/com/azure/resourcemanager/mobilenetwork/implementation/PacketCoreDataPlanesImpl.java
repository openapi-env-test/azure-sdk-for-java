// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.fluent.PacketCoreDataPlanesClient;
import com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCoreDataPlaneInner;
import com.azure.resourcemanager.mobilenetwork.models.PacketCoreDataPlane;
import com.azure.resourcemanager.mobilenetwork.models.PacketCoreDataPlanes;

public final class PacketCoreDataPlanesImpl implements PacketCoreDataPlanes {
    private static final ClientLogger LOGGER = new ClientLogger(PacketCoreDataPlanesImpl.class);

    private final PacketCoreDataPlanesClient innerClient;

    private final com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager;

    public PacketCoreDataPlanesImpl(
        PacketCoreDataPlanesClient innerClient,
        com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String packetCoreControlPlaneName, String packetCoreDataPlaneName) {
        this.serviceClient().delete(resourceGroupName, packetCoreControlPlaneName, packetCoreDataPlaneName);
    }

    public void delete(
        String resourceGroupName, String packetCoreControlPlaneName, String packetCoreDataPlaneName, Context context) {
        this.serviceClient().delete(resourceGroupName, packetCoreControlPlaneName, packetCoreDataPlaneName, context);
    }

    public Response<PacketCoreDataPlane> getWithResponse(
        String resourceGroupName, String packetCoreControlPlaneName, String packetCoreDataPlaneName, Context context) {
        Response<PacketCoreDataPlaneInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, packetCoreControlPlaneName, packetCoreDataPlaneName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PacketCoreDataPlaneImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PacketCoreDataPlane get(
        String resourceGroupName, String packetCoreControlPlaneName, String packetCoreDataPlaneName) {
        PacketCoreDataPlaneInner inner =
            this.serviceClient().get(resourceGroupName, packetCoreControlPlaneName, packetCoreDataPlaneName);
        if (inner != null) {
            return new PacketCoreDataPlaneImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<PacketCoreDataPlane> listByPacketCoreControlPlane(
        String resourceGroupName, String packetCoreControlPlaneName) {
        PagedIterable<PacketCoreDataPlaneInner> inner =
            this.serviceClient().listByPacketCoreControlPlane(resourceGroupName, packetCoreControlPlaneName);
        return Utils.mapPage(inner, inner1 -> new PacketCoreDataPlaneImpl(inner1, this.manager()));
    }

    public PagedIterable<PacketCoreDataPlane> listByPacketCoreControlPlane(
        String resourceGroupName, String packetCoreControlPlaneName, Context context) {
        PagedIterable<PacketCoreDataPlaneInner> inner =
            this.serviceClient().listByPacketCoreControlPlane(resourceGroupName, packetCoreControlPlaneName, context);
        return Utils.mapPage(inner, inner1 -> new PacketCoreDataPlaneImpl(inner1, this.manager()));
    }

    public PacketCoreDataPlane getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String packetCoreControlPlaneName = Utils.getValueFromIdByName(id, "packetCoreControlPlanes");
        if (packetCoreControlPlaneName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'packetCoreControlPlanes'.",
                                id)));
        }
        String packetCoreDataPlaneName = Utils.getValueFromIdByName(id, "packetCoreDataPlanes");
        if (packetCoreDataPlaneName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'packetCoreDataPlanes'.",
                                id)));
        }
        return this
            .getWithResponse(resourceGroupName, packetCoreControlPlaneName, packetCoreDataPlaneName, Context.NONE)
            .getValue();
    }

    public Response<PacketCoreDataPlane> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String packetCoreControlPlaneName = Utils.getValueFromIdByName(id, "packetCoreControlPlanes");
        if (packetCoreControlPlaneName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'packetCoreControlPlanes'.",
                                id)));
        }
        String packetCoreDataPlaneName = Utils.getValueFromIdByName(id, "packetCoreDataPlanes");
        if (packetCoreDataPlaneName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'packetCoreDataPlanes'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, packetCoreControlPlaneName, packetCoreDataPlaneName, context);
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
        String packetCoreControlPlaneName = Utils.getValueFromIdByName(id, "packetCoreControlPlanes");
        if (packetCoreControlPlaneName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'packetCoreControlPlanes'.",
                                id)));
        }
        String packetCoreDataPlaneName = Utils.getValueFromIdByName(id, "packetCoreDataPlanes");
        if (packetCoreDataPlaneName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'packetCoreDataPlanes'.",
                                id)));
        }
        this.delete(resourceGroupName, packetCoreControlPlaneName, packetCoreDataPlaneName, Context.NONE);
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
        String packetCoreControlPlaneName = Utils.getValueFromIdByName(id, "packetCoreControlPlanes");
        if (packetCoreControlPlaneName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'packetCoreControlPlanes'.",
                                id)));
        }
        String packetCoreDataPlaneName = Utils.getValueFromIdByName(id, "packetCoreDataPlanes");
        if (packetCoreDataPlaneName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'packetCoreDataPlanes'.",
                                id)));
        }
        this.delete(resourceGroupName, packetCoreControlPlaneName, packetCoreDataPlaneName, context);
    }

    private PacketCoreDataPlanesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager() {
        return this.serviceManager;
    }

    public PacketCoreDataPlaneImpl define(String name) {
        return new PacketCoreDataPlaneImpl(name, this.manager());
    }
}
