// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.singularity;

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
import com.azure.resourcemanager.singularity.fluent.SingularityManagementClient;
import com.azure.resourcemanager.singularity.implementation.AccountQuotaPoliciesImpl;
import com.azure.resourcemanager.singularity.implementation.AccountsImpl;
import com.azure.resourcemanager.singularity.implementation.GroupPoliciesImpl;
import com.azure.resourcemanager.singularity.implementation.ImagesImpl;
import com.azure.resourcemanager.singularity.implementation.InstanceTypeSeriesImpl;
import com.azure.resourcemanager.singularity.implementation.JobsImpl;
import com.azure.resourcemanager.singularity.implementation.ModelsImpl;
import com.azure.resourcemanager.singularity.implementation.NetworksImpl;
import com.azure.resourcemanager.singularity.implementation.OperationsImpl;
import com.azure.resourcemanager.singularity.implementation.SingularityManagementClientBuilder;
import com.azure.resourcemanager.singularity.implementation.StorageCachesImpl;
import com.azure.resourcemanager.singularity.implementation.SubscriptionQuotasImpl;
import com.azure.resourcemanager.singularity.models.AccountQuotaPolicies;
import com.azure.resourcemanager.singularity.models.Accounts;
import com.azure.resourcemanager.singularity.models.GroupPolicies;
import com.azure.resourcemanager.singularity.models.Images;
import com.azure.resourcemanager.singularity.models.InstanceTypeSeries;
import com.azure.resourcemanager.singularity.models.Jobs;
import com.azure.resourcemanager.singularity.models.Models;
import com.azure.resourcemanager.singularity.models.Networks;
import com.azure.resourcemanager.singularity.models.Operations;
import com.azure.resourcemanager.singularity.models.StorageCaches;
import com.azure.resourcemanager.singularity.models.SubscriptionQuotas;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/** Entry point to SingularityManager. */
public final class SingularityManager {
    private AccountQuotaPolicies accountQuotaPolicies;

    private Accounts accounts;

    private GroupPolicies groupPolicies;

    private Images images;

    private InstanceTypeSeries instanceTypeSeries;

    private Jobs jobs;

    private Models models;

    private Networks networks;

    private Operations operations;

    private StorageCaches storageCaches;

    private SubscriptionQuotas subscriptionQuotas;

    private final SingularityManagementClient clientObject;

    private SingularityManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new SingularityManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of Singularity service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the Singularity service API instance.
     */
    public static SingularityManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of Singularity service API entry point.
     *
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the Singularity service API instance.
     */
    public static SingularityManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new SingularityManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create SingularityManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new SingularityManager.Configurable();
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
         * Creates an instance of Singularity service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the Singularity service API instance.
         */
        public SingularityManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.singularity")
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
            return new SingularityManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of AccountQuotaPolicies. It manages AccountQuotaPolicyResourceDescription.
     *
     * @return Resource collection API of AccountQuotaPolicies.
     */
    public AccountQuotaPolicies accountQuotaPolicies() {
        if (this.accountQuotaPolicies == null) {
            this.accountQuotaPolicies = new AccountQuotaPoliciesImpl(clientObject.getAccountQuotaPolicies(), this);
        }
        return accountQuotaPolicies;
    }

    /**
     * Gets the resource collection API of Accounts. It manages AccountResourceDescription.
     *
     * @return Resource collection API of Accounts.
     */
    public Accounts accounts() {
        if (this.accounts == null) {
            this.accounts = new AccountsImpl(clientObject.getAccounts(), this);
        }
        return accounts;
    }

    /**
     * Gets the resource collection API of GroupPolicies. It manages GroupPolicyResourceDescription.
     *
     * @return Resource collection API of GroupPolicies.
     */
    public GroupPolicies groupPolicies() {
        if (this.groupPolicies == null) {
            this.groupPolicies = new GroupPoliciesImpl(clientObject.getGroupPolicies(), this);
        }
        return groupPolicies;
    }

    /**
     * Gets the resource collection API of Images.
     *
     * @return Resource collection API of Images.
     */
    public Images images() {
        if (this.images == null) {
            this.images = new ImagesImpl(clientObject.getImages(), this);
        }
        return images;
    }

    /**
     * Gets the resource collection API of InstanceTypeSeries.
     *
     * @return Resource collection API of InstanceTypeSeries.
     */
    public InstanceTypeSeries instanceTypeSeries() {
        if (this.instanceTypeSeries == null) {
            this.instanceTypeSeries = new InstanceTypeSeriesImpl(clientObject.getInstanceTypeSeries(), this);
        }
        return instanceTypeSeries;
    }

    /**
     * Gets the resource collection API of Jobs. It manages JobResourceDescription.
     *
     * @return Resource collection API of Jobs.
     */
    public Jobs jobs() {
        if (this.jobs == null) {
            this.jobs = new JobsImpl(clientObject.getJobs(), this);
        }
        return jobs;
    }

    /**
     * Gets the resource collection API of Models. It manages ModelResourceDescription.
     *
     * @return Resource collection API of Models.
     */
    public Models models() {
        if (this.models == null) {
            this.models = new ModelsImpl(clientObject.getModels(), this);
        }
        return models;
    }

    /**
     * Gets the resource collection API of Networks. It manages NetworkResourceDescription.
     *
     * @return Resource collection API of Networks.
     */
    public Networks networks() {
        if (this.networks == null) {
            this.networks = new NetworksImpl(clientObject.getNetworks(), this);
        }
        return networks;
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
     * Gets the resource collection API of StorageCaches. It manages StorageCacheResourceDescription.
     *
     * @return Resource collection API of StorageCaches.
     */
    public StorageCaches storageCaches() {
        if (this.storageCaches == null) {
            this.storageCaches = new StorageCachesImpl(clientObject.getStorageCaches(), this);
        }
        return storageCaches;
    }

    /**
     * Gets the resource collection API of SubscriptionQuotas.
     *
     * @return Resource collection API of SubscriptionQuotas.
     */
    public SubscriptionQuotas subscriptionQuotas() {
        if (this.subscriptionQuotas == null) {
            this.subscriptionQuotas = new SubscriptionQuotasImpl(clientObject.getSubscriptionQuotas(), this);
        }
        return subscriptionQuotas;
    }

    /**
     * @return Wrapped service client SingularityManagementClient providing direct access to the underlying
     *     auto-generated API implementation, based on Azure REST API.
     */
    public SingularityManagementClient serviceClient() {
        return this.clientObject;
    }
}
