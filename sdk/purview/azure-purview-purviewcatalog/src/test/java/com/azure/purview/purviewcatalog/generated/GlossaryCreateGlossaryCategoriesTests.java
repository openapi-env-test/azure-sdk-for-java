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

public final class GlossaryCreateGlossaryCategoriesTests extends PurviewCatalogServiceRestApiDocumentClientTestBase {
    @Test
    @Disabled
    public void testGlossaryCreateGlossaryCategoriesTests() {
        BinaryData glossaryCategory =
                BinaryData.fromString(
                        "[{\"name\":\"ExampleCategory2\",\"anchor\":{\"glossaryGuid\":\"c018ddaf-7c21-4b37-a838-dae5f110c3d8\"}},{\"name\":\"ExampleCategory3\",\"anchor\":{\"glossaryGuid\":\"c018ddaf-7c21-4b37-a838-dae5f110c3d8\"}}]");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                glossaryClient.createGlossaryCategoriesWithResponse(glossaryCategory, requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "[{\"name\":\"ExampleCategory2\",\"anchor\":{\"glossaryGuid\":\"c018ddaf-7c21-4b37-a838-dae5f110c3d8\",\"relationGuid\":\"94071e56-fd3e-4441-93ff-1834f818482d\"},\"guid\":\"e47c4584-daca-4f9e-9092-194e04692c9a\",\"lastModifiedTS\":\"1\",\"qualifiedName\":\"ExampleCategory2@Glossary\"},{\"name\":\"ExampleCategory3\",\"anchor\":{\"glossaryGuid\":\"c018ddaf-7c21-4b37-a838-dae5f110c3d8\",\"relationGuid\":\"26a486a4-a8e2-483c-8a84-3b88e909f8d2\"},\"guid\":\"0d6766f6-f4b6-435b-bda2-d3edc358998e\",\"lastModifiedTS\":\"1\",\"qualifiedName\":\"ExampleCategory3@Glossary\"}]")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
