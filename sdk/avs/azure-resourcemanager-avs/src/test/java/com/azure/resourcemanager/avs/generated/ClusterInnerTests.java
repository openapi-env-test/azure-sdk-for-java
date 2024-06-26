// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.ClusterInner;
import com.azure.resourcemanager.avs.models.Sku;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ClusterInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterInner model =
            BinaryData
                .fromString(
                    "{\"sku\":{\"name\":\"nmxiebwwaloayqc\"},\"properties\":{\"clusterSize\":1428727987,\"provisioningState\":\"Deleting\",\"clusterId\":442573185,\"hosts\":[\"yzm\",\"txon\",\"mtsavjcbpwxqp\"]},\"id\":\"rknftguvriuhprwm\",\"name\":\"yvxqtayriwwroy\",\"type\":\"bexrmcq\"}")
                .toObject(ClusterInner.class);
        Assertions.assertEquals("nmxiebwwaloayqc", model.sku().name());
        Assertions.assertEquals(1428727987, model.clusterSize());
        Assertions.assertEquals("yzm", model.hosts().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterInner model =
            new ClusterInner()
                .withSku(new Sku().withName("nmxiebwwaloayqc"))
                .withClusterSize(1428727987)
                .withHosts(Arrays.asList("yzm", "txon", "mtsavjcbpwxqp"));
        model = BinaryData.fromObject(model).toObject(ClusterInner.class);
        Assertions.assertEquals("nmxiebwwaloayqc", model.sku().name());
        Assertions.assertEquals(1428727987, model.clusterSize());
        Assertions.assertEquals("yzm", model.hosts().get(0));
    }
}
