// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class DiscoveryQueryTermOfGlossaryTests extends PurviewCatalogClientTestBase {
    @Test
    @Disabled
    public void testDiscoveryQueryTermOfGlossaryTests() {
        BinaryData searchRequest =
                BinaryData.fromString(
                        "{\"filter\":{\"and\":[{\"glossaryName\":\"Glossary\",\"term\":\"ExampleTerm\"}]},\"keywords\":null,\"limit\":3}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = discoveryClient.queryWithResponse(searchRequest, requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"@search.count\":1,\"value\":[{\"name\":\"examplecontainer\",\"description\":null,\"@search.score\":1,\"assetType\":[\"Azure Blob Storage\"],\"classification\":[],\"contact\":[],\"entityType\":\"azure_blob_container\",\"id\":\"b20ac13a-7883-4376-b076-bac9f8f214a8\",\"label\":[\"Example.Label\"],\"owner\":null,\"qualifiedName\":\"https://exampleaccount.blob.core.windows.net/examplecontainer\",\"term\":[{\"name\":\"ExampleTerm\",\"glossaryName\":\"Glossary\"}]}]}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
