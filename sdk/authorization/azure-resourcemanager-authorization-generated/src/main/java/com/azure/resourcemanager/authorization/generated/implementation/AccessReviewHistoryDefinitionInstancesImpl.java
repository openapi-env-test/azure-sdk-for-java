// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.generated.fluent.AccessReviewHistoryDefinitionInstancesClient;
import com.azure.resourcemanager.authorization.generated.fluent.models.AccessReviewHistoryInstanceInner;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewHistoryDefinitionInstances;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewHistoryInstance;

public final class AccessReviewHistoryDefinitionInstancesImpl implements AccessReviewHistoryDefinitionInstances {
    private static final ClientLogger LOGGER = new ClientLogger(AccessReviewHistoryDefinitionInstancesImpl.class);

    private final AccessReviewHistoryDefinitionInstancesClient innerClient;

    private final com.azure.resourcemanager.authorization.generated.AuthorizationManager serviceManager;

    public AccessReviewHistoryDefinitionInstancesImpl(
        AccessReviewHistoryDefinitionInstancesClient innerClient,
        com.azure.resourcemanager.authorization.generated.AuthorizationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public AccessReviewHistoryInstance generateDownloadUri(String historyDefinitionId, String instanceId) {
        AccessReviewHistoryInstanceInner inner =
            this.serviceClient().generateDownloadUri(historyDefinitionId, instanceId);
        if (inner != null) {
            return new AccessReviewHistoryInstanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessReviewHistoryInstance> generateDownloadUriWithResponse(
        String historyDefinitionId, String instanceId, Context context) {
        Response<AccessReviewHistoryInstanceInner> inner =
            this.serviceClient().generateDownloadUriWithResponse(historyDefinitionId, instanceId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AccessReviewHistoryInstanceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private AccessReviewHistoryDefinitionInstancesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.authorization.generated.AuthorizationManager manager() {
        return this.serviceManager;
    }
}
