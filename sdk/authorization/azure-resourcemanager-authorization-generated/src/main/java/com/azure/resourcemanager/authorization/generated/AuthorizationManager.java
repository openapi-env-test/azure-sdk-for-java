// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated;

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
import com.azure.resourcemanager.authorization.generated.fluent.AuthorizationManagementClient;
import com.azure.resourcemanager.authorization.generated.implementation.AccessReviewDefaultSettingsOperationsImpl;
import com.azure.resourcemanager.authorization.generated.implementation.AccessReviewInstanceDecisionsImpl;
import com.azure.resourcemanager.authorization.generated.implementation.AccessReviewInstanceMyDecisionsImpl;
import com.azure.resourcemanager.authorization.generated.implementation.AccessReviewInstanceOperationsImpl;
import com.azure.resourcemanager.authorization.generated.implementation.AccessReviewInstancesAssignedForMyApprovalsImpl;
import com.azure.resourcemanager.authorization.generated.implementation.AccessReviewInstancesImpl;
import com.azure.resourcemanager.authorization.generated.implementation.AccessReviewScheduleDefinitionsAssignedForMyApprovalsImpl;
import com.azure.resourcemanager.authorization.generated.implementation.AccessReviewScheduleDefinitionsImpl;
import com.azure.resourcemanager.authorization.generated.implementation.AuthorizationManagementClientBuilder;
import com.azure.resourcemanager.authorization.generated.implementation.OperationsImpl;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewDefaultSettingsOperations;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewInstanceDecisions;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewInstanceMyDecisions;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewInstanceOperations;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewInstances;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewInstancesAssignedForMyApprovals;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewScheduleDefinitions;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewScheduleDefinitionsAssignedForMyApprovals;
import com.azure.resourcemanager.authorization.generated.models.Operations;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Entry point to AuthorizationManager. Access reviews service provides the workflow for running access reviews on
 * different kind of resources.
 */
public final class AuthorizationManager {
    private Operations operations;

    private AccessReviewScheduleDefinitions accessReviewScheduleDefinitions;

    private AccessReviewInstances accessReviewInstances;

    private AccessReviewInstanceOperations accessReviewInstanceOperations;

    private AccessReviewInstanceDecisions accessReviewInstanceDecisions;

    private AccessReviewDefaultSettingsOperations accessReviewDefaultSettingsOperations;

    private AccessReviewScheduleDefinitionsAssignedForMyApprovals accessReviewScheduleDefinitionsAssignedForMyApprovals;

    private AccessReviewInstancesAssignedForMyApprovals accessReviewInstancesAssignedForMyApprovals;

    private AccessReviewInstanceMyDecisions accessReviewInstanceMyDecisions;

    private final AuthorizationManagementClient clientObject;

    private AuthorizationManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new AuthorizationManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of Authorization service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the Authorization service API instance.
     */
    public static AuthorizationManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create AuthorizationManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new AuthorizationManager.Configurable();
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
         * Creates an instance of Authorization service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the Authorization service API instance.
         */
        public AuthorizationManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.authorization.generated")
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
            return new AuthorizationManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of AccessReviewScheduleDefinitions. */
    public AccessReviewScheduleDefinitions accessReviewScheduleDefinitions() {
        if (this.accessReviewScheduleDefinitions == null) {
            this.accessReviewScheduleDefinitions =
                new AccessReviewScheduleDefinitionsImpl(clientObject.getAccessReviewScheduleDefinitions(), this);
        }
        return accessReviewScheduleDefinitions;
    }

    /** @return Resource collection API of AccessReviewInstances. */
    public AccessReviewInstances accessReviewInstances() {
        if (this.accessReviewInstances == null) {
            this.accessReviewInstances = new AccessReviewInstancesImpl(clientObject.getAccessReviewInstances(), this);
        }
        return accessReviewInstances;
    }

    /** @return Resource collection API of AccessReviewInstanceOperations. */
    public AccessReviewInstanceOperations accessReviewInstanceOperations() {
        if (this.accessReviewInstanceOperations == null) {
            this.accessReviewInstanceOperations =
                new AccessReviewInstanceOperationsImpl(clientObject.getAccessReviewInstanceOperations(), this);
        }
        return accessReviewInstanceOperations;
    }

    /** @return Resource collection API of AccessReviewInstanceDecisions. */
    public AccessReviewInstanceDecisions accessReviewInstanceDecisions() {
        if (this.accessReviewInstanceDecisions == null) {
            this.accessReviewInstanceDecisions =
                new AccessReviewInstanceDecisionsImpl(clientObject.getAccessReviewInstanceDecisions(), this);
        }
        return accessReviewInstanceDecisions;
    }

    /** @return Resource collection API of AccessReviewDefaultSettingsOperations. */
    public AccessReviewDefaultSettingsOperations accessReviewDefaultSettingsOperations() {
        if (this.accessReviewDefaultSettingsOperations == null) {
            this.accessReviewDefaultSettingsOperations =
                new AccessReviewDefaultSettingsOperationsImpl(
                    clientObject.getAccessReviewDefaultSettingsOperations(), this);
        }
        return accessReviewDefaultSettingsOperations;
    }

    /** @return Resource collection API of AccessReviewScheduleDefinitionsAssignedForMyApprovals. */
    public AccessReviewScheduleDefinitionsAssignedForMyApprovals
        accessReviewScheduleDefinitionsAssignedForMyApprovals() {
        if (this.accessReviewScheduleDefinitionsAssignedForMyApprovals == null) {
            this.accessReviewScheduleDefinitionsAssignedForMyApprovals =
                new AccessReviewScheduleDefinitionsAssignedForMyApprovalsImpl(
                    clientObject.getAccessReviewScheduleDefinitionsAssignedForMyApprovals(), this);
        }
        return accessReviewScheduleDefinitionsAssignedForMyApprovals;
    }

    /** @return Resource collection API of AccessReviewInstancesAssignedForMyApprovals. */
    public AccessReviewInstancesAssignedForMyApprovals accessReviewInstancesAssignedForMyApprovals() {
        if (this.accessReviewInstancesAssignedForMyApprovals == null) {
            this.accessReviewInstancesAssignedForMyApprovals =
                new AccessReviewInstancesAssignedForMyApprovalsImpl(
                    clientObject.getAccessReviewInstancesAssignedForMyApprovals(), this);
        }
        return accessReviewInstancesAssignedForMyApprovals;
    }

    /** @return Resource collection API of AccessReviewInstanceMyDecisions. */
    public AccessReviewInstanceMyDecisions accessReviewInstanceMyDecisions() {
        if (this.accessReviewInstanceMyDecisions == null) {
            this.accessReviewInstanceMyDecisions =
                new AccessReviewInstanceMyDecisionsImpl(clientObject.getAccessReviewInstanceMyDecisions(), this);
        }
        return accessReviewInstanceMyDecisions;
    }

    /**
     * @return Wrapped service client AuthorizationManagementClient providing direct access to the underlying
     *     auto-generated API implementation, based on Azure REST API.
     */
    public AuthorizationManagementClient serviceClient() {
        return this.clientObject;
    }
}
