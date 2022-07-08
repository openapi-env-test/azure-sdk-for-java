// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.newservice.demo.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class DeviceManagementGetDeploymentForDeviceClassSubgroupTests extends DemoNewServiceClientTestBase {
    @Test
    @Disabled
    public void testDeviceManagementGetDeploymentForDeviceClassSubgroupTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                deviceManagementClient.getDeploymentForDeviceClassSubgroupWithResponse(
                        "TestGroup", "deviceClassId", "deploymentId", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"deploymentId\":\"deploymentId\",\"groupId\":\"TestGroup\",\"isCanceled\":false,\"isCloudInitiatedRollback\":false,\"isRetried\":false,\"rollbackPolicy\":{\"failure\":{\"devicesFailedCount\":100,\"devicesFailedPercentage\":50},\"update\":{\"updateId\":{\"name\":\"name\",\"provider\":\"provider\",\"version\":\"1.2.3.3\"}}},\"startDateTime\":\"2020-04-22T12:12:12.0000000+00:00\",\"update\":{\"updateId\":{\"name\":\"name\",\"provider\":\"provider\",\"version\":\"1.2.3.4\"}}}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
