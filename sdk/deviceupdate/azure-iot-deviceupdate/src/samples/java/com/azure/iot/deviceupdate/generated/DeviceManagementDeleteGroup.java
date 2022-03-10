// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.iot.deviceupdate.DeviceManagementClient;
import com.azure.iot.deviceupdate.DeviceUpdateClientBuilder;

public class DeviceManagementDeleteGroup {
    public static void main(String[] args) {
        // BEGIN: com.azure.iot.deviceupdate.generated.devicemanagementdeletegroup.devicemanagementdeletegroup
        DeviceManagementClient deviceManagementClient =
                new DeviceUpdateClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("contoso.api.adu.microsoft.com")
                        .instanceId("blue")
                        .buildDeviceManagementClient();
        RequestOptions requestOptions = new RequestOptions();
        Response<Void> response = deviceManagementClient.deleteGroupWithResponse("group1", requestOptions);
        // END: com.azure.iot.deviceupdate.generated.devicemanagementdeletegroup.devicemanagementdeletegroup
    }
}
