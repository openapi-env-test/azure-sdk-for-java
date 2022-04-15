package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.DeviceTag;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DeviceTagTests {
    @Test
    public void testDeserialize() {
        DeviceTag model =
                BinaryData.fromString("{\"tagName\":\"ft\",\"deviceCount\":351015732}").toObject(DeviceTag.class);
        Assertions.assertEquals("ft", model.getTagName());
        Assertions.assertEquals(351015732, model.getDeviceCount());
    }
}
