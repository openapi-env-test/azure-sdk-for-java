// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.digitaltwins.models.CheckNameRequest;

/** Samples for DigitalTwins CheckNameAvailability. */
public final class DigitalTwinsCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/digitaltwins/resource-manager/Microsoft.DigitalTwins/stable/2022-05-31/examples/DigitalTwinsCheckNameAvailability_example.json
     */
    /**
     * Sample code: Check name Availability.
     *
     * @param manager Entry point to AzureDigitalTwinsManager.
     */
    public static void checkNameAvailability(com.azure.resourcemanager.digitaltwins.AzureDigitalTwinsManager manager) {
        manager
            .digitalTwins()
            .checkNameAvailabilityWithResponse(
                "WestUS2", new CheckNameRequest().withName("myadtinstance"), Context.NONE);
    }
}
