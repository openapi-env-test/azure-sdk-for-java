// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.AppServiceCertificate;
import com.azure.resourcemanager.appservice.generated.models.AppServiceCertificateOrder;
import java.util.HashMap;
import java.util.Map;

/** Samples for AppServiceCertificateOrders Update. */
public final class AppServiceCertificateOrdersUpdateSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.CertificateRegistration/stable/2022-03-01/examples/UpdateAppServiceCertificateOrder.json
     */
    /**
     * Sample code: Update Certificate order.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void updateCertificateOrder(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        AppServiceCertificateOrder resource =
            manager
                .appServiceCertificateOrders()
                .getByResourceGroupWithResponse("testrg123", "SampleCertificateOrderName", Context.NONE)
                .getValue();
        resource
            .update()
            .withCertificates(
                mapOf(
                    "SampleCertName1",
                    new AppServiceCertificate()
                        .withKeyVaultId(
                            "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourcegroups/testrg123/providers/microsoft.keyvault/vaults/SamplevaultName")
                        .withKeyVaultSecretName("SampleSecretName1"),
                    "SampleCertName2",
                    new AppServiceCertificate()
                        .withKeyVaultId(
                            "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourcegroups/testrg123/providers/microsoft.keyvault/vaults/SamplevaultName")
                        .withKeyVaultSecretName("SampleSecretName2")))
            .withAutoRenew(true)
            .apply();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
