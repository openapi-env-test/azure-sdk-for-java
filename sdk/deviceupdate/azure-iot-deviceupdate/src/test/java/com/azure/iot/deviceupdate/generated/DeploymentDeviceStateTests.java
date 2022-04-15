package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.DeploymentDeviceState;
import com.azure.iot.deviceupdate.models.DeviceDeploymentState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DeploymentDeviceStateTests {
    @Test
    public void testDeserialize() {
        DeploymentDeviceState model =
                BinaryData.fromString(
                                "{\"deviceId\":\"ssxmojms\",\"moduleId\":\"kjprvk\",\"retryCount\":955806064,\"movedOnToNewDeployment\":false,\"deviceState\":\"InProgress\"}")
                        .toObject(DeploymentDeviceState.class);
        Assertions.assertEquals("ssxmojms", model.getDeviceId());
        Assertions.assertEquals("kjprvk", model.getModuleId());
        Assertions.assertEquals(955806064, model.getRetryCount());
        Assertions.assertEquals(false, model.isMovedOnToNewDeployment());
        Assertions.assertEquals(DeviceDeploymentState.IN_PROGRESS, model.getDeviceState());
    }
}
