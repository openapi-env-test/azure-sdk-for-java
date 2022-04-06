// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class EntityDeleteClassificationTests extends PurviewCatalogClientTestBase {
    @Test
    @Disabled
    public void testEntityDeleteClassificationTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<Void> response =
                entityClient.deleteClassificationWithResponse(
                        "cc0730ba-9b30-41f0-6953-559d17626d2b",
                        "MICROSOFT.FINANCIAL.US.ABA_ROUTING_NUMBER",
                        requestOptions);
        Assertions.assertEquals(204, response.getStatusCode());
    }
}
