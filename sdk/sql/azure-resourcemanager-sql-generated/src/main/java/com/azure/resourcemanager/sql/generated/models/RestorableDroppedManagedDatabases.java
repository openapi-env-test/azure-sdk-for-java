// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of RestorableDroppedManagedDatabases. */
public interface RestorableDroppedManagedDatabases {
    /**
     * Gets a list of restorable dropped managed databases.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of restorable dropped managed databases as paginated response with {@link PagedIterable}.
     */
    PagedIterable<RestorableDroppedManagedDatabase> listByInstance(
        String resourceGroupName, String managedInstanceName);

    /**
     * Gets a list of restorable dropped managed databases.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of restorable dropped managed databases as paginated response with {@link PagedIterable}.
     */
    PagedIterable<RestorableDroppedManagedDatabase> listByInstance(
        String resourceGroupName, String managedInstanceName, Context context);

    /**
     * Gets a restorable dropped managed database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a restorable dropped managed database.
     */
    RestorableDroppedManagedDatabase get(
        String resourceGroupName, String managedInstanceName, String restorableDroppedDatabaseId);

    /**
     * Gets a restorable dropped managed database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a restorable dropped managed database along with {@link Response}.
     */
    Response<RestorableDroppedManagedDatabase> getWithResponse(
        String resourceGroupName, String managedInstanceName, String restorableDroppedDatabaseId, Context context);
}
