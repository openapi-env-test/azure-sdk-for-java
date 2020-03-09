/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync.v2019_02_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.storagesync.v2019_02_01.Operations;
import com.microsoft.azure.management.storagesync.v2019_02_01.StorageSyncServices;
import com.microsoft.azure.management.storagesync.v2019_02_01.SyncGroups;
import com.microsoft.azure.management.storagesync.v2019_02_01.CloudEndpoints;
import com.microsoft.azure.management.storagesync.v2019_02_01.ServerEndpoints;
import com.microsoft.azure.management.storagesync.v2019_02_01.RegisteredServers;
import com.microsoft.azure.management.storagesync.v2019_02_01.Workflows;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure StorageSync resource management.
 */
public final class StorageSyncManager extends ManagerCore<StorageSyncManager, StorageSyncManagementClientImpl> {
    private Operations operations;
    private StorageSyncServices storageSyncServices;
    private SyncGroups syncGroups;
    private CloudEndpoints cloudEndpoints;
    private ServerEndpoints serverEndpoints;
    private RegisteredServers registeredServers;
    private Workflows workflows;
    /**
    * Get a Configurable instance that can be used to create StorageSyncManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new StorageSyncManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of StorageSyncManager that exposes StorageSync resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the StorageSyncManager
    */
    public static StorageSyncManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new StorageSyncManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of StorageSyncManager that exposes StorageSync resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the StorageSyncManager
    */
    public static StorageSyncManager authenticate(RestClient restClient, String subscriptionId) {
        return new StorageSyncManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of StorageSyncManager that exposes StorageSync management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing StorageSync management API entry points that work across subscriptions
        */
        StorageSyncManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
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
     * @return Entry point to manage StorageSyncServices.
     */
    public StorageSyncServices storageSyncServices() {
        if (this.storageSyncServices == null) {
            this.storageSyncServices = new StorageSyncServicesImpl(this);
        }
        return this.storageSyncServices;
    }

    /**
     * @return Entry point to manage SyncGroups.
     */
    public SyncGroups syncGroups() {
        if (this.syncGroups == null) {
            this.syncGroups = new SyncGroupsImpl(this);
        }
        return this.syncGroups;
    }

    /**
     * @return Entry point to manage CloudEndpoints.
     */
    public CloudEndpoints cloudEndpoints() {
        if (this.cloudEndpoints == null) {
            this.cloudEndpoints = new CloudEndpointsImpl(this);
        }
        return this.cloudEndpoints;
    }

    /**
     * @return Entry point to manage ServerEndpoints.
     */
    public ServerEndpoints serverEndpoints() {
        if (this.serverEndpoints == null) {
            this.serverEndpoints = new ServerEndpointsImpl(this);
        }
        return this.serverEndpoints;
    }

    /**
     * @return Entry point to manage RegisteredServers.
     */
    public RegisteredServers registeredServers() {
        if (this.registeredServers == null) {
            this.registeredServers = new RegisteredServersImpl(this);
        }
        return this.registeredServers;
    }

    /**
     * @return Entry point to manage Workflows.
     */
    public Workflows workflows() {
        if (this.workflows == null) {
            this.workflows = new WorkflowsImpl(this);
        }
        return this.workflows;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public StorageSyncManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return StorageSyncManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private StorageSyncManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new StorageSyncManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
