package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.UpdatableDevicesList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class UpdatableDevicesListTests {
    @Test
    public void testDeserialize() {
        UpdatableDevicesList model =
                BinaryData.fromString(
                                "{\"value\":[{\"updateId\":{\"provider\":\"ymoxoftpipiwyczu\",\"name\":\"xacpqjli\",\"version\":\"hyus\"},\"deviceCount\":1732038887},{\"updateId\":{\"provider\":\"kasdvlm\",\"name\":\"wdgzxulucv\",\"version\":\"amrsreuzv\"},\"deviceCount\":1675155115},{\"updateId\":{\"provider\":\"risjnhnytxifqjz\",\"name\":\"xmrhu\",\"version\":\"lw\"},\"deviceCount\":1373835899}],\"nextLink\":\"sutrgjup\"}")
                        .toObject(UpdatableDevicesList.class);
        Assertions.assertEquals("ymoxoftpipiwyczu", model.getValue().get(0).getUpdateId().getProvider());
        Assertions.assertEquals("xacpqjli", model.getValue().get(0).getUpdateId().getName());
        Assertions.assertEquals("hyus", model.getValue().get(0).getUpdateId().getVersion());
        Assertions.assertEquals(1732038887, model.getValue().get(0).getDeviceCount());
        Assertions.assertEquals("sutrgjup", model.getNextLink());
    }
}
