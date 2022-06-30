// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of EncryptionScopes. */
public interface EncryptionScopes {
    /**
     * Returns the properties for the specified encryption scope.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    EncryptionScope get(String resourceGroupName, String accountName, String encryptionScopeName);

    /**
     * Returns the properties for the specified encryption scope.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource along with {@link Response}.
     */
    Response<EncryptionScope> getWithResponse(
        String resourceGroupName, String accountName, String encryptionScopeName, Context context);

    /**
     * Lists all the encryption scopes available under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of encryption scopes requested, and if paging is required, a URL to the next page of encryption
     *     scopes as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EncryptionScope> list(String resourceGroupName, String accountName);

    /**
     * Lists all the encryption scopes available under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of encryption scopes requested, and if paging is required, a URL to the next page of encryption
     *     scopes as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EncryptionScope> list(String resourceGroupName, String accountName, Context context);

    /**
     * Returns the properties for the specified encryption scope.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource along with {@link Response}.
     */
    EncryptionScope getById(String id);

    /**
     * Returns the properties for the specified encryption scope.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource along with {@link Response}.
     */
    Response<EncryptionScope> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new EncryptionScope resource.
     *
     * @param name resource name.
     * @return the first stage of the new EncryptionScope definition.
     */
    EncryptionScope.DefinitionStages.Blank define(String name);
}
