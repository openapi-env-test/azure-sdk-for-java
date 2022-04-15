package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.DeviceManagementsGetOperationHeaders;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DeviceManagementsGetOperationHeadersTests {
    @Test
    public void testDeserialize() {
        DeviceManagementsGetOperationHeaders model =
                BinaryData.fromString("{\"Retry-After\":\"cact\"}")
                        .toObject(DeviceManagementsGetOperationHeaders.class);
        Assertions.assertEquals("cact", model.getRetryAfter());
    }
}
