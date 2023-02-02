// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.sql.generated.fluent.models.ImportExportExtensionsOperationResultInner;
import com.azure.resourcemanager.sql.generated.models.DatabaseExtensions;

/** An instance of this class provides access to all the operations defined in DatabaseExtensionsOperationsClient. */
public interface DatabaseExtensionsOperationsClient {
    /**
     * Gets a database extension. This will return resource not found as it is not supported.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param extensionName The extensionName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database extension along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> getWithResponse(
        String resourceGroupName, String serverName, String databaseName, String extensionName, Context context);

    /**
     * Gets a database extension. This will return resource not found as it is not supported.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param extensionName The extensionName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void get(String resourceGroupName, String serverName, String databaseName, String extensionName);

    /**
     * Perform a database extension operation, like polybase import.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param extensionName The extensionName parameter.
     * @param parameters The database import request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an Extension operation result resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ImportExportExtensionsOperationResultInner>, ImportExportExtensionsOperationResultInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String serverName,
            String databaseName,
            String extensionName,
            DatabaseExtensions parameters);

    /**
     * Perform a database extension operation, like polybase import.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param extensionName The extensionName parameter.
     * @param parameters The database import request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an Extension operation result resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ImportExportExtensionsOperationResultInner>, ImportExportExtensionsOperationResultInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String serverName,
            String databaseName,
            String extensionName,
            DatabaseExtensions parameters,
            Context context);

    /**
     * Perform a database extension operation, like polybase import.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param extensionName The extensionName parameter.
     * @param parameters The database import request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Extension operation result resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ImportExportExtensionsOperationResultInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String extensionName,
        DatabaseExtensions parameters);

    /**
     * Perform a database extension operation, like polybase import.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param extensionName The extensionName parameter.
     * @param parameters The database import request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Extension operation result resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ImportExportExtensionsOperationResultInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String extensionName,
        DatabaseExtensions parameters,
        Context context);

    /**
     * List database extension. This will return an empty list as it is not supported.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return import export operation extensions list as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ImportExportExtensionsOperationResultInner> listByDatabase(
        String resourceGroupName, String serverName, String databaseName);

    /**
     * List database extension. This will return an empty list as it is not supported.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return import export operation extensions list as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ImportExportExtensionsOperationResultInner> listByDatabase(
        String resourceGroupName, String serverName, String databaseName, Context context);
}
