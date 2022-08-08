// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vi.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ClassicAccounts. */
public interface ClassicAccounts {
    /**
     * Gets the properties of an Azure Video Indexer Classic account.
     *
     * @param location The name of Azure region.
     * @param accountName The name of the Azure Video Indexer account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of an Azure Video Indexer Classic account.
     */
    ClassicAccount getDetails(String location, String accountName);

    /**
     * Gets the properties of an Azure Video Indexer Classic account.
     *
     * @param location The name of Azure region.
     * @param accountName The name of the Azure Video Indexer account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of an Azure Video Indexer Classic account along with {@link Response}.
     */
    Response<ClassicAccount> getDetailsWithResponse(String location, String accountName, Context context);
}
