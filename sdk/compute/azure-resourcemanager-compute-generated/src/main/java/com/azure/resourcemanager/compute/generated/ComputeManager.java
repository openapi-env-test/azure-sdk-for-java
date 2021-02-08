// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

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
import com.azure.resourcemanager.compute.generated.fluent.ComputeManagementClient;
import com.azure.resourcemanager.compute.generated.implementation.CloudServiceRoleInstancesImpl;
import com.azure.resourcemanager.compute.generated.implementation.CloudServiceRolesImpl;
import com.azure.resourcemanager.compute.generated.implementation.CloudServicesImpl;
import com.azure.resourcemanager.compute.generated.implementation.CloudServicesUpdateDomainsImpl;
import com.azure.resourcemanager.compute.generated.implementation.ComputeManagementClientBuilder;
import com.azure.resourcemanager.compute.generated.models.CloudServiceRoleInstances;
import com.azure.resourcemanager.compute.generated.models.CloudServiceRoles;
import com.azure.resourcemanager.compute.generated.models.CloudServices;
import com.azure.resourcemanager.compute.generated.models.CloudServicesUpdateDomains;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Entry point to ComputeManager. Compute Client. */
public final class ComputeManager {
    private CloudServiceRoleInstances cloudServiceRoleInstances;

    private CloudServiceRoles cloudServiceRoles;

    private CloudServices cloudServices;

    private CloudServicesUpdateDomains cloudServicesUpdateDomains;

    private final ComputeManagementClient clientObject;

    private ComputeManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new ComputeManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of Compute service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the Compute service API instance.
     */
    public static ComputeManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create ComputeManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new ComputeManager.Configurable();
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
         * Creates an instance of Compute service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the Compute service API instance.
         */
        public ComputeManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.compute.generated")
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
            return new ComputeManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of CloudServiceRoleInstances. */
    public CloudServiceRoleInstances cloudServiceRoleInstances() {
        if (this.cloudServiceRoleInstances == null) {
            this.cloudServiceRoleInstances =
                new CloudServiceRoleInstancesImpl(clientObject.getCloudServiceRoleInstances(), this);
        }
        return cloudServiceRoleInstances;
    }

    /** @return Resource collection API of CloudServiceRoles. */
    public CloudServiceRoles cloudServiceRoles() {
        if (this.cloudServiceRoles == null) {
            this.cloudServiceRoles = new CloudServiceRolesImpl(clientObject.getCloudServiceRoles(), this);
        }
        return cloudServiceRoles;
    }

    /** @return Resource collection API of CloudServices. */
    public CloudServices cloudServices() {
        if (this.cloudServices == null) {
            this.cloudServices = new CloudServicesImpl(clientObject.getCloudServices(), this);
        }
        return cloudServices;
    }

    /** @return Resource collection API of CloudServicesUpdateDomains. */
    public CloudServicesUpdateDomains cloudServicesUpdateDomains() {
        if (this.cloudServicesUpdateDomains == null) {
            this.cloudServicesUpdateDomains =
                new CloudServicesUpdateDomainsImpl(clientObject.getCloudServicesUpdateDomains(), this);
        }
        return cloudServicesUpdateDomains;
    }

    /**
     * @return Wrapped service client ComputeManagementClient providing direct access to the underlying auto-generated
     *     API implementation, based on Azure REST API.
     */
    public ComputeManagementClient serviceClient() {
        return this.clientObject;
    }
}
