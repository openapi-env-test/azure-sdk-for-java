// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.QueryStatisticsInner;
import com.azure.resourcemanager.sql.generated.models.QueryMetricInterval;
import com.azure.resourcemanager.sql.generated.models.QueryStatistics;
import java.util.Collections;
import java.util.List;

public final class QueryStatisticsImpl implements QueryStatistics {
    private QueryStatisticsInner innerObject;

    private final SqlManager serviceManager;

    QueryStatisticsImpl(QueryStatisticsInner innerObject, SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String databaseName() {
        return this.innerModel().databaseName();
    }

    public String queryId() {
        return this.innerModel().queryId();
    }

    public String startTime() {
        return this.innerModel().startTime();
    }

    public String endTime() {
        return this.innerModel().endTime();
    }

    public List<QueryMetricInterval> intervals() {
        List<QueryMetricInterval> inner = this.innerModel().intervals();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public QueryStatisticsInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }
}
