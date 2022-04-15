package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.LogCollectionOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class LogCollectionOperationTests {
    @Test
    public void testDeserialize() {
        LogCollectionOperation model =
                BinaryData.fromString(
                                "{\"operationId\":\"unnoxyhk\",\"deviceList\":[{\"deviceId\":\"qddrihpfhoqcaae\",\"moduleId\":\"aomdjvlpjxx\"}],\"description\":\"brm\",\"createdDateTime\":\"eivsiykzkdnc\",\"lastActionDateTime\":\"xonbzoggculapz\",\"status\":\"Undefined\"}")
                        .toObject(LogCollectionOperation.class);
        Assertions.assertEquals("unnoxyhk", model.getOperationId());
        Assertions.assertEquals("qddrihpfhoqcaae", model.getDeviceList().get(0).getDeviceId());
        Assertions.assertEquals("aomdjvlpjxx", model.getDeviceList().get(0).getModuleId());
        Assertions.assertEquals("brm", model.getDescription());
    }
}
