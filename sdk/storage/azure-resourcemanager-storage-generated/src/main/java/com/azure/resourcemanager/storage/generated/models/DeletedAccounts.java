// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of DeletedAccounts. */
public interface DeletedAccounts {
    /**
     * Lists deleted accounts under the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Deleted Accounts operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DeletedAccount> list();

    /**
     * Lists deleted accounts under the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Deleted Accounts operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DeletedAccount> list(Context context);

    /**
     * Get properties of specified deleted account resource.
     *
     * @param deletedAccountName Name of the deleted storage account.
     * @param location The location of the deleted storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of specified deleted account resource.
     */
    DeletedAccount get(String deletedAccountName, String location);

    /**
     * Get properties of specified deleted account resource.
     *
     * @param deletedAccountName Name of the deleted storage account.
     * @param location The location of the deleted storage account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of specified deleted account resource along with {@link Response}.
     */
    Response<DeletedAccount> getWithResponse(String deletedAccountName, String location, Context context);
}
