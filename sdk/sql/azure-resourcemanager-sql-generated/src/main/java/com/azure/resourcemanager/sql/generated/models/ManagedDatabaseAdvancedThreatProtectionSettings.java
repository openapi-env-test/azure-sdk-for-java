// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ManagedDatabaseAdvancedThreatProtectionSettings. */
public interface ManagedDatabaseAdvancedThreatProtectionSettings {
    /**
     * Gets a list of managed database's Advanced Threat Protection states.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed database's Advanced Threat Protection states as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<ManagedDatabaseAdvancedThreatProtection> listByDatabase(
        String resourceGroupName, String managedInstanceName, String databaseName);

    /**
     * Gets a list of managed database's Advanced Threat Protection states.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed database's Advanced Threat Protection states as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<ManagedDatabaseAdvancedThreatProtection> listByDatabase(
        String resourceGroupName, String managedInstanceName, String databaseName, Context context);

    /**
     * Gets a managed database's Advanced Threat Protection state.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param advancedThreatProtectionName The name of the Advanced Threat Protection state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed database's Advanced Threat Protection state.
     */
    ManagedDatabaseAdvancedThreatProtection get(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        AdvancedThreatProtectionName advancedThreatProtectionName);

    /**
     * Gets a managed database's Advanced Threat Protection state.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param advancedThreatProtectionName The name of the Advanced Threat Protection state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed database's Advanced Threat Protection state along with {@link Response}.
     */
    Response<ManagedDatabaseAdvancedThreatProtection> getWithResponse(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        AdvancedThreatProtectionName advancedThreatProtectionName,
        Context context);

    /**
     * Gets a managed database's Advanced Threat Protection state.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed database's Advanced Threat Protection state along with {@link Response}.
     */
    ManagedDatabaseAdvancedThreatProtection getById(String id);

    /**
     * Gets a managed database's Advanced Threat Protection state.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed database's Advanced Threat Protection state along with {@link Response}.
     */
    Response<ManagedDatabaseAdvancedThreatProtection> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ManagedDatabaseAdvancedThreatProtection resource.
     *
     * @param name resource name.
     * @return the first stage of the new ManagedDatabaseAdvancedThreatProtection definition.
     */
    ManagedDatabaseAdvancedThreatProtection.DefinitionStages.Blank define(AdvancedThreatProtectionName name);
}
