// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.purview.purviewcatalog.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.purview.purviewcatalog.TypesClient;
import com.azure.purview.purviewcatalog.TypesClientBuilder;

public class TypesGetEntityDefinitionByGuid {
    public static void main(String[] args) {
        TypesClient typesClient = new TypesClientBuilder().endpoint("{Endpoint}").buildClient();
        // BEGIN:com.azure.purview.purviewcatalog.generated.typesgetentitydefinitionbyguid.typesgetentitydefinitionbyguid
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                typesClient.getEntityDefinitionByGuidWithResponse(
                        "4bc54c37-98a8-4de8-9ee8-182610859d43", requestOptions);
        // END:com.azure.purview.purviewcatalog.generated.typesgetentitydefinitionbyguid.typesgetentitydefinitionbyguid
    }
}
