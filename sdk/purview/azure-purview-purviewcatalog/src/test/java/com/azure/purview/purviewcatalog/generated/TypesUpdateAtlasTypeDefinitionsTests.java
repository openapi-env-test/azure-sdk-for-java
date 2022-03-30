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

public final class TypesUpdateAtlasTypeDefinitionsTests extends PurviewCatalogServiceRestApiDocumentClientTestBase {
    @Test
    @Disabled
    public void testTypesUpdateAtlasTypeDefinitionsTests() {
        BinaryData typesDef =
                BinaryData.fromString(
                        "{\"classificationDefs\":[],\"entityDefs\":[{\"name\":\"azure_sql_server\",\"attributeDefs\":[{\"name\":\"databases\",\"cardinality\":\"SET\",\"isIndexable\":false,\"isOptional\":true,\"isUnique\":false,\"typeName\":\"array<azure_sql_db>\"}],\"superTypes\":[\"azure_resource\"],\"typeVersion\":\"1.0\"},{\"name\":\"azure_sql_db\",\"attributeDefs\":[{\"name\":\"server\",\"cardinality\":\"SINGLE\",\"constraints\":[{\"type\":\"inverseRef\",\"params\":{\"attribute\":\"databases\"}}],\"isIndexable\":false,\"isOptional\":false,\"isUnique\":false,\"typeName\":\"azure_sql_server\"},{\"name\":\"schemas\",\"cardinality\":\"SET\",\"isIndexable\":false,\"isOptional\":true,\"isUnique\":false,\"typeName\":\"array<azure_sql_schema>\"},{\"name\":\"collation\",\"cardinality\":\"SINGLE\",\"isIndexable\":false,\"isOptional\":true,\"isUnique\":false,\"typeName\":\"string\"},{\"name\":\"compatibilityLevel\",\"cardinality\":\"SINGLE\",\"isIndexable\":false,\"isOptional\":true,\"isUnique\":false,\"typeName\":\"int\"}],\"superTypes\":[\"azure_resource\"],\"typeVersion\":\"1.0\"}],\"enumDefs\":[],\"relationshipDefs\":[{\"name\":\"azure_sql_server_databases\",\"endDef1\":{\"name\":\"databases\",\"type\":\"azure_sql_server\",\"cardinality\":\"SET\",\"isContainer\":true,\"isLegacyAttribute\":true},\"endDef2\":{\"name\":\"server\",\"type\":\"azure_sql_db\",\"cardinality\":\"SINGLE\",\"isContainer\":false,\"isLegacyAttribute\":true},\"relationshipCategory\":\"COMPOSITION\",\"typeVersion\":\"1.0\"},{\"name\":\"azure_sql_db_schemas\",\"endDef1\":{\"name\":\"schemas\",\"type\":\"azure_sql_db\",\"cardinality\":\"SET\",\"isContainer\":true,\"isLegacyAttribute\":true},\"endDef2\":{\"name\":\"db\",\"type\":\"azure_sql_schema\",\"cardinality\":\"SINGLE\",\"isContainer\":false,\"isLegacyAttribute\":true},\"relationshipCategory\":\"COMPOSITION\",\"typeVersion\":\"1.0\"}],\"structDefs\":[]}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = typesClient.updateAtlasTypeDefinitionsWithResponse(typesDef, requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"classificationDefs\":[],\"entityDefs\":[{\"name\":\"azure_sql_server\",\"description\":\"azure_sql_server\",\"attributeDefs\":[{\"name\":\"databases\",\"cardinality\":\"SET\",\"includeInNotification\":false,\"isIndexable\":false,\"isOptional\":true,\"isUnique\":false,\"typeName\":\"array<azure_sql_db>\",\"valuesMaxCount\":2147483647,\"valuesMinCount\":0}],\"category\":\"ENTITY\",\"createTime\":1548841689501,\"createdBy\":\"ExampleCreator\",\"guid\":\"a59fe369-2b1d-4bba-bb74-c273f3d74eb1\",\"subTypes\":[],\"superTypes\":[\"azure_resource\"],\"typeVersion\":\"1.0\",\"updateTime\":1553671448662,\"updatedBy\":\"ExampleUpdator\",\"version\":3},{\"name\":\"azure_sql_db\",\"description\":\"azure_sql_db\",\"attributeDefs\":[{\"name\":\"server\",\"cardinality\":\"SINGLE\",\"constraints\":[{\"type\":\"inverseRef\",\"params\":{\"attribute\":\"databases\"}}],\"includeInNotification\":false,\"isIndexable\":false,\"isOptional\":false,\"isUnique\":false,\"typeName\":\"azure_sql_server\",\"valuesMaxCount\":1,\"valuesMinCount\":1},{\"name\":\"schemas\",\"cardinality\":\"SET\",\"includeInNotification\":false,\"isIndexable\":false,\"isOptional\":true,\"isUnique\":false,\"typeName\":\"array<azure_sql_schema>\",\"valuesMaxCount\":2147483647,\"valuesMinCount\":0},{\"name\":\"collation\",\"cardinality\":\"SINGLE\",\"includeInNotification\":false,\"isIndexable\":false,\"isOptional\":true,\"isUnique\":false,\"typeName\":\"string\",\"valuesMaxCount\":1,\"valuesMinCount\":0},{\"name\":\"compatibilityLevel\",\"cardinality\":\"SINGLE\",\"includeInNotification\":false,\"isIndexable\":false,\"isOptional\":true,\"isUnique\":false,\"typeName\":\"int\",\"valuesMaxCount\":1,\"valuesMinCount\":0}],\"category\":\"ENTITY\",\"createTime\":1548841689575,\"createdBy\":\"ExampleCreator\",\"guid\":\"cc33ec5a-205a-4853-91dd-c0ebd0049ffb\",\"subTypes\":[],\"superTypes\":[\"azure_resource\"],\"typeVersion\":\"1.0\",\"updateTime\":1553671448783,\"updatedBy\":\"ExampleUpdator\",\"version\":3}],\"enumDefs\":[],\"relationshipDefs\":[{\"name\":\"azure_sql_server_databases\",\"description\":\"azure_sql_server_databases\",\"attributeDefs\":[],\"category\":\"RELATIONSHIP\",\"createTime\":1548841689879,\"createdBy\":\"ExampleCreator\",\"endDef1\":{\"name\":\"databases\",\"type\":\"azure_sql_server\",\"cardinality\":\"SET\",\"isContainer\":true,\"isLegacyAttribute\":true},\"endDef2\":{\"name\":\"server\",\"type\":\"azure_sql_db\",\"cardinality\":\"SINGLE\",\"isContainer\":false,\"isLegacyAttribute\":true},\"guid\":\"1e0584a8-2587-4e1d-a772-db1e879469af\",\"relationshipCategory\":\"COMPOSITION\",\"relationshipLabel\":\"r:azure_sql_server_databases\",\"typeVersion\":\"1.0\",\"updateTime\":1553671449536,\"updatedBy\":\"ExampleUpdator\",\"version\":3},{\"name\":\"azure_sql_db_schemas\",\"description\":\"azure_sql_db_schemas\",\"attributeDefs\":[],\"category\":\"RELATIONSHIP\",\"createTime\":1548841690094,\"createdBy\":\"ExampleCreator\",\"endDef1\":{\"name\":\"schemas\",\"type\":\"azure_sql_db\",\"cardinality\":\"SET\",\"isContainer\":true,\"isLegacyAttribute\":true},\"endDef2\":{\"name\":\"db\",\"type\":\"azure_sql_schema\",\"cardinality\":\"SINGLE\",\"isContainer\":false,\"isLegacyAttribute\":true},\"guid\":\"77ee34f6-ea48-4fe3-86bf-7e2e722f4596\",\"relationshipCategory\":\"COMPOSITION\",\"relationshipLabel\":\"r:azure_sql_db_schemas\",\"typeVersion\":\"1.0\",\"updateTime\":1553671449545,\"updatedBy\":\"ExampleUpdator\",\"version\":3}],\"structDefs\":[]}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
