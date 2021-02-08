// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.ElasticPoolInner;
import com.azure.resourcemanager.sql.generated.models.ElasticPool;
import com.azure.resourcemanager.sql.generated.models.ElasticPoolLicenseType;
import com.azure.resourcemanager.sql.generated.models.ElasticPoolPerDatabaseSettings;
import com.azure.resourcemanager.sql.generated.models.ElasticPoolState;
import com.azure.resourcemanager.sql.generated.models.ElasticPoolUpdate;
import com.azure.resourcemanager.sql.generated.models.Sku;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class ElasticPoolImpl implements ElasticPool, ElasticPool.Definition, ElasticPool.Update {
    private ElasticPoolInner innerObject;

    private final SqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public ElasticPoolState state() {
        return this.innerModel().state();
    }

    public OffsetDateTime creationDate() {
        return this.innerModel().creationDate();
    }

    public Long maxSizeBytes() {
        return this.innerModel().maxSizeBytes();
    }

    public ElasticPoolPerDatabaseSettings perDatabaseSettings() {
        return this.innerModel().perDatabaseSettings();
    }

    public Boolean zoneRedundant() {
        return this.innerModel().zoneRedundant();
    }

    public ElasticPoolLicenseType licenseType() {
        return this.innerModel().licenseType();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ElasticPoolInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String elasticPoolName;

    private ElasticPoolUpdate updateParameters;

    public ElasticPoolImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    public ElasticPool create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getElasticPools()
                .createOrUpdate(resourceGroupName, serverName, elasticPoolName, this.innerModel(), Context.NONE);
        return this;
    }

    public ElasticPool create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getElasticPools()
                .createOrUpdate(resourceGroupName, serverName, elasticPoolName, this.innerModel(), context);
        return this;
    }

    ElasticPoolImpl(String name, SqlManager serviceManager) {
        this.innerObject = new ElasticPoolInner();
        this.serviceManager = serviceManager;
        this.elasticPoolName = name;
    }

    public ElasticPoolImpl update() {
        this.updateParameters = new ElasticPoolUpdate();
        return this;
    }

    public ElasticPool apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getElasticPools()
                .update(resourceGroupName, serverName, elasticPoolName, updateParameters, Context.NONE);
        return this;
    }

    public ElasticPool apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getElasticPools()
                .update(resourceGroupName, serverName, elasticPoolName, updateParameters, context);
        return this;
    }

    ElasticPoolImpl(ElasticPoolInner innerObject, SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.elasticPoolName = Utils.getValueFromIdByName(innerObject.id(), "elasticPools");
    }

    public ElasticPool refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getElasticPools()
                .getWithResponse(resourceGroupName, serverName, elasticPoolName, Context.NONE)
                .getValue();
        return this;
    }

    public ElasticPool refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getElasticPools()
                .getWithResponse(resourceGroupName, serverName, elasticPoolName, context)
                .getValue();
        return this;
    }

    public void failover() {
        serviceManager.elasticPools().failover(resourceGroupName, serverName, elasticPoolName);
    }

    public void failover(Context context) {
        serviceManager.elasticPools().failover(resourceGroupName, serverName, elasticPoolName, context);
    }

    public ElasticPoolImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ElasticPoolImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ElasticPoolImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ElasticPoolImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateParameters.withSku(sku);
            return this;
        }
    }

    public ElasticPoolImpl withMaxSizeBytes(Long maxSizeBytes) {
        if (isInCreateMode()) {
            this.innerModel().withMaxSizeBytes(maxSizeBytes);
            return this;
        } else {
            this.updateParameters.withMaxSizeBytes(maxSizeBytes);
            return this;
        }
    }

    public ElasticPoolImpl withPerDatabaseSettings(ElasticPoolPerDatabaseSettings perDatabaseSettings) {
        if (isInCreateMode()) {
            this.innerModel().withPerDatabaseSettings(perDatabaseSettings);
            return this;
        } else {
            this.updateParameters.withPerDatabaseSettings(perDatabaseSettings);
            return this;
        }
    }

    public ElasticPoolImpl withZoneRedundant(Boolean zoneRedundant) {
        if (isInCreateMode()) {
            this.innerModel().withZoneRedundant(zoneRedundant);
            return this;
        } else {
            this.updateParameters.withZoneRedundant(zoneRedundant);
            return this;
        }
    }

    public ElasticPoolImpl withLicenseType(ElasticPoolLicenseType licenseType) {
        if (isInCreateMode()) {
            this.innerModel().withLicenseType(licenseType);
            return this;
        } else {
            this.updateParameters.withLicenseType(licenseType);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
