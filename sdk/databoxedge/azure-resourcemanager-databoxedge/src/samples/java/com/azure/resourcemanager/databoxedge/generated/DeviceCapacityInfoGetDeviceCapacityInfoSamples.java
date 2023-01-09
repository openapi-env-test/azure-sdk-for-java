// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.util.Context;

/** Samples for DeviceCapacityInfo GetDeviceCapacityInfo. */
public final class DeviceCapacityInfoGetDeviceCapacityInfoSamples {
    /*
     * x-ms-original-file: specification/databoxedge/resource-manager/Microsoft.DataBoxEdge/stable/2022-03-01/examples/DeviceCapacityGet.json
     */
    /**
     * Sample code: DeviceCapacityGet.
     *
     * @param manager Entry point to DataBoxEdgeManager.
     */
    public static void deviceCapacityGet(com.azure.resourcemanager.databoxedge.DataBoxEdgeManager manager) {
        manager
            .deviceCapacityInfoes()
            .getDeviceCapacityInfoWithResponse("GroupForEdgeAutomation", "testedgedevice", Context.NONE);
    }
}
