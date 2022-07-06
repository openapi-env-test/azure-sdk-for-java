// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate.demo.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class DeviceManagementDeleteDeploymentTests extends DeviceUpdateClientTestBase {
    @Test
    @Disabled
    public void testDeviceManagementDeleteDeploymentTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<Void> response =
                deviceManagementClient.deleteDeploymentWithResponse("TestGroup", "deploymentId", requestOptions);
        Assertions.assertEquals(204, response.getStatusCode());
    }
}
