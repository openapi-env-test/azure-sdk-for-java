// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization;

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
import com.azure.resourcemanager.desktopvirtualization.fluent.DesktopVirtualizationApiClient;
import com.azure.resourcemanager.desktopvirtualization.implementation.ApplicationGroupsImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.ApplicationsImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.DesktopVirtualizationApiClientBuilder;
import com.azure.resourcemanager.desktopvirtualization.implementation.DesktopsImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.HostPoolsImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.MsixImagesImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.MsixPackagesImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.OperationsImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.PrivateEndpointConnectionsImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.PrivateLinkResourcesImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.ScalingPlanPooledSchedulesImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.ScalingPlansImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.SessionHostsImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.StartMenuItemsImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.UserSessionsImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.WorkspacesImpl;
import com.azure.resourcemanager.desktopvirtualization.models.ApplicationGroups;
import com.azure.resourcemanager.desktopvirtualization.models.Applications;
import com.azure.resourcemanager.desktopvirtualization.models.Desktops;
import com.azure.resourcemanager.desktopvirtualization.models.HostPools;
import com.azure.resourcemanager.desktopvirtualization.models.MsixImages;
import com.azure.resourcemanager.desktopvirtualization.models.MsixPackages;
import com.azure.resourcemanager.desktopvirtualization.models.Operations;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateEndpointConnections;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateLinkResources;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingPlanPooledSchedules;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingPlans;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHosts;
import com.azure.resourcemanager.desktopvirtualization.models.StartMenuItems;
import com.azure.resourcemanager.desktopvirtualization.models.UserSessions;
import com.azure.resourcemanager.desktopvirtualization.models.Workspaces;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/** Entry point to DesktopVirtualizationManager. */
public final class DesktopVirtualizationManager {
    private Operations operations;

    private Workspaces workspaces;

    private PrivateEndpointConnections privateEndpointConnections;

    private PrivateLinkResources privateLinkResources;

    private ScalingPlans scalingPlans;

    private ScalingPlanPooledSchedules scalingPlanPooledSchedules;

    private ApplicationGroups applicationGroups;

    private StartMenuItems startMenuItems;

    private Applications applications;

    private Desktops desktops;

    private HostPools hostPools;

    private UserSessions userSessions;

    private SessionHosts sessionHosts;

    private MsixPackages msixPackages;

    private MsixImages msixImages;

    private final DesktopVirtualizationApiClient clientObject;

    private DesktopVirtualizationManager(
        HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new DesktopVirtualizationApiClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of DesktopVirtualization service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the DesktopVirtualization service API instance.
     */
    public static DesktopVirtualizationManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of DesktopVirtualization service API entry point.
     *
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the DesktopVirtualization service API instance.
     */
    public static DesktopVirtualizationManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new DesktopVirtualizationManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create DesktopVirtualizationManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new DesktopVirtualizationManager.Configurable();
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
         * Creates an instance of DesktopVirtualization service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the DesktopVirtualization service API instance.
         */
        public DesktopVirtualizationManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.desktopvirtualization")
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
            return new DesktopVirtualizationManager(httpPipeline, profile, defaultPollInterval);
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
     * Gets the resource collection API of Workspaces. It manages Workspace.
     *
     * @return Resource collection API of Workspaces.
     */
    public Workspaces workspaces() {
        if (this.workspaces == null) {
            this.workspaces = new WorkspacesImpl(clientObject.getWorkspaces(), this);
        }
        return workspaces;
    }

    /**
     * Gets the resource collection API of PrivateEndpointConnections.
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
     * Gets the resource collection API of ScalingPlans. It manages ScalingPlan.
     *
     * @return Resource collection API of ScalingPlans.
     */
    public ScalingPlans scalingPlans() {
        if (this.scalingPlans == null) {
            this.scalingPlans = new ScalingPlansImpl(clientObject.getScalingPlans(), this);
        }
        return scalingPlans;
    }

    /**
     * Gets the resource collection API of ScalingPlanPooledSchedules. It manages ScalingPlanPooledSchedule.
     *
     * @return Resource collection API of ScalingPlanPooledSchedules.
     */
    public ScalingPlanPooledSchedules scalingPlanPooledSchedules() {
        if (this.scalingPlanPooledSchedules == null) {
            this.scalingPlanPooledSchedules =
                new ScalingPlanPooledSchedulesImpl(clientObject.getScalingPlanPooledSchedules(), this);
        }
        return scalingPlanPooledSchedules;
    }

    /**
     * Gets the resource collection API of ApplicationGroups. It manages ApplicationGroup.
     *
     * @return Resource collection API of ApplicationGroups.
     */
    public ApplicationGroups applicationGroups() {
        if (this.applicationGroups == null) {
            this.applicationGroups = new ApplicationGroupsImpl(clientObject.getApplicationGroups(), this);
        }
        return applicationGroups;
    }

    /**
     * Gets the resource collection API of StartMenuItems.
     *
     * @return Resource collection API of StartMenuItems.
     */
    public StartMenuItems startMenuItems() {
        if (this.startMenuItems == null) {
            this.startMenuItems = new StartMenuItemsImpl(clientObject.getStartMenuItems(), this);
        }
        return startMenuItems;
    }

    /**
     * Gets the resource collection API of Applications. It manages Application.
     *
     * @return Resource collection API of Applications.
     */
    public Applications applications() {
        if (this.applications == null) {
            this.applications = new ApplicationsImpl(clientObject.getApplications(), this);
        }
        return applications;
    }

    /**
     * Gets the resource collection API of Desktops.
     *
     * @return Resource collection API of Desktops.
     */
    public Desktops desktops() {
        if (this.desktops == null) {
            this.desktops = new DesktopsImpl(clientObject.getDesktops(), this);
        }
        return desktops;
    }

    /**
     * Gets the resource collection API of HostPools. It manages HostPool.
     *
     * @return Resource collection API of HostPools.
     */
    public HostPools hostPools() {
        if (this.hostPools == null) {
            this.hostPools = new HostPoolsImpl(clientObject.getHostPools(), this);
        }
        return hostPools;
    }

    /**
     * Gets the resource collection API of UserSessions.
     *
     * @return Resource collection API of UserSessions.
     */
    public UserSessions userSessions() {
        if (this.userSessions == null) {
            this.userSessions = new UserSessionsImpl(clientObject.getUserSessions(), this);
        }
        return userSessions;
    }

    /**
     * Gets the resource collection API of SessionHosts.
     *
     * @return Resource collection API of SessionHosts.
     */
    public SessionHosts sessionHosts() {
        if (this.sessionHosts == null) {
            this.sessionHosts = new SessionHostsImpl(clientObject.getSessionHosts(), this);
        }
        return sessionHosts;
    }

    /**
     * Gets the resource collection API of MsixPackages. It manages MsixPackage.
     *
     * @return Resource collection API of MsixPackages.
     */
    public MsixPackages msixPackages() {
        if (this.msixPackages == null) {
            this.msixPackages = new MsixPackagesImpl(clientObject.getMsixPackages(), this);
        }
        return msixPackages;
    }

    /**
     * Gets the resource collection API of MsixImages.
     *
     * @return Resource collection API of MsixImages.
     */
    public MsixImages msixImages() {
        if (this.msixImages == null) {
            this.msixImages = new MsixImagesImpl(clientObject.getMsixImages(), this);
        }
        return msixImages;
    }

    /**
     * @return Wrapped service client DesktopVirtualizationApiClient providing direct access to the underlying
     *     auto-generated API implementation, based on Azure REST API.
     */
    public DesktopVirtualizationApiClient serviceClient() {
        return this.clientObject;
    }
}
