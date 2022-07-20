// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights;

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
import com.azure.resourcemanager.policyinsights.fluent.PolicyInsightsClient;
import com.azure.resourcemanager.policyinsights.implementation.AttestationsImpl;
import com.azure.resourcemanager.policyinsights.implementation.OperationsImpl;
import com.azure.resourcemanager.policyinsights.implementation.PolicyEventsImpl;
import com.azure.resourcemanager.policyinsights.implementation.PolicyInsightsClientBuilder;
import com.azure.resourcemanager.policyinsights.implementation.PolicyMetadatasImpl;
import com.azure.resourcemanager.policyinsights.implementation.PolicyRestrictionsImpl;
import com.azure.resourcemanager.policyinsights.implementation.PolicyStatesImpl;
import com.azure.resourcemanager.policyinsights.implementation.PolicyTrackedResourcesImpl;
import com.azure.resourcemanager.policyinsights.implementation.RemediationsImpl;
import com.azure.resourcemanager.policyinsights.models.Attestations;
import com.azure.resourcemanager.policyinsights.models.Operations;
import com.azure.resourcemanager.policyinsights.models.PolicyEvents;
import com.azure.resourcemanager.policyinsights.models.PolicyMetadatas;
import com.azure.resourcemanager.policyinsights.models.PolicyRestrictions;
import com.azure.resourcemanager.policyinsights.models.PolicyStates;
import com.azure.resourcemanager.policyinsights.models.PolicyTrackedResources;
import com.azure.resourcemanager.policyinsights.models.Remediations;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/** Entry point to PolicyInsightsManager. */
public final class PolicyInsightsManager {
    private PolicyTrackedResources policyTrackedResources;

    private Remediations remediations;

    private PolicyEvents policyEvents;

    private PolicyStates policyStates;

    private Operations operations;

    private PolicyMetadatas policyMetadatas;

    private PolicyRestrictions policyRestrictions;

    private Attestations attestations;

    private final PolicyInsightsClient clientObject;

    private PolicyInsightsManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new PolicyInsightsClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of PolicyInsights service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the PolicyInsights service API instance.
     */
    public static PolicyInsightsManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of PolicyInsights service API entry point.
     *
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the PolicyInsights service API instance.
     */
    public static PolicyInsightsManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new PolicyInsightsManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create PolicyInsightsManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new PolicyInsightsManager.Configurable();
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
         * Creates an instance of PolicyInsights service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the PolicyInsights service API instance.
         */
        public PolicyInsightsManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.policyinsights")
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
            return new PolicyInsightsManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of PolicyTrackedResources.
     *
     * @return Resource collection API of PolicyTrackedResources.
     */
    public PolicyTrackedResources policyTrackedResources() {
        if (this.policyTrackedResources == null) {
            this.policyTrackedResources =
                new PolicyTrackedResourcesImpl(clientObject.getPolicyTrackedResources(), this);
        }
        return policyTrackedResources;
    }

    /**
     * Gets the resource collection API of Remediations. It manages Remediation.
     *
     * @return Resource collection API of Remediations.
     */
    public Remediations remediations() {
        if (this.remediations == null) {
            this.remediations = new RemediationsImpl(clientObject.getRemediations(), this);
        }
        return remediations;
    }

    /**
     * Gets the resource collection API of PolicyEvents.
     *
     * @return Resource collection API of PolicyEvents.
     */
    public PolicyEvents policyEvents() {
        if (this.policyEvents == null) {
            this.policyEvents = new PolicyEventsImpl(clientObject.getPolicyEvents(), this);
        }
        return policyEvents;
    }

    /**
     * Gets the resource collection API of PolicyStates.
     *
     * @return Resource collection API of PolicyStates.
     */
    public PolicyStates policyStates() {
        if (this.policyStates == null) {
            this.policyStates = new PolicyStatesImpl(clientObject.getPolicyStates(), this);
        }
        return policyStates;
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
     * Gets the resource collection API of PolicyMetadatas.
     *
     * @return Resource collection API of PolicyMetadatas.
     */
    public PolicyMetadatas policyMetadatas() {
        if (this.policyMetadatas == null) {
            this.policyMetadatas = new PolicyMetadatasImpl(clientObject.getPolicyMetadatas(), this);
        }
        return policyMetadatas;
    }

    /**
     * Gets the resource collection API of PolicyRestrictions.
     *
     * @return Resource collection API of PolicyRestrictions.
     */
    public PolicyRestrictions policyRestrictions() {
        if (this.policyRestrictions == null) {
            this.policyRestrictions = new PolicyRestrictionsImpl(clientObject.getPolicyRestrictions(), this);
        }
        return policyRestrictions;
    }

    /**
     * Gets the resource collection API of Attestations. It manages Attestation.
     *
     * @return Resource collection API of Attestations.
     */
    public Attestations attestations() {
        if (this.attestations == null) {
            this.attestations = new AttestationsImpl(clientObject.getAttestations(), this);
        }
        return attestations;
    }

    /**
     * @return Wrapped service client PolicyInsightsClient providing direct access to the underlying auto-generated API
     *     implementation, based on Azure REST API.
     */
    public PolicyInsightsClient serviceClient() {
        return this.clientObject;
    }
}
