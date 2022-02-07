// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for FirewallPolicyIdpsSignaturesOverrides Get. */
public final class FirewallPolicyIdpsSignaturesOverridesGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/FirewallPolicySignatureOverridesGet.json
     */
    /**
     * Sample code: get signature overrides.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getSignatureOverrides(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.firewallPolicyIdpsSignaturesOverrides().getWithResponse("rg1", "firewallPolicy", Context.NONE);
    }
}
