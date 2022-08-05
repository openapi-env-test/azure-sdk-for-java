// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybriddatamanager.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybriddatamanager.fluent.DataStoresClient;
import com.azure.resourcemanager.hybriddatamanager.fluent.models.DataStoreInner;
import com.azure.resourcemanager.hybriddatamanager.models.DataStore;
import com.azure.resourcemanager.hybriddatamanager.models.DataStores;

public final class DataStoresImpl implements DataStores {
    private static final ClientLogger LOGGER = new ClientLogger(DataStoresImpl.class);

    private final DataStoresClient innerClient;

    private final com.azure.resourcemanager.hybriddatamanager.HybridDataManager serviceManager;

    public DataStoresImpl(
        DataStoresClient innerClient, com.azure.resourcemanager.hybriddatamanager.HybridDataManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DataStore> listByDataManager(String resourceGroupName, String dataManagerName) {
        PagedIterable<DataStoreInner> inner =
            this.serviceClient().listByDataManager(resourceGroupName, dataManagerName);
        return Utils.mapPage(inner, inner1 -> new DataStoreImpl(inner1, this.manager()));
    }

    public PagedIterable<DataStore> listByDataManager(
        String resourceGroupName, String dataManagerName, String filter, Context context) {
        PagedIterable<DataStoreInner> inner =
            this.serviceClient().listByDataManager(resourceGroupName, dataManagerName, filter, context);
        return Utils.mapPage(inner, inner1 -> new DataStoreImpl(inner1, this.manager()));
    }

    public DataStore get(String dataStoreName, String resourceGroupName, String dataManagerName) {
        DataStoreInner inner = this.serviceClient().get(dataStoreName, resourceGroupName, dataManagerName);
        if (inner != null) {
            return new DataStoreImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DataStore> getWithResponse(
        String dataStoreName, String resourceGroupName, String dataManagerName, Context context) {
        Response<DataStoreInner> inner =
            this.serviceClient().getWithResponse(dataStoreName, resourceGroupName, dataManagerName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DataStoreImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String dataStoreName, String resourceGroupName, String dataManagerName) {
        this.serviceClient().delete(dataStoreName, resourceGroupName, dataManagerName);
    }

    public void delete(String dataStoreName, String resourceGroupName, String dataManagerName, Context context) {
        this.serviceClient().delete(dataStoreName, resourceGroupName, dataManagerName, context);
    }

    public DataStore getById(String id) {
        String dataStoreName = Utils.getValueFromIdByName(id, "dataStores");
        if (dataStoreName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataStores'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dataManagerName = Utils.getValueFromIdByName(id, "dataManagers");
        if (dataManagerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataManagers'.", id)));
        }
        return this.getWithResponse(dataStoreName, resourceGroupName, dataManagerName, Context.NONE).getValue();
    }

    public Response<DataStore> getByIdWithResponse(String id, Context context) {
        String dataStoreName = Utils.getValueFromIdByName(id, "dataStores");
        if (dataStoreName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataStores'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dataManagerName = Utils.getValueFromIdByName(id, "dataManagers");
        if (dataManagerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataManagers'.", id)));
        }
        return this.getWithResponse(dataStoreName, resourceGroupName, dataManagerName, context);
    }

    public void deleteById(String id) {
        String dataStoreName = Utils.getValueFromIdByName(id, "dataStores");
        if (dataStoreName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataStores'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dataManagerName = Utils.getValueFromIdByName(id, "dataManagers");
        if (dataManagerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataManagers'.", id)));
        }
        this.delete(dataStoreName, resourceGroupName, dataManagerName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String dataStoreName = Utils.getValueFromIdByName(id, "dataStores");
        if (dataStoreName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataStores'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dataManagerName = Utils.getValueFromIdByName(id, "dataManagers");
        if (dataManagerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataManagers'.", id)));
        }
        this.delete(dataStoreName, resourceGroupName, dataManagerName, context);
    }

    private DataStoresClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager() {
        return this.serviceManager;
    }

    public DataStoreImpl define(String name) {
        return new DataStoreImpl(name, this.manager());
    }
}
