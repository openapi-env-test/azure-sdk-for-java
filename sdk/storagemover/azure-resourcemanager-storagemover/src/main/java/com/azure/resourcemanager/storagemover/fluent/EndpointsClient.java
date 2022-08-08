// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.storagemover.fluent.models.EndpointInner;
import com.azure.resourcemanager.storagemover.models.EndpointBaseUpdateParameters;

/** An instance of this class provides access to all the operations defined in EndpointsClient. */
public interface EndpointsClient {
    /**
     * Lists all Endpoints in a Storage Mover.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Endpoints as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EndpointInner> list(String resourceGroupName, String storageMoverName);

    /**
     * Lists all Endpoints in a Storage Mover.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Endpoints as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EndpointInner> list(String resourceGroupName, String storageMoverName, Context context);

    /**
     * Gets an Endpoint resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param endpointName The name of the Endpoint resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Endpoint resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EndpointInner get(String resourceGroupName, String storageMoverName, String endpointName);

    /**
     * Gets an Endpoint resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param endpointName The name of the Endpoint resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Endpoint resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EndpointInner> getWithResponse(
        String resourceGroupName, String storageMoverName, String endpointName, Context context);

    /**
     * Creates or updates an Endpoint resource, which represents a data transfer source or destination.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param endpointName The name of the Endpoint resource.
     * @param endpointParam The Endpoint resource, which contains information about file sources and targets.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Endpoint resource, which contains information about file sources and targets.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EndpointInner createOrUpdate(
        String resourceGroupName, String storageMoverName, String endpointName, EndpointInner endpointParam);

    /**
     * Creates or updates an Endpoint resource, which represents a data transfer source or destination.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param endpointName The name of the Endpoint resource.
     * @param endpointParam The Endpoint resource, which contains information about file sources and targets.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Endpoint resource, which contains information about file sources and targets along with {@link
     *     Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EndpointInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String storageMoverName,
        String endpointName,
        EndpointInner endpointParam,
        Context context);

    /**
     * Updates properties for an Endpoint resource. Properties not specified in the request body will be unchanged.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param endpointName The name of the Endpoint resource.
     * @param endpointParam The Endpoint resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Endpoint resource, which contains information about file sources and targets.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EndpointInner update(
        String resourceGroupName,
        String storageMoverName,
        String endpointName,
        EndpointBaseUpdateParameters endpointParam);

    /**
     * Updates properties for an Endpoint resource. Properties not specified in the request body will be unchanged.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param endpointName The name of the Endpoint resource.
     * @param endpointParam The Endpoint resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Endpoint resource, which contains information about file sources and targets along with {@link
     *     Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EndpointInner> updateWithResponse(
        String resourceGroupName,
        String storageMoverName,
        String endpointName,
        EndpointBaseUpdateParameters endpointParam,
        Context context);

    /**
     * Deletes an Endpoint resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param endpointName The name of the Endpoint resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String storageMoverName, String endpointName);

    /**
     * Deletes an Endpoint resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param endpointName The name of the Endpoint resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String storageMoverName, String endpointName, Context context);

    /**
     * Deletes an Endpoint resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param endpointName The name of the Endpoint resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String storageMoverName, String endpointName);

    /**
     * Deletes an Endpoint resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param endpointName The name of the Endpoint resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String storageMoverName, String endpointName, Context context);
}
