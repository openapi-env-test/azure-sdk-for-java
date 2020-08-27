/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2019_08_09_preview;

import com.microsoft.azure.AzureClient;
import com.microsoft.rest.RestClient;

/**
 * The interface for AvsClient class.
 */
public interface AvsClient {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    AzureClient getAzureClient();

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    String userAgent();

    /**
     * Gets Unique identifier for the Azure subscription.
     *
     * @return the subscriptionId value.
     */
    String subscriptionId();

    /**
     * Sets Unique identifier for the Azure subscription.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    AvsClient withSubscriptionId(String subscriptionId);

    /**
     * Gets Version of Azure VMware Solution API to be used with the client request.
     *
     * @return the apiVersion value.
     */
    String apiVersion();

    /**
     * Gets The preferred language for the response..
     *
     * @return the acceptLanguage value.
     */
    String acceptLanguage();

    /**
     * Sets The preferred language for the response..
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    AvsClient withAcceptLanguage(String acceptLanguage);

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    int longRunningOperationRetryTimeout();

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    AvsClient withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout);

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @return the generateClientRequestId value.
     */
    boolean generateClientRequestId();

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    AvsClient withGenerateClientRequestId(boolean generateClientRequestId);

    /**
     * Gets the Operations object to access its operations.
     * @return the Operations object.
     */
    Operations operations();

    /**
     * Gets the Locations object to access its operations.
     * @return the Locations object.
     */
    Locations locations();

    /**
     * Gets the PrivateClouds object to access its operations.
     * @return the PrivateClouds object.
     */
    PrivateClouds privateClouds();

    /**
     * Gets the Clusters object to access its operations.
     * @return the Clusters object.
     */
    Clusters clusters();

    /**
     * Gets the VMWareDatastoreBackings object to access its operations.
     * @return the VMWareDatastoreBackings object.
     */
    VMWareDatastoreBackings vMWareDatastoreBackings();

    /**
     * Gets the VMWareDatastores object to access its operations.
     * @return the VMWareDatastores object.
     */
    VMWareDatastores vMWareDatastores();

}
