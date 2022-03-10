// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate.generated;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.iot.deviceupdate.DeviceUpdateClient;
import com.azure.iot.deviceupdate.DeviceUpdateClientBuilder;

public class DeviceUpdateListUpdates {
    public static void main(String[] args) {
        // BEGIN: com.azure.iot.deviceupdate.generated.deviceupdatelistupdates.deviceupdatelistupdates
        DeviceUpdateClient deviceUpdateClient =
                new DeviceUpdateClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("contoso.api.adu.microsoft.com")
                        .instanceId("blue")
                        .buildDeviceUpdateClient();
        RequestOptions requestOptions = new RequestOptions();
        PagedIterable<BinaryData> response = deviceUpdateClient.listUpdates(requestOptions);
        // END: com.azure.iot.deviceupdate.generated.deviceupdatelistupdates.deviceupdatelistupdates
    }
}
