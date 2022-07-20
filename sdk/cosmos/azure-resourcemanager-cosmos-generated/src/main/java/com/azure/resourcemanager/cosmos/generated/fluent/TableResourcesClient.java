// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.cosmos.generated.fluent.models.BackupInformationInner;
import com.azure.resourcemanager.cosmos.generated.fluent.models.TableGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.fluent.models.ThroughputSettingsGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.models.ContinuousBackupRestoreLocation;
import com.azure.resourcemanager.cosmos.generated.models.TableCreateUpdateParameters;
import com.azure.resourcemanager.cosmos.generated.models.ThroughputSettingsUpdateParameters;

/** An instance of this class provides access to all the operations defined in TableResourcesClient. */
public interface TableResourcesClient {
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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TableGetResultsInner> listTables(String resourceGroupName, String accountName);

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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TableGetResultsInner> listTables(String resourceGroupName, String accountName, Context context);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    TableGetResultsInner getTable(String resourceGroupName, String accountName, String tableName);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TableGetResultsInner> getTableWithResponse(
        String resourceGroupName, String accountName, String tableName, Context context);

    /**
     * Create or update an Azure Cosmos DB Table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @param createUpdateTableParameters The parameters to provide for the current Table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an Azure Cosmos DB Table.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<TableGetResultsInner>, TableGetResultsInner> beginCreateUpdateTable(
        String resourceGroupName,
        String accountName,
        String tableName,
        TableCreateUpdateParameters createUpdateTableParameters);

    /**
     * Create or update an Azure Cosmos DB Table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @param createUpdateTableParameters The parameters to provide for the current Table.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an Azure Cosmos DB Table.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<TableGetResultsInner>, TableGetResultsInner> beginCreateUpdateTable(
        String resourceGroupName,
        String accountName,
        String tableName,
        TableCreateUpdateParameters createUpdateTableParameters,
        Context context);

    /**
     * Create or update an Azure Cosmos DB Table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @param createUpdateTableParameters The parameters to provide for the current Table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB Table.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TableGetResultsInner createUpdateTable(
        String resourceGroupName,
        String accountName,
        String tableName,
        TableCreateUpdateParameters createUpdateTableParameters);

    /**
     * Create or update an Azure Cosmos DB Table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @param createUpdateTableParameters The parameters to provide for the current Table.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB Table.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TableGetResultsInner createUpdateTable(
        String resourceGroupName,
        String accountName,
        String tableName,
        TableCreateUpdateParameters createUpdateTableParameters,
        Context context);

    /**
     * Deletes an existing Azure Cosmos DB Table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDeleteTable(String resourceGroupName, String accountName, String tableName);

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
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDeleteTable(
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
    @ServiceMethod(returns = ReturnType.SINGLE)
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
    @ServiceMethod(returns = ReturnType.SINGLE)
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    ThroughputSettingsGetResultsInner getTableThroughput(
        String resourceGroupName, String accountName, String tableName);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ThroughputSettingsGetResultsInner> getTableThroughputWithResponse(
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
     * @return the {@link SyncPoller} for polling of an Azure Cosmos DB resource throughput.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ThroughputSettingsGetResultsInner>, ThroughputSettingsGetResultsInner>
        beginUpdateTableThroughput(
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
     * @return the {@link SyncPoller} for polling of an Azure Cosmos DB resource throughput.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ThroughputSettingsGetResultsInner>, ThroughputSettingsGetResultsInner>
        beginUpdateTableThroughput(
            String resourceGroupName,
            String accountName,
            String tableName,
            ThroughputSettingsUpdateParameters updateThroughputParameters,
            Context context);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    ThroughputSettingsGetResultsInner updateTableThroughput(
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    ThroughputSettingsGetResultsInner updateTableThroughput(
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
     * @return the {@link SyncPoller} for polling of an Azure Cosmos DB resource throughput.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ThroughputSettingsGetResultsInner>, ThroughputSettingsGetResultsInner>
        beginMigrateTableToAutoscale(String resourceGroupName, String accountName, String tableName);

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
     * @return the {@link SyncPoller} for polling of an Azure Cosmos DB resource throughput.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ThroughputSettingsGetResultsInner>, ThroughputSettingsGetResultsInner>
        beginMigrateTableToAutoscale(String resourceGroupName, String accountName, String tableName, Context context);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    ThroughputSettingsGetResultsInner migrateTableToAutoscale(
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    ThroughputSettingsGetResultsInner migrateTableToAutoscale(
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
     * @return the {@link SyncPoller} for polling of an Azure Cosmos DB resource throughput.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ThroughputSettingsGetResultsInner>, ThroughputSettingsGetResultsInner>
        beginMigrateTableToManualThroughput(String resourceGroupName, String accountName, String tableName);

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
     * @return the {@link SyncPoller} for polling of an Azure Cosmos DB resource throughput.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ThroughputSettingsGetResultsInner>, ThroughputSettingsGetResultsInner>
        beginMigrateTableToManualThroughput(
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    ThroughputSettingsGetResultsInner migrateTableToManualThroughput(
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    ThroughputSettingsGetResultsInner migrateTableToManualThroughput(
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
     * @return the {@link SyncPoller} for polling of backup information of a resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BackupInformationInner>, BackupInformationInner> beginRetrieveContinuousBackupInformation(
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
     * @return the {@link SyncPoller} for polling of backup information of a resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BackupInformationInner>, BackupInformationInner> beginRetrieveContinuousBackupInformation(
        String resourceGroupName,
        String accountName,
        String tableName,
        ContinuousBackupRestoreLocation location,
        Context context);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackupInformationInner retrieveContinuousBackupInformation(
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackupInformationInner retrieveContinuousBackupInformation(
        String resourceGroupName,
        String accountName,
        String tableName,
        ContinuousBackupRestoreLocation location,
        Context context);
}
