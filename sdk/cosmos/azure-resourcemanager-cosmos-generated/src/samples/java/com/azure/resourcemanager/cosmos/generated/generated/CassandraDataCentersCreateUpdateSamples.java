// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.resourcemanager.cosmos.generated.models.DataCenterResourceProperties;

/** Samples for CassandraDataCenters CreateUpdate. */
public final class CassandraDataCentersCreateUpdateSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-05-15-preview/examples/CosmosDBManagedCassandraDataCenterCreate.json
     */
    /**
     * Sample code: CosmosDBManagedCassandraDataCenterCreate.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBManagedCassandraDataCenterCreate(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .cassandraDataCenters()
            .define("dc1")
            .withExistingCassandraCluster("cassandra-prod-rg", "cassandra-prod")
            .withProperties(
                new DataCenterResourceProperties()
                    .withDataCenterLocation("West US 2")
                    .withDelegatedSubnetId(
                        "/subscriptions/536e130b-d7d6-4ac7-98a5-de20d69588d2/resourceGroups/customer-vnet-rg/providers/Microsoft.Network/virtualNetworks/customer-vnet/subnets/dc1-subnet")
                    .withNodeCount(9)
                    .withBase64EncodedCassandraYamlFragment(
                        "Y29tcGFjdGlvbl90aHJvdWdocHV0X21iX3Blcl9zZWM6IDMyCmNvbXBhY3Rpb25fbGFyZ2VfcGFydGl0aW9uX3dhcm5pbmdfdGhyZXNob2xkX21iOiAxMDA="))
            .create();
    }
}
