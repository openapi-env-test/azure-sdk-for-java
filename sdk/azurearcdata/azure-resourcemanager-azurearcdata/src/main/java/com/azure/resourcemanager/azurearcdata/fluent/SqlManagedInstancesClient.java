// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.azurearcdata.fluent.models.SqlManagedInstanceInner;
import com.azure.resourcemanager.azurearcdata.models.SqlManagedInstanceUpdate;

/** An instance of this class provides access to all the operations defined in SqlManagedInstancesClient. */
public interface SqlManagedInstancesClient {
    /**
     * List sqlManagedInstance resources in the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SqlManagedInstance as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SqlManagedInstanceInner> list();

    /**
     * List sqlManagedInstance resources in the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SqlManagedInstance as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SqlManagedInstanceInner> list(Context context);

    /**
     * Gets all sqlManagedInstances in a resource group.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all sqlManagedInstances in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SqlManagedInstanceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all sqlManagedInstances in a resource group.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all sqlManagedInstances in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SqlManagedInstanceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Retrieves a SQL Managed Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param sqlManagedInstanceName Name of SQL Managed Instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SqlManagedInstance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SqlManagedInstanceInner getByResourceGroup(String resourceGroupName, String sqlManagedInstanceName);

    /**
     * Retrieves a SQL Managed Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param sqlManagedInstanceName Name of SQL Managed Instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SqlManagedInstance along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SqlManagedInstanceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String sqlManagedInstanceName, Context context);

    /**
     * Creates or replaces a SQL Managed Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param sqlManagedInstanceName Name of SQL Managed Instance.
     * @param sqlManagedInstance The SQL Managed Instance to be created or updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a SqlManagedInstance.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SqlManagedInstanceInner>, SqlManagedInstanceInner> beginCreate(
        String resourceGroupName, String sqlManagedInstanceName, SqlManagedInstanceInner sqlManagedInstance);

    /**
     * Creates or replaces a SQL Managed Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param sqlManagedInstanceName Name of SQL Managed Instance.
     * @param sqlManagedInstance The SQL Managed Instance to be created or updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a SqlManagedInstance.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SqlManagedInstanceInner>, SqlManagedInstanceInner> beginCreate(
        String resourceGroupName,
        String sqlManagedInstanceName,
        SqlManagedInstanceInner sqlManagedInstance,
        Context context);

    /**
     * Creates or replaces a SQL Managed Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param sqlManagedInstanceName Name of SQL Managed Instance.
     * @param sqlManagedInstance The SQL Managed Instance to be created or updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SqlManagedInstance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SqlManagedInstanceInner create(
        String resourceGroupName, String sqlManagedInstanceName, SqlManagedInstanceInner sqlManagedInstance);

    /**
     * Creates or replaces a SQL Managed Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param sqlManagedInstanceName Name of SQL Managed Instance.
     * @param sqlManagedInstance The SQL Managed Instance to be created or updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SqlManagedInstance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SqlManagedInstanceInner create(
        String resourceGroupName,
        String sqlManagedInstanceName,
        SqlManagedInstanceInner sqlManagedInstance,
        Context context);

    /**
     * Deletes a SQL Managed Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param sqlManagedInstanceName Name of SQL Managed Instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String sqlManagedInstanceName);

    /**
     * Deletes a SQL Managed Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param sqlManagedInstanceName Name of SQL Managed Instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String sqlManagedInstanceName, Context context);

    /**
     * Deletes a SQL Managed Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param sqlManagedInstanceName Name of SQL Managed Instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String sqlManagedInstanceName);

    /**
     * Deletes a SQL Managed Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param sqlManagedInstanceName Name of SQL Managed Instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String sqlManagedInstanceName, Context context);

    /**
     * Updates a SQL Managed Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param sqlManagedInstanceName Name of SQL Managed Instance.
     * @param parameters The SQL Managed Instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SqlManagedInstance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SqlManagedInstanceInner update(
        String resourceGroupName, String sqlManagedInstanceName, SqlManagedInstanceUpdate parameters);

    /**
     * Updates a SQL Managed Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param sqlManagedInstanceName Name of SQL Managed Instance.
     * @param parameters The SQL Managed Instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SqlManagedInstance along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SqlManagedInstanceInner> updateWithResponse(
        String resourceGroupName, String sqlManagedInstanceName, SqlManagedInstanceUpdate parameters, Context context);
}
