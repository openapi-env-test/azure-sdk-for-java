// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of NetworkFunctionVendorSkus. */
public interface NetworkFunctionVendorSkus {
    /**
     * Lists all network function vendor sku details in a vendor.
     *
     * @param vendorName The name of the network function vendor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of available network function skus as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SkuOverview> listByVendor(String vendorName);

    /**
     * Lists all network function vendor sku details in a vendor.
     *
     * @param vendorName The name of the network function vendor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of available network function skus as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SkuOverview> listByVendor(String vendorName, Context context);

    /**
     * Lists information about network function vendor sku details.
     *
     * @param vendorName The name of the network function vendor.
     * @param vendorSkuName The name of the network function sku.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the network function sku details as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkFunctionSkuRoleDetails> listBySku(String vendorName, String vendorSkuName);

    /**
     * Lists information about network function vendor sku details.
     *
     * @param vendorName The name of the network function vendor.
     * @param vendorSkuName The name of the network function sku.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the network function sku details as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkFunctionSkuRoleDetails> listBySku(String vendorName, String vendorSkuName, Context context);
}
