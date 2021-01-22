// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.batch.BatchManager;
import com.azure.resourcemanager.batch.fluent.ApplicationsClient;
import com.azure.resourcemanager.batch.fluent.models.ApplicationInner;
import com.azure.resourcemanager.batch.models.Application;
import com.azure.resourcemanager.batch.models.Applications;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ApplicationsImpl implements Applications {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationsImpl.class);

    private final ApplicationsClient innerClient;

    private final BatchManager serviceManager;

    public ApplicationsImpl(ApplicationsClient innerClient, BatchManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String accountName, String applicationName) {
        this.serviceClient().delete(resourceGroupName, accountName, applicationName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String applicationName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, applicationName, context);
    }

    public Application get(String resourceGroupName, String accountName, String applicationName) {
        ApplicationInner inner = this.serviceClient().get(resourceGroupName, accountName, applicationName);
        if (inner != null) {
            return new ApplicationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Application> getWithResponse(
        String resourceGroupName, String accountName, String applicationName, Context context) {
        Response<ApplicationInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, applicationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ApplicationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Application> list(String resourceGroupName, String accountName) {
        PagedIterable<ApplicationInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return inner.mapPage(inner1 -> new ApplicationImpl(inner1, this.manager()));
    }

    public PagedIterable<Application> list(
        String resourceGroupName, String accountName, Integer maxresults, Context context) {
        PagedIterable<ApplicationInner> inner =
            this.serviceClient().list(resourceGroupName, accountName, maxresults, context);
        return inner.mapPage(inner1 -> new ApplicationImpl(inner1, this.manager()));
    }

    public Application getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "batchAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'batchAccounts'.", id)));
        }
        String applicationName = Utils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, applicationName, Context.NONE).getValue();
    }

    public Response<Application> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "batchAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'batchAccounts'.", id)));
        }
        String applicationName = Utils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, applicationName, context);
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
        String accountName = Utils.getValueFromIdByName(id, "batchAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'batchAccounts'.", id)));
        }
        String applicationName = Utils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, accountName, applicationName, Context.NONE).getValue();
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
        String accountName = Utils.getValueFromIdByName(id, "batchAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'batchAccounts'.", id)));
        }
        String applicationName = Utils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, applicationName, context);
    }

    private ApplicationsClient serviceClient() {
        return this.innerClient;
    }

    private BatchManager manager() {
        return this.serviceManager;
    }

    public ApplicationImpl define(String name) {
        return new ApplicationImpl(name, this.manager());
    }
}
