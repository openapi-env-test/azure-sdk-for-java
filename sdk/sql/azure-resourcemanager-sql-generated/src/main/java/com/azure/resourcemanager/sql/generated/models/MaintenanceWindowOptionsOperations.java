// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of MaintenanceWindowOptionsOperations. */
public interface MaintenanceWindowOptionsOperations {
    /**
     * Gets a list of available maintenance windows.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database to get maintenance windows options for.
     * @param maintenanceWindowOptionsName Maintenance window options name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of available maintenance windows along with {@link Response}.
     */
    Response<MaintenanceWindowOptions> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String maintenanceWindowOptionsName,
        Context context);

    /**
     * Gets a list of available maintenance windows.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database to get maintenance windows options for.
     * @param maintenanceWindowOptionsName Maintenance window options name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of available maintenance windows.
     */
    MaintenanceWindowOptions get(
        String resourceGroupName, String serverName, String databaseName, String maintenanceWindowOptionsName);
}
