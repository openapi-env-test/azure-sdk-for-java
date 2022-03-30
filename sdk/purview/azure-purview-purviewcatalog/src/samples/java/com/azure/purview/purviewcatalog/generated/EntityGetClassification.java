// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.purview.purviewcatalog.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.purview.purviewcatalog.EntityClient;
import com.azure.purview.purviewcatalog.EntityClientBuilder;

public class EntityGetClassification {
    public static void main(String[] args) {
        EntityClient entityClient = new EntityClientBuilder().endpoint("{Endpoint}").buildClient();
        // BEGIN:com.azure.purview.purviewcatalog.generated.entitygetclassification.entitygetclassification
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                entityClient.getClassificationWithResponse(
                        "9347abc5-7b86-4b82-a1e2-ad77c7c3cac3", "MICROSOFT.PERSONAL.DATE_OF_BIRTH", requestOptions);
        // END:com.azure.purview.purviewcatalog.generated.entitygetclassification.entitygetclassification
    }
}
