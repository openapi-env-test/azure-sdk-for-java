// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.models.FileEventTrigger;
import com.azure.resourcemanager.databoxedge.models.FileSourceInfo;
import com.azure.resourcemanager.databoxedge.models.RoleSinkInfo;

/** Samples for Triggers CreateOrUpdate. */
public final class TriggersCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/databoxedge/resource-manager/Microsoft.DataBoxEdge/stable/2022-03-01/examples/TriggerPut.json
     */
    /**
     * Sample code: TriggerPut.
     *
     * @param manager Entry point to DataBoxEdgeManager.
     */
    public static void triggerPut(com.azure.resourcemanager.databoxedge.DataBoxEdgeManager manager) {
        manager
            .triggers()
            .createOrUpdate(
                "testedgedevice",
                "trigger1",
                "GroupForEdgeAutomation",
                new FileEventTrigger()
                    .withSourceInfo(
                        new FileSourceInfo()
                            .withShareId(
                                "/subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/GroupForEdgeAutomation/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/testedgedevice/shares/share1"))
                    .withSinkInfo(
                        new RoleSinkInfo()
                            .withRoleId(
                                "/subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/GroupForEdgeAutomation/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/testedgedevice/roles/role1"))
                    .withCustomContextTag("CustomContextTags-1235346475"),
                Context.NONE);
    }
}
