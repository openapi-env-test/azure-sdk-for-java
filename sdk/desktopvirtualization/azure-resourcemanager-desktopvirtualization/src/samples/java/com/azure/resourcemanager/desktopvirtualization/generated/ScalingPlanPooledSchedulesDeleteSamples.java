// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.Context;

/** Samples for ScalingPlanPooledSchedules Delete. */
public final class ScalingPlanPooledSchedulesDeleteSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2022-07-05-preview/examples/ScalingPlanPooledSchedule_Delete.json
     */
    /**
     * Sample code: ScalingPlanPooledSchedules_Delete.
     *
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanPooledSchedulesDelete(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager
            .scalingPlanPooledSchedules()
            .deleteWithResponse("resourceGroup1", "scalingPlan1", "scalingPlanScheduleWeekdays1", Context.NONE);
    }
}
