package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.GroupType;
import com.azure.iot.deviceupdate.models.GroupsList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class GroupsListTests {
    @Test
    public void testDeserialize() {
        GroupsList model =
                BinaryData.fromString(
                                "{\"value\":[{\"groupId\":\"yzhftwesgogczh\",\"groupType\":\"DeviceClassIdAndIoTHubTag\",\"tags\":[\"xkr\",\"gnyhmossxkkg\",\"h\",\"rghxjb\"],\"createdDateTime\":\"hqxvcxgfrpdsofbs\",\"deviceCount\":160292090,\"deploymentId\":\"vbuswd\",\"deviceClassId\":\"yybyc\"},{\"groupId\":\"unvjsrtkfawnopq\",\"groupType\":\"DefaultDeviceClassId\",\"tags\":[\"yzirtxdyuxzejn\",\"psew\",\"ioilqukrydxtq\"],\"createdDateTime\":\"ieoxorggufhyaomt\",\"deviceCount\":1499179801,\"deploymentId\":\"avgrvkffovjz\",\"deviceClassId\":\"jbibg\"}],\"nextLink\":\"fxumv\"}")
                        .toObject(GroupsList.class);
        Assertions.assertEquals("yzhftwesgogczh", model.getValue().get(0).getGroupId());
        Assertions.assertEquals(GroupType.DEVICE_CLASS_ID_AND_IO_THUB_TAG, model.getValue().get(0).getGroupType());
        Assertions.assertEquals("xkr", model.getValue().get(0).getTags().get(0));
        Assertions.assertEquals("hqxvcxgfrpdsofbs", model.getValue().get(0).getCreatedDateTime());
        Assertions.assertEquals(160292090, model.getValue().get(0).getDeviceCount());
        Assertions.assertEquals("vbuswd", model.getValue().get(0).getDeploymentId());
        Assertions.assertEquals("yybyc", model.getValue().get(0).getDeviceClassId());
        Assertions.assertEquals("fxumv", model.getNextLink());
    }
}
