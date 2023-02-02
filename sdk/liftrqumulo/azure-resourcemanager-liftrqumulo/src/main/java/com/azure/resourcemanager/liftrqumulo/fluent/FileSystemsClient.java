// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.liftrqumulo.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.liftrqumulo.fluent.models.FileSystemResourceInner;
import com.azure.resourcemanager.liftrqumulo.models.FileSystemResourceUpdate;

/** An instance of this class provides access to all the operations defined in FileSystemsClient. */
public interface FileSystemsClient {
    /**
     * List FileSystemResource resources by subscription ID.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a FileSystemResource list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FileSystemResourceInner> list();

    /**
     * List FileSystemResource resources by subscription ID.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a FileSystemResource list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FileSystemResourceInner> list(Context context);

    /**
     * List FileSystemResource resources by resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a FileSystemResource list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FileSystemResourceInner> listByResourceGroup(String resourceGroupName);

    /**
     * List FileSystemResource resources by resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a FileSystemResource list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FileSystemResourceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get a FileSystemResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fileSystemName Name of the File System resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a FileSystemResource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FileSystemResourceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String fileSystemName, Context context);

    /**
     * Get a FileSystemResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fileSystemName Name of the File System resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a FileSystemResource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FileSystemResourceInner getByResourceGroup(String resourceGroupName, String fileSystemName);

    /**
     * Create a FileSystemResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fileSystemName Name of the File System resource.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a FileSystem Resource by Qumulo.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<FileSystemResourceInner>, FileSystemResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String fileSystemName, FileSystemResourceInner resource);

    /**
     * Create a FileSystemResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fileSystemName Name of the File System resource.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a FileSystem Resource by Qumulo.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<FileSystemResourceInner>, FileSystemResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String fileSystemName, FileSystemResourceInner resource, Context context);

    /**
     * Create a FileSystemResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fileSystemName Name of the File System resource.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a FileSystem Resource by Qumulo.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FileSystemResourceInner createOrUpdate(
        String resourceGroupName, String fileSystemName, FileSystemResourceInner resource);

    /**
     * Create a FileSystemResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fileSystemName Name of the File System resource.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a FileSystem Resource by Qumulo.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FileSystemResourceInner createOrUpdate(
        String resourceGroupName, String fileSystemName, FileSystemResourceInner resource, Context context);

    /**
     * Update a FileSystemResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fileSystemName Name of the File System resource.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a FileSystem Resource by Qumulo along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FileSystemResourceInner> updateWithResponse(
        String resourceGroupName, String fileSystemName, FileSystemResourceUpdate properties, Context context);

    /**
     * Update a FileSystemResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fileSystemName Name of the File System resource.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a FileSystem Resource by Qumulo.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FileSystemResourceInner update(
        String resourceGroupName, String fileSystemName, FileSystemResourceUpdate properties);

    /**
     * Delete a FileSystemResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fileSystemName Name of the File System resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String fileSystemName);

    /**
     * Delete a FileSystemResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fileSystemName Name of the File System resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String fileSystemName, Context context);

    /**
     * Delete a FileSystemResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fileSystemName Name of the File System resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String fileSystemName);

    /**
     * Delete a FileSystemResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fileSystemName Name of the File System resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String fileSystemName, Context context);
}
