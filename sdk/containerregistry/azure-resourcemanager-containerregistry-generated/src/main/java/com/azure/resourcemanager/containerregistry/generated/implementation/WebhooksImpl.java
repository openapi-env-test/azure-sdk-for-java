// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerregistry.generated.fluent.WebhooksClient;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.CallbackConfigInner;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.EventInfoInner;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.EventInner;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.WebhookInner;
import com.azure.resourcemanager.containerregistry.generated.models.CallbackConfig;
import com.azure.resourcemanager.containerregistry.generated.models.Event;
import com.azure.resourcemanager.containerregistry.generated.models.EventInfo;
import com.azure.resourcemanager.containerregistry.generated.models.Webhook;
import com.azure.resourcemanager.containerregistry.generated.models.Webhooks;

public final class WebhooksImpl implements Webhooks {
    private static final ClientLogger LOGGER = new ClientLogger(WebhooksImpl.class);

    private final WebhooksClient innerClient;

    private final com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager serviceManager;

    public WebhooksImpl(
        WebhooksClient innerClient,
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Webhook> list(String resourceGroupName, String registryName) {
        PagedIterable<WebhookInner> inner = this.serviceClient().list(resourceGroupName, registryName);
        return Utils.mapPage(inner, inner1 -> new WebhookImpl(inner1, this.manager()));
    }

    public PagedIterable<Webhook> list(String resourceGroupName, String registryName, Context context) {
        PagedIterable<WebhookInner> inner = this.serviceClient().list(resourceGroupName, registryName, context);
        return Utils.mapPage(inner, inner1 -> new WebhookImpl(inner1, this.manager()));
    }

    public Response<Webhook> getWithResponse(
        String resourceGroupName, String registryName, String webhookName, Context context) {
        Response<WebhookInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, registryName, webhookName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WebhookImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Webhook get(String resourceGroupName, String registryName, String webhookName) {
        WebhookInner inner = this.serviceClient().get(resourceGroupName, registryName, webhookName);
        if (inner != null) {
            return new WebhookImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String registryName, String webhookName) {
        this.serviceClient().delete(resourceGroupName, registryName, webhookName);
    }

    public void delete(String resourceGroupName, String registryName, String webhookName, Context context) {
        this.serviceClient().delete(resourceGroupName, registryName, webhookName, context);
    }

    public Response<EventInfo> pingWithResponse(
        String resourceGroupName, String registryName, String webhookName, Context context) {
        Response<EventInfoInner> inner =
            this.serviceClient().pingWithResponse(resourceGroupName, registryName, webhookName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EventInfoImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public EventInfo ping(String resourceGroupName, String registryName, String webhookName) {
        EventInfoInner inner = this.serviceClient().ping(resourceGroupName, registryName, webhookName);
        if (inner != null) {
            return new EventInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<Event> listEvents(String resourceGroupName, String registryName, String webhookName) {
        PagedIterable<EventInner> inner = this.serviceClient().listEvents(resourceGroupName, registryName, webhookName);
        return Utils.mapPage(inner, inner1 -> new EventImpl(inner1, this.manager()));
    }

    public PagedIterable<Event> listEvents(
        String resourceGroupName, String registryName, String webhookName, Context context) {
        PagedIterable<EventInner> inner =
            this.serviceClient().listEvents(resourceGroupName, registryName, webhookName, context);
        return Utils.mapPage(inner, inner1 -> new EventImpl(inner1, this.manager()));
    }

    public Response<CallbackConfig> getCallbackConfigWithResponse(
        String resourceGroupName, String registryName, String webhookName, Context context) {
        Response<CallbackConfigInner> inner =
            this.serviceClient().getCallbackConfigWithResponse(resourceGroupName, registryName, webhookName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CallbackConfigImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CallbackConfig getCallbackConfig(String resourceGroupName, String registryName, String webhookName) {
        CallbackConfigInner inner =
            this.serviceClient().getCallbackConfig(resourceGroupName, registryName, webhookName);
        if (inner != null) {
            return new CallbackConfigImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Webhook getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String registryName = Utils.getValueFromIdByName(id, "registries");
        if (registryName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registries'.", id)));
        }
        String webhookName = Utils.getValueFromIdByName(id, "webhooks");
        if (webhookName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'webhooks'.", id)));
        }
        return this.getWithResponse(resourceGroupName, registryName, webhookName, Context.NONE).getValue();
    }

    public Response<Webhook> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String registryName = Utils.getValueFromIdByName(id, "registries");
        if (registryName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registries'.", id)));
        }
        String webhookName = Utils.getValueFromIdByName(id, "webhooks");
        if (webhookName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'webhooks'.", id)));
        }
        return this.getWithResponse(resourceGroupName, registryName, webhookName, context);
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
        String registryName = Utils.getValueFromIdByName(id, "registries");
        if (registryName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registries'.", id)));
        }
        String webhookName = Utils.getValueFromIdByName(id, "webhooks");
        if (webhookName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'webhooks'.", id)));
        }
        this.delete(resourceGroupName, registryName, webhookName, Context.NONE);
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
        String registryName = Utils.getValueFromIdByName(id, "registries");
        if (registryName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registries'.", id)));
        }
        String webhookName = Utils.getValueFromIdByName(id, "webhooks");
        if (webhookName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'webhooks'.", id)));
        }
        this.delete(resourceGroupName, registryName, webhookName, context);
    }

    private WebhooksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager() {
        return this.serviceManager;
    }

    public WebhookImpl define(String name) {
        return new WebhookImpl(name, this.manager());
    }
}
