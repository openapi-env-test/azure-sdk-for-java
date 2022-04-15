package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.LogCollectionOperationDeviceStatus;
import com.azure.iot.deviceupdate.models.OperationStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class LogCollectionOperationDeviceStatusTests {
    @Test
    public void testDeserialize() {
        LogCollectionOperationDeviceStatus model =
                BinaryData.fromString(
                                "{\"deviceId\":\"tj\",\"moduleId\":\"ysdzhez\",\"status\":\"Running\",\"resultCode\":\"aiqyuvvfo\",\"extendedResultCode\":\"p\",\"logLocation\":\"qyikvy\"}")
                        .toObject(LogCollectionOperationDeviceStatus.class);
        Assertions.assertEquals("tj", model.getDeviceId());
        Assertions.assertEquals("ysdzhez", model.getModuleId());
        Assertions.assertEquals(OperationStatus.RUNNING, model.getStatus());
        Assertions.assertEquals("aiqyuvvfo", model.getResultCode());
        Assertions.assertEquals("p", model.getExtendedResultCode());
        Assertions.assertEquals("qyikvy", model.getLogLocation());
    }
}
