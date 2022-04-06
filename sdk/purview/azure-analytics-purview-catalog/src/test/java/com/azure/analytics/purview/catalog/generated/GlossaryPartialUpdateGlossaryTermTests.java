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

public final class GlossaryPartialUpdateGlossaryTermTests extends PurviewCatalogClientTestBase {
    @Test
    @Disabled
    public void testGlossaryPartialUpdateGlossaryTermTests() {
        BinaryData partialUpdates = BinaryData.fromString("{\"longDescription\":\"Example Long Descrition\"}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                glossaryClient.partialUpdateGlossaryTermWithResponse(
                        "54688d39-b298-4104-9e80-f2a16f44aaea", partialUpdates, requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"name\":\"ExampleTerm1\",\"abbreviation\":\"T1\",\"anchor\":{\"glossaryGuid\":\"c018ddaf-7c21-4b37-a838-dae5f110c3d8\",\"relationGuid\":\"7b6a8149-a928-476a-a068-dce58653cfa0\"},\"categories\":[{\"categoryGuid\":\"ed7458f0-9463-48a5-b5c6-4f785fb34e12\",\"displayText\":\"ExampleCategory1\",\"relationGuid\":\"6aebf5ac-0c83-40c0-98bf-958fe9c99007\"}],\"createTime\":1606287247276,\"createdBy\":\"23863cef-a2e9-40a3-a427-44dc0d201f61\",\"guid\":\"54688d39-b298-4104-9e80-f2a16f44aaea\",\"lastModifiedTS\":\"2\",\"longDescription\":\"Example Long Descrition\",\"qualifiedName\":\"ExampleTerm1@Glossary\",\"resources\":[{\"displayName\":\"Example Display Name\",\"url\":\"Example Url\"}],\"seeAlso\":[{\"displayText\":\"ExampleTerm2\",\"relationGuid\":\"dfa44030-bd14-4111-a0f1-3d01c964eb01\",\"termGuid\":\"952c7ba4-4c89-42d8-a05a-7d2161be7008\"}],\"shortDescription\":\"Example Short Description\",\"status\":\"Approved\",\"synonyms\":[{\"displayText\":\"ExampleTerm2\",\"relationGuid\":\"15bcbd12-eb48-4b63-8ff5-74f7ec3a562c\",\"termGuid\":\"952c7ba4-4c89-42d8-a05a-7d2161be7008\"}],\"updateTime\":1606290587593,\"updatedBy\":\"23863cef-a2e9-40a3-a427-44dc0d201f61\"}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
