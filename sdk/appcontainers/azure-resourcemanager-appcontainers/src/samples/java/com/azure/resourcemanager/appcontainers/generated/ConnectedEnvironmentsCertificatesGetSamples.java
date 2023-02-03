// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.Context;

/** Samples for ConnectedEnvironmentsCertificates Get. */
public final class ConnectedEnvironmentsCertificatesGetSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ConnectedEnvironmentsCertificate_Get.json
     */
    /**
     * Sample code: Get Certificate.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getCertificate(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .connectedEnvironmentsCertificates()
            .getWithResponse("examplerg", "testcontainerenv", "certificate-firendly-name", Context.NONE);
    }
}
