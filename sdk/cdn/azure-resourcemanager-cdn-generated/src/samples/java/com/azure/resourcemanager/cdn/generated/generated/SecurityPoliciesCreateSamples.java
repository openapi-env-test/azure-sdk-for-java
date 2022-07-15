// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.generated;

import com.azure.resourcemanager.cdn.generated.models.ActivatedResourceReference;
import com.azure.resourcemanager.cdn.generated.models.ResourceReference;
import com.azure.resourcemanager.cdn.generated.models.SecurityPolicyWebApplicationFirewallAssociation;
import com.azure.resourcemanager.cdn.generated.models.SecurityPolicyWebApplicationFirewallParameters;
import java.util.Arrays;

/** Samples for SecurityPolicies Create. */
public final class SecurityPoliciesCreateSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2021-06-01/examples/SecurityPolicies_Create.json
     */
    /**
     * Sample code: SecurityPolicies_Create.
     *
     * @param manager Entry point to CdnManager.
     */
    public static void securityPoliciesCreate(com.azure.resourcemanager.cdn.generated.CdnManager manager) {
        manager
            .securityPolicies()
            .define("securityPolicy1")
            .withExistingProfile("RG", "profile1")
            .withParameters(
                new SecurityPolicyWebApplicationFirewallParameters()
                    .withWafPolicy(
                        new ResourceReference()
                            .withId(
                                "/subscriptions/subid/resourcegroups/RG/providers/Microsoft.Network/frontdoorwebapplicationfirewallpolicies/wafTest"))
                    .withAssociations(
                        Arrays
                            .asList(
                                new SecurityPolicyWebApplicationFirewallAssociation()
                                    .withDomains(
                                        Arrays
                                            .asList(
                                                new ActivatedResourceReference()
                                                    .withId(
                                                        "/subscriptions/subid/resourcegroups/RG/providers/Microsoft.Cdn/profiles/profile1/customdomains/testdomain1"),
                                                new ActivatedResourceReference()
                                                    .withId(
                                                        "/subscriptions/subid/resourcegroups/RG/providers/Microsoft.Cdn/profiles/profile1/customdomains/testdomain2")))
                                    .withPatternsToMatch(Arrays.asList("/*")))))
            .create();
    }
}
