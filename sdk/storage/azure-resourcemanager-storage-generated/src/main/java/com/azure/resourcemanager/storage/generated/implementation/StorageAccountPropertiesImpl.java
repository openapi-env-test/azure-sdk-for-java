// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.resourcemanager.storage.generated.fluent.models.BlobRestoreStatusInner;
import com.azure.resourcemanager.storage.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.storage.generated.fluent.models.StorageAccountPropertiesInner;
import com.azure.resourcemanager.storage.generated.models.AccessTier;
import com.azure.resourcemanager.storage.generated.models.AccountStatus;
import com.azure.resourcemanager.storage.generated.models.AllowedCopyScope;
import com.azure.resourcemanager.storage.generated.models.AzureFilesIdentityBasedAuthentication;
import com.azure.resourcemanager.storage.generated.models.BlobRestoreStatus;
import com.azure.resourcemanager.storage.generated.models.CustomDomain;
import com.azure.resourcemanager.storage.generated.models.DnsEndpointType;
import com.azure.resourcemanager.storage.generated.models.Encryption;
import com.azure.resourcemanager.storage.generated.models.Endpoints;
import com.azure.resourcemanager.storage.generated.models.GeoReplicationStats;
import com.azure.resourcemanager.storage.generated.models.ImmutableStorageAccount;
import com.azure.resourcemanager.storage.generated.models.KeyCreationTime;
import com.azure.resourcemanager.storage.generated.models.KeyPolicy;
import com.azure.resourcemanager.storage.generated.models.LargeFileSharesState;
import com.azure.resourcemanager.storage.generated.models.MinimumTlsVersion;
import com.azure.resourcemanager.storage.generated.models.NetworkRuleSet;
import com.azure.resourcemanager.storage.generated.models.PrivateEndpointConnection;
import com.azure.resourcemanager.storage.generated.models.ProvisioningState;
import com.azure.resourcemanager.storage.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.storage.generated.models.RoutingPreference;
import com.azure.resourcemanager.storage.generated.models.SasPolicy;
import com.azure.resourcemanager.storage.generated.models.StorageAccountProperties;
import com.azure.resourcemanager.storage.generated.models.StorageAccountSkuConversionStatus;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class StorageAccountPropertiesImpl implements StorageAccountProperties {
    private StorageAccountPropertiesInner innerObject;

    private final com.azure.resourcemanager.storage.generated.StorageManager serviceManager;

    StorageAccountPropertiesImpl(
        StorageAccountPropertiesInner innerObject,
        com.azure.resourcemanager.storage.generated.StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Endpoints primaryEndpoints() {
        return this.innerModel().primaryEndpoints();
    }

    public String primaryLocation() {
        return this.innerModel().primaryLocation();
    }

    public AccountStatus statusOfPrimary() {
        return this.innerModel().statusOfPrimary();
    }

    public OffsetDateTime lastGeoFailoverTime() {
        return this.innerModel().lastGeoFailoverTime();
    }

    public String secondaryLocation() {
        return this.innerModel().secondaryLocation();
    }

    public AccountStatus statusOfSecondary() {
        return this.innerModel().statusOfSecondary();
    }

    public OffsetDateTime creationTime() {
        return this.innerModel().creationTime();
    }

    public CustomDomain customDomain() {
        return this.innerModel().customDomain();
    }

    public SasPolicy sasPolicy() {
        return this.innerModel().sasPolicy();
    }

    public KeyPolicy keyPolicy() {
        return this.innerModel().keyPolicy();
    }

    public KeyCreationTime keyCreationTime() {
        return this.innerModel().keyCreationTime();
    }

    public Endpoints secondaryEndpoints() {
        return this.innerModel().secondaryEndpoints();
    }

    public Encryption encryption() {
        return this.innerModel().encryption();
    }

    public AccessTier accessTier() {
        return this.innerModel().accessTier();
    }

    public AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication() {
        return this.innerModel().azureFilesIdentityBasedAuthentication();
    }

    public Boolean enableHttpsTrafficOnly() {
        return this.innerModel().enableHttpsTrafficOnly();
    }

    public NetworkRuleSet networkRuleSet() {
        return this.innerModel().networkRuleSet();
    }

    public Boolean isSftpEnabled() {
        return this.innerModel().isSftpEnabled();
    }

    public Boolean isLocalUserEnabled() {
        return this.innerModel().isLocalUserEnabled();
    }

    public Boolean isHnsEnabled() {
        return this.innerModel().isHnsEnabled();
    }

    public GeoReplicationStats geoReplicationStats() {
        return this.innerModel().geoReplicationStats();
    }

    public Boolean failoverInProgress() {
        return this.innerModel().failoverInProgress();
    }

    public LargeFileSharesState largeFileSharesState() {
        return this.innerModel().largeFileSharesState();
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

    public RoutingPreference routingPreference() {
        return this.innerModel().routingPreference();
    }

    public BlobRestoreStatus blobRestoreStatus() {
        BlobRestoreStatusInner inner = this.innerModel().blobRestoreStatus();
        if (inner != null) {
            return new BlobRestoreStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Boolean allowBlobPublicAccess() {
        return this.innerModel().allowBlobPublicAccess();
    }

    public MinimumTlsVersion minimumTlsVersion() {
        return this.innerModel().minimumTlsVersion();
    }

    public Boolean allowSharedKeyAccess() {
        return this.innerModel().allowSharedKeyAccess();
    }

    public Boolean enableNfsV3() {
        return this.innerModel().enableNfsV3();
    }

    public Boolean allowCrossTenantReplication() {
        return this.innerModel().allowCrossTenantReplication();
    }

    public Boolean defaultToOAuthAuthentication() {
        return this.innerModel().defaultToOAuthAuthentication();
    }

    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public ImmutableStorageAccount immutableStorageWithVersioning() {
        return this.innerModel().immutableStorageWithVersioning();
    }

    public AllowedCopyScope allowedCopyScope() {
        return this.innerModel().allowedCopyScope();
    }

    public StorageAccountSkuConversionStatus storageAccountSkuConversionStatus() {
        return this.innerModel().storageAccountSkuConversionStatus();
    }

    public DnsEndpointType dnsEndpointType() {
        return this.innerModel().dnsEndpointType();
    }

    public StorageAccountPropertiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.storage.generated.StorageManager manager() {
        return this.serviceManager;
    }
}
