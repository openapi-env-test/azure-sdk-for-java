// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.adp.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.adp.AdpManager;
import com.azure.resourcemanager.adp.fluent.DataPoolsClient;
import com.azure.resourcemanager.adp.fluent.models.DataPoolInner;
import com.azure.resourcemanager.adp.models.DataPool;
import com.azure.resourcemanager.adp.models.DataPools;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DataPoolsImpl implements DataPools {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataPoolsImpl.class);

    private final DataPoolsClient innerClient;

    private final AdpManager serviceManager;

    public DataPoolsImpl(DataPoolsClient innerClient, AdpManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DataPool> list(String resourceGroupName, String accountName) {
        PagedIterable<DataPoolInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return inner.mapPage(inner1 -> new DataPoolImpl(inner1, this.manager()));
    }

    public PagedIterable<DataPool> list(String resourceGroupName, String accountName, Context context) {
        PagedIterable<DataPoolInner> inner = this.serviceClient().list(resourceGroupName, accountName, context);
        return inner.mapPage(inner1 -> new DataPoolImpl(inner1, this.manager()));
    }

    public DataPool get(String resourceGroupName, String accountName, String dataPoolName) {
        DataPoolInner inner = this.serviceClient().get(resourceGroupName, accountName, dataPoolName);
        if (inner != null) {
            return new DataPoolImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DataPool> getWithResponse(
        String resourceGroupName, String accountName, String dataPoolName, Context context) {
        Response<DataPoolInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, dataPoolName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DataPoolImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String dataPoolName) {
        this.serviceClient().delete(resourceGroupName, accountName, dataPoolName);
    }

    public void delete(String resourceGroupName, String accountName, String dataPoolName, Context context) {
        this.serviceClient().delete(resourceGroupName, accountName, dataPoolName, context);
    }

    public DataPool getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        String dataPoolName = Utils.getValueFromIdByName(id, "dataPools");
        if (dataPoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataPools'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, dataPoolName, Context.NONE).getValue();
    }

    public Response<DataPool> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        String dataPoolName = Utils.getValueFromIdByName(id, "dataPools");
        if (dataPoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataPools'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, dataPoolName, context);
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
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        String dataPoolName = Utils.getValueFromIdByName(id, "dataPools");
        if (dataPoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataPools'.", id)));
        }
        this.delete(resourceGroupName, accountName, dataPoolName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        String dataPoolName = Utils.getValueFromIdByName(id, "dataPools");
        if (dataPoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataPools'.", id)));
        }
        this.delete(resourceGroupName, accountName, dataPoolName, context);
    }

    private DataPoolsClient serviceClient() {
        return this.innerClient;
    }

    private AdpManager manager() {
        return this.serviceManager;
    }

    public DataPoolImpl define(String name) {
        return new DataPoolImpl(name, this.manager());
    }
}
