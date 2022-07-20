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
import com.azure.resourcemanager.cosmos.generated.fluent.models.BackupResourceInner;
import com.azure.resourcemanager.cosmos.generated.fluent.models.CassandraClusterPublicStatusInner;
import com.azure.resourcemanager.cosmos.generated.fluent.models.ClusterResourceInner;
import com.azure.resourcemanager.cosmos.generated.fluent.models.CommandOutputInner;
import com.azure.resourcemanager.cosmos.generated.models.CommandPostBody;

/** An instance of this class provides access to all the operations defined in CassandraClustersClient. */
public interface CassandraClustersClient {
    /**
     * List all managed Cassandra clusters in this subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of managed Cassandra clusters as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterResourceInner> list();

    /**
     * List all managed Cassandra clusters in this subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of managed Cassandra clusters as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterResourceInner> list(Context context);

    /**
     * List all managed Cassandra clusters in this resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of managed Cassandra clusters as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterResourceInner> listByResourceGroup(String resourceGroupName);

    /**
     * List all managed Cassandra clusters in this resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of managed Cassandra clusters as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterResourceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get the properties of a managed Cassandra cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a managed Cassandra cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterResourceInner getByResourceGroup(String resourceGroupName, String clusterName);

    /**
     * Get the properties of a managed Cassandra cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a managed Cassandra cluster along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ClusterResourceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String clusterName, Context context);

    /**
     * Deletes a managed Cassandra cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String clusterName);

    /**
     * Deletes a managed Cassandra cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String clusterName, Context context);

    /**
     * Deletes a managed Cassandra cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName);

    /**
     * Deletes a managed Cassandra cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, Context context);

    /**
     * Create or update a managed Cassandra cluster. When updating, you must specify all writable properties. To update
     * only some properties, use PATCH.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param body The properties specifying the desired state of the managed Cassandra cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of representation of a managed Cassandra cluster.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ClusterResourceInner>, ClusterResourceInner> beginCreateUpdate(
        String resourceGroupName, String clusterName, ClusterResourceInner body);

    /**
     * Create or update a managed Cassandra cluster. When updating, you must specify all writable properties. To update
     * only some properties, use PATCH.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param body The properties specifying the desired state of the managed Cassandra cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of representation of a managed Cassandra cluster.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ClusterResourceInner>, ClusterResourceInner> beginCreateUpdate(
        String resourceGroupName, String clusterName, ClusterResourceInner body, Context context);

    /**
     * Create or update a managed Cassandra cluster. When updating, you must specify all writable properties. To update
     * only some properties, use PATCH.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param body The properties specifying the desired state of the managed Cassandra cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return representation of a managed Cassandra cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterResourceInner createUpdate(String resourceGroupName, String clusterName, ClusterResourceInner body);

    /**
     * Create or update a managed Cassandra cluster. When updating, you must specify all writable properties. To update
     * only some properties, use PATCH.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param body The properties specifying the desired state of the managed Cassandra cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return representation of a managed Cassandra cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterResourceInner createUpdate(
        String resourceGroupName, String clusterName, ClusterResourceInner body, Context context);

    /**
     * Updates some of the properties of a managed Cassandra cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param body Parameters to provide for specifying the managed Cassandra cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of representation of a managed Cassandra cluster.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ClusterResourceInner>, ClusterResourceInner> beginUpdate(
        String resourceGroupName, String clusterName, ClusterResourceInner body);

    /**
     * Updates some of the properties of a managed Cassandra cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param body Parameters to provide for specifying the managed Cassandra cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of representation of a managed Cassandra cluster.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ClusterResourceInner>, ClusterResourceInner> beginUpdate(
        String resourceGroupName, String clusterName, ClusterResourceInner body, Context context);

    /**
     * Updates some of the properties of a managed Cassandra cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param body Parameters to provide for specifying the managed Cassandra cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return representation of a managed Cassandra cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterResourceInner update(String resourceGroupName, String clusterName, ClusterResourceInner body);

    /**
     * Updates some of the properties of a managed Cassandra cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param body Parameters to provide for specifying the managed Cassandra cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return representation of a managed Cassandra cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterResourceInner update(
        String resourceGroupName, String clusterName, ClusterResourceInner body, Context context);

    /**
     * Invoke a command like nodetool for cassandra maintenance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param body Specification which command to run where.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of response of /command api.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CommandOutputInner>, CommandOutputInner> beginInvokeCommand(
        String resourceGroupName, String clusterName, CommandPostBody body);

    /**
     * Invoke a command like nodetool for cassandra maintenance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param body Specification which command to run where.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of response of /command api.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CommandOutputInner>, CommandOutputInner> beginInvokeCommand(
        String resourceGroupName, String clusterName, CommandPostBody body, Context context);

    /**
     * Invoke a command like nodetool for cassandra maintenance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param body Specification which command to run where.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of /command api.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CommandOutputInner invokeCommand(String resourceGroupName, String clusterName, CommandPostBody body);

    /**
     * Invoke a command like nodetool for cassandra maintenance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param body Specification which command to run where.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of /command api.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CommandOutputInner invokeCommand(
        String resourceGroupName, String clusterName, CommandPostBody body, Context context);

    /**
     * List the backups of this cluster that are available to restore.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of restorable backups for a Cassandra cluster as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BackupResourceInner> listBackups(String resourceGroupName, String clusterName);

    /**
     * List the backups of this cluster that are available to restore.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of restorable backups for a Cassandra cluster as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BackupResourceInner> listBackups(String resourceGroupName, String clusterName, Context context);

    /**
     * Get the properties of an individual backup of this cluster that is available to restore.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param backupId Id of a restorable backup of a Cassandra cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of an individual backup of this cluster that is available to restore.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackupResourceInner getBackup(String resourceGroupName, String clusterName, String backupId);

    /**
     * Get the properties of an individual backup of this cluster that is available to restore.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param backupId Id of a restorable backup of a Cassandra cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of an individual backup of this cluster that is available to restore along with {@link
     *     Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BackupResourceInner> getBackupWithResponse(
        String resourceGroupName, String clusterName, String backupId, Context context);

    /**
     * Deallocate the Managed Cassandra Cluster and Associated Data Centers. Deallocation will deallocate the host
     * virtual machine of this cluster, and reserved the data disk. This won't do anything on an already deallocated
     * cluster. Use Start to restart the cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDeallocate(String resourceGroupName, String clusterName);

    /**
     * Deallocate the Managed Cassandra Cluster and Associated Data Centers. Deallocation will deallocate the host
     * virtual machine of this cluster, and reserved the data disk. This won't do anything on an already deallocated
     * cluster. Use Start to restart the cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDeallocate(String resourceGroupName, String clusterName, Context context);

    /**
     * Deallocate the Managed Cassandra Cluster and Associated Data Centers. Deallocation will deallocate the host
     * virtual machine of this cluster, and reserved the data disk. This won't do anything on an already deallocated
     * cluster. Use Start to restart the cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deallocate(String resourceGroupName, String clusterName);

    /**
     * Deallocate the Managed Cassandra Cluster and Associated Data Centers. Deallocation will deallocate the host
     * virtual machine of this cluster, and reserved the data disk. This won't do anything on an already deallocated
     * cluster. Use Start to restart the cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deallocate(String resourceGroupName, String clusterName, Context context);

    /**
     * Start the Managed Cassandra Cluster and Associated Data Centers. Start will start the host virtual machine of
     * this cluster with reserved data disk. This won't do anything on an already running cluster. Use Deallocate to
     * deallocate the cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginStart(String resourceGroupName, String clusterName);

    /**
     * Start the Managed Cassandra Cluster and Associated Data Centers. Start will start the host virtual machine of
     * this cluster with reserved data disk. This won't do anything on an already running cluster. Use Deallocate to
     * deallocate the cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginStart(String resourceGroupName, String clusterName, Context context);

    /**
     * Start the Managed Cassandra Cluster and Associated Data Centers. Start will start the host virtual machine of
     * this cluster with reserved data disk. This won't do anything on an already running cluster. Use Deallocate to
     * deallocate the cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void start(String resourceGroupName, String clusterName);

    /**
     * Start the Managed Cassandra Cluster and Associated Data Centers. Start will start the host virtual machine of
     * this cluster with reserved data disk. This won't do anything on an already running cluster. Use Deallocate to
     * deallocate the cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void start(String resourceGroupName, String clusterName, Context context);

    /**
     * Gets the CPU, memory, and disk usage statistics for each Cassandra node in a cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the CPU, memory, and disk usage statistics for each Cassandra node in a cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CassandraClusterPublicStatusInner status(String resourceGroupName, String clusterName);

    /**
     * Gets the CPU, memory, and disk usage statistics for each Cassandra node in a cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the CPU, memory, and disk usage statistics for each Cassandra node in a cluster along with {@link
     *     Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CassandraClusterPublicStatusInner> statusWithResponse(
        String resourceGroupName, String clusterName, Context context);
}
