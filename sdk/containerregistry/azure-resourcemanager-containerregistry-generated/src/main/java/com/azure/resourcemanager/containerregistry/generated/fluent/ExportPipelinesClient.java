// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.ExportPipelineInner;

/** An instance of this class provides access to all the operations defined in ExportPipelinesClient. */
public interface ExportPipelinesClient {
    /**
     * Lists all export pipelines for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list export pipelines for a container registry as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExportPipelineInner> list(String resourceGroupName, String registryName);

    /**
     * Lists all export pipelines for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list export pipelines for a container registry as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExportPipelineInner> list(String resourceGroupName, String registryName, Context context);

    /**
     * Gets the properties of the export pipeline.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param exportPipelineName The name of the export pipeline.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the export pipeline along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExportPipelineInner> getWithResponse(
        String resourceGroupName, String registryName, String exportPipelineName, Context context);

    /**
     * Gets the properties of the export pipeline.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param exportPipelineName The name of the export pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the export pipeline.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExportPipelineInner get(String resourceGroupName, String registryName, String exportPipelineName);

    /**
     * Creates an export pipeline for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param exportPipelineName The name of the export pipeline.
     * @param exportPipelineCreateParameters The parameters for creating an export pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an object that represents an export pipeline for a container
     *     registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExportPipelineInner>, ExportPipelineInner> beginCreate(
        String resourceGroupName,
        String registryName,
        String exportPipelineName,
        ExportPipelineInner exportPipelineCreateParameters);

    /**
     * Creates an export pipeline for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param exportPipelineName The name of the export pipeline.
     * @param exportPipelineCreateParameters The parameters for creating an export pipeline.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an object that represents an export pipeline for a container
     *     registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExportPipelineInner>, ExportPipelineInner> beginCreate(
        String resourceGroupName,
        String registryName,
        String exportPipelineName,
        ExportPipelineInner exportPipelineCreateParameters,
        Context context);

    /**
     * Creates an export pipeline for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param exportPipelineName The name of the export pipeline.
     * @param exportPipelineCreateParameters The parameters for creating an export pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents an export pipeline for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExportPipelineInner create(
        String resourceGroupName,
        String registryName,
        String exportPipelineName,
        ExportPipelineInner exportPipelineCreateParameters);

    /**
     * Creates an export pipeline for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param exportPipelineName The name of the export pipeline.
     * @param exportPipelineCreateParameters The parameters for creating an export pipeline.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents an export pipeline for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExportPipelineInner create(
        String resourceGroupName,
        String registryName,
        String exportPipelineName,
        ExportPipelineInner exportPipelineCreateParameters,
        Context context);

    /**
     * Deletes an export pipeline from a container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param exportPipelineName The name of the export pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String registryName, String exportPipelineName);

    /**
     * Deletes an export pipeline from a container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param exportPipelineName The name of the export pipeline.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String registryName, String exportPipelineName, Context context);

    /**
     * Deletes an export pipeline from a container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param exportPipelineName The name of the export pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String registryName, String exportPipelineName);

    /**
     * Deletes an export pipeline from a container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param exportPipelineName The name of the export pipeline.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String registryName, String exportPipelineName, Context context);
}
