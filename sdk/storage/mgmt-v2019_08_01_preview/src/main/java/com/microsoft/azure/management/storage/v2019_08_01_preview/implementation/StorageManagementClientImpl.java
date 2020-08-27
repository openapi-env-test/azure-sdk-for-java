/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.LongRunningFinalState;
import com.microsoft.azure.LongRunningOperationOptions;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the StorageManagementClientImpl class.
 */
public class StorageManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The ID of the target subscription. */
    private String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The ID of the target subscription.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public StorageManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** The API version to use for this operation. */
    private String apiVersion;

    /**
     * Gets The API version to use for this operation.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public StorageManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public StorageManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public StorageManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * The SkusInner object to access its operations.
     */
    private SkusInner skus;

    /**
     * Gets the SkusInner object to access its operations.
     * @return the SkusInner object.
     */
    public SkusInner skus() {
        return this.skus;
    }

    /**
     * The StorageAccountsInner object to access its operations.
     */
    private StorageAccountsInner storageAccounts;

    /**
     * Gets the StorageAccountsInner object to access its operations.
     * @return the StorageAccountsInner object.
     */
    public StorageAccountsInner storageAccounts() {
        return this.storageAccounts;
    }

    /**
     * The DeletedAccountsInner object to access its operations.
     */
    private DeletedAccountsInner deletedAccounts;

    /**
     * Gets the DeletedAccountsInner object to access its operations.
     * @return the DeletedAccountsInner object.
     */
    public DeletedAccountsInner deletedAccounts() {
        return this.deletedAccounts;
    }

    /**
     * The UsagesInner object to access its operations.
     */
    private UsagesInner usages;

    /**
     * Gets the UsagesInner object to access its operations.
     * @return the UsagesInner object.
     */
    public UsagesInner usages() {
        return this.usages;
    }

    /**
     * The ManagementPoliciesInner object to access its operations.
     */
    private ManagementPoliciesInner managementPolicies;

    /**
     * Gets the ManagementPoliciesInner object to access its operations.
     * @return the ManagementPoliciesInner object.
     */
    public ManagementPoliciesInner managementPolicies() {
        return this.managementPolicies;
    }

    /**
     * The PrivateEndpointConnectionsInner object to access its operations.
     */
    private PrivateEndpointConnectionsInner privateEndpointConnections;

    /**
     * Gets the PrivateEndpointConnectionsInner object to access its operations.
     * @return the PrivateEndpointConnectionsInner object.
     */
    public PrivateEndpointConnectionsInner privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * The PrivateLinkResourcesInner object to access its operations.
     */
    private PrivateLinkResourcesInner privateLinkResources;

    /**
     * Gets the PrivateLinkResourcesInner object to access its operations.
     * @return the PrivateLinkResourcesInner object.
     */
    public PrivateLinkResourcesInner privateLinkResources() {
        return this.privateLinkResources;
    }

    /**
     * The ObjectReplicationPoliciesInner object to access its operations.
     */
    private ObjectReplicationPoliciesInner objectReplicationPolicies;

    /**
     * Gets the ObjectReplicationPoliciesInner object to access its operations.
     * @return the ObjectReplicationPoliciesInner object.
     */
    public ObjectReplicationPoliciesInner objectReplicationPolicies() {
        return this.objectReplicationPolicies;
    }

    /**
     * The EncryptionScopesInner object to access its operations.
     */
    private EncryptionScopesInner encryptionScopes;

    /**
     * Gets the EncryptionScopesInner object to access its operations.
     * @return the EncryptionScopesInner object.
     */
    public EncryptionScopesInner encryptionScopes() {
        return this.encryptionScopes;
    }

    /**
     * The BlobServicesInner object to access its operations.
     */
    private BlobServicesInner blobServices;

    /**
     * Gets the BlobServicesInner object to access its operations.
     * @return the BlobServicesInner object.
     */
    public BlobServicesInner blobServices() {
        return this.blobServices;
    }

    /**
     * The BlobContainersInner object to access its operations.
     */
    private BlobContainersInner blobContainers;

    /**
     * Gets the BlobContainersInner object to access its operations.
     * @return the BlobContainersInner object.
     */
    public BlobContainersInner blobContainers() {
        return this.blobContainers;
    }

    /**
     * The FileServicesInner object to access its operations.
     */
    private FileServicesInner fileServices;

    /**
     * Gets the FileServicesInner object to access its operations.
     * @return the FileServicesInner object.
     */
    public FileServicesInner fileServices() {
        return this.fileServices;
    }

    /**
     * The FileSharesInner object to access its operations.
     */
    private FileSharesInner fileShares;

    /**
     * Gets the FileSharesInner object to access its operations.
     * @return the FileSharesInner object.
     */
    public FileSharesInner fileShares() {
        return this.fileShares;
    }

    /**
     * The QueueServicesInner object to access its operations.
     */
    private QueueServicesInner queueServices;

    /**
     * Gets the QueueServicesInner object to access its operations.
     * @return the QueueServicesInner object.
     */
    public QueueServicesInner queueServices() {
        return this.queueServices;
    }

    /**
     * The QueuesInner object to access its operations.
     */
    private QueuesInner queues;

    /**
     * Gets the QueuesInner object to access its operations.
     * @return the QueuesInner object.
     */
    public QueuesInner queues() {
        return this.queues;
    }

    /**
     * The TableServicesInner object to access its operations.
     */
    private TableServicesInner tableServices;

    /**
     * Gets the TableServicesInner object to access its operations.
     * @return the TableServicesInner object.
     */
    public TableServicesInner tableServices() {
        return this.tableServices;
    }

    /**
     * The TablesInner object to access its operations.
     */
    private TablesInner tables;

    /**
     * Gets the TablesInner object to access its operations.
     * @return the TablesInner object.
     */
    public TablesInner tables() {
        return this.tables;
    }

    /**
     * Initializes an instance of StorageManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public StorageManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of StorageManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public StorageManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of StorageManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public StorageManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2020-08-01-preview";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.skus = new SkusInner(restClient().retrofit(), this);
        this.storageAccounts = new StorageAccountsInner(restClient().retrofit(), this);
        this.deletedAccounts = new DeletedAccountsInner(restClient().retrofit(), this);
        this.usages = new UsagesInner(restClient().retrofit(), this);
        this.managementPolicies = new ManagementPoliciesInner(restClient().retrofit(), this);
        this.privateEndpointConnections = new PrivateEndpointConnectionsInner(restClient().retrofit(), this);
        this.privateLinkResources = new PrivateLinkResourcesInner(restClient().retrofit(), this);
        this.objectReplicationPolicies = new ObjectReplicationPoliciesInner(restClient().retrofit(), this);
        this.encryptionScopes = new EncryptionScopesInner(restClient().retrofit(), this);
        this.blobServices = new BlobServicesInner(restClient().retrofit(), this);
        this.blobContainers = new BlobContainersInner(restClient().retrofit(), this);
        this.fileServices = new FileServicesInner(restClient().retrofit(), this);
        this.fileShares = new FileSharesInner(restClient().retrofit(), this);
        this.queueServices = new QueueServicesInner(restClient().retrofit(), this);
        this.queues = new QueuesInner(restClient().retrofit(), this);
        this.tableServices = new TableServicesInner(restClient().retrofit(), this);
        this.tables = new TablesInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "StorageManagementClient", "2020-08-01-preview");
    }
}
