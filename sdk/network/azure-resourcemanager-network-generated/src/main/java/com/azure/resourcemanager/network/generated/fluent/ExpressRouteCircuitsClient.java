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
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitStatsInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitsArpTableListResultInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitsRoutesTableListResultInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitsRoutesTableSummaryListResultInner;
import com.azure.resourcemanager.network.generated.models.TagsObject;

/** An instance of this class provides access to all the operations defined in ExpressRouteCircuitsClient. */
public interface ExpressRouteCircuitsClient {
    /**
     * Deletes the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String circuitName);

    /**
     * Deletes the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String circuitName, Context context);

    /**
     * Deletes the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String circuitName);

    /**
     * Deletes the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String circuitName, Context context);

    /**
     * Gets information about the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of express route circuit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified express route circuit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitInner getByResourceGroup(String resourceGroupName, String circuitName);

    /**
     * Gets information about the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of express route circuit.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified express route circuit along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExpressRouteCircuitInner> getByResourceGroupWithResponse(
        String resourceGroupName, String circuitName, Context context);

    /**
     * Creates or updates an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param parameters Parameters supplied to the create or update express route circuit operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of expressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRouteCircuitInner>, ExpressRouteCircuitInner> beginCreateOrUpdate(
        String resourceGroupName, String circuitName, ExpressRouteCircuitInner parameters);

    /**
     * Creates or updates an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param parameters Parameters supplied to the create or update express route circuit operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of expressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRouteCircuitInner>, ExpressRouteCircuitInner> beginCreateOrUpdate(
        String resourceGroupName, String circuitName, ExpressRouteCircuitInner parameters, Context context);

    /**
     * Creates or updates an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param parameters Parameters supplied to the create or update express route circuit operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitInner createOrUpdate(
        String resourceGroupName, String circuitName, ExpressRouteCircuitInner parameters);

    /**
     * Creates or updates an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param parameters Parameters supplied to the create or update express route circuit operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitInner createOrUpdate(
        String resourceGroupName, String circuitName, ExpressRouteCircuitInner parameters, Context context);

    /**
     * Updates an express route circuit tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param parameters Parameters supplied to update express route circuit tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitInner updateTags(String resourceGroupName, String circuitName, TagsObject parameters);

    /**
     * Updates an express route circuit tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param parameters Parameters supplied to update express route circuit tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteCircuit resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExpressRouteCircuitInner> updateTagsWithResponse(
        String resourceGroupName, String circuitName, TagsObject parameters, Context context);

    /**
     * Gets the currently advertised ARP table associated with the express route circuit in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the currently advertised ARP table associated with the express
     *     route circuit in a resource group.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRouteCircuitsArpTableListResultInner>, ExpressRouteCircuitsArpTableListResultInner>
        beginListArpTable(String resourceGroupName, String circuitName, String peeringName, String devicePath);

    /**
     * Gets the currently advertised ARP table associated with the express route circuit in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the currently advertised ARP table associated with the express
     *     route circuit in a resource group.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRouteCircuitsArpTableListResultInner>, ExpressRouteCircuitsArpTableListResultInner>
        beginListArpTable(
            String resourceGroupName, String circuitName, String peeringName, String devicePath, Context context);

    /**
     * Gets the currently advertised ARP table associated with the express route circuit in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the currently advertised ARP table associated with the express route circuit in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitsArpTableListResultInner listArpTable(
        String resourceGroupName, String circuitName, String peeringName, String devicePath);

    /**
     * Gets the currently advertised ARP table associated with the express route circuit in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the currently advertised ARP table associated with the express route circuit in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitsArpTableListResultInner listArpTable(
        String resourceGroupName, String circuitName, String peeringName, String devicePath, Context context);

    /**
     * Gets the currently advertised routes table associated with the express route circuit in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the currently advertised routes table associated with the express
     *     route circuit in a resource group.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<
            PollResult<ExpressRouteCircuitsRoutesTableListResultInner>, ExpressRouteCircuitsRoutesTableListResultInner>
        beginListRoutesTable(String resourceGroupName, String circuitName, String peeringName, String devicePath);

    /**
     * Gets the currently advertised routes table associated with the express route circuit in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the currently advertised routes table associated with the express
     *     route circuit in a resource group.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<
            PollResult<ExpressRouteCircuitsRoutesTableListResultInner>, ExpressRouteCircuitsRoutesTableListResultInner>
        beginListRoutesTable(
            String resourceGroupName, String circuitName, String peeringName, String devicePath, Context context);

    /**
     * Gets the currently advertised routes table associated with the express route circuit in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the currently advertised routes table associated with the express route circuit in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitsRoutesTableListResultInner listRoutesTable(
        String resourceGroupName, String circuitName, String peeringName, String devicePath);

    /**
     * Gets the currently advertised routes table associated with the express route circuit in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the currently advertised routes table associated with the express route circuit in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitsRoutesTableListResultInner listRoutesTable(
        String resourceGroupName, String circuitName, String peeringName, String devicePath, Context context);

    /**
     * Gets the currently advertised routes table summary associated with the express route circuit in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the currently advertised routes table summary associated with the
     *     express route circuit in a resource group.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<
            PollResult<ExpressRouteCircuitsRoutesTableSummaryListResultInner>,
            ExpressRouteCircuitsRoutesTableSummaryListResultInner>
        beginListRoutesTableSummary(
            String resourceGroupName, String circuitName, String peeringName, String devicePath);

    /**
     * Gets the currently advertised routes table summary associated with the express route circuit in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the currently advertised routes table summary associated with the
     *     express route circuit in a resource group.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<
            PollResult<ExpressRouteCircuitsRoutesTableSummaryListResultInner>,
            ExpressRouteCircuitsRoutesTableSummaryListResultInner>
        beginListRoutesTableSummary(
            String resourceGroupName, String circuitName, String peeringName, String devicePath, Context context);

    /**
     * Gets the currently advertised routes table summary associated with the express route circuit in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the currently advertised routes table summary associated with the express route circuit in a resource
     *     group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitsRoutesTableSummaryListResultInner listRoutesTableSummary(
        String resourceGroupName, String circuitName, String peeringName, String devicePath);

    /**
     * Gets the currently advertised routes table summary associated with the express route circuit in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the currently advertised routes table summary associated with the express route circuit in a resource
     *     group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitsRoutesTableSummaryListResultInner listRoutesTableSummary(
        String resourceGroupName, String circuitName, String peeringName, String devicePath, Context context);

    /**
     * Gets all the stats from an express route circuit in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the stats from an express route circuit in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitStatsInner getStats(String resourceGroupName, String circuitName);

    /**
     * Gets all the stats from an express route circuit in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the stats from an express route circuit in a resource group along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExpressRouteCircuitStatsInner> getStatsWithResponse(
        String resourceGroupName, String circuitName, Context context);

    /**
     * Gets all stats from an express route circuit in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all stats from an express route circuit in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitStatsInner getPeeringStats(String resourceGroupName, String circuitName, String peeringName);

    /**
     * Gets all stats from an express route circuit in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all stats from an express route circuit in a resource group along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExpressRouteCircuitStatsInner> getPeeringStatsWithResponse(
        String resourceGroupName, String circuitName, String peeringName, Context context);

    /**
     * Gets all the express route circuits in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the express route circuits in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRouteCircuitInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all the express route circuits in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the express route circuits in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRouteCircuitInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all the express route circuits in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the express route circuits in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRouteCircuitInner> list();

    /**
     * Gets all the express route circuits in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the express route circuits in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRouteCircuitInner> list(Context context);
}
