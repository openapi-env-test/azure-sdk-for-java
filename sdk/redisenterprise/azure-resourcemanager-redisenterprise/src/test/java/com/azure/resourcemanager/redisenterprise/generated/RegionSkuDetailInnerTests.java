// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.redisenterprise.fluent.models.RegionSkuDetailInner;
import com.azure.resourcemanager.redisenterprise.models.Capability;
import com.azure.resourcemanager.redisenterprise.models.LocationInfo;
import com.azure.resourcemanager.redisenterprise.models.SkuDetail;
import com.azure.resourcemanager.redisenterprise.models.SkuName;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RegionSkuDetailInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RegionSkuDetailInner model =
            BinaryData
                .fromString(
                    "{\"resourceType\":\"jdeyeamdpha\",\"locationInfo\":{\"location\":\"pbuxwgipwhon\",\"capabilities\":[{\"name\":\"shwankixzbinje\",\"value\":true},{\"name\":\"mryw\",\"value\":true}]},\"skuDetails\":{\"name\":\"Enterprise_E10\"}}")
                .toObject(RegionSkuDetailInner.class);
        Assertions.assertEquals("jdeyeamdpha", model.resourceType());
        Assertions.assertEquals("pbuxwgipwhon", model.locationInfo().location());
        Assertions.assertEquals("shwankixzbinje", model.locationInfo().capabilities().get(0).name());
        Assertions.assertEquals(true, model.locationInfo().capabilities().get(0).value());
        Assertions.assertEquals(SkuName.ENTERPRISE_E10, model.skuDetails().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RegionSkuDetailInner model =
            new RegionSkuDetailInner()
                .withResourceType("jdeyeamdpha")
                .withLocationInfo(
                    new LocationInfo()
                        .withLocation("pbuxwgipwhon")
                        .withCapabilities(
                            Arrays
                                .asList(
                                    new Capability().withName("shwankixzbinje").withValue(true),
                                    new Capability().withName("mryw").withValue(true))))
                .withSkuDetails(new SkuDetail().withName(SkuName.ENTERPRISE_E10));
        model = BinaryData.fromObject(model).toObject(RegionSkuDetailInner.class);
        Assertions.assertEquals("jdeyeamdpha", model.resourceType());
        Assertions.assertEquals("pbuxwgipwhon", model.locationInfo().location());
        Assertions.assertEquals("shwankixzbinje", model.locationInfo().capabilities().get(0).name());
        Assertions.assertEquals(true, model.locationInfo().capabilities().get(0).value());
        Assertions.assertEquals(SkuName.ENTERPRISE_E10, model.skuDetails().name());
    }
}
