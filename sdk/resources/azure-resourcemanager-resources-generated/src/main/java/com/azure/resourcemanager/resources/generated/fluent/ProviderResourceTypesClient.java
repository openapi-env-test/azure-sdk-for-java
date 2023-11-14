// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resources.generated.fluent.models.ProviderResourceTypeListResultInner;

/** An instance of this class provides access to all the operations defined in ProviderResourceTypesClient. */
public interface ProviderResourceTypesClient {
    /**
     * List the resource types for a specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand The $expand query parameter. For example, to include property aliases in response, use
     *     $expand=resourceTypes/aliases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of resource types of a resource provider along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProviderResourceTypeListResultInner> listWithResponse(
        String resourceProviderNamespace, String expand, Context context);

    /**
     * List the resource types for a specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of resource types of a resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProviderResourceTypeListResultInner list(String resourceProviderNamespace);
}
