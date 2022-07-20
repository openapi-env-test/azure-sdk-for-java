// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.CapacityReservationGroupsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.CapacityReservationGroupInner;
import com.azure.resourcemanager.compute.generated.models.CapacityReservationGroup;
import com.azure.resourcemanager.compute.generated.models.CapacityReservationGroupInstanceViewTypes;
import com.azure.resourcemanager.compute.generated.models.CapacityReservationGroups;
import com.azure.resourcemanager.compute.generated.models.ExpandTypesForGetCapacityReservationGroups;

public final class CapacityReservationGroupsImpl implements CapacityReservationGroups {
    private static final ClientLogger LOGGER = new ClientLogger(CapacityReservationGroupsImpl.class);

    private final CapacityReservationGroupsClient innerClient;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    public CapacityReservationGroupsImpl(
        CapacityReservationGroupsClient innerClient,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String capacityReservationGroupName) {
        this.serviceClient().delete(resourceGroupName, capacityReservationGroupName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String capacityReservationGroupName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, capacityReservationGroupName, context);
    }

    public CapacityReservationGroup getByResourceGroup(String resourceGroupName, String capacityReservationGroupName) {
        CapacityReservationGroupInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, capacityReservationGroupName);
        if (inner != null) {
            return new CapacityReservationGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CapacityReservationGroup> getByResourceGroupWithResponse(
        String resourceGroupName,
        String capacityReservationGroupName,
        CapacityReservationGroupInstanceViewTypes expand,
        Context context) {
        Response<CapacityReservationGroupInner> inner =
            this
                .serviceClient()
                .getByResourceGroupWithResponse(resourceGroupName, capacityReservationGroupName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CapacityReservationGroupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<CapacityReservationGroup> listByResourceGroup(String resourceGroupName) {
        PagedIterable<CapacityReservationGroupInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new CapacityReservationGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<CapacityReservationGroup> listByResourceGroup(
        String resourceGroupName, ExpandTypesForGetCapacityReservationGroups expand, Context context) {
        PagedIterable<CapacityReservationGroupInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, expand, context);
        return Utils.mapPage(inner, inner1 -> new CapacityReservationGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<CapacityReservationGroup> list() {
        PagedIterable<CapacityReservationGroupInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new CapacityReservationGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<CapacityReservationGroup> list(
        ExpandTypesForGetCapacityReservationGroups expand, Context context) {
        PagedIterable<CapacityReservationGroupInner> inner = this.serviceClient().list(expand, context);
        return Utils.mapPage(inner, inner1 -> new CapacityReservationGroupImpl(inner1, this.manager()));
    }

    public CapacityReservationGroup getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String capacityReservationGroupName = Utils.getValueFromIdByName(id, "capacityReservationGroups");
        if (capacityReservationGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'capacityReservationGroups'.",
                                id)));
        }
        CapacityReservationGroupInstanceViewTypes localExpand = null;
        return this
            .getByResourceGroupWithResponse(resourceGroupName, capacityReservationGroupName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<CapacityReservationGroup> getByIdWithResponse(
        String id, CapacityReservationGroupInstanceViewTypes expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String capacityReservationGroupName = Utils.getValueFromIdByName(id, "capacityReservationGroups");
        if (capacityReservationGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'capacityReservationGroups'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, capacityReservationGroupName, expand, context);
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
        String capacityReservationGroupName = Utils.getValueFromIdByName(id, "capacityReservationGroups");
        if (capacityReservationGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'capacityReservationGroups'.",
                                id)));
        }
        this.deleteWithResponse(resourceGroupName, capacityReservationGroupName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String capacityReservationGroupName = Utils.getValueFromIdByName(id, "capacityReservationGroups");
        if (capacityReservationGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'capacityReservationGroups'.",
                                id)));
        }
        return this.deleteWithResponse(resourceGroupName, capacityReservationGroupName, context);
    }

    private CapacityReservationGroupsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }

    public CapacityReservationGroupImpl define(String name) {
        return new CapacityReservationGroupImpl(name, this.manager());
    }
}
