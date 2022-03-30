// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.purview.purviewcatalog.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.purview.purviewcatalog.DiscoveryClient;
import com.azure.purview.purviewcatalog.DiscoveryClientBuilder;

public class DiscoverySuggest {
    public static void main(String[] args) {
        DiscoveryClient discoveryClient = new DiscoveryClientBuilder().endpoint("{Endpoint}").buildClient();
        // BEGIN:com.azure.purview.purviewcatalog.generated.discoverysuggest.discoverysuggest
        BinaryData suggestRequest =
                BinaryData.fromString(
                        "{\"filter\":{\"and\":[{\"entityType\":\"azure_blob_path\",\"includeSubTypes\":false}]},\"keywords\":\"exampledata\",\"limit\":10}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = discoveryClient.suggestWithResponse(suggestRequest, requestOptions);
        // END:com.azure.purview.purviewcatalog.generated.discoverysuggest.discoverysuggest
    }
}
