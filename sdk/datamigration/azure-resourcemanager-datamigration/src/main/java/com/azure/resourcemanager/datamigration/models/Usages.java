// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of Usages. */
public interface Usages {
    /**
     * This method returns region-specific quotas and resource usage information for the Database Migration Service.
     *
     * @param location The Azure region of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return oData page of quota objects as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Quota> list(String location);

    /**
     * This method returns region-specific quotas and resource usage information for the Database Migration Service.
     *
     * @param location The Azure region of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return oData page of quota objects as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Quota> list(String location, Context context);
}
