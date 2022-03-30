// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestack.fluent.models.CustomerSubscriptionInner;

/** An instance of this class provides access to all the operations defined in CustomerSubscriptionsClient. */
public interface CustomerSubscriptionsClient {
    /**
     * Returns a list of products.
     *
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pageable list of customer subscriptions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CustomerSubscriptionInner> list(String resourceGroup, String registrationName);

    /**
     * Returns a list of products.
     *
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pageable list of customer subscriptions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CustomerSubscriptionInner> list(String resourceGroup, String registrationName, Context context);

    /**
     * Returns the specified product.
     *
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param customerSubscriptionName Name of the product.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return customer subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomerSubscriptionInner get(String resourceGroup, String registrationName, String customerSubscriptionName);

    /**
     * Returns the specified product.
     *
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param customerSubscriptionName Name of the product.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return customer subscription along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CustomerSubscriptionInner> getWithResponse(
        String resourceGroup, String registrationName, String customerSubscriptionName, Context context);

    /**
     * Deletes a customer subscription under a registration.
     *
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param customerSubscriptionName Name of the product.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroup, String registrationName, String customerSubscriptionName);

    /**
     * Deletes a customer subscription under a registration.
     *
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param customerSubscriptionName Name of the product.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroup, String registrationName, String customerSubscriptionName, Context context);

    /**
     * Creates a new customer subscription under a registration.
     *
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param customerSubscriptionName Name of the product.
     * @param customerCreationParameters Parameters use to create a customer subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return customer subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomerSubscriptionInner create(
        String resourceGroup,
        String registrationName,
        String customerSubscriptionName,
        CustomerSubscriptionInner customerCreationParameters);

    /**
     * Creates a new customer subscription under a registration.
     *
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param customerSubscriptionName Name of the product.
     * @param customerCreationParameters Parameters use to create a customer subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return customer subscription along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CustomerSubscriptionInner> createWithResponse(
        String resourceGroup,
        String registrationName,
        String customerSubscriptionName,
        CustomerSubscriptionInner customerCreationParameters,
        Context context);
}
