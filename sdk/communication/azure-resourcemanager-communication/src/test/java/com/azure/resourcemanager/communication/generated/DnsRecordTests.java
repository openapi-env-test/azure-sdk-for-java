// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.communication.models.DnsRecord;

public final class DnsRecordTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DnsRecord model =
            BinaryData
                .fromString("{\"type\":\"dxob\",\"name\":\"dxkqpx\",\"value\":\"ajionpimexgstxg\",\"ttl\":1489591694}")
                .toObject(DnsRecord.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DnsRecord model = new DnsRecord();
        model = BinaryData.fromObject(model).toObject(DnsRecord.class);
    }
}
