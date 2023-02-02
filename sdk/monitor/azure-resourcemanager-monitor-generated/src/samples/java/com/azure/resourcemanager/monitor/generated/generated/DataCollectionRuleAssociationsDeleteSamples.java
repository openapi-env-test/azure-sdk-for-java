// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.generated;

import com.azure.core.util.Context;

/** Samples for DataCollectionRuleAssociations Delete. */
public final class DataCollectionRuleAssociationsDeleteSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/preview/2021-09-01-preview/examples/DataCollectionRuleAssociationsDelete.json
     */
    /**
     * Sample code: Delete association.
     *
     * @param manager Entry point to MonitorManager.
     */
    public static void deleteAssociation(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager
            .dataCollectionRuleAssociations()
            .deleteByResourceGroupWithResponse(
                "subscriptions/703362b3-f278-4e4b-9179-c76eaf41ffc2/resourceGroups/myResourceGroup/providers/Microsoft.Compute/virtualMachines/myVm",
                "myAssociation",
                Context.NONE);
    }
}
