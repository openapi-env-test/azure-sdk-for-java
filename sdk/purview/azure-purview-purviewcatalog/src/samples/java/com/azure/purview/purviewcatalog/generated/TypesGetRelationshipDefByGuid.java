// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.purview.purviewcatalog.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.purview.purviewcatalog.TypesClient;
import com.azure.purview.purviewcatalog.TypesClientBuilder;

public class TypesGetRelationshipDefByGuid {
    public static void main(String[] args) {
        TypesClient client = new TypesClientBuilder().endpoint("{Endpoint}").buildClient();
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                client.getRelationshipDefByGuidWithResponse("695edde1-2782-4a3c-841b-0b3aba25fe45", requestOptions);
    }
}
