// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of DeletedWebApps. */
public interface DeletedWebApps {
    /**
     * Get all deleted apps for a subscription.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deleted apps for a subscription.
     */
    PagedIterable<DeletedSite> list();

    /**
     * Get all deleted apps for a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deleted apps for a subscription.
     */
    PagedIterable<DeletedSite> list(Context context);

    /**
     * Get all deleted apps for a subscription at location.
     *
     * @param location The location parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deleted apps for a subscription at location.
     */
    PagedIterable<DeletedSite> listByLocation(String location);

    /**
     * Get all deleted apps for a subscription at location.
     *
     * @param location The location parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deleted apps for a subscription at location.
     */
    PagedIterable<DeletedSite> listByLocation(String location, Context context);

    /**
     * Get deleted app for a subscription at location.
     *
     * @param location The location parameter.
     * @param deletedSiteId The numeric ID of the deleted app, e.g. 12345.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deleted app for a subscription at location.
     */
    DeletedSite getDeletedWebAppByLocation(String location, String deletedSiteId);

    /**
     * Get deleted app for a subscription at location.
     *
     * @param location The location parameter.
     * @param deletedSiteId The numeric ID of the deleted app, e.g. 12345.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deleted app for a subscription at location.
     */
    Response<DeletedSite> getDeletedWebAppByLocationWithResponse(
        String location, String deletedSiteId, Context context);
}
