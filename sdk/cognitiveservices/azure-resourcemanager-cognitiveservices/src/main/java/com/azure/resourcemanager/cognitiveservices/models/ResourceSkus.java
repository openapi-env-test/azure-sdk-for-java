// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of ResourceSkus. */
public interface ResourceSkus {
    /**
     * Gets the list of Microsoft.CognitiveServices SKUs available for your Subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Microsoft.CognitiveServices SKUs available for your Subscription.
     */
    PagedIterable<ResourceSku> list();

    /**
     * Gets the list of Microsoft.CognitiveServices SKUs available for your Subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Microsoft.CognitiveServices SKUs available for your Subscription.
     */
    PagedIterable<ResourceSku> list(Context context);
}
