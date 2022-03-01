// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.scanning.generated;

import com.azure.analytics.purview.scanning.TriggersClient;
import com.azure.analytics.purview.scanning.TriggersClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class TriggersCreateTrigger {
    public static void main(String[] args) {
        TriggersClient client =
                new TriggersClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildClient();
        BinaryData body =
                BinaryData.fromString(
                        "{\"properties\":{\"recurrence\":{\"endTime\":\"2021-02-25T00:00:00.000Z\",\"frequency\":\"Month\",\"interval\":1,\"schedule\":{\"hours\":[23],\"minutes\":[56],\"monthDays\":[10]},\"startTime\":\"2021-02-12T14:59:00.416Z\"},\"recurrenceInterval\":null,\"scanLevel\":\"Incremental\"}}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = client.createTriggerWithResponse("DataSource1", "Scan1", body, requestOptions);
    }
}
