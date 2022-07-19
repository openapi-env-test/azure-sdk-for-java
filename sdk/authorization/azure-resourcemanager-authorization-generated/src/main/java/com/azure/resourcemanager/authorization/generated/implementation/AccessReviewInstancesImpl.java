// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.generated.fluent.AccessReviewInstancesClient;
import com.azure.resourcemanager.authorization.generated.fluent.models.AccessReviewInstanceInner;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewInstance;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewInstances;

public final class AccessReviewInstancesImpl implements AccessReviewInstances {
    private static final ClientLogger LOGGER = new ClientLogger(AccessReviewInstancesImpl.class);

    private final AccessReviewInstancesClient innerClient;

    private final com.azure.resourcemanager.authorization.generated.AuthorizationManager serviceManager;

    public AccessReviewInstancesImpl(
        AccessReviewInstancesClient innerClient,
        com.azure.resourcemanager.authorization.generated.AuthorizationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AccessReviewInstance> list(String scheduleDefinitionId) {
        PagedIterable<AccessReviewInstanceInner> inner = this.serviceClient().list(scheduleDefinitionId);
        return Utils.mapPage(inner, inner1 -> new AccessReviewInstanceImpl(inner1, this.manager()));
    }

    public PagedIterable<AccessReviewInstance> list(String scheduleDefinitionId, String filter, Context context) {
        PagedIterable<AccessReviewInstanceInner> inner =
            this.serviceClient().list(scheduleDefinitionId, filter, context);
        return Utils.mapPage(inner, inner1 -> new AccessReviewInstanceImpl(inner1, this.manager()));
    }

    public AccessReviewInstance getById(String scheduleDefinitionId, String id) {
        AccessReviewInstanceInner inner = this.serviceClient().getById(scheduleDefinitionId, id);
        if (inner != null) {
            return new AccessReviewInstanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessReviewInstance> getByIdWithResponse(String scheduleDefinitionId, String id, Context context) {
        Response<AccessReviewInstanceInner> inner =
            this.serviceClient().getByIdWithResponse(scheduleDefinitionId, id, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AccessReviewInstanceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private AccessReviewInstancesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.authorization.generated.AuthorizationManager manager() {
        return this.serviceManager;
    }

    public AccessReviewInstanceImpl define(String name) {
        return new AccessReviewInstanceImpl(name, this.manager());
    }
}
