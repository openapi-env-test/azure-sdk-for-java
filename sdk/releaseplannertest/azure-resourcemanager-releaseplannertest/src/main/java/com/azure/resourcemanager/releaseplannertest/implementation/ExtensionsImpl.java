// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.releaseplannertest.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.releaseplannertest.fluent.ExtensionsClient;
import com.azure.resourcemanager.releaseplannertest.fluent.models.ExtensionInner;
import com.azure.resourcemanager.releaseplannertest.models.Extension;
import com.azure.resourcemanager.releaseplannertest.models.Extensions;
import java.util.List;

public final class ExtensionsImpl implements Extensions {
    private static final ClientLogger LOGGER = new ClientLogger(ExtensionsImpl.class);

    private final ExtensionsClient innerClient;

    private final com.azure.resourcemanager.releaseplannertest.AgriFoodManager serviceManager;

    public ExtensionsImpl(
        ExtensionsClient innerClient, com.azure.resourcemanager.releaseplannertest.AgriFoodManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Extension> getWithResponse(
        String resourceGroupName, String farmBeatsResourceName, String extensionId, Context context) {
        Response<ExtensionInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, farmBeatsResourceName, extensionId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExtensionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Extension get(String resourceGroupName, String farmBeatsResourceName, String extensionId) {
        ExtensionInner inner = this.serviceClient().get(resourceGroupName, farmBeatsResourceName, extensionId);
        if (inner != null) {
            return new ExtensionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String farmBeatsResourceName, String extensionId, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, farmBeatsResourceName, extensionId, context);
    }

    public void delete(String resourceGroupName, String farmBeatsResourceName, String extensionId) {
        this.serviceClient().delete(resourceGroupName, farmBeatsResourceName, extensionId);
    }

    public PagedIterable<Extension> listByFarmBeats(String resourceGroupName, String farmBeatsResourceName) {
        PagedIterable<ExtensionInner> inner =
            this.serviceClient().listByFarmBeats(resourceGroupName, farmBeatsResourceName);
        return Utils.mapPage(inner, inner1 -> new ExtensionImpl(inner1, this.manager()));
    }

    public PagedIterable<Extension> listByFarmBeats(
        String resourceGroupName,
        String farmBeatsResourceName,
        List<String> extensionIds,
        List<String> extensionCategories,
        Integer maxPageSize,
        String skipToken,
        Context context) {
        PagedIterable<ExtensionInner> inner =
            this
                .serviceClient()
                .listByFarmBeats(
                    resourceGroupName,
                    farmBeatsResourceName,
                    extensionIds,
                    extensionCategories,
                    maxPageSize,
                    skipToken,
                    context);
        return Utils.mapPage(inner, inner1 -> new ExtensionImpl(inner1, this.manager()));
    }

    public Extension getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String farmBeatsResourceName = Utils.getValueFromIdByName(id, "farmBeats");
        if (farmBeatsResourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'farmBeats'.", id)));
        }
        String extensionId = Utils.getValueFromIdByName(id, "extensions");
        if (extensionId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'extensions'.", id)));
        }
        return this.getWithResponse(resourceGroupName, farmBeatsResourceName, extensionId, Context.NONE).getValue();
    }

    public Response<Extension> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String farmBeatsResourceName = Utils.getValueFromIdByName(id, "farmBeats");
        if (farmBeatsResourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'farmBeats'.", id)));
        }
        String extensionId = Utils.getValueFromIdByName(id, "extensions");
        if (extensionId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'extensions'.", id)));
        }
        return this.getWithResponse(resourceGroupName, farmBeatsResourceName, extensionId, context);
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
        String farmBeatsResourceName = Utils.getValueFromIdByName(id, "farmBeats");
        if (farmBeatsResourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'farmBeats'.", id)));
        }
        String extensionId = Utils.getValueFromIdByName(id, "extensions");
        if (extensionId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'extensions'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, farmBeatsResourceName, extensionId, Context.NONE);
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
        String farmBeatsResourceName = Utils.getValueFromIdByName(id, "farmBeats");
        if (farmBeatsResourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'farmBeats'.", id)));
        }
        String extensionId = Utils.getValueFromIdByName(id, "extensions");
        if (extensionId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'extensions'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, farmBeatsResourceName, extensionId, context);
    }

    private ExtensionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.releaseplannertest.AgriFoodManager manager() {
        return this.serviceManager;
    }

    public ExtensionImpl define(String name) {
        return new ExtensionImpl(name, this.manager());
    }
}
