package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.DeviceUpdatesDeleteUpdateHeaders;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DeviceUpdatesDeleteUpdateHeadersTests {
    @Test
    public void testDeserialize() {
        DeviceUpdatesDeleteUpdateHeaders model =
                BinaryData.fromString("{\"Operation-Location\":\"lcwkhihihlhz\"}")
                        .toObject(DeviceUpdatesDeleteUpdateHeaders.class);
        Assertions.assertEquals("lcwkhihihlhz", model.getOperationLocation());
    }
}
