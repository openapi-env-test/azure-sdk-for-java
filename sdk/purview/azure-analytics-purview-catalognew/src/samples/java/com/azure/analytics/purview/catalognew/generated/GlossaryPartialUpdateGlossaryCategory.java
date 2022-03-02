// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalognew.generated;

import com.azure.analytics.purview.catalognew.GlossaryClient;
import com.azure.analytics.purview.catalognew.GlossaryClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

public class GlossaryPartialUpdateGlossaryCategory {
    public static void main(String[] args) {
        GlossaryClient client = new GlossaryClientBuilder().endpoint("{Endpoint}").buildClient();
        BinaryData partialUpdates = BinaryData.fromString("{\"longDescription\":\"Example Long Description\"}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                client.partialUpdateGlossaryCategoryWithResponse(
                        "3243ea0a-9492-47e1-392e-a84e64980af9", partialUpdates, requestOptions);
    }
}
