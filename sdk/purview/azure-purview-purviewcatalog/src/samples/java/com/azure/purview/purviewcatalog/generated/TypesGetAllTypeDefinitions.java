// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.purview.purviewcatalog.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.purview.purviewcatalog.TypesClient;
import com.azure.purview.purviewcatalog.TypesClientBuilder;

public class TypesGetAllTypeDefinitions {
    public static void main(String[] args) {
        TypesClient typesClient = new TypesClientBuilder().endpoint("{Endpoint}").buildClient();
        // BEGIN:com.azure.purview.purviewcatalog.generated.typesgetalltypedefinitions.typesgetalltypedefinitions
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("includeTermTemplate", "true");
        Response<BinaryData> response = typesClient.getAllTypeDefinitionsWithResponse(requestOptions);
        // END:com.azure.purview.purviewcatalog.generated.typesgetalltypedefinitions.typesgetalltypedefinitions
    }
}
