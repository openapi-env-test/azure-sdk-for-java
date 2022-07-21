// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.redis.generated.fluent.models.RedisUpdateProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Parameters supplied to the Update Redis operation. */
@Fluent
public final class RedisUpdateParameters {
    /*
     * Redis cache properties.
     */
    @JsonProperty(value = "properties")
    private RedisUpdateProperties innerProperties;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /**
     * Get the innerProperties property: Redis cache properties.
     *
     * @return the innerProperties value.
     */
    private RedisUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the RedisUpdateParameters object itself.
     */
    public RedisUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity property: The identity of the resource.
     *
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the resource.
     *
     * @param identity the identity value to set.
     * @return the RedisUpdateParameters object itself.
     */
    public RedisUpdateParameters withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the sku property: The SKU of the Redis cache to deploy.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.innerProperties() == null ? null : this.innerProperties().sku();
    }

    /**
     * Set the sku property: The SKU of the Redis cache to deploy.
     *
     * @param sku the sku value to set.
     * @return the RedisUpdateParameters object itself.
     */
    public RedisUpdateParameters withSku(Sku sku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisUpdateProperties();
        }
        this.innerProperties().withSku(sku);
        return this;
    }

    /**
     * Get the redisConfiguration property: All Redis Settings. Few possible keys:
     * rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value
     * etc.
     *
     * @return the redisConfiguration value.
     */
    public RedisCommonPropertiesRedisConfiguration redisConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().redisConfiguration();
    }

    /**
     * Set the redisConfiguration property: All Redis Settings. Few possible keys:
     * rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value
     * etc.
     *
     * @param redisConfiguration the redisConfiguration value to set.
     * @return the RedisUpdateParameters object itself.
     */
    public RedisUpdateParameters withRedisConfiguration(RedisCommonPropertiesRedisConfiguration redisConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisUpdateProperties();
        }
        this.innerProperties().withRedisConfiguration(redisConfiguration);
        return this;
    }

    /**
     * Get the redisVersion property: Redis version. This should be in the form 'major[.minor]' (only 'major' is
     * required) or the value 'latest' which refers to the latest stable Redis version that is available. Supported
     * versions: 4.0, 6.0 (latest). Default value is 'latest'.
     *
     * @return the redisVersion value.
     */
    public String redisVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().redisVersion();
    }

    /**
     * Set the redisVersion property: Redis version. This should be in the form 'major[.minor]' (only 'major' is
     * required) or the value 'latest' which refers to the latest stable Redis version that is available. Supported
     * versions: 4.0, 6.0 (latest). Default value is 'latest'.
     *
     * @param redisVersion the redisVersion value to set.
     * @return the RedisUpdateParameters object itself.
     */
    public RedisUpdateParameters withRedisVersion(String redisVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisUpdateProperties();
        }
        this.innerProperties().withRedisVersion(redisVersion);
        return this;
    }

    /**
     * Get the enableNonSslPort property: Specifies whether the non-ssl Redis server port (6379) is enabled.
     *
     * @return the enableNonSslPort value.
     */
    public Boolean enableNonSslPort() {
        return this.innerProperties() == null ? null : this.innerProperties().enableNonSslPort();
    }

    /**
     * Set the enableNonSslPort property: Specifies whether the non-ssl Redis server port (6379) is enabled.
     *
     * @param enableNonSslPort the enableNonSslPort value to set.
     * @return the RedisUpdateParameters object itself.
     */
    public RedisUpdateParameters withEnableNonSslPort(Boolean enableNonSslPort) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisUpdateProperties();
        }
        this.innerProperties().withEnableNonSslPort(enableNonSslPort);
        return this;
    }

    /**
     * Get the replicasPerMaster property: The number of replicas to be created per primary.
     *
     * @return the replicasPerMaster value.
     */
    public Integer replicasPerMaster() {
        return this.innerProperties() == null ? null : this.innerProperties().replicasPerMaster();
    }

    /**
     * Set the replicasPerMaster property: The number of replicas to be created per primary.
     *
     * @param replicasPerMaster the replicasPerMaster value to set.
     * @return the RedisUpdateParameters object itself.
     */
    public RedisUpdateParameters withReplicasPerMaster(Integer replicasPerMaster) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisUpdateProperties();
        }
        this.innerProperties().withReplicasPerMaster(replicasPerMaster);
        return this;
    }

    /**
     * Get the replicasPerPrimary property: The number of replicas to be created per primary.
     *
     * @return the replicasPerPrimary value.
     */
    public Integer replicasPerPrimary() {
        return this.innerProperties() == null ? null : this.innerProperties().replicasPerPrimary();
    }

    /**
     * Set the replicasPerPrimary property: The number of replicas to be created per primary.
     *
     * @param replicasPerPrimary the replicasPerPrimary value to set.
     * @return the RedisUpdateParameters object itself.
     */
    public RedisUpdateParameters withReplicasPerPrimary(Integer replicasPerPrimary) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisUpdateProperties();
        }
        this.innerProperties().withReplicasPerPrimary(replicasPerPrimary);
        return this;
    }

    /**
     * Get the tenantSettings property: A dictionary of tenant settings.
     *
     * @return the tenantSettings value.
     */
    public Map<String, String> tenantSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantSettings();
    }

    /**
     * Set the tenantSettings property: A dictionary of tenant settings.
     *
     * @param tenantSettings the tenantSettings value to set.
     * @return the RedisUpdateParameters object itself.
     */
    public RedisUpdateParameters withTenantSettings(Map<String, String> tenantSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisUpdateProperties();
        }
        this.innerProperties().withTenantSettings(tenantSettings);
        return this;
    }

    /**
     * Get the shardCount property: The number of shards to be created on a Premium Cluster Cache.
     *
     * @return the shardCount value.
     */
    public Integer shardCount() {
        return this.innerProperties() == null ? null : this.innerProperties().shardCount();
    }

    /**
     * Set the shardCount property: The number of shards to be created on a Premium Cluster Cache.
     *
     * @param shardCount the shardCount value to set.
     * @return the RedisUpdateParameters object itself.
     */
    public RedisUpdateParameters withShardCount(Integer shardCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisUpdateProperties();
        }
        this.innerProperties().withShardCount(shardCount);
        return this;
    }

    /**
     * Get the minimumTlsVersion property: Optional: requires clients to use a specified TLS version (or higher) to
     * connect (e,g, '1.0', '1.1', '1.2').
     *
     * @return the minimumTlsVersion value.
     */
    public TlsVersion minimumTlsVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().minimumTlsVersion();
    }

    /**
     * Set the minimumTlsVersion property: Optional: requires clients to use a specified TLS version (or higher) to
     * connect (e,g, '1.0', '1.1', '1.2').
     *
     * @param minimumTlsVersion the minimumTlsVersion value to set.
     * @return the RedisUpdateParameters object itself.
     */
    public RedisUpdateParameters withMinimumTlsVersion(TlsVersion minimumTlsVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisUpdateProperties();
        }
        this.innerProperties().withMinimumTlsVersion(minimumTlsVersion);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether or not public endpoint access is allowed for this cache. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'. If 'Disabled', private endpoints are the exclusive
     * access method. Default value is 'Enabled'.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Whether or not public endpoint access is allowed for this cache. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'. If 'Disabled', private endpoints are the exclusive
     * access method. Default value is 'Enabled'.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the RedisUpdateParameters object itself.
     */
    public RedisUpdateParameters withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisUpdateProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
