// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.sdkreleaseplannertest.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A receipt certifying the transaction at the specified id. */
@Immutable
public final class TransactionReceipt {
    /*
     * The receipt contents.
     */
    @JsonProperty(value = "receipt", required = true)
    private Object receipt;

    /*
     * The state of the ledger query.
     */
    @JsonProperty(value = "state", required = true)
    private LedgerQueryState state;

    /*
     * The transaction ID.
     */
    @JsonProperty(value = "transactionId", required = true)
    private String transactionId;

    /**
     * Creates an instance of TransactionReceipt class.
     *
     * @param receipt the receipt value to set.
     * @param state the state value to set.
     * @param transactionId the transactionId value to set.
     */
    @JsonCreator
    private TransactionReceipt(
            @JsonProperty(value = "receipt", required = true) Object receipt,
            @JsonProperty(value = "state", required = true) LedgerQueryState state,
            @JsonProperty(value = "transactionId", required = true) String transactionId) {
        this.receipt = receipt;
        this.state = state;
        this.transactionId = transactionId;
    }

    /**
     * Get the receipt property: The receipt contents.
     *
     * @return the receipt value.
     */
    public Object getReceipt() {
        return this.receipt;
    }

    /**
     * Get the state property: The state of the ledger query.
     *
     * @return the state value.
     */
    public LedgerQueryState getState() {
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
