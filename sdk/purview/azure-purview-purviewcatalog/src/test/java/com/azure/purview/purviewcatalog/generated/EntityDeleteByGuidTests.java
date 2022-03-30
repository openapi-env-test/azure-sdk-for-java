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

public final class EntityDeleteByGuidTests extends PurviewCatalogServiceRestApiDocumentClientTestBase {
    @Test
    @Disabled
    public void testEntityDeleteByGuidTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                entityClient.deleteByGuidWithResponse("fd279eb4-f6c3-1b0b-ad67-e4f8abd2972f", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"mutatedEntities\":{\"DELETE\":[{\"attributes\":{\"name\":\"ExampleStorageAaccount\",\"owner\":\"ExampleOwner\",\"qualifiedName\":\"https://exampleaccount.core.windows.net\"},\"guid\":\"fd279eb4-f6c3-1b0b-ad67-e4f8abd2972f\",\"lastModifiedTS\":\"2\",\"status\":\"ACTIVE\",\"typeName\":\"azure_storage_account\"}]}}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
