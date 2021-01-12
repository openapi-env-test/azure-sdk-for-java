// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.contoso_cdn.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.contoso_cdn.fluent.models.OriginInner;
import com.azure.resourcemanager.contoso_cdn.models.OriginUpdateParameters;

/** An instance of this class provides access to all the operations defined in OriginsClient. */
public interface OriginsClient {
    /**
     * Lists all of the existing origins within an endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list origins.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OriginInner> listByEndpoint(String resourceGroupName, String profileName, String endpointName);

    /**
     * Lists all of the existing origins within an endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list origins.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OriginInner> listByEndpoint(
        String resourceGroupName, String profileName, String endpointName, Context context);

    /**
     * Gets an existing origin within an endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param originName Name of the origin which is unique within the endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing origin within an endpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OriginInner get(String resourceGroupName, String profileName, String endpointName, String originName);

    /**
     * Gets an existing origin within an endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param originName Name of the origin which is unique within the endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing origin within an endpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OriginInner> getWithResponse(
        String resourceGroupName, String profileName, String endpointName, String originName, Context context);

    /**
     * Creates a new origin within the specified endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param originName Name of the origin that is unique within the endpoint.
     * @param origin Origin properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cDN origin is the source of the content being delivered via CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<OriginInner>, OriginInner> beginCreate(
        String resourceGroupName, String profileName, String endpointName, String originName, OriginInner origin);

    /**
     * Creates a new origin within the specified endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param originName Name of the origin that is unique within the endpoint.
     * @param origin Origin properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cDN origin is the source of the content being delivered via CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<OriginInner>, OriginInner> beginCreate(
        String resourceGroupName,
        String profileName,
        String endpointName,
        String originName,
        OriginInner origin,
        Context context);

    /**
     * Creates a new origin within the specified endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param originName Name of the origin that is unique within the endpoint.
     * @param origin Origin properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cDN origin is the source of the content being delivered via CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OriginInner create(
        String resourceGroupName, String profileName, String endpointName, String originName, OriginInner origin);

    /**
     * Creates a new origin within the specified endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param originName Name of the origin that is unique within the endpoint.
     * @param origin Origin properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cDN origin is the source of the content being delivered via CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OriginInner create(
        String resourceGroupName,
        String profileName,
        String endpointName,
        String originName,
        OriginInner origin,
        Context context);

    /**
     * Updates an existing origin within an endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param originName Name of the origin which is unique within the endpoint.
     * @param originUpdateProperties Origin properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cDN origin is the source of the content being delivered via CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<OriginInner>, OriginInner> beginUpdate(
        String resourceGroupName,
        String profileName,
        String endpointName,
        String originName,
        OriginUpdateParameters originUpdateProperties);

    /**
     * Updates an existing origin within an endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param originName Name of the origin which is unique within the endpoint.
     * @param originUpdateProperties Origin properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cDN origin is the source of the content being delivered via CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<OriginInner>, OriginInner> beginUpdate(
        String resourceGroupName,
        String profileName,
        String endpointName,
        String originName,
        OriginUpdateParameters originUpdateProperties,
        Context context);

    /**
     * Updates an existing origin within an endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param originName Name of the origin which is unique within the endpoint.
     * @param originUpdateProperties Origin properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cDN origin is the source of the content being delivered via CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OriginInner update(
        String resourceGroupName,
        String profileName,
        String endpointName,
        String originName,
        OriginUpdateParameters originUpdateProperties);

    /**
     * Updates an existing origin within an endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param originName Name of the origin which is unique within the endpoint.
     * @param originUpdateProperties Origin properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cDN origin is the source of the content being delivered via CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OriginInner update(
        String resourceGroupName,
        String profileName,
        String endpointName,
        String originName,
        OriginUpdateParameters originUpdateProperties,
        Context context);

    /**
     * Deletes an existing origin within an endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param originName Name of the origin which is unique within the endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String profileName, String endpointName, String originName);

    /**
     * Deletes an existing origin within an endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param originName Name of the origin which is unique within the endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String profileName, String endpointName, String originName, Context context);

    /**
     * Deletes an existing origin within an endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param originName Name of the origin which is unique within the endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String profileName, String endpointName, String originName);

    /**
     * Deletes an existing origin within an endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param originName Name of the origin which is unique within the endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String profileName, String endpointName, String originName, Context context);
}
