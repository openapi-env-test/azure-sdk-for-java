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

public final class DeviceManagementGetLogCollectionOperationTests extends DemoNewServiceClientTestBase {
    @Test
    @Disabled
    public void testDeviceManagementGetLogCollectionOperationTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                deviceManagementClient.getLogCollectionOperationWithResponse("SampleOperationId", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"operationId\":\"SampleOperationId\",\"description\":\"Example diagnostics operation\",\"createdDateTime\":\"2021-09-30T02:23:41.59Z\",\"deviceList\":[{\"deviceId\":\"DeviceA\"},{\"deviceId\":\"DeviceB\",\"moduleId\":\"ModuleB\"}],\"lastActionDateTime\":\"2021-09-30T02:23:41.59Z\",\"status\":\"NotStarted\"}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
