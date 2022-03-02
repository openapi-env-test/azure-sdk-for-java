// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalognew.generated;

import com.azure.analytics.purview.catalognew.TypesClient;
import com.azure.analytics.purview.catalognew.TypesClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

public class TypesGetClassificationDefByGuid {
    public static void main(String[] args) {
        TypesClient client = new TypesClientBuilder().endpoint("{Endpoint}").buildClient();
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                client.getClassificationDefByGuidWithResponse("e79878fa-adba-4ee5-adc5-328d8841cd49", requestOptions);
    }
}
