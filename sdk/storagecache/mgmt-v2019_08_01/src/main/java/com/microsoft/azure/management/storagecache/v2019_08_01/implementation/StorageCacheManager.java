/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2019_08_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.storagecache.v2019_08_01.Operations;
import com.microsoft.azure.management.storagecache.v2019_08_01.Skus;
import com.microsoft.azure.management.storagecache.v2019_08_01.UsageModels;
import com.microsoft.azure.management.storagecache.v2019_08_01.Caches;
import com.microsoft.azure.management.storagecache.v2019_08_01.StorageTargets;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure StorageCache resource management.
 */
public final class StorageCacheManager extends ManagerCore<StorageCacheManager, StorageCacheManagementClientImpl> {
    private Operations operations;
    private Skus skus;
    private UsageModels usageModels;
    private Caches caches;
    private StorageTargets storageTargets;
    /**
    * Get a Configurable instance that can be used to create StorageCacheManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new StorageCacheManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of StorageCacheManager that exposes StorageCache resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the StorageCacheManager
    */
    public static StorageCacheManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new StorageCacheManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of StorageCacheManager that exposes StorageCache resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the StorageCacheManager
    */
    public static StorageCacheManager authenticate(RestClient restClient, String subscriptionId) {
        return new StorageCacheManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of StorageCacheManager that exposes StorageCache management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing StorageCache management API entry points that work across subscriptions
        */
        StorageCacheManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage Skus.
     */
    public Skus skus() {
        if (this.skus == null) {
            this.skus = new SkusImpl(this);
        }
        return this.skus;
    }

    /**
     * @return Entry point to manage UsageModels.
     */
    public UsageModels usageModels() {
        if (this.usageModels == null) {
            this.usageModels = new UsageModelsImpl(this);
        }
        return this.usageModels;
    }

    /**
     * @return Entry point to manage Caches.
     */
    public Caches caches() {
        if (this.caches == null) {
            this.caches = new CachesImpl(this);
        }
        return this.caches;
    }

    /**
     * @return Entry point to manage StorageTargets.
     */
    public StorageTargets storageTargets() {
        if (this.storageTargets == null) {
            this.storageTargets = new StorageTargetsImpl(this);
        }
        return this.storageTargets;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public StorageCacheManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return StorageCacheManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private StorageCacheManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new StorageCacheManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
