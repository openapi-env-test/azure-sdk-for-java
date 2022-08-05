// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybriddatamanager.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Jobs. */
public interface Jobs {
    /**
     * This method gets all the jobs of a given job definition.
     *
     * @param dataServiceName The name of the data service of the job definition.
     * @param jobDefinitionName The name of the job definition for which jobs are needed.
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job Collection as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Job> listByJobDefinition(
        String dataServiceName, String jobDefinitionName, String resourceGroupName, String dataManagerName);

    /**
     * This method gets all the jobs of a given job definition.
     *
     * @param dataServiceName The name of the data service of the job definition.
     * @param jobDefinitionName The name of the job definition for which jobs are needed.
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @param filter OData Filter options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job Collection as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Job> listByJobDefinition(
        String dataServiceName,
        String jobDefinitionName,
        String resourceGroupName,
        String dataManagerName,
        String filter,
        Context context);

    /**
     * This method gets a data manager job given the jobId.
     *
     * @param dataServiceName The name of the data service of the job definition.
     * @param jobDefinitionName The name of the job definition of the job.
     * @param jobId The job id of the job queried.
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data service job.
     */
    Job get(
        String dataServiceName,
        String jobDefinitionName,
        String jobId,
        String resourceGroupName,
        String dataManagerName);

    /**
     * This method gets a data manager job given the jobId.
     *
     * @param dataServiceName The name of the data service of the job definition.
     * @param jobDefinitionName The name of the job definition of the job.
     * @param jobId The job id of the job queried.
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @param expand $expand is supported on details parameter for job, which provides details on the job stages.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data service job along with {@link Response}.
     */
    Response<Job> getWithResponse(
        String dataServiceName,
        String jobDefinitionName,
        String jobId,
        String resourceGroupName,
        String dataManagerName,
        String expand,
        Context context);

    /**
     * Cancels the given job.
     *
     * @param dataServiceName The name of the data service of the job definition.
     * @param jobDefinitionName The name of the job definition of the job.
     * @param jobId The job id of the job queried.
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void cancel(
        String dataServiceName,
        String jobDefinitionName,
        String jobId,
        String resourceGroupName,
        String dataManagerName);

    /**
     * Cancels the given job.
     *
     * @param dataServiceName The name of the data service of the job definition.
     * @param jobDefinitionName The name of the job definition of the job.
     * @param jobId The job id of the job queried.
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void cancel(
        String dataServiceName,
        String jobDefinitionName,
        String jobId,
        String resourceGroupName,
        String dataManagerName,
        Context context);

    /**
     * Resumes the given job.
     *
     * @param dataServiceName The name of the data service of the job definition.
     * @param jobDefinitionName The name of the job definition of the job.
     * @param jobId The job id of the job queried.
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resume(
        String dataServiceName,
        String jobDefinitionName,
        String jobId,
        String resourceGroupName,
        String dataManagerName);

    /**
     * Resumes the given job.
     *
     * @param dataServiceName The name of the data service of the job definition.
     * @param jobDefinitionName The name of the job definition of the job.
     * @param jobId The job id of the job queried.
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resume(
        String dataServiceName,
        String jobDefinitionName,
        String jobId,
        String resourceGroupName,
        String dataManagerName,
        Context context);

    /**
     * This method gets all the jobs of a data service type in a given resource.
     *
     * @param dataServiceName The name of the data service of interest.
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job Collection as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Job> listByDataService(String dataServiceName, String resourceGroupName, String dataManagerName);

    /**
     * This method gets all the jobs of a data service type in a given resource.
     *
     * @param dataServiceName The name of the data service of interest.
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @param filter OData Filter options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job Collection as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Job> listByDataService(
        String dataServiceName, String resourceGroupName, String dataManagerName, String filter, Context context);

    /**
     * This method gets all the jobs at the data manager resource level.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job Collection as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Job> listByDataManager(String resourceGroupName, String dataManagerName);

    /**
     * This method gets all the jobs at the data manager resource level.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @param filter OData Filter options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job Collection as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Job> listByDataManager(
        String resourceGroupName, String dataManagerName, String filter, Context context);
}
