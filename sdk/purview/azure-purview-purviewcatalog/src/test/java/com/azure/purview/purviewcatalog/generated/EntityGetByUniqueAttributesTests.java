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

public final class EntityGetByUniqueAttributesTests extends PurviewCatalogServiceRestApiDocumentClientTestBase {
    @Test
    @Disabled
    public void testEntityGetByUniqueAttributesTests() {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("attr:qualifiedName", "https://exampleaccount.core.windows.net");
        Response<BinaryData> response =
                entityClient.getByUniqueAttributesWithResponse("azure_storage_account", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"entity\":{\"attributes\":{\"name\":\"ExampleNewName\",\"createTime\":0,\"owner\":\"ExampleOwner\",\"qualifiedName\":\"https://exampleaccount.core.windows.net\"},\"createTime\":1605703532110,\"createdBy\":\"8c062c84-5d25-449f-a990-9d8ab70b8ec7\",\"guid\":\"e0ba3f20-f3b5-4d52-b769-ed35a02df60a\",\"lastModifiedTS\":\"2\",\"relationshipAttributes\":{\"meanings\":[],\"services\":[]},\"status\":\"ACTIVE\",\"typeName\":\"azure_storage_account\",\"updateTime\":1605703532110,\"updatedBy\":\"8c062c84-5d25-449f-a990-9d8ab70b8ec7\",\"version\":0},\"referredEntities\":{}}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
