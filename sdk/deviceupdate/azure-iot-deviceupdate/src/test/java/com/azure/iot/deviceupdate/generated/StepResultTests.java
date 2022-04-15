package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.StepResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class StepResultTests {
    @Test
    public void testDeserialize() {
        StepResult model =
                BinaryData.fromString(
                                "{\"updateId\":{\"provider\":\"tsbwtovvtgse\",\"name\":\"nqfiufxqknpi\",\"version\":\"gnepttwqmsni\"},\"description\":\"cdm\",\"resultCode\":795132424,\"extendedResultCode\":266606002,\"resultDetails\":\"jlpijnkrx\"}")
                        .toObject(StepResult.class);
        Assertions.assertEquals("tsbwtovvtgse", model.getUpdateId().getProvider());
        Assertions.assertEquals("nqfiufxqknpi", model.getUpdateId().getName());
        Assertions.assertEquals("gnepttwqmsni", model.getUpdateId().getVersion());
        Assertions.assertEquals("cdm", model.getDescription());
        Assertions.assertEquals(795132424, model.getResultCode());
        Assertions.assertEquals(266606002, model.getExtendedResultCode());
        Assertions.assertEquals("jlpijnkrx", model.getResultDetails());
    }
}
