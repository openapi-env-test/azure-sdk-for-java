// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.confidentialledger.confidentialledger;

import com.azure.confidentialledger.confidentialledger.implementation.ConfidentialLedgerClientImpl;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddHeadersPolicy;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.serializer.JacksonAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/** A builder for creating a new instance of the ConfidentialLedgerClient type. */
@ServiceClientBuilder(serviceClients = {ConfidentialLedgerClient.class, ConfidentialLedgerAsyncClient.class})
public final class ConfidentialLedgerClientBuilder {
    @Generated private static final String SDK_NAME = "name";

    @Generated private static final String SDK_VERSION = "version";

    @Generated
    private final Map<String, String> properties =
            CoreUtils.getProperties("azure-confidentialledger-confidentialledger.properties");

    /** Create an instance of the ConfidentialLedgerClientBuilder. */
    @Generated
    public ConfidentialLedgerClientBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * The Confidential Ledger URL, for example
     * https://contoso.confidentialledger.azure.com
     */
    @Generated private String ledgerUri;

    /**
     * Sets The Confidential Ledger URL, for example https://contoso.confidentialledger.azure.com.
     *
     * @param ledgerUri the ledgerUri value.
     * @return the ConfidentialLedgerClientBuilder.
     */
    @Generated
    public ConfidentialLedgerClientBuilder ledgerUri(String ledgerUri) {
        this.ledgerUri = ledgerUri;
        return this;
    }

    /*
     * Service version
     */
    @Generated private ConfidentialLedgerServiceVersion serviceVersion;

    /**
     * Sets Service version.
     *
     * @param serviceVersion the serviceVersion value.
     * @return the ConfidentialLedgerClientBuilder.
     */
    @Generated
    public ConfidentialLedgerClientBuilder serviceVersion(ConfidentialLedgerServiceVersion serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    @Generated private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the ConfidentialLedgerClientBuilder.
     */
    @Generated
    public ConfidentialLedgerClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The HTTP client used to send the request.
     */
    @Generated private HttpClient httpClient;

    /**
     * Sets The HTTP client used to send the request.
     *
     * @param httpClient the httpClient value.
     * @return the ConfidentialLedgerClientBuilder.
     */
    @Generated
    public ConfidentialLedgerClientBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /*
     * The configuration store that is used during construction of the service
     * client.
     */
    @Generated private Configuration configuration;

    /**
     * Sets The configuration store that is used during construction of the service client.
     *
     * @param configuration the configuration value.
     * @return the ConfidentialLedgerClientBuilder.
     */
    @Generated
    public ConfidentialLedgerClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * The logging configuration for HTTP requests and responses.
     */
    @Generated private HttpLogOptions httpLogOptions;

    /**
     * Sets The logging configuration for HTTP requests and responses.
     *
     * @param httpLogOptions the httpLogOptions value.
     * @return the ConfidentialLedgerClientBuilder.
     */
    @Generated
    public ConfidentialLedgerClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        this.httpLogOptions = httpLogOptions;
        return this;
    }

    /*
     * The retry policy that will attempt to retry failed requests, if
     * applicable.
     */
    @Generated private RetryPolicy retryPolicy;

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     *
     * @param retryPolicy the retryPolicy value.
     * @return the ConfidentialLedgerClientBuilder.
     */
    @Generated
    public ConfidentialLedgerClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /*
     * The list of Http pipeline policies to add.
     */
    @Generated private final List<HttpPipelinePolicy> pipelinePolicies;

    /*
     * The client options such as application ID and custom headers to set on a
     * request.
     */
    @Generated private ClientOptions clientOptions;

    /**
     * Sets The client options such as application ID and custom headers to set on a request.
     *
     * @param clientOptions the clientOptions value.
     * @return the ConfidentialLedgerClientBuilder.
     */
    @Generated
    public ConfidentialLedgerClientBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        return this;
    }

    /**
     * Adds a custom Http pipeline policy.
     *
     * @param customPolicy The custom Http pipeline policy to add.
     * @return the ConfidentialLedgerClientBuilder.
     */
    @Generated
    public ConfidentialLedgerClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        pipelinePolicies.add(customPolicy);
        return this;
    }

    /**
     * Builds an instance of ConfidentialLedgerClientImpl with the provided parameters.
     *
     * @return an instance of ConfidentialLedgerClientImpl.
     */
    @Generated
    private ConfidentialLedgerClientImpl buildInnerClient() {
        if (serviceVersion == null) {
            this.serviceVersion = ConfidentialLedgerServiceVersion.getLatest();
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        ConfidentialLedgerClientImpl client =
                new ConfidentialLedgerClientImpl(
                        pipeline, JacksonAdapter.createDefaultSerializerAdapter(), ledgerUri, serviceVersion);
        return client;
    }

    @Generated
    private HttpPipeline createHttpPipeline() {
        Configuration buildConfiguration =
                (configuration == null) ? Configuration.getGlobalConfiguration() : configuration;
        if (httpLogOptions == null) {
            httpLogOptions = new HttpLogOptions();
        }
        if (clientOptions == null) {
            clientOptions = new ClientOptions();
        }
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        String clientName = properties.getOrDefault(SDK_NAME, "UnknownName");
        String clientVersion = properties.getOrDefault(SDK_VERSION, "UnknownVersion");
        String applicationId = CoreUtils.getApplicationId(clientOptions, httpLogOptions);
        policies.add(new UserAgentPolicy(applicationId, clientName, clientVersion, buildConfiguration));
        HttpHeaders headers = new HttpHeaders();
        clientOptions.getHeaders().forEach(header -> headers.set(header.getName(), header.getValue()));
        if (headers.getSize() > 0) {
            policies.add(new AddHeadersPolicy(headers));
        }
        policies.addAll(
                this.pipelinePolicies.stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                        .collect(Collectors.toList()));
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(retryPolicy == null ? new RetryPolicy() : retryPolicy);
        policies.add(new CookiePolicy());
        policies.addAll(
                this.pipelinePolicies.stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                        .collect(Collectors.toList()));
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(httpLogOptions));
        HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                        .policies(policies.toArray(new HttpPipelinePolicy[0]))
                        .httpClient(httpClient)
                        .clientOptions(clientOptions)
                        .build();
        return httpPipeline;
    }

    /**
     * Builds an instance of ConfidentialLedgerAsyncClient async client.
     *
     * @return an instance of ConfidentialLedgerAsyncClient.
     */
    @Generated
    public ConfidentialLedgerAsyncClient buildAsyncClient() {
        return new ConfidentialLedgerAsyncClient(buildInnerClient().getConfidentialLedgers());
    }

    /**
     * Builds an instance of ConfidentialLedgerClient sync client.
     *
     * @return an instance of ConfidentialLedgerClient.
     */
    @Generated
    public ConfidentialLedgerClient buildClient() {
        return new ConfidentialLedgerClient(buildInnerClient().getConfidentialLedgers());
    }
}
