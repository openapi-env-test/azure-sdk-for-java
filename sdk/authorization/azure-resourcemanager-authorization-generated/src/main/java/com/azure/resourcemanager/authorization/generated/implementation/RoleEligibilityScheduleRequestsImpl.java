// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.generated.fluent.RoleEligibilityScheduleRequestsClient;
import com.azure.resourcemanager.authorization.generated.fluent.models.RoleEligibilityScheduleRequestInner;
import com.azure.resourcemanager.authorization.generated.models.RoleEligibilityScheduleRequest;
import com.azure.resourcemanager.authorization.generated.models.RoleEligibilityScheduleRequests;

public final class RoleEligibilityScheduleRequestsImpl implements RoleEligibilityScheduleRequests {
    private static final ClientLogger LOGGER = new ClientLogger(RoleEligibilityScheduleRequestsImpl.class);

    private final RoleEligibilityScheduleRequestsClient innerClient;

    private final com.azure.resourcemanager.authorization.generated.AuthorizationManager serviceManager;

    public RoleEligibilityScheduleRequestsImpl(
        RoleEligibilityScheduleRequestsClient innerClient,
        com.azure.resourcemanager.authorization.generated.AuthorizationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public RoleEligibilityScheduleRequest get(String scope, String roleEligibilityScheduleRequestName) {
        RoleEligibilityScheduleRequestInner inner = this.serviceClient().get(scope, roleEligibilityScheduleRequestName);
        if (inner != null) {
            return new RoleEligibilityScheduleRequestImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RoleEligibilityScheduleRequest> getWithResponse(
        String scope, String roleEligibilityScheduleRequestName, Context context) {
        Response<RoleEligibilityScheduleRequestInner> inner =
            this.serviceClient().getWithResponse(scope, roleEligibilityScheduleRequestName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RoleEligibilityScheduleRequestImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<RoleEligibilityScheduleRequest> listForScope(String scope) {
        PagedIterable<RoleEligibilityScheduleRequestInner> inner = this.serviceClient().listForScope(scope);
        return Utils.mapPage(inner, inner1 -> new RoleEligibilityScheduleRequestImpl(inner1, this.manager()));
    }

    public PagedIterable<RoleEligibilityScheduleRequest> listForScope(String scope, String filter, Context context) {
        PagedIterable<RoleEligibilityScheduleRequestInner> inner =
            this.serviceClient().listForScope(scope, filter, context);
        return Utils.mapPage(inner, inner1 -> new RoleEligibilityScheduleRequestImpl(inner1, this.manager()));
    }

    public void cancel(String scope, String roleEligibilityScheduleRequestName) {
        this.serviceClient().cancel(scope, roleEligibilityScheduleRequestName);
    }

    public Response<Void> cancelWithResponse(String scope, String roleEligibilityScheduleRequestName, Context context) {
        return this.serviceClient().cancelWithResponse(scope, roleEligibilityScheduleRequestName, context);
    }

    public RoleEligibilityScheduleRequest validate(
        String scope, String roleEligibilityScheduleRequestName, RoleEligibilityScheduleRequestInner parameters) {
        RoleEligibilityScheduleRequestInner inner =
            this.serviceClient().validate(scope, roleEligibilityScheduleRequestName, parameters);
        if (inner != null) {
            return new RoleEligibilityScheduleRequestImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RoleEligibilityScheduleRequest> validateWithResponse(
        String scope,
        String roleEligibilityScheduleRequestName,
        RoleEligibilityScheduleRequestInner parameters,
        Context context) {
        Response<RoleEligibilityScheduleRequestInner> inner =
            this.serviceClient().validateWithResponse(scope, roleEligibilityScheduleRequestName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RoleEligibilityScheduleRequestImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RoleEligibilityScheduleRequest getById(String id) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.Authorization/roleEligibilityScheduleRequests"
                        + "/{roleEligibilityScheduleRequestName}",
                    "scope");
        if (scope == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String roleEligibilityScheduleRequestName =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.Authorization/roleEligibilityScheduleRequests"
                        + "/{roleEligibilityScheduleRequestName}",
                    "roleEligibilityScheduleRequestName");
        if (roleEligibilityScheduleRequestName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'roleEligibilityScheduleRequests'.",
                                id)));
        }
        return this.getWithResponse(scope, roleEligibilityScheduleRequestName, Context.NONE).getValue();
    }

    public Response<RoleEligibilityScheduleRequest> getByIdWithResponse(String id, Context context) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.Authorization/roleEligibilityScheduleRequests"
                        + "/{roleEligibilityScheduleRequestName}",
                    "scope");
        if (scope == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String roleEligibilityScheduleRequestName =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.Authorization/roleEligibilityScheduleRequests"
                        + "/{roleEligibilityScheduleRequestName}",
                    "roleEligibilityScheduleRequestName");
        if (roleEligibilityScheduleRequestName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'roleEligibilityScheduleRequests'.",
                                id)));
        }
        return this.getWithResponse(scope, roleEligibilityScheduleRequestName, context);
    }

    private RoleEligibilityScheduleRequestsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.authorization.generated.AuthorizationManager manager() {
        return this.serviceManager;
    }

    public RoleEligibilityScheduleRequestImpl define(String name) {
        return new RoleEligibilityScheduleRequestImpl(name, this.manager());
    }
}
