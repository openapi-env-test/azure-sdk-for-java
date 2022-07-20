// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.redis.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.redis.generated.models.RedisCommonProperties;
import com.azure.resourcemanager.redis.generated.models.RedisCommonPropertiesRedisConfiguration;
import com.azure.resourcemanager.redis.generated.models.Sku;
import com.azure.resourcemanager.redis.generated.models.TlsVersion;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Patchable properties of the redis cache. */
@Fluent
public final class RedisUpdateProperties extends RedisCommonProperties {
    /*
     * The SKU of the Redis cache to deploy.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Get the sku property: The SKU of the Redis cache to deploy.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU of the Redis cache to deploy.
     *
     * @param sku the sku value to set.
     * @return the RedisUpdateProperties object itself.
     */
    public RedisUpdateProperties withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RedisUpdateProperties withRedisConfiguration(RedisCommonPropertiesRedisConfiguration redisConfiguration) {
        super.withRedisConfiguration(redisConfiguration);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RedisUpdateProperties withRedisVersion(String redisVersion) {
        super.withRedisVersion(redisVersion);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RedisUpdateProperties withEnableNonSslPort(Boolean enableNonSslPort) {
        super.withEnableNonSslPort(enableNonSslPort);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RedisUpdateProperties withReplicasPerMaster(Integer replicasPerMaster) {
        super.withReplicasPerMaster(replicasPerMaster);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RedisUpdateProperties withReplicasPerPrimary(Integer replicasPerPrimary) {
        super.withReplicasPerPrimary(replicasPerPrimary);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RedisUpdateProperties withTenantSettings(Map<String, String> tenantSettings) {
        super.withTenantSettings(tenantSettings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RedisUpdateProperties withShardCount(Integer shardCount) {
        super.withShardCount(shardCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RedisUpdateProperties withMinimumTlsVersion(TlsVersion minimumTlsVersion) {
        super.withMinimumTlsVersion(minimumTlsVersion);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RedisUpdateProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        super.withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (sku() != null) {
            sku().validate();
        }
    }
}
