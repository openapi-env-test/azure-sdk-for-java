// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ReplicationProtectionIntents. */
public interface ReplicationProtectionIntents {
    /**
     * Gets the list of ASR replication protection intent objects in the vault.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of ASR replication protection intent objects in the vault as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<ReplicationProtectionIntent> list(String resourceName, String resourceGroupName);

    /**
     * Gets the list of ASR replication protection intent objects in the vault.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param skipToken The pagination token.
     * @param takeToken The page size.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of ASR replication protection intent objects in the vault as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<ReplicationProtectionIntent> list(
        String resourceName, String resourceGroupName, String skipToken, String takeToken, Context context);

    /**
     * Gets the details of an ASR replication protection intent.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param intentObjectName Replication protection intent name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an ASR replication protection intent.
     */
    ReplicationProtectionIntent get(String resourceName, String resourceGroupName, String intentObjectName);

    /**
     * Gets the details of an ASR replication protection intent.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param intentObjectName Replication protection intent name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an ASR replication protection intent along with {@link Response}.
     */
    Response<ReplicationProtectionIntent> getWithResponse(
        String resourceName, String resourceGroupName, String intentObjectName, Context context);

    /**
     * Gets the details of an ASR replication protection intent.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an ASR replication protection intent along with {@link Response}.
     */
    ReplicationProtectionIntent getById(String id);

    /**
     * Gets the details of an ASR replication protection intent.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an ASR replication protection intent along with {@link Response}.
     */
    Response<ReplicationProtectionIntent> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ReplicationProtectionIntent resource.
     *
     * @param name resource name.
     * @return the first stage of the new ReplicationProtectionIntent definition.
     */
    ReplicationProtectionIntent.DefinitionStages.Blank define(String name);
}
