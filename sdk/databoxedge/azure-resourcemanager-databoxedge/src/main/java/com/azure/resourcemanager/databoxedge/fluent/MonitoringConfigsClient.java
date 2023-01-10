// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.databoxedge.fluent.models.MonitoringMetricConfigurationInner;

/** An instance of this class provides access to all the operations defined in MonitoringConfigsClient. */
public interface MonitoringConfigsClient {
    /**
     * Lists metric configurations in a role.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of metric configurations as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MonitoringMetricConfigurationInner> list(
        String deviceName, String roleName, String resourceGroupName);

    /**
     * Lists metric configurations in a role.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of metric configurations as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MonitoringMetricConfigurationInner> list(
        String deviceName, String roleName, String resourceGroupName, Context context);

    /**
     * Gets a metric configuration of a role.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a metric configuration of a role along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MonitoringMetricConfigurationInner> getWithResponse(
        String deviceName, String roleName, String resourceGroupName, Context context);

    /**
     * Gets a metric configuration of a role.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a metric configuration of a role.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MonitoringMetricConfigurationInner get(String deviceName, String roleName, String resourceGroupName);

    /**
     * Creates a new metric configuration or updates an existing one for a role.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param resourceGroupName The resource group name.
     * @param monitoringMetricConfiguration The metric configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the metric setting details for the role.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<MonitoringMetricConfigurationInner>, MonitoringMetricConfigurationInner> beginCreateOrUpdate(
        String deviceName,
        String roleName,
        String resourceGroupName,
        MonitoringMetricConfigurationInner monitoringMetricConfiguration);

    /**
     * Creates a new metric configuration or updates an existing one for a role.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param resourceGroupName The resource group name.
     * @param monitoringMetricConfiguration The metric configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the metric setting details for the role.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<MonitoringMetricConfigurationInner>, MonitoringMetricConfigurationInner> beginCreateOrUpdate(
        String deviceName,
        String roleName,
        String resourceGroupName,
        MonitoringMetricConfigurationInner monitoringMetricConfiguration,
        Context context);

    /**
     * Creates a new metric configuration or updates an existing one for a role.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param resourceGroupName The resource group name.
     * @param monitoringMetricConfiguration The metric configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metric setting details for the role.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MonitoringMetricConfigurationInner createOrUpdate(
        String deviceName,
        String roleName,
        String resourceGroupName,
        MonitoringMetricConfigurationInner monitoringMetricConfiguration);

    /**
     * Creates a new metric configuration or updates an existing one for a role.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param resourceGroupName The resource group name.
     * @param monitoringMetricConfiguration The metric configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metric setting details for the role.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MonitoringMetricConfigurationInner createOrUpdate(
        String deviceName,
        String roleName,
        String resourceGroupName,
        MonitoringMetricConfigurationInner monitoringMetricConfiguration,
        Context context);

    /**
     * deletes a new metric configuration for a role.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String deviceName, String roleName, String resourceGroupName);

    /**
     * deletes a new metric configuration for a role.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String deviceName, String roleName, String resourceGroupName, Context context);

    /**
     * deletes a new metric configuration for a role.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String deviceName, String roleName, String resourceGroupName);

    /**
     * deletes a new metric configuration for a role.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String deviceName, String roleName, String resourceGroupName, Context context);
}
