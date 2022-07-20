// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

/** Samples for Databases CreateOrUpdate. */
public final class DatabasesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/stable/2017-12-01/examples/DatabaseCreate.json
     */
    /**
     * Sample code: DatabaseCreate.
     *
     * @param manager Entry point to MySqlManager.
     */
    public static void databaseCreate(com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        manager
            .databases()
            .define("db1")
            .withExistingServer("TestGroup", "testserver")
            .withCharset("utf8")
            .withCollation("utf8_general_ci")
            .create();
    }
}
