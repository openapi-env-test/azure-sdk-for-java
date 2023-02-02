// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.keyvault.generated.models.AccessPolicyEntry;
import com.azure.resourcemanager.keyvault.generated.models.CertificatePermissions;
import com.azure.resourcemanager.keyvault.generated.models.KeyPermissions;
import com.azure.resourcemanager.keyvault.generated.models.Permissions;
import com.azure.resourcemanager.keyvault.generated.models.SecretPermissions;
import com.azure.resourcemanager.keyvault.generated.models.Sku;
import com.azure.resourcemanager.keyvault.generated.models.SkuFamily;
import com.azure.resourcemanager.keyvault.generated.models.SkuName;
import com.azure.resourcemanager.keyvault.generated.models.Vault;
import com.azure.resourcemanager.keyvault.generated.models.VaultPatchProperties;
import java.util.Arrays;
import java.util.UUID;

/** Samples for Vaults Update. */
public final class VaultsUpdateSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2022-07-01/examples/updateVault.json
     */
    /**
     * Sample code: Update an existing vault.
     *
     * @param manager Entry point to KeyVaultManager.
     */
    public static void updateAnExistingVault(com.azure.resourcemanager.keyvault.generated.KeyVaultManager manager) {
        Vault resource =
            manager
                .vaults()
                .getByResourceGroupWithResponse("sample-resource-group", "sample-vault", Context.NONE)
                .getValue();
        resource
            .update()
            .withProperties(
                new VaultPatchProperties()
                    .withTenantId(UUID.fromString("00000000-0000-0000-0000-000000000000"))
                    .withSku(new Sku().withFamily(SkuFamily.A).withName(SkuName.STANDARD))
                    .withAccessPolicies(
                        Arrays
                            .asList(
                                new AccessPolicyEntry()
                                    .withTenantId(UUID.fromString("00000000-0000-0000-0000-000000000000"))
                                    .withObjectId("00000000-0000-0000-0000-000000000000")
                                    .withPermissions(
                                        new Permissions()
                                            .withKeys(
                                                Arrays
                                                    .asList(
                                                        KeyPermissions.ENCRYPT,
                                                        KeyPermissions.DECRYPT,
                                                        KeyPermissions.WRAP_KEY,
                                                        KeyPermissions.UNWRAP_KEY,
                                                        KeyPermissions.SIGN,
                                                        KeyPermissions.VERIFY,
                                                        KeyPermissions.GET,
                                                        KeyPermissions.LIST,
                                                        KeyPermissions.CREATE,
                                                        KeyPermissions.UPDATE,
                                                        KeyPermissions.IMPORT,
                                                        KeyPermissions.DELETE,
                                                        KeyPermissions.BACKUP,
                                                        KeyPermissions.RESTORE,
                                                        KeyPermissions.RECOVER,
                                                        KeyPermissions.PURGE))
                                            .withSecrets(
                                                Arrays
                                                    .asList(
                                                        SecretPermissions.GET,
                                                        SecretPermissions.LIST,
                                                        SecretPermissions.SET,
                                                        SecretPermissions.DELETE,
                                                        SecretPermissions.BACKUP,
                                                        SecretPermissions.RESTORE,
                                                        SecretPermissions.RECOVER,
                                                        SecretPermissions.PURGE))
                                            .withCertificates(
                                                Arrays
                                                    .asList(
                                                        CertificatePermissions.GET,
                                                        CertificatePermissions.LIST,
                                                        CertificatePermissions.DELETE,
                                                        CertificatePermissions.CREATE,
                                                        CertificatePermissions.IMPORT,
                                                        CertificatePermissions.UPDATE,
                                                        CertificatePermissions.MANAGECONTACTS,
                                                        CertificatePermissions.GETISSUERS,
                                                        CertificatePermissions.LISTISSUERS,
                                                        CertificatePermissions.SETISSUERS,
                                                        CertificatePermissions.DELETEISSUERS,
                                                        CertificatePermissions.MANAGEISSUERS,
                                                        CertificatePermissions.RECOVER,
                                                        CertificatePermissions.PURGE)))))
                    .withEnabledForDeployment(true)
                    .withEnabledForDiskEncryption(true)
                    .withEnabledForTemplateDeployment(true)
                    .withPublicNetworkAccess("Enabled"))
            .apply();
    }
}
