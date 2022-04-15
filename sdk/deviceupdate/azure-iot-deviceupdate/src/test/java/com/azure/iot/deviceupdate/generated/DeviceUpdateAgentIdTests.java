package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.DeviceUpdateAgentId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DeviceUpdateAgentIdTests {
    @Test
    public void testDeserialize() {
        DeviceUpdateAgentId model =
                BinaryData.fromString("{\"deviceId\":\"pgogtqxepny\",\"moduleId\":\"fuajly\"}")
                        .toObject(DeviceUpdateAgentId.class);
        Assertions.assertEquals("pgogtqxepny", model.getDeviceId());
        Assertions.assertEquals("fuajly", model.getModuleId());
    }
}
