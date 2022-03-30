// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.purview.purviewcatalog.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.purview.purviewcatalog.GlossaryClient;
import com.azure.purview.purviewcatalog.GlossaryClientBuilder;

public class GlossaryListGlossaryCategoriesHeaders {
    public static void main(String[] args) {
        GlossaryClient glossaryClient = new GlossaryClientBuilder().endpoint("{Endpoint}").buildClient();
        // BEGIN:com.azure.purview.purviewcatalog.generated.glossarylistglossarycategoriesheaders.glossarylistglossarycategoriesheaders
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("limit", "-1");
        requestOptions.addQueryParam("offset", "0");
        requestOptions.addQueryParam("sort", "ASC");
        Response<BinaryData> response =
                glossaryClient.listGlossaryCategoriesHeadersWithResponse(
                        "c018ddaf-7c21-4b37-a838-dae5f110c3d8", requestOptions);
        // END:com.azure.purview.purviewcatalog.generated.glossarylistglossarycategoriesheaders.glossarylistglossarycategoriesheaders
    }
}
