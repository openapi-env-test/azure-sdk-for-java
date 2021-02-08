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
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitAuthorizationInner;

/**
 * An instance of this class provides access to all the operations defined in ExpressRouteCircuitAuthorizationsClient.
 */
public interface ExpressRouteCircuitAuthorizationsClient {
    /**
     * Deletes the specified authorization from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String circuitName, String authorizationName);

    /**
     * Deletes the specified authorization from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String circuitName, String authorizationName, Context context);

    /**
     * Deletes the specified authorization from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String circuitName, String authorizationName);

    /**
     * Deletes the specified authorization from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String circuitName, String authorizationName, Context context);

    /**
     * Gets the specified authorization from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified authorization from the specified express route circuit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitAuthorizationInner get(String resourceGroupName, String circuitName, String authorizationName);

    /**
     * Gets the specified authorization from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified authorization from the specified express route circuit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExpressRouteCircuitAuthorizationInner> getWithResponse(
        String resourceGroupName, String circuitName, String authorizationName, Context context);

    /**
     * Creates or updates an authorization in the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @param authorizationParameters Parameters supplied to the create or update express route circuit authorization
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return authorization in an ExpressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ExpressRouteCircuitAuthorizationInner>, ExpressRouteCircuitAuthorizationInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String circuitName,
            String authorizationName,
            ExpressRouteCircuitAuthorizationInner authorizationParameters);

    /**
     * Creates or updates an authorization in the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @param authorizationParameters Parameters supplied to the create or update express route circuit authorization
     *     operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return authorization in an ExpressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ExpressRouteCircuitAuthorizationInner>, ExpressRouteCircuitAuthorizationInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String circuitName,
            String authorizationName,
            ExpressRouteCircuitAuthorizationInner authorizationParameters,
            Context context);

    /**
     * Creates or updates an authorization in the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @param authorizationParameters Parameters supplied to the create or update express route circuit authorization
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return authorization in an ExpressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitAuthorizationInner createOrUpdate(
        String resourceGroupName,
        String circuitName,
        String authorizationName,
        ExpressRouteCircuitAuthorizationInner authorizationParameters);

    /**
     * Creates or updates an authorization in the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @param authorizationParameters Parameters supplied to the create or update express route circuit authorization
     *     operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return authorization in an ExpressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitAuthorizationInner createOrUpdate(
        String resourceGroupName,
        String circuitName,
        String authorizationName,
        ExpressRouteCircuitAuthorizationInner authorizationParameters,
        Context context);

    /**
     * Gets all authorizations in an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all authorizations in an express route circuit.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRouteCircuitAuthorizationInner> list(String resourceGroupName, String circuitName);

    /**
     * Gets all authorizations in an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all authorizations in an express route circuit.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRouteCircuitAuthorizationInner> list(
        String resourceGroupName, String circuitName, Context context);
}
