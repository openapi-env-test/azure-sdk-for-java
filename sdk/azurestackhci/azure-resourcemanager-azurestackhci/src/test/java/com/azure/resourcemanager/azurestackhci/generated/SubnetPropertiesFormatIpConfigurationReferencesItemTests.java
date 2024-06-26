// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.SubnetPropertiesFormatIpConfigurationReferencesItem;
import org.junit.jupiter.api.Assertions;

public final class SubnetPropertiesFormatIpConfigurationReferencesItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SubnetPropertiesFormatIpConfigurationReferencesItem model =
            BinaryData
                .fromString("{\"ID\":\"uhrzayvvt\"}")
                .toObject(SubnetPropertiesFormatIpConfigurationReferencesItem.class);
        Assertions.assertEquals("uhrzayvvt", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SubnetPropertiesFormatIpConfigurationReferencesItem model =
            new SubnetPropertiesFormatIpConfigurationReferencesItem().withId("uhrzayvvt");
        model = BinaryData.fromObject(model).toObject(SubnetPropertiesFormatIpConfigurationReferencesItem.class);
        Assertions.assertEquals("uhrzayvvt", model.id());
    }
}
