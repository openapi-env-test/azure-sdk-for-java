// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.adp.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.adp.fluent.models.DataPoolInner;
import com.azure.resourcemanager.adp.models.DataPoolPatch;

/** An instance of this class provides access to all the operations defined in DataPoolsClient. */
public interface DataPoolsClient {
    /**
     * Lists the data pools under the ADP account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list operation response, that contains the data pools and their properties as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataPoolInner> list(String resourceGroupName, String accountName);

    /**
     * Lists the data pools under the ADP account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list operation response, that contains the data pools and their properties as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataPoolInner> list(String resourceGroupName, String accountName, Context context);

    /**
     * Gets the properties of a Data Pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param dataPoolName The name of the Data Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a Data Pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataPoolInner get(String resourceGroupName, String accountName, String dataPoolName);

    /**
     * Gets the properties of a Data Pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param dataPoolName The name of the Data Pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a Data Pool along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataPoolInner> getWithResponse(
        String resourceGroupName, String accountName, String dataPoolName, Context context);

    /**
     * Updates the properties of an existing Data Pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param dataPoolName The name of the Data Pool.
     * @param parameters The parameters to provide for the Data Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of aDP Data Pool.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DataPoolInner>, DataPoolInner> beginUpdate(
        String resourceGroupName, String accountName, String dataPoolName, DataPoolPatch parameters);

    /**
     * Updates the properties of an existing Data Pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param dataPoolName The name of the Data Pool.
     * @param parameters The parameters to provide for the Data Pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of aDP Data Pool.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DataPoolInner>, DataPoolInner> beginUpdate(
        String resourceGroupName, String accountName, String dataPoolName, DataPoolPatch parameters, Context context);

    /**
     * Updates the properties of an existing Data Pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param dataPoolName The name of the Data Pool.
     * @param parameters The parameters to provide for the Data Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aDP Data Pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataPoolInner update(String resourceGroupName, String accountName, String dataPoolName, DataPoolPatch parameters);

    /**
     * Updates the properties of an existing Data Pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param dataPoolName The name of the Data Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aDP Data Pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataPoolInner update(String resourceGroupName, String accountName, String dataPoolName);

    /**
     * Updates the properties of an existing Data Pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param dataPoolName The name of the Data Pool.
     * @param parameters The parameters to provide for the Data Pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aDP Data Pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataPoolInner update(
        String resourceGroupName, String accountName, String dataPoolName, DataPoolPatch parameters, Context context);

    /**
     * Creates or updates a Data Pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param dataPoolName The name of the Data Pool.
     * @param parameters The parameters to provide for the Data Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of aDP Data Pool.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DataPoolInner>, DataPoolInner> beginCreateOrUpdate(
        String resourceGroupName, String accountName, String dataPoolName, DataPoolInner parameters);

    /**
     * Creates or updates a Data Pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param dataPoolName The name of the Data Pool.
     * @param parameters The parameters to provide for the Data Pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of aDP Data Pool.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DataPoolInner>, DataPoolInner> beginCreateOrUpdate(
        String resourceGroupName, String accountName, String dataPoolName, DataPoolInner parameters, Context context);

    /**
     * Creates or updates a Data Pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param dataPoolName The name of the Data Pool.
     * @param parameters The parameters to provide for the Data Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aDP Data Pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataPoolInner createOrUpdate(
        String resourceGroupName, String accountName, String dataPoolName, DataPoolInner parameters);

    /**
     * Creates or updates a Data Pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param dataPoolName The name of the Data Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aDP Data Pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataPoolInner createOrUpdate(String resourceGroupName, String accountName, String dataPoolName);

    /**
     * Creates or updates a Data Pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param dataPoolName The name of the Data Pool.
     * @param parameters The parameters to provide for the Data Pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aDP Data Pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataPoolInner createOrUpdate(
        String resourceGroupName, String accountName, String dataPoolName, DataPoolInner parameters, Context context);

    /**
     * Deletes a Data Pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param dataPoolName The name of the Data Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String accountName, String dataPoolName);

    /**
     * Deletes a Data Pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param dataPoolName The name of the Data Pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String accountName, String dataPoolName, Context context);

    /**
     * Deletes a Data Pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param dataPoolName The name of the Data Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String dataPoolName);

    /**
     * Deletes a Data Pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param dataPoolName The name of the Data Pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String dataPoolName, Context context);
}
