// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of SqlPoolTransparentDataEncryptions. */
public interface SqlPoolTransparentDataEncryptions {
    /**
     * Get a SQL pool's transparent data encryption configuration
     *
     * <p>Get a SQL pool's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param transparentDataEncryptionName The name of the transparent data encryption configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL pool's transparent data encryption configuration along with {@link Response}.
     */
    Response<TransparentDataEncryption> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        TransparentDataEncryptionName transparentDataEncryptionName,
        Context context);

    /**
     * Get a SQL pool's transparent data encryption configuration
     *
     * <p>Get a SQL pool's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param transparentDataEncryptionName The name of the transparent data encryption configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL pool's transparent data encryption configuration.
     */
    TransparentDataEncryption get(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        TransparentDataEncryptionName transparentDataEncryptionName);

    /**
     * SQL pool's transparent data encryption configurations
     *
     * <p>Get list of SQL pool's transparent data encryption configurations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SQL pool's transparent data encryption configurations as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<TransparentDataEncryption> list(String resourceGroupName, String workspaceName, String sqlPoolName);

    /**
     * SQL pool's transparent data encryption configurations
     *
     * <p>Get list of SQL pool's transparent data encryption configurations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SQL pool's transparent data encryption configurations as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<TransparentDataEncryption> list(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context);

    /**
     * Get a SQL pool's transparent data encryption configuration
     *
     * <p>Get a SQL pool's transparent data encryption configuration.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL pool's transparent data encryption configuration along with {@link Response}.
     */
    TransparentDataEncryption getById(String id);

    /**
     * Get a SQL pool's transparent data encryption configuration
     *
     * <p>Get a SQL pool's transparent data encryption configuration.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL pool's transparent data encryption configuration along with {@link Response}.
     */
    Response<TransparentDataEncryption> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new TransparentDataEncryption resource.
     *
     * @param name resource name.
     * @return the first stage of the new TransparentDataEncryption definition.
     */
    TransparentDataEncryption.DefinitionStages.Blank define(TransparentDataEncryptionName name);
}
