// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.purview.purviewcatalog.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.purview.purviewcatalog.CollectionClient;
import com.azure.purview.purviewcatalog.CollectionClientBuilder;

public class CollectionMoveEntitiesToCollection {
    public static void main(String[] args) {
        CollectionClient collectionClient = new CollectionClientBuilder().endpoint("{Endpoint}").buildClient();
        // BEGIN:com.azure.purview.purviewcatalog.generated.collectionmoveentitiestocollection.collectionmoveentitiestocollection
        BinaryData moveEntitiesRequest =
                BinaryData.fromString(
                        "{\"entityGuids\":[\"321493e3-3fb7-4b3e-9df7-3b69154174c2\",\"b2f9c306-cf65-4bb0-878e-cfaafde156b1\"]}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                collectionClient.moveEntitiesToCollectionWithResponse(
                        "ExampleNewCollection", moveEntitiesRequest, requestOptions);
        // END:com.azure.purview.purviewcatalog.generated.collectionmoveentitiestocollection.collectionmoveentitiestocollection
    }
}
