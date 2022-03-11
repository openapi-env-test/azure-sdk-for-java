// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.SyncPoller;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.iot.deviceupdate.DeviceUpdateClient;
import com.azure.iot.deviceupdate.DeviceUpdateClientBuilder;

public class DeviceUpdateImportUpdate {
    public static void main(String[] args) {
        // BEGIN: com.azure.iot.deviceupdate.generated.deviceupdateimportupdate.deviceupdateimportupdate
        DeviceUpdateClient deviceUpdateClient =
                new DeviceUpdateClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("contoso.api.adu.microsoft.com")
                        .instanceId("blue")
                        .buildDeviceUpdateClient();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("action", "import");
        SyncPoller<BinaryData, BinaryData> response = deviceUpdateClient.beginImportUpdate(null, requestOptions);
        // END: com.azure.iot.deviceupdate.generated.deviceupdateimportupdate.deviceupdateimportupdate
    }
}
