// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;

/** Samples for SqlResources GetClientEncryptionKey. */
public final class SqlResourcesGetClientEncryptionKeySamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-07-15-preview/examples/CosmosDBSqlClientEncryptionKeyGet.json
     */
    /**
     * Sample code: CosmosDBClientEncryptionKeyGet.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBClientEncryptionKeyGet(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .sqlResources()
            .getClientEncryptionKeyWithResponse("rgName", "accountName", "databaseName", "cekName", Context.NONE);
    }
}
