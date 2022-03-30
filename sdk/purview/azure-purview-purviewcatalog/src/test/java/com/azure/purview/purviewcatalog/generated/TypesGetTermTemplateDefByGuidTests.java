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

public final class TypesGetTermTemplateDefByGuidTests extends PurviewCatalogServiceRestApiDocumentClientTestBase {
    @Test
    @Disabled
    public void testTypesGetTermTemplateDefByGuidTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                typesClient.getTermTemplateDefByGuidWithResponse(
                        "d776af9c-985c-4168-abb2-477523dbfc70", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"name\":\"MS KPI\",\"description\":\"This is the description\",\"attributeDefs\":[{\"name\":\"date\",\"cardinality\":\"SINGLE\",\"includeInNotification\":false,\"isIndexable\":false,\"isOptional\":true,\"isUnique\":false,\"options\":{\"isDisabled\":\"false\"},\"typeName\":\"date\",\"valuesMaxCount\":1,\"valuesMinCount\":0},{\"name\":\"single choice\",\"cardinality\":\"SINGLE\",\"includeInNotification\":false,\"isIndexable\":false,\"isOptional\":true,\"isUnique\":false,\"options\":{\"isDisabled\":\"false\"},\"typeName\":\"TERM_TEMPLATE_ENUM_EXAMPLE_1\",\"valuesMaxCount\":1,\"valuesMinCount\":0},{\"name\":\"multi choice\",\"cardinality\":\"SET\",\"includeInNotification\":false,\"isIndexable\":false,\"isOptional\":true,\"isUnique\":false,\"options\":{\"isDisabled\":\"false\"},\"typeName\":\"array<TERM_TEMPLATE_ENUM_EXAMPLE_2>\",\"valuesMaxCount\":2147483647,\"valuesMinCount\":0},{\"name\":\"plain string\",\"cardinality\":\"SINGLE\",\"defaultValue\":\"this is a default value\",\"includeInNotification\":false,\"isIndexable\":false,\"isOptional\":true,\"isUnique\":false,\"options\":{\"isDisabled\":\"false\"},\"typeName\":\"string\",\"valuesMaxCount\":1,\"valuesMinCount\":0}],\"category\":\"TERM_TEMPLATE\",\"createTime\":1606300465443,\"createdBy\":\"ExampleCreator\",\"guid\":\"d776af9c-985c-4168-abb2-477523dbfc70\",\"lastModifiedTS\":\"1\",\"typeVersion\":\"1.0\",\"updateTime\":1606300465443,\"updatedBy\":\"ExampleUpdator\",\"version\":1}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
