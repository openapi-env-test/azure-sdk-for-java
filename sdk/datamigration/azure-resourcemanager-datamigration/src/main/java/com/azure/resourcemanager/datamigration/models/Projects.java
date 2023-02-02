// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Projects. */
public interface Projects {
    /**
     * Get projects in a service
     *
     * <p>The project resource is a nested resource representing a stored migration project. This method returns a list
     * of projects owned by a service resource.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return oData page of project resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Project> list(String groupName, String serviceName);

    /**
     * Get projects in a service
     *
     * <p>The project resource is a nested resource representing a stored migration project. This method returns a list
     * of projects owned by a service resource.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return oData page of project resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Project> list(String groupName, String serviceName, Context context);

    /**
     * Get project information
     *
     * <p>The project resource is a nested resource representing a stored migration project. The GET method retrieves
     * information about a project.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a project resource along with {@link Response}.
     */
    Response<Project> getWithResponse(String groupName, String serviceName, String projectName, Context context);

    /**
     * Get project information
     *
     * <p>The project resource is a nested resource representing a stored migration project. The GET method retrieves
     * information about a project.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a project resource.
     */
    Project get(String groupName, String serviceName, String projectName);

    /**
     * Delete project
     *
     * <p>The project resource is a nested resource representing a stored migration project. The DELETE method deletes a
     * project.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @param deleteRunningTasks Delete the resource even if it contains running tasks.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String groupName, String serviceName, String projectName, Boolean deleteRunningTasks, Context context);

    /**
     * Delete project
     *
     * <p>The project resource is a nested resource representing a stored migration project. The DELETE method deletes a
     * project.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String groupName, String serviceName, String projectName);

    /**
     * Get project information
     *
     * <p>The project resource is a nested resource representing a stored migration project. The GET method retrieves
     * information about a project.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a project resource along with {@link Response}.
     */
    Project getById(String id);

    /**
     * Get project information
     *
     * <p>The project resource is a nested resource representing a stored migration project. The GET method retrieves
     * information about a project.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a project resource along with {@link Response}.
     */
    Response<Project> getByIdWithResponse(String id, Context context);

    /**
     * Delete project
     *
     * <p>The project resource is a nested resource representing a stored migration project. The DELETE method deletes a
     * project.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete project
     *
     * <p>The project resource is a nested resource representing a stored migration project. The DELETE method deletes a
     * project.
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
     * Begins definition for a new Project resource.
     *
     * @param name resource name.
     * @return the first stage of the new Project definition.
     */
    Project.DefinitionStages.Blank define(String name);
}
