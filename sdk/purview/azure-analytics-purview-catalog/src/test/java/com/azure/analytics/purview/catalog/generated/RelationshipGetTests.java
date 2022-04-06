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

public final class RelationshipGetTests extends PurviewCatalogClientTestBase {
    @Test
    @Disabled
    public void testRelationshipGetTests() {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("extendedInfo", "false");
        Response<BinaryData> response =
                relationshipClient.getWithResponse("5cf8a9e5-c9fd-abe0-2e8c-d40024263dcb", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"relationship\":{\"attributes\":{\"description\":null,\"expression\":null,\"source\":null,\"status\":null,\"steward\":null},\"createTime\":1553838993803,\"createdBy\":\"ExampleCreator\",\"end1\":{\"guid\":\"856d31e6-e342-a1ce-6273-22ddb77029c6\",\"typeName\":\"AtlasGlossaryTerm\"},\"end2\":{\"guid\":\"b0942506-2d7d-1f45-d286-c29ca9e7f2ef\",\"typeName\":\"AtlasGlossaryTerm\"},\"guid\":\"de23cd5a-021c-413d-98a5-98752a1f7a3b\",\"label\":\"r:AtlasGlossarySynonym\",\"status\":\"ACTIVE\",\"typeName\":\"AtlasGlossarySynonym\",\"updateTime\":1553838993803,\"updatedBy\":\"ExampleUpdator\",\"version\":0}}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
