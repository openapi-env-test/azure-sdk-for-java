// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.SwapResourceInner;

/** Resource collection API of VipSwaps. */
public interface VipSwaps {
    /**
     * Gets the SwapResource which identifies the slot type for the specified cloud service. The slot type on a cloud
     * service can either be Staging or Production.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SwapResource which identifies the slot type for the specified cloud service along with {@link
     *     Response}.
     */
    Response<SwapResource> getWithResponse(String groupName, String resourceName, Context context);

    /**
     * Gets the SwapResource which identifies the slot type for the specified cloud service. The slot type on a cloud
     * service can either be Staging or Production.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SwapResource which identifies the slot type for the specified cloud service.
     */
    SwapResource get(String groupName, String resourceName);

    /**
     * Performs vip swap operation on swappable cloud services.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @param parameters SwapResource object where slot type should be the target slot after vip swap for the specified
     *     cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void create(String groupName, String resourceName, SwapResourceInner parameters);

    /**
     * Performs vip swap operation on swappable cloud services.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @param parameters SwapResource object where slot type should be the target slot after vip swap for the specified
     *     cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void create(String groupName, String resourceName, SwapResourceInner parameters, Context context);

    /**
     * Gets the list of SwapResource which identifies the slot type for the specified cloud service. The slot type on a
     * cloud service can either be Staging or Production.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of SwapResource which identifies the slot type for the specified cloud service along with {@link
     *     Response}.
     */
    Response<SwapResourceListResult> listWithResponse(String groupName, String resourceName, Context context);

    /**
     * Gets the list of SwapResource which identifies the slot type for the specified cloud service. The slot type on a
     * cloud service can either be Staging or Production.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of SwapResource which identifies the slot type for the specified cloud service.
     */
    SwapResourceListResult list(String groupName, String resourceName);
}
