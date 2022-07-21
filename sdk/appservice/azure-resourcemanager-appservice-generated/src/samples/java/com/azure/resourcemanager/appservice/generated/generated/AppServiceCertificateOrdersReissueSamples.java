// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.models.ReissueCertificateOrderRequest;

/** Samples for AppServiceCertificateOrders Reissue. */
public final class AppServiceCertificateOrdersReissueSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.CertificateRegistration/stable/2022-03-01/examples/ReissueAppServiceCertificateOrder.json
     */
    /**
     * Sample code: Reissue App Service Certificate Order.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void reissueAppServiceCertificateOrder(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager
            .appServiceCertificateOrders()
            .reissueWithResponse(
                "testrg123",
                "SampleCertificateOrderName",
                new ReissueCertificateOrderRequest()
                    .withKeySize(2048)
                    .withDelayExistingRevokeInHours(2)
                    .withCsr("CSR1223238Value")
                    .withIsPrivateKeyExternal(false),
                Context.NONE);
    }
}
