// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.ElasticPoolDatabaseActivitiesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ElasticPoolDatabaseActivityInner;
import com.azure.resourcemanager.sql.generated.models.ElasticPoolDatabaseActivities;
import com.azure.resourcemanager.sql.generated.models.ElasticPoolDatabaseActivity;

public final class ElasticPoolDatabaseActivitiesImpl implements ElasticPoolDatabaseActivities {
    private static final ClientLogger LOGGER = new ClientLogger(ElasticPoolDatabaseActivitiesImpl.class);

    private final ElasticPoolDatabaseActivitiesClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public ElasticPoolDatabaseActivitiesImpl(
        ElasticPoolDatabaseActivitiesClient innerClient,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ElasticPoolDatabaseActivity> listByElasticPool(
        String resourceGroupName, String serverName, String elasticPoolName) {
        PagedIterable<ElasticPoolDatabaseActivityInner> inner =
            this.serviceClient().listByElasticPool(resourceGroupName, serverName, elasticPoolName);
        return Utils.mapPage(inner, inner1 -> new ElasticPoolDatabaseActivityImpl(inner1, this.manager()));
    }

    public PagedIterable<ElasticPoolDatabaseActivity> listByElasticPool(
        String resourceGroupName, String serverName, String elasticPoolName, Context context) {
        PagedIterable<ElasticPoolDatabaseActivityInner> inner =
            this.serviceClient().listByElasticPool(resourceGroupName, serverName, elasticPoolName, context);
        return Utils.mapPage(inner, inner1 -> new ElasticPoolDatabaseActivityImpl(inner1, this.manager()));
    }

    private ElasticPoolDatabaseActivitiesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
