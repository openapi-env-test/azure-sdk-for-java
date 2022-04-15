package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.DeviceClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DeviceClassTests {
    @Test
    public void testDeserialize() {
        DeviceClass model =
                BinaryData.fromString(
                                "{\"deviceClassId\":\"hwhbotzingamv\",\"compatProperties\":{\"ho\":\"zqzudph\",\"amvdkfwynwcvtbv\":\"ayhmtnvyqiatkz\"},\"bestCompatibleUpdateId\":{\"provider\":\"pcnp\",\"name\":\"zcjaesgvvsccy\",\"version\":\"jguq\"}}")
                        .toObject(DeviceClass.class);
        Assertions.assertEquals("hwhbotzingamv", model.getDeviceClassId());
        Assertions.assertEquals("zqzudph", model.getCompatProperties().get("ho"));
        Assertions.assertEquals("pcnp", model.getBestCompatibleUpdateId().getProvider());
        Assertions.assertEquals("zcjaesgvvsccy", model.getBestCompatibleUpdateId().getName());
        Assertions.assertEquals("jguq", model.getBestCompatibleUpdateId().getVersion());
    }
}
