// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.Context;

/** Samples for PacketCoreControlPlanes Rollback. */
public final class PacketCoreControlPlanesRollbackSamples {
    /*
     * x-ms-original-file: specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/stable/2022-11-01/examples/PacketCoreControlPlaneRollback.json
     */
    /**
     * Sample code: Rollback packet core control plane.
     *
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void rollbackPacketCoreControlPlane(
        com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        manager.packetCoreControlPlanes().rollback("rg1", "TestPacketCoreCP", Context.NONE);
    }
}
