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

public final class DeviceManagementGetGroupUpdateComplianceTests extends DemoNewServiceClientTestBase {
    @Test
    @Disabled
    public void testDeviceManagementGetGroupUpdateComplianceTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                deviceManagementClient.getGroupUpdateComplianceWithResponse("group1", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"newUpdatesAvailableDeviceCount\":36265,\"onLatestUpdateDeviceCount\":256873,\"totalDeviceCount\":302204,\"updatesInProgressDeviceCount\":9066}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
