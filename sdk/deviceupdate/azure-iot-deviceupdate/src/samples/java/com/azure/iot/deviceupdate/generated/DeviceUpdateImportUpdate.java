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
        DeviceUpdateClient client =
                new DeviceUpdateClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("contoso.api.adu.microsoft.com")
                        .instanceId("blue")
                        .buildDeviceUpdateClient();
        BinaryData updateToImport =
                BinaryData.fromString(
                        "[{\"files\":[{\"filename\":\"file1.bin\",\"url\":\"http://test.blob.core.windows.net/test/upload1v5uww1q\"},{\"filename\":\"file2.bin\",\"url\":\"http://test.blob.core.windows.net/test/uploadkrmn5yw0\"},{\"filename\":\"file3.bin\",\"url\":\"http://test.blob.core.windows.net/test/uploaddq52ky5m\"}],\"importManifest\":{\"hashes\":{\"sha256\":\"O19LyyncPe1AGstOdkcmozLV8pSbBdqrE18HdYVohRc=\"},\"sizeInBytes\":816,\"url\":\"http://test.blob.core.windows.net/test/uploadimportMan.json\"}}]");
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("action", "import");
        SyncPoller<BinaryData, BinaryData> response = client.beginImportUpdate(updateToImport, requestOptions);
    }
}
