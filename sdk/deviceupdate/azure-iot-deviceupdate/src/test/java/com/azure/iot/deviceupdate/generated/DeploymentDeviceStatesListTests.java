package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.DeploymentDeviceStatesList;
import com.azure.iot.deviceupdate.models.DeviceDeploymentState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DeploymentDeviceStatesListTests {
    @Test
    public void testDeserialize() {
        DeploymentDeviceStatesList model =
                BinaryData.fromString(
                                "{\"value\":[{\"deviceId\":\"uljltduceamtmcz\",\"moduleId\":\"m\",\"retryCount\":418634069,\"movedOnToNewDeployment\":false,\"deviceState\":\"Incompatible\"}],\"nextLink\":\"wqiok\"}")
                        .toObject(DeploymentDeviceStatesList.class);
        Assertions.assertEquals("uljltduceamtmcz", model.getValue().get(0).getDeviceId());
        Assertions.assertEquals("m", model.getValue().get(0).getModuleId());
        Assertions.assertEquals(418634069, model.getValue().get(0).getRetryCount());
        Assertions.assertEquals(false, model.getValue().get(0).isMovedOnToNewDeployment());
        Assertions.assertEquals(DeviceDeploymentState.INCOMPATIBLE, model.getValue().get(0).getDeviceState());
        Assertions.assertEquals("wqiok", model.getNextLink());
    }
}
