// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of CertificateOrders. */
public interface CertificateOrders {
    /**
     * Get certificate associated with the certificate order.
     *
     * @param resourceGroupName Azure resource group name.
     * @param certificateOrderName Certificate name.
     * @param name Certificate name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return certificate associated with the certificate order.
     */
    CertificateOrderCertificate getCertificate(String resourceGroupName, String certificateOrderName, String name);

    /**
     * Get certificate associated with the certificate order.
     *
     * @param resourceGroupName Azure resource group name.
     * @param certificateOrderName Certificate name.
     * @param name Certificate name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return certificate associated with the certificate order.
     */
    Response<CertificateOrderCertificate> getCertificateWithResponse(
        String resourceGroupName, String certificateOrderName, String name, Context context);

    /**
     * Deletes the certificate associated with the certificate order.
     *
     * @param resourceGroupName Azure resource group name.
     * @param certificateOrderName Certificate name.
     * @param name Certificate name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    Object deleteCertificate(String resourceGroupName, String certificateOrderName, String name);

    /**
     * Deletes the certificate associated with the certificate order.
     *
     * @param resourceGroupName Azure resource group name.
     * @param certificateOrderName Certificate name.
     * @param name Certificate name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    Response<Object> deleteCertificateWithResponse(
        String resourceGroupName, String certificateOrderName, String name, Context context);

    /**
     * Get a certificate order.
     *
     * @param resourceGroupName Azure resource group name.
     * @param name Certificate name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a certificate order.
     */
    CertificateOrder getByResourceGroup(String resourceGroupName, String name);

    /**
     * Get a certificate order.
     *
     * @param resourceGroupName Azure resource group name.
     * @param name Certificate name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a certificate order.
     */
    Response<CertificateOrder> getByResourceGroupWithResponse(String resourceGroupName, String name, Context context);

    /**
     * Delete an existing certificate order.
     *
     * @param resourceGroupName Azure resource group name.
     * @param name Certificate name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    Object deleteByResourceGroup(String resourceGroupName, String name);

    /**
     * Delete an existing certificate order.
     *
     * @param resourceGroupName Azure resource group name.
     * @param name Certificate name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    Response<Object> deleteWithResponse(String resourceGroupName, String name, Context context);

    /**
     * Get certificate orders in a resource group.
     *
     * @param resourceGroupName Azure resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return certificate orders in a resource group.
     */
    PagedIterable<CertificateOrder> listByResourceGroup(String resourceGroupName);

    /**
     * Get certificate orders in a resource group.
     *
     * @param resourceGroupName Azure resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return certificate orders in a resource group.
     */
    PagedIterable<CertificateOrder> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List all certificates associated with a certificate order (only one certificate can be associated with an order
     * at a time).
     *
     * @param resourceGroupName Azure resource group name.
     * @param certificateOrderName Certificate name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of certificate order certificates.
     */
    PagedIterable<CertificateOrderCertificate> getCertificates(String resourceGroupName, String certificateOrderName);

    /**
     * List all certificates associated with a certificate order (only one certificate can be associated with an order
     * at a time).
     *
     * @param resourceGroupName Azure resource group name.
     * @param certificateOrderName Certificate name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of certificate order certificates.
     */
    PagedIterable<CertificateOrderCertificate> getCertificates(
        String resourceGroupName, String certificateOrderName, Context context);

    /**
     * Reissue an existing certificate order.
     *
     * @param resourceGroupName Azure resource group name.
     * @param name Certificate name.
     * @param reissueCertificateOrderRequest Reissue parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    Object reissueCertificateOrder(
        String resourceGroupName, String name, ReissueCertificateOrderRequest reissueCertificateOrderRequest);

    /**
     * Reissue an existing certificate order.
     *
     * @param resourceGroupName Azure resource group name.
     * @param name Certificate name.
     * @param reissueCertificateOrderRequest Reissue parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    Response<Object> reissueCertificateOrderWithResponse(
        String resourceGroupName,
        String name,
        ReissueCertificateOrderRequest reissueCertificateOrderRequest,
        Context context);

    /**
     * Renew an existing certificate order.
     *
     * @param resourceGroupName Azure resource group name.
     * @param name Certificate name.
     * @param renewCertificateOrderRequest Renew parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    Object renewCertificateOrder(
        String resourceGroupName, String name, RenewCertificateOrderRequest renewCertificateOrderRequest);

    /**
     * Renew an existing certificate order.
     *
     * @param resourceGroupName Azure resource group name.
     * @param name Certificate name.
     * @param renewCertificateOrderRequest Renew parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    Response<Object> renewCertificateOrderWithResponse(
        String resourceGroupName,
        String name,
        RenewCertificateOrderRequest renewCertificateOrderRequest,
        Context context);

    /**
     * Retrieve the list of certificate actions.
     *
     * @param resourceGroupName Azure resource group name.
     * @param name Certificate order name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of CertificateOrderAction.
     */
    Object retrieveCertificateActions(String resourceGroupName, String name);

    /**
     * Retrieve the list of certificate actions.
     *
     * @param resourceGroupName Azure resource group name.
     * @param name Certificate order name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of CertificateOrderAction.
     */
    Response<Object> retrieveCertificateActionsWithResponse(String resourceGroupName, String name, Context context);

    /**
     * Retrieve email history.
     *
     * @param resourceGroupName Azure resource group name.
     * @param name Certificate order name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of CertificateEmail.
     */
    Object retrieveCertificateEmailHistory(String resourceGroupName, String name);

    /**
     * Retrieve email history.
     *
     * @param resourceGroupName Azure resource group name.
     * @param name Certificate order name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of CertificateEmail.
     */
    Response<Object> retrieveCertificateEmailHistoryWithResponse(
        String resourceGroupName, String name, Context context);

    /**
     * Resend certificate email.
     *
     * @param resourceGroupName Azure resource group name.
     * @param name Certificate order name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    Object resendCertificateEmail(String resourceGroupName, String name);

    /**
     * Resend certificate email.
     *
     * @param resourceGroupName Azure resource group name.
     * @param name Certificate order name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    Response<Object> resendCertificateEmailWithResponse(String resourceGroupName, String name, Context context);

    /**
     * Verify domain ownership for this certificate order.
     *
     * @param resourceGroupName Azure resource group name.
     * @param name Certificate order name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    Object verifyDomainOwnership(String resourceGroupName, String name);

    /**
     * Verify domain ownership for this certificate order.
     *
     * @param resourceGroupName Azure resource group name.
     * @param name Certificate order name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    Response<Object> verifyDomainOwnershipWithResponse(String resourceGroupName, String name, Context context);

    /**
     * Get a certificate order.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a certificate order.
     */
    CertificateOrder getById(String id);

    /**
     * Get a certificate order.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a certificate order.
     */
    Response<CertificateOrder> getByIdWithResponse(String id, Context context);

    /**
     * Get certificate associated with the certificate order.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return certificate associated with the certificate order.
     */
    CertificateOrderCertificate getCertificateById(String id);

    /**
     * Get certificate associated with the certificate order.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return certificate associated with the certificate order.
     */
    Response<CertificateOrderCertificate> getCertificateByIdWithResponse(String id, Context context);

    /**
     * Delete an existing certificate order.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    Object deleteById(String id);

    /**
     * Delete an existing certificate order.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    Response<Object> deleteByIdWithResponse(String id, Context context);

    /**
     * Deletes the certificate associated with the certificate order.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    Object deleteCertificateById(String id);

    /**
     * Deletes the certificate associated with the certificate order.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    Response<Object> deleteCertificateByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new CertificateOrder resource.
     *
     * @param name resource name.
     * @return the first stage of the new CertificateOrder definition.
     */
    CertificateOrder.DefinitionStages.Blank defineCertificateOrder(String name);

    /**
     * Begins definition for a new CertificateOrderCertificate resource.
     *
     * @param name resource name.
     * @return the first stage of the new CertificateOrderCertificate definition.
     */
    CertificateOrderCertificate.DefinitionStages.Blank defineCertificate(String name);
}
