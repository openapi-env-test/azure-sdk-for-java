// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.scanning;

import com.azure.analytics.purview.scanning.implementation.PurviewScanningClientImpl;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddHeadersPolicy;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
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

/** A builder for creating a new instance of the SystemScanRulesetsClient type. */
@ServiceClientBuilder(serviceClients = {SystemScanRulesetsClient.class, SystemScanRulesetsAsyncClient.class})
public final class SystemScanRulesetsClientBuilder {
    @Generated private static final String SDK_NAME = "name";

    @Generated private static final String SDK_VERSION = "version";

    @Generated private static final String[] DEFAULT_SCOPES = new String[] {"https://purview.azure.net/.default"};

    @Generated
    private final Map<String, String> properties =
            CoreUtils.getProperties("azure-analytics-purview-scanning.properties");

    /** Create an instance of the SystemScanRulesetsClientBuilder. */
    @Generated
    public SystemScanRulesetsClientBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * The scanning endpoint of your purview account. Example:
     * https://{accountName}.purview.azure.com
     */
    @Generated private String endpoint;

    /**
     * Sets The scanning endpoint of your purview account. Example: https://{accountName}.purview.azure.com.
     *
     * @param endpoint the endpoint value.
     * @return the SystemScanRulesetsClientBuilder.
     */
    @Generated
    public SystemScanRulesetsClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /*
     * Service version
     */
    @Generated private PurviewScanningServiceVersion serviceVersion;

    /**
     * Sets Service version.
     *
     * @param serviceVersion the serviceVersion value.
     * @return the SystemScanRulesetsClientBuilder.
     */
    @Generated
    public SystemScanRulesetsClientBuilder serviceVersion(PurviewScanningServiceVersion serviceVersion) {
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
     * @return the SystemScanRulesetsClientBuilder.
     */
    @Generated
    public SystemScanRulesetsClientBuilder pipeline(HttpPipeline pipeline) {
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
     * @return the SystemScanRulesetsClientBuilder.
     */
    @Generated
    public SystemScanRulesetsClientBuilder httpClient(HttpClient httpClient) {
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
     * @return the SystemScanRulesetsClientBuilder.
     */
    @Generated
    public SystemScanRulesetsClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * The TokenCredential used for authentication.
     */
    @Generated private TokenCredential tokenCredential;

    /**
     * Sets The TokenCredential used for authentication.
     *
     * @param tokenCredential the tokenCredential value.
     * @return the SystemScanRulesetsClientBuilder.
     */
    @Generated
    public SystemScanRulesetsClientBuilder credential(TokenCredential tokenCredential) {
        this.tokenCredential = tokenCredential;
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
     * @return the SystemScanRulesetsClientBuilder.
     */
    @Generated
    public SystemScanRulesetsClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
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
     * @return the SystemScanRulesetsClientBuilder.
     */
    @Generated
    public SystemScanRulesetsClientBuilder retryPolicy(RetryPolicy retryPolicy) {
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
     * @return the SystemScanRulesetsClientBuilder.
     */
    @Generated
    public SystemScanRulesetsClientBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        return this;
    }

    /**
     * Adds a custom Http pipeline policy.
     *
     * @param customPolicy The custom Http pipeline policy to add.
     * @return the SystemScanRulesetsClientBuilder.
     */
    @Generated
    public SystemScanRulesetsClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        pipelinePolicies.add(customPolicy);
        return this;
    }

    /**
     * Builds an instance of PurviewScanningClientImpl with the provided parameters.
     *
     * @return an instance of PurviewScanningClientImpl.
     */
    @Generated
    private PurviewScanningClientImpl buildInnerClient() {
        if (serviceVersion == null) {
            this.serviceVersion = PurviewScanningServiceVersion.getLatest();
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        PurviewScanningClientImpl client =
                new PurviewScanningClientImpl(
                        pipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
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
        if (tokenCredential != null) {
            policies.add(new BearerTokenAuthenticationPolicy(tokenCredential, DEFAULT_SCOPES));
        }
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
     * Builds an instance of SystemScanRulesetsAsyncClient async client.
     *
     * @return an instance of SystemScanRulesetsAsyncClient.
     */
    @Generated
    public SystemScanRulesetsAsyncClient buildAsyncClient() {
        return new SystemScanRulesetsAsyncClient(buildInnerClient().getSystemScanRulesets());
    }

    /**
     * Builds an instance of SystemScanRulesetsClient sync client.
     *
     * @return an instance of SystemScanRulesetsClient.
     */
    @Generated
    public SystemScanRulesetsClient buildClient() {
        return new SystemScanRulesetsClient(buildInnerClient().getSystemScanRulesets());
    }
}
