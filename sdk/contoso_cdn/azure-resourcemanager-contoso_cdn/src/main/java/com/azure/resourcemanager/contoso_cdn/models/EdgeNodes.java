// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.contoso_cdn.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of EdgeNodes. */
public interface EdgeNodes {
    /**
     * Edgenodes are the global Point of Presence (POP) locations used to deliver CDN content to end users.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list CDN edgenodes.
     */
    PagedIterable<EdgeNode> list();

    /**
     * Edgenodes are the global Point of Presence (POP) locations used to deliver CDN content to end users.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list CDN edgenodes.
     */
    PagedIterable<EdgeNode> list(Context context);
}
