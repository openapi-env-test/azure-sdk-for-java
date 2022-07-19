// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cdn.generated.models.DeliveryRuleResponseHeaderAction;
import com.azure.resourcemanager.cdn.generated.models.HeaderAction;
import com.azure.resourcemanager.cdn.generated.models.HeaderActionParameters;
import com.azure.resourcemanager.cdn.generated.models.Rule;
import java.util.Arrays;

/** Samples for Rules Update. */
public final class RulesUpdateSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2021-06-01/examples/Rules_Update.json
     */
    /**
     * Sample code: Rules_Update.
     *
     * @param manager Entry point to CdnManager.
     */
    public static void rulesUpdate(com.azure.resourcemanager.cdn.generated.CdnManager manager) {
        Rule resource = manager.rules().getWithResponse("RG", "profile1", "ruleSet1", "rule1", Context.NONE).getValue();
        resource
            .update()
            .withOrder(1)
            .withActions(
                Arrays
                    .asList(
                        new DeliveryRuleResponseHeaderAction()
                            .withParameters(
                                new HeaderActionParameters()
                                    .withHeaderAction(HeaderAction.OVERWRITE)
                                    .withHeaderName("X-CDN")
                                    .withValue("MSFT"))))
            .apply();
    }
}
