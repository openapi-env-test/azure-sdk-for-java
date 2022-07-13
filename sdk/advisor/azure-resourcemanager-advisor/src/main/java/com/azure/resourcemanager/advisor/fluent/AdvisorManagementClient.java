// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for AdvisorManagementClient class. */
public interface AdvisorManagementClient {
    /**
     * Gets The Azure subscription ID.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the RecommendationsClient object to access its operations.
     *
     * @return the RecommendationsClient object.
     */
    RecommendationsClient getRecommendations();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the SuppressionsClient object to access its operations.
     *
     * @return the SuppressionsClient object.
     */
    SuppressionsClient getSuppressions();
}
