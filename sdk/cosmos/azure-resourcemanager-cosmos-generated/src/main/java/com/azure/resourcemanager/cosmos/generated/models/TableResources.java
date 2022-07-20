// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of TableResources. */
public interface TableResources {
    /**
     * Lists the Tables under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the Table and their properties as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<TableGetResults> listTables(String resourceGroupName, String accountName);

    /**
     * Lists the Tables under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the Table and their properties as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<TableGetResults> listTables(String resourceGroupName, String accountName, Context context);

    /**
     * Gets the Tables under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Tables under an existing Azure Cosmos DB database account with the provided name.
     */
    TableGetResults getTable(String resourceGroupName, String accountName, String tableName);

    /**
     * Gets the Tables under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Tables under an existing Azure Cosmos DB database account with the provided name along with {@link
     *     Response}.
     */
    Response<TableGetResults> getTableWithResponse(
        String resourceGroupName, String accountName, String tableName, Context context);

    /**
     * Deletes an existing Azure Cosmos DB Table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteTable(String resourceGroupName, String accountName, String tableName);

    /**
     * Deletes an existing Azure Cosmos DB Table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteTable(String resourceGroupName, String accountName, String tableName, Context context);

    /**
     * Gets the RUs per second of the Table under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the RUs per second of the Table under an existing Azure Cosmos DB database account with the provided
     *     name.
     */
    ThroughputSettingsGetResults getTableThroughput(String resourceGroupName, String accountName, String tableName);

    /**
     * Gets the RUs per second of the Table under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the RUs per second of the Table under an existing Azure Cosmos DB database account with the provided name
     *     along with {@link Response}.
     */
    Response<ThroughputSettingsGetResults> getTableThroughputWithResponse(
        String resourceGroupName, String accountName, String tableName, Context context);

    /**
     * Update RUs per second of an Azure Cosmos DB Table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @param updateThroughputParameters The parameters to provide for the RUs per second of the current Table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults updateTableThroughput(
        String resourceGroupName,
        String accountName,
        String tableName,
        ThroughputSettingsUpdateParameters updateThroughputParameters);

    /**
     * Update RUs per second of an Azure Cosmos DB Table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @param updateThroughputParameters The parameters to provide for the RUs per second of the current Table.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults updateTableThroughput(
        String resourceGroupName,
        String accountName,
        String tableName,
        ThroughputSettingsUpdateParameters updateThroughputParameters,
        Context context);

    /**
     * Migrate an Azure Cosmos DB Table from manual throughput to autoscale.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults migrateTableToAutoscale(
        String resourceGroupName, String accountName, String tableName);

    /**
     * Migrate an Azure Cosmos DB Table from manual throughput to autoscale.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults migrateTableToAutoscale(
        String resourceGroupName, String accountName, String tableName, Context context);

    /**
     * Migrate an Azure Cosmos DB Table from autoscale to manual throughput.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults migrateTableToManualThroughput(
        String resourceGroupName, String accountName, String tableName);

    /**
     * Migrate an Azure Cosmos DB Table from autoscale to manual throughput.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults migrateTableToManualThroughput(
        String resourceGroupName, String accountName, String tableName, Context context);

    /**
     * Retrieves continuous backup information for a table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @param location The name of the continuous backup restore location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backup information of a resource.
     */
    BackupInformation retrieveContinuousBackupInformation(
        String resourceGroupName, String accountName, String tableName, ContinuousBackupRestoreLocation location);

    /**
     * Retrieves continuous backup information for a table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @param location The name of the continuous backup restore location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backup information of a resource.
     */
    BackupInformation retrieveContinuousBackupInformation(
        String resourceGroupName,
        String accountName,
        String tableName,
        ContinuousBackupRestoreLocation location,
        Context context);

    /**
     * Gets the Tables under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Tables under an existing Azure Cosmos DB database account with the provided name along with {@link
     *     Response}.
     */
    TableGetResults getTableById(String id);

    /**
     * Gets the Tables under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Tables under an existing Azure Cosmos DB database account with the provided name along with {@link
     *     Response}.
     */
    Response<TableGetResults> getTableByIdWithResponse(String id, Context context);

    /**
     * Deletes an existing Azure Cosmos DB Table.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteTableById(String id);

    /**
     * Deletes an existing Azure Cosmos DB Table.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteTableByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new TableGetResults resource.
     *
     * @param name resource name.
     * @return the first stage of the new TableGetResults definition.
     */
    TableGetResults.DefinitionStages.Blank define(String name);
}
