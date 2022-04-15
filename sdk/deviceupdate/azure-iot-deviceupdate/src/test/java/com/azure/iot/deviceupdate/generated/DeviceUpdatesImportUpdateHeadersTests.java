package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.DeviceUpdatesImportUpdateHeaders;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DeviceUpdatesImportUpdateHeadersTests {
    @Test
    public void testDeserialize() {
        DeviceUpdatesImportUpdateHeaders model =
                BinaryData.fromString("{\"Operation-Location\":\"efojyqdhcupl\"}")
                        .toObject(DeviceUpdatesImportUpdateHeaders.class);
        Assertions.assertEquals("efojyqdhcupl", model.getOperationLocation());
    }
}
