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

public final class DiscoveryQueryFileExtensionTests extends PurviewCatalogServiceRestApiDocumentClientTestBase {
    @Test
    @Disabled
    public void testDiscoveryQueryFileExtensionTests() {
        BinaryData searchRequest =
                BinaryData.fromString(
                        "{\"filter\":{\"and\":[{\"fileExtension\":\"txt\"}]},\"keywords\":null,\"limit\":10}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = discoveryClient.queryWithResponse(searchRequest, requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"@search.count\":49,\"value\":[{\"name\":\"exampledata.txt\",\"description\":null,\"@search.score\":1,\"assetType\":[\"Azure Blob Storage\"],\"classification\":[],\"contact\":[],\"entityType\":\"azure_blob_path\",\"id\":\"bfecbcc3-1838-45fe-96d6-112de8a170f9\",\"label\":[],\"owner\":null,\"qualifiedName\":\"https://exampleaccount.blob.core.windows.net/examplepath/exampledata.txt\",\"term\":[]},{\"name\":\"exampledata.txt\",\"description\":null,\"@search.score\":1,\"assetType\":[\"Azure Blob Storage\"],\"classification\":[],\"contact\":[],\"entityType\":\"azure_blob_path\",\"id\":\"14d857b9-e2c1-4118-8bfa-12e53ae6ce7f\",\"label\":[],\"owner\":null,\"qualifiedName\":\"https://exampleaccount.blob.core.windows.net/examplepath/exampledata.txt\",\"term\":[]}]}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
