// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.LogicalDatabaseTransparentDataEncryptionInner;
import com.azure.resourcemanager.sql.generated.models.TransparentDataEncryptionName;

/** An instance of this class provides access to all the operations defined in TransparentDataEncryptionsClient. */
public interface TransparentDataEncryptionsClient {
    /**
     * Gets a logical database's transparent data encryption.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the logical database for which the transparent data encryption is defined.
     * @param tdeName The name of the transparent data encryption configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a logical database's transparent data encryption along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LogicalDatabaseTransparentDataEncryptionInner> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        TransparentDataEncryptionName tdeName,
        Context context);

    /**
     * Gets a logical database's transparent data encryption.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the logical database for which the transparent data encryption is defined.
     * @param tdeName The name of the transparent data encryption configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a logical database's transparent data encryption.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LogicalDatabaseTransparentDataEncryptionInner get(
        String resourceGroupName, String serverName, String databaseName, TransparentDataEncryptionName tdeName);

    /**
     * Updates a logical database's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the logical database for which the security alert policy is defined.
     * @param tdeName The name of the transparent data encryption configuration.
     * @param parameters The database transparent data encryption.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a logical database transparent data encryption state along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LogicalDatabaseTransparentDataEncryptionInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        TransparentDataEncryptionName tdeName,
        LogicalDatabaseTransparentDataEncryptionInner parameters,
        Context context);

    /**
     * Updates a logical database's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the logical database for which the security alert policy is defined.
     * @param tdeName The name of the transparent data encryption configuration.
     * @param parameters The database transparent data encryption.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a logical database transparent data encryption state.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LogicalDatabaseTransparentDataEncryptionInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        String databaseName,
        TransparentDataEncryptionName tdeName,
        LogicalDatabaseTransparentDataEncryptionInner parameters);

    /**
     * Gets a list of the logical database's transparent data encryption.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the logical database for which the transparent data encryption is defined.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the logical database's transparent data encryption as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LogicalDatabaseTransparentDataEncryptionInner> listByDatabase(
        String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets a list of the logical database's transparent data encryption.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the logical database for which the transparent data encryption is defined.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the logical database's transparent data encryption as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LogicalDatabaseTransparentDataEncryptionInner> listByDatabase(
        String resourceGroupName, String serverName, String databaseName, Context context);
}
