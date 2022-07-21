// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.resourcemanager.sql.generated.models.ServerInfo;
import com.azure.resourcemanager.sql.generated.models.ServerTrustGroupPropertiesTrustScopesItem;
import java.util.Arrays;

/** Samples for ServerTrustGroups CreateOrUpdate. */
public final class ServerTrustGroupsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ServerTrustGroupCreate.json
     */
    /**
     * Sample code: Create server trust group.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void createServerTrustGroup(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .serverTrustGroups()
            .define("server-trust-group-test")
            .withExistingLocation("Default", "Japan East")
            .withGroupMembers(
                Arrays
                    .asList(
                        new ServerInfo()
                            .withServerId(
                                "/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default/providers/Microsoft.Sql/managedInstances/managedInstance-1"),
                        new ServerInfo()
                            .withServerId(
                                "/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default/providers/Microsoft.Sql/managedInstances/managedInstance-2")))
            .withTrustScopes(
                Arrays
                    .asList(
                        ServerTrustGroupPropertiesTrustScopesItem.GLOBAL_TRANSACTIONS,
                        ServerTrustGroupPropertiesTrustScopesItem.SERVICE_BROKER))
            .create();
    }
}
