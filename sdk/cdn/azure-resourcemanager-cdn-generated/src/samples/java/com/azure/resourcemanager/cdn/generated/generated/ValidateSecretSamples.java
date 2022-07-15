// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cdn.generated.models.ResourceReference;
import com.azure.resourcemanager.cdn.generated.models.SecretType;
import com.azure.resourcemanager.cdn.generated.models.ValidateSecretInput;

/** Samples for Validate Secret. */
public final class ValidateSecretSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2021-06-01/examples/Validate_Secret.json
     */
    /**
     * Sample code: Validate_Secret.
     *
     * @param manager Entry point to CdnManager.
     */
    public static void validateSecret(com.azure.resourcemanager.cdn.generated.CdnManager manager) {
        manager
            .validates()
            .secretWithResponse(
                new ValidateSecretInput()
                    .withSecretType(SecretType.CUSTOMER_CERTIFICATE)
                    .withSecretSource(
                        new ResourceReference()
                            .withId(
                                "/subscriptions/subid/resourcegroups/RG/providers/Microsoft.KeyVault/vault/kvName/certificate/certName")),
                Context.NONE);
    }
}
