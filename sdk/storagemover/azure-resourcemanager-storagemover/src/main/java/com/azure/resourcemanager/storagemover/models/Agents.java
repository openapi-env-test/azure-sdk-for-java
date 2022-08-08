// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Agents. */
public interface Agents {
    /**
     * Lists all Agents in a Storage Mover.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Agents as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Agent> list(String resourceGroupName, String storageMoverName);

    /**
     * Lists all Agents in a Storage Mover.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Agents as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Agent> list(String resourceGroupName, String storageMoverName, Context context);

    /**
     * Gets an Agent resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param agentName The name of the Agent resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Agent resource.
     */
    Agent get(String resourceGroupName, String storageMoverName, String agentName);

    /**
     * Gets an Agent resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param agentName The name of the Agent resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Agent resource along with {@link Response}.
     */
    Response<Agent> getWithResponse(
        String resourceGroupName, String storageMoverName, String agentName, Context context);

    /**
     * Deletes an Agent resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param agentName The name of the Agent resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String storageMoverName, String agentName);

    /**
     * Deletes an Agent resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param agentName The name of the Agent resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String storageMoverName, String agentName, Context context);

    /**
     * Gets an Agent resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Agent resource along with {@link Response}.
     */
    Agent getById(String id);

    /**
     * Gets an Agent resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Agent resource along with {@link Response}.
     */
    Response<Agent> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an Agent resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an Agent resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Agent resource.
     *
     * @param name resource name.
     * @return the first stage of the new Agent definition.
     */
    Agent.DefinitionStages.Blank define(String name);
}
