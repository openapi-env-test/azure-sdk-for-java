package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.DeviceTagsList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DeviceTagsListTests {
    @Test
    public void testDeserialize() {
        DeviceTagsList model =
                BinaryData.fromString(
                                "{\"value\":[{\"tagName\":\"ratiz\",\"deviceCount\":142407954}],\"nextLink\":\"nasx\"}")
                        .toObject(DeviceTagsList.class);
        Assertions.assertEquals("ratiz", model.getValue().get(0).getTagName());
        Assertions.assertEquals(142407954, model.getValue().get(0).getDeviceCount());
        Assertions.assertEquals("nasx", model.getNextLink());
    }
}
