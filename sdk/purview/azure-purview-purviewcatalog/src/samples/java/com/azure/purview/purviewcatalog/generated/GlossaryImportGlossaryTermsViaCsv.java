// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.purview.purviewcatalog.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.SyncPoller;
import com.azure.purview.purviewcatalog.GlossaryClient;
import com.azure.purview.purviewcatalog.GlossaryClientBuilder;

public class GlossaryImportGlossaryTermsViaCsv {
    public static void main(String[] args) {
        GlossaryClient glossaryClient = new GlossaryClientBuilder().endpoint("{Endpoint}").buildClient();
        // BEGIN:com.azure.purview.purviewcatalog.generated.glossaryimportglossarytermsviacsv.glossaryimportglossarytermsviacsv
        BinaryData file = BinaryData.fromString("\"examplefile.csv\"");
        RequestOptions requestOptions = new RequestOptions();
        SyncPoller<BinaryData, BinaryData> response =
                glossaryClient.beginImportGlossaryTermsViaCsv(
                        "a02d8eb5-a977-4ed6-85c6-63d44239471a", file, requestOptions);
        // END:com.azure.purview.purviewcatalog.generated.glossaryimportglossarytermsviacsv.glossaryimportglossarytermsviacsv
    }
}
