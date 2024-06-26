// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.EncryptionMigrationRequest;
import org.junit.jupiter.api.Assertions;

public final class EncryptionMigrationRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EncryptionMigrationRequest model
            = BinaryData.fromString("{\"virtualNetworkId\":\"maofmxagkv\",\"privateEndpointId\":\"melmqkrha\"}")
                .toObject(EncryptionMigrationRequest.class);
        Assertions.assertEquals("maofmxagkv", model.virtualNetworkId());
        Assertions.assertEquals("melmqkrha", model.privateEndpointId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EncryptionMigrationRequest model
            = new EncryptionMigrationRequest().withVirtualNetworkId("maofmxagkv").withPrivateEndpointId("melmqkrha");
        model = BinaryData.fromObject(model).toObject(EncryptionMigrationRequest.class);
        Assertions.assertEquals("maofmxagkv", model.virtualNetworkId());
        Assertions.assertEquals("melmqkrha", model.privateEndpointId());
    }
}
