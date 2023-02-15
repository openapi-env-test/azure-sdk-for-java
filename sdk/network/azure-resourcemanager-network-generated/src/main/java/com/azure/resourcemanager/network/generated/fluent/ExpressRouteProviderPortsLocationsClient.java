// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteProviderPortListResultInner;

/**
 * An instance of this class provides access to all the operations defined in ExpressRouteProviderPortsLocationsClient.
 */
public interface ExpressRouteProviderPortsLocationsClient {
    /**
     * Retrieves all the ExpressRouteProviderPorts in a subscription.
     *
     * @param filter The filter to apply on the operation. For example, you can use $filter=location eq '{state}'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListExpressRouteProviderPort API service call along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExpressRouteProviderPortListResultInner> listWithResponse(String filter, Context context);

    /**
     * Retrieves all the ExpressRouteProviderPorts in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListExpressRouteProviderPort API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteProviderPortListResultInner list();
}
