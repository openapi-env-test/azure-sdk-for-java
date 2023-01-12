// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.releaseplannertest.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.releaseplannertest.fluent.FarmBeatsModelsClient;
import com.azure.resourcemanager.releaseplannertest.fluent.models.ArmAsyncOperationInner;
import com.azure.resourcemanager.releaseplannertest.fluent.models.FarmBeatsInner;
import com.azure.resourcemanager.releaseplannertest.models.ArmAsyncOperation;
import com.azure.resourcemanager.releaseplannertest.models.FarmBeats;
import com.azure.resourcemanager.releaseplannertest.models.FarmBeatsModels;

public final class FarmBeatsModelsImpl implements FarmBeatsModels {
    private static final ClientLogger LOGGER = new ClientLogger(FarmBeatsModelsImpl.class);

    private final FarmBeatsModelsClient innerClient;

    private final com.azure.resourcemanager.releaseplannertest.AgriFoodManager serviceManager;

    public FarmBeatsModelsImpl(
        FarmBeatsModelsClient innerClient,
        com.azure.resourcemanager.releaseplannertest.AgriFoodManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<FarmBeats> getByResourceGroupWithResponse(
        String resourceGroupName, String farmBeatsResourceName, Context context) {
        Response<FarmBeatsInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, farmBeatsResourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new FarmBeatsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public FarmBeats getByResourceGroup(String resourceGroupName, String farmBeatsResourceName) {
        FarmBeatsInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, farmBeatsResourceName);
        if (inner != null) {
            return new FarmBeatsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteByResourceGroupWithResponse(
        String resourceGroupName, String farmBeatsResourceName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, farmBeatsResourceName, context);
    }

    public void deleteByResourceGroup(String resourceGroupName, String farmBeatsResourceName) {
        this.serviceClient().delete(resourceGroupName, farmBeatsResourceName);
    }

    public PagedIterable<FarmBeats> list() {
        PagedIterable<FarmBeatsInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new FarmBeatsImpl(inner1, this.manager()));
    }

    public PagedIterable<FarmBeats> list(Integer maxPageSize, String skipToken, Context context) {
        PagedIterable<FarmBeatsInner> inner = this.serviceClient().list(maxPageSize, skipToken, context);
        return Utils.mapPage(inner, inner1 -> new FarmBeatsImpl(inner1, this.manager()));
    }

    public PagedIterable<FarmBeats> listByResourceGroup(String resourceGroupName) {
        PagedIterable<FarmBeatsInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new FarmBeatsImpl(inner1, this.manager()));
    }

    public PagedIterable<FarmBeats> listByResourceGroup(
        String resourceGroupName, Integer maxPageSize, String skipToken, Context context) {
        PagedIterable<FarmBeatsInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, maxPageSize, skipToken, context);
        return Utils.mapPage(inner, inner1 -> new FarmBeatsImpl(inner1, this.manager()));
    }

    public Response<ArmAsyncOperation> getOperationResultWithResponse(
        String resourceGroupName, String farmBeatsResourceName, String operationResultsId, Context context) {
        Response<ArmAsyncOperationInner> inner =
            this
                .serviceClient()
                .getOperationResultWithResponse(resourceGroupName, farmBeatsResourceName, operationResultsId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ArmAsyncOperationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ArmAsyncOperation getOperationResult(
        String resourceGroupName, String farmBeatsResourceName, String operationResultsId) {
        ArmAsyncOperationInner inner =
            this.serviceClient().getOperationResult(resourceGroupName, farmBeatsResourceName, operationResultsId);
        if (inner != null) {
            return new ArmAsyncOperationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public FarmBeats getById(String id) {
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
        return this.getByResourceGroupWithResponse(resourceGroupName, farmBeatsResourceName, Context.NONE).getValue();
    }

    public Response<FarmBeats> getByIdWithResponse(String id, Context context) {
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
        return this.getByResourceGroupWithResponse(resourceGroupName, farmBeatsResourceName, context);
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
        this.deleteByResourceGroupWithResponse(resourceGroupName, farmBeatsResourceName, Context.NONE);
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
        return this.deleteByResourceGroupWithResponse(resourceGroupName, farmBeatsResourceName, context);
    }

    private FarmBeatsModelsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.releaseplannertest.AgriFoodManager manager() {
        return this.serviceManager;
    }

    public FarmBeatsImpl define(String name) {
        return new FarmBeatsImpl(name, this.manager());
    }
}
