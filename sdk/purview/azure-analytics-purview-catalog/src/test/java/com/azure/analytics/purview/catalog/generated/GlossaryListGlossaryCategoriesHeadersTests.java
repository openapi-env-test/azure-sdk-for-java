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

public final class GlossaryListGlossaryCategoriesHeadersTests extends PurviewCatalogClientTestBase {
    @Test
    @Disabled
    public void testGlossaryListGlossaryCategoriesHeadersTests() {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("limit", "-1");
        requestOptions.addQueryParam("offset", "0");
        requestOptions.addQueryParam("sort", "ASC");
        Response<BinaryData> response =
                glossaryClient.listGlossaryCategoriesHeadersWithResponse(
                        "c018ddaf-7c21-4b37-a838-dae5f110c3d8", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "[{\"categoryGuid\":\"ed7458f0-9463-48a5-b5c6-4f785fb34e12\",\"displayText\":\"ExampleCategory1\",\"parentCategoryGuid\":\"e47c4584-daca-4f9e-9092-194e04692c9a\",\"relationGuid\":\"7bdcef93-a57a-4d1d-95ab-9d3036f394a0\"},{\"categoryGuid\":\"e47c4584-daca-4f9e-9092-194e04692c9a\",\"displayText\":\"ExampleCategory2\",\"relationGuid\":\"94071e56-fd3e-4441-93ff-1834f818482d\"},{\"categoryGuid\":\"0d6766f6-f4b6-435b-bda2-d3edc358998e\",\"displayText\":\"ExampleCategory3\",\"parentCategoryGuid\":\"ed7458f0-9463-48a5-b5c6-4f785fb34e12\",\"relationGuid\":\"26a486a4-a8e2-483c-8a84-3b88e909f8d2\"}]")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
