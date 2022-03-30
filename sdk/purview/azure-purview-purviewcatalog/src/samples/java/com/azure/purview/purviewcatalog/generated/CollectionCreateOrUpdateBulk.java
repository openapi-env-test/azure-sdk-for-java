// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.purview.purviewcatalog.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.purview.purviewcatalog.CollectionClient;
import com.azure.purview.purviewcatalog.CollectionClientBuilder;

public class CollectionCreateOrUpdateBulk {
    public static void main(String[] args) {
        CollectionClient collectionClient = new CollectionClientBuilder().endpoint("{Endpoint}").buildClient();
        // BEGIN:com.azure.purview.purviewcatalog.generated.collectioncreateorupdatebulk.collectioncreateorupdatebulk
        BinaryData entities =
                BinaryData.fromString(
                        "{\"entities\":[{\"attributes\":{\"name\":\"exampleaccount\",\"description\":\"Example Description\",\"qualifiedName\":\"exampleaccount\"},\"typeName\":\"azure_storage_account\"},{\"attributes\":{\"name\":\"exampleaccount2\",\"qualifiedName\":\"exampleaccount2\"},\"typeName\":\"azure_storage_account\"}],\"referredEntities\":{}}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                collectionClient.createOrUpdateBulkWithResponse("ExampleCollection", entities, requestOptions);
        // END:com.azure.purview.purviewcatalog.generated.collectioncreateorupdatebulk.collectioncreateorupdatebulk
    }
}
