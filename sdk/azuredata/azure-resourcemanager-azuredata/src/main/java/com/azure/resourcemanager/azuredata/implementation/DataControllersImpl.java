// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azuredata.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azuredata.AzureDataManager;
import com.azure.resourcemanager.azuredata.fluent.DataControllersClient;
import com.azure.resourcemanager.azuredata.fluent.models.DataControllerResourceInner;
import com.azure.resourcemanager.azuredata.models.DataControllerResource;
import com.azure.resourcemanager.azuredata.models.DataControllers;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DataControllersImpl implements DataControllers {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataControllersImpl.class);

    private final DataControllersClient innerClient;

    private final AzureDataManager serviceManager;

    public DataControllersImpl(DataControllersClient innerClient, AzureDataManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DataControllerResource> list() {
        PagedIterable<DataControllerResourceInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new DataControllerResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<DataControllerResource> list(Context context) {
        PagedIterable<DataControllerResourceInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new DataControllerResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<DataControllerResource> listByResourceGroup(String resourceGroupName) {
        PagedIterable<DataControllerResourceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new DataControllerResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<DataControllerResource> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<DataControllerResourceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new DataControllerResourceImpl(inner1, this.manager()));
    }

    public void deleteByResourceGroup(String resourceGroupName, String dataControllerName) {
        this.serviceClient().delete(resourceGroupName, dataControllerName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String dataControllerName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, dataControllerName, context);
    }

    public DataControllerResource getByResourceGroup(String resourceGroupName, String dataControllerName) {
        DataControllerResourceInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, dataControllerName);
        if (inner != null) {
            return new DataControllerResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DataControllerResource> getByResourceGroupWithResponse(
        String resourceGroupName, String dataControllerName, Context context) {
        Response<DataControllerResourceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, dataControllerName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DataControllerResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DataControllerResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dataControllerName = Utils.getValueFromIdByName(id, "dataControllers");
        if (dataControllerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'dataControllers'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, dataControllerName, Context.NONE).getValue();
    }

    public Response<DataControllerResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dataControllerName = Utils.getValueFromIdByName(id, "dataControllers");
        if (dataControllerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'dataControllers'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, dataControllerName, context);
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
        String dataControllerName = Utils.getValueFromIdByName(id, "dataControllers");
        if (dataControllerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'dataControllers'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, dataControllerName, Context.NONE).getValue();
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
        String dataControllerName = Utils.getValueFromIdByName(id, "dataControllers");
        if (dataControllerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'dataControllers'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, dataControllerName, context);
    }

    private DataControllersClient serviceClient() {
        return this.innerClient;
    }

    private AzureDataManager manager() {
        return this.serviceManager;
    }

    public DataControllerResourceImpl define(String name) {
        return new DataControllerResourceImpl(name, this.manager());
    }
}
