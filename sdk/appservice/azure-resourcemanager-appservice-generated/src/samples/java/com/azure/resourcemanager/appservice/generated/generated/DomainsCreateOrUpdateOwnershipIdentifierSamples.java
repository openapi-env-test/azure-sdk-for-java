// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/** Samples for Domains CreateOrUpdateOwnershipIdentifier. */
public final class DomainsCreateOrUpdateOwnershipIdentifierSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.DomainRegistration/stable/2022-03-01/examples/CreateAppServiceDomainOwnershipIdentifier.json
     */
    /**
     * Sample code: Create App Service Domain OwnershipIdentifier.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void createAppServiceDomainOwnershipIdentifier(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager
            .domains()
            .defineOwnershipIdentifier("SampleOwnershipId")
            .withExistingDomain("testrg123", "example.com")
            .withOwnershipId("SampleOwnershipId")
            .create();
    }
}
