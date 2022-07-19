// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.Context;

/** Samples for Certificates GenerateVerificationCode. */
public final class CertificatesGenerateVerificationCodeSamples {
    /*
     * x-ms-original-file: specification/iothub/resource-manager/Microsoft.Devices/preview/2022-03-15-preview/examples/iothub_generateverificationcode.json
     */
    /**
     * Sample code: Certificates_GenerateVerificationCode.
     *
     * @param manager Entry point to IotHubManager.
     */
    public static void certificatesGenerateVerificationCode(com.azure.resourcemanager.iothub.IotHubManager manager) {
        manager
            .certificates()
            .generateVerificationCodeWithResponse("myResourceGroup", "testHub", "cert", "AAAAAAAADGk=", Context.NONE);
    }
}
