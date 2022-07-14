// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.newservice.demo.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.newservice.demo.DeviceManagementClient;
import com.azure.newservice.demo.DeviceManagementClientBuilder;

public class DeviceManagementDeleteDeviceClassSubgroup {
    public static void main(String[] args) {
        DeviceManagementClient deviceManagementClient =
                new DeviceManagementClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("contoso.api.adu.microsoft.com")
                        .instanceId("blue")
                        .buildClient();
        // BEGIN:com.azure.newservice.demo.generated.devicemanagementdeletedeviceclasssubgroup.devicemanagementdeletedeviceclasssubgroup
        RequestOptions requestOptions = new RequestOptions();
        Response<Void> response =
                deviceManagementClient.deleteDeviceClassSubgroupWithResponse("group1", "deviceClassId", requestOptions);
        // END:com.azure.newservice.demo.generated.devicemanagementdeletedeviceclasssubgroup.devicemanagementdeletedeviceclasssubgroup
    }
}
