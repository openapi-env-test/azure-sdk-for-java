// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.SqlManagementClient;
import com.azure.resourcemanager.sql.generated.implementation.DatabasesImpl;
import com.azure.resourcemanager.sql.generated.implementation.ManagedDatabaseRestoreDetailsImpl;
import com.azure.resourcemanager.sql.generated.implementation.ManagedDatabasesImpl;
import com.azure.resourcemanager.sql.generated.implementation.ManagedInstanceOperationsImpl;
import com.azure.resourcemanager.sql.generated.implementation.ManagedInstancesImpl;
import com.azure.resourcemanager.sql.generated.implementation.ServerAzureADAdministratorsImpl;
import com.azure.resourcemanager.sql.generated.implementation.ServerOperationsImpl;
import com.azure.resourcemanager.sql.generated.implementation.ServersImpl;
import com.azure.resourcemanager.sql.generated.implementation.SqlManagementClientBuilder;
import com.azure.resourcemanager.sql.generated.implementation.SyncGroupsImpl;
import com.azure.resourcemanager.sql.generated.implementation.SyncMembersImpl;
import com.azure.resourcemanager.sql.generated.implementation.WorkloadClassifiersImpl;
import com.azure.resourcemanager.sql.generated.implementation.WorkloadGroupsImpl;
import com.azure.resourcemanager.sql.generated.models.Databases;
import com.azure.resourcemanager.sql.generated.models.ManagedDatabaseRestoreDetails;
import com.azure.resourcemanager.sql.generated.models.ManagedDatabases;
import com.azure.resourcemanager.sql.generated.models.ManagedInstanceOperations;
import com.azure.resourcemanager.sql.generated.models.ManagedInstances;
import com.azure.resourcemanager.sql.generated.models.ServerAzureADAdministrators;
import com.azure.resourcemanager.sql.generated.models.ServerOperations;
import com.azure.resourcemanager.sql.generated.models.Servers;
import com.azure.resourcemanager.sql.generated.models.SyncGroups;
import com.azure.resourcemanager.sql.generated.models.SyncMembers;
import com.azure.resourcemanager.sql.generated.models.WorkloadClassifiers;
import com.azure.resourcemanager.sql.generated.models.WorkloadGroups;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Entry point to SqlManager. The Azure SQL Database management API provides a RESTful set of web services that interact
 * with Azure SQL Database services to manage your databases. The API enables you to create, retrieve, update, and
 * delete databases.
 */
public final class SqlManager {
    private Databases databases;

    private ManagedDatabaseRestoreDetails managedDatabaseRestoreDetails;

    private ManagedDatabases managedDatabases;

    private ServerOperations serverOperations;

    private Servers servers;

    private WorkloadGroups workloadGroups;

    private WorkloadClassifiers workloadClassifiers;

    private ManagedInstanceOperations managedInstanceOperations;

    private ServerAzureADAdministrators serverAzureADAdministrators;

    private SyncGroups syncGroups;

    private SyncMembers syncMembers;

    private ManagedInstances managedInstances;

    private final SqlManagementClient clientObject;

    private SqlManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new SqlManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of Sql service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the Sql service API instance.
     */
    public static SqlManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create SqlManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new SqlManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private final ClientLogger logger = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval = Objects.requireNonNull(defaultPollInterval, "'retryPolicy' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw logger.logExceptionAsError(new IllegalArgumentException("'httpPipeline' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of Sql service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the Sql service API instance.
         */
        public SqlManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.sql.generated")
                .append("/")
                .append("1.0.0-beta.1");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder
                    .append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (retryPolicy == null) {
                retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new RequestIdPolicy());
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies
                .add(
                    new BearerTokenAuthenticationPolicy(
                        credential, profile.getEnvironment().getManagementEndpoint() + "/.default"));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new SqlManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of Databases. */
    public Databases databases() {
        if (this.databases == null) {
            this.databases = new DatabasesImpl(clientObject.getDatabases(), this);
        }
        return databases;
    }

    /** @return Resource collection API of ManagedDatabaseRestoreDetails. */
    public ManagedDatabaseRestoreDetails managedDatabaseRestoreDetails() {
        if (this.managedDatabaseRestoreDetails == null) {
            this.managedDatabaseRestoreDetails =
                new ManagedDatabaseRestoreDetailsImpl(clientObject.getManagedDatabaseRestoreDetails(), this);
        }
        return managedDatabaseRestoreDetails;
    }

    /** @return Resource collection API of ManagedDatabases. */
    public ManagedDatabases managedDatabases() {
        if (this.managedDatabases == null) {
            this.managedDatabases = new ManagedDatabasesImpl(clientObject.getManagedDatabases(), this);
        }
        return managedDatabases;
    }

    /** @return Resource collection API of ServerOperations. */
    public ServerOperations serverOperations() {
        if (this.serverOperations == null) {
            this.serverOperations = new ServerOperationsImpl(clientObject.getServerOperations(), this);
        }
        return serverOperations;
    }

    /** @return Resource collection API of Servers. */
    public Servers servers() {
        if (this.servers == null) {
            this.servers = new ServersImpl(clientObject.getServers(), this);
        }
        return servers;
    }

    /** @return Resource collection API of WorkloadGroups. */
    public WorkloadGroups workloadGroups() {
        if (this.workloadGroups == null) {
            this.workloadGroups = new WorkloadGroupsImpl(clientObject.getWorkloadGroups(), this);
        }
        return workloadGroups;
    }

    /** @return Resource collection API of WorkloadClassifiers. */
    public WorkloadClassifiers workloadClassifiers() {
        if (this.workloadClassifiers == null) {
            this.workloadClassifiers = new WorkloadClassifiersImpl(clientObject.getWorkloadClassifiers(), this);
        }
        return workloadClassifiers;
    }

    /** @return Resource collection API of ManagedInstanceOperations. */
    public ManagedInstanceOperations managedInstanceOperations() {
        if (this.managedInstanceOperations == null) {
            this.managedInstanceOperations =
                new ManagedInstanceOperationsImpl(clientObject.getManagedInstanceOperations(), this);
        }
        return managedInstanceOperations;
    }

    /** @return Resource collection API of ServerAzureADAdministrators. */
    public ServerAzureADAdministrators serverAzureADAdministrators() {
        if (this.serverAzureADAdministrators == null) {
            this.serverAzureADAdministrators =
                new ServerAzureADAdministratorsImpl(clientObject.getServerAzureADAdministrators(), this);
        }
        return serverAzureADAdministrators;
    }

    /** @return Resource collection API of SyncGroups. */
    public SyncGroups syncGroups() {
        if (this.syncGroups == null) {
            this.syncGroups = new SyncGroupsImpl(clientObject.getSyncGroups(), this);
        }
        return syncGroups;
    }

    /** @return Resource collection API of SyncMembers. */
    public SyncMembers syncMembers() {
        if (this.syncMembers == null) {
            this.syncMembers = new SyncMembersImpl(clientObject.getSyncMembers(), this);
        }
        return syncMembers;
    }

    /** @return Resource collection API of ManagedInstances. */
    public ManagedInstances managedInstances() {
        if (this.managedInstances == null) {
            this.managedInstances = new ManagedInstancesImpl(clientObject.getManagedInstances(), this);
        }
        return managedInstances;
    }

    /**
     * @return Wrapped service client SqlManagementClient providing direct access to the underlying auto-generated API
     *     implementation, based on Azure REST API.
     */
    public SqlManagementClient serviceClient() {
        return this.clientObject;
    }
}
