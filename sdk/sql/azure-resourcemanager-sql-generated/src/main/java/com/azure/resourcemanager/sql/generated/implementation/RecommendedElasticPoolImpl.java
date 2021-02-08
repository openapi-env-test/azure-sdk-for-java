// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.DatabaseInner;
import com.azure.resourcemanager.sql.generated.fluent.models.RecommendedElasticPoolInner;
import com.azure.resourcemanager.sql.generated.fluent.models.RecommendedElasticPoolMetricInner;
import com.azure.resourcemanager.sql.generated.models.Database;
import com.azure.resourcemanager.sql.generated.models.ElasticPoolEdition;
import com.azure.resourcemanager.sql.generated.models.RecommendedElasticPool;
import com.azure.resourcemanager.sql.generated.models.RecommendedElasticPoolMetric;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class RecommendedElasticPoolImpl implements RecommendedElasticPool {
    private RecommendedElasticPoolInner innerObject;

    private final SqlManager serviceManager;

    RecommendedElasticPoolImpl(RecommendedElasticPoolInner innerObject, SqlManager serviceManager) {
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

    public ElasticPoolEdition databaseEdition() {
        return this.innerModel().databaseEdition();
    }

    public Double dtu() {
        return this.innerModel().dtu();
    }

    public Double databaseDtuMin() {
        return this.innerModel().databaseDtuMin();
    }

    public Double databaseDtuMax() {
        return this.innerModel().databaseDtuMax();
    }

    public Double storageMB() {
        return this.innerModel().storageMB();
    }

    public OffsetDateTime observationPeriodStart() {
        return this.innerModel().observationPeriodStart();
    }

    public OffsetDateTime observationPeriodEnd() {
        return this.innerModel().observationPeriodEnd();
    }

    public Double maxObservedDtu() {
        return this.innerModel().maxObservedDtu();
    }

    public Double maxObservedStorageMB() {
        return this.innerModel().maxObservedStorageMB();
    }

    public List<Database> databases() {
        List<DatabaseInner> inner = this.innerModel().databases();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new DatabaseImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<RecommendedElasticPoolMetric> metrics() {
        List<RecommendedElasticPoolMetricInner> inner = this.innerModel().metrics();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new RecommendedElasticPoolMetricImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public RecommendedElasticPoolInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }
}
