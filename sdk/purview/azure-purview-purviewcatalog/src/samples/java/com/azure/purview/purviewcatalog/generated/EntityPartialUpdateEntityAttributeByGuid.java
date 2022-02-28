// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.purview.purviewcatalog.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.purview.purviewcatalog.EntityClient;
import com.azure.purview.purviewcatalog.EntityClientBuilder;

public class EntityPartialUpdateEntityAttributeByGuid {
    public static void main(String[] args) {
        EntityClient client = new EntityClientBuilder().endpoint("{Endpoint}").buildClient();
        BinaryData body = BinaryData.fromString("\"ExampleNewName\"");
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("name", "ExampleName");
        Response<BinaryData> response =
                client.partialUpdateEntityAttributeByGuidWithResponse(
                        "394d9a03-912e-483b-bbd2-bedee1a69798", body, requestOptions);
    }
}
