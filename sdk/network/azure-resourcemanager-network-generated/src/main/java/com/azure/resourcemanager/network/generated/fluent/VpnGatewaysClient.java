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
import com.azure.resourcemanager.network.generated.fluent.models.VpnGatewayInner;
import com.azure.resourcemanager.network.generated.models.TagsObject;

/** An instance of this class provides access to all the operations defined in VpnGatewaysClient. */
public interface VpnGatewaysClient {
    /**
     * Retrieves the details of a virtual wan vpn gateway.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VpnGatewayInner getByResourceGroup(String resourceGroupName, String gatewayName);

    /**
     * Retrieves the details of a virtual wan vpn gateway.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VpnGatewayInner> getByResourceGroupWithResponse(
        String resourceGroupName, String gatewayName, Context context);

    /**
     * Creates a virtual wan vpn gateway if it doesn't exist else updates the existing gateway.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param vpnGatewayParameters Parameters supplied to create or Update a virtual wan vpn gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VpnGatewayInner>, VpnGatewayInner> beginCreateOrUpdate(
        String resourceGroupName, String gatewayName, VpnGatewayInner vpnGatewayParameters);

    /**
     * Creates a virtual wan vpn gateway if it doesn't exist else updates the existing gateway.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param vpnGatewayParameters Parameters supplied to create or Update a virtual wan vpn gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VpnGatewayInner>, VpnGatewayInner> beginCreateOrUpdate(
        String resourceGroupName, String gatewayName, VpnGatewayInner vpnGatewayParameters, Context context);

    /**
     * Creates a virtual wan vpn gateway if it doesn't exist else updates the existing gateway.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param vpnGatewayParameters Parameters supplied to create or Update a virtual wan vpn gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VpnGatewayInner createOrUpdate(String resourceGroupName, String gatewayName, VpnGatewayInner vpnGatewayParameters);

    /**
     * Creates a virtual wan vpn gateway if it doesn't exist else updates the existing gateway.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param vpnGatewayParameters Parameters supplied to create or Update a virtual wan vpn gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VpnGatewayInner createOrUpdate(
        String resourceGroupName, String gatewayName, VpnGatewayInner vpnGatewayParameters, Context context);

    /**
     * Updates virtual wan vpn gateway tags.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param vpnGatewayParameters Parameters supplied to update a virtual wan vpn gateway tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VpnGatewayInner updateTags(String resourceGroupName, String gatewayName, TagsObject vpnGatewayParameters);

    /**
     * Updates virtual wan vpn gateway tags.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param vpnGatewayParameters Parameters supplied to update a virtual wan vpn gateway tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VpnGatewayInner> updateTagsWithResponse(
        String resourceGroupName, String gatewayName, TagsObject vpnGatewayParameters, Context context);

    /**
     * Deletes a virtual wan vpn gateway.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String gatewayName);

    /**
     * Deletes a virtual wan vpn gateway.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String gatewayName, Context context);

    /**
     * Deletes a virtual wan vpn gateway.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String gatewayName);

    /**
     * Deletes a virtual wan vpn gateway.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String gatewayName, Context context);

    /**
     * Resets the primary of the vpn gateway in the specified resource group.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VpnGatewayInner>, VpnGatewayInner> beginReset(String resourceGroupName, String gatewayName);

    /**
     * Resets the primary of the vpn gateway in the specified resource group.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VpnGatewayInner>, VpnGatewayInner> beginReset(
        String resourceGroupName, String gatewayName, Context context);

    /**
     * Resets the primary of the vpn gateway in the specified resource group.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VpnGatewayInner reset(String resourceGroupName, String gatewayName);

    /**
     * Resets the primary of the vpn gateway in the specified resource group.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VpnGatewayInner reset(String resourceGroupName, String gatewayName, Context context);

    /**
     * Lists all the VpnGateways in a resource group.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VpnGateways.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VpnGatewayInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the VpnGateways in a resource group.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VpnGateways.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VpnGatewayInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all the VpnGateways in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VpnGateways.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VpnGatewayInner> list();

    /**
     * Lists all the VpnGateways in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VpnGateways.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VpnGatewayInner> list(Context context);
}
