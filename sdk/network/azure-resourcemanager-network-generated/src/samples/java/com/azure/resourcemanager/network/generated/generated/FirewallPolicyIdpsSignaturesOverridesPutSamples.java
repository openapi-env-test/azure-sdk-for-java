// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.SignaturesOverridesInner;
import com.azure.resourcemanager.network.generated.models.SignaturesOverridesProperties;
import java.util.HashMap;
import java.util.Map;

/** Samples for FirewallPolicyIdpsSignaturesOverrides Put. */
public final class FirewallPolicyIdpsSignaturesOverridesPutSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/FirewallPolicySignatureOverridesPut.json
     */
    /**
     * Sample code: put signature overrides.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void putSignatureOverrides(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .firewallPolicyIdpsSignaturesOverrides()
            .putWithResponse(
                "rg1",
                "firewallPolicy",
                new SignaturesOverridesInner()
                    .withName("default")
                    .withId(
                        "/subscriptions/e747cc13-97d4-4a79-b463-42d7f4e558f2/resourceGroups/rg1/providers/Microsoft.Network/firewallPolicies/firewallPolicy/signatureOverrides/default")
                    .withType("Microsoft.Network/firewallPolicies/signatureOverrides")
                    .withProperties(
                        new SignaturesOverridesProperties().withSignatures(mapOf("2000105", "Off", "2000106", "Deny"))),
                Context.NONE);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
