// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.models.PhysicalPartitionThroughputInfoResource;
import com.azure.resourcemanager.cosmos.generated.models.RedistributeThroughputParameters;
import com.azure.resourcemanager.cosmos.generated.models.RedistributeThroughputPropertiesResource;
import com.azure.resourcemanager.cosmos.generated.models.ThroughputPolicyType;
import java.util.Arrays;

/** Samples for SqlResources SqlContainerRedistributeThroughput. */
public final class SqlResourcesSqlContainerRedistributeThroughputSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2022-07-15-preview/examples/CosmosDBSqlContainerRedistributeThroughput.json
     */
    /**
     * Sample code: CosmosDBSqlContainerRedistributeThroughput.
     *
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBSqlContainerRedistributeThroughput(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager
            .sqlResources()
            .sqlContainerRedistributeThroughput(
                "rg1",
                "ddb1",
                "databaseName",
                "containerName",
                new RedistributeThroughputParameters()
                    .withResource(
                        new RedistributeThroughputPropertiesResource()
                            .withThroughputPolicy(ThroughputPolicyType.CUSTOM)
                            .withTargetPhysicalPartitionThroughputInfo(
                                Arrays
                                    .asList(
                                        new PhysicalPartitionThroughputInfoResource()
                                            .withId("0")
                                            .withThroughput(5000.0),
                                        new PhysicalPartitionThroughputInfoResource()
                                            .withId("1")
                                            .withThroughput(5000.0)))
                            .withSourcePhysicalPartitionThroughputInfo(
                                Arrays
                                    .asList(
                                        new PhysicalPartitionThroughputInfoResource()
                                            .withId("2")
                                            .withThroughput(5000.0),
                                        new PhysicalPartitionThroughputInfoResource().withId("3")))),
                Context.NONE);
    }
}
