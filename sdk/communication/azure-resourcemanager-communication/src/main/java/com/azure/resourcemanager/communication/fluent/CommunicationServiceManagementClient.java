// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for CommunicationServiceManagementClient class.
 */
public interface CommunicationServiceManagementClient {
    /**
     * Gets The ID of the target subscription. The value must be an UUID.
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
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the CommunicationServicesClient object to access its operations.
     * 
     * @return the CommunicationServicesClient object.
     */
    CommunicationServicesClient getCommunicationServices();

    /**
     * Gets the DomainsClient object to access its operations.
     * 
     * @return the DomainsClient object.
     */
    DomainsClient getDomains();

    /**
     * Gets the EmailServicesClient object to access its operations.
     * 
     * @return the EmailServicesClient object.
     */
    EmailServicesClient getEmailServices();

    /**
     * Gets the SenderUsernamesClient object to access its operations.
     * 
     * @return the SenderUsernamesClient object.
     */
    SenderUsernamesClient getSenderUsernames();

    /**
     * Gets the SuppressionListsClient object to access its operations.
     * 
     * @return the SuppressionListsClient object.
     */
    SuppressionListsClient getSuppressionLists();

    /**
     * Gets the SuppressionListAddressesClient object to access its operations.
     * 
     * @return the SuppressionListAddressesClient object.
     */
    SuppressionListAddressesClient getSuppressionListAddresses();
}
