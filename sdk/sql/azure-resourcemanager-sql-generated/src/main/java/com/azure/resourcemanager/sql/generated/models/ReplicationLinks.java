// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ReplicationLinks. */
public interface ReplicationLinks {
    /**
     * Deletes a database replication link. Cannot be done during failover.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database that has the replication link to be dropped.
     * @param linkId The ID of the replication link to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serverName, String databaseName, String linkId);

    /**
     * Deletes a database replication link. Cannot be done during failover.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database that has the replication link to be dropped.
     * @param linkId The ID of the replication link to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String serverName, String databaseName, String linkId, Context context);

    /**
     * Gets a database replication link.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database to get the link for.
     * @param linkId The replication link ID to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database replication link.
     */
    ReplicationLink get(String resourceGroupName, String serverName, String databaseName, String linkId);

    /**
     * Gets a database replication link.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database to get the link for.
     * @param linkId The replication link ID to be retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database replication link.
     */
    Response<ReplicationLink> getWithResponse(
        String resourceGroupName, String serverName, String databaseName, String linkId, Context context);

    /**
     * Sets which replica database is primary by failing over from the current primary replica database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database that has the replication link to be failed over.
     * @param linkId The ID of the replication link to be failed over.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void failover(String resourceGroupName, String serverName, String databaseName, String linkId);

    /**
     * Sets which replica database is primary by failing over from the current primary replica database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database that has the replication link to be failed over.
     * @param linkId The ID of the replication link to be failed over.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void failover(String resourceGroupName, String serverName, String databaseName, String linkId, Context context);

    /**
     * Sets which replica database is primary by failing over from the current primary replica database. This operation
     * might result in data loss.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database that has the replication link to be failed over.
     * @param linkId The ID of the replication link to be failed over.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void failoverAllowDataLoss(String resourceGroupName, String serverName, String databaseName, String linkId);

    /**
     * Sets which replica database is primary by failing over from the current primary replica database. This operation
     * might result in data loss.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database that has the replication link to be failed over.
     * @param linkId The ID of the replication link to be failed over.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void failoverAllowDataLoss(
        String resourceGroupName, String serverName, String databaseName, String linkId, Context context);

    /**
     * Deletes a database replication link in forced or friendly way.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database that has the replication link to be failed over.
     * @param linkId The ID of the replication link to be failed over.
     * @param parameters The required parameters for unlinking replication link.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void unlink(
        String resourceGroupName, String serverName, String databaseName, String linkId, UnlinkParameters parameters);

    /**
     * Deletes a database replication link in forced or friendly way.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database that has the replication link to be failed over.
     * @param linkId The ID of the replication link to be failed over.
     * @param parameters The required parameters for unlinking replication link.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void unlink(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String linkId,
        UnlinkParameters parameters,
        Context context);

    /**
     * Lists a database's replication links.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database to retrieve links for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a List database replication link request.
     */
    PagedIterable<ReplicationLink> listByDatabase(String resourceGroupName, String serverName, String databaseName);

    /**
     * Lists a database's replication links.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database to retrieve links for.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a List database replication link request.
     */
    PagedIterable<ReplicationLink> listByDatabase(
        String resourceGroupName, String serverName, String databaseName, Context context);
}
