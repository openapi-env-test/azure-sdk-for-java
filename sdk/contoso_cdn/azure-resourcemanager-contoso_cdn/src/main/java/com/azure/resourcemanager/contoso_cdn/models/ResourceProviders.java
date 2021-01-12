// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.contoso_cdn.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ResourceProviders. */
public interface ResourceProviders {
    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param checkNameAvailabilityInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    CheckNameAvailabilityOutput checkNameAvailability(CheckNameAvailabilityInput checkNameAvailabilityInput);

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param checkNameAvailabilityInput Input to check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    Response<CheckNameAvailabilityOutput> checkNameAvailabilityWithResponse(
        CheckNameAvailabilityInput checkNameAvailabilityInput, Context context);

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param checkNameAvailabilityInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    CheckNameAvailabilityOutput checkNameAvailabilityWithSubscription(
        CheckNameAvailabilityInput checkNameAvailabilityInput);

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param checkNameAvailabilityInput Input to check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    Response<CheckNameAvailabilityOutput> checkNameAvailabilityWithSubscriptionWithResponse(
        CheckNameAvailabilityInput checkNameAvailabilityInput, Context context);

    /**
     * Check if the probe path is a valid path and the file can be accessed. Probe path is the path to a file hosted on
     * the origin server to help accelerate the delivery of dynamic content via the CDN endpoint. This path is relative
     * to the origin path specified in the endpoint configuration.
     *
     * @param validateProbeInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the validate probe API.
     */
    ValidateProbeOutput validateProbe(ValidateProbeInput validateProbeInput);

    /**
     * Check if the probe path is a valid path and the file can be accessed. Probe path is the path to a file hosted on
     * the origin server to help accelerate the delivery of dynamic content via the CDN endpoint. This path is relative
     * to the origin path specified in the endpoint configuration.
     *
     * @param validateProbeInput Input to check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the validate probe API.
     */
    Response<ValidateProbeOutput> validateProbeWithResponse(ValidateProbeInput validateProbeInput, Context context);
}
