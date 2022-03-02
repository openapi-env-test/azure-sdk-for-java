// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.administration;

import com.azure.analytics.purview.administration.implementation.MetadataRolesImpl;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;

/** Initializes a new instance of the synchronous PurviewMetadataClient type. */
@ServiceClient(builder = PurviewMetadataClientBuilder.class)
public final class MetadataRolesClient {
    @Generated private final MetadataRolesImpl serviceClient;

    /**
     * Initializes an instance of MetadataRoles client.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    MetadataRolesClient(MetadataRolesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists roles for Purview Account.
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
     *     values: [
     *         {
     *             id: String
     *             name: String
     *             type: String
     *             properties: {
     *                 provisioningState: String
     *                 roleType: String
     *                 friendlyName: String
     *                 description: String
     *                 cnfCondition: [
     *                     [
     *                         {
     *                             attributeName: String
     *                             attributeValueIncludes: String
     *                             attributeValueIncludedIn: [
     *                                 String
     *                             ]
     *                             attributeValueExcludes: String
     *                             attributeValueExcludedIn: [
     *                                 String
     *                             ]
     *                         }
     *                     ]
     *                 ]
     *                 dnfCondition: [
     *                     [
     *                         (recursive schema, see above)
     *                     ]
     *                 ]
     *                 version: Long
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return list of Metadata roles as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(RequestOptions requestOptions) {
        return this.serviceClient.list(requestOptions);
    }
}
