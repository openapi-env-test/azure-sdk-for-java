// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.generated;

import com.azure.core.util.Context;

/** Samples for Certificates Get. */
public final class CertificatesGetSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2022-01-01-preview/examples/Certificates_Get.json
     */
    /**
     * Sample code: Certificates_Get.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void certificatesGet(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.certificates().getWithResponse("myResourceGroup", "myservice", "mycertificate", Context.NONE);
    }
}
