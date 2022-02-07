// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteGatewayInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteGatewayListInner;
import com.azure.resourcemanager.network.generated.models.TagsObject;

/** An instance of this class provides access to all the operations defined in ExpressRouteGatewaysClient. */
public interface ExpressRouteGatewaysClient {
    /**
     * Lists ExpressRoute gateways under a given subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ExpressRoute gateways.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteGatewayListInner listBySubscription();

    /**
     * Lists ExpressRoute gateways under a given subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ExpressRoute gateways.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExpressRouteGatewayListInner> listBySubscriptionWithResponse(Context context);

    /**
     * Lists ExpressRoute gateways in a given resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ExpressRoute gateways.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteGatewayListInner listByResourceGroup(String resourceGroupName);

    /**
     * Lists ExpressRoute gateways in a given resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ExpressRoute gateways.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExpressRouteGatewayListInner> listByResourceGroupWithResponse(String resourceGroupName, Context context);

    /**
     * Creates or updates a ExpressRoute gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param putExpressRouteGatewayParameters Parameters required in an ExpressRoute gateway PUT operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRouteGatewayInner>, ExpressRouteGatewayInner> beginCreateOrUpdate(
        String resourceGroupName,
        String expressRouteGatewayName,
        ExpressRouteGatewayInner putExpressRouteGatewayParameters);

    /**
     * Creates or updates a ExpressRoute gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param putExpressRouteGatewayParameters Parameters required in an ExpressRoute gateway PUT operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRouteGatewayInner>, ExpressRouteGatewayInner> beginCreateOrUpdate(
        String resourceGroupName,
        String expressRouteGatewayName,
        ExpressRouteGatewayInner putExpressRouteGatewayParameters,
        Context context);

    /**
     * Creates or updates a ExpressRoute gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param putExpressRouteGatewayParameters Parameters required in an ExpressRoute gateway PUT operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteGatewayInner createOrUpdate(
        String resourceGroupName,
        String expressRouteGatewayName,
        ExpressRouteGatewayInner putExpressRouteGatewayParameters);

    /**
     * Creates or updates a ExpressRoute gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param putExpressRouteGatewayParameters Parameters required in an ExpressRoute gateway PUT operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteGatewayInner createOrUpdate(
        String resourceGroupName,
        String expressRouteGatewayName,
        ExpressRouteGatewayInner putExpressRouteGatewayParameters,
        Context context);

    /**
     * Updates express route gateway tags.
     *
     * @param resourceGroupName The resource group name of the ExpressRouteGateway.
     * @param expressRouteGatewayName The name of the gateway.
     * @param expressRouteGatewayParameters Parameters supplied to update a virtual wan express route gateway tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRouteGatewayInner>, ExpressRouteGatewayInner> beginUpdateTags(
        String resourceGroupName, String expressRouteGatewayName, TagsObject expressRouteGatewayParameters);

    /**
     * Updates express route gateway tags.
     *
     * @param resourceGroupName The resource group name of the ExpressRouteGateway.
     * @param expressRouteGatewayName The name of the gateway.
     * @param expressRouteGatewayParameters Parameters supplied to update a virtual wan express route gateway tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRouteGatewayInner>, ExpressRouteGatewayInner> beginUpdateTags(
        String resourceGroupName,
        String expressRouteGatewayName,
        TagsObject expressRouteGatewayParameters,
        Context context);

    /**
     * Updates express route gateway tags.
     *
     * @param resourceGroupName The resource group name of the ExpressRouteGateway.
     * @param expressRouteGatewayName The name of the gateway.
     * @param expressRouteGatewayParameters Parameters supplied to update a virtual wan express route gateway tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteGatewayInner updateTags(
        String resourceGroupName, String expressRouteGatewayName, TagsObject expressRouteGatewayParameters);

    /**
     * Updates express route gateway tags.
     *
     * @param resourceGroupName The resource group name of the ExpressRouteGateway.
     * @param expressRouteGatewayName The name of the gateway.
     * @param expressRouteGatewayParameters Parameters supplied to update a virtual wan express route gateway tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteGatewayInner updateTags(
        String resourceGroupName,
        String expressRouteGatewayName,
        TagsObject expressRouteGatewayParameters,
        Context context);

    /**
     * Fetches the details of a ExpressRoute gateway in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteGatewayInner getByResourceGroup(String resourceGroupName, String expressRouteGatewayName);

    /**
     * Fetches the details of a ExpressRoute gateway in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExpressRouteGatewayInner> getByResourceGroupWithResponse(
        String resourceGroupName, String expressRouteGatewayName, Context context);

    /**
     * Deletes the specified ExpressRoute gateway in a resource group. An ExpressRoute gateway resource can only be
     * deleted when there are no connection subresources.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String expressRouteGatewayName);

    /**
     * Deletes the specified ExpressRoute gateway in a resource group. An ExpressRoute gateway resource can only be
     * deleted when there are no connection subresources.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String expressRouteGatewayName, Context context);

    /**
     * Deletes the specified ExpressRoute gateway in a resource group. An ExpressRoute gateway resource can only be
     * deleted when there are no connection subresources.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String expressRouteGatewayName);

    /**
     * Deletes the specified ExpressRoute gateway in a resource group. An ExpressRoute gateway resource can only be
     * deleted when there are no connection subresources.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String expressRouteGatewayName, Context context);
}
