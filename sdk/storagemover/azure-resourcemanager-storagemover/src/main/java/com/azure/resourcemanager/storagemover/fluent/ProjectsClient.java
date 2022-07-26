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
import com.azure.resourcemanager.storagemover.fluent.models.ProjectInner;
import com.azure.resourcemanager.storagemover.models.ProjectUpdateParameters;

/** An instance of this class provides access to all the operations defined in ProjectsClient. */
public interface ProjectsClient {
    /**
     * Lists all projects in a Storage Mover.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of project resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProjectInner> list(String resourceGroupName, String storageMoverName);

    /**
     * Lists all projects in a Storage Mover.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of project resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProjectInner> list(String resourceGroupName, String storageMoverName, Context context);

    /**
     * Gets a project resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the project resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a project resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProjectInner get(String resourceGroupName, String storageMoverName, String projectName);

    /**
     * Gets a project resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the project resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a project resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProjectInner> getWithResponse(
        String resourceGroupName, String storageMoverName, String projectName, Context context);

    /**
     * Creates or updates a project resource, which is a logical grouping of related jobs.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the project resource.
     * @param project The project resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the project resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProjectInner createOrUpdate(
        String resourceGroupName, String storageMoverName, String projectName, ProjectInner project);

    /**
     * Creates or updates a project resource, which is a logical grouping of related jobs.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the project resource.
     * @param project The project resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the project resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProjectInner> createOrUpdateWithResponse(
        String resourceGroupName, String storageMoverName, String projectName, ProjectInner project, Context context);

    /**
     * Updates properties for a project resource. Properties not specified in the request body will be unchanged.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the project resource.
     * @param project The project resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the project resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProjectInner update(
        String resourceGroupName, String storageMoverName, String projectName, ProjectUpdateParameters project);

    /**
     * Updates properties for a project resource. Properties not specified in the request body will be unchanged.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the project resource.
     * @param project The project resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the project resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProjectInner> updateWithResponse(
        String resourceGroupName,
        String storageMoverName,
        String projectName,
        ProjectUpdateParameters project,
        Context context);

    /**
     * Deletes a project resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the project resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String storageMoverName, String projectName);

    /**
     * Deletes a project resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the project resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String storageMoverName, String projectName, Context context);

    /**
     * Deletes a project resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the project resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String storageMoverName, String projectName);

    /**
     * Deletes a project resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the project resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String storageMoverName, String projectName, Context context);
}
