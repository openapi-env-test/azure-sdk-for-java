// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for AzureReservationApi class. */
public interface AzureReservationApi {
    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

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
     * Gets the ReservationsClient object to access its operations.
     *
     * @return the ReservationsClient object.
     */
    ReservationsClient getReservations();

    /**
     * Gets the ResourceProvidersClient object to access its operations.
     *
     * @return the ResourceProvidersClient object.
     */
    ResourceProvidersClient getResourceProviders();

    /**
     * Gets the ReservationOrdersClient object to access its operations.
     *
     * @return the ReservationOrdersClient object.
     */
    ReservationOrdersClient getReservationOrders();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the CalculateRefundsClient object to access its operations.
     *
     * @return the CalculateRefundsClient object.
     */
    CalculateRefundsClient getCalculateRefunds();

    /**
     * Gets the ReturnsClient object to access its operations.
     *
     * @return the ReturnsClient object.
     */
    ReturnsClient getReturns();

    /**
     * Gets the CalculateExchangesClient object to access its operations.
     *
     * @return the CalculateExchangesClient object.
     */
    CalculateExchangesClient getCalculateExchanges();

    /**
     * Gets the ExchangesClient object to access its operations.
     *
     * @return the ExchangesClient object.
     */
    ExchangesClient getExchanges();

    /**
     * Gets the QuotasClient object to access its operations.
     *
     * @return the QuotasClient object.
     */
    QuotasClient getQuotas();

    /**
     * Gets the QuotaRequestStatusClient object to access its operations.
     *
     * @return the QuotaRequestStatusClient object.
     */
    QuotaRequestStatusClient getQuotaRequestStatus();
}
