// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for WebApps GetAppSettingKeyVaultReference. */
public final class WebAppsGetAppSettingKeyVaultReferenceSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/GetKeyVaultReferencesForAppSetting.json
     */
    /**
     * Sample code: Get Azure Key Vault app setting reference.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void getAzureKeyVaultAppSettingReference(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.webApps().getAppSettingKeyVaultReferenceWithResponse("testrg123", "testc6282", "setting", Context.NONE);
    }
}
