// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.RoutingIntentsClient;
import com.azure.resourcemanager.network.generated.fluent.models.RoutingIntentInner;
import com.azure.resourcemanager.network.generated.models.RoutingIntent;
import com.azure.resourcemanager.network.generated.models.RoutingIntents;

public final class RoutingIntentsImpl implements RoutingIntents {
    private static final ClientLogger LOGGER = new ClientLogger(RoutingIntentsImpl.class);

    private final RoutingIntentsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public RoutingIntentsImpl(
        RoutingIntentsClient innerClient, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public RoutingIntent get(String resourceGroupName, String virtualHubName, String routingIntentName) {
        RoutingIntentInner inner = this.serviceClient().get(resourceGroupName, virtualHubName, routingIntentName);
        if (inner != null) {
            return new RoutingIntentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RoutingIntent> getWithResponse(
        String resourceGroupName, String virtualHubName, String routingIntentName, Context context) {
        Response<RoutingIntentInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, virtualHubName, routingIntentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RoutingIntentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String virtualHubName, String routingIntentName) {
        this.serviceClient().delete(resourceGroupName, virtualHubName, routingIntentName);
    }

    public void delete(String resourceGroupName, String virtualHubName, String routingIntentName, Context context) {
        this.serviceClient().delete(resourceGroupName, virtualHubName, routingIntentName, context);
    }

    public PagedIterable<RoutingIntent> list(String resourceGroupName, String virtualHubName) {
        PagedIterable<RoutingIntentInner> inner = this.serviceClient().list(resourceGroupName, virtualHubName);
        return Utils.mapPage(inner, inner1 -> new RoutingIntentImpl(inner1, this.manager()));
    }

    public PagedIterable<RoutingIntent> list(String resourceGroupName, String virtualHubName, Context context) {
        PagedIterable<RoutingIntentInner> inner = this.serviceClient().list(resourceGroupName, virtualHubName, context);
        return Utils.mapPage(inner, inner1 -> new RoutingIntentImpl(inner1, this.manager()));
    }

    public RoutingIntent getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualHubName = Utils.getValueFromIdByName(id, "virtualHubs");
        if (virtualHubName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'virtualHubs'.", id)));
        }
        String routingIntentName = Utils.getValueFromIdByName(id, "routingIntent");
        if (routingIntentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'routingIntent'.", id)));
        }
        return this.getWithResponse(resourceGroupName, virtualHubName, routingIntentName, Context.NONE).getValue();
    }

    public Response<RoutingIntent> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualHubName = Utils.getValueFromIdByName(id, "virtualHubs");
        if (virtualHubName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'virtualHubs'.", id)));
        }
        String routingIntentName = Utils.getValueFromIdByName(id, "routingIntent");
        if (routingIntentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'routingIntent'.", id)));
        }
        return this.getWithResponse(resourceGroupName, virtualHubName, routingIntentName, context);
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
        String virtualHubName = Utils.getValueFromIdByName(id, "virtualHubs");
        if (virtualHubName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'virtualHubs'.", id)));
        }
        String routingIntentName = Utils.getValueFromIdByName(id, "routingIntent");
        if (routingIntentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'routingIntent'.", id)));
        }
        this.delete(resourceGroupName, virtualHubName, routingIntentName, Context.NONE);
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
        String virtualHubName = Utils.getValueFromIdByName(id, "virtualHubs");
        if (virtualHubName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'virtualHubs'.", id)));
        }
        String routingIntentName = Utils.getValueFromIdByName(id, "routingIntent");
        if (routingIntentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'routingIntent'.", id)));
        }
        this.delete(resourceGroupName, virtualHubName, routingIntentName, context);
    }

    private RoutingIntentsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public RoutingIntentImpl define(String name) {
        return new RoutingIntentImpl(name, this.manager());
    }
}
