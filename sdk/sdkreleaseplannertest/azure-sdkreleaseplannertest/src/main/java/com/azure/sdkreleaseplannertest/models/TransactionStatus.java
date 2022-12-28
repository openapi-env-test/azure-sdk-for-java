// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.sdkreleaseplannertest.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response returned to a query for the transaction status. */
@Immutable
public final class TransactionStatus {
    /*
     * The transaction state.
     */
    @JsonProperty(value = "state", required = true)
    private TransactionState state;

    /*
     * The transaction ID.
     */
    @JsonProperty(value = "transactionId", required = true)
    private String transactionId;

    /**
     * Creates an instance of TransactionStatus class.
     *
     * @param state the state value to set.
     * @param transactionId the transactionId value to set.
     */
    @JsonCreator
    private TransactionStatus(
            @JsonProperty(value = "state", required = true) TransactionState state,
            @JsonProperty(value = "transactionId", required = true) String transactionId) {
        this.state = state;
        this.transactionId = transactionId;
    }

    /**
     * Get the state property: The transaction state.
     *
     * @return the state value.
     */
    public TransactionState getState() {
        return this.state;
    }

    /**
     * Get the transactionId property: The transaction ID.
     *
     * @return the transactionId value.
     */
    public String getTransactionId() {
        return this.transactionId;
    }
}
