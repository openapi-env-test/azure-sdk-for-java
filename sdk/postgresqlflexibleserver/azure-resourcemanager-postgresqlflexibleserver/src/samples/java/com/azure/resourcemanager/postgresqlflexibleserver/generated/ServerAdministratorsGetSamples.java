// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.Context;

/** Samples for ServerAdministrators Get. */
public final class ServerAdministratorsGetSamples {
    /*
     * x-ms-original-file: specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/stable/2017-12-01/examples/ServerAdminGet.json
     */
    /**
     * Sample code: ServerAdministratorGet.
     *
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void serverAdministratorGet(
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        manager.serverAdministrators().getWithResponse("testrg", "pgtestsvc4", Context.NONE);
    }
}
