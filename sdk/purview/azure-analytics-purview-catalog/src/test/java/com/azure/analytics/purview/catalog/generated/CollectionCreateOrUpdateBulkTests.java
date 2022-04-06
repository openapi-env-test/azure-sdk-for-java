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

public final class CollectionCreateOrUpdateBulkTests extends PurviewCatalogClientTestBase {
    @Test
    @Disabled
    public void testCollectionCreateOrUpdateBulkTests() {
        BinaryData entities =
                BinaryData.fromString(
                        "{\"entities\":[{\"attributes\":{\"name\":\"exampleaccount\",\"description\":\"Example Description\",\"qualifiedName\":\"exampleaccount\"},\"typeName\":\"azure_storage_account\"},{\"attributes\":{\"name\":\"exampleaccount2\",\"qualifiedName\":\"exampleaccount2\"},\"typeName\":\"azure_storage_account\"}],\"referredEntities\":{}}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                collectionClient.createOrUpdateBulkWithResponse("ExampleCollection", entities, requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"guidAssignments\":{\"-9514774903018192\":\"321493e3-3fb7-4b3e-9df7-3b69154174c2\",\"-9514774903018193\":\"b2f9c306-cf65-4bb0-878e-cfaafde156b1\"},\"mutatedEntities\":{\"CREATE\":[{\"attributes\":{\"qualifiedName\":\"exampleaccount2\"},\"guid\":\"321493e3-3fb7-4b3e-9df7-3b69154174c2\",\"lastModifiedTS\":\"1\",\"status\":\"ACTIVE\",\"typeName\":\"azure_storage_account\"}],\"UPDATE\":[{\"attributes\":{\"qualifiedName\":\"exampleaccount\"},\"guid\":\"b2f9c306-cf65-4bb0-878e-cfaafde156b1\",\"lastModifiedTS\":\"2\",\"status\":\"ACTIVE\",\"typeName\":\"azure_storage_account\"}]}}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
