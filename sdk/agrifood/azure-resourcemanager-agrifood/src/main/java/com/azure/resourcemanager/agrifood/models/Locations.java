// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Locations. */
public interface Locations {
    /**
     * Checks the name availability of the resource with requested resource name.
     *
     * @param body NameAvailabilityRequest object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result along with {@link Response}.
     */
    Response<CheckNameAvailabilityResponse> checkNameAvailabilityWithResponse(
        CheckNameAvailabilityRequest body, Context context);

    /**
     * Checks the name availability of the resource with requested resource name.
     *
     * @param body NameAvailabilityRequest object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result.
     */
    CheckNameAvailabilityResponse checkNameAvailability(CheckNameAvailabilityRequest body);
}
