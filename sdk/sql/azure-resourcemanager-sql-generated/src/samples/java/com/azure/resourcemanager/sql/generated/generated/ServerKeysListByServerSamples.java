// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for ServerKeys ListByServer. */
public final class ServerKeysListByServerSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ServerKeyList.json
     */
    /**
     * Sample code: List the server keys by server.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void listTheServerKeysByServer(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.serverKeys().listByServer("sqlcrudtest-7398", "sqlcrudtest-4645", Context.NONE);
    }
}
