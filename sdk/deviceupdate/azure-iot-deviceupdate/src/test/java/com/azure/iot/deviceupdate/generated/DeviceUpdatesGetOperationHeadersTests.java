package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.DeviceUpdatesGetOperationHeaders;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DeviceUpdatesGetOperationHeadersTests {
    @Test
    public void testDeserialize() {
        DeviceUpdatesGetOperationHeaders model =
                BinaryData.fromString("{\"Retry-After\":\"qtz\"}").toObject(DeviceUpdatesGetOperationHeaders.class);
        Assertions.assertEquals("qtz", model.getRetryAfter());
    }
}
