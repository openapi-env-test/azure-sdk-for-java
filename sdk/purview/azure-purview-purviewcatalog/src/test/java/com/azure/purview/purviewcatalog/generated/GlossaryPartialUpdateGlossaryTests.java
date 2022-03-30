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

public final class GlossaryPartialUpdateGlossaryTests extends PurviewCatalogServiceRestApiDocumentClientTestBase {
    @Test
    @Disabled
    public void testGlossaryPartialUpdateGlossaryTests() {
        BinaryData partialUpdates = BinaryData.fromString("{\"longDescription\":\"Example Long Description\"}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                glossaryClient.partialUpdateGlossaryWithResponse(
                        "c018ddaf-7c21-4b37-a838-dae5f110c3d8", partialUpdates, requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"name\":\"Glossary\",\"categories\":[{\"categoryGuid\":\"0d6766f6-f4b6-435b-bda2-d3edc358998e\",\"displayText\":\"ExampleCategory3\",\"parentCategoryGuid\":\"ed7458f0-9463-48a5-b5c6-4f785fb34e12\",\"relationGuid\":\"26a486a4-a8e2-483c-8a84-3b88e909f8d2\"},{\"categoryGuid\":\"ed7458f0-9463-48a5-b5c6-4f785fb34e12\",\"displayText\":\"ExampleCategory1\",\"parentCategoryGuid\":\"e47c4584-daca-4f9e-9092-194e04692c9a\",\"relationGuid\":\"7bdcef93-a57a-4d1d-95ab-9d3036f394a0\"},{\"categoryGuid\":\"e47c4584-daca-4f9e-9092-194e04692c9a\",\"displayText\":\"ExampleCategory2\",\"relationGuid\":\"94071e56-fd3e-4441-93ff-1834f818482d\"}],\"guid\":\"c018ddaf-7c21-4b37-a838-dae5f110c3d8\",\"lastModifiedTS\":\"3\",\"longDescription\":\"Example Long Description\",\"qualifiedName\":\"Glossary\",\"shortDescription\":\"Example Short Description\",\"terms\":[{\"displayText\":\"ExampleTerm1\",\"relationGuid\":\"7b6a8149-a928-476a-a068-dce58653cfa0\",\"termGuid\":\"54688d39-b298-4104-9e80-f2a16f44aaea\"},{\"displayText\":\"ExampleTerm2\",\"relationGuid\":\"9385640b-e6be-437d-a6b9-62d11c14a189\",\"termGuid\":\"952c7ba4-4c89-42d8-a05a-7d2161be7008\"}],\"usage\":\"Example Glossary\",\"language\":\"en\"}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
