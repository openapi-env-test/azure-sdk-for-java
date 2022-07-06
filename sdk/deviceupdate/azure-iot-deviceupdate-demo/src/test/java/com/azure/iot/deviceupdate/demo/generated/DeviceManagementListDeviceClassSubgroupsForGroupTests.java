// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate.demo.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class DeviceManagementListDeviceClassSubgroupsForGroupTests extends DeviceUpdateClientTestBase {
    @Test
    @Disabled
    public void testDeviceManagementListDeviceClassSubgroupsForGroupTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                deviceManagementClient.listDeviceClassSubgroupsForGroupWithResponse("group1", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"value\":[{\"createdDateTime\":\"2020-07-01T12:13:14.0000000Z\",\"deploymentId\":\"MyDeployment\",\"deviceClassId\":\"DeviceClassId\",\"deviceCount\":149,\"groupId\":\"group1\"},{\"createdDateTime\":\"2020-07-01T12:13:14.0000000Z\",\"deploymentId\":\"MyDeployment2\",\"deviceClassId\":\"DeviceClassId2\",\"deviceCount\":35,\"groupId\":\"group1\"}]}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
