// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.scanning;

import com.azure.analytics.purview.scanning.implementation.DataSourcesImpl;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

/** Initializes a new instance of the synchronous PurviewScanningClient type. */
@ServiceClient(builder = DataSourcesClientBuilder.class)
public final class DataSourcesClient {
    @Generated private final DataSourcesImpl serviceClient;

    /**
     * Initializes an instance of DataSources client.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    DataSourcesClient(DataSourcesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Creates or Updates a data source.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     name: String
     *     scans: [
     *         {
     *             id: String
     *             name: String
     *             scanResults: [
     *                 {
     *                     parentId: String
     *                     id: String
     *                     resourceId: String
     *                     status: String
     *                     assetsDiscovered: Long
     *                     assetsClassified: Long
     *                     diagnostics: {
     *                         notifications: [
     *                             {
     *                                 message: String
     *                                 code: Integer
     *                             }
     *                         ]
     *                         exceptionCountMap: {
     *                             String: int
     *                         }
     *                     }
     *                     startTime: String
     *                     queuedTime: String
     *                     pipelineStartTime: String
     *                     endTime: String
     *                     scanRulesetVersion: Integer
     *                     scanRulesetType: String(Custom/System)
     *                     scanLevelType: String(Full/Incremental)
     *                     errorMessage: String
     *                     error: {
     *                         code: String
     *                         message: String
     *                         target: String
     *                         details: [
     *                             {
     *                                 code: String
     *                                 message: String
     *                                 target: String
     *                                 details: [
     *                                     (recursive schema, see above)
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     runType: String
     *                     dataSourceType: String(None/AzureSubscription/AzureResourceGroup/AzureSynapseWorkspace/AzureSynapse/AdlsGen1/AdlsGen2/AmazonAccount/AmazonS3/AmazonSql/AzureCosmosDb/AzureDataExplorer/AzureFileService/AzureSqlDatabase/AmazonPostgreSql/AzurePostgreSql/SqlServerDatabase/AzureSqlDatabaseManagedInstance/AzureSqlDataWarehouse/AzureMySql/AzureStorage/Teradata/Oracle/SapS4Hana/SapEcc/PowerBI)
     *                 }
     *             ]
     *         }
     *     ]
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     name: String
     *     scans: [
     *         {
     *             id: String
     *             name: String
     *             scanResults: [
     *                 {
     *                     parentId: String
     *                     id: String
     *                     resourceId: String
     *                     status: String
     *                     assetsDiscovered: Long
     *                     assetsClassified: Long
     *                     diagnostics: {
     *                         notifications: [
     *                             {
     *                                 message: String
     *                                 code: Integer
     *                             }
     *                         ]
     *                         exceptionCountMap: {
     *                             String: int
     *                         }
     *                     }
     *                     startTime: String
     *                     queuedTime: String
     *                     pipelineStartTime: String
     *                     endTime: String
     *                     scanRulesetVersion: Integer
     *                     scanRulesetType: String(Custom/System)
     *                     scanLevelType: String(Full/Incremental)
     *                     errorMessage: String
     *                     error: {
     *                         code: String
     *                         message: String
     *                         target: String
     *                         details: [
     *                             {
     *                                 code: String
     *                                 message: String
     *                                 target: String
     *                                 details: [
     *                                     (recursive schema, see above)
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     runType: String
     *                     dataSourceType: String(None/AzureSubscription/AzureResourceGroup/AzureSynapseWorkspace/AzureSynapse/AdlsGen1/AdlsGen2/AmazonAccount/AmazonS3/AmazonSql/AzureCosmosDb/AzureDataExplorer/AzureFileService/AzureSqlDatabase/AmazonPostgreSql/AzurePostgreSql/SqlServerDatabase/AzureSqlDatabaseManagedInstance/AzureSqlDataWarehouse/AzureMySql/AzureStorage/Teradata/Oracle/SapS4Hana/SapEcc/PowerBI)
     *                 }
     *             ]
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param dataSourceName The dataSourceName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateWithResponse(String dataSourceName, RequestOptions requestOptions) {
        return this.serviceClient.createOrUpdateWithResponse(dataSourceName, requestOptions);
    }

    /**
     * Get a data source.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     name: String
     *     scans: [
     *         {
     *             id: String
     *             name: String
     *             scanResults: [
     *                 {
     *                     parentId: String
     *                     id: String
     *                     resourceId: String
     *                     status: String
     *                     assetsDiscovered: Long
     *                     assetsClassified: Long
     *                     diagnostics: {
     *                         notifications: [
     *                             {
     *                                 message: String
     *                                 code: Integer
     *                             }
     *                         ]
     *                         exceptionCountMap: {
     *                             String: int
     *                         }
     *                     }
     *                     startTime: String
     *                     queuedTime: String
     *                     pipelineStartTime: String
     *                     endTime: String
     *                     scanRulesetVersion: Integer
     *                     scanRulesetType: String(Custom/System)
     *                     scanLevelType: String(Full/Incremental)
     *                     errorMessage: String
     *                     error: {
     *                         code: String
     *                         message: String
     *                         target: String
     *                         details: [
     *                             {
     *                                 code: String
     *                                 message: String
     *                                 target: String
     *                                 details: [
     *                                     (recursive schema, see above)
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     runType: String
     *                     dataSourceType: String(None/AzureSubscription/AzureResourceGroup/AzureSynapseWorkspace/AzureSynapse/AdlsGen1/AdlsGen2/AmazonAccount/AmazonS3/AmazonSql/AzureCosmosDb/AzureDataExplorer/AzureFileService/AzureSqlDatabase/AmazonPostgreSql/AzurePostgreSql/SqlServerDatabase/AzureSqlDatabaseManagedInstance/AzureSqlDataWarehouse/AzureMySql/AzureStorage/Teradata/Oracle/SapS4Hana/SapEcc/PowerBI)
     *                 }
     *             ]
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param dataSourceName The dataSourceName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return a data source along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(String dataSourceName, RequestOptions requestOptions) {
        return this.serviceClient.getWithResponse(dataSourceName, requestOptions);
    }

    /**
     * Deletes a data source.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     name: String
     *     scans: [
     *         {
     *             id: String
     *             name: String
     *             scanResults: [
     *                 {
     *                     parentId: String
     *                     id: String
     *                     resourceId: String
     *                     status: String
     *                     assetsDiscovered: Long
     *                     assetsClassified: Long
     *                     diagnostics: {
     *                         notifications: [
     *                             {
     *                                 message: String
     *                                 code: Integer
     *                             }
     *                         ]
     *                         exceptionCountMap: {
     *                             String: int
     *                         }
     *                     }
     *                     startTime: String
     *                     queuedTime: String
     *                     pipelineStartTime: String
     *                     endTime: String
     *                     scanRulesetVersion: Integer
     *                     scanRulesetType: String(Custom/System)
     *                     scanLevelType: String(Full/Incremental)
     *                     errorMessage: String
     *                     error: {
     *                         code: String
     *                         message: String
     *                         target: String
     *                         details: [
     *                             {
     *                                 code: String
     *                                 message: String
     *                                 target: String
     *                                 details: [
     *                                     (recursive schema, see above)
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     runType: String
     *                     dataSourceType: String(None/AzureSubscription/AzureResourceGroup/AzureSynapseWorkspace/AzureSynapse/AdlsGen1/AdlsGen2/AmazonAccount/AmazonS3/AmazonSql/AzureCosmosDb/AzureDataExplorer/AzureFileService/AzureSqlDatabase/AmazonPostgreSql/AzurePostgreSql/SqlServerDatabase/AzureSqlDatabaseManagedInstance/AzureSqlDataWarehouse/AzureMySql/AzureStorage/Teradata/Oracle/SapS4Hana/SapEcc/PowerBI)
     *                 }
     *             ]
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param dataSourceName The dataSourceName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> deleteWithResponse(String dataSourceName, RequestOptions requestOptions) {
        return this.serviceClient.deleteWithResponse(dataSourceName, requestOptions);
    }

    /**
     * List data sources in Data catalog.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             id: String
     *             name: String
     *             scans: [
     *                 {
     *                     id: String
     *                     name: String
     *                     scanResults: [
     *                         {
     *                             parentId: String
     *                             id: String
     *                             resourceId: String
     *                             status: String
     *                             assetsDiscovered: Long
     *                             assetsClassified: Long
     *                             diagnostics: {
     *                                 notifications: [
     *                                     {
     *                                         message: String
     *                                         code: Integer
     *                                     }
     *                                 ]
     *                                 exceptionCountMap: {
     *                                     String: int
     *                                 }
     *                             }
     *                             startTime: String
     *                             queuedTime: String
     *                             pipelineStartTime: String
     *                             endTime: String
     *                             scanRulesetVersion: Integer
     *                             scanRulesetType: String(Custom/System)
     *                             scanLevelType: String(Full/Incremental)
     *                             errorMessage: String
     *                             error: {
     *                                 code: String
     *                                 message: String
     *                                 target: String
     *                                 details: [
     *                                     {
     *                                         code: String
     *                                         message: String
     *                                         target: String
     *                                         details: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                     }
     *                                 ]
     *                             }
     *                             runType: String
     *                             dataSourceType: String(None/AzureSubscription/AzureResourceGroup/AzureSynapseWorkspace/AzureSynapse/AdlsGen1/AdlsGen2/AmazonAccount/AmazonS3/AmazonSql/AzureCosmosDb/AzureDataExplorer/AzureFileService/AzureSqlDatabase/AmazonPostgreSql/AzurePostgreSql/SqlServerDatabase/AzureSqlDatabaseManagedInstance/AzureSqlDataWarehouse/AzureMySql/AzureStorage/Teradata/Oracle/SapS4Hana/SapEcc/PowerBI)
     *                         }
     *                     ]
     *                 }
     *             ]
     *         }
     *     ]
     *     nextLink: String
     *     count: Long
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return the paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listAll(RequestOptions requestOptions) {
        return this.serviceClient.listAll(requestOptions);
    }
}
