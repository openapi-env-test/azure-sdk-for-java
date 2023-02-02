// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.List;

/** Resource collection API of ManagedDatabaseColumns. */
public interface ManagedDatabaseColumns {
    /**
     * List managed database columns.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database columns as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DatabaseColumn> listByDatabase(
        String resourceGroupName, String managedInstanceName, String databaseName);

    /**
     * List managed database columns.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param schema Array of Get3ItemsItem.
     * @param table Array of Get4ItemsItem.
     * @param column Array of Get5ItemsItem.
     * @param orderBy Array of Get6ItemsItem.
     * @param skiptoken An opaque token that identifies a starting point in the collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database columns as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DatabaseColumn> listByDatabase(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        List<String> schema,
        List<String> table,
        List<String> column,
        List<String> orderBy,
        String skiptoken,
        Context context);

    /**
     * List managed database columns.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database columns as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DatabaseColumn> listByTable(
        String resourceGroupName, String managedInstanceName, String databaseName, String schemaName, String tableName);

    /**
     * List managed database columns.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param filter An OData filter expression that filters elements in the collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database columns as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DatabaseColumn> listByTable(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String schemaName,
        String tableName,
        String filter,
        Context context);

    /**
     * Get managed database column.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed database column along with {@link Response}.
     */
    Response<DatabaseColumn> getWithResponse(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName,
        Context context);

    /**
     * Get managed database column.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed database column.
     */
    DatabaseColumn get(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName);
}
