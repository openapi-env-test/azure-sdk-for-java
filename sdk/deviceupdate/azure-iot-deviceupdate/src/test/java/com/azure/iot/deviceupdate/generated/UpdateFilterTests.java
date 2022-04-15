package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.UpdateFilter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class UpdateFilterTests {
    @Test
    public void testDeserialize() {
        UpdateFilter model = BinaryData.fromString("{\"isDeployable\":false}").toObject(UpdateFilter.class);
        Assertions.assertEquals(false, model.isDeployable());
    }
}
