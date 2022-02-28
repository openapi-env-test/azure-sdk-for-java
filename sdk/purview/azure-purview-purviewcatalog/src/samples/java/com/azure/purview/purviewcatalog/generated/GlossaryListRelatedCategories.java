// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.purview.purviewcatalog.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.purview.purviewcatalog.GlossaryClient;
import com.azure.purview.purviewcatalog.GlossaryClientBuilder;

public class GlossaryListRelatedCategories {
    public static void main(String[] args) {
        GlossaryClient client = new GlossaryClientBuilder().endpoint("{Endpoint}").buildClient();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("limit", "-1");
        requestOptions.addQueryParam("sort", "ASC");
        requestOptions.addQueryParam("offset", "0");
        Response<BinaryData> response =
                client.listRelatedCategoriesWithResponse("ed7458f0-9463-48a5-b5c6-4f785fb34e12", requestOptions);
    }
}
