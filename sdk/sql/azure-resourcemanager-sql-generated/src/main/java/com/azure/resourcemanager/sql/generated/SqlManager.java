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
import com.azure.resourcemanager.sql.generated.implementation.DatabaseAdvisorsImpl;
import com.azure.resourcemanager.sql.generated.implementation.DatabaseAutomaticTuningsImpl;
import com.azure.resourcemanager.sql.generated.implementation.DatabaseBlobAuditingPoliciesImpl;
import com.azure.resourcemanager.sql.generated.implementation.DatabaseRecommendedActionsImpl;
import com.azure.resourcemanager.sql.generated.implementation.EncryptionProtectorsImpl;
import com.azure.resourcemanager.sql.generated.implementation.FailoverGroupsImpl;
import com.azure.resourcemanager.sql.generated.implementation.FirewallRulesImpl;
import com.azure.resourcemanager.sql.generated.implementation.ManagedInstancesImpl;
import com.azure.resourcemanager.sql.generated.implementation.OperationsImpl;
import com.azure.resourcemanager.sql.generated.implementation.ServerAdvisorsImpl;
import com.azure.resourcemanager.sql.generated.implementation.ServerKeysImpl;
import com.azure.resourcemanager.sql.generated.implementation.ServersImpl;
import com.azure.resourcemanager.sql.generated.implementation.SqlManagementClientBuilder;
import com.azure.resourcemanager.sql.generated.implementation.SubscriptionUsagesImpl;
import com.azure.resourcemanager.sql.generated.implementation.SyncAgentsImpl;
import com.azure.resourcemanager.sql.generated.implementation.SyncGroupsImpl;
import com.azure.resourcemanager.sql.generated.implementation.SyncMembersImpl;
import com.azure.resourcemanager.sql.generated.implementation.VirtualClustersImpl;
import com.azure.resourcemanager.sql.generated.implementation.VirtualNetworkRulesImpl;
import com.azure.resourcemanager.sql.generated.models.DatabaseAdvisors;
import com.azure.resourcemanager.sql.generated.models.DatabaseAutomaticTunings;
import com.azure.resourcemanager.sql.generated.models.DatabaseBlobAuditingPolicies;
import com.azure.resourcemanager.sql.generated.models.DatabaseRecommendedActions;
import com.azure.resourcemanager.sql.generated.models.EncryptionProtectors;
import com.azure.resourcemanager.sql.generated.models.FailoverGroups;
import com.azure.resourcemanager.sql.generated.models.FirewallRules;
import com.azure.resourcemanager.sql.generated.models.ManagedInstances;
import com.azure.resourcemanager.sql.generated.models.Operations;
import com.azure.resourcemanager.sql.generated.models.ServerAdvisors;
import com.azure.resourcemanager.sql.generated.models.ServerKeys;
import com.azure.resourcemanager.sql.generated.models.Servers;
import com.azure.resourcemanager.sql.generated.models.SubscriptionUsages;
import com.azure.resourcemanager.sql.generated.models.SyncAgents;
import com.azure.resourcemanager.sql.generated.models.SyncGroups;
import com.azure.resourcemanager.sql.generated.models.SyncMembers;
import com.azure.resourcemanager.sql.generated.models.VirtualClusters;
import com.azure.resourcemanager.sql.generated.models.VirtualNetworkRules;
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
    private DatabaseAdvisors databaseAdvisors;

    private DatabaseRecommendedActions databaseRecommendedActions;

    private ServerAdvisors serverAdvisors;

    private DatabaseBlobAuditingPolicies databaseBlobAuditingPolicies;

    private DatabaseAutomaticTunings databaseAutomaticTunings;

    private EncryptionProtectors encryptionProtectors;

    private FailoverGroups failoverGroups;

    private FirewallRules firewallRules;

    private ManagedInstances managedInstances;

    private Operations operations;

    private ServerKeys serverKeys;

    private Servers servers;

    private SyncAgents syncAgents;

    private SyncGroups syncGroups;

    private SyncMembers syncMembers;

    private SubscriptionUsages subscriptionUsages;

    private VirtualClusters virtualClusters;

    private VirtualNetworkRules virtualNetworkRules;

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

    /** @return Resource collection API of DatabaseAdvisors. */
    public DatabaseAdvisors databaseAdvisors() {
        if (this.databaseAdvisors == null) {
            this.databaseAdvisors = new DatabaseAdvisorsImpl(clientObject.getDatabaseAdvisors(), this);
        }
        return databaseAdvisors;
    }

    /** @return Resource collection API of DatabaseRecommendedActions. */
    public DatabaseRecommendedActions databaseRecommendedActions() {
        if (this.databaseRecommendedActions == null) {
            this.databaseRecommendedActions =
                new DatabaseRecommendedActionsImpl(clientObject.getDatabaseRecommendedActions(), this);
        }
        return databaseRecommendedActions;
    }

    /** @return Resource collection API of ServerAdvisors. */
    public ServerAdvisors serverAdvisors() {
        if (this.serverAdvisors == null) {
            this.serverAdvisors = new ServerAdvisorsImpl(clientObject.getServerAdvisors(), this);
        }
        return serverAdvisors;
    }

    /** @return Resource collection API of DatabaseBlobAuditingPolicies. */
    public DatabaseBlobAuditingPolicies databaseBlobAuditingPolicies() {
        if (this.databaseBlobAuditingPolicies == null) {
            this.databaseBlobAuditingPolicies =
                new DatabaseBlobAuditingPoliciesImpl(clientObject.getDatabaseBlobAuditingPolicies(), this);
        }
        return databaseBlobAuditingPolicies;
    }

    /** @return Resource collection API of DatabaseAutomaticTunings. */
    public DatabaseAutomaticTunings databaseAutomaticTunings() {
        if (this.databaseAutomaticTunings == null) {
            this.databaseAutomaticTunings =
                new DatabaseAutomaticTuningsImpl(clientObject.getDatabaseAutomaticTunings(), this);
        }
        return databaseAutomaticTunings;
    }

    /** @return Resource collection API of EncryptionProtectors. */
    public EncryptionProtectors encryptionProtectors() {
        if (this.encryptionProtectors == null) {
            this.encryptionProtectors = new EncryptionProtectorsImpl(clientObject.getEncryptionProtectors(), this);
        }
        return encryptionProtectors;
    }

    /** @return Resource collection API of FailoverGroups. */
    public FailoverGroups failoverGroups() {
        if (this.failoverGroups == null) {
            this.failoverGroups = new FailoverGroupsImpl(clientObject.getFailoverGroups(), this);
        }
        return failoverGroups;
    }

    /** @return Resource collection API of FirewallRules. */
    public FirewallRules firewallRules() {
        if (this.firewallRules == null) {
            this.firewallRules = new FirewallRulesImpl(clientObject.getFirewallRules(), this);
        }
        return firewallRules;
    }

    /** @return Resource collection API of ManagedInstances. */
    public ManagedInstances managedInstances() {
        if (this.managedInstances == null) {
            this.managedInstances = new ManagedInstancesImpl(clientObject.getManagedInstances(), this);
        }
        return managedInstances;
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of ServerKeys. */
    public ServerKeys serverKeys() {
        if (this.serverKeys == null) {
            this.serverKeys = new ServerKeysImpl(clientObject.getServerKeys(), this);
        }
        return serverKeys;
    }

    /** @return Resource collection API of Servers. */
    public Servers servers() {
        if (this.servers == null) {
            this.servers = new ServersImpl(clientObject.getServers(), this);
        }
        return servers;
    }

    /** @return Resource collection API of SyncAgents. */
    public SyncAgents syncAgents() {
        if (this.syncAgents == null) {
            this.syncAgents = new SyncAgentsImpl(clientObject.getSyncAgents(), this);
        }
        return syncAgents;
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

    /** @return Resource collection API of SubscriptionUsages. */
    public SubscriptionUsages subscriptionUsages() {
        if (this.subscriptionUsages == null) {
            this.subscriptionUsages = new SubscriptionUsagesImpl(clientObject.getSubscriptionUsages(), this);
        }
        return subscriptionUsages;
    }

    /** @return Resource collection API of VirtualClusters. */
    public VirtualClusters virtualClusters() {
        if (this.virtualClusters == null) {
            this.virtualClusters = new VirtualClustersImpl(clientObject.getVirtualClusters(), this);
        }
        return virtualClusters;
    }

    /** @return Resource collection API of VirtualNetworkRules. */
    public VirtualNetworkRules virtualNetworkRules() {
        if (this.virtualNetworkRules == null) {
            this.virtualNetworkRules = new VirtualNetworkRulesImpl(clientObject.getVirtualNetworkRules(), this);
        }
        return virtualNetworkRules;
    }

    /**
     * @return Wrapped service client SqlManagementClient providing direct access to the underlying auto-generated API
     *     implementation, based on Azure REST API.
     */
    public SqlManagementClient serviceClient() {
        return this.clientObject;
    }
}
