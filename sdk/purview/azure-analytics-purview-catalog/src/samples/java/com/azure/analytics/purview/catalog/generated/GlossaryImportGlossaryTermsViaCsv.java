// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.GlossaryClient;
import com.azure.analytics.purview.catalog.PurviewCatalogClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.SyncPoller;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GlossaryImportGlossaryTermsViaCsv {
    public static void main(String[] args) {
        GlossaryClient client =
                new PurviewCatalogClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildGlossaryClient();
        BinaryData file = BinaryData.fromString("\"examplefile.csv\"");
        RequestOptions requestOptions = new RequestOptions();
        SyncPoller<BinaryData, BinaryData> response =
                client.beginImportGlossaryTermsViaCsv("a02d8eb5-a977-4ed6-85c6-63d44239471a", file, requestOptions);
    }
}
