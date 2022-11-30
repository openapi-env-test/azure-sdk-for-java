// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.confidentialledgerbugbash;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

/** Initializes a new instance of the synchronous ConfidentialLedgerClient type. */
@ServiceClient(builder = ConfidentialLedgerClientBuilder.class)
public final class ConfidentialLedgerClient {
    @Generated private final ConfidentialLedgerAsyncClient client;

    /**
     * Initializes an instance of ConfidentialLedgerClient class.
     *
     * @param client the async client.
     */
    @Generated
    ConfidentialLedgerClient(ConfidentialLedgerAsyncClient client) {
        this.client = client;
    }

    /**
     * Retrieves a list of collection ids present in the Confidential Ledger
     *
     * <p>Collection ids are user-created collections of ledger entries.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * [
     *      (Required){
     *         collectionId: String (Required)
     *     }
     * ]
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> listCollectionsWithResponse(RequestOptions requestOptions) {
        return this.client.listCollectionsWithResponse(requestOptions).block();
    }

    /**
     * Gets quotes for all nodes of the Confidential Ledger.
     *
     * <p>A quote is an SGX enclave measurement that can be used to verify the validity of a node and its enclave.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> getEnclaveQuotesWithResponse(RequestOptions requestOptions) {
        return this.client.getEnclaveQuotesWithResponse(requestOptions).block();
    }

    /**
     * Gets the constitution used for governance.
     *
     * <p>The constitution is a script that assesses and applies proposals from consortium members.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> getConstitutionWithResponse(RequestOptions requestOptions) {
        return this.client.getConstitutionWithResponse(requestOptions).block();
    }

    /**
     * Gets the consortium members.
     *
     * <p>Consortium members can manage the Confidential Ledger.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> getConsortiumMembersWithResponse(RequestOptions requestOptions) {
        return this.client.getConsortiumMembersWithResponse(requestOptions).block();
    }

    /**
     * Gets ledger entries from a collection corresponding to a range.
     *
     * <p>A collection id may optionally be specified. Only entries in the specified (or default) collection will be
     * returned.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     contents: String (Required)
     *     collectionId: String (Required)
     *     transactionId: String (Required)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paginated ledger entries returned in response to a query as paginated response with {@link
     *     PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listLedgerEntries(RequestOptions requestOptions) {
        return new PagedIterable<>(this.client.listLedgerEntries(requestOptions));
    }

    /**
     * Writes a ledger entry.
     *
     * <p>A collection id may optionally be specified.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>collectionId</td><td>String</td><td>No</td><td>The collection id.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     contents: String (Required)
     * }
     * }</pre>
     *
     * @param resourceCreateOrReplaceModel The template for adding updateable properties.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> createLedgerEntryWithResponse(
            BinaryData resourceCreateOrReplaceModel, RequestOptions requestOptions) {
        return this.client.createLedgerEntryWithResponse(resourceCreateOrReplaceModel, requestOptions).block();
    }

    /**
     * Gets the ledger entry at the specified transaction id. A collection id may optionally be specified to indicate
     * the collection from which to fetch the value.
     *
     * <p>Get a LedgerEntry.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>collectionId</td><td>String</td><td>No</td><td>The collection id.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     contents: String (Required)
     *     collectionId: String (Required)
     *     transactionId: String (Required)
     * }
     * }</pre>
     *
     * @param transactionId A unique identifier for the state of the ledger. If returned as part of a LedgerEntry, it
     *     indicates the state from which the entry was read.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a LedgerEntry along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getLedgerEntryWithResponse(String transactionId, RequestOptions requestOptions) {
        return this.client.getLedgerEntryWithResponse(transactionId, requestOptions).block();
    }

    /**
     * Gets a receipt certifying ledger contents at a particular transaction id.
     *
     * <p>Runs a custom action on LedgerEntry.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     receipt: Object (Required)
     *     state: String(Loading/Ready) (Required)
     *     transactionId: String (Required)
     * }
     * }</pre>
     *
     * @param transactionId A unique identifier for the state of the ledger. If returned as part of a LedgerEntry, it
     *     indicates the state from which the entry was read.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a receipt certifying the transaction at the specified id along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getReceiptWithResponse(String transactionId, RequestOptions requestOptions) {
        return this.client.getReceiptWithResponse(transactionId, requestOptions).block();
    }

    /**
     * Gets a receipt certifying ledger contents at a particular transaction id.
     *
     * <p>Runs a custom action on LedgerEntry.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     state: String(Committed/Pending) (Required)
     *     transactionId: String (Required)
     * }
     * }</pre>
     *
     * @param transactionId A unique identifier for the state of the ledger. If returned as part of a LedgerEntry, it
     *     indicates the state from which the entry was read.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return response returned to a query for the transaction status along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getTransactionStatusWithResponse(String transactionId, RequestOptions requestOptions) {
        return this.client.getTransactionStatusWithResponse(transactionId, requestOptions).block();
    }

    /**
     * Gets the current value available in the ledger.
     *
     * <p>Runs a custom action on LedgerEntry.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>collectionId</td><td>String</td><td>No</td><td>The collection id.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     contents: String (Required)
     *     collectionId: String (Required)
     *     transactionId: String (Required)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return details about a ledger entry along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getCurrentLedgerEntryWithResponse(RequestOptions requestOptions) {
        return this.client.getCurrentLedgerEntryWithResponse(requestOptions).block();
    }

    /**
     * Deletes a user from the Confidential Ledger.
     *
     * <p>Delete a LedgerUser.
     *
     * @param userId The user id, either an AAD object ID or certificate fingerprint.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteUserWithResponse(String userId, RequestOptions requestOptions) {
        return this.client.deleteUserWithResponse(userId, requestOptions).block();
    }

    /**
     * Gets a user.
     *
     * <p>Get a LedgerUser.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     userId: String (Required)
     *     assignedRole: String(Administrator/Contributor/Reader) (Required)
     * }
     * }</pre>
     *
     * @param userId The user id, either an AAD object ID or certificate fingerprint.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a LedgerUser along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getUserWithResponse(String userId, RequestOptions requestOptions) {
        return this.client.getUserWithResponse(userId, requestOptions).block();
    }

    /**
     * Adds a user or updates a user's fields.
     *
     * <p>Creates or updates a LedgerUser.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     userId: String (Required)
     *     assignedRole: String(Administrator/Contributor/Reader) (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     userId: String (Required)
     *     assignedRole: String(Administrator/Contributor/Reader) (Required)
     * }
     * }</pre>
     *
     * @param userId The user id, either an AAD object ID or certificate fingerprint.
     * @param ledgerUser Details about a Confidential ledger user.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return details about a Confidential ledger user along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateUserWithResponse(
            String userId, BinaryData ledgerUser, RequestOptions requestOptions) {
        return this.client.createOrUpdateUserWithResponse(userId, ledgerUser, requestOptions).block();
    }
}
