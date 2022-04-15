package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.Deployment;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DeploymentTests {
    @Test
    public void testDeserialize() {
        Deployment model =
                BinaryData.fromString(
                                "{\"deploymentId\":\"aeqphchqnr\",\"startDateTime\":\"2021-10-09T00:59:13Z\",\"updateId\":{\"provider\":\"pxehuwrykqga\",\"name\":\"fmviklby\",\"version\":\"vkhbejdznx\"},\"groupId\":\"vdsrhnjiv\",\"isCanceled\":false,\"isRetried\":false}")
                        .toObject(Deployment.class);
        Assertions.assertEquals("aeqphchqnr", model.getDeploymentId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-09T00:59:13Z"), model.getStartDateTime());
        Assertions.assertEquals("pxehuwrykqga", model.getUpdateId().getProvider());
        Assertions.assertEquals("fmviklby", model.getUpdateId().getName());
        Assertions.assertEquals("vkhbejdznx", model.getUpdateId().getVersion());
        Assertions.assertEquals("vdsrhnjiv", model.getGroupId());
        Assertions.assertEquals(false, model.isCanceled());
        Assertions.assertEquals(false, model.isRetried());
    }
}
