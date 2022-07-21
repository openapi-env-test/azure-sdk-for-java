// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for Domains GetOwnershipIdentifier. */
public final class DomainsGetOwnershipIdentifierSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.DomainRegistration/stable/2022-03-01/examples/GetDomainOwnershipIdentifier.json
     */
    /**
     * Sample code: Get Domain Ownership Identifier.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void getDomainOwnershipIdentifier(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager
            .domains()
            .getOwnershipIdentifierWithResponse("testrg123", "example.com", "SampleOwnershipId", Context.NONE);
    }
}
