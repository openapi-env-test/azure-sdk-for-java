// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Devices. */
public interface Devices {
    /**
     * Deletes the specified device.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deviceName The name of the device resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String deviceName);

    /**
     * Deletes the specified device.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deviceName The name of the device resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String deviceName, Context context);

    /**
     * Gets information about the specified device.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deviceName The name of the device resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified device.
     */
    Device getByResourceGroup(String resourceGroupName, String deviceName);

    /**
     * Gets information about the specified device.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deviceName The name of the device resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified device along with {@link Response}.
     */
    Response<Device> getByResourceGroupWithResponse(String resourceGroupName, String deviceName, Context context);

    /**
     * Lists all the devices in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for devices API service call as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Device> list();

    /**
     * Lists all the devices in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for devices API service call as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Device> list(Context context);

    /**
     * Lists all the device resource in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for devices API service call as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Device> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the device resource in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for devices API service call as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Device> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List the registration key for the device.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deviceName The name of the device resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the device registration key.
     */
    DeviceRegistrationKey listRegistrationKey(String resourceGroupName, String deviceName);

    /**
     * List the registration key for the device.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deviceName The name of the device resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the device registration key along with {@link Response}.
     */
    Response<DeviceRegistrationKey> listRegistrationKeyWithResponse(
        String resourceGroupName, String deviceName, Context context);

    /**
     * Gets information about the specified device.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified device along with {@link Response}.
     */
    Device getById(String id);

    /**
     * Gets information about the specified device.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified device along with {@link Response}.
     */
    Response<Device> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified device.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified device.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Device resource.
     *
     * @param name resource name.
     * @return the first stage of the new Device definition.
     */
    Device.DefinitionStages.Blank define(String name);
}
