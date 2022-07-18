// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.datamigration.fluent.models.DatabaseMigrationSqlDbInner;
import com.azure.resourcemanager.datamigration.models.MigrationOperationInput;
import java.util.UUID;

/** An instance of this class provides access to all the operations defined in DatabaseMigrationsSqlDbsClient. */
public interface DatabaseMigrationsSqlDbsClient {
    /**
     * Retrieve the Database Migration resource.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlDbInstanceName The sqlDbInstanceName parameter.
     * @param targetDbName The name of the target database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database Migration Resource for SQL Database.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabaseMigrationSqlDbInner get(String resourceGroupName, String sqlDbInstanceName, String targetDbName);

    /**
     * Retrieve the Database Migration resource.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlDbInstanceName The sqlDbInstanceName parameter.
     * @param targetDbName The name of the target database.
     * @param migrationOperationId Optional migration operation ID. If this is provided, then details of migration
     *     operation for that ID are retrieved. If not provided (default), then details related to most recent or
     *     current operation are retrieved.
     * @param expand Complete migration details be included in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database Migration Resource for SQL Database along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DatabaseMigrationSqlDbInner> getWithResponse(
        String resourceGroupName,
        String sqlDbInstanceName,
        String targetDbName,
        UUID migrationOperationId,
        String expand,
        Context context);

    /**
     * Create or Update Database Migration resource.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlDbInstanceName The sqlDbInstanceName parameter.
     * @param targetDbName The name of the target database.
     * @param parameters Details of Sql Db migration resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of database Migration Resource for SQL Database.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DatabaseMigrationSqlDbInner>, DatabaseMigrationSqlDbInner> beginCreateOrUpdate(
        String resourceGroupName,
        String sqlDbInstanceName,
        String targetDbName,
        DatabaseMigrationSqlDbInner parameters);

    /**
     * Create or Update Database Migration resource.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlDbInstanceName The sqlDbInstanceName parameter.
     * @param targetDbName The name of the target database.
     * @param parameters Details of Sql Db migration resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of database Migration Resource for SQL Database.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DatabaseMigrationSqlDbInner>, DatabaseMigrationSqlDbInner> beginCreateOrUpdate(
        String resourceGroupName,
        String sqlDbInstanceName,
        String targetDbName,
        DatabaseMigrationSqlDbInner parameters,
        Context context);

    /**
     * Create or Update Database Migration resource.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlDbInstanceName The sqlDbInstanceName parameter.
     * @param targetDbName The name of the target database.
     * @param parameters Details of Sql Db migration resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database Migration Resource for SQL Database.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabaseMigrationSqlDbInner createOrUpdate(
        String resourceGroupName,
        String sqlDbInstanceName,
        String targetDbName,
        DatabaseMigrationSqlDbInner parameters);

    /**
     * Create or Update Database Migration resource.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlDbInstanceName The sqlDbInstanceName parameter.
     * @param targetDbName The name of the target database.
     * @param parameters Details of Sql Db migration resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database Migration Resource for SQL Database.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabaseMigrationSqlDbInner createOrUpdate(
        String resourceGroupName,
        String sqlDbInstanceName,
        String targetDbName,
        DatabaseMigrationSqlDbInner parameters,
        Context context);

    /**
     * Delete Database Migration resource.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlDbInstanceName The sqlDbInstanceName parameter.
     * @param targetDbName The name of the target database.
     * @param force Optional force delete boolean. If this is provided as true, migration will be deleted even if
     *     active.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String sqlDbInstanceName, String targetDbName, Boolean force);

    /**
     * Delete Database Migration resource.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlDbInstanceName The sqlDbInstanceName parameter.
     * @param targetDbName The name of the target database.
     * @param force Optional force delete boolean. If this is provided as true, migration will be deleted even if
     *     active.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String sqlDbInstanceName, String targetDbName, Boolean force, Context context);

    /**
     * Delete Database Migration resource.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlDbInstanceName The sqlDbInstanceName parameter.
     * @param targetDbName The name of the target database.
     * @param force Optional force delete boolean. If this is provided as true, migration will be deleted even if
     *     active.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String sqlDbInstanceName, String targetDbName, Boolean force);

    /**
     * Delete Database Migration resource.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlDbInstanceName The sqlDbInstanceName parameter.
     * @param targetDbName The name of the target database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String sqlDbInstanceName, String targetDbName);

    /**
     * Delete Database Migration resource.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlDbInstanceName The sqlDbInstanceName parameter.
     * @param targetDbName The name of the target database.
     * @param force Optional force delete boolean. If this is provided as true, migration will be deleted even if
     *     active.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName, String sqlDbInstanceName, String targetDbName, Boolean force, Context context);

    /**
     * Stop on going migration for the database.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlDbInstanceName The sqlDbInstanceName parameter.
     * @param targetDbName The name of the target database.
     * @param parameters Required migration operation ID for which cancel will be initiated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginCancel(
        String resourceGroupName, String sqlDbInstanceName, String targetDbName, MigrationOperationInput parameters);

    /**
     * Stop on going migration for the database.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlDbInstanceName The sqlDbInstanceName parameter.
     * @param targetDbName The name of the target database.
     * @param parameters Required migration operation ID for which cancel will be initiated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginCancel(
        String resourceGroupName,
        String sqlDbInstanceName,
        String targetDbName,
        MigrationOperationInput parameters,
        Context context);

    /**
     * Stop on going migration for the database.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlDbInstanceName The sqlDbInstanceName parameter.
     * @param targetDbName The name of the target database.
     * @param parameters Required migration operation ID for which cancel will be initiated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void cancel(
        String resourceGroupName, String sqlDbInstanceName, String targetDbName, MigrationOperationInput parameters);

    /**
     * Stop on going migration for the database.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlDbInstanceName The sqlDbInstanceName parameter.
     * @param targetDbName The name of the target database.
     * @param parameters Required migration operation ID for which cancel will be initiated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void cancel(
        String resourceGroupName,
        String sqlDbInstanceName,
        String targetDbName,
        MigrationOperationInput parameters,
        Context context);
}
