package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.UpdateId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class UpdateIdTests {
    @Test
    public void testDeserialize() {
        UpdateId model =
                BinaryData.fromString("{\"provider\":\"nhungbw\",\"name\":\"zrnf\",\"version\":\"gxg\"}")
                        .toObject(UpdateId.class);
        Assertions.assertEquals("nhungbw", model.getProvider());
        Assertions.assertEquals("zrnf", model.getName());
        Assertions.assertEquals("gxg", model.getVersion());
    }
}
