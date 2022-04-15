package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.AccessCondition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AccessConditionTests {
    @Test
    public void testDeserialize() {
        AccessCondition model =
                BinaryData.fromString("{\"If-None-Match\":\"cmisofie\"}").toObject(AccessCondition.class);
        Assertions.assertEquals("cmisofie", model.getIfNoneMatch());
    }
}
