// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.containerservicefleet.fluent.models.FleetCredentialResultsInner;
import com.azure.resourcemanager.containerservicefleet.fluent.models.FleetInner;
import com.azure.resourcemanager.containerservicefleet.models.FleetPatch;

/** An instance of this class provides access to all the operations defined in FleetsClient. */
public interface FleetsClient {
    /**
     * Lists fleets in the specified subscription.111.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Fleets operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FleetInner> list();

    /**
     * Lists fleets in the specified subscription.111.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Fleets operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FleetInner> list(Context context);

    /**
     * Lists fleets in the specified subscription and resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Fleets operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FleetInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists fleets in the specified subscription and resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Fleets operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FleetInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets a Fleet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Fleet along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FleetInner> getByResourceGroupWithResponse(String resourceGroupName, String fleetName, Context context);

    /**
     * Gets a Fleet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Fleet.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FleetInner getByResourceGroup(String resourceGroupName, String fleetName);

    /**
     * Creates or updates a Fleet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param parameters The Fleet to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Fleet resource which contains multiple Kubernetes clusters as
     *     its members.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<FleetInner>, FleetInner> beginCreateOrUpdate(
        String resourceGroupName, String fleetName, FleetInner parameters);

    /**
     * Creates or updates a Fleet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param parameters The Fleet to create or update.
     * @param ifMatch Omit this value to always overwrite the current resource. Specify the last-seen ETag value to
     *     prevent accidentally overwriting concurrent changes.
     * @param ifNoneMatch Set to '*' to allow a new resource to be created and prevent updating an existing resource.
     *     Other values will result in a 412 Pre-condition Failed response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Fleet resource which contains multiple Kubernetes clusters as
     *     its members.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<FleetInner>, FleetInner> beginCreateOrUpdate(
        String resourceGroupName,
        String fleetName,
        FleetInner parameters,
        String ifMatch,
        String ifNoneMatch,
        Context context);

    /**
     * Creates or updates a Fleet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param parameters The Fleet to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Fleet resource which contains multiple Kubernetes clusters as its members.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FleetInner createOrUpdate(String resourceGroupName, String fleetName, FleetInner parameters);

    /**
     * Creates or updates a Fleet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param parameters The Fleet to create or update.
     * @param ifMatch Omit this value to always overwrite the current resource. Specify the last-seen ETag value to
     *     prevent accidentally overwriting concurrent changes.
     * @param ifNoneMatch Set to '*' to allow a new resource to be created and prevent updating an existing resource.
     *     Other values will result in a 412 Pre-condition Failed response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Fleet resource which contains multiple Kubernetes clusters as its members.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FleetInner createOrUpdate(
        String resourceGroupName,
        String fleetName,
        FleetInner parameters,
        String ifMatch,
        String ifNoneMatch,
        Context context);

    /**
     * Patches a fleet resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param ifMatch Omit this value to always overwrite the current resource. Specify the last-seen ETag value to
     *     prevent accidentally overwriting concurrent changes.
     * @param parameters The properties of a Fleet to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Fleet resource which contains multiple Kubernetes clusters as its members along with {@link
     *     Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FleetInner> updateWithResponse(
        String resourceGroupName, String fleetName, String ifMatch, FleetPatch parameters, Context context);

    /**
     * Patches a fleet resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Fleet resource which contains multiple Kubernetes clusters as its members.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FleetInner update(String resourceGroupName, String fleetName);

    /**
     * Deletes a Fleet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String fleetName);

    /**
     * Deletes a Fleet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param ifMatch Omit this value to always overwrite the current resource. Specify the last-seen ETag value to
     *     prevent accidentally overwriting concurrent changes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String fleetName, String ifMatch, Context context);

    /**
     * Deletes a Fleet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String fleetName);

    /**
     * Deletes a Fleet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param ifMatch Omit this value to always overwrite the current resource. Specify the last-seen ETag value to
     *     prevent accidentally overwriting concurrent changes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String fleetName, String ifMatch, Context context);

    /**
     * Lists the user credentials of a Fleet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list credential result response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FleetCredentialResultsInner> listCredentialsWithResponse(
        String resourceGroupName, String fleetName, Context context);

    /**
     * Lists the user credentials of a Fleet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list credential result response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FleetCredentialResultsInner listCredentials(String resourceGroupName, String fleetName);
}
