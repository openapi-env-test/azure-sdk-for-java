package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.Step;
import com.azure.iot.deviceupdate.models.StepType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class StepTests {
    @Test
    public void testDeserialize() {
        Step model =
                BinaryData.fromString(
                                "{\"type\":\"Reference\",\"description\":\"jkot\",\"handler\":\"qgoulznd\",\"files\":[\"yqkgfg\",\"bmadgak\",\"qsrxybzqqed\"],\"updateId\":{\"provider\":\"tbciqfouflmm\",\"name\":\"kzsmodm\",\"version\":\"lougpbkw\"}}")
                        .toObject(Step.class);
        Assertions.assertEquals(StepType.REFERENCE, model.getType());
        Assertions.assertEquals("jkot", model.getDescription());
        Assertions.assertEquals("qgoulznd", model.getHandler());
        Assertions.assertEquals("yqkgfg", model.getFiles().get(0));
        Assertions.assertEquals("tbciqfouflmm", model.getUpdateId().getProvider());
        Assertions.assertEquals("kzsmodm", model.getUpdateId().getName());
        Assertions.assertEquals("lougpbkw", model.getUpdateId().getVersion());
    }
}
