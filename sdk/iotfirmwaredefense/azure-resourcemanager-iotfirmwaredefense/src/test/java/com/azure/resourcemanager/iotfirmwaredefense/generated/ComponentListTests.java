// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iotfirmwaredefense.models.ComponentList;
import org.junit.jupiter.api.Assertions;

public final class ComponentListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ComponentList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"componentId\":\"f\",\"componentName\":\"s\",\"version\":\"zgvfcjrwz\",\"license\":\"xjtfelluwfzit\",\"releaseDate\":\"2021-10-17T22:50:15Z\",\"paths\":[\"fpjkjlxofp\",\"vhpfxxypininmay\"],\"isUpdateAvailable\":\"True\"}],\"nextLink\":\"bkpodepooginuv\"}")
                .toObject(ComponentList.class);
        Assertions.assertEquals("bkpodepooginuv", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ComponentList model = new ComponentList().withNextLink("bkpodepooginuv");
        model = BinaryData.fromObject(model).toObject(ComponentList.class);
        Assertions.assertEquals("bkpodepooginuv", model.nextLink());
    }
}
