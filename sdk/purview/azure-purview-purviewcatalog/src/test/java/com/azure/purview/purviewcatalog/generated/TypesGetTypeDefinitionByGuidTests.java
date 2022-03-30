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

public final class TypesGetTypeDefinitionByGuidTests extends PurviewCatalogServiceRestApiDocumentClientTestBase {
    @Test
    @Disabled
    public void testTypesGetTypeDefinitionByGuidTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                typesClient.getTypeDefinitionByGuidWithResponse("0ddc2fcf-ad17-4d06-984a-ffb2ffb2a941", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"name\":\"glossary_term_status_value\",\"description\":\"glossary_term_status_value\",\"category\":\"ENUM\",\"createTime\":1604728877305,\"createdBy\":\"ExampleCreator\",\"elementDefs\":[{\"ordinal\":0,\"value\":\"Approved\"},{\"ordinal\":1,\"value\":\"Alert\"},{\"ordinal\":2,\"value\":\"Expired\"},{\"ordinal\":3,\"value\":\"Draft\"}],\"guid\":\"0ddc2fcf-ad17-4d06-984a-ffb2ffb2a941\",\"lastModifiedTS\":\"1\",\"typeVersion\":\"1.0\",\"updateTime\":1604728877305,\"updatedBy\":\"ExampleUpdator\",\"version\":1}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
