// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.Context;

/** Samples for ScalingPlanPooledSchedules Get. */
public final class ScalingPlanPooledSchedulesGetSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2022-10-14-preview/examples/ScalingPlanPooledSchedule_Get.json
     */
    /**
     * Sample code: ScalingPlanPooledSchedules_Get.
     *
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanPooledSchedulesGet(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager
            .scalingPlanPooledSchedules()
            .getWithResponse("resourceGroup1", "scalingPlan1", "scalingPlanScheduleWeekdays1", Context.NONE);
    }
}
