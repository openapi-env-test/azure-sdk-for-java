// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.AdvisorInner;
import java.util.List;

/** An instance of this class provides access to all the operations defined in DatabaseAdvisorsClient. */
public interface DatabaseAdvisorsClient {
    /**
     * Gets a list of database advisors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database advisors.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<AdvisorInner> listByDatabase(String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets a list of database advisors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param expand The child resources to include in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database advisors along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<AdvisorInner>> listByDatabaseWithResponse(
        String resourceGroupName, String serverName, String databaseName, String expand, Context context);

    /**
     * Gets a database advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database advisor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AdvisorInner get(String resourceGroupName, String serverName, String databaseName, String advisorName);

    /**
     * Gets a database advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database advisor along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AdvisorInner> getWithResponse(
        String resourceGroupName, String serverName, String databaseName, String advisorName, Context context);

    /**
     * Updates a database advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param parameters The requested advisor resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database, Server or Elastic Pool Advisor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AdvisorInner update(
        String resourceGroupName, String serverName, String databaseName, String advisorName, AdvisorInner parameters);

    /**
     * Updates a database advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param parameters The requested advisor resource state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database, Server or Elastic Pool Advisor along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AdvisorInner> updateWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String advisorName,
        AdvisorInner parameters,
        Context context);
}
