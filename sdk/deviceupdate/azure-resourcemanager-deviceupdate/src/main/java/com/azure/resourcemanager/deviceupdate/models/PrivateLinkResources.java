// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PrivateLinkResources. */
public interface PrivateLinkResources {
    /**
     * List all private link resources in a device update account.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName Account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available private link resources for an Account as paginated response with {@link PagedIterable}.
     */
    PagedIterable<GroupInformation> listByAccount(String resourceGroupName, String accountName);

    /**
     * List all private link resources in a device update account.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName Account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available private link resources for an Account as paginated response with {@link PagedIterable}.
     */
    PagedIterable<GroupInformation> listByAccount(String resourceGroupName, String accountName, Context context);

    /**
     * Get the specified private link resource associated with the device update account.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName Account name.
     * @param groupId The group ID of the private link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private link resource associated with the device update account along with {@link
     *     Response}.
     */
    Response<GroupInformation> getWithResponse(
        String resourceGroupName, String accountName, String groupId, Context context);

    /**
     * Get the specified private link resource associated with the device update account.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName Account name.
     * @param groupId The group ID of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private link resource associated with the device update account.
     */
    GroupInformation get(String resourceGroupName, String accountName, String groupId);
}
