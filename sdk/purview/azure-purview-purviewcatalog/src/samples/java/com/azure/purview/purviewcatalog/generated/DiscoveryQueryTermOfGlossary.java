// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.purview.purviewcatalog.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.purview.purviewcatalog.DiscoveryClient;
import com.azure.purview.purviewcatalog.DiscoveryClientBuilder;

public class DiscoveryQueryTermOfGlossary {
    public static void main(String[] args) {
        DiscoveryClient client = new DiscoveryClientBuilder().endpoint("{Endpoint}").buildClient();
        BinaryData searchRequest =
                BinaryData.fromString(
                        "{\"filter\":{\"and\":[{\"glossaryName\":\"Glossary\",\"term\":\"ExampleTerm\"}]},\"keywords\":null,\"limit\":3}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = client.queryWithResponse(searchRequest, requestOptions);
    }
}
