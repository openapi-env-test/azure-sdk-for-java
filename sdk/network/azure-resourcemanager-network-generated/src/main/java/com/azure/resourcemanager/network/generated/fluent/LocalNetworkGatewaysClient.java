// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.generated.fluent.models.LocalNetworkGatewayInner;
import com.azure.resourcemanager.network.generated.models.TagsObject;

/** An instance of this class provides access to all the operations defined in LocalNetworkGatewaysClient. */
public interface LocalNetworkGatewaysClient {
    /**
     * Creates or updates a local network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to the create or update local network gateway operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a common class for general resource information.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<LocalNetworkGatewayInner>, LocalNetworkGatewayInner> beginCreateOrUpdate(
        String resourceGroupName, String localNetworkGatewayName, LocalNetworkGatewayInner parameters);

    /**
     * Creates or updates a local network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to the create or update local network gateway operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a common class for general resource information.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<LocalNetworkGatewayInner>, LocalNetworkGatewayInner> beginCreateOrUpdate(
        String resourceGroupName, String localNetworkGatewayName, LocalNetworkGatewayInner parameters, Context context);

    /**
     * Creates or updates a local network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to the create or update local network gateway operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a common class for general resource information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LocalNetworkGatewayInner createOrUpdate(
        String resourceGroupName, String localNetworkGatewayName, LocalNetworkGatewayInner parameters);

    /**
     * Creates or updates a local network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to the create or update local network gateway operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a common class for general resource information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LocalNetworkGatewayInner createOrUpdate(
        String resourceGroupName, String localNetworkGatewayName, LocalNetworkGatewayInner parameters, Context context);

    /**
     * Gets the specified local network gateway in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified local network gateway in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LocalNetworkGatewayInner getByResourceGroup(String resourceGroupName, String localNetworkGatewayName);

    /**
     * Gets the specified local network gateway in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified local network gateway in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LocalNetworkGatewayInner> getByResourceGroupWithResponse(
        String resourceGroupName, String localNetworkGatewayName, Context context);

    /**
     * Deletes the specified local network gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String localNetworkGatewayName);

    /**
     * Deletes the specified local network gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String localNetworkGatewayName, Context context);

    /**
     * Deletes the specified local network gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String localNetworkGatewayName);

    /**
     * Deletes the specified local network gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String localNetworkGatewayName, Context context);

    /**
     * Updates a local network gateway tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to update local network gateway tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a common class for general resource information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LocalNetworkGatewayInner updateTags(
        String resourceGroupName, String localNetworkGatewayName, TagsObject parameters);

    /**
     * Updates a local network gateway tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to update local network gateway tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a common class for general resource information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LocalNetworkGatewayInner> updateTagsWithResponse(
        String resourceGroupName, String localNetworkGatewayName, TagsObject parameters, Context context);

    /**
     * Gets all the local network gateways in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the local network gateways in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LocalNetworkGatewayInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all the local network gateways in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the local network gateways in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LocalNetworkGatewayInner> listByResourceGroup(String resourceGroupName, Context context);
}
