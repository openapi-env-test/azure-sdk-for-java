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

public final class DeviceManagementListDeviceHealthTests extends DemoNewServiceClientTestBase {
    @Test
    @Disabled
    public void testDeviceManagementListDeviceHealthTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                deviceManagementClient.listDeviceHealthWithResponse("state eq 'unhealthy'", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"nextLink\":\"http://foo\",\"value\":[{\"deviceId\":\"device1\",\"digitalTwinModelId\":\"dtmi:foo;1\",\"healthChecks\":[{\"name\":\"check1\",\"result\":\"success\"},{\"name\":\"check2\",\"result\":\"userError\"}],\"moduleId\":\"module1\",\"state\":\"unhealthy\"}]}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
