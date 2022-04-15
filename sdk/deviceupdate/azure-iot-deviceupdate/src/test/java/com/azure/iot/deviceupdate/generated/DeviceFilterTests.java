package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.DeviceFilter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DeviceFilterTests {
    @Test
    public void testDeserialize() {
        DeviceFilter model = BinaryData.fromString("{\"groupId\":\"uyav\"}").toObject(DeviceFilter.class);
        Assertions.assertEquals("uyav", model.getGroupId());
    }
}
