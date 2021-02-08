// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

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
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.sql.generated.fluent.DatabaseSecurityAlertPoliciesClient;
import com.azure.resourcemanager.sql.generated.fluent.DatabasesClient;
import com.azure.resourcemanager.sql.generated.fluent.ElasticPoolsClient;
import com.azure.resourcemanager.sql.generated.fluent.InstancePoolsClient;
import com.azure.resourcemanager.sql.generated.fluent.LongTermRetentionManagedInstanceBackupsClient;
import com.azure.resourcemanager.sql.generated.fluent.ManagedDatabaseRestoreDetailsClient;
import com.azure.resourcemanager.sql.generated.fluent.ManagedDatabaseSensitivityLabelsClient;
import com.azure.resourcemanager.sql.generated.fluent.ManagedDatabasesClient;
import com.azure.resourcemanager.sql.generated.fluent.ManagedInstanceLongTermRetentionPoliciesClient;
import com.azure.resourcemanager.sql.generated.fluent.ManagedInstanceOperationsClient;
import com.azure.resourcemanager.sql.generated.fluent.ManagedInstanceVulnerabilityAssessmentsClient;
import com.azure.resourcemanager.sql.generated.fluent.ManagedInstancesClient;
import com.azure.resourcemanager.sql.generated.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.sql.generated.fluent.ServerAzureADAdministratorsClient;
import com.azure.resourcemanager.sql.generated.fluent.ServerVulnerabilityAssessmentsClient;
import com.azure.resourcemanager.sql.generated.fluent.SqlManagementClient;
import com.azure.resourcemanager.sql.generated.fluent.UsagesClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the SqlManagementClientImpl type. */
@ServiceClient(builder = SqlManagementClientBuilder.class)
public final class SqlManagementClientImpl implements SqlManagementClient {
    private final ClientLogger logger = new ClientLogger(SqlManagementClientImpl.class);

    /** The subscription ID that identifies an Azure subscription. */
    private final String subscriptionId;

    /**
     * Gets The subscription ID that identifies an Azure subscription.
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

    /** The DatabaseSecurityAlertPoliciesClient object to access its operations. */
    private final DatabaseSecurityAlertPoliciesClient databaseSecurityAlertPolicies;

    /**
     * Gets the DatabaseSecurityAlertPoliciesClient object to access its operations.
     *
     * @return the DatabaseSecurityAlertPoliciesClient object.
     */
    public DatabaseSecurityAlertPoliciesClient getDatabaseSecurityAlertPolicies() {
        return this.databaseSecurityAlertPolicies;
    }

    /** The ManagedDatabaseSensitivityLabelsClient object to access its operations. */
    private final ManagedDatabaseSensitivityLabelsClient managedDatabaseSensitivityLabels;

    /**
     * Gets the ManagedDatabaseSensitivityLabelsClient object to access its operations.
     *
     * @return the ManagedDatabaseSensitivityLabelsClient object.
     */
    public ManagedDatabaseSensitivityLabelsClient getManagedDatabaseSensitivityLabels() {
        return this.managedDatabaseSensitivityLabels;
    }

    /** The ManagedInstanceVulnerabilityAssessmentsClient object to access its operations. */
    private final ManagedInstanceVulnerabilityAssessmentsClient managedInstanceVulnerabilityAssessments;

    /**
     * Gets the ManagedInstanceVulnerabilityAssessmentsClient object to access its operations.
     *
     * @return the ManagedInstanceVulnerabilityAssessmentsClient object.
     */
    public ManagedInstanceVulnerabilityAssessmentsClient getManagedInstanceVulnerabilityAssessments() {
        return this.managedInstanceVulnerabilityAssessments;
    }

    /** The ManagedInstanceOperationsClient object to access its operations. */
    private final ManagedInstanceOperationsClient managedInstanceOperations;

    /**
     * Gets the ManagedInstanceOperationsClient object to access its operations.
     *
     * @return the ManagedInstanceOperationsClient object.
     */
    public ManagedInstanceOperationsClient getManagedInstanceOperations() {
        return this.managedInstanceOperations;
    }

    /** The ServerVulnerabilityAssessmentsClient object to access its operations. */
    private final ServerVulnerabilityAssessmentsClient serverVulnerabilityAssessments;

    /**
     * Gets the ServerVulnerabilityAssessmentsClient object to access its operations.
     *
     * @return the ServerVulnerabilityAssessmentsClient object.
     */
    public ServerVulnerabilityAssessmentsClient getServerVulnerabilityAssessments() {
        return this.serverVulnerabilityAssessments;
    }

    /** The InstancePoolsClient object to access its operations. */
    private final InstancePoolsClient instancePools;

    /**
     * Gets the InstancePoolsClient object to access its operations.
     *
     * @return the InstancePoolsClient object.
     */
    public InstancePoolsClient getInstancePools() {
        return this.instancePools;
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

    /** The ManagedInstancesClient object to access its operations. */
    private final ManagedInstancesClient managedInstances;

    /**
     * Gets the ManagedInstancesClient object to access its operations.
     *
     * @return the ManagedInstancesClient object.
     */
    public ManagedInstancesClient getManagedInstances() {
        return this.managedInstances;
    }

    /** The ManagedDatabaseRestoreDetailsClient object to access its operations. */
    private final ManagedDatabaseRestoreDetailsClient managedDatabaseRestoreDetails;

    /**
     * Gets the ManagedDatabaseRestoreDetailsClient object to access its operations.
     *
     * @return the ManagedDatabaseRestoreDetailsClient object.
     */
    public ManagedDatabaseRestoreDetailsClient getManagedDatabaseRestoreDetails() {
        return this.managedDatabaseRestoreDetails;
    }

    /** The ManagedDatabasesClient object to access its operations. */
    private final ManagedDatabasesClient managedDatabases;

    /**
     * Gets the ManagedDatabasesClient object to access its operations.
     *
     * @return the ManagedDatabasesClient object.
     */
    public ManagedDatabasesClient getManagedDatabases() {
        return this.managedDatabases;
    }

    /** The DatabasesClient object to access its operations. */
    private final DatabasesClient databases;

    /**
     * Gets the DatabasesClient object to access its operations.
     *
     * @return the DatabasesClient object.
     */
    public DatabasesClient getDatabases() {
        return this.databases;
    }

    /** The ElasticPoolsClient object to access its operations. */
    private final ElasticPoolsClient elasticPools;

    /**
     * Gets the ElasticPoolsClient object to access its operations.
     *
     * @return the ElasticPoolsClient object.
     */
    public ElasticPoolsClient getElasticPools() {
        return this.elasticPools;
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

    /** The ServerAzureADAdministratorsClient object to access its operations. */
    private final ServerAzureADAdministratorsClient serverAzureADAdministrators;

    /**
     * Gets the ServerAzureADAdministratorsClient object to access its operations.
     *
     * @return the ServerAzureADAdministratorsClient object.
     */
    public ServerAzureADAdministratorsClient getServerAzureADAdministrators() {
        return this.serverAzureADAdministrators;
    }

    /** The ManagedInstanceLongTermRetentionPoliciesClient object to access its operations. */
    private final ManagedInstanceLongTermRetentionPoliciesClient managedInstanceLongTermRetentionPolicies;

    /**
     * Gets the ManagedInstanceLongTermRetentionPoliciesClient object to access its operations.
     *
     * @return the ManagedInstanceLongTermRetentionPoliciesClient object.
     */
    public ManagedInstanceLongTermRetentionPoliciesClient getManagedInstanceLongTermRetentionPolicies() {
        return this.managedInstanceLongTermRetentionPolicies;
    }

    /** The LongTermRetentionManagedInstanceBackupsClient object to access its operations. */
    private final LongTermRetentionManagedInstanceBackupsClient longTermRetentionManagedInstanceBackups;

    /**
     * Gets the LongTermRetentionManagedInstanceBackupsClient object to access its operations.
     *
     * @return the LongTermRetentionManagedInstanceBackupsClient object.
     */
    public LongTermRetentionManagedInstanceBackupsClient getLongTermRetentionManagedInstanceBackups() {
        return this.longTermRetentionManagedInstanceBackups;
    }

    /**
     * Initializes an instance of SqlManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The subscription ID that identifies an Azure subscription.
     * @param endpoint server parameter.
     */
    SqlManagementClientImpl(
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
        this.apiVersion = "2018-06-01-preview";
        this.databaseSecurityAlertPolicies = new DatabaseSecurityAlertPoliciesClientImpl(this);
        this.managedDatabaseSensitivityLabels = new ManagedDatabaseSensitivityLabelsClientImpl(this);
        this.managedInstanceVulnerabilityAssessments = new ManagedInstanceVulnerabilityAssessmentsClientImpl(this);
        this.managedInstanceOperations = new ManagedInstanceOperationsClientImpl(this);
        this.serverVulnerabilityAssessments = new ServerVulnerabilityAssessmentsClientImpl(this);
        this.instancePools = new InstancePoolsClientImpl(this);
        this.usages = new UsagesClientImpl(this);
        this.managedInstances = new ManagedInstancesClientImpl(this);
        this.managedDatabaseRestoreDetails = new ManagedDatabaseRestoreDetailsClientImpl(this);
        this.managedDatabases = new ManagedDatabasesClientImpl(this);
        this.databases = new DatabasesClientImpl(this);
        this.elasticPools = new ElasticPoolsClientImpl(this);
        this.privateEndpointConnections = new PrivateEndpointConnectionsClientImpl(this);
        this.serverAzureADAdministrators = new ServerAzureADAdministratorsClientImpl(this);
        this.managedInstanceLongTermRetentionPolicies = new ManagedInstanceLongTermRetentionPoliciesClientImpl(this);
        this.longTermRetentionManagedInstanceBackups = new LongTermRetentionManagedInstanceBackupsClientImpl(this);
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
        for (Map.Entry<Object, Object> entry : this.getContext().getValues().entrySet()) {
            context = context.addData(entry.getKey(), entry.getValue());
        }
        return context;
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
                    } catch (IOException ioe) {
                        logger.logThrowableAsWarning(ioe);
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
            this.responseBody = responseBody.getBytes(StandardCharsets.UTF_8);
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
}
