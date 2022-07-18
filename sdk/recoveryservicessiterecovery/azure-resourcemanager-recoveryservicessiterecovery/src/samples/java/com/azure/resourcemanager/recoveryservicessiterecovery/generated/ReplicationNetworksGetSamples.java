// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.Context;

/** Samples for ReplicationNetworks Get. */
public final class ReplicationNetworksGetSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-04-01/examples/ReplicationNetworks_Get.json
     */
    /**
     * Sample code: Gets a network with specified server id and network name.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsANetworkWithSpecifiedServerIdAndNetworkName(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .replicationNetworks()
            .getWithResponse(
                "srce2avaultbvtaC27",
                "srcBvte2a14C27",
                "b0cef6e9a4437b81803d0b55ada4f700ab66caae59c35d62723a1589c0cd13ac",
                "93ce99d7-1219-4914-aa61-73fe5023988e",
                Context.NONE);
    }
}
