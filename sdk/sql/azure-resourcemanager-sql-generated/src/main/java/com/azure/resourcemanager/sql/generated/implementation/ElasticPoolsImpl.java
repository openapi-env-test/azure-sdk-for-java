// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.ElasticPoolsClient;
import com.azure.resourcemanager.sql.generated.models.ElasticPools;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ElasticPoolsImpl implements ElasticPools {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ElasticPoolsImpl.class);

    private final ElasticPoolsClient innerClient;

    private final SqlManager serviceManager;

    public ElasticPoolsImpl(ElasticPoolsClient innerClient, SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void failover(String resourceGroupName, String serverName, String elasticPoolName) {
        this.serviceClient().failover(resourceGroupName, serverName, elasticPoolName);
    }

    public void failover(String resourceGroupName, String serverName, String elasticPoolName, Context context) {
        this.serviceClient().failover(resourceGroupName, serverName, elasticPoolName, context);
    }

    private ElasticPoolsClient serviceClient() {
        return this.innerClient;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }
}
