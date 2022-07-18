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
import com.azure.resourcemanager.datamigration.fluent.models.DatabaseMigrationSqlVmInner;
import com.azure.resourcemanager.datamigration.models.MigrationOperationInput;
import java.util.UUID;

/** An instance of this class provides access to all the operations defined in DatabaseMigrationsSqlVmsClient. */
public interface DatabaseMigrationsSqlVmsClient {
    /**
     * Retrieve the specified database migration for a given SQL VM.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName The sqlVirtualMachineName parameter.
     * @param targetDbName The name of the target database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database Migration Resource for SQL Virtual Machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabaseMigrationSqlVmInner get(String resourceGroupName, String sqlVirtualMachineName, String targetDbName);

    /**
     * Retrieve the specified database migration for a given SQL VM.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName The sqlVirtualMachineName parameter.
     * @param targetDbName The name of the target database.
     * @param migrationOperationId Optional migration operation ID. If this is provided, then details of migration
     *     operation for that ID are retrieved. If not provided (default), then details related to most recent or
     *     current operation are retrieved.
     * @param expand Complete migration details be included in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database Migration Resource for SQL Virtual Machine along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DatabaseMigrationSqlVmInner> getWithResponse(
        String resourceGroupName,
        String sqlVirtualMachineName,
        String targetDbName,
        UUID migrationOperationId,
        String expand,
        Context context);

    /**
     * Create a new database migration to a given SQL VM.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName The sqlVirtualMachineName parameter.
     * @param targetDbName The name of the target database.
     * @param parameters Details of SqlMigrationService resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of database Migration Resource for SQL Virtual Machine.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DatabaseMigrationSqlVmInner>, DatabaseMigrationSqlVmInner> beginCreateOrUpdate(
        String resourceGroupName,
        String sqlVirtualMachineName,
        String targetDbName,
        DatabaseMigrationSqlVmInner parameters);

    /**
     * Create a new database migration to a given SQL VM.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName The sqlVirtualMachineName parameter.
     * @param targetDbName The name of the target database.
     * @param parameters Details of SqlMigrationService resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of database Migration Resource for SQL Virtual Machine.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DatabaseMigrationSqlVmInner>, DatabaseMigrationSqlVmInner> beginCreateOrUpdate(
        String resourceGroupName,
        String sqlVirtualMachineName,
        String targetDbName,
        DatabaseMigrationSqlVmInner parameters,
        Context context);

    /**
     * Create a new database migration to a given SQL VM.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName The sqlVirtualMachineName parameter.
     * @param targetDbName The name of the target database.
     * @param parameters Details of SqlMigrationService resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database Migration Resource for SQL Virtual Machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabaseMigrationSqlVmInner createOrUpdate(
        String resourceGroupName,
        String sqlVirtualMachineName,
        String targetDbName,
        DatabaseMigrationSqlVmInner parameters);

    /**
     * Create a new database migration to a given SQL VM.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName The sqlVirtualMachineName parameter.
     * @param targetDbName The name of the target database.
     * @param parameters Details of SqlMigrationService resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database Migration Resource for SQL Virtual Machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabaseMigrationSqlVmInner createOrUpdate(
        String resourceGroupName,
        String sqlVirtualMachineName,
        String targetDbName,
        DatabaseMigrationSqlVmInner parameters,
        Context context);

    /**
     * Stop in-progress database migration to SQL VM.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName The sqlVirtualMachineName parameter.
     * @param targetDbName The name of the target database.
     * @param parameters Migration Operation Input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginCancel(
        String resourceGroupName,
        String sqlVirtualMachineName,
        String targetDbName,
        MigrationOperationInput parameters);

    /**
     * Stop in-progress database migration to SQL VM.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName The sqlVirtualMachineName parameter.
     * @param targetDbName The name of the target database.
     * @param parameters Migration Operation Input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginCancel(
        String resourceGroupName,
        String sqlVirtualMachineName,
        String targetDbName,
        MigrationOperationInput parameters,
        Context context);

    /**
     * Stop in-progress database migration to SQL VM.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName The sqlVirtualMachineName parameter.
     * @param targetDbName The name of the target database.
     * @param parameters Migration Operation Input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void cancel(
        String resourceGroupName,
        String sqlVirtualMachineName,
        String targetDbName,
        MigrationOperationInput parameters);

    /**
     * Stop in-progress database migration to SQL VM.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName The sqlVirtualMachineName parameter.
     * @param targetDbName The name of the target database.
     * @param parameters Migration Operation Input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void cancel(
        String resourceGroupName,
        String sqlVirtualMachineName,
        String targetDbName,
        MigrationOperationInput parameters,
        Context context);

    /**
     * Initiate cutover for in-progress online database migration to SQL VM.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName The sqlVirtualMachineName parameter.
     * @param targetDbName The name of the target database.
     * @param parameters Migration Operation Input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginCutover(
        String resourceGroupName,
        String sqlVirtualMachineName,
        String targetDbName,
        MigrationOperationInput parameters);

    /**
     * Initiate cutover for in-progress online database migration to SQL VM.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName The sqlVirtualMachineName parameter.
     * @param targetDbName The name of the target database.
     * @param parameters Migration Operation Input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginCutover(
        String resourceGroupName,
        String sqlVirtualMachineName,
        String targetDbName,
        MigrationOperationInput parameters,
        Context context);

    /**
     * Initiate cutover for in-progress online database migration to SQL VM.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName The sqlVirtualMachineName parameter.
     * @param targetDbName The name of the target database.
     * @param parameters Migration Operation Input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void cutover(
        String resourceGroupName,
        String sqlVirtualMachineName,
        String targetDbName,
        MigrationOperationInput parameters);

    /**
     * Initiate cutover for in-progress online database migration to SQL VM.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName The sqlVirtualMachineName parameter.
     * @param targetDbName The name of the target database.
     * @param parameters Migration Operation Input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void cutover(
        String resourceGroupName,
        String sqlVirtualMachineName,
        String targetDbName,
        MigrationOperationInput parameters,
        Context context);
}
