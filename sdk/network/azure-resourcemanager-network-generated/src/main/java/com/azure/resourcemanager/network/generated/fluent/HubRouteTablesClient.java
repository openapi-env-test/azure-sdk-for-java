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
import com.azure.resourcemanager.network.generated.fluent.models.HubRouteTableInner;

/** An instance of this class provides access to all the operations defined in HubRouteTablesClient. */
public interface HubRouteTablesClient {
    /**
     * Creates a RouteTable resource if it doesn't exist else updates the existing RouteTable.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the RouteTable.
     * @param routeTableParameters Parameters supplied to create or update RouteTable.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of routeTable resource in a virtual hub.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<HubRouteTableInner>, HubRouteTableInner> beginCreateOrUpdate(
        String resourceGroupName,
        String virtualHubName,
        String routeTableName,
        HubRouteTableInner routeTableParameters);

    /**
     * Creates a RouteTable resource if it doesn't exist else updates the existing RouteTable.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the RouteTable.
     * @param routeTableParameters Parameters supplied to create or update RouteTable.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of routeTable resource in a virtual hub.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<HubRouteTableInner>, HubRouteTableInner> beginCreateOrUpdate(
        String resourceGroupName,
        String virtualHubName,
        String routeTableName,
        HubRouteTableInner routeTableParameters,
        Context context);

    /**
     * Creates a RouteTable resource if it doesn't exist else updates the existing RouteTable.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the RouteTable.
     * @param routeTableParameters Parameters supplied to create or update RouteTable.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return routeTable resource in a virtual hub.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HubRouteTableInner createOrUpdate(
        String resourceGroupName,
        String virtualHubName,
        String routeTableName,
        HubRouteTableInner routeTableParameters);

    /**
     * Creates a RouteTable resource if it doesn't exist else updates the existing RouteTable.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the RouteTable.
     * @param routeTableParameters Parameters supplied to create or update RouteTable.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return routeTable resource in a virtual hub.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HubRouteTableInner createOrUpdate(
        String resourceGroupName,
        String virtualHubName,
        String routeTableName,
        HubRouteTableInner routeTableParameters,
        Context context);

    /**
     * Retrieves the details of a RouteTable.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the RouteTable.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return routeTable resource in a virtual hub.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HubRouteTableInner get(String resourceGroupName, String virtualHubName, String routeTableName);

    /**
     * Retrieves the details of a RouteTable.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the RouteTable.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return routeTable resource in a virtual hub along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<HubRouteTableInner> getWithResponse(
        String resourceGroupName, String virtualHubName, String routeTableName, Context context);

    /**
     * Deletes a RouteTable.
     *
     * @param resourceGroupName The resource group name of the RouteTable.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the RouteTable.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String virtualHubName, String routeTableName);

    /**
     * Deletes a RouteTable.
     *
     * @param resourceGroupName The resource group name of the RouteTable.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the RouteTable.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String virtualHubName, String routeTableName, Context context);

    /**
     * Deletes a RouteTable.
     *
     * @param resourceGroupName The resource group name of the RouteTable.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the RouteTable.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualHubName, String routeTableName);

    /**
     * Deletes a RouteTable.
     *
     * @param resourceGroupName The resource group name of the RouteTable.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the RouteTable.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualHubName, String routeTableName, Context context);

    /**
     * Retrieves the details of all RouteTables.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of RouteTables and a URL nextLink to get the next set of results as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HubRouteTableInner> list(String resourceGroupName, String virtualHubName);

    /**
     * Retrieves the details of all RouteTables.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of RouteTables and a URL nextLink to get the next set of results as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HubRouteTableInner> list(String resourceGroupName, String virtualHubName, Context context);
}
