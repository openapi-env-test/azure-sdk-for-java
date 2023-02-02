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
import com.azure.resourcemanager.containerregistry.generated.fluent.models.TaskRunInner;
import com.azure.resourcemanager.containerregistry.generated.models.TaskRunUpdateParameters;

/** An instance of this class provides access to all the operations defined in TaskRunsClient. */
public interface TaskRunsClient {
    /**
     * Gets the detailed information for a given task run.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param taskRunName The name of the task run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the detailed information for a given task run along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TaskRunInner> getWithResponse(
        String resourceGroupName, String registryName, String taskRunName, Context context);

    /**
     * Gets the detailed information for a given task run.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param taskRunName The name of the task run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the detailed information for a given task run.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TaskRunInner get(String resourceGroupName, String registryName, String taskRunName);

    /**
     * Creates a task run for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param taskRunName The name of the task run.
     * @param taskRun The parameters of a run that needs to scheduled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the task run that has the ARM resource and properties.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<TaskRunInner>, TaskRunInner> beginCreate(
        String resourceGroupName, String registryName, String taskRunName, TaskRunInner taskRun);

    /**
     * Creates a task run for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param taskRunName The name of the task run.
     * @param taskRun The parameters of a run that needs to scheduled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the task run that has the ARM resource and properties.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<TaskRunInner>, TaskRunInner> beginCreate(
        String resourceGroupName, String registryName, String taskRunName, TaskRunInner taskRun, Context context);

    /**
     * Creates a task run for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param taskRunName The name of the task run.
     * @param taskRun The parameters of a run that needs to scheduled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the task run that has the ARM resource and properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TaskRunInner create(String resourceGroupName, String registryName, String taskRunName, TaskRunInner taskRun);

    /**
     * Creates a task run for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param taskRunName The name of the task run.
     * @param taskRun The parameters of a run that needs to scheduled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the task run that has the ARM resource and properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TaskRunInner create(
        String resourceGroupName, String registryName, String taskRunName, TaskRunInner taskRun, Context context);

    /**
     * Deletes a specified task run resource.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param taskRunName The name of the task run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String registryName, String taskRunName);

    /**
     * Deletes a specified task run resource.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param taskRunName The name of the task run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String registryName, String taskRunName, Context context);

    /**
     * Deletes a specified task run resource.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param taskRunName The name of the task run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String registryName, String taskRunName);

    /**
     * Deletes a specified task run resource.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param taskRunName The name of the task run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String registryName, String taskRunName, Context context);

    /**
     * Updates a task run with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param taskRunName The name of the task run.
     * @param updateParameters The parameters for updating a task run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the task run that has the ARM resource and properties.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<TaskRunInner>, TaskRunInner> beginUpdate(
        String resourceGroupName, String registryName, String taskRunName, TaskRunUpdateParameters updateParameters);

    /**
     * Updates a task run with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param taskRunName The name of the task run.
     * @param updateParameters The parameters for updating a task run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the task run that has the ARM resource and properties.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<TaskRunInner>, TaskRunInner> beginUpdate(
        String resourceGroupName,
        String registryName,
        String taskRunName,
        TaskRunUpdateParameters updateParameters,
        Context context);

    /**
     * Updates a task run with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param taskRunName The name of the task run.
     * @param updateParameters The parameters for updating a task run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the task run that has the ARM resource and properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TaskRunInner update(
        String resourceGroupName, String registryName, String taskRunName, TaskRunUpdateParameters updateParameters);

    /**
     * Updates a task run with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param taskRunName The name of the task run.
     * @param updateParameters The parameters for updating a task run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the task run that has the ARM resource and properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TaskRunInner update(
        String resourceGroupName,
        String registryName,
        String taskRunName,
        TaskRunUpdateParameters updateParameters,
        Context context);

    /**
     * Gets the detailed information for a given task run that includes all secrets.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param taskRunName The name of the task run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the detailed information for a given task run that includes all secrets along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TaskRunInner> getDetailsWithResponse(
        String resourceGroupName, String registryName, String taskRunName, Context context);

    /**
     * Gets the detailed information for a given task run that includes all secrets.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param taskRunName The name of the task run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the detailed information for a given task run that includes all secrets.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TaskRunInner getDetails(String resourceGroupName, String registryName, String taskRunName);

    /**
     * Lists all the task runs for a specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the collection of task runs as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TaskRunInner> list(String resourceGroupName, String registryName);

    /**
     * Lists all the task runs for a specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the collection of task runs as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TaskRunInner> list(String resourceGroupName, String registryName, Context context);
}
