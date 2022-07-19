// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning;

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
import com.azure.resourcemanager.machinelearning.fluent.AzureMachineLearningWorkspaces;
import com.azure.resourcemanager.machinelearning.implementation.AzureMachineLearningWorkspacesBuilder;
import com.azure.resourcemanager.machinelearning.implementation.BatchDeploymentsImpl;
import com.azure.resourcemanager.machinelearning.implementation.BatchEndpointsImpl;
import com.azure.resourcemanager.machinelearning.implementation.CodeContainersImpl;
import com.azure.resourcemanager.machinelearning.implementation.CodeVersionsImpl;
import com.azure.resourcemanager.machinelearning.implementation.ComponentContainersImpl;
import com.azure.resourcemanager.machinelearning.implementation.ComponentVersionsImpl;
import com.azure.resourcemanager.machinelearning.implementation.ComputesImpl;
import com.azure.resourcemanager.machinelearning.implementation.DataContainersImpl;
import com.azure.resourcemanager.machinelearning.implementation.DataVersionsImpl;
import com.azure.resourcemanager.machinelearning.implementation.DatastoresImpl;
import com.azure.resourcemanager.machinelearning.implementation.EnvironmentContainersImpl;
import com.azure.resourcemanager.machinelearning.implementation.EnvironmentVersionsImpl;
import com.azure.resourcemanager.machinelearning.implementation.JobsImpl;
import com.azure.resourcemanager.machinelearning.implementation.ModelContainersImpl;
import com.azure.resourcemanager.machinelearning.implementation.ModelVersionsImpl;
import com.azure.resourcemanager.machinelearning.implementation.OnlineDeploymentsImpl;
import com.azure.resourcemanager.machinelearning.implementation.OnlineEndpointsImpl;
import com.azure.resourcemanager.machinelearning.implementation.OperationsImpl;
import com.azure.resourcemanager.machinelearning.implementation.PrivateEndpointConnectionsImpl;
import com.azure.resourcemanager.machinelearning.implementation.PrivateLinkResourcesImpl;
import com.azure.resourcemanager.machinelearning.implementation.QuotasImpl;
import com.azure.resourcemanager.machinelearning.implementation.UsagesImpl;
import com.azure.resourcemanager.machinelearning.implementation.VirtualMachineSizesImpl;
import com.azure.resourcemanager.machinelearning.implementation.WorkspaceConnectionsImpl;
import com.azure.resourcemanager.machinelearning.implementation.WorkspaceFeaturesImpl;
import com.azure.resourcemanager.machinelearning.implementation.WorkspacesImpl;
import com.azure.resourcemanager.machinelearning.models.BatchDeployments;
import com.azure.resourcemanager.machinelearning.models.BatchEndpoints;
import com.azure.resourcemanager.machinelearning.models.CodeContainers;
import com.azure.resourcemanager.machinelearning.models.CodeVersions;
import com.azure.resourcemanager.machinelearning.models.ComponentContainers;
import com.azure.resourcemanager.machinelearning.models.ComponentVersions;
import com.azure.resourcemanager.machinelearning.models.Computes;
import com.azure.resourcemanager.machinelearning.models.DataContainers;
import com.azure.resourcemanager.machinelearning.models.DataVersions;
import com.azure.resourcemanager.machinelearning.models.Datastores;
import com.azure.resourcemanager.machinelearning.models.EnvironmentContainers;
import com.azure.resourcemanager.machinelearning.models.EnvironmentVersions;
import com.azure.resourcemanager.machinelearning.models.Jobs;
import com.azure.resourcemanager.machinelearning.models.ModelContainers;
import com.azure.resourcemanager.machinelearning.models.ModelVersions;
import com.azure.resourcemanager.machinelearning.models.OnlineDeployments;
import com.azure.resourcemanager.machinelearning.models.OnlineEndpoints;
import com.azure.resourcemanager.machinelearning.models.Operations;
import com.azure.resourcemanager.machinelearning.models.PrivateEndpointConnections;
import com.azure.resourcemanager.machinelearning.models.PrivateLinkResources;
import com.azure.resourcemanager.machinelearning.models.Quotas;
import com.azure.resourcemanager.machinelearning.models.Usages;
import com.azure.resourcemanager.machinelearning.models.VirtualMachineSizes;
import com.azure.resourcemanager.machinelearning.models.WorkspaceConnections;
import com.azure.resourcemanager.machinelearning.models.WorkspaceFeatures;
import com.azure.resourcemanager.machinelearning.models.Workspaces;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Entry point to MachineLearningManager. These APIs allow end users to operate on Azure Machine Learning Workspace
 * resources.
 */
public final class MachineLearningManager {
    private Operations operations;

    private Workspaces workspaces;

    private Usages usages;

    private VirtualMachineSizes virtualMachineSizes;

    private Quotas quotas;

    private Computes computes;

    private PrivateEndpointConnections privateEndpointConnections;

    private PrivateLinkResources privateLinkResources;

    private WorkspaceConnections workspaceConnections;

    private BatchEndpoints batchEndpoints;

    private BatchDeployments batchDeployments;

    private CodeContainers codeContainers;

    private CodeVersions codeVersions;

    private ComponentContainers componentContainers;

    private ComponentVersions componentVersions;

    private DataContainers dataContainers;

    private DataVersions dataVersions;

    private Datastores datastores;

    private EnvironmentContainers environmentContainers;

    private EnvironmentVersions environmentVersions;

    private Jobs jobs;

    private ModelContainers modelContainers;

    private ModelVersions modelVersions;

    private OnlineEndpoints onlineEndpoints;

    private OnlineDeployments onlineDeployments;

    private WorkspaceFeatures workspaceFeatures;

    private final AzureMachineLearningWorkspaces clientObject;

    private MachineLearningManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new AzureMachineLearningWorkspacesBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of Machine Learning service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the Machine Learning service API instance.
     */
    public static MachineLearningManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of Machine Learning service API entry point.
     *
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the Machine Learning service API instance.
     */
    public static MachineLearningManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new MachineLearningManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create MachineLearningManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new MachineLearningManager.Configurable();
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
         * Creates an instance of Machine Learning service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the Machine Learning service API instance.
         */
        public MachineLearningManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.machinelearning")
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
            return new MachineLearningManager(httpPipeline, profile, defaultPollInterval);
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
     * Gets the resource collection API of Usages.
     *
     * @return Resource collection API of Usages.
     */
    public Usages usages() {
        if (this.usages == null) {
            this.usages = new UsagesImpl(clientObject.getUsages(), this);
        }
        return usages;
    }

    /**
     * Gets the resource collection API of VirtualMachineSizes.
     *
     * @return Resource collection API of VirtualMachineSizes.
     */
    public VirtualMachineSizes virtualMachineSizes() {
        if (this.virtualMachineSizes == null) {
            this.virtualMachineSizes = new VirtualMachineSizesImpl(clientObject.getVirtualMachineSizes(), this);
        }
        return virtualMachineSizes;
    }

    /**
     * Gets the resource collection API of Quotas.
     *
     * @return Resource collection API of Quotas.
     */
    public Quotas quotas() {
        if (this.quotas == null) {
            this.quotas = new QuotasImpl(clientObject.getQuotas(), this);
        }
        return quotas;
    }

    /**
     * Gets the resource collection API of Computes. It manages ComputeResource.
     *
     * @return Resource collection API of Computes.
     */
    public Computes computes() {
        if (this.computes == null) {
            this.computes = new ComputesImpl(clientObject.getComputes(), this);
        }
        return computes;
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
     * Gets the resource collection API of WorkspaceConnections. It manages
     * WorkspaceConnectionPropertiesV2BasicResource.
     *
     * @return Resource collection API of WorkspaceConnections.
     */
    public WorkspaceConnections workspaceConnections() {
        if (this.workspaceConnections == null) {
            this.workspaceConnections = new WorkspaceConnectionsImpl(clientObject.getWorkspaceConnections(), this);
        }
        return workspaceConnections;
    }

    /**
     * Gets the resource collection API of BatchEndpoints. It manages BatchEndpoint.
     *
     * @return Resource collection API of BatchEndpoints.
     */
    public BatchEndpoints batchEndpoints() {
        if (this.batchEndpoints == null) {
            this.batchEndpoints = new BatchEndpointsImpl(clientObject.getBatchEndpoints(), this);
        }
        return batchEndpoints;
    }

    /**
     * Gets the resource collection API of BatchDeployments. It manages BatchDeployment.
     *
     * @return Resource collection API of BatchDeployments.
     */
    public BatchDeployments batchDeployments() {
        if (this.batchDeployments == null) {
            this.batchDeployments = new BatchDeploymentsImpl(clientObject.getBatchDeployments(), this);
        }
        return batchDeployments;
    }

    /**
     * Gets the resource collection API of CodeContainers. It manages CodeContainer.
     *
     * @return Resource collection API of CodeContainers.
     */
    public CodeContainers codeContainers() {
        if (this.codeContainers == null) {
            this.codeContainers = new CodeContainersImpl(clientObject.getCodeContainers(), this);
        }
        return codeContainers;
    }

    /**
     * Gets the resource collection API of CodeVersions. It manages CodeVersion.
     *
     * @return Resource collection API of CodeVersions.
     */
    public CodeVersions codeVersions() {
        if (this.codeVersions == null) {
            this.codeVersions = new CodeVersionsImpl(clientObject.getCodeVersions(), this);
        }
        return codeVersions;
    }

    /**
     * Gets the resource collection API of ComponentContainers. It manages ComponentContainer.
     *
     * @return Resource collection API of ComponentContainers.
     */
    public ComponentContainers componentContainers() {
        if (this.componentContainers == null) {
            this.componentContainers = new ComponentContainersImpl(clientObject.getComponentContainers(), this);
        }
        return componentContainers;
    }

    /**
     * Gets the resource collection API of ComponentVersions. It manages ComponentVersion.
     *
     * @return Resource collection API of ComponentVersions.
     */
    public ComponentVersions componentVersions() {
        if (this.componentVersions == null) {
            this.componentVersions = new ComponentVersionsImpl(clientObject.getComponentVersions(), this);
        }
        return componentVersions;
    }

    /**
     * Gets the resource collection API of DataContainers. It manages DataContainer.
     *
     * @return Resource collection API of DataContainers.
     */
    public DataContainers dataContainers() {
        if (this.dataContainers == null) {
            this.dataContainers = new DataContainersImpl(clientObject.getDataContainers(), this);
        }
        return dataContainers;
    }

    /**
     * Gets the resource collection API of DataVersions. It manages DataVersionBase.
     *
     * @return Resource collection API of DataVersions.
     */
    public DataVersions dataVersions() {
        if (this.dataVersions == null) {
            this.dataVersions = new DataVersionsImpl(clientObject.getDataVersions(), this);
        }
        return dataVersions;
    }

    /**
     * Gets the resource collection API of Datastores. It manages Datastore.
     *
     * @return Resource collection API of Datastores.
     */
    public Datastores datastores() {
        if (this.datastores == null) {
            this.datastores = new DatastoresImpl(clientObject.getDatastores(), this);
        }
        return datastores;
    }

    /**
     * Gets the resource collection API of EnvironmentContainers. It manages EnvironmentContainer.
     *
     * @return Resource collection API of EnvironmentContainers.
     */
    public EnvironmentContainers environmentContainers() {
        if (this.environmentContainers == null) {
            this.environmentContainers = new EnvironmentContainersImpl(clientObject.getEnvironmentContainers(), this);
        }
        return environmentContainers;
    }

    /**
     * Gets the resource collection API of EnvironmentVersions. It manages EnvironmentVersion.
     *
     * @return Resource collection API of EnvironmentVersions.
     */
    public EnvironmentVersions environmentVersions() {
        if (this.environmentVersions == null) {
            this.environmentVersions = new EnvironmentVersionsImpl(clientObject.getEnvironmentVersions(), this);
        }
        return environmentVersions;
    }

    /**
     * Gets the resource collection API of Jobs. It manages JobBase.
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
     * Gets the resource collection API of ModelContainers. It manages ModelContainer.
     *
     * @return Resource collection API of ModelContainers.
     */
    public ModelContainers modelContainers() {
        if (this.modelContainers == null) {
            this.modelContainers = new ModelContainersImpl(clientObject.getModelContainers(), this);
        }
        return modelContainers;
    }

    /**
     * Gets the resource collection API of ModelVersions. It manages ModelVersion.
     *
     * @return Resource collection API of ModelVersions.
     */
    public ModelVersions modelVersions() {
        if (this.modelVersions == null) {
            this.modelVersions = new ModelVersionsImpl(clientObject.getModelVersions(), this);
        }
        return modelVersions;
    }

    /**
     * Gets the resource collection API of OnlineEndpoints. It manages OnlineEndpoint.
     *
     * @return Resource collection API of OnlineEndpoints.
     */
    public OnlineEndpoints onlineEndpoints() {
        if (this.onlineEndpoints == null) {
            this.onlineEndpoints = new OnlineEndpointsImpl(clientObject.getOnlineEndpoints(), this);
        }
        return onlineEndpoints;
    }

    /**
     * Gets the resource collection API of OnlineDeployments. It manages OnlineDeployment.
     *
     * @return Resource collection API of OnlineDeployments.
     */
    public OnlineDeployments onlineDeployments() {
        if (this.onlineDeployments == null) {
            this.onlineDeployments = new OnlineDeploymentsImpl(clientObject.getOnlineDeployments(), this);
        }
        return onlineDeployments;
    }

    /**
     * Gets the resource collection API of WorkspaceFeatures.
     *
     * @return Resource collection API of WorkspaceFeatures.
     */
    public WorkspaceFeatures workspaceFeatures() {
        if (this.workspaceFeatures == null) {
            this.workspaceFeatures = new WorkspaceFeaturesImpl(clientObject.getWorkspaceFeatures(), this);
        }
        return workspaceFeatures;
    }

    /**
     * @return Wrapped service client AzureMachineLearningWorkspaces providing direct access to the underlying
     *     auto-generated API implementation, based on Azure REST API.
     */
    public AzureMachineLearningWorkspaces serviceClient() {
        return this.clientObject;
    }
}
