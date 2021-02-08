// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for SqlManagementClient class. */
public interface SqlManagementClient {
    /**
     * Gets The subscription ID that identifies an Azure subscription.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the DatabasesClient object to access its operations.
     *
     * @return the DatabasesClient object.
     */
    DatabasesClient getDatabases();

    /**
     * Gets the ManagedDatabaseRestoreDetailsClient object to access its operations.
     *
     * @return the ManagedDatabaseRestoreDetailsClient object.
     */
    ManagedDatabaseRestoreDetailsClient getManagedDatabaseRestoreDetails();

    /**
     * Gets the ManagedDatabasesClient object to access its operations.
     *
     * @return the ManagedDatabasesClient object.
     */
    ManagedDatabasesClient getManagedDatabases();

    /**
     * Gets the ServerOperationsClient object to access its operations.
     *
     * @return the ServerOperationsClient object.
     */
    ServerOperationsClient getServerOperations();

    /**
     * Gets the ServersClient object to access its operations.
     *
     * @return the ServersClient object.
     */
    ServersClient getServers();

    /**
     * Gets the WorkloadGroupsClient object to access its operations.
     *
     * @return the WorkloadGroupsClient object.
     */
    WorkloadGroupsClient getWorkloadGroups();

    /**
     * Gets the WorkloadClassifiersClient object to access its operations.
     *
     * @return the WorkloadClassifiersClient object.
     */
    WorkloadClassifiersClient getWorkloadClassifiers();

    /**
     * Gets the ManagedInstanceOperationsClient object to access its operations.
     *
     * @return the ManagedInstanceOperationsClient object.
     */
    ManagedInstanceOperationsClient getManagedInstanceOperations();

    /**
     * Gets the ServerAzureADAdministratorsClient object to access its operations.
     *
     * @return the ServerAzureADAdministratorsClient object.
     */
    ServerAzureADAdministratorsClient getServerAzureADAdministrators();

    /**
     * Gets the SyncGroupsClient object to access its operations.
     *
     * @return the SyncGroupsClient object.
     */
    SyncGroupsClient getSyncGroups();

    /**
     * Gets the SyncMembersClient object to access its operations.
     *
     * @return the SyncMembersClient object.
     */
    SyncMembersClient getSyncMembers();

    /**
     * Gets the ManagedInstancesClient object to access its operations.
     *
     * @return the ManagedInstancesClient object.
     */
    ManagedInstancesClient getManagedInstances();
}
