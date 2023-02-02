// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of FlowLogs. */
public interface FlowLogs {
    /**
     * Gets a flow log resource by name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a flow log resource by name along with {@link Response}.
     */
    Response<FlowLog> getWithResponse(
        String resourceGroupName, String networkWatcherName, String flowLogName, Context context);

    /**
     * Gets a flow log resource by name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a flow log resource by name.
     */
    FlowLog get(String resourceGroupName, String networkWatcherName, String flowLogName);

    /**
     * Deletes the specified flow log resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkWatcherName, String flowLogName);

    /**
     * Deletes the specified flow log resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkWatcherName, String flowLogName, Context context);

    /**
     * Lists all flow log resources for the specified Network Watcher.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of flow logs as paginated response with {@link PagedIterable}.
     */
    PagedIterable<FlowLog> list(String resourceGroupName, String networkWatcherName);

    /**
     * Lists all flow log resources for the specified Network Watcher.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of flow logs as paginated response with {@link PagedIterable}.
     */
    PagedIterable<FlowLog> list(String resourceGroupName, String networkWatcherName, Context context);

    /**
     * Gets a flow log resource by name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a flow log resource by name along with {@link Response}.
     */
    FlowLog getById(String id);

    /**
     * Gets a flow log resource by name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a flow log resource by name along with {@link Response}.
     */
    Response<FlowLog> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified flow log resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified flow log resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new FlowLog resource.
     *
     * @param name resource name.
     * @return the first stage of the new FlowLog definition.
     */
    FlowLog.DefinitionStages.Blank define(String name);
}
