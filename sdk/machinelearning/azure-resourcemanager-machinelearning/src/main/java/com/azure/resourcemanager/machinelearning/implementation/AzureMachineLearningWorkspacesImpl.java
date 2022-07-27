// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.management.polling.PollerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.machinelearning.fluent.AzureMachineLearningWorkspaces;
import com.azure.resourcemanager.machinelearning.fluent.BatchDeploymentsClient;
import com.azure.resourcemanager.machinelearning.fluent.BatchEndpointsClient;
import com.azure.resourcemanager.machinelearning.fluent.CodeContainersClient;
import com.azure.resourcemanager.machinelearning.fluent.CodeVersionsClient;
import com.azure.resourcemanager.machinelearning.fluent.ComponentContainersClient;
import com.azure.resourcemanager.machinelearning.fluent.ComponentVersionsClient;
import com.azure.resourcemanager.machinelearning.fluent.ComputesClient;
import com.azure.resourcemanager.machinelearning.fluent.DataContainersClient;
import com.azure.resourcemanager.machinelearning.fluent.DataVersionsClient;
import com.azure.resourcemanager.machinelearning.fluent.DatastoresClient;
import com.azure.resourcemanager.machinelearning.fluent.EnvironmentContainersClient;
import com.azure.resourcemanager.machinelearning.fluent.EnvironmentVersionsClient;
import com.azure.resourcemanager.machinelearning.fluent.JobsClient;
import com.azure.resourcemanager.machinelearning.fluent.LabelingJobsClient;
import com.azure.resourcemanager.machinelearning.fluent.ModelContainersClient;
import com.azure.resourcemanager.machinelearning.fluent.ModelVersionsClient;
import com.azure.resourcemanager.machinelearning.fluent.OnlineDeploymentsClient;
import com.azure.resourcemanager.machinelearning.fluent.OnlineEndpointsClient;
import com.azure.resourcemanager.machinelearning.fluent.OperationsClient;
import com.azure.resourcemanager.machinelearning.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.machinelearning.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.machinelearning.fluent.QuotasClient;
import com.azure.resourcemanager.machinelearning.fluent.SchedulesClient;
import com.azure.resourcemanager.machinelearning.fluent.UsagesClient;
import com.azure.resourcemanager.machinelearning.fluent.VirtualMachineSizesClient;
import com.azure.resourcemanager.machinelearning.fluent.WorkspaceConnectionsClient;
import com.azure.resourcemanager.machinelearning.fluent.WorkspaceFeaturesClient;
import com.azure.resourcemanager.machinelearning.fluent.WorkspacesClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the AzureMachineLearningWorkspacesImpl type. */
@ServiceClient(builder = AzureMachineLearningWorkspacesBuilder.class)
public final class AzureMachineLearningWorkspacesImpl implements AzureMachineLearningWorkspaces {
    /** The ID of the target subscription. */
    private final String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The WorkspacesClient object to access its operations. */
    private final WorkspacesClient workspaces;

    /**
     * Gets the WorkspacesClient object to access its operations.
     *
     * @return the WorkspacesClient object.
     */
    public WorkspacesClient getWorkspaces() {
        return this.workspaces;
    }

    /** The UsagesClient object to access its operations. */
    private final UsagesClient usages;

    /**
     * Gets the UsagesClient object to access its operations.
     *
     * @return the UsagesClient object.
     */
    public UsagesClient getUsages() {
        return this.usages;
    }

    /** The VirtualMachineSizesClient object to access its operations. */
    private final VirtualMachineSizesClient virtualMachineSizes;

    /**
     * Gets the VirtualMachineSizesClient object to access its operations.
     *
     * @return the VirtualMachineSizesClient object.
     */
    public VirtualMachineSizesClient getVirtualMachineSizes() {
        return this.virtualMachineSizes;
    }

    /** The QuotasClient object to access its operations. */
    private final QuotasClient quotas;

    /**
     * Gets the QuotasClient object to access its operations.
     *
     * @return the QuotasClient object.
     */
    public QuotasClient getQuotas() {
        return this.quotas;
    }

    /** The ComputesClient object to access its operations. */
    private final ComputesClient computes;

    /**
     * Gets the ComputesClient object to access its operations.
     *
     * @return the ComputesClient object.
     */
    public ComputesClient getComputes() {
        return this.computes;
    }

    /** The PrivateEndpointConnectionsClient object to access its operations. */
    private final PrivateEndpointConnectionsClient privateEndpointConnections;

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    public PrivateEndpointConnectionsClient getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /** The PrivateLinkResourcesClient object to access its operations. */
    private final PrivateLinkResourcesClient privateLinkResources;

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    public PrivateLinkResourcesClient getPrivateLinkResources() {
        return this.privateLinkResources;
    }

    /** The WorkspaceConnectionsClient object to access its operations. */
    private final WorkspaceConnectionsClient workspaceConnections;

    /**
     * Gets the WorkspaceConnectionsClient object to access its operations.
     *
     * @return the WorkspaceConnectionsClient object.
     */
    public WorkspaceConnectionsClient getWorkspaceConnections() {
        return this.workspaceConnections;
    }

    /** The BatchEndpointsClient object to access its operations. */
    private final BatchEndpointsClient batchEndpoints;

    /**
     * Gets the BatchEndpointsClient object to access its operations.
     *
     * @return the BatchEndpointsClient object.
     */
    public BatchEndpointsClient getBatchEndpoints() {
        return this.batchEndpoints;
    }

    /** The BatchDeploymentsClient object to access its operations. */
    private final BatchDeploymentsClient batchDeployments;

    /**
     * Gets the BatchDeploymentsClient object to access its operations.
     *
     * @return the BatchDeploymentsClient object.
     */
    public BatchDeploymentsClient getBatchDeployments() {
        return this.batchDeployments;
    }

    /** The CodeContainersClient object to access its operations. */
    private final CodeContainersClient codeContainers;

    /**
     * Gets the CodeContainersClient object to access its operations.
     *
     * @return the CodeContainersClient object.
     */
    public CodeContainersClient getCodeContainers() {
        return this.codeContainers;
    }

    /** The CodeVersionsClient object to access its operations. */
    private final CodeVersionsClient codeVersions;

    /**
     * Gets the CodeVersionsClient object to access its operations.
     *
     * @return the CodeVersionsClient object.
     */
    public CodeVersionsClient getCodeVersions() {
        return this.codeVersions;
    }

    /** The ComponentContainersClient object to access its operations. */
    private final ComponentContainersClient componentContainers;

    /**
     * Gets the ComponentContainersClient object to access its operations.
     *
     * @return the ComponentContainersClient object.
     */
    public ComponentContainersClient getComponentContainers() {
        return this.componentContainers;
    }

    /** The ComponentVersionsClient object to access its operations. */
    private final ComponentVersionsClient componentVersions;

    /**
     * Gets the ComponentVersionsClient object to access its operations.
     *
     * @return the ComponentVersionsClient object.
     */
    public ComponentVersionsClient getComponentVersions() {
        return this.componentVersions;
    }

    /** The DataContainersClient object to access its operations. */
    private final DataContainersClient dataContainers;

    /**
     * Gets the DataContainersClient object to access its operations.
     *
     * @return the DataContainersClient object.
     */
    public DataContainersClient getDataContainers() {
        return this.dataContainers;
    }

    /** The DataVersionsClient object to access its operations. */
    private final DataVersionsClient dataVersions;

    /**
     * Gets the DataVersionsClient object to access its operations.
     *
     * @return the DataVersionsClient object.
     */
    public DataVersionsClient getDataVersions() {
        return this.dataVersions;
    }

    /** The DatastoresClient object to access its operations. */
    private final DatastoresClient datastores;

    /**
     * Gets the DatastoresClient object to access its operations.
     *
     * @return the DatastoresClient object.
     */
    public DatastoresClient getDatastores() {
        return this.datastores;
    }

    /** The EnvironmentContainersClient object to access its operations. */
    private final EnvironmentContainersClient environmentContainers;

    /**
     * Gets the EnvironmentContainersClient object to access its operations.
     *
     * @return the EnvironmentContainersClient object.
     */
    public EnvironmentContainersClient getEnvironmentContainers() {
        return this.environmentContainers;
    }

    /** The EnvironmentVersionsClient object to access its operations. */
    private final EnvironmentVersionsClient environmentVersions;

    /**
     * Gets the EnvironmentVersionsClient object to access its operations.
     *
     * @return the EnvironmentVersionsClient object.
     */
    public EnvironmentVersionsClient getEnvironmentVersions() {
        return this.environmentVersions;
    }

    /** The JobsClient object to access its operations. */
    private final JobsClient jobs;

    /**
     * Gets the JobsClient object to access its operations.
     *
     * @return the JobsClient object.
     */
    public JobsClient getJobs() {
        return this.jobs;
    }

    /** The LabelingJobsClient object to access its operations. */
    private final LabelingJobsClient labelingJobs;

    /**
     * Gets the LabelingJobsClient object to access its operations.
     *
     * @return the LabelingJobsClient object.
     */
    public LabelingJobsClient getLabelingJobs() {
        return this.labelingJobs;
    }

    /** The ModelContainersClient object to access its operations. */
    private final ModelContainersClient modelContainers;

    /**
     * Gets the ModelContainersClient object to access its operations.
     *
     * @return the ModelContainersClient object.
     */
    public ModelContainersClient getModelContainers() {
        return this.modelContainers;
    }

    /** The ModelVersionsClient object to access its operations. */
    private final ModelVersionsClient modelVersions;

    /**
     * Gets the ModelVersionsClient object to access its operations.
     *
     * @return the ModelVersionsClient object.
     */
    public ModelVersionsClient getModelVersions() {
        return this.modelVersions;
    }

    /** The OnlineEndpointsClient object to access its operations. */
    private final OnlineEndpointsClient onlineEndpoints;

    /**
     * Gets the OnlineEndpointsClient object to access its operations.
     *
     * @return the OnlineEndpointsClient object.
     */
    public OnlineEndpointsClient getOnlineEndpoints() {
        return this.onlineEndpoints;
    }

    /** The OnlineDeploymentsClient object to access its operations. */
    private final OnlineDeploymentsClient onlineDeployments;

    /**
     * Gets the OnlineDeploymentsClient object to access its operations.
     *
     * @return the OnlineDeploymentsClient object.
     */
    public OnlineDeploymentsClient getOnlineDeployments() {
        return this.onlineDeployments;
    }

    /** The SchedulesClient object to access its operations. */
    private final SchedulesClient schedules;

    /**
     * Gets the SchedulesClient object to access its operations.
     *
     * @return the SchedulesClient object.
     */
    public SchedulesClient getSchedules() {
        return this.schedules;
    }

    /** The WorkspaceFeaturesClient object to access its operations. */
    private final WorkspaceFeaturesClient workspaceFeatures;

    /**
     * Gets the WorkspaceFeaturesClient object to access its operations.
     *
     * @return the WorkspaceFeaturesClient object.
     */
    public WorkspaceFeaturesClient getWorkspaceFeatures() {
        return this.workspaceFeatures;
    }

    /**
     * Initializes an instance of AzureMachineLearningWorkspaces client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The ID of the target subscription.
     * @param endpoint server parameter.
     */
    AzureMachineLearningWorkspacesImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2022-06-01-preview";
        this.operations = new OperationsClientImpl(this);
        this.workspaces = new WorkspacesClientImpl(this);
        this.usages = new UsagesClientImpl(this);
        this.virtualMachineSizes = new VirtualMachineSizesClientImpl(this);
        this.quotas = new QuotasClientImpl(this);
        this.computes = new ComputesClientImpl(this);
        this.privateEndpointConnections = new PrivateEndpointConnectionsClientImpl(this);
        this.privateLinkResources = new PrivateLinkResourcesClientImpl(this);
        this.workspaceConnections = new WorkspaceConnectionsClientImpl(this);
        this.batchEndpoints = new BatchEndpointsClientImpl(this);
        this.batchDeployments = new BatchDeploymentsClientImpl(this);
        this.codeContainers = new CodeContainersClientImpl(this);
        this.codeVersions = new CodeVersionsClientImpl(this);
        this.componentContainers = new ComponentContainersClientImpl(this);
        this.componentVersions = new ComponentVersionsClientImpl(this);
        this.dataContainers = new DataContainersClientImpl(this);
        this.dataVersions = new DataVersionsClientImpl(this);
        this.datastores = new DatastoresClientImpl(this);
        this.environmentContainers = new EnvironmentContainersClientImpl(this);
        this.environmentVersions = new EnvironmentVersionsClientImpl(this);
        this.jobs = new JobsClientImpl(this);
        this.labelingJobs = new LabelingJobsClientImpl(this);
        this.modelContainers = new ModelContainersClientImpl(this);
        this.modelVersions = new ModelVersionsClientImpl(this);
        this.onlineEndpoints = new OnlineEndpointsClientImpl(this);
        this.onlineDeployments = new OnlineDeploymentsClientImpl(this);
        this.schedules = new SchedulesClientImpl(this);
        this.workspaceFeatures = new WorkspaceFeaturesClientImpl(this);
    }

    /**
     * Gets default client context.
     *
     * @return the default client context.
     */
    public Context getContext() {
        return Context.NONE;
    }

    /**
     * Merges default client context with provided context.
     *
     * @param context the context to be merged with default client context.
     * @return the merged context.
     */
    public Context mergeContext(Context context) {
        return CoreUtils.mergeContexts(this.getContext(), context);
    }

    /**
     * Gets long running operation result.
     *
     * @param activationResponse the response of activation operation.
     * @param httpPipeline the http pipeline.
     * @param pollResultType type of poll result.
     * @param finalResultType type of final result.
     * @param context the context shared by all requests.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return poller flux for poll result and final result.
     */
    public <T, U> PollerFlux<PollResult<T>, U> getLroResult(
        Mono<Response<Flux<ByteBuffer>>> activationResponse,
        HttpPipeline httpPipeline,
        Type pollResultType,
        Type finalResultType,
        Context context) {
        return PollerFactory
            .create(
                serializerAdapter,
                httpPipeline,
                pollResultType,
                finalResultType,
                defaultPollInterval,
                activationResponse,
                context);
    }

    /**
     * Gets the final result, or an error, based on last async poll response.
     *
     * @param response the last async poll response.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return the final result, or an error.
     */
    public <T, U> Mono<U> getLroFinalResultOrError(AsyncPollResponse<PollResult<T>, U> response) {
        if (response.getStatus() != LongRunningOperationStatus.SUCCESSFULLY_COMPLETED) {
            String errorMessage;
            ManagementError managementError = null;
            HttpResponse errorResponse = null;
            PollResult.Error lroError = response.getValue().getError();
            if (lroError != null) {
                errorResponse =
                    new HttpResponseImpl(
                        lroError.getResponseStatusCode(), lroError.getResponseHeaders(), lroError.getResponseBody());

                errorMessage = response.getValue().getError().getMessage();
                String errorBody = response.getValue().getError().getResponseBody();
                if (errorBody != null) {
                    // try to deserialize error body to ManagementError
                    try {
                        managementError =
                            this
                                .getSerializerAdapter()
                                .deserialize(errorBody, ManagementError.class, SerializerEncoding.JSON);
                        if (managementError.getCode() == null || managementError.getMessage() == null) {
                            managementError = null;
                        }
                    } catch (IOException | RuntimeException ioe) {
                        LOGGER.logThrowableAsWarning(ioe);
                    }
                }
            } else {
                // fallback to default error message
                errorMessage = "Long running operation failed.";
            }
            if (managementError == null) {
                // fallback to default ManagementError
                managementError = new ManagementError(response.getStatus().toString(), errorMessage);
            }
            return Mono.error(new ManagementException(errorMessage, errorResponse, managementError));
        } else {
            return response.getFinalResult();
        }
    }

    private static final class HttpResponseImpl extends HttpResponse {
        private final int statusCode;

        private final byte[] responseBody;

        private final HttpHeaders httpHeaders;

        HttpResponseImpl(int statusCode, HttpHeaders httpHeaders, String responseBody) {
            super(null);
            this.statusCode = statusCode;
            this.httpHeaders = httpHeaders;
            this.responseBody = responseBody == null ? null : responseBody.getBytes(StandardCharsets.UTF_8);
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getHeaderValue(String s) {
            return httpHeaders.getValue(s);
        }

        public HttpHeaders getHeaders() {
            return httpHeaders;
        }

        public Flux<ByteBuffer> getBody() {
            return Flux.just(ByteBuffer.wrap(responseBody));
        }

        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.just(responseBody);
        }

        public Mono<String> getBodyAsString() {
            return Mono.just(new String(responseBody, StandardCharsets.UTF_8));
        }

        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.just(new String(responseBody, charset));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureMachineLearningWorkspacesImpl.class);
}
