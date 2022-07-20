// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.resources.generated.models.DeploymentMode;
import com.azure.resourcemanager.resources.generated.models.DeploymentWhatIf;
import com.azure.resourcemanager.resources.generated.models.DeploymentWhatIfProperties;
import com.azure.resourcemanager.resources.generated.models.TemplateLink;
import java.io.IOException;

/** Samples for Deployments WhatIf. */
public final class DeploymentsWhatIfSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2021-04-01/examples/PostDeploymentWhatIfOnResourceGroup.json
     */
    /**
     * Sample code: Predict template changes at resource group scope.
     *
     * @param manager Entry point to ResourceManager.
     */
    public static void predictTemplateChangesAtResourceGroupScope(
        com.azure.resourcemanager.resources.generated.ResourceManager manager) throws IOException {
        manager
            .deployments()
            .whatIf(
                "my-resource-group",
                "my-deployment",
                new DeploymentWhatIf()
                    .withProperties(
                        new DeploymentWhatIfProperties()
                            .withTemplateLink(new TemplateLink().withUri("https://example.com/exampleTemplate.json"))
                            .withParameters(
                                SerializerFactory
                                    .createDefaultManagementSerializerAdapter()
                                    .deserialize("{}", Object.class, SerializerEncoding.JSON))
                            .withMode(DeploymentMode.INCREMENTAL)),
                Context.NONE);
    }
}
