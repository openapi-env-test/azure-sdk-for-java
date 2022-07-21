// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for WebApps GetAppSettingsKeyVaultReferences. */
public final class WebAppsGetAppSettingsKeyVaultReferencesSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/GetKeyVaultReferencesForAppSettings.json
     */
    /**
     * Sample code: Get Azure Key Vault references for app settings.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void getAzureKeyVaultReferencesForAppSettings(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.webApps().getAppSettingsKeyVaultReferences("testrg123", "testc6282", Context.NONE);
    }
}
