// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ExtendedServerBlobAuditingPolicies. */
public interface ExtendedServerBlobAuditingPolicies {
    /**
     * Lists extended auditing settings of a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server extended auditing settings as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ExtendedServerBlobAuditingPolicy> listByServer(String resourceGroupName, String serverName);

    /**
     * Lists extended auditing settings of a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server extended auditing settings as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ExtendedServerBlobAuditingPolicy> listByServer(
        String resourceGroupName, String serverName, Context context);

    /**
     * Gets an extended server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended server's blob auditing policy along with {@link Response}.
     */
    Response<ExtendedServerBlobAuditingPolicy> getWithResponse(
        String resourceGroupName, String serverName, Context context);

    /**
     * Gets an extended server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended server's blob auditing policy.
     */
    ExtendedServerBlobAuditingPolicy get(String resourceGroupName, String serverName);

    /**
     * Gets an extended server's blob auditing policy.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended server's blob auditing policy along with {@link Response}.
     */
    ExtendedServerBlobAuditingPolicy getById(String id);

    /**
     * Gets an extended server's blob auditing policy.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended server's blob auditing policy along with {@link Response}.
     */
    Response<ExtendedServerBlobAuditingPolicy> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ExtendedServerBlobAuditingPolicy resource.
     *
     * @return the first stage of the new ExtendedServerBlobAuditingPolicy definition.
     */
    ExtendedServerBlobAuditingPolicy.DefinitionStages.Blank define();
}
