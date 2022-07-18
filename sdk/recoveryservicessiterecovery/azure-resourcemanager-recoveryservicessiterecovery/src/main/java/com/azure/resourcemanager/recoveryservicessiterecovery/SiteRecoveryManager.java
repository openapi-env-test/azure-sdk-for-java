// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery;

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
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.SiteRecoveryManagementClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.MigrationRecoveryPointsImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.OperationsImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.RecoveryPointsImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.ReplicationAlertSettingsImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.ReplicationAppliancesImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.ReplicationEligibilityResultsOperationsImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.ReplicationEventsImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.ReplicationFabricsImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.ReplicationJobsImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.ReplicationLogicalNetworksImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.ReplicationMigrationItemsImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.ReplicationNetworkMappingsImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.ReplicationNetworksImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.ReplicationPoliciesImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.ReplicationProtectableItemsImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.ReplicationProtectedItemsImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.ReplicationProtectionContainerMappingsImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.ReplicationProtectionContainersImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.ReplicationProtectionIntentsImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.ReplicationRecoveryPlansImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.ReplicationRecoveryServicesProvidersImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.ReplicationStorageClassificationMappingsImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.ReplicationStorageClassificationsImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.ReplicationVaultHealthsImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.ReplicationVaultSettingsImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.ReplicationvCentersImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.SiteRecoveryManagementClientBuilder;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.SupportedOperatingSystemsOperationsImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.implementation.TargetComputeSizesImpl;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.MigrationRecoveryPoints;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.Operations;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPoints;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationAlertSettings;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationAppliances;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationEligibilityResultsOperations;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationEvents;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationFabrics;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationJobs;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationLogicalNetworks;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationMigrationItems;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationNetworkMappings;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationNetworks;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationPolicies;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationProtectableItems;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationProtectedItems;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationProtectionContainerMappings;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationProtectionContainers;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationProtectionIntents;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationRecoveryPlans;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationRecoveryServicesProviders;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationStorageClassificationMappings;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationStorageClassifications;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationVaultHealths;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationVaultSettings;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationvCenters;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SupportedOperatingSystemsOperations;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TargetComputeSizes;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/** Entry point to SiteRecoveryManager. */
public final class SiteRecoveryManager {
    private Operations operations;

    private ReplicationAlertSettings replicationAlertSettings;

    private ReplicationAppliances replicationAppliances;

    private ReplicationEligibilityResultsOperations replicationEligibilityResultsOperations;

    private ReplicationEvents replicationEvents;

    private ReplicationFabrics replicationFabrics;

    private ReplicationLogicalNetworks replicationLogicalNetworks;

    private ReplicationNetworks replicationNetworks;

    private ReplicationNetworkMappings replicationNetworkMappings;

    private ReplicationProtectionContainers replicationProtectionContainers;

    private ReplicationMigrationItems replicationMigrationItems;

    private MigrationRecoveryPoints migrationRecoveryPoints;

    private ReplicationProtectableItems replicationProtectableItems;

    private ReplicationProtectedItems replicationProtectedItems;

    private RecoveryPoints recoveryPoints;

    private TargetComputeSizes targetComputeSizes;

    private ReplicationProtectionContainerMappings replicationProtectionContainerMappings;

    private ReplicationRecoveryServicesProviders replicationRecoveryServicesProviders;

    private ReplicationStorageClassifications replicationStorageClassifications;

    private ReplicationStorageClassificationMappings replicationStorageClassificationMappings;

    private ReplicationvCenters replicationvCenters;

    private ReplicationJobs replicationJobs;

    private ReplicationPolicies replicationPolicies;

    private ReplicationProtectionIntents replicationProtectionIntents;

    private ReplicationRecoveryPlans replicationRecoveryPlans;

    private SupportedOperatingSystemsOperations supportedOperatingSystemsOperations;

    private ReplicationVaultHealths replicationVaultHealths;

    private ReplicationVaultSettings replicationVaultSettings;

    private final SiteRecoveryManagementClient clientObject;

    private SiteRecoveryManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new SiteRecoveryManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of SiteRecovery service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the SiteRecovery service API instance.
     */
    public static SiteRecoveryManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of SiteRecovery service API entry point.
     *
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the SiteRecovery service API instance.
     */
    public static SiteRecoveryManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new SiteRecoveryManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create SiteRecoveryManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new SiteRecoveryManager.Configurable();
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
         * Creates an instance of SiteRecovery service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the SiteRecovery service API instance.
         */
        public SiteRecoveryManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.recoveryservicessiterecovery")
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
            return new SiteRecoveryManager(httpPipeline, profile, defaultPollInterval);
        }
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
     * Gets the resource collection API of ReplicationAlertSettings. It manages Alert.
     *
     * @return Resource collection API of ReplicationAlertSettings.
     */
    public ReplicationAlertSettings replicationAlertSettings() {
        if (this.replicationAlertSettings == null) {
            this.replicationAlertSettings =
                new ReplicationAlertSettingsImpl(clientObject.getReplicationAlertSettings(), this);
        }
        return replicationAlertSettings;
    }

    /**
     * Gets the resource collection API of ReplicationAppliances.
     *
     * @return Resource collection API of ReplicationAppliances.
     */
    public ReplicationAppliances replicationAppliances() {
        if (this.replicationAppliances == null) {
            this.replicationAppliances = new ReplicationAppliancesImpl(clientObject.getReplicationAppliances(), this);
        }
        return replicationAppliances;
    }

    /**
     * Gets the resource collection API of ReplicationEligibilityResultsOperations.
     *
     * @return Resource collection API of ReplicationEligibilityResultsOperations.
     */
    public ReplicationEligibilityResultsOperations replicationEligibilityResultsOperations() {
        if (this.replicationEligibilityResultsOperations == null) {
            this.replicationEligibilityResultsOperations =
                new ReplicationEligibilityResultsOperationsImpl(
                    clientObject.getReplicationEligibilityResultsOperations(), this);
        }
        return replicationEligibilityResultsOperations;
    }

    /**
     * Gets the resource collection API of ReplicationEvents.
     *
     * @return Resource collection API of ReplicationEvents.
     */
    public ReplicationEvents replicationEvents() {
        if (this.replicationEvents == null) {
            this.replicationEvents = new ReplicationEventsImpl(clientObject.getReplicationEvents(), this);
        }
        return replicationEvents;
    }

    /**
     * Gets the resource collection API of ReplicationFabrics. It manages Fabric.
     *
     * @return Resource collection API of ReplicationFabrics.
     */
    public ReplicationFabrics replicationFabrics() {
        if (this.replicationFabrics == null) {
            this.replicationFabrics = new ReplicationFabricsImpl(clientObject.getReplicationFabrics(), this);
        }
        return replicationFabrics;
    }

    /**
     * Gets the resource collection API of ReplicationLogicalNetworks.
     *
     * @return Resource collection API of ReplicationLogicalNetworks.
     */
    public ReplicationLogicalNetworks replicationLogicalNetworks() {
        if (this.replicationLogicalNetworks == null) {
            this.replicationLogicalNetworks =
                new ReplicationLogicalNetworksImpl(clientObject.getReplicationLogicalNetworks(), this);
        }
        return replicationLogicalNetworks;
    }

    /**
     * Gets the resource collection API of ReplicationNetworks.
     *
     * @return Resource collection API of ReplicationNetworks.
     */
    public ReplicationNetworks replicationNetworks() {
        if (this.replicationNetworks == null) {
            this.replicationNetworks = new ReplicationNetworksImpl(clientObject.getReplicationNetworks(), this);
        }
        return replicationNetworks;
    }

    /**
     * Gets the resource collection API of ReplicationNetworkMappings. It manages NetworkMapping.
     *
     * @return Resource collection API of ReplicationNetworkMappings.
     */
    public ReplicationNetworkMappings replicationNetworkMappings() {
        if (this.replicationNetworkMappings == null) {
            this.replicationNetworkMappings =
                new ReplicationNetworkMappingsImpl(clientObject.getReplicationNetworkMappings(), this);
        }
        return replicationNetworkMappings;
    }

    /**
     * Gets the resource collection API of ReplicationProtectionContainers. It manages ProtectionContainer.
     *
     * @return Resource collection API of ReplicationProtectionContainers.
     */
    public ReplicationProtectionContainers replicationProtectionContainers() {
        if (this.replicationProtectionContainers == null) {
            this.replicationProtectionContainers =
                new ReplicationProtectionContainersImpl(clientObject.getReplicationProtectionContainers(), this);
        }
        return replicationProtectionContainers;
    }

    /**
     * Gets the resource collection API of ReplicationMigrationItems. It manages MigrationItem.
     *
     * @return Resource collection API of ReplicationMigrationItems.
     */
    public ReplicationMigrationItems replicationMigrationItems() {
        if (this.replicationMigrationItems == null) {
            this.replicationMigrationItems =
                new ReplicationMigrationItemsImpl(clientObject.getReplicationMigrationItems(), this);
        }
        return replicationMigrationItems;
    }

    /**
     * Gets the resource collection API of MigrationRecoveryPoints.
     *
     * @return Resource collection API of MigrationRecoveryPoints.
     */
    public MigrationRecoveryPoints migrationRecoveryPoints() {
        if (this.migrationRecoveryPoints == null) {
            this.migrationRecoveryPoints =
                new MigrationRecoveryPointsImpl(clientObject.getMigrationRecoveryPoints(), this);
        }
        return migrationRecoveryPoints;
    }

    /**
     * Gets the resource collection API of ReplicationProtectableItems.
     *
     * @return Resource collection API of ReplicationProtectableItems.
     */
    public ReplicationProtectableItems replicationProtectableItems() {
        if (this.replicationProtectableItems == null) {
            this.replicationProtectableItems =
                new ReplicationProtectableItemsImpl(clientObject.getReplicationProtectableItems(), this);
        }
        return replicationProtectableItems;
    }

    /**
     * Gets the resource collection API of ReplicationProtectedItems. It manages ReplicationProtectedItem.
     *
     * @return Resource collection API of ReplicationProtectedItems.
     */
    public ReplicationProtectedItems replicationProtectedItems() {
        if (this.replicationProtectedItems == null) {
            this.replicationProtectedItems =
                new ReplicationProtectedItemsImpl(clientObject.getReplicationProtectedItems(), this);
        }
        return replicationProtectedItems;
    }

    /**
     * Gets the resource collection API of RecoveryPoints.
     *
     * @return Resource collection API of RecoveryPoints.
     */
    public RecoveryPoints recoveryPoints() {
        if (this.recoveryPoints == null) {
            this.recoveryPoints = new RecoveryPointsImpl(clientObject.getRecoveryPoints(), this);
        }
        return recoveryPoints;
    }

    /**
     * Gets the resource collection API of TargetComputeSizes.
     *
     * @return Resource collection API of TargetComputeSizes.
     */
    public TargetComputeSizes targetComputeSizes() {
        if (this.targetComputeSizes == null) {
            this.targetComputeSizes = new TargetComputeSizesImpl(clientObject.getTargetComputeSizes(), this);
        }
        return targetComputeSizes;
    }

    /**
     * Gets the resource collection API of ReplicationProtectionContainerMappings. It manages
     * ProtectionContainerMapping.
     *
     * @return Resource collection API of ReplicationProtectionContainerMappings.
     */
    public ReplicationProtectionContainerMappings replicationProtectionContainerMappings() {
        if (this.replicationProtectionContainerMappings == null) {
            this.replicationProtectionContainerMappings =
                new ReplicationProtectionContainerMappingsImpl(
                    clientObject.getReplicationProtectionContainerMappings(), this);
        }
        return replicationProtectionContainerMappings;
    }

    /**
     * Gets the resource collection API of ReplicationRecoveryServicesProviders. It manages RecoveryServicesProvider.
     *
     * @return Resource collection API of ReplicationRecoveryServicesProviders.
     */
    public ReplicationRecoveryServicesProviders replicationRecoveryServicesProviders() {
        if (this.replicationRecoveryServicesProviders == null) {
            this.replicationRecoveryServicesProviders =
                new ReplicationRecoveryServicesProvidersImpl(
                    clientObject.getReplicationRecoveryServicesProviders(), this);
        }
        return replicationRecoveryServicesProviders;
    }

    /**
     * Gets the resource collection API of ReplicationStorageClassifications.
     *
     * @return Resource collection API of ReplicationStorageClassifications.
     */
    public ReplicationStorageClassifications replicationStorageClassifications() {
        if (this.replicationStorageClassifications == null) {
            this.replicationStorageClassifications =
                new ReplicationStorageClassificationsImpl(clientObject.getReplicationStorageClassifications(), this);
        }
        return replicationStorageClassifications;
    }

    /**
     * Gets the resource collection API of ReplicationStorageClassificationMappings. It manages
     * StorageClassificationMapping.
     *
     * @return Resource collection API of ReplicationStorageClassificationMappings.
     */
    public ReplicationStorageClassificationMappings replicationStorageClassificationMappings() {
        if (this.replicationStorageClassificationMappings == null) {
            this.replicationStorageClassificationMappings =
                new ReplicationStorageClassificationMappingsImpl(
                    clientObject.getReplicationStorageClassificationMappings(), this);
        }
        return replicationStorageClassificationMappings;
    }

    /**
     * Gets the resource collection API of ReplicationvCenters. It manages VCenter.
     *
     * @return Resource collection API of ReplicationvCenters.
     */
    public ReplicationvCenters replicationvCenters() {
        if (this.replicationvCenters == null) {
            this.replicationvCenters = new ReplicationvCentersImpl(clientObject.getReplicationvCenters(), this);
        }
        return replicationvCenters;
    }

    /**
     * Gets the resource collection API of ReplicationJobs.
     *
     * @return Resource collection API of ReplicationJobs.
     */
    public ReplicationJobs replicationJobs() {
        if (this.replicationJobs == null) {
            this.replicationJobs = new ReplicationJobsImpl(clientObject.getReplicationJobs(), this);
        }
        return replicationJobs;
    }

    /**
     * Gets the resource collection API of ReplicationPolicies. It manages Policy.
     *
     * @return Resource collection API of ReplicationPolicies.
     */
    public ReplicationPolicies replicationPolicies() {
        if (this.replicationPolicies == null) {
            this.replicationPolicies = new ReplicationPoliciesImpl(clientObject.getReplicationPolicies(), this);
        }
        return replicationPolicies;
    }

    /**
     * Gets the resource collection API of ReplicationProtectionIntents. It manages ReplicationProtectionIntent.
     *
     * @return Resource collection API of ReplicationProtectionIntents.
     */
    public ReplicationProtectionIntents replicationProtectionIntents() {
        if (this.replicationProtectionIntents == null) {
            this.replicationProtectionIntents =
                new ReplicationProtectionIntentsImpl(clientObject.getReplicationProtectionIntents(), this);
        }
        return replicationProtectionIntents;
    }

    /**
     * Gets the resource collection API of ReplicationRecoveryPlans. It manages RecoveryPlan.
     *
     * @return Resource collection API of ReplicationRecoveryPlans.
     */
    public ReplicationRecoveryPlans replicationRecoveryPlans() {
        if (this.replicationRecoveryPlans == null) {
            this.replicationRecoveryPlans =
                new ReplicationRecoveryPlansImpl(clientObject.getReplicationRecoveryPlans(), this);
        }
        return replicationRecoveryPlans;
    }

    /**
     * Gets the resource collection API of SupportedOperatingSystemsOperations.
     *
     * @return Resource collection API of SupportedOperatingSystemsOperations.
     */
    public SupportedOperatingSystemsOperations supportedOperatingSystemsOperations() {
        if (this.supportedOperatingSystemsOperations == null) {
            this.supportedOperatingSystemsOperations =
                new SupportedOperatingSystemsOperationsImpl(
                    clientObject.getSupportedOperatingSystemsOperations(), this);
        }
        return supportedOperatingSystemsOperations;
    }

    /**
     * Gets the resource collection API of ReplicationVaultHealths.
     *
     * @return Resource collection API of ReplicationVaultHealths.
     */
    public ReplicationVaultHealths replicationVaultHealths() {
        if (this.replicationVaultHealths == null) {
            this.replicationVaultHealths =
                new ReplicationVaultHealthsImpl(clientObject.getReplicationVaultHealths(), this);
        }
        return replicationVaultHealths;
    }

    /**
     * Gets the resource collection API of ReplicationVaultSettings. It manages VaultSetting.
     *
     * @return Resource collection API of ReplicationVaultSettings.
     */
    public ReplicationVaultSettings replicationVaultSettings() {
        if (this.replicationVaultSettings == null) {
            this.replicationVaultSettings =
                new ReplicationVaultSettingsImpl(clientObject.getReplicationVaultSettings(), this);
        }
        return replicationVaultSettings;
    }

    /**
     * @return Wrapped service client SiteRecoveryManagementClient providing direct access to the underlying
     *     auto-generated API implementation, based on Azure REST API.
     */
    public SiteRecoveryManagementClient serviceClient() {
        return this.clientObject;
    }
}
