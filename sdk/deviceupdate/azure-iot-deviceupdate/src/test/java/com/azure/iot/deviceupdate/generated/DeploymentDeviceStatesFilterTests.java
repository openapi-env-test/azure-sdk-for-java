package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.DeploymentDeviceStatesFilter;
import com.azure.iot.deviceupdate.models.DeviceState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DeploymentDeviceStatesFilterTests {
    @Test
    public void testDeserialize() {
        DeploymentDeviceStatesFilter model =
                BinaryData.fromString(
                                "{\"deviceId\":\"ihfrbbcevqa\",\"moduleId\":\"ltd\",\"deviceState\":\"AlreadyInDeployment\"}")
                        .toObject(DeploymentDeviceStatesFilter.class);
        Assertions.assertEquals("ihfrbbcevqa", model.getDeviceId());
        Assertions.assertEquals("ltd", model.getModuleId());
        Assertions.assertEquals(DeviceState.ALREADY_IN_DEPLOYMENT, model.getDeviceState());
    }
}
