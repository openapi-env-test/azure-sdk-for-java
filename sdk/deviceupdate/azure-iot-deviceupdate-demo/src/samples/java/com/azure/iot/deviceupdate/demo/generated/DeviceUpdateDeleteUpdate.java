// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate.demo.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.SyncPoller;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.iot.deviceupdate.demo.DeviceUpdateClient;
import com.azure.iot.deviceupdate.demo.DeviceUpdateClientBuilder;

public class DeviceUpdateDeleteUpdate {
    public static void main(String[] args) {
        DeviceUpdateClient deviceUpdateClient =
                new DeviceUpdateClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("contoso.api.adu.microsoft.com")
                        .instanceId("blue")
                        .buildClient();
        // BEGIN:com.azure.iot.deviceupdate.demo.generated.deviceupdatedeleteupdate.deviceupdatedeleteupdate
        RequestOptions requestOptions = new RequestOptions();
        SyncPoller<BinaryData, BinaryData> response =
                deviceUpdateClient.beginDeleteUpdate("microsoft", "adu", "1.0.0.0", requestOptions);
        // END:com.azure.iot.deviceupdate.demo.generated.deviceupdatedeleteupdate.deviceupdatedeleteupdate
    }
}
