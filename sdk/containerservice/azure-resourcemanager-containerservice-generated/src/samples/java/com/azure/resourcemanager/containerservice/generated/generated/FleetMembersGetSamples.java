// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for FleetMembers Get. */
public final class FleetMembersGetSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-07-02-preview/examples/FleetMembers_Get.json
     */
    /**
     * Sample code: Gets a fleet member resource.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void getsAFleetMemberResource(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager.fleetMembers().getWithResponse("rg1", "fleet-1", "member-1", Context.NONE);
    }
}
