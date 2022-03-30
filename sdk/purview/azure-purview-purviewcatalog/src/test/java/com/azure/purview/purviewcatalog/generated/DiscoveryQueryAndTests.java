// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.purview.purviewcatalog.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class DiscoveryQueryAndTests extends PurviewCatalogServiceRestApiDocumentClientTestBase {
    @Test
    @Disabled
    public void testDiscoveryQueryAndTests() {
        BinaryData searchRequest =
                BinaryData.fromString(
                        "{\"filter\":{\"and\":[{\"entityType\":\"azure_blob_path\"},{\"attributeName\":\"qualifiedName\",\"attributeValue\":\".csv\",\"operator\":\"contains\"}]},\"keywords\":null,\"limit\":10}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = discoveryClient.queryWithResponse(searchRequest, requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"@search.count\":5,\"value\":[{\"name\":\"exampledata.csv\",\"description\":null,\"@search.highlights\":{\"qualifiedName\":[\"https://exampleaccount.blob.core.windows.net/examplepath/<em>csv</em>/exampledata.csv\"]},\"@search.score\":1,\"assetType\":[\"Azure Blob Storage\"],\"classification\":[],\"contact\":[],\"entityType\":\"azure_blob_path\",\"id\":\"63b92968-c9ac-4af8-8cff-f61d147bbf88\",\"label\":[\"Example.Label\"],\"owner\":null,\"qualifiedName\":\"https://exampleaccount.blob.core.windows.net/examplepath/csv/exampledata.csv\",\"term\":[]},{\"name\":\"AllTypes.csv\",\"description\":null,\"@search.highlights\":{\"qualifiedName\":[\"https://exampleaccount.blob.core.windows.net/examplepath/<em>csv</em>/AllTypes.csv\"]},\"@search.score\":1,\"assetType\":[\"Azure Blob Storage\"],\"classification\":[],\"contact\":[],\"entityType\":\"azure_blob_path\",\"id\":\"2605db54-086d-4d6c-adb6-f0bbed6c6eab\",\"label\":[\"Example.Label\"],\"owner\":null,\"qualifiedName\":\"https://exampleaccount.blob.core.windows.net/examplepath/csv/AllTypes.csv\",\"term\":[]}]}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
