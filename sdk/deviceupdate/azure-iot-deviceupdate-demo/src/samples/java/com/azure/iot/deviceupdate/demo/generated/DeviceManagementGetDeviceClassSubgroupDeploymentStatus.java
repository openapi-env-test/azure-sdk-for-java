// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate.demo.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.iot.deviceupdate.demo.DeviceManagementClient;
import com.azure.iot.deviceupdate.demo.DeviceManagementClientBuilder;

public class DeviceManagementGetDeviceClassSubgroupDeploymentStatus {
    public static void main(String[] args) {
        DeviceManagementClient deviceManagementClient =
                new DeviceManagementClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("contoso.api.adu.microsoft.com")
                        .instanceId("blue")
                        .buildClient();
        // BEGIN:com.azure.iot.deviceupdate.demo.generated.devicemanagementgetdeviceclasssubgroupdeploymentstatus.devicemanagementgetdeviceclasssubgroupdeploymentstatus
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                deviceManagementClient.getDeviceClassSubgroupDeploymentStatusWithResponse(
                        "TestGroup", "deviceClassId", "deploymentId", requestOptions);
        // END:com.azure.iot.deviceupdate.demo.generated.devicemanagementgetdeviceclasssubgroupdeploymentstatus.devicemanagementgetdeviceclasssubgroupdeploymentstatus
    }
}
