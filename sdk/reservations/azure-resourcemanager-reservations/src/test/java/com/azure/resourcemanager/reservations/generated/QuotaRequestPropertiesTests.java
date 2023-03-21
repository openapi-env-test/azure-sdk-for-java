// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.reservations.fluent.models.QuotaRequestProperties;
import com.azure.resourcemanager.reservations.models.QuotaRequestState;
import com.azure.resourcemanager.reservations.models.ResourceName;
import com.azure.resourcemanager.reservations.models.SubRequest;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class QuotaRequestPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        QuotaRequestProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Accepted\",\"message\":\"zwl\",\"requestSubmitTime\":\"2021-07-30T12:05:38Z\",\"value\":[{\"limit\":544110475,\"name\":{\"value\":\"dy\",\"localizedValue\":\"tdooaoj\"},\"resourceType\":\"iodkooebwnujhem\",\"unit\":\"bvdkcrodtjin\",\"provisioningState\":\"Failed\",\"message\":\"fltkacjv\",\"subRequestId\":\"kdlfoa\"},{\"limit\":1662630957,\"name\":{\"value\":\"pagao\",\"localizedValue\":\"ulpqblylsyxkqjn\"},\"resourceType\":\"ervtiagxs\",\"unit\":\"zuempsbzkf\",\"provisioningState\":\"Succeeded\",\"message\":\"v\",\"subRequestId\":\"qi\"}]}")
                .toObject(QuotaRequestProperties.class);
        Assertions.assertEquals(QuotaRequestState.ACCEPTED, model.provisioningState());
        Assertions.assertEquals("dy", model.value().get(0).name().value());
        Assertions.assertEquals("bvdkcrodtjin", model.value().get(0).unit());
        Assertions.assertEquals(QuotaRequestState.FAILED, model.value().get(0).provisioningState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        QuotaRequestProperties model =
            new QuotaRequestProperties()
                .withProvisioningState(QuotaRequestState.ACCEPTED)
                .withValue(
                    Arrays
                        .asList(
                            new SubRequest()
                                .withName(new ResourceName().withValue("dy"))
                                .withUnit("bvdkcrodtjin")
                                .withProvisioningState(QuotaRequestState.FAILED),
                            new SubRequest()
                                .withName(new ResourceName().withValue("pagao"))
                                .withUnit("zuempsbzkf")
                                .withProvisioningState(QuotaRequestState.SUCCEEDED)));
        model = BinaryData.fromObject(model).toObject(QuotaRequestProperties.class);
        Assertions.assertEquals(QuotaRequestState.ACCEPTED, model.provisioningState());
        Assertions.assertEquals("dy", model.value().get(0).name().value());
        Assertions.assertEquals("bvdkcrodtjin", model.value().get(0).unit());
        Assertions.assertEquals(QuotaRequestState.FAILED, model.value().get(0).provisioningState());
    }
}
