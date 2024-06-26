// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.OperationInner;
import org.junit.jupiter.api.Assertions;

public final class OperationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationInner model =
            BinaryData
                .fromString(
                    "{\"name\":\"llr\",\"display\":{\"provider\":\"d\",\"resource\":\"atkpnp\",\"operation\":\"exxbczwtr\",\"description\":\"iqzbq\"},\"isDataAction\":true,\"origin\":\"user\",\"properties\":{\"lhzdobp\":\"dataokacspk\",\"kcciwwzjuqkhr\":\"datajmflbvvnch\",\"oskg\":\"dataajiwkuo\"}}")
                .toObject(OperationInner.class);
        Assertions.assertEquals(true, model.isDataAction());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationInner model = new OperationInner().withIsDataAction(true);
        model = BinaryData.fromObject(model).toObject(OperationInner.class);
        Assertions.assertEquals(true, model.isDataAction());
    }
}
