// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.http.policy.ArmChallengeAuthenticationPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.MySqlManagementClient;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.AdvisorsImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.CheckNameAvailabilitiesImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.ConfigurationsImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.DatabasesImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.FirewallRulesImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.LocationBasedPerformanceTiersImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.LocationBasedRecommendedActionSessionsOperationStatusImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.LocationBasedRecommendedActionSessionsResultsImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.LogFilesImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.MySqlManagementClientBuilder;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.OperationsImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.PrivateEndpointConnectionsImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.PrivateLinkResourcesImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.QueryTextsImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.RecommendedActionsImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.RecoverableServersImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.ReplicasImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.ResourceProvidersImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.ServerAdministratorsImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.ServerBasedPerformanceTiersImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.ServerKeysImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.ServerParametersImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.ServerSecurityAlertPoliciesImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.ServersImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.TopQueryStatisticsImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.VirtualNetworkRulesImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.WaitStatisticsImpl;
import com.azure.resourcemanager.mysqlflexibleserver.models.Advisors;
import com.azure.resourcemanager.mysqlflexibleserver.models.CheckNameAvailabilities;
import com.azure.resourcemanager.mysqlflexibleserver.models.Configurations;
import com.azure.resourcemanager.mysqlflexibleserver.models.Databases;
import com.azure.resourcemanager.mysqlflexibleserver.models.FirewallRules;
import com.azure.resourcemanager.mysqlflexibleserver.models.LocationBasedPerformanceTiers;
import com.azure.resourcemanager.mysqlflexibleserver.models.LocationBasedRecommendedActionSessionsOperationStatus;
import com.azure.resourcemanager.mysqlflexibleserver.models.LocationBasedRecommendedActionSessionsResults;
import com.azure.resourcemanager.mysqlflexibleserver.models.LogFiles;
import com.azure.resourcemanager.mysqlflexibleserver.models.Operations;
import com.azure.resourcemanager.mysqlflexibleserver.models.PrivateEndpointConnections;
import com.azure.resourcemanager.mysqlflexibleserver.models.PrivateLinkResources;
import com.azure.resourcemanager.mysqlflexibleserver.models.QueryTexts;
import com.azure.resourcemanager.mysqlflexibleserver.models.RecommendedActions;
import com.azure.resourcemanager.mysqlflexibleserver.models.RecoverableServers;
import com.azure.resourcemanager.mysqlflexibleserver.models.Replicas;
import com.azure.resourcemanager.mysqlflexibleserver.models.ResourceProviders;
import com.azure.resourcemanager.mysqlflexibleserver.models.ServerAdministrators;
import com.azure.resourcemanager.mysqlflexibleserver.models.ServerBasedPerformanceTiers;
import com.azure.resourcemanager.mysqlflexibleserver.models.ServerKeys;
import com.azure.resourcemanager.mysqlflexibleserver.models.ServerParameters;
import com.azure.resourcemanager.mysqlflexibleserver.models.ServerSecurityAlertPolicies;
import com.azure.resourcemanager.mysqlflexibleserver.models.Servers;
import com.azure.resourcemanager.mysqlflexibleserver.models.TopQueryStatistics;
import com.azure.resourcemanager.mysqlflexibleserver.models.VirtualNetworkRules;
import com.azure.resourcemanager.mysqlflexibleserver.models.WaitStatistics;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Entry point to MySqlManager. The Microsoft Azure management API provides create, read, update, and delete
 * functionality for Azure MySQL resources including servers, databases, firewall rules, VNET rules, log files and
 * configurations with new business model.
 */
public final class MySqlManager {
    private Servers servers;

    private Replicas replicas;

    private FirewallRules firewallRules;

    private VirtualNetworkRules virtualNetworkRules;

    private Databases databases;

    private Configurations configurations;

    private ServerParameters serverParameters;

    private LogFiles logFiles;

    private ServerAdministrators serverAdministrators;

    private RecoverableServers recoverableServers;

    private ServerBasedPerformanceTiers serverBasedPerformanceTiers;

    private LocationBasedPerformanceTiers locationBasedPerformanceTiers;

    private CheckNameAvailabilities checkNameAvailabilities;

    private Operations operations;

    private ServerSecurityAlertPolicies serverSecurityAlertPolicies;

    private QueryTexts queryTexts;

    private TopQueryStatistics topQueryStatistics;

    private WaitStatistics waitStatistics;

    private ResourceProviders resourceProviders;

    private Advisors advisors;

    private RecommendedActions recommendedActions;

    private LocationBasedRecommendedActionSessionsOperationStatus locationBasedRecommendedActionSessionsOperationStatus;

    private LocationBasedRecommendedActionSessionsResults locationBasedRecommendedActionSessionsResults;

    private PrivateEndpointConnections privateEndpointConnections;

    private PrivateLinkResources privateLinkResources;

    private ServerKeys serverKeys;

    private final MySqlManagementClient clientObject;

    private MySqlManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new MySqlManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of MySql service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the MySql service API instance.
     */
    public static MySqlManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of MySql service API entry point.
     *
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the MySql service API instance.
     */
    public static MySqlManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new MySqlManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create MySqlManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new MySqlManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private static final ClientLogger LOGGER = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private RetryOptions retryOptions;
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
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
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
         * Sets the retry options for the HTTP pipeline retry policy.
         *
         * <p>This setting has no effect, if retry policy is set via {@link #withRetryPolicy(RetryPolicy)}.
         *
         * @param retryOptions the retry options for the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryOptions(RetryOptions retryOptions) {
            this.retryOptions = Objects.requireNonNull(retryOptions, "'retryOptions' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval =
                Objects.requireNonNull(defaultPollInterval, "'defaultPollInterval' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw LOGGER
                    .logExceptionAsError(new IllegalArgumentException("'defaultPollInterval' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of MySql service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the MySql service API instance.
         */
        public MySqlManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.mysqlflexibleserver")
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

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                if (retryOptions != null) {
                    retryPolicy = new RetryPolicy(retryOptions);
                } else {
                    retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
                }
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new AddHeadersFromContextPolicy());
            policies.add(new RequestIdPolicy());
            policies
                .addAll(
                    this
                        .policies
                        .stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                        .collect(Collectors.toList()));
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies
                .addAll(
                    this
                        .policies
                        .stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                        .collect(Collectors.toList()));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new MySqlManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of Servers. It manages Server.
     *
     * @return Resource collection API of Servers.
     */
    public Servers servers() {
        if (this.servers == null) {
            this.servers = new ServersImpl(clientObject.getServers(), this);
        }
        return servers;
    }

    /**
     * Gets the resource collection API of Replicas.
     *
     * @return Resource collection API of Replicas.
     */
    public Replicas replicas() {
        if (this.replicas == null) {
            this.replicas = new ReplicasImpl(clientObject.getReplicas(), this);
        }
        return replicas;
    }

    /**
     * Gets the resource collection API of FirewallRules. It manages FirewallRule.
     *
     * @return Resource collection API of FirewallRules.
     */
    public FirewallRules firewallRules() {
        if (this.firewallRules == null) {
            this.firewallRules = new FirewallRulesImpl(clientObject.getFirewallRules(), this);
        }
        return firewallRules;
    }

    /**
     * Gets the resource collection API of VirtualNetworkRules. It manages VirtualNetworkRule.
     *
     * @return Resource collection API of VirtualNetworkRules.
     */
    public VirtualNetworkRules virtualNetworkRules() {
        if (this.virtualNetworkRules == null) {
            this.virtualNetworkRules = new VirtualNetworkRulesImpl(clientObject.getVirtualNetworkRules(), this);
        }
        return virtualNetworkRules;
    }

    /**
     * Gets the resource collection API of Databases. It manages Database.
     *
     * @return Resource collection API of Databases.
     */
    public Databases databases() {
        if (this.databases == null) {
            this.databases = new DatabasesImpl(clientObject.getDatabases(), this);
        }
        return databases;
    }

    /**
     * Gets the resource collection API of Configurations. It manages Configuration.
     *
     * @return Resource collection API of Configurations.
     */
    public Configurations configurations() {
        if (this.configurations == null) {
            this.configurations = new ConfigurationsImpl(clientObject.getConfigurations(), this);
        }
        return configurations;
    }

    /**
     * Gets the resource collection API of ServerParameters.
     *
     * @return Resource collection API of ServerParameters.
     */
    public ServerParameters serverParameters() {
        if (this.serverParameters == null) {
            this.serverParameters = new ServerParametersImpl(clientObject.getServerParameters(), this);
        }
        return serverParameters;
    }

    /**
     * Gets the resource collection API of LogFiles.
     *
     * @return Resource collection API of LogFiles.
     */
    public LogFiles logFiles() {
        if (this.logFiles == null) {
            this.logFiles = new LogFilesImpl(clientObject.getLogFiles(), this);
        }
        return logFiles;
    }

    /**
     * Gets the resource collection API of ServerAdministrators.
     *
     * @return Resource collection API of ServerAdministrators.
     */
    public ServerAdministrators serverAdministrators() {
        if (this.serverAdministrators == null) {
            this.serverAdministrators = new ServerAdministratorsImpl(clientObject.getServerAdministrators(), this);
        }
        return serverAdministrators;
    }

    /**
     * Gets the resource collection API of RecoverableServers.
     *
     * @return Resource collection API of RecoverableServers.
     */
    public RecoverableServers recoverableServers() {
        if (this.recoverableServers == null) {
            this.recoverableServers = new RecoverableServersImpl(clientObject.getRecoverableServers(), this);
        }
        return recoverableServers;
    }

    /**
     * Gets the resource collection API of ServerBasedPerformanceTiers.
     *
     * @return Resource collection API of ServerBasedPerformanceTiers.
     */
    public ServerBasedPerformanceTiers serverBasedPerformanceTiers() {
        if (this.serverBasedPerformanceTiers == null) {
            this.serverBasedPerformanceTiers =
                new ServerBasedPerformanceTiersImpl(clientObject.getServerBasedPerformanceTiers(), this);
        }
        return serverBasedPerformanceTiers;
    }

    /**
     * Gets the resource collection API of LocationBasedPerformanceTiers.
     *
     * @return Resource collection API of LocationBasedPerformanceTiers.
     */
    public LocationBasedPerformanceTiers locationBasedPerformanceTiers() {
        if (this.locationBasedPerformanceTiers == null) {
            this.locationBasedPerformanceTiers =
                new LocationBasedPerformanceTiersImpl(clientObject.getLocationBasedPerformanceTiers(), this);
        }
        return locationBasedPerformanceTiers;
    }

    /**
     * Gets the resource collection API of CheckNameAvailabilities.
     *
     * @return Resource collection API of CheckNameAvailabilities.
     */
    public CheckNameAvailabilities checkNameAvailabilities() {
        if (this.checkNameAvailabilities == null) {
            this.checkNameAvailabilities =
                new CheckNameAvailabilitiesImpl(clientObject.getCheckNameAvailabilities(), this);
        }
        return checkNameAvailabilities;
    }

    /**
     * Gets the resource collection API of Operations.
     *
     * @return Resource collection API of Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /**
     * Gets the resource collection API of ServerSecurityAlertPolicies. It manages ServerSecurityAlertPolicy.
     *
     * @return Resource collection API of ServerSecurityAlertPolicies.
     */
    public ServerSecurityAlertPolicies serverSecurityAlertPolicies() {
        if (this.serverSecurityAlertPolicies == null) {
            this.serverSecurityAlertPolicies =
                new ServerSecurityAlertPoliciesImpl(clientObject.getServerSecurityAlertPolicies(), this);
        }
        return serverSecurityAlertPolicies;
    }

    /**
     * Gets the resource collection API of QueryTexts.
     *
     * @return Resource collection API of QueryTexts.
     */
    public QueryTexts queryTexts() {
        if (this.queryTexts == null) {
            this.queryTexts = new QueryTextsImpl(clientObject.getQueryTexts(), this);
        }
        return queryTexts;
    }

    /**
     * Gets the resource collection API of TopQueryStatistics.
     *
     * @return Resource collection API of TopQueryStatistics.
     */
    public TopQueryStatistics topQueryStatistics() {
        if (this.topQueryStatistics == null) {
            this.topQueryStatistics = new TopQueryStatisticsImpl(clientObject.getTopQueryStatistics(), this);
        }
        return topQueryStatistics;
    }

    /**
     * Gets the resource collection API of WaitStatistics.
     *
     * @return Resource collection API of WaitStatistics.
     */
    public WaitStatistics waitStatistics() {
        if (this.waitStatistics == null) {
            this.waitStatistics = new WaitStatisticsImpl(clientObject.getWaitStatistics(), this);
        }
        return waitStatistics;
    }

    /**
     * Gets the resource collection API of ResourceProviders.
     *
     * @return Resource collection API of ResourceProviders.
     */
    public ResourceProviders resourceProviders() {
        if (this.resourceProviders == null) {
            this.resourceProviders = new ResourceProvidersImpl(clientObject.getResourceProviders(), this);
        }
        return resourceProviders;
    }

    /**
     * Gets the resource collection API of Advisors.
     *
     * @return Resource collection API of Advisors.
     */
    public Advisors advisors() {
        if (this.advisors == null) {
            this.advisors = new AdvisorsImpl(clientObject.getAdvisors(), this);
        }
        return advisors;
    }

    /**
     * Gets the resource collection API of RecommendedActions.
     *
     * @return Resource collection API of RecommendedActions.
     */
    public RecommendedActions recommendedActions() {
        if (this.recommendedActions == null) {
            this.recommendedActions = new RecommendedActionsImpl(clientObject.getRecommendedActions(), this);
        }
        return recommendedActions;
    }

    /**
     * Gets the resource collection API of LocationBasedRecommendedActionSessionsOperationStatus.
     *
     * @return Resource collection API of LocationBasedRecommendedActionSessionsOperationStatus.
     */
    public LocationBasedRecommendedActionSessionsOperationStatus
        locationBasedRecommendedActionSessionsOperationStatus() {
        if (this.locationBasedRecommendedActionSessionsOperationStatus == null) {
            this.locationBasedRecommendedActionSessionsOperationStatus =
                new LocationBasedRecommendedActionSessionsOperationStatusImpl(
                    clientObject.getLocationBasedRecommendedActionSessionsOperationStatus(), this);
        }
        return locationBasedRecommendedActionSessionsOperationStatus;
    }

    /**
     * Gets the resource collection API of LocationBasedRecommendedActionSessionsResults.
     *
     * @return Resource collection API of LocationBasedRecommendedActionSessionsResults.
     */
    public LocationBasedRecommendedActionSessionsResults locationBasedRecommendedActionSessionsResults() {
        if (this.locationBasedRecommendedActionSessionsResults == null) {
            this.locationBasedRecommendedActionSessionsResults =
                new LocationBasedRecommendedActionSessionsResultsImpl(
                    clientObject.getLocationBasedRecommendedActionSessionsResults(), this);
        }
        return locationBasedRecommendedActionSessionsResults;
    }

    /**
     * Gets the resource collection API of PrivateEndpointConnections. It manages PrivateEndpointConnection.
     *
     * @return Resource collection API of PrivateEndpointConnections.
     */
    public PrivateEndpointConnections privateEndpointConnections() {
        if (this.privateEndpointConnections == null) {
            this.privateEndpointConnections =
                new PrivateEndpointConnectionsImpl(clientObject.getPrivateEndpointConnections(), this);
        }
        return privateEndpointConnections;
    }

    /**
     * Gets the resource collection API of PrivateLinkResources.
     *
     * @return Resource collection API of PrivateLinkResources.
     */
    public PrivateLinkResources privateLinkResources() {
        if (this.privateLinkResources == null) {
            this.privateLinkResources = new PrivateLinkResourcesImpl(clientObject.getPrivateLinkResources(), this);
        }
        return privateLinkResources;
    }

    /**
     * Gets the resource collection API of ServerKeys. It manages ServerKey.
     *
     * @return Resource collection API of ServerKeys.
     */
    public ServerKeys serverKeys() {
        if (this.serverKeys == null) {
            this.serverKeys = new ServerKeysImpl(clientObject.getServerKeys(), this);
        }
        return serverKeys;
    }

    /**
     * @return Wrapped service client MySqlManagementClient providing direct access to the underlying auto-generated API
     *     implementation, based on Azure REST API.
     */
    public MySqlManagementClient serviceClient() {
        return this.clientObject;
    }
}
