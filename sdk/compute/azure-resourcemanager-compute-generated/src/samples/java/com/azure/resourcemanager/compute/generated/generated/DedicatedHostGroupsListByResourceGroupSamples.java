// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for DedicatedHostGroups ListByResourceGroup. */
public final class DedicatedHostGroupsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/dedicatedHostExamples/DedicatedHostGroups_ListByResourceGroup_MinimumSet_Gen.json
     */
    /**
     * Sample code: DedicatedHostGroups_ListByResourceGroup_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void dedicatedHostGroupsListByResourceGroupMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.dedicatedHostGroups().listByResourceGroup("rgcompute", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/dedicatedHostExamples/DedicatedHostGroups_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: DedicatedHostGroups_ListByResourceGroup_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void dedicatedHostGroupsListByResourceGroupMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.dedicatedHostGroups().listByResourceGroup("rgcompute", Context.NONE);
    }
}
