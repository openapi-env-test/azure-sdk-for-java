// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRoutePortsLocationInner;

/** An instance of this class provides access to all the operations defined in ExpressRoutePortsLocationsClient. */
public interface ExpressRoutePortsLocationsClient {
    /**
     * Retrieves all ExpressRoutePort peering locations. Does not return available bandwidths for each location.
     * Available bandwidths can only be obtained when retrieving a specific peering location.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoutePorts Location List Result.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRoutePortsLocationInner> list();

    /**
     * Retrieves all ExpressRoutePort peering locations. Does not return available bandwidths for each location.
     * Available bandwidths can only be obtained when retrieving a specific peering location.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoutePorts Location List Result.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRoutePortsLocationInner> list(Context context);

    /**
     * Retrieves a single ExpressRoutePort peering location, including the list of available bandwidths available at
     * said peering location.
     *
     * @param locationName Name of the requested ExpressRoutePort peering location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoutePorts Peering Location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRoutePortsLocationInner get(String locationName);

    /**
     * Retrieves a single ExpressRoutePort peering location, including the list of available bandwidths available at
     * said peering location.
     *
     * @param locationName Name of the requested ExpressRoutePort peering location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoutePorts Peering Location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExpressRoutePortsLocationInner> getWithResponse(String locationName, Context context);
}
