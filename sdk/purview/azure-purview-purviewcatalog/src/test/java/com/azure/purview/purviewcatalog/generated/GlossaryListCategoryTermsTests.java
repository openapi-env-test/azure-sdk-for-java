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

public final class GlossaryListCategoryTermsTests extends PurviewCatalogServiceRestApiDocumentClientTestBase {
    @Test
    @Disabled
    public void testGlossaryListCategoryTermsTests() {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("limit", "-1");
        requestOptions.addQueryParam("offset", "0");
        requestOptions.addQueryParam("sort", "ASC");
        Response<BinaryData> response =
                glossaryClient.listCategoryTermsWithResponse("ed7458f0-9463-48a5-b5c6-4f785fb34e12", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "[{\"displayText\":\"ExampleTerm1\",\"relationGuid\":\"6aebf5ac-0c83-40c0-98bf-958fe9c99007\",\"termGuid\":\"54688d39-b298-4104-9e80-f2a16f44aaea\"}]")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
