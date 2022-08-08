// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.VpnConnectionInner;
import com.azure.resourcemanager.network.generated.fluent.models.VpnGatewayNatRuleInner;
import com.azure.resourcemanager.network.generated.fluent.models.VpnSiteLinkConnectionInner;
import com.azure.resourcemanager.network.generated.models.BgpSettings;
import com.azure.resourcemanager.network.generated.models.IpConfigurationBgpPeeringAddress;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnectionProtocol;
import com.azure.resourcemanager.network.generated.models.VpnNatRuleMapping;
import com.azure.resourcemanager.network.generated.models.VpnNatRuleMode;
import com.azure.resourcemanager.network.generated.models.VpnNatRuleType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for VpnGateways CreateOrUpdate. */
public final class VpnGatewaysCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/VpnGatewayPut.json
     */
    /**
     * Sample code: VpnGatewayPut.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void vpnGatewayPut(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .vpnGateways()
            .define("gateway1")
            .withRegion("westcentralus")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("key1", "value1"))
            .withVirtualHub(
                new SubResource()
                    .withId(
                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualHubs/virtualHub1"))
            .withConnections(
                Arrays
                    .asList(
                        new VpnConnectionInner()
                            .withName("vpnConnection1")
                            .withRemoteVpnSite(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/vpnSites/vpnSite1"))
                            .withVpnLinkConnections(
                                Arrays
                                    .asList(
                                        new VpnSiteLinkConnectionInner()
                                            .withName("Connection-Link1")
                                            .withVpnSiteLink(
                                                new SubResource()
                                                    .withId(
                                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/vpnSites/vpnSite1/vpnSiteLinks/siteLink1"))
                                            .withVpnConnectionProtocolType(
                                                VirtualNetworkGatewayConnectionProtocol.IKEV2)
                                            .withConnectionBandwidth(200)
                                            .withSharedKey("key")
                                            .withEgressNatRules(
                                                Arrays
                                                    .asList(
                                                        new SubResource()
                                                            .withId(
                                                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/vpnGateways/gateway1/natRules/nat03")))))))
            .withBgpSettings(
                new BgpSettings()
                    .withAsn(65515L)
                    .withPeerWeight(0)
                    .withBgpPeeringAddresses(
                        Arrays
                            .asList(
                                new IpConfigurationBgpPeeringAddress()
                                    .withIpconfigurationId("Instance0")
                                    .withCustomBgpIpAddresses(Arrays.asList("169.254.21.5")),
                                new IpConfigurationBgpPeeringAddress()
                                    .withIpconfigurationId("Instance1")
                                    .withCustomBgpIpAddresses(Arrays.asList("169.254.21.10")))))
            .withEnableBgpRouteTranslationForNat(false)
            .withIsRoutingPreferenceInternet(false)
            .withNatRules(
                Arrays
                    .asList(
                        new VpnGatewayNatRuleInner()
                            .withName("nat03")
                            .withTypePropertiesType(VpnNatRuleType.STATIC)
                            .withMode(VpnNatRuleMode.EGRESS_SNAT)
                            .withInternalMappings(Arrays.asList(new VpnNatRuleMapping().withAddressSpace("0.0.0.0/26")))
                            .withExternalMappings(
                                Arrays.asList(new VpnNatRuleMapping().withAddressSpace("192.168.0.0/26")))
                            .withIpConfigurationId("")))
            .create();
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
