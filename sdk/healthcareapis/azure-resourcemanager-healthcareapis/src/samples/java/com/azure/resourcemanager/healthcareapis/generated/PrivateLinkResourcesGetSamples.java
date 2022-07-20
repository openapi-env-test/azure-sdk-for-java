// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.Context;

/** Samples for PrivateLinkResources Get. */
public final class PrivateLinkResourcesGetSamples {
    /*
     * x-ms-original-file: specification/healthcareapis/resource-manager/Microsoft.HealthcareApis/stable/2022-06-01/examples/legacy/PrivateLinkResourceGet.json
     */
    /**
     * Sample code: PrivateLinkResources_Get.
     *
     * @param manager Entry point to HealthcareApisManager.
     */
    public static void privateLinkResourcesGet(com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager) {
        manager.privateLinkResources().getWithResponse("rgname", "service1", "fhir", Context.NONE);
    }
}
