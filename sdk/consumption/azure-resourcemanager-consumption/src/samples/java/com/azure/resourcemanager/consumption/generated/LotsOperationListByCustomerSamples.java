// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated;

import com.azure.core.util.Context;

/** Samples for LotsOperation ListByCustomer. */
public final class LotsOperationListByCustomerSamples {
    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/LotsListByCustomer.json
     */
    /**
     * Sample code: LotsListByCustomer.
     *
     * @param manager Entry point to ConsumptionManager.
     */
    public static void lotsListByCustomer(com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager.lotsOperations().listByCustomer("1234:5678", "1234:5678", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/LotsListByCustomerWithFilters.json
     */
    /**
     * Sample code: LotsListByCustomerWithFilter.
     *
     * @param manager Entry point to ConsumptionManager.
     */
    public static void lotsListByCustomerWithFilter(com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager
            .lotsOperations()
            .listByCustomer(
                "1234:5678", "1234:5678", "status eq 'active' AND source eq 'consumptioncommitment'", Context.NONE);
    }
}
