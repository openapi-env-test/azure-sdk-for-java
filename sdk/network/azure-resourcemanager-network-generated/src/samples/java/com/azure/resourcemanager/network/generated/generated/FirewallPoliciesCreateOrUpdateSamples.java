// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.AzureFirewallThreatIntelMode;
import com.azure.resourcemanager.network.generated.models.DnsSettings;
import com.azure.resourcemanager.network.generated.models.ExplicitProxy;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyCertificateAuthority;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyInsights;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyIntrusionDetection;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyIntrusionDetectionBypassTrafficSpecifications;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyIntrusionDetectionConfiguration;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyIntrusionDetectionProtocol;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyIntrusionDetectionSignatureSpecification;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyIntrusionDetectionStateType;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyLogAnalyticsResources;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyLogAnalyticsWorkspace;
import com.azure.resourcemanager.network.generated.models.FirewallPolicySku;
import com.azure.resourcemanager.network.generated.models.FirewallPolicySkuTier;
import com.azure.resourcemanager.network.generated.models.FirewallPolicySnat;
import com.azure.resourcemanager.network.generated.models.FirewallPolicySql;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyThreatIntelWhitelist;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyTransportSecurity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for FirewallPolicies CreateOrUpdate. */
public final class FirewallPoliciesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/FirewallPolicyPut.json
     */
    /**
     * Sample code: Create FirewallPolicy.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createFirewallPolicy(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .firewallPolicies()
            .define("firewallPolicy")
            .withRegion("West US")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("key1", "value1"))
            .withThreatIntelMode(AzureFirewallThreatIntelMode.ALERT)
            .withThreatIntelWhitelist(
                new FirewallPolicyThreatIntelWhitelist()
                    .withIpAddresses(Arrays.asList("20.3.4.5"))
                    .withFqdns(Arrays.asList("*.microsoft.com")))
            .withInsights(
                new FirewallPolicyInsights()
                    .withIsEnabled(true)
                    .withRetentionDays(100)
                    .withLogAnalyticsResources(
                        new FirewallPolicyLogAnalyticsResources()
                            .withWorkspaces(
                                Arrays
                                    .asList(
                                        new FirewallPolicyLogAnalyticsWorkspace()
                                            .withRegion("westus")
                                            .withWorkspaceId(
                                                new SubResource()
                                                    .withId(
                                                        "/subscriptions/subid/resourcegroups/rg1/providers/microsoft.operationalinsights/workspaces/workspace1")),
                                        new FirewallPolicyLogAnalyticsWorkspace()
                                            .withRegion("eastus")
                                            .withWorkspaceId(
                                                new SubResource()
                                                    .withId(
                                                        "/subscriptions/subid/resourcegroups/rg1/providers/microsoft.operationalinsights/workspaces/workspace2"))))
                            .withDefaultWorkspaceId(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourcegroups/rg1/providers/microsoft.operationalinsights/workspaces/defaultWorkspace"))))
            .withSnat(new FirewallPolicySnat().withPrivateRanges(Arrays.asList("IANAPrivateRanges")))
            .withSql(new FirewallPolicySql().withAllowSqlRedirect(true))
            .withDnsSettings(
                new DnsSettings()
                    .withServers(Arrays.asList("30.3.4.5"))
                    .withEnableProxy(true)
                    .withRequireProxyForNetworkRules(false))
            .withExplicitProxy(
                new ExplicitProxy()
                    .withEnableExplicitProxy(true)
                    .withHttpPort(8087)
                    .withHttpsPort(8087)
                    .withEnablePacFile(true)
                    .withPacFilePort(8087)
                    .withPacFile(
                        "https://tinawstorage.file.core.windows.net/?sv=2020-02-10&ss=bfqt&srt=sco&sp=rwdlacuptfx&se=2021-06-04T07:01:12Z&st=2021-06-03T23:01:12Z&sip=68.65.171.11&spr=https&sig=Plsa0RRVpGbY0IETZZOT6znOHcSro71LLTTbzquYPgs%3D"))
            .withIntrusionDetection(
                new FirewallPolicyIntrusionDetection()
                    .withMode(FirewallPolicyIntrusionDetectionStateType.ALERT)
                    .withConfiguration(
                        new FirewallPolicyIntrusionDetectionConfiguration()
                            .withSignatureOverrides(
                                Arrays
                                    .asList(
                                        new FirewallPolicyIntrusionDetectionSignatureSpecification()
                                            .withId("2525004")
                                            .withMode(FirewallPolicyIntrusionDetectionStateType.DENY)))
                            .withBypassTrafficSettings(
                                Arrays
                                    .asList(
                                        new FirewallPolicyIntrusionDetectionBypassTrafficSpecifications()
                                            .withName("bypassRule1")
                                            .withDescription("Rule 1")
                                            .withProtocol(FirewallPolicyIntrusionDetectionProtocol.TCP)
                                            .withSourceAddresses(Arrays.asList("1.2.3.4"))
                                            .withDestinationAddresses(Arrays.asList("5.6.7.8"))
                                            .withDestinationPorts(Arrays.asList("*"))))))
            .withTransportSecurity(
                new FirewallPolicyTransportSecurity()
                    .withCertificateAuthority(
                        new FirewallPolicyCertificateAuthority()
                            .withKeyVaultSecretId("fakeTokenPlaceholder")
                            .withName("clientcert")))
            .withSku(new FirewallPolicySku().withTier(FirewallPolicySkuTier.PREMIUM))
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
