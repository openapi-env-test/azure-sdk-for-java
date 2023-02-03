// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.servicebus.generated.models.CheckNameAvailability;

/** Samples for DisasterRecoveryConfigs CheckNameAvailability. */
public final class DisasterRecoveryConfigsCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/servicebus/resource-manager/Microsoft.ServiceBus/preview/2022-10-01-preview/examples/disasterRecoveryConfigs/SBAliasCheckNameAvailability.json
     */
    /**
     * Sample code: AliasNameAvailability.
     *
     * @param manager Entry point to ServiceBusManager.
     */
    public static void aliasNameAvailability(com.azure.resourcemanager.servicebus.generated.ServiceBusManager manager) {
        manager
            .disasterRecoveryConfigs()
            .checkNameAvailabilityWithResponse(
                "exampleResourceGroup",
                "sdk-Namespace-9080",
                new CheckNameAvailability().withName("sdk-DisasterRecovery-9474"),
                Context.NONE);
    }
}
