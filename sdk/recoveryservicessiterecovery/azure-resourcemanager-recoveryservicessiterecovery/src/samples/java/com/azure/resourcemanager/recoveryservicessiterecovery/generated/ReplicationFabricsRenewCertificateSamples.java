// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RenewCertificateInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RenewCertificateInputProperties;

/** Samples for ReplicationFabrics RenewCertificate. */
public final class ReplicationFabricsRenewCertificateSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-04-01/examples/ReplicationFabrics_RenewCertificate.json
     */
    /**
     * Sample code: Renews certificate for the fabric.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void renewsCertificateForTheFabric(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .replicationFabrics()
            .renewCertificate(
                "vault1",
                "resourceGroupPS1",
                "cloud1",
                new RenewCertificateInput()
                    .withProperties(new RenewCertificateInputProperties().withRenewCertificateType("Cloud")),
                Context.NONE);
    }
}
