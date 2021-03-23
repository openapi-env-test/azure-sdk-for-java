// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.engagementfabric.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.engagementfabric.fluent.ChannelsClient;
import com.azure.resourcemanager.engagementfabric.fluent.models.ChannelInner;
import com.azure.resourcemanager.engagementfabric.models.Channel;
import com.azure.resourcemanager.engagementfabric.models.Channels;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ChannelsImpl implements Channels {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ChannelsImpl.class);

    private final ChannelsClient innerClient;

    private final com.azure.resourcemanager.engagementfabric.EngagementFabricManager serviceManager;

    public ChannelsImpl(
        ChannelsClient innerClient, com.azure.resourcemanager.engagementfabric.EngagementFabricManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Channel get(String resourceGroupName, String accountName, String channelName) {
        ChannelInner inner = this.serviceClient().get(resourceGroupName, accountName, channelName);
        if (inner != null) {
            return new ChannelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Channel> getWithResponse(
        String resourceGroupName, String accountName, String channelName, Context context) {
        Response<ChannelInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, channelName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ChannelImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String channelName) {
        this.serviceClient().delete(resourceGroupName, accountName, channelName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String channelName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, channelName, context);
    }

    public PagedIterable<Channel> listByAccount(String resourceGroupName, String accountName) {
        PagedIterable<ChannelInner> inner = this.serviceClient().listByAccount(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new ChannelImpl(inner1, this.manager()));
    }

    public PagedIterable<Channel> listByAccount(String resourceGroupName, String accountName, Context context) {
        PagedIterable<ChannelInner> inner = this.serviceClient().listByAccount(resourceGroupName, accountName, context);
        return Utils.mapPage(inner, inner1 -> new ChannelImpl(inner1, this.manager()));
    }

    public Channel getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "Accounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'Accounts'.", id)));
        }
        String channelName = Utils.getValueFromIdByName(id, "Channels");
        if (channelName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'Channels'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, channelName, Context.NONE).getValue();
    }

    public Response<Channel> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "Accounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'Accounts'.", id)));
        }
        String channelName = Utils.getValueFromIdByName(id, "Channels");
        if (channelName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'Channels'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, channelName, context);
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
        String accountName = Utils.getValueFromIdByName(id, "Accounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'Accounts'.", id)));
        }
        String channelName = Utils.getValueFromIdByName(id, "Channels");
        if (channelName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'Channels'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, accountName, channelName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "Accounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'Accounts'.", id)));
        }
        String channelName = Utils.getValueFromIdByName(id, "Channels");
        if (channelName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'Channels'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, channelName, context);
    }

    private ChannelsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.engagementfabric.EngagementFabricManager manager() {
        return this.serviceManager;
    }

    public ChannelImpl define(String name) {
        return new ChannelImpl(name, this.manager());
    }
}
