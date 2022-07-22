// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.fluent.models.ScheduleInner;

/** Resource collection API of ServiceFabricSchedules. */
public interface ServiceFabricSchedules {
    /**
     * List schedules in a given service fabric.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param serviceFabricName The name of the service fabric.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains a list of schedules and their properties as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Schedule> list(String resourceGroupName, String labName, String username, String serviceFabricName);

    /**
     * List schedules in a given service fabric.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param serviceFabricName The name of the service fabric.
     * @param expand Specify the $expand query. Example: 'properties($select=status)'.
     * @param filter The filter to apply to the operation. Example: '$filter=contains(name,'myName')'.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param orderby The ordering expression for the results, using OData notation. Example: '$orderby=name desc'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains a list of schedules and their properties as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Schedule> list(
        String resourceGroupName,
        String labName,
        String username,
        String serviceFabricName,
        String expand,
        String filter,
        Integer top,
        String orderby,
        Context context);

    /**
     * Get schedule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param serviceFabricName The name of the service fabric.
     * @param name The name of the schedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return schedule.
     */
    Schedule get(String resourceGroupName, String labName, String username, String serviceFabricName, String name);

    /**
     * Get schedule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param serviceFabricName The name of the service fabric.
     * @param name The name of the schedule.
     * @param expand Specify the $expand query. Example: 'properties($select=status)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return schedule along with {@link Response}.
     */
    Response<Schedule> getWithResponse(
        String resourceGroupName,
        String labName,
        String username,
        String serviceFabricName,
        String name,
        String expand,
        Context context);

    /**
     * Create or replace an existing schedule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param serviceFabricName The name of the service fabric.
     * @param name The name of the schedule.
     * @param schedule A schedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a schedule.
     */
    Schedule createOrUpdate(
        String resourceGroupName,
        String labName,
        String username,
        String serviceFabricName,
        String name,
        ScheduleInner schedule);

    /**
     * Create or replace an existing schedule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param serviceFabricName The name of the service fabric.
     * @param name The name of the schedule.
     * @param schedule A schedule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a schedule along with {@link Response}.
     */
    Response<Schedule> createOrUpdateWithResponse(
        String resourceGroupName,
        String labName,
        String username,
        String serviceFabricName,
        String name,
        ScheduleInner schedule,
        Context context);

    /**
     * Delete schedule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param serviceFabricName The name of the service fabric.
     * @param name The name of the schedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String labName, String username, String serviceFabricName, String name);

    /**
     * Delete schedule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param serviceFabricName The name of the service fabric.
     * @param name The name of the schedule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String labName,
        String username,
        String serviceFabricName,
        String name,
        Context context);

    /**
     * Allows modifying tags of schedules. All other properties will be ignored.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param serviceFabricName The name of the service fabric.
     * @param name The name of the schedule.
     * @param schedule Allows modifying tags of schedules. All other properties will be ignored.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a schedule.
     */
    Schedule update(
        String resourceGroupName,
        String labName,
        String username,
        String serviceFabricName,
        String name,
        ScheduleFragment schedule);

    /**
     * Allows modifying tags of schedules. All other properties will be ignored.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param serviceFabricName The name of the service fabric.
     * @param name The name of the schedule.
     * @param schedule Allows modifying tags of schedules. All other properties will be ignored.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a schedule along with {@link Response}.
     */
    Response<Schedule> updateWithResponse(
        String resourceGroupName,
        String labName,
        String username,
        String serviceFabricName,
        String name,
        ScheduleFragment schedule,
        Context context);

    /**
     * Execute a schedule. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param serviceFabricName The name of the service fabric.
     * @param name The name of the schedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void execute(String resourceGroupName, String labName, String username, String serviceFabricName, String name);

    /**
     * Execute a schedule. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param serviceFabricName The name of the service fabric.
     * @param name The name of the schedule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void execute(
        String resourceGroupName,
        String labName,
        String username,
        String serviceFabricName,
        String name,
        Context context);
}
