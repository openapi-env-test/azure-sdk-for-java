// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate.demo.generated;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.iot.deviceupdate.demo.DeviceManagementClient;
import com.azure.iot.deviceupdate.demo.DeviceManagementClientBuilder;

public class DeviceManagementListLogCollectionOperations {
    public static void main(String[] args) {
        DeviceManagementClient deviceManagementClient =
                new DeviceManagementClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("contoso.api.adu.microsoft.com")
                        .instanceId("blue")
                        .buildClient();
        // BEGIN:com.azure.iot.deviceupdate.demo.generated.devicemanagementlistlogcollectionoperations.devicemanagementlistlogcollectionoperations
        RequestOptions requestOptions = new RequestOptions();
        PagedIterable<BinaryData> response = deviceManagementClient.listLogCollectionOperations(requestOptions);
        // END:com.azure.iot.deviceupdate.demo.generated.devicemanagementlistlogcollectionoperations.devicemanagementlistlogcollectionoperations
    }
}
