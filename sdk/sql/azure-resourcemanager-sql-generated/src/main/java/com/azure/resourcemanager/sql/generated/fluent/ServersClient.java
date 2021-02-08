// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerInner;
import com.azure.resourcemanager.sql.generated.models.CheckNameAvailabilityRequest;
import com.azure.resourcemanager.sql.generated.models.ServerUpdate;

/** An instance of this class provides access to all the operations defined in ServersClient. */
public interface ServersClient {
    /**
     * Determines whether a resource can be created with the specified name.
     *
     * @param parameters The parameters to request for name availability.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a response indicating whether the specified name for a resource is available.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckNameAvailabilityResponseInner checkNameAvailability(CheckNameAvailabilityRequest parameters);

    /**
     * Determines whether a resource can be created with the specified name.
     *
     * @param parameters The parameters to request for name availability.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a response indicating whether the specified name for a resource is available.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckNameAvailabilityResponseInner> checkNameAvailabilityWithResponse(
        CheckNameAvailabilityRequest parameters, Context context);

    /**
     * Returns a list of servers.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a get server request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerInner> list();

    /**
     * Returns a list of servers.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a get server request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerInner> list(Context context);

    /**
     * Creates or updates a new server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters The required parameters for creating or updating a server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerInner createOrUpdate(String resourceGroupName, String serverName, ServerInner parameters);

    /**
     * Creates or updates a new server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters The required parameters for creating or updating a server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServerInner> createOrUpdateWithResponse(
        String resourceGroupName, String serverName, ServerInner parameters, Context context);

    /**
     * Updates an existing server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters The required parameters for updating a server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerInner update(String resourceGroupName, String serverName, ServerUpdate parameters);

    /**
     * Updates an existing server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters The required parameters for updating a server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServerInner> updateWithResponse(
        String resourceGroupName, String serverName, ServerUpdate parameters, Context context);

    /**
     * Deletes a SQL server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serverName);

    /**
     * Deletes a SQL server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String serverName, Context context);

    /**
     * Gets a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerInner getByResourceGroup(String resourceGroupName, String serverName);

    /**
     * Gets a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServerInner> getByResourceGroupWithResponse(String resourceGroupName, String serverName, Context context);

    /**
     * Returns a list of servers in a resource group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a get server request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerInner> listByResourceGroup(String resourceGroupName);

    /**
     * Returns a list of servers in a resource group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a get server request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerInner> listByResourceGroup(String resourceGroupName, Context context);
}
