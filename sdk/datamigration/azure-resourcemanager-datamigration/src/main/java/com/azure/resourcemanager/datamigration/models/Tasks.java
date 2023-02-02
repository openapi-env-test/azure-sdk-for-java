// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.datamigration.fluent.models.CommandPropertiesInner;

/** Resource collection API of Tasks. */
public interface Tasks {
    /**
     * Get tasks in a service
     *
     * <p>The services resource is the top-level resource that represents the Database Migration Service. This method
     * returns a list of tasks owned by a service resource. Some tasks may have a status of Unknown, which indicates
     * that an error occurred while querying the status of that task.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return oData page of tasks as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ProjectTask> list(String groupName, String serviceName, String projectName);

    /**
     * Get tasks in a service
     *
     * <p>The services resource is the top-level resource that represents the Database Migration Service. This method
     * returns a list of tasks owned by a service resource. Some tasks may have a status of Unknown, which indicates
     * that an error occurred while querying the status of that task.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @param taskType Filter tasks by task type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return oData page of tasks as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ProjectTask> list(
        String groupName, String serviceName, String projectName, String taskType, Context context);

    /**
     * Get task information
     *
     * <p>The tasks resource is a nested, proxy-only resource representing work performed by a DMS instance. The GET
     * method retrieves information about a task.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @param taskName Name of the Task.
     * @param expand Expand the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a task resource along with {@link Response}.
     */
    Response<ProjectTask> getWithResponse(
        String groupName, String serviceName, String projectName, String taskName, String expand, Context context);

    /**
     * Get task information
     *
     * <p>The tasks resource is a nested, proxy-only resource representing work performed by a DMS instance. The GET
     * method retrieves information about a task.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @param taskName Name of the Task.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a task resource.
     */
    ProjectTask get(String groupName, String serviceName, String projectName, String taskName);

    /**
     * Delete task
     *
     * <p>The tasks resource is a nested, proxy-only resource representing work performed by a DMS instance. The DELETE
     * method deletes a task, canceling it first if it's running.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @param taskName Name of the Task.
     * @param deleteRunningTasks Delete the resource even if it contains running tasks.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String groupName,
        String serviceName,
        String projectName,
        String taskName,
        Boolean deleteRunningTasks,
        Context context);

    /**
     * Delete task
     *
     * <p>The tasks resource is a nested, proxy-only resource representing work performed by a DMS instance. The DELETE
     * method deletes a task, canceling it first if it's running.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @param taskName Name of the Task.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String groupName, String serviceName, String projectName, String taskName);

    /**
     * Cancel a task
     *
     * <p>The tasks resource is a nested, proxy-only resource representing work performed by a DMS instance. This method
     * cancels a task if it's currently queued or running.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @param taskName Name of the Task.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a task resource along with {@link Response}.
     */
    Response<ProjectTask> cancelWithResponse(
        String groupName, String serviceName, String projectName, String taskName, Context context);

    /**
     * Cancel a task
     *
     * <p>The tasks resource is a nested, proxy-only resource representing work performed by a DMS instance. This method
     * cancels a task if it's currently queued or running.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @param taskName Name of the Task.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a task resource.
     */
    ProjectTask cancel(String groupName, String serviceName, String projectName, String taskName);

    /**
     * Execute a command on a task
     *
     * <p>The tasks resource is a nested, proxy-only resource representing work performed by a DMS instance. This method
     * executes a command on a running task.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @param taskName Name of the Task.
     * @param parameters Command to execute.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for all types of DMS command properties along with {@link Response}.
     */
    Response<CommandProperties> commandWithResponse(
        String groupName,
        String serviceName,
        String projectName,
        String taskName,
        CommandPropertiesInner parameters,
        Context context);

    /**
     * Execute a command on a task
     *
     * <p>The tasks resource is a nested, proxy-only resource representing work performed by a DMS instance. This method
     * executes a command on a running task.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @param taskName Name of the Task.
     * @param parameters Command to execute.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for all types of DMS command properties.
     */
    CommandProperties command(
        String groupName, String serviceName, String projectName, String taskName, CommandPropertiesInner parameters);

    /**
     * Get task information
     *
     * <p>The tasks resource is a nested, proxy-only resource representing work performed by a DMS instance. The GET
     * method retrieves information about a task.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a task resource along with {@link Response}.
     */
    ProjectTask getById(String id);

    /**
     * Get task information
     *
     * <p>The tasks resource is a nested, proxy-only resource representing work performed by a DMS instance. The GET
     * method retrieves information about a task.
     *
     * @param id the resource ID.
     * @param expand Expand the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a task resource along with {@link Response}.
     */
    Response<ProjectTask> getByIdWithResponse(String id, String expand, Context context);

    /**
     * Delete task
     *
     * <p>The tasks resource is a nested, proxy-only resource representing work performed by a DMS instance. The DELETE
     * method deletes a task, canceling it first if it's running.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete task
     *
     * <p>The tasks resource is a nested, proxy-only resource representing work performed by a DMS instance. The DELETE
     * method deletes a task, canceling it first if it's running.
     *
     * @param id the resource ID.
     * @param deleteRunningTasks Delete the resource even if it contains running tasks.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Boolean deleteRunningTasks, Context context);

    /**
     * Begins definition for a new ProjectTask resource.
     *
     * @param name resource name.
     * @return the first stage of the new ProjectTask definition.
     */
    ProjectTask.DefinitionStages.Blank define(String name);
}
