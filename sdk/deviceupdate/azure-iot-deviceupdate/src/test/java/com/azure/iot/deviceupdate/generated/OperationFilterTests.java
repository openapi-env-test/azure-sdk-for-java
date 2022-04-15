package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.OperationFilter;
import com.azure.iot.deviceupdate.models.OperationFilterStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OperationFilterTests {
    @Test
    public void testDeserialize() {
        OperationFilter model = BinaryData.fromString("{\"status\":\"Running\"}").toObject(OperationFilter.class);
        Assertions.assertEquals(OperationFilterStatus.RUNNING, model.getStatus());
    }
}
