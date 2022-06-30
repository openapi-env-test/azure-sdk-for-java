// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of TableServices. */
public interface TableServices {
    /**
     * List all table services for the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    ListTableServices list(String resourceGroupName, String accountName);

    /**
     * List all table services for the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    Response<ListTableServices> listWithResponse(String resourceGroupName, String accountName, Context context);

    /**
     * Gets the properties of a storage account’s Table service, including properties for Storage Analytics and CORS
     * (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a storage account’s Table service, including properties for Storage Analytics and CORS
     *     (Cross-Origin Resource Sharing) rules.
     */
    TableServiceProperties getServiceProperties(String resourceGroupName, String accountName);

    /**
     * Gets the properties of a storage account’s Table service, including properties for Storage Analytics and CORS
     * (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a storage account’s Table service, including properties for Storage Analytics and CORS
     *     (Cross-Origin Resource Sharing) rules along with {@link Response}.
     */
    Response<TableServiceProperties> getServicePropertiesWithResponse(
        String resourceGroupName, String accountName, Context context);

    /**
     * Gets the properties of a storage account’s Table service, including properties for Storage Analytics and CORS
     * (Cross-Origin Resource Sharing) rules.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a storage account’s Table service, including properties for Storage Analytics and CORS
     *     (Cross-Origin Resource Sharing) rules along with {@link Response}.
     */
    TableServiceProperties getServicePropertiesById(String id);

    /**
     * Gets the properties of a storage account’s Table service, including properties for Storage Analytics and CORS
     * (Cross-Origin Resource Sharing) rules.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a storage account’s Table service, including properties for Storage Analytics and CORS
     *     (Cross-Origin Resource Sharing) rules along with {@link Response}.
     */
    Response<TableServiceProperties> getServicePropertiesByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new TableServiceProperties resource.
     *
     * @return the first stage of the new TableServiceProperties definition.
     */
    TableServiceProperties.DefinitionStages.Blank define();
}
