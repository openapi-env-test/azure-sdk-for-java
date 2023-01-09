// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.util.Context;

/** Samples for StorageAccountCredentials ListByDataBoxEdgeDevice. */
public final class StorageAccountCredentialsListByDataBoxEdgeDeviceSamples {
    /*
     * x-ms-original-file: specification/databoxedge/resource-manager/Microsoft.DataBoxEdge/stable/2022-03-01/examples/SACGetAllInDevice.json
     */
    /**
     * Sample code: SACGetAllInDevice.
     *
     * @param manager Entry point to DataBoxEdgeManager.
     */
    public static void sACGetAllInDevice(com.azure.resourcemanager.databoxedge.DataBoxEdgeManager manager) {
        manager
            .storageAccountCredentials()
            .listByDataBoxEdgeDevice("testedgedevice", "GroupForEdgeAutomation", Context.NONE);
    }
}
