// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ResourceProviders. */
public interface ResourceProviders {
    /**
     * Checks whether a domain name in the cloudapp.azure.com zone is available for use.
     *
     * @param location The location of the domain name.
     * @param domainNameLabel The domain name to be verified. It must conform to the following regular expression:
     *     ^[a-z][a-z0-9-]{1,61}[a-z0-9]$.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the CheckDnsNameAvailability API service call.
     */
    DnsNameAvailabilityResult checkDnsNameAvailability(String location, String domainNameLabel);

    /**
     * Checks whether a domain name in the cloudapp.azure.com zone is available for use.
     *
     * @param location The location of the domain name.
     * @param domainNameLabel The domain name to be verified. It must conform to the following regular expression:
     *     ^[a-z][a-z0-9-]{1,61}[a-z0-9]$.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the CheckDnsNameAvailability API service call.
     */
    Response<DnsNameAvailabilityResult> checkDnsNameAvailabilityWithResponse(
        String location, String domainNameLabel, Context context);
}
