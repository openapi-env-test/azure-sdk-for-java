// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for AvailabilitySets List. */
public final class AvailabilitySetsListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/ListAvailabilitySetsInASubscription.json
     */
    /**
     * Sample code: List availability sets in a subscription.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listAvailabilitySetsInASubscription(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.availabilitySets().list("virtualMachines\\$ref", Context.NONE);
    }
}
