package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.Group;
import com.azure.iot.deviceupdate.models.GroupType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class GroupTests {
    @Test
    public void testDeserialize() {
        Group model =
                BinaryData.fromString(
                                "{\"groupId\":\"cluyovwxnbkf\",\"groupType\":\"InvalidDeviceClassIdAndIoTHubTag\",\"tags\":[\"xscyhwzdgirujbz\",\"omvzzbtd\",\"qvpn\",\"yujviylwdshfssn\"],\"createdDateTime\":\"bgye\",\"deviceCount\":934099618,\"deploymentId\":\"sgaojfmwncot\",\"deviceClassId\":\"fhir\"}")
                        .toObject(Group.class);
        Assertions.assertEquals("cluyovwxnbkf", model.getGroupId());
        Assertions.assertEquals(GroupType.INVALID_DEVICE_CLASS_ID_AND_IO_THUB_TAG, model.getGroupType());
        Assertions.assertEquals("xscyhwzdgirujbz", model.getTags().get(0));
        Assertions.assertEquals("bgye", model.getCreatedDateTime());
        Assertions.assertEquals(934099618, model.getDeviceCount());
        Assertions.assertEquals("sgaojfmwncot", model.getDeploymentId());
        Assertions.assertEquals("fhir", model.getDeviceClassId());
    }
}
