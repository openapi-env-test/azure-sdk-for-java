// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PublicIpAddresses. */
public interface PublicIpAddresses {
    /**
     * The delete publicIpAddress operation deletes the specified publicIpAddress.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String publicIpAddressName);

    /**
     * The delete publicIpAddress operation deletes the specified publicIpAddress.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the subnet.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String publicIpAddressName, Context context);

    /**
     * The Get publicIpAddress operation retrieves information about the specified pubicIpAddress.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return publicIPAddress resource.
     */
    PublicIpAddress getByResourceGroup(String resourceGroupName, String publicIpAddressName);

    /**
     * The Get publicIpAddress operation retrieves information about the specified pubicIpAddress.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the subnet.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return publicIPAddress resource.
     */
    Response<PublicIpAddress> getByResourceGroupWithResponse(
        String resourceGroupName, String publicIpAddressName, Context context);

    /**
     * The List publicIpAddress operation retrieves all the publicIpAddresses in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListPublicIpAddresses Api service call.
     */
    PagedIterable<PublicIpAddress> list();

    /**
     * The List publicIpAddress operation retrieves all the publicIpAddresses in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListPublicIpAddresses Api service call.
     */
    PagedIterable<PublicIpAddress> list(Context context);

    /**
     * The List publicIpAddress operation retrieves all the publicIpAddresses in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListPublicIpAddresses Api service call.
     */
    PagedIterable<PublicIpAddress> listByResourceGroup(String resourceGroupName);

    /**
     * The List publicIpAddress operation retrieves all the publicIpAddresses in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListPublicIpAddresses Api service call.
     */
    PagedIterable<PublicIpAddress> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * The Get publicIpAddress operation retrieves information about the specified pubicIpAddress.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return publicIPAddress resource.
     */
    PublicIpAddress getById(String id);

    /**
     * The Get publicIpAddress operation retrieves information about the specified pubicIpAddress.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return publicIPAddress resource.
     */
    Response<PublicIpAddress> getByIdWithResponse(String id, Context context);

    /**
     * The delete publicIpAddress operation deletes the specified publicIpAddress.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * The delete publicIpAddress operation deletes the specified publicIpAddress.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new PublicIpAddress resource.
     *
     * @param name resource name.
     * @return the first stage of the new PublicIpAddress definition.
     */
    PublicIpAddress.DefinitionStages.Blank define(String name);
}
