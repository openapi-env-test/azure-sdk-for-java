// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.purview.purviewcatalog.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.purview.purviewcatalog.EntityClient;
import com.azure.purview.purviewcatalog.EntityClientBuilder;

public class EntityGetByUniqueAttributes {
    public static void main(String[] args) {
        EntityClient entityClient = new EntityClientBuilder().endpoint("{Endpoint}").buildClient();
        // BEGIN:com.azure.purview.purviewcatalog.generated.entitygetbyuniqueattributes.entitygetbyuniqueattributes
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("attr:qualifiedName", "https://exampleaccount.core.windows.net");
        Response<BinaryData> response =
                entityClient.getByUniqueAttributesWithResponse("azure_storage_account", requestOptions);
        // END:com.azure.purview.purviewcatalog.generated.entitygetbyuniqueattributes.entitygetbyuniqueattributes
    }
}
