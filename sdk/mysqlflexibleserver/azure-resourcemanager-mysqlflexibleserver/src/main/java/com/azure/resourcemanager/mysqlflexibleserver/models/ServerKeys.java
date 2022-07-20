// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ServerKeys. */
public interface ServerKeys {
    /**
     * Gets a list of Server keys.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Server keys as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ServerKey> list(String resourceGroupName, String serverName);

    /**
     * Gets a list of Server keys.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Server keys as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ServerKey> list(String resourceGroupName, String serverName, Context context);

    /**
     * Gets a MySQL Server key.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param keyName The name of the MySQL Server key to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a MySQL Server key.
     */
    ServerKey get(String resourceGroupName, String serverName, String keyName);

    /**
     * Gets a MySQL Server key.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param keyName The name of the MySQL Server key to be retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a MySQL Server key along with {@link Response}.
     */
    Response<ServerKey> getWithResponse(String resourceGroupName, String serverName, String keyName, Context context);

    /**
     * Deletes the MySQL Server key with the given name.
     *
     * @param serverName The name of the server.
     * @param keyName The name of the MySQL Server key to be deleted.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String serverName, String keyName, String resourceGroupName);

    /**
     * Deletes the MySQL Server key with the given name.
     *
     * @param serverName The name of the server.
     * @param keyName The name of the MySQL Server key to be deleted.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String serverName, String keyName, String resourceGroupName, Context context);

    /**
     * Gets a MySQL Server key.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a MySQL Server key along with {@link Response}.
     */
    ServerKey getById(String id);

    /**
     * Gets a MySQL Server key.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a MySQL Server key along with {@link Response}.
     */
    Response<ServerKey> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the MySQL Server key with the given name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the MySQL Server key with the given name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ServerKey resource.
     *
     * @param name resource name.
     * @return the first stage of the new ServerKey definition.
     */
    ServerKey.DefinitionStages.Blank define(String name);
}
