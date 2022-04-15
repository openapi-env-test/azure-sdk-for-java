package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.UpdateCompliance;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class UpdateComplianceTests {
    @Test
    public void testDeserialize() {
        UpdateCompliance model =
                BinaryData.fromString(
                                "{\"totalDeviceCount\":1047026822,\"onLatestUpdateDeviceCount\":621511915,\"newUpdatesAvailableDeviceCount\":1655506118,\"updatesInProgressDeviceCount\":1333681706}")
                        .toObject(UpdateCompliance.class);
        Assertions.assertEquals(1047026822, model.getTotalDeviceCount());
        Assertions.assertEquals(621511915, model.getOnLatestUpdateDeviceCount());
        Assertions.assertEquals(1655506118, model.getNewUpdatesAvailableDeviceCount());
        Assertions.assertEquals(1333681706, model.getUpdatesInProgressDeviceCount());
    }
}
