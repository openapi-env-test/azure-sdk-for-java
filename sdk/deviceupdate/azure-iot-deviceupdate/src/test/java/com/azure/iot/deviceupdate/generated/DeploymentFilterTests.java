package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.DeploymentFilter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DeploymentFilterTests {
    @Test
    public void testDeserialize() {
        DeploymentFilter model =
                BinaryData.fromString(
                                "{\"provider\":\"sttijfybvp\",\"name\":\"krsgsgb\",\"version\":\"uzqgnjdgkynsc\"}")
                        .toObject(DeploymentFilter.class);
        Assertions.assertEquals("sttijfybvp", model.getProvider());
        Assertions.assertEquals("krsgsgb", model.getName());
        Assertions.assertEquals("uzqgnjdgkynsc", model.getVersion());
    }
}
