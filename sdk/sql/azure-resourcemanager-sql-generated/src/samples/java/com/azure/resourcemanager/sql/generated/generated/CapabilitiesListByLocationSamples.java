// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for Capabilities ListByLocation. */
public final class CapabilitiesListByLocationSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/LocationCapabilityListByLocation.json
     */
    /**
     * Sample code: List subscription capabilities in the given location.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void listSubscriptionCapabilitiesInTheGivenLocation(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.capabilities().listByLocationWithResponse("eastus", null, Context.NONE);
    }
}
