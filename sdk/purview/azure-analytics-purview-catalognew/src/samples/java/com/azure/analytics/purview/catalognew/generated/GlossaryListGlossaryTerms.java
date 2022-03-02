// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalognew.generated;

import com.azure.analytics.purview.catalognew.GlossaryClient;
import com.azure.analytics.purview.catalognew.GlossaryClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

public class GlossaryListGlossaryTerms {
    public static void main(String[] args) {
        GlossaryClient client = new GlossaryClientBuilder().endpoint("{Endpoint}").buildClient();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("limit", "-1");
        requestOptions.addQueryParam("sort", "ASC");
        requestOptions.addQueryParam("offset", "0");
        Response<BinaryData> response =
                client.listGlossaryTermsWithResponse("c018ddaf-7c21-4b37-a838-dae5f110c3d8", requestOptions);
    }
}
