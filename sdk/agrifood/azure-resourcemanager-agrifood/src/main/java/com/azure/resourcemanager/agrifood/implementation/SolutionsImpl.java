// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.agrifood.fluent.SolutionsClient;
import com.azure.resourcemanager.agrifood.fluent.models.SolutionInner;
import com.azure.resourcemanager.agrifood.models.Solution;
import com.azure.resourcemanager.agrifood.models.Solutions;
import java.time.OffsetDateTime;
import java.util.List;

public final class SolutionsImpl implements Solutions {
    private static final ClientLogger LOGGER = new ClientLogger(SolutionsImpl.class);

    private final SolutionsClient innerClient;

    private final com.azure.resourcemanager.agrifood.AgriFoodManager serviceManager;

    public SolutionsImpl(
        SolutionsClient innerClient, com.azure.resourcemanager.agrifood.AgriFoodManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Solution> getWithResponse(
        String resourceGroupName, String farmBeatsResourceName, String solutionId, Context context) {
        Response<SolutionInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, farmBeatsResourceName, solutionId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SolutionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Solution get(String resourceGroupName, String farmBeatsResourceName, String solutionId) {
        SolutionInner inner = this.serviceClient().get(resourceGroupName, farmBeatsResourceName, solutionId);
        if (inner != null) {
            return new SolutionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String farmBeatsResourceName, String solutionId, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, farmBeatsResourceName, solutionId, context);
    }

    public void delete(String resourceGroupName, String farmBeatsResourceName, String solutionId) {
        this.serviceClient().delete(resourceGroupName, farmBeatsResourceName, solutionId);
    }

    public PagedIterable<Solution> list(String resourceGroupName, String farmBeatsResourceName) {
        PagedIterable<SolutionInner> inner = this.serviceClient().list(resourceGroupName, farmBeatsResourceName);
        return Utils.mapPage(inner, inner1 -> new SolutionImpl(inner1, this.manager()));
    }

    public PagedIterable<Solution> list(
        String resourceGroupName,
        String farmBeatsResourceName,
        List<String> solutionIds,
        List<String> ids,
        List<String> names,
        List<String> propertyFilters,
        List<String> statuses,
        OffsetDateTime minCreatedDateTime,
        OffsetDateTime maxCreatedDateTime,
        OffsetDateTime minLastModifiedDateTime,
        OffsetDateTime maxLastModifiedDateTime,
        Integer maxPageSize,
        String skipToken,
        Context context) {
        PagedIterable<SolutionInner> inner =
            this
                .serviceClient()
                .list(
                    resourceGroupName,
                    farmBeatsResourceName,
                    solutionIds,
                    ids,
                    names,
                    propertyFilters,
                    statuses,
                    minCreatedDateTime,
                    maxCreatedDateTime,
                    minLastModifiedDateTime,
                    maxLastModifiedDateTime,
                    maxPageSize,
                    skipToken,
                    context);
        return Utils.mapPage(inner, inner1 -> new SolutionImpl(inner1, this.manager()));
    }

    public Solution getById(String id) {
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
        String solutionId = Utils.getValueFromIdByName(id, "solutions");
        if (solutionId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'solutions'.", id)));
        }
        return this.getWithResponse(resourceGroupName, farmBeatsResourceName, solutionId, Context.NONE).getValue();
    }

    public Response<Solution> getByIdWithResponse(String id, Context context) {
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
        String solutionId = Utils.getValueFromIdByName(id, "solutions");
        if (solutionId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'solutions'.", id)));
        }
        return this.getWithResponse(resourceGroupName, farmBeatsResourceName, solutionId, context);
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
        String solutionId = Utils.getValueFromIdByName(id, "solutions");
        if (solutionId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'solutions'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, farmBeatsResourceName, solutionId, Context.NONE);
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
        String solutionId = Utils.getValueFromIdByName(id, "solutions");
        if (solutionId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'solutions'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, farmBeatsResourceName, solutionId, context);
    }

    private SolutionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.agrifood.AgriFoodManager manager() {
        return this.serviceManager;
    }

    public SolutionImpl define(String name) {
        return new SolutionImpl(name, this.manager());
    }
}
