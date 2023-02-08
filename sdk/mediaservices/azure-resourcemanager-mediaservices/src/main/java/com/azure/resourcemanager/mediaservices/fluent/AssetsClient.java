// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.fluent.models.AssetContainerSasInner;
import com.azure.resourcemanager.mediaservices.fluent.models.AssetInner;
import com.azure.resourcemanager.mediaservices.fluent.models.ListStreamingLocatorsResponseInner;
import com.azure.resourcemanager.mediaservices.fluent.models.StorageEncryptedAssetDecryptionDataInner;
import com.azure.resourcemanager.mediaservices.models.ListContainerSasInput;

/** An instance of this class provides access to all the operations defined in AssetsClient. */
public interface AssetsClient {
    /**
     * List Assets
     *
     * <p>List Assets in the Media Services account with optional filtering and ordering.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of Asset items as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AssetInner> list(String resourceGroupName, String accountName);

    /**
     * List Assets
     *
     * <p>List Assets in the Media Services account with optional filtering and ordering.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param filter Restricts the set of items returned.
     * @param top Specifies a non-negative integer n that limits the number of items returned from a collection. The
     *     service returns the number of available items up to but not greater than the specified value n.
     * @param orderby Specifies the key by which the result collection should be ordered.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of Asset items as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AssetInner> list(
        String resourceGroupName, String accountName, String filter, Integer top, String orderby, Context context);

    /**
     * Get an Asset
     *
     * <p>Get the details of an Asset in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Asset in the Media Services account along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AssetInner> getWithResponse(
        String resourceGroupName, String accountName, String assetName, Context context);

    /**
     * Get an Asset
     *
     * <p>Get the details of an Asset in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Asset in the Media Services account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AssetInner get(String resourceGroupName, String accountName, String assetName);

    /**
     * Create or update an Asset
     *
     * <p>Creates or updates an Asset in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Asset along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AssetInner> createOrUpdateWithResponse(
        String resourceGroupName, String accountName, String assetName, AssetInner parameters, Context context);

    /**
     * Create or update an Asset
     *
     * <p>Creates or updates an Asset in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Asset.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AssetInner createOrUpdate(String resourceGroupName, String accountName, String assetName, AssetInner parameters);

    /**
     * Delete an Asset.
     *
     * <p>Deletes an Asset in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String accountName, String assetName, Context context);

    /**
     * Delete an Asset.
     *
     * <p>Deletes an Asset in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String assetName);

    /**
     * Update an Asset
     *
     * <p>Updates an existing Asset in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Asset along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AssetInner> updateWithResponse(
        String resourceGroupName, String accountName, String assetName, AssetInner parameters, Context context);

    /**
     * Update an Asset
     *
     * <p>Updates an existing Asset in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Asset.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AssetInner update(String resourceGroupName, String accountName, String assetName, AssetInner parameters);

    /**
     * List the Asset URLs
     *
     * <p>Lists storage container URLs with shared access signatures (SAS) for uploading and downloading Asset content.
     * The signatures are derived from the storage account keys.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Asset Storage container SAS URLs along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AssetContainerSasInner> listContainerSasWithResponse(
        String resourceGroupName,
        String accountName,
        String assetName,
        ListContainerSasInput parameters,
        Context context);

    /**
     * List the Asset URLs
     *
     * <p>Lists storage container URLs with shared access signatures (SAS) for uploading and downloading Asset content.
     * The signatures are derived from the storage account keys.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Asset Storage container SAS URLs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AssetContainerSasInner listContainerSas(
        String resourceGroupName, String accountName, String assetName, ListContainerSasInput parameters);

    /**
     * Gets the Asset storage key
     *
     * <p>Gets the Asset storage encryption keys used to decrypt content created by version 2 of the Media Services API.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Asset storage encryption keys used to decrypt content created by version 2 of the Media Services API
     *     along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<StorageEncryptedAssetDecryptionDataInner> getEncryptionKeyWithResponse(
        String resourceGroupName, String accountName, String assetName, Context context);

    /**
     * Gets the Asset storage key
     *
     * <p>Gets the Asset storage encryption keys used to decrypt content created by version 2 of the Media Services API.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Asset storage encryption keys used to decrypt content created by version 2 of the Media Services API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StorageEncryptedAssetDecryptionDataInner getEncryptionKey(
        String resourceGroupName, String accountName, String assetName);

    /**
     * List Streaming Locators
     *
     * <p>Lists Streaming Locators which are associated with this asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Streaming Locators associated with this Asset along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ListStreamingLocatorsResponseInner> listStreamingLocatorsWithResponse(
        String resourceGroupName, String accountName, String assetName, Context context);

    /**
     * List Streaming Locators
     *
     * <p>Lists Streaming Locators which are associated with this asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Streaming Locators associated with this Asset.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ListStreamingLocatorsResponseInner listStreamingLocators(
        String resourceGroupName, String accountName, String assetName);
}
