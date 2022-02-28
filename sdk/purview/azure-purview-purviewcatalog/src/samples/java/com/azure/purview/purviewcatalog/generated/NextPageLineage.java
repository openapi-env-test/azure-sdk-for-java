// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.purview.purviewcatalog.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.purview.purviewcatalog.LineageClient;
import com.azure.purview.purviewcatalog.LineageClientBuilder;

public class NextPageLineage {
    public static void main(String[] args) {
        LineageClient client = new LineageClientBuilder().endpoint("{Endpoint}").buildClient();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("offset", "0");
        requestOptions.addQueryParam("limit", "5");
        requestOptions.addQueryParam("getDerivedLineage", "true");
        requestOptions.addQueryParam("direction", "INPUT");
        Response<BinaryData> response =
                client.nextPageLineageWithResponse("a6894eb3-81f3-829b-2adc-52f3e603411a", requestOptions);
    }
}
