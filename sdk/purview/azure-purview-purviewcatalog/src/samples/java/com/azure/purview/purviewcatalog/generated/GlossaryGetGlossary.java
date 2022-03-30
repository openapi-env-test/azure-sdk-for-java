// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.purview.purviewcatalog.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.purview.purviewcatalog.GlossaryClient;
import com.azure.purview.purviewcatalog.GlossaryClientBuilder;

public class GlossaryGetGlossary {
    public static void main(String[] args) {
        GlossaryClient glossaryClient = new GlossaryClientBuilder().endpoint("{Endpoint}").buildClient();
        // BEGIN:com.azure.purview.purviewcatalog.generated.glossarygetglossary.glossarygetglossary
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                glossaryClient.getGlossaryWithResponse("47029611-67a1-42d5-8766-90eb904f7f22", requestOptions);
        // END:com.azure.purview.purviewcatalog.generated.glossarygetglossary.glossarygetglossary
    }
}
