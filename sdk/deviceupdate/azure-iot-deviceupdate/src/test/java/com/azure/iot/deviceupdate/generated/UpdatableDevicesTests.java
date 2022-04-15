package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.UpdatableDevices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class UpdatableDevicesTests {
    @Test
    public void testDeserialize() {
        UpdatableDevices model =
                BinaryData.fromString(
                                "{\"updateId\":{\"provider\":\"uutpwoqhih\",\"name\":\"jqgwzp\",\"version\":\"fqntcyp\"},\"deviceCount\":613728557}")
                        .toObject(UpdatableDevices.class);
        Assertions.assertEquals("uutpwoqhih", model.getUpdateId().getProvider());
        Assertions.assertEquals("jqgwzp", model.getUpdateId().getName());
        Assertions.assertEquals("fqntcyp", model.getUpdateId().getVersion());
        Assertions.assertEquals(613728557, model.getDeviceCount());
    }
}
