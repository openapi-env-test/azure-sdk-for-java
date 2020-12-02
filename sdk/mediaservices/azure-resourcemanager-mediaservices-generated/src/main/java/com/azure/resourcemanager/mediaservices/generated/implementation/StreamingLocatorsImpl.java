// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.generated.MediaservicesManager;
import com.azure.resourcemanager.mediaservices.generated.fluent.StreamingLocatorsClient;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.ListContentKeysResponseInner;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.ListPathsResponseInner;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.StreamingLocatorInner;
import com.azure.resourcemanager.mediaservices.generated.models.ListContentKeysResponse;
import com.azure.resourcemanager.mediaservices.generated.models.ListPathsResponse;
import com.azure.resourcemanager.mediaservices.generated.models.StreamingLocator;
import com.azure.resourcemanager.mediaservices.generated.models.StreamingLocators;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class StreamingLocatorsImpl implements StreamingLocators {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StreamingLocatorsImpl.class);

    private final StreamingLocatorsClient innerClient;

    private final MediaservicesManager serviceManager;

    public StreamingLocatorsImpl(StreamingLocatorsClient innerClient, MediaservicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<StreamingLocator> list(String resourceGroupName, String accountName) {
        PagedIterable<StreamingLocatorInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return inner.mapPage(inner1 -> new StreamingLocatorImpl(inner1, this.manager()));
    }

    public PagedIterable<StreamingLocator> list(
        String resourceGroupName, String accountName, String filter, Integer top, String orderby, Context context) {
        PagedIterable<StreamingLocatorInner> inner =
            this.serviceClient().list(resourceGroupName, accountName, filter, top, orderby, context);
        return inner.mapPage(inner1 -> new StreamingLocatorImpl(inner1, this.manager()));
    }

    public StreamingLocator get(String resourceGroupName, String accountName, String streamingLocatorName) {
        StreamingLocatorInner inner = this.serviceClient().get(resourceGroupName, accountName, streamingLocatorName);
        if (inner != null) {
            return new StreamingLocatorImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<StreamingLocator> getWithResponse(
        String resourceGroupName, String accountName, String streamingLocatorName, Context context) {
        Response<StreamingLocatorInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, streamingLocatorName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new StreamingLocatorImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String streamingLocatorName) {
        this.serviceClient().delete(resourceGroupName, accountName, streamingLocatorName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String streamingLocatorName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, streamingLocatorName, context);
    }

    public ListContentKeysResponse listContentKeys(
        String resourceGroupName, String accountName, String streamingLocatorName) {
        ListContentKeysResponseInner inner =
            this.serviceClient().listContentKeys(resourceGroupName, accountName, streamingLocatorName);
        if (inner != null) {
            return new ListContentKeysResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ListContentKeysResponse> listContentKeysWithResponse(
        String resourceGroupName, String accountName, String streamingLocatorName, Context context) {
        Response<ListContentKeysResponseInner> inner =
            this
                .serviceClient()
                .listContentKeysWithResponse(resourceGroupName, accountName, streamingLocatorName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ListContentKeysResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ListPathsResponse listPaths(String resourceGroupName, String accountName, String streamingLocatorName) {
        ListPathsResponseInner inner =
            this.serviceClient().listPaths(resourceGroupName, accountName, streamingLocatorName);
        if (inner != null) {
            return new ListPathsResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ListPathsResponse> listPathsWithResponse(
        String resourceGroupName, String accountName, String streamingLocatorName, Context context) {
        Response<ListPathsResponseInner> inner =
            this.serviceClient().listPathsWithResponse(resourceGroupName, accountName, streamingLocatorName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ListPathsResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public StreamingLocator getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaServices");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaServices'.", id)));
        }
        String streamingLocatorName = Utils.getValueFromIdByName(id, "streamingLocators");
        if (streamingLocatorName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'streamingLocators'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, streamingLocatorName, Context.NONE).getValue();
    }

    public Response<StreamingLocator> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaServices");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaServices'.", id)));
        }
        String streamingLocatorName = Utils.getValueFromIdByName(id, "streamingLocators");
        if (streamingLocatorName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'streamingLocators'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, streamingLocatorName, context);
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
        String accountName = Utils.getValueFromIdByName(id, "mediaServices");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaServices'.", id)));
        }
        String streamingLocatorName = Utils.getValueFromIdByName(id, "streamingLocators");
        if (streamingLocatorName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'streamingLocators'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, accountName, streamingLocatorName, Context.NONE).getValue();
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
        String accountName = Utils.getValueFromIdByName(id, "mediaServices");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaServices'.", id)));
        }
        String streamingLocatorName = Utils.getValueFromIdByName(id, "streamingLocators");
        if (streamingLocatorName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'streamingLocators'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, streamingLocatorName, context);
    }

    private StreamingLocatorsClient serviceClient() {
        return this.innerClient;
    }

    private MediaservicesManager manager() {
        return this.serviceManager;
    }

    public StreamingLocatorImpl define(String name) {
        return new StreamingLocatorImpl(name, this.manager());
    }
}
