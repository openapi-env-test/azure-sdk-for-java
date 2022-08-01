// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of VirtualHubIpConfigurations. */
public interface VirtualHubIpConfigurations {
    /**
     * Retrieves the details of a Virtual Hub Ip configuration.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param ipConfigName The name of the ipconfig.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ipConfigurations.
     */
    HubIpConfiguration get(String resourceGroupName, String virtualHubName, String ipConfigName);

    /**
     * Retrieves the details of a Virtual Hub Ip configuration.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param ipConfigName The name of the ipconfig.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ipConfigurations along with {@link Response}.
     */
    Response<HubIpConfiguration> getWithResponse(
        String resourceGroupName, String virtualHubName, String ipConfigName, Context context);

    /**
     * Deletes a VirtualHubIpConfiguration.
     *
     * @param resourceGroupName The resource group name of the VirtualHubBgpConnection.
     * @param virtualHubName The name of the VirtualHub.
     * @param ipConfigName The name of the ipconfig.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualHubName, String ipConfigName);

    /**
     * Deletes a VirtualHubIpConfiguration.
     *
     * @param resourceGroupName The resource group name of the VirtualHubBgpConnection.
     * @param virtualHubName The name of the VirtualHub.
     * @param ipConfigName The name of the ipconfig.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualHubName, String ipConfigName, Context context);

    /**
     * Retrieves the details of all VirtualHubIpConfigurations.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualHubIpConfigurations list as paginated response with {@link PagedIterable}.
     */
    PagedIterable<HubIpConfiguration> list(String resourceGroupName, String virtualHubName);

    /**
     * Retrieves the details of all VirtualHubIpConfigurations.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualHubIpConfigurations list as paginated response with {@link PagedIterable}.
     */
    PagedIterable<HubIpConfiguration> list(String resourceGroupName, String virtualHubName, Context context);

    /**
     * Retrieves the details of a Virtual Hub Ip configuration.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ipConfigurations along with {@link Response}.
     */
    HubIpConfiguration getById(String id);

    /**
     * Retrieves the details of a Virtual Hub Ip configuration.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ipConfigurations along with {@link Response}.
     */
    Response<HubIpConfiguration> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a VirtualHubIpConfiguration.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a VirtualHubIpConfiguration.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new HubIpConfiguration resource.
     *
     * @param name resource name.
     * @return the first stage of the new HubIpConfiguration definition.
     */
    HubIpConfiguration.DefinitionStages.Blank define(String name);
}
