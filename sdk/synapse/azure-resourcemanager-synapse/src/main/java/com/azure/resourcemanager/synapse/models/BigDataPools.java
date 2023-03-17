// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of BigDataPools. */
public interface BigDataPools {
    /**
     * Get Big Data pool
     *
     * <p>Get a Big Data pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param bigDataPoolName Big Data pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Big Data pool along with {@link Response}.
     */
    Response<BigDataPoolResourceInfo> getWithResponse(
        String resourceGroupName, String workspaceName, String bigDataPoolName, Context context);

    /**
     * Get Big Data pool
     *
     * <p>Get a Big Data pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param bigDataPoolName Big Data pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Big Data pool.
     */
    BigDataPoolResourceInfo get(String resourceGroupName, String workspaceName, String bigDataPoolName);

    /**
     * Delete a Big Data pool.
     *
     * <p>Delete a Big Data pool from the workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param bigDataPoolName Big Data pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    Object delete(String resourceGroupName, String workspaceName, String bigDataPoolName);

    /**
     * Delete a Big Data pool.
     *
     * <p>Delete a Big Data pool from the workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param bigDataPoolName Big Data pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    Object delete(String resourceGroupName, String workspaceName, String bigDataPoolName, Context context);

    /**
     * List the Big Data pools in a workspace.
     *
     * <p>List Big Data pools in a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Big Data pools as paginated response with {@link PagedIterable}.
     */
    PagedIterable<BigDataPoolResourceInfo> listByWorkspace(String resourceGroupName, String workspaceName);

    /**
     * List the Big Data pools in a workspace.
     *
     * <p>List Big Data pools in a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Big Data pools as paginated response with {@link PagedIterable}.
     */
    PagedIterable<BigDataPoolResourceInfo> listByWorkspace(
        String resourceGroupName, String workspaceName, Context context);

    /**
     * Get Big Data pool
     *
     * <p>Get a Big Data pool.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Big Data pool along with {@link Response}.
     */
    BigDataPoolResourceInfo getById(String id);

    /**
     * Get Big Data pool
     *
     * <p>Get a Big Data pool.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Big Data pool along with {@link Response}.
     */
    Response<BigDataPoolResourceInfo> getByIdWithResponse(String id, Context context);

    /**
     * Delete a Big Data pool.
     *
     * <p>Delete a Big Data pool from the workspace.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    Object deleteById(String id);

    /**
     * Delete a Big Data pool.
     *
     * <p>Delete a Big Data pool from the workspace.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    Object deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new BigDataPoolResourceInfo resource.
     *
     * @param name resource name.
     * @return the first stage of the new BigDataPoolResourceInfo definition.
     */
    BigDataPoolResourceInfo.DefinitionStages.Blank define(String name);
}
