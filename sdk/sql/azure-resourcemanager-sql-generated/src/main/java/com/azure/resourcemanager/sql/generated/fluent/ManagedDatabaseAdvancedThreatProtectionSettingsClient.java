// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedDatabaseAdvancedThreatProtectionInner;
import com.azure.resourcemanager.sql.generated.models.AdvancedThreatProtectionName;

/**
 * An instance of this class provides access to all the operations defined in
 * ManagedDatabaseAdvancedThreatProtectionSettingsClient.
 */
public interface ManagedDatabaseAdvancedThreatProtectionSettingsClient {
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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedDatabaseAdvancedThreatProtectionInner> listByDatabase(
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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedDatabaseAdvancedThreatProtectionInner> listByDatabase(
        String resourceGroupName, String managedInstanceName, String databaseName, Context context);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagedDatabaseAdvancedThreatProtectionInner> getWithResponse(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        AdvancedThreatProtectionName advancedThreatProtectionName,
        Context context);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedDatabaseAdvancedThreatProtectionInner get(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        AdvancedThreatProtectionName advancedThreatProtectionName);

    /**
     * Creates or updates a managed database's Advanced Threat Protection state.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param advancedThreatProtectionName The name of the Advanced Threat Protection state.
     * @param parameters The managed database Advanced Threat Protection state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed database Advanced Threat Protection along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagedDatabaseAdvancedThreatProtectionInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        AdvancedThreatProtectionName advancedThreatProtectionName,
        ManagedDatabaseAdvancedThreatProtectionInner parameters,
        Context context);

    /**
     * Creates or updates a managed database's Advanced Threat Protection state.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param advancedThreatProtectionName The name of the Advanced Threat Protection state.
     * @param parameters The managed database Advanced Threat Protection state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed database Advanced Threat Protection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedDatabaseAdvancedThreatProtectionInner createOrUpdate(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        AdvancedThreatProtectionName advancedThreatProtectionName,
        ManagedDatabaseAdvancedThreatProtectionInner parameters);
}
