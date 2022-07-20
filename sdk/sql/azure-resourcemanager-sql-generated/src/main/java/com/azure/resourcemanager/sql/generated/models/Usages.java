// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of Usages. */
public interface Usages {
    /**
     * Gets all instance pool usage metrics.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param instancePoolName The name of the instance pool to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all instance pool usage metrics as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Usage> listByInstancePool(String resourceGroupName, String instancePoolName);

    /**
     * Gets all instance pool usage metrics.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param instancePoolName The name of the instance pool to be retrieved.
     * @param expandChildren Optional request parameter to include managed instance usages within the instance pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all instance pool usage metrics as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Usage> listByInstancePool(
        String resourceGroupName, String instancePoolName, Boolean expandChildren, Context context);
}
