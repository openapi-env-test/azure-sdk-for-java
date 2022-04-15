package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.DeviceManagementsImportDevicesHeaders;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DeviceManagementsImportDevicesHeadersTests {
    @Test
    public void testDeserialize() {
        DeviceManagementsImportDevicesHeaders model =
                BinaryData.fromString("{\"Operation-Location\":\"rgnowcjhfgm\"}")
                        .toObject(DeviceManagementsImportDevicesHeaders.class);
        Assertions.assertEquals("rgnowcjhfgm", model.getOperationLocation());
    }
}
