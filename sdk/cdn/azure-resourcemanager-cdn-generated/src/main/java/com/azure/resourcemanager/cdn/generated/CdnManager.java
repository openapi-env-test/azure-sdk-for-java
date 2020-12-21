// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

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
import com.azure.resourcemanager.cdn.generated.fluent.CdnManagementClient;
import com.azure.resourcemanager.cdn.generated.implementation.AfdCustomDomainsImpl;
import com.azure.resourcemanager.cdn.generated.implementation.AfdEndpointsImpl;
import com.azure.resourcemanager.cdn.generated.implementation.AfdOriginGroupsImpl;
import com.azure.resourcemanager.cdn.generated.implementation.AfdOriginsImpl;
import com.azure.resourcemanager.cdn.generated.implementation.AfdProfilesImpl;
import com.azure.resourcemanager.cdn.generated.implementation.CdnManagementClientBuilder;
import com.azure.resourcemanager.cdn.generated.implementation.CustomDomainsImpl;
import com.azure.resourcemanager.cdn.generated.implementation.EdgeNodesImpl;
import com.azure.resourcemanager.cdn.generated.implementation.EndpointsImpl;
import com.azure.resourcemanager.cdn.generated.implementation.LogAnalyticsImpl;
import com.azure.resourcemanager.cdn.generated.implementation.ManagedRuleSetsImpl;
import com.azure.resourcemanager.cdn.generated.implementation.OperationsImpl;
import com.azure.resourcemanager.cdn.generated.implementation.OriginGroupsImpl;
import com.azure.resourcemanager.cdn.generated.implementation.OriginsImpl;
import com.azure.resourcemanager.cdn.generated.implementation.PoliciesImpl;
import com.azure.resourcemanager.cdn.generated.implementation.ProfilesImpl;
import com.azure.resourcemanager.cdn.generated.implementation.ProfilesTestsImpl;
import com.azure.resourcemanager.cdn.generated.implementation.ResourceProvidersImpl;
import com.azure.resourcemanager.cdn.generated.implementation.ResourceUsagesImpl;
import com.azure.resourcemanager.cdn.generated.implementation.RoutesImpl;
import com.azure.resourcemanager.cdn.generated.implementation.RuleSetsImpl;
import com.azure.resourcemanager.cdn.generated.implementation.RulesImpl;
import com.azure.resourcemanager.cdn.generated.implementation.SecretsImpl;
import com.azure.resourcemanager.cdn.generated.implementation.SecurityPoliciesImpl;
import com.azure.resourcemanager.cdn.generated.implementation.ValidatesImpl;
import com.azure.resourcemanager.cdn.generated.models.AfdCustomDomains;
import com.azure.resourcemanager.cdn.generated.models.AfdEndpoints;
import com.azure.resourcemanager.cdn.generated.models.AfdOriginGroups;
import com.azure.resourcemanager.cdn.generated.models.AfdOrigins;
import com.azure.resourcemanager.cdn.generated.models.AfdProfiles;
import com.azure.resourcemanager.cdn.generated.models.CustomDomains;
import com.azure.resourcemanager.cdn.generated.models.EdgeNodes;
import com.azure.resourcemanager.cdn.generated.models.Endpoints;
import com.azure.resourcemanager.cdn.generated.models.LogAnalytics;
import com.azure.resourcemanager.cdn.generated.models.ManagedRuleSets;
import com.azure.resourcemanager.cdn.generated.models.Operations;
import com.azure.resourcemanager.cdn.generated.models.OriginGroups;
import com.azure.resourcemanager.cdn.generated.models.Origins;
import com.azure.resourcemanager.cdn.generated.models.Policies;
import com.azure.resourcemanager.cdn.generated.models.Profiles;
import com.azure.resourcemanager.cdn.generated.models.ProfilesTests;
import com.azure.resourcemanager.cdn.generated.models.ResourceProviders;
import com.azure.resourcemanager.cdn.generated.models.ResourceUsages;
import com.azure.resourcemanager.cdn.generated.models.Routes;
import com.azure.resourcemanager.cdn.generated.models.RuleSets;
import com.azure.resourcemanager.cdn.generated.models.Rules;
import com.azure.resourcemanager.cdn.generated.models.Secrets;
import com.azure.resourcemanager.cdn.generated.models.SecurityPolicies;
import com.azure.resourcemanager.cdn.generated.models.Validates;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Entry point to CdnManager. Cdn Management Client. */
public final class CdnManager {
    private ProfilesTests profilesTests;

    private Profiles profiles;

    private Endpoints endpoints;

    private Origins origins;

    private OriginGroups originGroups;

    private CustomDomains customDomains;

    private ResourceProviders resourceProviders;

    private ResourceUsages resourceUsages;

    private Operations operations;

    private EdgeNodes edgeNodes;

    private AfdProfiles afdProfiles;

    private AfdCustomDomains afdCustomDomains;

    private AfdEndpoints afdEndpoints;

    private AfdOriginGroups afdOriginGroups;

    private AfdOrigins afdOrigins;

    private Routes routes;

    private RuleSets ruleSets;

    private Rules rules;

    private SecurityPolicies securityPolicies;

    private Secrets secrets;

    private Validates validates;

    private LogAnalytics logAnalytics;

    private Policies policies;

    private ManagedRuleSets managedRuleSets;

    private final CdnManagementClient clientObject;

    private CdnManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new CdnManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of Cdn service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the Cdn service API instance.
     */
    public static CdnManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create CdnManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new CdnManager.Configurable();
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
         * Creates an instance of Cdn service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the Cdn service API instance.
         */
        public CdnManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            if (retryPolicy == null) {
                retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies
                .add(
                    new UserAgentPolicy(
                        null,
                        "com.azure.resourcemanager.cdn.generated",
                        "1.0.0-beta.1",
                        Configuration.getGlobalConfiguration()));
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
            return new CdnManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of ProfilesTests. */
    public ProfilesTests profilesTests() {
        if (this.profilesTests == null) {
            this.profilesTests = new ProfilesTestsImpl(clientObject.getProfilesTests(), this);
        }
        return profilesTests;
    }

    /** @return Resource collection API of Profiles. */
    public Profiles profiles() {
        if (this.profiles == null) {
            this.profiles = new ProfilesImpl(clientObject.getProfiles(), this);
        }
        return profiles;
    }

    /** @return Resource collection API of Endpoints. */
    public Endpoints endpoints() {
        if (this.endpoints == null) {
            this.endpoints = new EndpointsImpl(clientObject.getEndpoints(), this);
        }
        return endpoints;
    }

    /** @return Resource collection API of Origins. */
    public Origins origins() {
        if (this.origins == null) {
            this.origins = new OriginsImpl(clientObject.getOrigins(), this);
        }
        return origins;
    }

    /** @return Resource collection API of OriginGroups. */
    public OriginGroups originGroups() {
        if (this.originGroups == null) {
            this.originGroups = new OriginGroupsImpl(clientObject.getOriginGroups(), this);
        }
        return originGroups;
    }

    /** @return Resource collection API of CustomDomains. */
    public CustomDomains customDomains() {
        if (this.customDomains == null) {
            this.customDomains = new CustomDomainsImpl(clientObject.getCustomDomains(), this);
        }
        return customDomains;
    }

    /** @return Resource collection API of ResourceProviders. */
    public ResourceProviders resourceProviders() {
        if (this.resourceProviders == null) {
            this.resourceProviders = new ResourceProvidersImpl(clientObject.getResourceProviders(), this);
        }
        return resourceProviders;
    }

    /** @return Resource collection API of ResourceUsages. */
    public ResourceUsages resourceUsages() {
        if (this.resourceUsages == null) {
            this.resourceUsages = new ResourceUsagesImpl(clientObject.getResourceUsages(), this);
        }
        return resourceUsages;
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of EdgeNodes. */
    public EdgeNodes edgeNodes() {
        if (this.edgeNodes == null) {
            this.edgeNodes = new EdgeNodesImpl(clientObject.getEdgeNodes(), this);
        }
        return edgeNodes;
    }

    /** @return Resource collection API of AfdProfiles. */
    public AfdProfiles afdProfiles() {
        if (this.afdProfiles == null) {
            this.afdProfiles = new AfdProfilesImpl(clientObject.getAfdProfiles(), this);
        }
        return afdProfiles;
    }

    /** @return Resource collection API of AfdCustomDomains. */
    public AfdCustomDomains afdCustomDomains() {
        if (this.afdCustomDomains == null) {
            this.afdCustomDomains = new AfdCustomDomainsImpl(clientObject.getAfdCustomDomains(), this);
        }
        return afdCustomDomains;
    }

    /** @return Resource collection API of AfdEndpoints. */
    public AfdEndpoints afdEndpoints() {
        if (this.afdEndpoints == null) {
            this.afdEndpoints = new AfdEndpointsImpl(clientObject.getAfdEndpoints(), this);
        }
        return afdEndpoints;
    }

    /** @return Resource collection API of AfdOriginGroups. */
    public AfdOriginGroups afdOriginGroups() {
        if (this.afdOriginGroups == null) {
            this.afdOriginGroups = new AfdOriginGroupsImpl(clientObject.getAfdOriginGroups(), this);
        }
        return afdOriginGroups;
    }

    /** @return Resource collection API of AfdOrigins. */
    public AfdOrigins afdOrigins() {
        if (this.afdOrigins == null) {
            this.afdOrigins = new AfdOriginsImpl(clientObject.getAfdOrigins(), this);
        }
        return afdOrigins;
    }

    /** @return Resource collection API of Routes. */
    public Routes routes() {
        if (this.routes == null) {
            this.routes = new RoutesImpl(clientObject.getRoutes(), this);
        }
        return routes;
    }

    /** @return Resource collection API of RuleSets. */
    public RuleSets ruleSets() {
        if (this.ruleSets == null) {
            this.ruleSets = new RuleSetsImpl(clientObject.getRuleSets(), this);
        }
        return ruleSets;
    }

    /** @return Resource collection API of Rules. */
    public Rules rules() {
        if (this.rules == null) {
            this.rules = new RulesImpl(clientObject.getRules(), this);
        }
        return rules;
    }

    /** @return Resource collection API of SecurityPolicies. */
    public SecurityPolicies securityPolicies() {
        if (this.securityPolicies == null) {
            this.securityPolicies = new SecurityPoliciesImpl(clientObject.getSecurityPolicies(), this);
        }
        return securityPolicies;
    }

    /** @return Resource collection API of Secrets. */
    public Secrets secrets() {
        if (this.secrets == null) {
            this.secrets = new SecretsImpl(clientObject.getSecrets(), this);
        }
        return secrets;
    }

    /** @return Resource collection API of Validates. */
    public Validates validates() {
        if (this.validates == null) {
            this.validates = new ValidatesImpl(clientObject.getValidates(), this);
        }
        return validates;
    }

    /** @return Resource collection API of LogAnalytics. */
    public LogAnalytics logAnalytics() {
        if (this.logAnalytics == null) {
            this.logAnalytics = new LogAnalyticsImpl(clientObject.getLogAnalytics(), this);
        }
        return logAnalytics;
    }

    /** @return Resource collection API of Policies. */
    public Policies policies() {
        if (this.policies == null) {
            this.policies = new PoliciesImpl(clientObject.getPolicies(), this);
        }
        return policies;
    }

    /** @return Resource collection API of ManagedRuleSets. */
    public ManagedRuleSets managedRuleSets() {
        if (this.managedRuleSets == null) {
            this.managedRuleSets = new ManagedRuleSetsImpl(clientObject.getManagedRuleSets(), this);
        }
        return managedRuleSets;
    }

    /**
     * @return Wrapped service client CdnManagementClient providing direct access to the underlying auto-generated API
     *     implementation, based on Azure REST API.
     */
    public CdnManagementClient serviceClient() {
        return this.clientObject;
    }
}
