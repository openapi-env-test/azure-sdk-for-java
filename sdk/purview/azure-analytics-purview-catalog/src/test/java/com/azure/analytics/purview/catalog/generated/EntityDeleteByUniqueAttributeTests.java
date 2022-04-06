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

public final class EntityDeleteByUniqueAttributeTests extends PurviewCatalogClientTestBase {
    @Test
    @Disabled
    public void testEntityDeleteByUniqueAttributeTests() {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("attr:qualifiedName", "https://exampleaccount.core.windows.net");
        Response<BinaryData> response =
                entityClient.deleteByUniqueAttributeWithResponse("azure_storage_account", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"mutatedEntities\":{\"DELETE\":[{\"attributes\":{\"name\":\"ExampleName\",\"createTime\":0,\"owner\":\"ExampleOwner\",\"qualifiedName\":\"https://exampleaccount.core.windows.net\"},\"classificationNames\":[],\"displayText\":\"Example Name\",\"guid\":\"e0ba3f20-f3b5-4d52-b769-ed35a02df60a\",\"lastModifiedTS\":\"1\",\"meaningNames\":[],\"meanings\":[],\"status\":\"ACTIVE\",\"typeName\":\"azure_storage_account\"}]}}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
