// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.communication.fluent.models.SenderUsernameResourceInner;
import com.azure.resourcemanager.communication.models.SenderUsernameResourceCollection;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SenderUsernameResourceCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SenderUsernameResourceCollection model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"dataLocation\":\"vvdfwatkpnpul\",\"username\":\"xxbczwtr\",\"displayName\":\"iqzbq\",\"provisioningState\":\"Running\"},\"id\":\"vmyokacspkwl\",\"name\":\"zdobpxjmflbvvnch\",\"type\":\"kcciwwzjuqkhr\"}],\"nextLink\":\"jiwkuofoskghsau\"}")
                .toObject(SenderUsernameResourceCollection.class);
        Assertions.assertEquals("xxbczwtr", model.value().get(0).username());
        Assertions.assertEquals("iqzbq", model.value().get(0).displayName());
        Assertions.assertEquals("jiwkuofoskghsau", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SenderUsernameResourceCollection model =
            new SenderUsernameResourceCollection()
                .withValue(
                    Arrays.asList(new SenderUsernameResourceInner().withUsername("xxbczwtr").withDisplayName("iqzbq")))
                .withNextLink("jiwkuofoskghsau");
        model = BinaryData.fromObject(model).toObject(SenderUsernameResourceCollection.class);
        Assertions.assertEquals("xxbczwtr", model.value().get(0).username());
        Assertions.assertEquals("iqzbq", model.value().get(0).displayName());
        Assertions.assertEquals("jiwkuofoskghsau", model.nextLink());
    }
}
