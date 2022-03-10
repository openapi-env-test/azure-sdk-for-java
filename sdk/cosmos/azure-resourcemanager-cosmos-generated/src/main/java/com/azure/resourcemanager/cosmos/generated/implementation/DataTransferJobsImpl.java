// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.DataTransferJobsClient;
import com.azure.resourcemanager.cosmos.generated.fluent.models.DataTransferJobGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.models.DataTransferJobGetResults;
import com.azure.resourcemanager.cosmos.generated.models.DataTransferJobs;

public final class DataTransferJobsImpl implements DataTransferJobs {
    private static final ClientLogger LOGGER = new ClientLogger(DataTransferJobsImpl.class);

    private final DataTransferJobsClient innerClient;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    public DataTransferJobsImpl(
        DataTransferJobsClient innerClient, com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public DataTransferJobGetResults get(String resourceGroupName, String accountName, String jobName) {
        DataTransferJobGetResultsInner inner = this.serviceClient().get(resourceGroupName, accountName, jobName);
        if (inner != null) {
            return new DataTransferJobGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DataTransferJobGetResults> getWithResponse(
        String resourceGroupName, String accountName, String jobName, Context context) {
        Response<DataTransferJobGetResultsInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, jobName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DataTransferJobGetResultsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<DataTransferJobGetResults> listByDatabaseAccount(
        String resourceGroupName, String accountName) {
        PagedIterable<DataTransferJobGetResultsInner> inner =
            this.serviceClient().listByDatabaseAccount(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new DataTransferJobGetResultsImpl(inner1, this.manager()));
    }

    public PagedIterable<DataTransferJobGetResults> listByDatabaseAccount(
        String resourceGroupName, String accountName, Context context) {
        PagedIterable<DataTransferJobGetResultsInner> inner =
            this.serviceClient().listByDatabaseAccount(resourceGroupName, accountName, context);
        return Utils.mapPage(inner, inner1 -> new DataTransferJobGetResultsImpl(inner1, this.manager()));
    }

    public DataTransferJobGetResults getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "databaseAccounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'databaseAccounts'.", id)));
        }
        String jobName = Utils.getValueFromIdByName(id, "dataTransferJobs");
        if (jobName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataTransferJobs'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, jobName, Context.NONE).getValue();
    }

    public Response<DataTransferJobGetResults> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "databaseAccounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'databaseAccounts'.", id)));
        }
        String jobName = Utils.getValueFromIdByName(id, "dataTransferJobs");
        if (jobName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataTransferJobs'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, jobName, context);
    }

    private DataTransferJobsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }

    public DataTransferJobGetResultsImpl define(String name) {
        return new DataTransferJobGetResultsImpl(name, this.manager());
    }
}
