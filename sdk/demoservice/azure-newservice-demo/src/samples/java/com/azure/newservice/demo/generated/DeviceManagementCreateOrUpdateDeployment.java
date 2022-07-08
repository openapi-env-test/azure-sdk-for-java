// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.newservice.demo.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.newservice.demo.DeviceManagementClient;
import com.azure.newservice.demo.DeviceManagementClientBuilder;

public class DeviceManagementCreateOrUpdateDeployment {
    public static void main(String[] args) {
        DeviceManagementClient deviceManagementClient =
                new DeviceManagementClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("contoso.api.adu.microsoft.com")
                        .instanceId("blue")
                        .buildClient();
        // BEGIN:com.azure.newservice.demo.generated.devicemanagementcreateorupdatedeployment.devicemanagementcreateorupdatedeployment
        BinaryData deployment =
                BinaryData.fromString(
                        "{\"deploymentId\":\"deploymentId\",\"groupId\":\"TestGroup\",\"rollbackPolicy\":{\"failure\":{\"devicesFailedCount\":100,\"devicesFailedPercentage\":50},\"update\":{\"updateId\":{\"name\":\"name\",\"provider\":\"provider\",\"version\":\"1.2.3.3\"}}},\"startDateTime\":\"2020-04-22T12:12:12.0000000+00:00\",\"update\":{\"updateId\":{\"name\":\"name\",\"provider\":\"provider\",\"version\":\"1.2.3.4\"}}}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                deviceManagementClient.createOrUpdateDeploymentWithResponse(
                        "TestGroup", "deploymentId", deployment, requestOptions);
        // END:com.azure.newservice.demo.generated.devicemanagementcreateorupdatedeployment.devicemanagementcreateorupdatedeployment
    }
}
