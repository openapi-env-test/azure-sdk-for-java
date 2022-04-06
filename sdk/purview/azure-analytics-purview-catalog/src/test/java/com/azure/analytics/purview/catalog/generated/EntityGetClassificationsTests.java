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

public final class EntityGetClassificationsTests extends PurviewCatalogClientTestBase {
    @Test
    @Disabled
    public void testEntityGetClassificationsTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                entityClient.getClassificationsWithResponse("67d26de6-771d-1a2d-cb2b-dec4dbd2a9bd", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"list\":[{\"entityGuid\":\"67d26de6-771d-1a2d-cb2b-dec4dbd2a9bd\",\"typeName\":\"MICROSOFT.FINANCIAL.US.ABA_ROUTING_NUMBER\"}],\"pageSize\":1,\"sortType\":\"NONE\",\"startIndex\":0,\"totalCount\":1}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
