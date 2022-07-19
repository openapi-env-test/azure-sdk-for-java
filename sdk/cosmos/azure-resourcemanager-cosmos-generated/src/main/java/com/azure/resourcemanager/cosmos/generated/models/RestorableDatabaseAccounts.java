// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of RestorableDatabaseAccounts. */
public interface RestorableDatabaseAccounts {
    /**
     * Lists all the restorable Azure Cosmos DB database accounts available under the subscription and in a region. This
     * call requires 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable database accounts and their properties as
     *     paginated response with {@link PagedIterable}.
     */
    PagedIterable<RestorableDatabaseAccountGetResult> listByLocation(String location);

    /**
     * Lists all the restorable Azure Cosmos DB database accounts available under the subscription and in a region. This
     * call requires 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable database accounts and their properties as
     *     paginated response with {@link PagedIterable}.
     */
    PagedIterable<RestorableDatabaseAccountGetResult> listByLocation(String location, Context context);

    /**
     * Lists all the restorable Azure Cosmos DB database accounts available under the subscription. This call requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/read' permission.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable database accounts and their properties as
     *     paginated response with {@link PagedIterable}.
     */
    PagedIterable<RestorableDatabaseAccountGetResult> list();

    /**
     * Lists all the restorable Azure Cosmos DB database accounts available under the subscription. This call requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/read' permission.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable database accounts and their properties as
     *     paginated response with {@link PagedIterable}.
     */
    PagedIterable<RestorableDatabaseAccountGetResult> list(Context context);

    /**
     * Retrieves the properties of an existing Azure Cosmos DB restorable database account. This call requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/read/*' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Azure Cosmos DB restorable database account.
     */
    RestorableDatabaseAccountGetResult getByLocation(String location, String instanceId);

    /**
     * Retrieves the properties of an existing Azure Cosmos DB restorable database account. This call requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/read/*' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Azure Cosmos DB restorable database account along with {@link Response}.
     */
    Response<RestorableDatabaseAccountGetResult> getByLocationWithResponse(
        String location, String instanceId, Context context);
}
