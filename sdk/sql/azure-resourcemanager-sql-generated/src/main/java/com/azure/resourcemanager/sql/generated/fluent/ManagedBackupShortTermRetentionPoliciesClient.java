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
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedBackupShortTermRetentionPolicyInner;
import com.azure.resourcemanager.sql.generated.models.ManagedShortTermRetentionPolicyName;

/**
 * An instance of this class provides access to all the operations defined in
 * ManagedBackupShortTermRetentionPoliciesClient.
 */
public interface ManagedBackupShortTermRetentionPoliciesClient {
    /**
     * Gets a managed database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param policyName The policy name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed database's short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedBackupShortTermRetentionPolicyInner get(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        ManagedShortTermRetentionPolicyName policyName);

    /**
     * Gets a managed database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param policyName The policy name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed database's short term retention policy along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagedBackupShortTermRetentionPolicyInner> getWithResponse(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        ManagedShortTermRetentionPolicyName policyName,
        Context context);

    /**
     * Updates a managed database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be "default".
     * @param parameters The short term retention policy info.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ManagedBackupShortTermRetentionPolicyInner>, ManagedBackupShortTermRetentionPolicyInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String managedInstanceName,
            String databaseName,
            ManagedShortTermRetentionPolicyName policyName,
            ManagedBackupShortTermRetentionPolicyInner parameters);

    /**
     * Updates a managed database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be "default".
     * @param parameters The short term retention policy info.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ManagedBackupShortTermRetentionPolicyInner>, ManagedBackupShortTermRetentionPolicyInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String managedInstanceName,
            String databaseName,
            ManagedShortTermRetentionPolicyName policyName,
            ManagedBackupShortTermRetentionPolicyInner parameters,
            Context context);

    /**
     * Updates a managed database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be "default".
     * @param parameters The short term retention policy info.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedBackupShortTermRetentionPolicyInner createOrUpdate(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        ManagedShortTermRetentionPolicyName policyName,
        ManagedBackupShortTermRetentionPolicyInner parameters);

    /**
     * Updates a managed database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be "default".
     * @param parameters The short term retention policy info.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedBackupShortTermRetentionPolicyInner createOrUpdate(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        ManagedShortTermRetentionPolicyName policyName,
        ManagedBackupShortTermRetentionPolicyInner parameters,
        Context context);

    /**
     * Updates a managed database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be "default".
     * @param parameters The short term retention policy info.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ManagedBackupShortTermRetentionPolicyInner>, ManagedBackupShortTermRetentionPolicyInner>
        beginUpdate(
            String resourceGroupName,
            String managedInstanceName,
            String databaseName,
            ManagedShortTermRetentionPolicyName policyName,
            ManagedBackupShortTermRetentionPolicyInner parameters);

    /**
     * Updates a managed database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be "default".
     * @param parameters The short term retention policy info.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ManagedBackupShortTermRetentionPolicyInner>, ManagedBackupShortTermRetentionPolicyInner>
        beginUpdate(
            String resourceGroupName,
            String managedInstanceName,
            String databaseName,
            ManagedShortTermRetentionPolicyName policyName,
            ManagedBackupShortTermRetentionPolicyInner parameters,
            Context context);

    /**
     * Updates a managed database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be "default".
     * @param parameters The short term retention policy info.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedBackupShortTermRetentionPolicyInner update(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        ManagedShortTermRetentionPolicyName policyName,
        ManagedBackupShortTermRetentionPolicyInner parameters);

    /**
     * Updates a managed database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be "default".
     * @param parameters The short term retention policy info.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedBackupShortTermRetentionPolicyInner update(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        ManagedShortTermRetentionPolicyName policyName,
        ManagedBackupShortTermRetentionPolicyInner parameters,
        Context context);

    /**
     * Gets a managed database's short term retention policy list.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed database's short term retention policy list as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedBackupShortTermRetentionPolicyInner> listByDatabase(
        String resourceGroupName, String managedInstanceName, String databaseName);

    /**
     * Gets a managed database's short term retention policy list.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed database's short term retention policy list as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedBackupShortTermRetentionPolicyInner> listByDatabase(
        String resourceGroupName, String managedInstanceName, String databaseName, Context context);
}
