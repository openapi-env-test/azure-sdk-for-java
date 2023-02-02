// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.RestorableDroppedDatabaseInner;

/** An instance of this class provides access to all the operations defined in RestorableDroppedDatabasesClient. */
public interface RestorableDroppedDatabasesClient {
    /**
     * Gets a list of restorable dropped databases.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of restorable dropped databases as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RestorableDroppedDatabaseInner> listByServer(String resourceGroupName, String serverName);

    /**
     * Gets a list of restorable dropped databases.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of restorable dropped databases as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RestorableDroppedDatabaseInner> listByServer(
        String resourceGroupName, String serverName, Context context);

    /**
     * Gets a restorable dropped database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a restorable dropped database along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RestorableDroppedDatabaseInner> getWithResponse(
        String resourceGroupName, String serverName, String restorableDroppedDatabaseId, Context context);

    /**
     * Gets a restorable dropped database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a restorable dropped database.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RestorableDroppedDatabaseInner get(String resourceGroupName, String serverName, String restorableDroppedDatabaseId);
}
