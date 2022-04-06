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

public final class GlossaryListTermsByGlossaryNameTests extends PurviewCatalogClientTestBase {
    @Test
    @Disabled
    public void testGlossaryListTermsByGlossaryNameTests() {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("limit", "10");
        requestOptions.addQueryParam("offset", "0");
        Response<BinaryData> response = glossaryClient.listTermsByGlossaryNameWithResponse("Glossary", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "[{\"name\":\"ExampleTerm1\",\"createTime\":1608002832463,\"guid\":\"daf0ba4d-bc9a-4536-8a88-4b58e39dd3d4\",\"longDescription\":\"Example Long Description\",\"qualifiedName\":\"ExampleTerm1@Glossary\",\"shortDescription\":null,\"status\":\"Approved\",\"templateName\":[],\"updateTime\":1608002832463},{\"name\":\"ExampleTerm2\",\"createTime\":1608002832463,\"guid\":\"21b82aa6-483b-43ff-a484-71d34aa34bbc\",\"longDescription\":\"Example Long Description\",\"qualifiedName\":\"ExampleTerm2@Glossary\",\"shortDescription\":null,\"status\":\"Approved\",\"templateName\":[],\"updateTime\":1608002832463},{\"name\":\"ExampleTerm3\",\"createTime\":1608002832463,\"guid\":\"02785962-e01e-425b-8698-5194e116130f\",\"longDescription\":\"Example Long Description\",\"qualifiedName\":\"ExampleTerm3@Glossary\",\"shortDescription\":null,\"status\":\"Approved\",\"templateName\":[],\"updateTime\":1608002832463}]")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
