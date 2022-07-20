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

/** An instance of this class provides access to all the operations defined in ServerAdvisorsClient. */
public interface ServerAdvisorsClient {
    /**
     * Gets a list of server advisors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server advisors.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<AdvisorInner> listByServer(String resourceGroupName, String serverName);

    /**
     * Gets a list of server advisors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param expand The child resources to include in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server advisors along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<AdvisorInner>> listByServerWithResponse(
        String resourceGroupName, String serverName, String expand, Context context);

    /**
     * Gets a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server advisor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AdvisorInner get(String resourceGroupName, String serverName, String advisorName);

    /**
     * Gets a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server advisor along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AdvisorInner> getWithResponse(
        String resourceGroupName, String serverName, String advisorName, Context context);

    /**
     * Updates a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @param parameters The requested advisor resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database, Server or Elastic Pool Advisor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AdvisorInner update(String resourceGroupName, String serverName, String advisorName, AdvisorInner parameters);

    /**
     * Updates a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @param parameters The requested advisor resource state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database, Server or Elastic Pool Advisor along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AdvisorInner> updateWithResponse(
        String resourceGroupName, String serverName, String advisorName, AdvisorInner parameters, Context context);
}
