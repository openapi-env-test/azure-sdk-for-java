// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

/** Samples for SenderUsernames CreateOrUpdate. */
public final class SenderUsernamesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2023-03-01-preview/examples/senderUsernames/createOrUpdate.json
     */
    /**
     * Sample code: Create or update SenderUsernames resource.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void createOrUpdateSenderUsernamesResource(
        com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .senderUsernames()
            .define("contosoNewsAlerts")
            .withExistingDomain("contosoResourceGroup", "contosoEmailService", "contoso.com")
            .withUsername("contosoNewsAlerts")
            .withDisplayName("Contoso News Alerts")
            .create();
    }
}
