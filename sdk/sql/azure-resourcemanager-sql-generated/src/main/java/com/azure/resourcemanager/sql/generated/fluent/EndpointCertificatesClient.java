// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.EndpointCertificateInner;

/** An instance of this class provides access to all the operations defined in EndpointCertificatesClient. */
public interface EndpointCertificatesClient {
    /**
     * List certificates used on endpoints on the target instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of endpoint certificates on the target instance as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EndpointCertificateInner> listByInstance(String resourceGroupName, String managedInstanceName);

    /**
     * List certificates used on endpoints on the target instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of endpoint certificates on the target instance as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EndpointCertificateInner> listByInstance(
        String resourceGroupName, String managedInstanceName, Context context);

    /**
     * Gets a certificate used on the endpoint with the given id.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param endpointType Type of the endpoint whose certificate the customer is looking for.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a certificate used on the endpoint with the given id along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EndpointCertificateInner> getWithResponse(
        String resourceGroupName, String managedInstanceName, String endpointType, Context context);

    /**
     * Gets a certificate used on the endpoint with the given id.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param endpointType Type of the endpoint whose certificate the customer is looking for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a certificate used on the endpoint with the given id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EndpointCertificateInner get(String resourceGroupName, String managedInstanceName, String endpointType);
}
