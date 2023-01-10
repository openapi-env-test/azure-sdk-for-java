// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.util.Context;

/** Samples for Shares Get. */
public final class SharesGetSamples {
    /*
     * x-ms-original-file: specification/databoxedge/resource-manager/Microsoft.DataBoxEdge/stable/2022-03-01/examples/ShareGet.json
     */
    /**
     * Sample code: ShareGet.
     *
     * @param manager Entry point to DataBoxEdgeManager.
     */
    public static void shareGet(com.azure.resourcemanager.databoxedge.DataBoxEdgeManager manager) {
        manager.shares().getWithResponse("testedgedevice", "smbshare", "GroupForEdgeAutomation", Context.NONE);
    }
}
