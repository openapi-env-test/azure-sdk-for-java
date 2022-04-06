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

public final class DiscoveryQueryTests extends PurviewCatalogClientTestBase {
    @Test
    @Disabled
    public void testDiscoveryQueryTests() {
        BinaryData searchRequest =
                BinaryData.fromString(
                        "{\"facets\":[{\"count\":0,\"facet\":\"assetType\",\"sort\":{\"count\":\"desc\"}},{\"count\":10,\"facet\":\"classification\",\"sort\":{\"count\":\"desc\"}},{\"count\":10,\"facet\":\"contactId\",\"sort\":{\"count\":\"desc\"}},{\"count\":10,\"facet\":\"label\",\"sort\":{\"count\":\"desc\"}},{\"count\":10,\"facet\":\"term\",\"sort\":{\"count\":\"desc\"}}],\"filter\":{\"and\":[{\"not\":{\"or\":[{\"attributeName\":\"size\",\"attributeValue\":0,\"operator\":\"eq\"},{\"attributeName\":\"fileSize\",\"attributeValue\":0,\"operator\":\"eq\"}]}},{\"not\":{\"classification\":\"MICROSOFT.SYSTEM.TEMP_FILE\"}},{\"not\":{\"or\":[{\"entityType\":\"AtlasGlossaryTerm\"},{\"entityType\":\"AtlasGlossary\"}]}}]},\"keywords\":\"examplefile.csv\",\"limit\":10,\"offset\":0}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = discoveryClient.queryWithResponse(searchRequest, requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"@search.count\":339,\"value\":[{\"name\":\"Example Name 1\",\"description\":null,\"@search.score\":1,\"assetType\":[],\"classification\":[],\"contact\":[],\"entityType\":\"AtlasGlossaryTerm\",\"id\":\"97dc2d61-ef37-4cfd-8be8-d0a8b3524c1a\",\"label\":[],\"owner\":null,\"qualifiedName\":\"ExampleName1@Glossary\",\"term\":[]},{\"name\":\"Example Name 2\",\"description\":null,\"@search.score\":1,\"assetType\":[],\"classification\":[],\"contact\":[],\"entityType\":\"AtlasGlossaryTerm\",\"id\":\"477b0278-81e3-473f-a2d4-d134f1b52f84\",\"label\":[],\"owner\":null,\"qualifiedName\":\"ExampleName2@Glossary\",\"term\":[]},{\"name\":\"Example Name 3\",\"description\":null,\"@search.score\":1,\"assetType\":[],\"classification\":[],\"contact\":[],\"entityType\":\"AtlasGlossaryTerm\",\"id\":\"e09577ab-8d46-48af-b4b6-9476e2b5afb7\",\"label\":[],\"owner\":null,\"qualifiedName\":\"ExampleName2@Glossary\",\"term\":[]}]}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
