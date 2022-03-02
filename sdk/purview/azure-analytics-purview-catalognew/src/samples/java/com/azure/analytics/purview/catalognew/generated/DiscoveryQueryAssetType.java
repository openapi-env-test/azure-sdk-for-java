// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalognew.generated;

import com.azure.analytics.purview.catalognew.DiscoveryClient;
import com.azure.analytics.purview.catalognew.DiscoveryClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

public class DiscoveryQueryAssetType {
    public static void main(String[] args) {
        DiscoveryClient client = new DiscoveryClientBuilder().endpoint("{Endpoint}").buildClient();
        BinaryData searchRequest =
                BinaryData.fromString(
                        "{\"filter\":{\"or\":[{\"assetType\":\"SQL Server\"},{\"assetType\":\"Azure SQL Server\"},{\"assetType\":\"Azure SQL Database\"},{\"assetType\":\"Azure SQL Data Warehouse\"},{\"assetType\":\"Azure SQL Managed Instance\"},{\"assetType\":\"Azure Storage Account\"},{\"assetType\":\"Azure Blob Storage\"},{\"assetType\":\"Azure Files\"},{\"assetType\":\"Azure Table Storage\"},{\"assetType\":\"Azure Data Lake Storage Gen1\"},{\"assetType\":\"Azure Data Lake Storage Gen2\"},{\"assetType\":\"Azure Cosmos DB\"},{\"assetType\":\"Azure Data Factory\"},{\"assetType\":\"Azure Cognitive Search\"},{\"assetType\":\"Power BI\"},{\"assetType\":\"Azure Data Explorer\"},{\"assetType\":\"Amazon S3\"},{\"assetType\":\"Azure Data Share\"},{\"assetType\":\"Teradata\"},{\"assetType\":\"SAP S4HANA\"},{\"assetType\":\"SAP ECC\"},{\"assetType\":\"SQL Server Integration Services\"},{\"assetType\":\"hive\"},{\"assetType\":\"Azure Database for MySQL\"},{\"assetType\":\"Azure Database for MariaDB\"},{\"assetType\":\"Azure Database for PostgreSQL\"},{\"assetType\":\"Azure Synapse Analytics\"}]},\"keywords\":null,\"limit\":10}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = client.queryWithResponse(searchRequest, requestOptions);
    }
}
