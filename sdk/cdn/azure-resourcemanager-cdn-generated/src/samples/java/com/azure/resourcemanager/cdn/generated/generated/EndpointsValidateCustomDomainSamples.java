// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cdn.generated.models.ValidateCustomDomainInput;

/** Samples for Endpoints ValidateCustomDomain. */
public final class EndpointsValidateCustomDomainSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2021-06-01/examples/Endpoints_ValidateCustomDomain.json
     */
    /**
     * Sample code: Endpoints_ValidateCustomDomain.
     *
     * @param manager Entry point to CdnManager.
     */
    public static void endpointsValidateCustomDomain(com.azure.resourcemanager.cdn.generated.CdnManager manager) {
        manager
            .endpoints()
            .validateCustomDomainWithResponse(
                "RG",
                "profile1",
                "endpoint1",
                new ValidateCustomDomainInput().withHostname("www.someDomain.com"),
                Context.NONE);
    }
}
