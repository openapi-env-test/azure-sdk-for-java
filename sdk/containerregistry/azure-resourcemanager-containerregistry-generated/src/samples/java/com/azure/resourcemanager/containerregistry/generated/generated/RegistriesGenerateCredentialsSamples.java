// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.models.GenerateCredentialsParameters;
import java.time.OffsetDateTime;

/** Samples for Registries GenerateCredentials. */
public final class RegistriesGenerateCredentialsSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-01-01-preview/examples/RegistryGenerateCredentials.json
     */
    /**
     * Sample code: RegistryGenerateCredentials.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registryGenerateCredentials(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .registries()
            .generateCredentials(
                "myResourceGroup",
                "myRegistry",
                new GenerateCredentialsParameters()
                    .withTokenId("fakeTokenPlaceholder")
                    .withExpiry(OffsetDateTime.parse("2020-12-31T15:59:59.0707808Z")),
                Context.NONE);
    }
}
