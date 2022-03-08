// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.fluent.models.DataTransferJobGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.models.CreateJobRequest;

/** An instance of this class provides access to all the operations defined in DataTransferJobsClient. */
public interface DataTransferJobsClient {
    /**
     * Creates a Data Transfer Job.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param jobName Name of the Data Transfer Job.
     * @param jobCreateParameters Parameters to create Data Transfer Job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Cosmos DB Data Transfer Job.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataTransferJobGetResultsInner create(
        String resourceGroupName, String accountName, String jobName, CreateJobRequest jobCreateParameters);

    /**
     * Creates a Data Transfer Job.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param jobName Name of the Data Transfer Job.
     * @param jobCreateParameters Parameters to create Data Transfer Job.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Cosmos DB Data Transfer Job along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataTransferJobGetResultsInner> createWithResponse(
        String resourceGroupName,
        String accountName,
        String jobName,
        CreateJobRequest jobCreateParameters,
        Context context);

    /**
     * Get a Data Transfer Job.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param jobName Name of the Data Transfer Job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Data Transfer Job.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataTransferJobGetResultsInner get(String resourceGroupName, String accountName, String jobName);

    /**
     * Get a Data Transfer Job.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param jobName Name of the Data Transfer Job.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Data Transfer Job along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataTransferJobGetResultsInner> getWithResponse(
        String resourceGroupName, String accountName, String jobName, Context context);

    /**
     * Get a list of Data Transfer jobs.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Data Transfer jobs as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataTransferJobGetResultsInner> listByDatabaseAccount(String resourceGroupName, String accountName);

    /**
     * Get a list of Data Transfer jobs.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Data Transfer jobs as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataTransferJobGetResultsInner> listByDatabaseAccount(
        String resourceGroupName, String accountName, Context context);
}
