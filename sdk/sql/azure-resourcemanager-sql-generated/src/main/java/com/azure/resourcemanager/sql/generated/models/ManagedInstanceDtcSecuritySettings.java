// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Security Settings of managed instance DTC. */
@Fluent
public final class ManagedInstanceDtcSecuritySettings {
    /*
     * Transaction Manager communication settings of managed instance DTC.
     */
    @JsonProperty(value = "transactionManagerCommunicationSettings")
    private ManagedInstanceDtcTransactionManagerCommunicationSettings transactionManagerCommunicationSettings;

    /*
     * Allow XA Transactions to managed instance DTC.
     */
    @JsonProperty(value = "xaTransactionsEnabled")
    private Boolean xaTransactionsEnabled;

    /*
     * Allow SNA LU 6.2 Transactions to managed instance DTC.
     */
    @JsonProperty(value = "snaLu6point2TransactionsEnabled")
    private Boolean snaLu6Point2TransactionsEnabled;

    /*
     * Default timeout for XA Transactions (in seconds).
     */
    @JsonProperty(value = "xaTransactionsDefaultTimeout")
    private Integer xaTransactionsDefaultTimeout;

    /*
     * Maximum timeout for XA Transactions (in seconds).
     */
    @JsonProperty(value = "xaTransactionsMaximumTimeout")
    private Integer xaTransactionsMaximumTimeout;

    /** Creates an instance of ManagedInstanceDtcSecuritySettings class. */
    public ManagedInstanceDtcSecuritySettings() {
    }

    /**
     * Get the transactionManagerCommunicationSettings property: Transaction Manager communication settings of managed
     * instance DTC.
     *
     * @return the transactionManagerCommunicationSettings value.
     */
    public ManagedInstanceDtcTransactionManagerCommunicationSettings transactionManagerCommunicationSettings() {
        return this.transactionManagerCommunicationSettings;
    }

    /**
     * Set the transactionManagerCommunicationSettings property: Transaction Manager communication settings of managed
     * instance DTC.
     *
     * @param transactionManagerCommunicationSettings the transactionManagerCommunicationSettings value to set.
     * @return the ManagedInstanceDtcSecuritySettings object itself.
     */
    public ManagedInstanceDtcSecuritySettings withTransactionManagerCommunicationSettings(
        ManagedInstanceDtcTransactionManagerCommunicationSettings transactionManagerCommunicationSettings) {
        this.transactionManagerCommunicationSettings = transactionManagerCommunicationSettings;
        return this;
    }

    /**
     * Get the xaTransactionsEnabled property: Allow XA Transactions to managed instance DTC.
     *
     * @return the xaTransactionsEnabled value.
     */
    public Boolean xaTransactionsEnabled() {
        return this.xaTransactionsEnabled;
    }

    /**
     * Set the xaTransactionsEnabled property: Allow XA Transactions to managed instance DTC.
     *
     * @param xaTransactionsEnabled the xaTransactionsEnabled value to set.
     * @return the ManagedInstanceDtcSecuritySettings object itself.
     */
    public ManagedInstanceDtcSecuritySettings withXaTransactionsEnabled(Boolean xaTransactionsEnabled) {
        this.xaTransactionsEnabled = xaTransactionsEnabled;
        return this;
    }

    /**
     * Get the snaLu6Point2TransactionsEnabled property: Allow SNA LU 6.2 Transactions to managed instance DTC.
     *
     * @return the snaLu6Point2TransactionsEnabled value.
     */
    public Boolean snaLu6Point2TransactionsEnabled() {
        return this.snaLu6Point2TransactionsEnabled;
    }

    /**
     * Set the snaLu6Point2TransactionsEnabled property: Allow SNA LU 6.2 Transactions to managed instance DTC.
     *
     * @param snaLu6Point2TransactionsEnabled the snaLu6Point2TransactionsEnabled value to set.
     * @return the ManagedInstanceDtcSecuritySettings object itself.
     */
    public ManagedInstanceDtcSecuritySettings withSnaLu6Point2TransactionsEnabled(
        Boolean snaLu6Point2TransactionsEnabled) {
        this.snaLu6Point2TransactionsEnabled = snaLu6Point2TransactionsEnabled;
        return this;
    }

    /**
     * Get the xaTransactionsDefaultTimeout property: Default timeout for XA Transactions (in seconds).
     *
     * @return the xaTransactionsDefaultTimeout value.
     */
    public Integer xaTransactionsDefaultTimeout() {
        return this.xaTransactionsDefaultTimeout;
    }

    /**
     * Set the xaTransactionsDefaultTimeout property: Default timeout for XA Transactions (in seconds).
     *
     * @param xaTransactionsDefaultTimeout the xaTransactionsDefaultTimeout value to set.
     * @return the ManagedInstanceDtcSecuritySettings object itself.
     */
    public ManagedInstanceDtcSecuritySettings withXaTransactionsDefaultTimeout(Integer xaTransactionsDefaultTimeout) {
        this.xaTransactionsDefaultTimeout = xaTransactionsDefaultTimeout;
        return this;
    }

    /**
     * Get the xaTransactionsMaximumTimeout property: Maximum timeout for XA Transactions (in seconds).
     *
     * @return the xaTransactionsMaximumTimeout value.
     */
    public Integer xaTransactionsMaximumTimeout() {
        return this.xaTransactionsMaximumTimeout;
    }

    /**
     * Set the xaTransactionsMaximumTimeout property: Maximum timeout for XA Transactions (in seconds).
     *
     * @param xaTransactionsMaximumTimeout the xaTransactionsMaximumTimeout value to set.
     * @return the ManagedInstanceDtcSecuritySettings object itself.
     */
    public ManagedInstanceDtcSecuritySettings withXaTransactionsMaximumTimeout(Integer xaTransactionsMaximumTimeout) {
        this.xaTransactionsMaximumTimeout = xaTransactionsMaximumTimeout;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (transactionManagerCommunicationSettings() != null) {
            transactionManagerCommunicationSettings().validate();
        }
    }
}
