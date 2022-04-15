package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.LogCollectionOperationDetailedStatus;
import com.azure.iot.deviceupdate.models.OperationStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class LogCollectionOperationDetailedStatusTests {
    @Test
    public void testDeserialize() {
        LogCollectionOperationDetailedStatus model =
                BinaryData.fromString(
                                "{\"operationId\":\"iglaecx\",\"createdDateTime\":\"t\",\"lastActionDateTime\":\"okpvzm\",\"status\":\"Failed\",\"deviceStatus\":[{\"deviceId\":\"dgxobfircl\",\"moduleId\":\"kciayzri\",\"status\":\"Running\",\"resultCode\":\"yawfvjlboxq\",\"extendedResultCode\":\"jlmxhomdynhd\",\"logLocation\":\"igu\"}],\"description\":\"nraauzz\"}")
                        .toObject(LogCollectionOperationDetailedStatus.class);
        Assertions.assertEquals("iglaecx", model.getOperationId());
        Assertions.assertEquals("t", model.getCreatedDateTime());
        Assertions.assertEquals("okpvzm", model.getLastActionDateTime());
        Assertions.assertEquals(OperationStatus.FAILED, model.getStatus());
        Assertions.assertEquals("dgxobfircl", model.getDeviceStatus().get(0).getDeviceId());
        Assertions.assertEquals("kciayzri", model.getDeviceStatus().get(0).getModuleId());
        Assertions.assertEquals(OperationStatus.RUNNING, model.getDeviceStatus().get(0).getStatus());
        Assertions.assertEquals("yawfvjlboxq", model.getDeviceStatus().get(0).getResultCode());
        Assertions.assertEquals("jlmxhomdynhd", model.getDeviceStatus().get(0).getExtendedResultCode());
        Assertions.assertEquals("igu", model.getDeviceStatus().get(0).getLogLocation());
        Assertions.assertEquals("nraauzz", model.getDescription());
    }
}
