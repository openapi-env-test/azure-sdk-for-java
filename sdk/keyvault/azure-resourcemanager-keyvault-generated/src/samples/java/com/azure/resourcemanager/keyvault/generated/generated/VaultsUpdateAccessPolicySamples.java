// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.keyvault.generated.fluent.models.VaultAccessPolicyParametersInner;
import com.azure.resourcemanager.keyvault.generated.models.AccessPolicyEntry;
import com.azure.resourcemanager.keyvault.generated.models.AccessPolicyUpdateKind;
import com.azure.resourcemanager.keyvault.generated.models.CertificatePermissions;
import com.azure.resourcemanager.keyvault.generated.models.KeyPermissions;
import com.azure.resourcemanager.keyvault.generated.models.Permissions;
import com.azure.resourcemanager.keyvault.generated.models.SecretPermissions;
import com.azure.resourcemanager.keyvault.generated.models.VaultAccessPolicyProperties;
import java.util.Arrays;
import java.util.UUID;

/** Samples for Vaults UpdateAccessPolicy. */
public final class VaultsUpdateAccessPolicySamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2022-07-01/examples/updateAccessPoliciesAdd.json
     */
    /**
     * Sample code: Add an access policy, or update an access policy with new permissions.
     *
     * @param manager Entry point to KeyVaultManager.
     */
    public static void addAnAccessPolicyOrUpdateAnAccessPolicyWithNewPermissions(
        com.azure.resourcemanager.keyvault.generated.KeyVaultManager manager) {
        manager
            .vaults()
            .updateAccessPolicyWithResponse(
                "sample-group",
                "sample-vault",
                AccessPolicyUpdateKind.ADD,
                new VaultAccessPolicyParametersInner()
                    .withProperties(
                        new VaultAccessPolicyProperties()
                            .withAccessPolicies(
                                Arrays
                                    .asList(
                                        new AccessPolicyEntry()
                                            .withTenantId(UUID.fromString("00000000-0000-0000-0000-000000000000"))
                                            .withObjectId("00000000-0000-0000-0000-000000000000")
                                            .withPermissions(
                                                new Permissions()
                                                    .withKeys(Arrays.asList(KeyPermissions.ENCRYPT))
                                                    .withSecrets(Arrays.asList(SecretPermissions.GET))
                                                    .withCertificates(Arrays.asList(CertificatePermissions.GET)))))),
                Context.NONE);
    }
}
