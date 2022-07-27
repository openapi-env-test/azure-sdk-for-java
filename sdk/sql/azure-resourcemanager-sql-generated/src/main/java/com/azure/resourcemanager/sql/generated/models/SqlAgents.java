// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.SqlAgentConfigurationInner;

/** Resource collection API of SqlAgents. */
public interface SqlAgents {
    /**
     * Gets current instance sql agent configuration.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return current instance sql agent configuration.
     */
    SqlAgentConfiguration get(String resourceGroupName, String managedInstanceName);

    /**
     * Gets current instance sql agent configuration.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return current instance sql agent configuration along with {@link Response}.
     */
    Response<SqlAgentConfiguration> getWithResponse(
        String resourceGroupName, String managedInstanceName, Context context);

    /**
     * Puts new sql agent configuration to instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param parameters A recoverable managed database resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a recoverable managed database resource.
     */
    SqlAgentConfiguration createOrUpdate(
        String resourceGroupName, String managedInstanceName, SqlAgentConfigurationInner parameters);

    /**
     * Puts new sql agent configuration to instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param parameters A recoverable managed database resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a recoverable managed database resource along with {@link Response}.
     */
    Response<SqlAgentConfiguration> createOrUpdateWithResponse(
        String resourceGroupName, String managedInstanceName, SqlAgentConfigurationInner parameters, Context context);
}
