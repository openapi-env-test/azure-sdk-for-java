// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.util.Context;

/** Samples for Devices InstallUpdates. */
public final class DevicesInstallUpdatesSamples {
    /*
     * x-ms-original-file: specification/databoxedge/resource-manager/Microsoft.DataBoxEdge/stable/2022-03-01/examples/InstallUpdatesPost.json
     */
    /**
     * Sample code: InstallUpdatesPost.
     *
     * @param manager Entry point to DataBoxEdgeManager.
     */
    public static void installUpdatesPost(com.azure.resourcemanager.databoxedge.DataBoxEdgeManager manager) {
        manager.devices().installUpdates("testedgedevice", "GroupForEdgeAutomation", Context.NONE);
    }
}
