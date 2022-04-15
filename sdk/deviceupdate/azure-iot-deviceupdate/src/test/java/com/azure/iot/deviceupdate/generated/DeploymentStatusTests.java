package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.DeploymentState;
import com.azure.iot.deviceupdate.models.DeploymentStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DeploymentStatusTests {
    @Test
    public void testDeserialize() {
        DeploymentStatus model =
                BinaryData.fromString(
                                "{\"deploymentState\":\"Active\",\"totalDevices\":1036527354,\"devicesInProgressCount\":1191725223,\"devicesCompletedFailedCount\":1960555856,\"devicesCompletedSucceededCount\":430792961,\"devicesCanceledCount\":1069147931}")
                        .toObject(DeploymentStatus.class);
        Assertions.assertEquals(DeploymentState.ACTIVE, model.getDeploymentState());
        Assertions.assertEquals(1036527354, model.getTotalDevices());
        Assertions.assertEquals(1191725223, model.getDevicesInProgressCount());
        Assertions.assertEquals(1960555856, model.getDevicesCompletedFailedCount());
        Assertions.assertEquals(430792961, model.getDevicesCompletedSucceededCount());
        Assertions.assertEquals(1069147931, model.getDevicesCanceledCount());
    }
}
