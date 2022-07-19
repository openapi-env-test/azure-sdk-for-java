// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerAutomaticTuningInner;

/** Resource collection API of ServerAutomaticTunings. */
public interface ServerAutomaticTunings {
    /**
     * Retrieves server automatic tuning options.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return server-level Automatic Tuning.
     */
    ServerAutomaticTuning get(String resourceGroupName, String serverName);

    /**
     * Retrieves server automatic tuning options.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return server-level Automatic Tuning along with {@link Response}.
     */
    Response<ServerAutomaticTuning> getWithResponse(String resourceGroupName, String serverName, Context context);

    /**
     * Update automatic tuning options on server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters The requested automatic tuning resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return server-level Automatic Tuning.
     */
    ServerAutomaticTuning update(String resourceGroupName, String serverName, ServerAutomaticTuningInner parameters);

    /**
     * Update automatic tuning options on server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters The requested automatic tuning resource state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return server-level Automatic Tuning along with {@link Response}.
     */
    Response<ServerAutomaticTuning> updateWithResponse(
        String resourceGroupName, String serverName, ServerAutomaticTuningInner parameters, Context context);
}
