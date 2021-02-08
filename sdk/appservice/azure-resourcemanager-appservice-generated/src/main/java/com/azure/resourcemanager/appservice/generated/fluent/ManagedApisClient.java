// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.ApiEntityInner;

/** An instance of this class provides access to all the operations defined in ManagedApisClient. */
public interface ManagedApisClient {
    /**
     * Gets a list of managed APIs.
     *
     * @param location The location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed APIs.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApiEntityInner> list(String location);

    /**
     * Gets a list of managed APIs.
     *
     * @param location The location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed APIs.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApiEntityInner> list(String location, Context context);

    /**
     * Gets a managed API.
     *
     * @param location The location.
     * @param apiName The managed API name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiEntityInner get(String location, String apiName);

    /**
     * Gets a managed API.
     *
     * @param location The location.
     * @param apiName The managed API name.
     * @param export flag showing whether to export API definition in format specified by Accept header.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApiEntityInner> getWithResponse(String location, String apiName, Boolean export, Context context);
}
