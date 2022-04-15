package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.DeploymentsList;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DeploymentsListTests {
    @Test
    public void testDeserialize() {
        DeploymentsList model =
                BinaryData.fromString(
                                "{\"value\":[{\"deploymentId\":\"vfoimwksli\",\"startDateTime\":\"2021-03-01T08:06:27Z\",\"updateId\":{\"provider\":\"izjx\",\"name\":\"ydfce\",\"version\":\"cvlhv\"},\"groupId\":\"gdyftumrtwna\",\"isCanceled\":false,\"isRetried\":true}],\"nextLink\":\"wkojgcyztsfmzn\"}")
                        .toObject(DeploymentsList.class);
        Assertions.assertEquals("vfoimwksli", model.getValue().get(0).getDeploymentId());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-03-01T08:06:27Z"), model.getValue().get(0).getStartDateTime());
        Assertions.assertEquals("izjx", model.getValue().get(0).getUpdateId().getProvider());
        Assertions.assertEquals("ydfce", model.getValue().get(0).getUpdateId().getName());
        Assertions.assertEquals("cvlhv", model.getValue().get(0).getUpdateId().getVersion());
        Assertions.assertEquals("gdyftumrtwna", model.getValue().get(0).getGroupId());
        Assertions.assertEquals(false, model.getValue().get(0).isCanceled());
        Assertions.assertEquals(true, model.getValue().get(0).isRetried());
        Assertions.assertEquals("wkojgcyztsfmzn", model.getNextLink());
    }
}
