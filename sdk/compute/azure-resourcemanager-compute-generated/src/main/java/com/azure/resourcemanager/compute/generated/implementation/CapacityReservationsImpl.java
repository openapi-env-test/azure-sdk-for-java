// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.CapacityReservationsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.CapacityReservationInner;
import com.azure.resourcemanager.compute.generated.models.CapacityReservation;
import com.azure.resourcemanager.compute.generated.models.CapacityReservationInstanceViewTypes;
import com.azure.resourcemanager.compute.generated.models.CapacityReservations;

public final class CapacityReservationsImpl implements CapacityReservations {
    private static final ClientLogger LOGGER = new ClientLogger(CapacityReservationsImpl.class);

    private final CapacityReservationsClient innerClient;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    public CapacityReservationsImpl(
        CapacityReservationsClient innerClient,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String capacityReservationGroupName, String capacityReservationName) {
        this.serviceClient().delete(resourceGroupName, capacityReservationGroupName, capacityReservationName);
    }

    public void delete(
        String resourceGroupName,
        String capacityReservationGroupName,
        String capacityReservationName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, capacityReservationGroupName, capacityReservationName, context);
    }

    public CapacityReservation get(
        String resourceGroupName, String capacityReservationGroupName, String capacityReservationName) {
        CapacityReservationInner inner =
            this.serviceClient().get(resourceGroupName, capacityReservationGroupName, capacityReservationName);
        if (inner != null) {
            return new CapacityReservationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CapacityReservation> getWithResponse(
        String resourceGroupName,
        String capacityReservationGroupName,
        String capacityReservationName,
        CapacityReservationInstanceViewTypes expand,
        Context context) {
        Response<CapacityReservationInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceGroupName, capacityReservationGroupName, capacityReservationName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CapacityReservationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<CapacityReservation> listByCapacityReservationGroup(
        String resourceGroupName, String capacityReservationGroupName) {
        PagedIterable<CapacityReservationInner> inner =
            this.serviceClient().listByCapacityReservationGroup(resourceGroupName, capacityReservationGroupName);
        return Utils.mapPage(inner, inner1 -> new CapacityReservationImpl(inner1, this.manager()));
    }

    public PagedIterable<CapacityReservation> listByCapacityReservationGroup(
        String resourceGroupName, String capacityReservationGroupName, Context context) {
        PagedIterable<CapacityReservationInner> inner =
            this
                .serviceClient()
                .listByCapacityReservationGroup(resourceGroupName, capacityReservationGroupName, context);
        return Utils.mapPage(inner, inner1 -> new CapacityReservationImpl(inner1, this.manager()));
    }

    public CapacityReservation getById(String id) {
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
        String capacityReservationName = Utils.getValueFromIdByName(id, "capacityReservations");
        if (capacityReservationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'capacityReservations'.",
                                id)));
        }
        CapacityReservationInstanceViewTypes localExpand = null;
        return this
            .getWithResponse(
                resourceGroupName, capacityReservationGroupName, capacityReservationName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<CapacityReservation> getByIdWithResponse(
        String id, CapacityReservationInstanceViewTypes expand, Context context) {
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
        String capacityReservationName = Utils.getValueFromIdByName(id, "capacityReservations");
        if (capacityReservationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'capacityReservations'.",
                                id)));
        }
        return this
            .getWithResponse(resourceGroupName, capacityReservationGroupName, capacityReservationName, expand, context);
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
        String capacityReservationName = Utils.getValueFromIdByName(id, "capacityReservations");
        if (capacityReservationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'capacityReservations'.",
                                id)));
        }
        this.delete(resourceGroupName, capacityReservationGroupName, capacityReservationName, Context.NONE);
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
        String capacityReservationName = Utils.getValueFromIdByName(id, "capacityReservations");
        if (capacityReservationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'capacityReservations'.",
                                id)));
        }
        this.delete(resourceGroupName, capacityReservationGroupName, capacityReservationName, context);
    }

    private CapacityReservationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }

    public CapacityReservationImpl define(String name) {
        return new CapacityReservationImpl(name, this.manager());
    }
}
