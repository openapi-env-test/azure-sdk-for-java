// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Products. */
public interface Products {
    /**
     * Returns a list of products.
     *
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pageable list of products as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Product> list(String resourceGroup, String registrationName);

    /**
     * Returns a list of products.
     *
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pageable list of products as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Product> list(String resourceGroup, String registrationName, Context context);

    /**
     * Returns the specified product.
     *
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param productName Name of the product.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return product information.
     */
    Product get(String resourceGroup, String registrationName, String productName);

    /**
     * Returns the specified product.
     *
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param productName Name of the product.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return product information along with {@link Response}.
     */
    Response<Product> getWithResponse(
        String resourceGroup, String registrationName, String productName, Context context);

    /**
     * Returns the extended properties of a product.
     *
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param productName Name of the product.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extended description about the product required for installing it into Azure Stack.
     */
    ExtendedProduct listDetails(String resourceGroup, String registrationName, String productName);

    /**
     * Returns the extended properties of a product.
     *
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param productName Name of the product.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extended description about the product required for installing it into Azure Stack along with {@link
     *     Response}.
     */
    Response<ExtendedProduct> listDetailsWithResponse(
        String resourceGroup, String registrationName, String productName, Context context);

    /**
     * Returns a list of products.
     *
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param productName Name of the product.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pageable list of products.
     */
    ProductList getProducts(String resourceGroup, String registrationName, String productName);

    /**
     * Returns a list of products.
     *
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param productName Name of the product.
     * @param deviceConfiguration Device configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pageable list of products along with {@link Response}.
     */
    Response<ProductList> getProductsWithResponse(
        String resourceGroup,
        String registrationName,
        String productName,
        DeviceConfiguration deviceConfiguration,
        Context context);

    /**
     * Returns the specified product.
     *
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param productName Name of the product.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return product information.
     */
    Product getProduct(String resourceGroup, String registrationName, String productName);

    /**
     * Returns the specified product.
     *
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param productName Name of the product.
     * @param deviceConfiguration Device configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return product information along with {@link Response}.
     */
    Response<Product> getProductWithResponse(
        String resourceGroup,
        String registrationName,
        String productName,
        DeviceConfiguration deviceConfiguration,
        Context context);

    /**
     * Returns the specified product.
     *
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param productName Name of the product.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return product action log.
     */
    ProductLog uploadLog(String resourceGroup, String registrationName, String productName);

    /**
     * Returns the specified product.
     *
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param productName Name of the product.
     * @param marketplaceProductLogUpdate Update details for product log.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return product action log along with {@link Response}.
     */
    Response<ProductLog> uploadLogWithResponse(
        String resourceGroup,
        String registrationName,
        String productName,
        MarketplaceProductLogUpdate marketplaceProductLogUpdate,
        Context context);
}
