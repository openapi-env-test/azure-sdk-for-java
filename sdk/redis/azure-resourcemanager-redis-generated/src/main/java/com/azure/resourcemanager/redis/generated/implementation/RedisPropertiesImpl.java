// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated.implementation;

import com.azure.resourcemanager.redis.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.redis.generated.fluent.models.RedisAccessKeysInner;
import com.azure.resourcemanager.redis.generated.fluent.models.RedisPropertiesInner;
import com.azure.resourcemanager.redis.generated.models.PrivateEndpointConnection;
import com.azure.resourcemanager.redis.generated.models.ProvisioningState;
import com.azure.resourcemanager.redis.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.redis.generated.models.RedisAccessKeys;
import com.azure.resourcemanager.redis.generated.models.RedisCommonPropertiesRedisConfiguration;
import com.azure.resourcemanager.redis.generated.models.RedisInstanceDetails;
import com.azure.resourcemanager.redis.generated.models.RedisLinkedServer;
import com.azure.resourcemanager.redis.generated.models.RedisProperties;
import com.azure.resourcemanager.redis.generated.models.Sku;
import com.azure.resourcemanager.redis.generated.models.TlsVersion;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class RedisPropertiesImpl implements RedisProperties {
    private RedisPropertiesInner innerObject;

    private final com.azure.resourcemanager.redis.generated.RedisManager serviceManager;

    RedisPropertiesImpl(
        RedisPropertiesInner innerObject, com.azure.resourcemanager.redis.generated.RedisManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public RedisCommonPropertiesRedisConfiguration redisConfiguration() {
        return this.innerModel().redisConfiguration();
    }

    public String redisVersion() {
        return this.innerModel().redisVersion();
    }

    public Boolean enableNonSslPort() {
        return this.innerModel().enableNonSslPort();
    }

    public Integer replicasPerMaster() {
        return this.innerModel().replicasPerMaster();
    }

    public Integer replicasPerPrimary() {
        return this.innerModel().replicasPerPrimary();
    }

    public Map<String, String> tenantSettings() {
        Map<String, String> inner = this.innerModel().tenantSettings();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Integer shardCount() {
        return this.innerModel().shardCount();
    }

    public TlsVersion minimumTlsVersion() {
        return this.innerModel().minimumTlsVersion();
    }

    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public String subnetId() {
        return this.innerModel().subnetId();
    }

    public String staticIp() {
        return this.innerModel().staticIp();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String hostname() {
        return this.innerModel().hostname();
    }

    public Integer port() {
        return this.innerModel().port();
    }

    public Integer sslPort() {
        return this.innerModel().sslPort();
    }

    public RedisAccessKeys accessKeys() {
        RedisAccessKeysInner inner = this.innerModel().accessKeys();
        if (inner != null) {
            return new RedisAccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public List<RedisLinkedServer> linkedServers() {
        List<RedisLinkedServer> inner = this.innerModel().linkedServers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<RedisInstanceDetails> instances() {
        List<RedisInstanceDetails> inner = this.innerModel().instances();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnectionInner> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public RedisPropertiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.redis.generated.RedisManager manager() {
        return this.serviceManager;
    }
}
