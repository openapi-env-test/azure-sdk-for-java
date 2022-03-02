// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalognew.generated;

import com.azure.analytics.purview.catalognew.DiscoveryClient;
import com.azure.analytics.purview.catalognew.DiscoveryClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

public class DiscoveryQueryClassification {
    public static void main(String[] args) {
        DiscoveryClient client = new DiscoveryClientBuilder().endpoint("{Endpoint}").buildClient();
        BinaryData searchRequest =
                BinaryData.fromString(
                        "{\"filter\":{\"classification\":\"MICROSOFT.PERSONAL.EMAIL\",\"includeSubClassifications\":true},\"keywords\":null,\"limit\":10}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = client.queryWithResponse(searchRequest, requestOptions);
    }
}
