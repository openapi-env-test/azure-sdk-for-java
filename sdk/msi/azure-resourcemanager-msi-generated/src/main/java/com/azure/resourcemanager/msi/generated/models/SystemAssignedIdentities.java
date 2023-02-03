// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.msi.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of SystemAssignedIdentities. */
public interface SystemAssignedIdentities {
    /**
     * Gets the systemAssignedIdentity available under the specified RP scope.
     *
     * @param scope The resource provider scope of the resource. Parent resource being extended by Managed Identities.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the systemAssignedIdentity available under the specified RP scope along with {@link Response}.
     */
    Response<SystemAssignedIdentity> getByScopeWithResponse(String scope, Context context);

    /**
     * Gets the systemAssignedIdentity available under the specified RP scope.
     *
     * @param scope The resource provider scope of the resource. Parent resource being extended by Managed Identities.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the systemAssignedIdentity available under the specified RP scope.
     */
    SystemAssignedIdentity getByScope(String scope);
}
