// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.redis.generated.models.ManagedServiceIdentity;
import com.azure.resourcemanager.redis.generated.models.ProvisioningState;
import com.azure.resourcemanager.redis.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.redis.generated.models.RedisCommonPropertiesRedisConfiguration;
import com.azure.resourcemanager.redis.generated.models.RedisInstanceDetails;
import com.azure.resourcemanager.redis.generated.models.RedisLinkedServer;
import com.azure.resourcemanager.redis.generated.models.Sku;
import com.azure.resourcemanager.redis.generated.models.TlsVersion;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** A single Redis item in List or Get Operation. */
@Fluent
public final class RedisResourceInner extends Resource {
    /*
     * Redis cache properties.
     */
    @JsonProperty(value = "properties", required = true)
    private RedisPropertiesInner innerProperties = new RedisPropertiesInner();

    /*
     * A list of availability zones denoting where the resource needs to come
     * from.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

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
    private RedisPropertiesInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the zones property: A list of availability zones denoting where the resource needs to come from.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: A list of availability zones denoting where the resource needs to come from.
     *
     * @param zones the zones value to set.
     * @return the RedisResourceInner object itself.
     */
    public RedisResourceInner withZones(List<String> zones) {
        this.zones = zones;
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
     * @return the RedisResourceInner object itself.
     */
    public RedisResourceInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RedisResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RedisResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: Redis instance provisioning status.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the hostname property: Redis host name.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.innerProperties() == null ? null : this.innerProperties().hostname();
    }

    /**
     * Get the port property: Redis non-SSL port.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.innerProperties() == null ? null : this.innerProperties().port();
    }

    /**
     * Get the sslPort property: Redis SSL port.
     *
     * @return the sslPort value.
     */
    public Integer sslPort() {
        return this.innerProperties() == null ? null : this.innerProperties().sslPort();
    }

    /**
     * Get the accessKeys property: The keys of the Redis cache - not set if this object is not the response to Create
     * or Update redis cache.
     *
     * @return the accessKeys value.
     */
    public RedisAccessKeysInner accessKeys() {
        return this.innerProperties() == null ? null : this.innerProperties().accessKeys();
    }

    /**
     * Get the linkedServers property: List of the linked servers associated with the cache.
     *
     * @return the linkedServers value.
     */
    public List<RedisLinkedServer> linkedServers() {
        return this.innerProperties() == null ? null : this.innerProperties().linkedServers();
    }

    /**
     * Get the instances property: List of the Redis instances associated with the cache.
     *
     * @return the instances value.
     */
    public List<RedisInstanceDetails> instances() {
        return this.innerProperties() == null ? null : this.innerProperties().instances();
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connection associated with the specified
     * redis cache.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointConnections();
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
     * @return the RedisResourceInner object itself.
     */
    public RedisResourceInner withSku(Sku sku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisPropertiesInner();
        }
        this.innerProperties().withSku(sku);
        return this;
    }

    /**
     * Get the subnetId property: The full resource ID of a subnet in a virtual network to deploy the Redis cache in.
     * Example format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.innerProperties() == null ? null : this.innerProperties().subnetId();
    }

    /**
     * Set the subnetId property: The full resource ID of a subnet in a virtual network to deploy the Redis cache in.
     * Example format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1.
     *
     * @param subnetId the subnetId value to set.
     * @return the RedisResourceInner object itself.
     */
    public RedisResourceInner withSubnetId(String subnetId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisPropertiesInner();
        }
        this.innerProperties().withSubnetId(subnetId);
        return this;
    }

    /**
     * Get the staticIp property: Static IP address. Optionally, may be specified when deploying a Redis cache inside an
     * existing Azure Virtual Network; auto assigned by default.
     *
     * @return the staticIp value.
     */
    public String staticIp() {
        return this.innerProperties() == null ? null : this.innerProperties().staticIp();
    }

    /**
     * Set the staticIp property: Static IP address. Optionally, may be specified when deploying a Redis cache inside an
     * existing Azure Virtual Network; auto assigned by default.
     *
     * @param staticIp the staticIp value to set.
     * @return the RedisResourceInner object itself.
     */
    public RedisResourceInner withStaticIp(String staticIp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisPropertiesInner();
        }
        this.innerProperties().withStaticIp(staticIp);
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
     * @return the RedisResourceInner object itself.
     */
    public RedisResourceInner withRedisConfiguration(RedisCommonPropertiesRedisConfiguration redisConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisPropertiesInner();
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
     * @return the RedisResourceInner object itself.
     */
    public RedisResourceInner withRedisVersion(String redisVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisPropertiesInner();
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
     * @return the RedisResourceInner object itself.
     */
    public RedisResourceInner withEnableNonSslPort(Boolean enableNonSslPort) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisPropertiesInner();
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
     * @return the RedisResourceInner object itself.
     */
    public RedisResourceInner withReplicasPerMaster(Integer replicasPerMaster) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisPropertiesInner();
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
     * @return the RedisResourceInner object itself.
     */
    public RedisResourceInner withReplicasPerPrimary(Integer replicasPerPrimary) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisPropertiesInner();
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
     * @return the RedisResourceInner object itself.
     */
    public RedisResourceInner withTenantSettings(Map<String, String> tenantSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisPropertiesInner();
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
     * @return the RedisResourceInner object itself.
     */
    public RedisResourceInner withShardCount(Integer shardCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisPropertiesInner();
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
     * @return the RedisResourceInner object itself.
     */
    public RedisResourceInner withMinimumTlsVersion(TlsVersion minimumTlsVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisPropertiesInner();
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
     * @return the RedisResourceInner object itself.
     */
    public RedisResourceInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisPropertiesInner();
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
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model RedisResourceInner"));
        } else {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RedisResourceInner.class);
}
