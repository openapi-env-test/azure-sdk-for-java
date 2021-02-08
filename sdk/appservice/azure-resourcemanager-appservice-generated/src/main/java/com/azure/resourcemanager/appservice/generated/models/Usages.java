// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Usages. */
public interface Usages {
    /**
     * Returns usage records for specified subscription and resource groups.
     *
     * @param resourceGroupName Name of resource group.
     * @param environmentName Environment name.
     * @param lastId Last marker that was returned from the batch.
     * @param batchSize size of the batch to be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    Object getUsage(String resourceGroupName, String environmentName, String lastId, int batchSize);

    /**
     * Returns usage records for specified subscription and resource groups.
     *
     * @param resourceGroupName Name of resource group.
     * @param environmentName Environment name.
     * @param lastId Last marker that was returned from the batch.
     * @param batchSize size of the batch to be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    Response<Object> getUsageWithResponse(
        String resourceGroupName, String environmentName, String lastId, int batchSize, Context context);
}
