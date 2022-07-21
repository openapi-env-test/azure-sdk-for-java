// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.time.OffsetDateTime;
import java.util.UUID;

/** Resource collection API of JobTargetExecutions. */
public interface JobTargetExecutions {
    /**
     * Lists target executions for all steps of a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The id of the job execution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of job executions as paginated response with {@link PagedIterable}.
     */
    PagedIterable<JobExecution> listByJobExecution(
        String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId);

    /**
     * Lists target executions for all steps of a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The id of the job execution.
     * @param createTimeMin If specified, only job executions created at or after the specified time are included.
     * @param createTimeMax If specified, only job executions created before the specified time are included.
     * @param endTimeMin If specified, only job executions completed at or after the specified time are included.
     * @param endTimeMax If specified, only job executions completed before the specified time are included.
     * @param isActive If specified, only active or only completed job executions are included.
     * @param skip The number of elements in the collection to skip.
     * @param top The number of elements to return from the collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of job executions as paginated response with {@link PagedIterable}.
     */
    PagedIterable<JobExecution> listByJobExecution(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String jobName,
        UUID jobExecutionId,
        OffsetDateTime createTimeMin,
        OffsetDateTime createTimeMax,
        OffsetDateTime endTimeMin,
        OffsetDateTime endTimeMax,
        Boolean isActive,
        Integer skip,
        Integer top,
        Context context);

    /**
     * Lists the target executions of a job step execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The id of the job execution.
     * @param stepName The name of the step.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of job executions as paginated response with {@link PagedIterable}.
     */
    PagedIterable<JobExecution> listByStep(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String jobName,
        UUID jobExecutionId,
        String stepName);

    /**
     * Lists the target executions of a job step execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The id of the job execution.
     * @param stepName The name of the step.
     * @param createTimeMin If specified, only job executions created at or after the specified time are included.
     * @param createTimeMax If specified, only job executions created before the specified time are included.
     * @param endTimeMin If specified, only job executions completed at or after the specified time are included.
     * @param endTimeMax If specified, only job executions completed before the specified time are included.
     * @param isActive If specified, only active or only completed job executions are included.
     * @param skip The number of elements in the collection to skip.
     * @param top The number of elements to return from the collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of job executions as paginated response with {@link PagedIterable}.
     */
    PagedIterable<JobExecution> listByStep(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String jobName,
        UUID jobExecutionId,
        String stepName,
        OffsetDateTime createTimeMin,
        OffsetDateTime createTimeMax,
        OffsetDateTime endTimeMin,
        OffsetDateTime endTimeMax,
        Boolean isActive,
        Integer skip,
        Integer top,
        Context context);

    /**
     * Gets a target execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The unique id of the job execution.
     * @param stepName The name of the step.
     * @param targetId The target id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a target execution.
     */
    JobExecution get(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String jobName,
        UUID jobExecutionId,
        String stepName,
        UUID targetId);

    /**
     * Gets a target execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The unique id of the job execution.
     * @param stepName The name of the step.
     * @param targetId The target id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a target execution along with {@link Response}.
     */
    Response<JobExecution> getWithResponse(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String jobName,
        UUID jobExecutionId,
        String stepName,
        UUID targetId,
        Context context);
}
