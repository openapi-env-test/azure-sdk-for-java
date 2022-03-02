// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalognew.generated;

import com.azure.analytics.purview.catalognew.EntityClient;
import com.azure.analytics.purview.catalognew.EntityClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

public class EntityDeleteByUniqueAttribute {
    public static void main(String[] args) {
        EntityClient client = new EntityClientBuilder().endpoint("{Endpoint}").buildClient();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("attr:qualifiedName", "https://exampleaccount.core.windows.net");
        Response<BinaryData> response =
                client.deleteByUniqueAttributeWithResponse("azure_storage_account", requestOptions);
    }
}
