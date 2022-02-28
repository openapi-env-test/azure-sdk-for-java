// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.purview.purviewcatalog.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.purview.purviewcatalog.TypesClient;
import com.azure.purview.purviewcatalog.TypesClientBuilder;

public class TypesUpdateAtlasTypeDefinitions {
    public static void main(String[] args) {
        TypesClient client = new TypesClientBuilder().endpoint("{Endpoint}").buildClient();
        BinaryData typesDef =
                BinaryData.fromString(
                        "{\"classificationDefs\":[],\"entityDefs\":[{\"name\":\"azure_sql_server\",\"attributeDefs\":[{\"name\":\"databases\",\"cardinality\":\"SET\",\"isIndexable\":false,\"isOptional\":true,\"isUnique\":false,\"typeName\":\"array<azure_sql_db>\"}],\"superTypes\":[\"azure_resource\"],\"typeVersion\":\"1.0\"},{\"name\":\"azure_sql_db\",\"attributeDefs\":[{\"name\":\"server\",\"cardinality\":\"SINGLE\",\"constraints\":[{\"type\":\"inverseRef\",\"params\":{\"attribute\":\"databases\"}}],\"isIndexable\":false,\"isOptional\":false,\"isUnique\":false,\"typeName\":\"azure_sql_server\"},{\"name\":\"schemas\",\"cardinality\":\"SET\",\"isIndexable\":false,\"isOptional\":true,\"isUnique\":false,\"typeName\":\"array<azure_sql_schema>\"},{\"name\":\"collation\",\"cardinality\":\"SINGLE\",\"isIndexable\":false,\"isOptional\":true,\"isUnique\":false,\"typeName\":\"string\"},{\"name\":\"compatibilityLevel\",\"cardinality\":\"SINGLE\",\"isIndexable\":false,\"isOptional\":true,\"isUnique\":false,\"typeName\":\"int\"}],\"superTypes\":[\"azure_resource\"],\"typeVersion\":\"1.0\"}],\"enumDefs\":[],\"relationshipDefs\":[{\"name\":\"azure_sql_server_databases\",\"endDef1\":{\"name\":\"databases\",\"type\":\"azure_sql_server\",\"cardinality\":\"SET\",\"isContainer\":true,\"isLegacyAttribute\":true},\"endDef2\":{\"name\":\"server\",\"type\":\"azure_sql_db\",\"cardinality\":\"SINGLE\",\"isContainer\":false,\"isLegacyAttribute\":true},\"relationshipCategory\":\"COMPOSITION\",\"typeVersion\":\"1.0\"},{\"name\":\"azure_sql_db_schemas\",\"endDef1\":{\"name\":\"schemas\",\"type\":\"azure_sql_db\",\"cardinality\":\"SET\",\"isContainer\":true,\"isLegacyAttribute\":true},\"endDef2\":{\"name\":\"db\",\"type\":\"azure_sql_schema\",\"cardinality\":\"SINGLE\",\"isContainer\":false,\"isLegacyAttribute\":true},\"relationshipCategory\":\"COMPOSITION\",\"typeVersion\":\"1.0\"}],\"structDefs\":[]}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = client.updateAtlasTypeDefinitionsWithResponse(typesDef, requestOptions);
    }
}
