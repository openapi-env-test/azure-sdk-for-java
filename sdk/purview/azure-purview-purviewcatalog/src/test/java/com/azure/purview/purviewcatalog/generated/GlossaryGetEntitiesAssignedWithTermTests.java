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

public final class GlossaryGetEntitiesAssignedWithTermTests extends PurviewCatalogServiceRestApiDocumentClientTestBase {
    @Test
    @Disabled
    public void testGlossaryGetEntitiesAssignedWithTermTests() {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("limit", "-1");
        requestOptions.addQueryParam("offset", "0");
        requestOptions.addQueryParam("sort", "ASC");
        Response<BinaryData> response =
                glossaryClient.getEntitiesAssignedWithTermWithResponse(
                        "daf0ba4d-bc9a-4536-8a88-4b58e39dd3d4", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "[{\"displayText\":\"ExampleColumnName\",\"entityStatus\":\"ACTIVE\",\"guid\":\"ea116881-222e-41c8-8acb-9af6f6f60009\",\"relationshipAttributes\":{\"attributes\":{\"description\":null,\"confidence\":null,\"createdBy\":null,\"expression\":null,\"source\":null,\"status\":null,\"steward\":null},\"typeName\":\"AtlasGlossarySemanticAssignment\"},\"relationshipGuid\":\"ff9023a5-8495-49d6-bf04-a22c3634151e\",\"relationshipStatus\":\"ACTIVE\",\"relationshipType\":\"AtlasGlossarySemanticAssignment\",\"typeName\":\"column\"},{\"displayText\":\"exampledata.csv\",\"entityStatus\":\"ACTIVE\",\"guid\":\"fbf0a84d-7080-456b-b889-b5ba42186c2e\",\"relationshipAttributes\":{\"attributes\":{\"description\":null,\"confidence\":null,\"createdBy\":null,\"expression\":null,\"source\":null,\"status\":null,\"steward\":null},\"typeName\":\"AtlasGlossarySemanticAssignment\"},\"relationshipGuid\":\"dedc1294-a893-4e52-ba27-6be9b8694748\",\"relationshipStatus\":\"ACTIVE\",\"relationshipType\":\"AtlasGlossarySemanticAssignment\",\"typeName\":\"azure_blob_path\"}]")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
