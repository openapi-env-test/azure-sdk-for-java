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

public final class TypesGetEntityDefinitionByGuidTests extends PurviewCatalogClientTestBase {
    @Test
    @Disabled
    public void testTypesGetEntityDefinitionByGuidTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                typesClient.getEntityDefinitionByGuidWithResponse(
                        "4bc54c37-98a8-4de8-9ee8-182610859d43", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"name\":\"DataSet\",\"description\":\"DataSet\",\"attributeDefs\":[],\"category\":\"ENTITY\",\"createTime\":1553065960959,\"createdBy\":\"ExampleCreator\",\"guid\":\"4bc54c37-98a8-4de8-9ee8-182610859d43\",\"subTypes\":[\"rdbms_foreign_key\",\"azure_datalake_gen1_path\",\"hive_table\",\"mssql_column\",\"sqoop_dbdatastore\",\"hbase_column\",\"azure_sql_table\",\"rdbms_instance\",\"azure_datalake_gen2_path\",\"jms_topic\",\"falcon_feed\",\"hbase_table\",\"rdbms_table\",\"rdbms_column\",\"hbase_column_family\",\"hive_column\",\"azure_blob_container\",\"rdbms_db\",\"column\",\"azure_blob_path\",\"kafka_topic\",\"tabular_schema\",\"azure_datalake_gen2_filesystem\",\"rdbms_index\",\"azure_sql_column\",\"mssql_table\",\"avro_type\",\"fs_path\"],\"superTypes\":[\"Asset\"],\"typeVersion\":\"1.1\",\"updateTime\":1553065960959,\"updatedBy\":\"ExampleUpdator\",\"version\":1}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
