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

public final class EntityGetClassificationTests extends PurviewCatalogServiceRestApiDocumentClientTestBase {
    @Test
    @Disabled
    public void testEntityGetClassificationTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                entityClient.getClassificationWithResponse(
                        "9347abc5-7b86-4b82-a1e2-ad77c7c3cac3", "MICROSOFT.PERSONAL.DATE_OF_BIRTH", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"entityGuid\":\"9347abc5-7b86-4b82-a1e2-ad77c7c3cac3\",\"entityStatus\":\"ACTIVE\",\"lastModifiedTS\":\"1\",\"typeName\":\"MICROSOFT.PERSONAL.DATE_OF_BIRTH\"}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
