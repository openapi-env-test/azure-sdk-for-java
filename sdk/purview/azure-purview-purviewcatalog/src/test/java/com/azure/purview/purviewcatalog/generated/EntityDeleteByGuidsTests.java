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

public final class EntityDeleteByGuidsTests extends PurviewCatalogServiceRestApiDocumentClientTestBase {
    @Test
    @Disabled
    public void testEntityDeleteByGuidsTests() {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("guid", "18e06957-e265-967a-07f1-e14e2ab8940f");
        requestOptions.addQueryParam("guid", "cc0730ba-9b30-41f0-6953-559d17626d2b");
        Response<BinaryData> response = entityClient.deleteByGuidsWithResponse(requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"mutatedEntities\":{\"DELETE\":[{\"attributes\":{\"qualifiedName\":\"https://exampleaccount.blob.core.windows.net/examplecontainer\"},\"guid\":\"18e06957-e265-967a-07f1-e14e2ab8940f\",\"status\":\"ACTIVE\",\"typeName\":\"azure_blob_container\"},{\"attributes\":{\"qualifiedName\":\"https://exampleaccount.blob.core.windows.net/examplecontainer2\"},\"guid\":\"cc0730ba-9b30-41f0-6953-559d17626d2b\",\"status\":\"ACTIVE\",\"typeName\":\"azure_blob_container\"}]}}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
