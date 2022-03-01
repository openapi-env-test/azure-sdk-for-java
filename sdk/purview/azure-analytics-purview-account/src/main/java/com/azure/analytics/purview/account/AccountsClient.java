// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.account;

import com.azure.analytics.purview.account.implementation.AccountsImpl;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

/** Initializes a new instance of the synchronous DataPlaneAccountClient type. */
@ServiceClient(builder = AccountsClientBuilder.class)
public final class AccountsClient {
    @Generated private final AccountsImpl serviceClient;

    /**
     * Initializes an instance of Accounts client.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    AccountsClient(AccountsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get an account.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     identity: {
     *         principalId: String
     *         tenantId: String
     *         type: String(SystemAssigned)
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         cloudConnectors: {
     *             awsExternalId: String
     *         }
     *         createdAt: String
     *         createdBy: String
     *         createdByObjectId: String
     *         endpoints: {
     *             catalog: String
     *             guardian: String
     *             scan: String
     *         }
     *         friendlyName: String
     *         managedResourceGroupName: String
     *         managedResources: {
     *             eventHubNamespace: String
     *             resourceGroup: String
     *             storageAccount: String
     *         }
     *         privateEndpointConnections: [
     *             {
     *                 id: String
     *                 name: String
     *                 properties: {
     *                     privateEndpoint: {
     *                         id: String
     *                     }
     *                     privateLinkServiceConnectionState: {
     *                         actionsRequired: String
     *                         description: String
     *                         status: String(Unknown/Pending/Approved/Rejected/Disconnected)
     *                     }
     *                     provisioningState: String
     *                 }
     *                 type: String
     *             }
     *         ]
     *         provisioningState: String(Unknown/Creating/Moving/Deleting/SoftDeleting/SoftDeleted/Failed/Succeeded/Canceled)
     *         publicNetworkAccess: String(NotSpecified/Enabled/Disabled)
     *     }
     *     sku: {
     *         capacity: Integer
     *         name: String(Standard)
     *     }
     *     systemData: {
     *         createdAt: String
     *         createdBy: String
     *         createdByType: String(User/Application/ManagedIdentity/Key)
     *         lastModifiedAt: String
     *         lastModifiedBy: String
     *         lastModifiedByType: String(User/Application/ManagedIdentity/Key)
     *     }
     *     tags: {
     *         String: String
     *     }
     *     type: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return an account along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getAccountPropertiesWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getAccountPropertiesWithResponse(requestOptions);
    }

    /**
     * Updates an account.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     friendlyName: String
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     identity: {
     *         principalId: String
     *         tenantId: String
     *         type: String(SystemAssigned)
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         cloudConnectors: {
     *             awsExternalId: String
     *         }
     *         createdAt: String
     *         createdBy: String
     *         createdByObjectId: String
     *         endpoints: {
     *             catalog: String
     *             guardian: String
     *             scan: String
     *         }
     *         friendlyName: String
     *         managedResourceGroupName: String
     *         managedResources: {
     *             eventHubNamespace: String
     *             resourceGroup: String
     *             storageAccount: String
     *         }
     *         privateEndpointConnections: [
     *             {
     *                 id: String
     *                 name: String
     *                 properties: {
     *                     privateEndpoint: {
     *                         id: String
     *                     }
     *                     privateLinkServiceConnectionState: {
     *                         actionsRequired: String
     *                         description: String
     *                         status: String(Unknown/Pending/Approved/Rejected/Disconnected)
     *                     }
     *                     provisioningState: String
     *                 }
     *                 type: String
     *             }
     *         ]
     *         provisioningState: String(Unknown/Creating/Moving/Deleting/SoftDeleting/SoftDeleted/Failed/Succeeded/Canceled)
     *         publicNetworkAccess: String(NotSpecified/Enabled/Disabled)
     *     }
     *     sku: {
     *         capacity: Integer
     *         name: String(Standard)
     *     }
     *     systemData: {
     *         createdAt: String
     *         createdBy: String
     *         createdByType: String(User/Application/ManagedIdentity/Key)
     *         lastModifiedAt: String
     *         lastModifiedBy: String
     *         lastModifiedByType: String(User/Application/ManagedIdentity/Key)
     *     }
     *     tags: {
     *         String: String
     *     }
     *     type: String
     * }
     * }</pre>
     *
     * @param accountUpdateParameters The account properties that can be updated through data plane.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return account resource along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> updateAccountPropertiesWithResponse(
            BinaryData accountUpdateParameters, RequestOptions requestOptions) {
        return this.serviceClient.updateAccountPropertiesWithResponse(accountUpdateParameters, requestOptions);
    }

    /**
     * List the authorization keys associated with this account.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     atlasKafkaPrimaryEndpoint: String
     *     atlasKafkaSecondaryEndpoint: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return the Account access keys along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getAccessKeysWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getAccessKeysWithResponse(requestOptions);
    }

    /**
     * Regenerate the authorization keys associated with this data catalog.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     keyType: String(PrimaryAtlasKafkaKey/SecondaryAtlasKafkaKey)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     atlasKafkaPrimaryEndpoint: String
     *     atlasKafkaSecondaryEndpoint: String
     * }
     * }</pre>
     *
     * @param keyOptions A access key options used for regeneration.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return the Account access keys along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> regenerateAccessKeyWithResponse(BinaryData keyOptions, RequestOptions requestOptions) {
        return this.serviceClient.regenerateAccessKeyWithResponse(keyOptions, requestOptions);
    }
}
