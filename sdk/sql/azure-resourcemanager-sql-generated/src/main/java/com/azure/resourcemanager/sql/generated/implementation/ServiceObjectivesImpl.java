// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.ServiceObjectivesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ServiceObjectiveInner;
import com.azure.resourcemanager.sql.generated.models.ServiceObjective;
import com.azure.resourcemanager.sql.generated.models.ServiceObjectives;

public final class ServiceObjectivesImpl implements ServiceObjectives {
    private static final ClientLogger LOGGER = new ClientLogger(ServiceObjectivesImpl.class);

    private final ServiceObjectivesClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public ServiceObjectivesImpl(
        ServiceObjectivesClient innerClient, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ServiceObjective> getWithResponse(
        String resourceGroupName, String serverName, String serviceObjectiveName, Context context) {
        Response<ServiceObjectiveInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, serviceObjectiveName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServiceObjectiveImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ServiceObjective get(String resourceGroupName, String serverName, String serviceObjectiveName) {
        ServiceObjectiveInner inner = this.serviceClient().get(resourceGroupName, serverName, serviceObjectiveName);
        if (inner != null) {
            return new ServiceObjectiveImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<ServiceObjective> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<ServiceObjectiveInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName);
        return Utils.mapPage(inner, inner1 -> new ServiceObjectiveImpl(inner1, this.manager()));
    }

    public PagedIterable<ServiceObjective> listByServer(String resourceGroupName, String serverName, Context context) {
        PagedIterable<ServiceObjectiveInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return Utils.mapPage(inner, inner1 -> new ServiceObjectiveImpl(inner1, this.manager()));
    }

    private ServiceObjectivesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
