// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.appservice.generated.fluent.models.AppServiceCertificateOrderInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.AppServiceCertificateResourceInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.CertificateEmailInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.CertificateOrderActionInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.SiteSealInner;
import com.azure.resourcemanager.appservice.generated.models.AppServiceCertificateOrderPatchResource;
import com.azure.resourcemanager.appservice.generated.models.AppServiceCertificatePatchResource;
import com.azure.resourcemanager.appservice.generated.models.NameIdentifier;
import com.azure.resourcemanager.appservice.generated.models.ReissueCertificateOrderRequest;
import com.azure.resourcemanager.appservice.generated.models.RenewCertificateOrderRequest;
import com.azure.resourcemanager.appservice.generated.models.SiteSealRequest;
import java.util.List;

/** An instance of this class provides access to all the operations defined in AppServiceCertificateOrdersClient. */
public interface AppServiceCertificateOrdersClient {
    /**
     * List all certificate orders in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of certificate orders.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AppServiceCertificateOrderInner> list();

    /**
     * List all certificate orders in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of certificate orders.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AppServiceCertificateOrderInner> list(Context context);

    /**
     * Validate information for a certificate order.
     *
     * @param appServiceCertificateOrder Information for a certificate order.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void validatePurchaseInformation(AppServiceCertificateOrderInner appServiceCertificateOrder);

    /**
     * Validate information for a certificate order.
     *
     * @param appServiceCertificateOrder Information for a certificate order.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> validatePurchaseInformationWithResponse(
        AppServiceCertificateOrderInner appServiceCertificateOrder, Context context);

    /**
     * Get certificate orders in a resource group.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return certificate orders in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AppServiceCertificateOrderInner> listByResourceGroup(String resourceGroupName);

    /**
     * Get certificate orders in a resource group.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return certificate orders in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AppServiceCertificateOrderInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get a certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order..
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a certificate order.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AppServiceCertificateOrderInner getByResourceGroup(String resourceGroupName, String certificateOrderName);

    /**
     * Get a certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order..
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a certificate order.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AppServiceCertificateOrderInner> getByResourceGroupWithResponse(
        String resourceGroupName, String certificateOrderName, Context context);

    /**
     * Create or update a certificate purchase order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param certificateDistinguishedName Distinguished name to use for the certificate order.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sSL certificate purchase order.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<AppServiceCertificateOrderInner>, AppServiceCertificateOrderInner> beginCreateOrUpdate(
        String resourceGroupName,
        String certificateOrderName,
        AppServiceCertificateOrderInner certificateDistinguishedName);

    /**
     * Create or update a certificate purchase order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param certificateDistinguishedName Distinguished name to use for the certificate order.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sSL certificate purchase order.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<AppServiceCertificateOrderInner>, AppServiceCertificateOrderInner> beginCreateOrUpdate(
        String resourceGroupName,
        String certificateOrderName,
        AppServiceCertificateOrderInner certificateDistinguishedName,
        Context context);

    /**
     * Create or update a certificate purchase order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param certificateDistinguishedName Distinguished name to use for the certificate order.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sSL certificate purchase order.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AppServiceCertificateOrderInner createOrUpdate(
        String resourceGroupName,
        String certificateOrderName,
        AppServiceCertificateOrderInner certificateDistinguishedName);

    /**
     * Create or update a certificate purchase order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param certificateDistinguishedName Distinguished name to use for the certificate order.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sSL certificate purchase order.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AppServiceCertificateOrderInner createOrUpdate(
        String resourceGroupName,
        String certificateOrderName,
        AppServiceCertificateOrderInner certificateDistinguishedName,
        Context context);

    /**
     * Delete an existing certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String certificateOrderName);

    /**
     * Delete an existing certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String certificateOrderName, Context context);

    /**
     * Create or update a certificate purchase order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param certificateDistinguishedName Distinguished name to use for the certificate order.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sSL certificate purchase order.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AppServiceCertificateOrderInner update(
        String resourceGroupName,
        String certificateOrderName,
        AppServiceCertificateOrderPatchResource certificateDistinguishedName);

    /**
     * Create or update a certificate purchase order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param certificateDistinguishedName Distinguished name to use for the certificate order.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sSL certificate purchase order.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AppServiceCertificateOrderInner> updateWithResponse(
        String resourceGroupName,
        String certificateOrderName,
        AppServiceCertificateOrderPatchResource certificateDistinguishedName,
        Context context);

    /**
     * List all certificates associated with a certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of certificate order certificates.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AppServiceCertificateResourceInner> listCertificates(
        String resourceGroupName, String certificateOrderName);

    /**
     * List all certificates associated with a certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of certificate order certificates.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AppServiceCertificateResourceInner> listCertificates(
        String resourceGroupName, String certificateOrderName, Context context);

    /**
     * Get the certificate associated with a certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param name Name of the certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the certificate associated with a certificate order.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AppServiceCertificateResourceInner getCertificate(
        String resourceGroupName, String certificateOrderName, String name);

    /**
     * Get the certificate associated with a certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param name Name of the certificate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the certificate associated with a certificate order.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AppServiceCertificateResourceInner> getCertificateWithResponse(
        String resourceGroupName, String certificateOrderName, String name, Context context);

    /**
     * Creates or updates a certificate and associates with key vault secret.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param name Name of the certificate.
     * @param keyVaultCertificate Key vault certificate resource Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return key Vault container ARM resource for a certificate that is purchased through Azure.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<AppServiceCertificateResourceInner>, AppServiceCertificateResourceInner>
        beginCreateOrUpdateCertificate(
            String resourceGroupName,
            String certificateOrderName,
            String name,
            AppServiceCertificateResourceInner keyVaultCertificate);

    /**
     * Creates or updates a certificate and associates with key vault secret.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param name Name of the certificate.
     * @param keyVaultCertificate Key vault certificate resource Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return key Vault container ARM resource for a certificate that is purchased through Azure.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<AppServiceCertificateResourceInner>, AppServiceCertificateResourceInner>
        beginCreateOrUpdateCertificate(
            String resourceGroupName,
            String certificateOrderName,
            String name,
            AppServiceCertificateResourceInner keyVaultCertificate,
            Context context);

    /**
     * Creates or updates a certificate and associates with key vault secret.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param name Name of the certificate.
     * @param keyVaultCertificate Key vault certificate resource Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return key Vault container ARM resource for a certificate that is purchased through Azure.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AppServiceCertificateResourceInner createOrUpdateCertificate(
        String resourceGroupName,
        String certificateOrderName,
        String name,
        AppServiceCertificateResourceInner keyVaultCertificate);

    /**
     * Creates or updates a certificate and associates with key vault secret.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param name Name of the certificate.
     * @param keyVaultCertificate Key vault certificate resource Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return key Vault container ARM resource for a certificate that is purchased through Azure.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AppServiceCertificateResourceInner createOrUpdateCertificate(
        String resourceGroupName,
        String certificateOrderName,
        String name,
        AppServiceCertificateResourceInner keyVaultCertificate,
        Context context);

    /**
     * Delete the certificate associated with a certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param name Name of the certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteCertificate(String resourceGroupName, String certificateOrderName, String name);

    /**
     * Delete the certificate associated with a certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param name Name of the certificate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteCertificateWithResponse(
        String resourceGroupName, String certificateOrderName, String name, Context context);

    /**
     * Creates or updates a certificate and associates with key vault secret.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param name Name of the certificate.
     * @param keyVaultCertificate Key vault certificate resource Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return key Vault container ARM resource for a certificate that is purchased through Azure.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AppServiceCertificateResourceInner updateCertificate(
        String resourceGroupName,
        String certificateOrderName,
        String name,
        AppServiceCertificatePatchResource keyVaultCertificate);

    /**
     * Creates or updates a certificate and associates with key vault secret.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param name Name of the certificate.
     * @param keyVaultCertificate Key vault certificate resource Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return key Vault container ARM resource for a certificate that is purchased through Azure.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AppServiceCertificateResourceInner> updateCertificateWithResponse(
        String resourceGroupName,
        String certificateOrderName,
        String name,
        AppServiceCertificatePatchResource keyVaultCertificate,
        Context context);

    /**
     * Reissue an existing certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param reissueCertificateOrderRequest Parameters for the reissue.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void reissue(
        String resourceGroupName,
        String certificateOrderName,
        ReissueCertificateOrderRequest reissueCertificateOrderRequest);

    /**
     * Reissue an existing certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param reissueCertificateOrderRequest Parameters for the reissue.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> reissueWithResponse(
        String resourceGroupName,
        String certificateOrderName,
        ReissueCertificateOrderRequest reissueCertificateOrderRequest,
        Context context);

    /**
     * Renew an existing certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param renewCertificateOrderRequest Renew parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void renew(
        String resourceGroupName,
        String certificateOrderName,
        RenewCertificateOrderRequest renewCertificateOrderRequest);

    /**
     * Renew an existing certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param renewCertificateOrderRequest Renew parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> renewWithResponse(
        String resourceGroupName,
        String certificateOrderName,
        RenewCertificateOrderRequest renewCertificateOrderRequest,
        Context context);

    /**
     * Resend certificate email.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void resendEmail(String resourceGroupName, String certificateOrderName);

    /**
     * Resend certificate email.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> resendEmailWithResponse(String resourceGroupName, String certificateOrderName, Context context);

    /**
     * Verify domain ownership for this certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param nameIdentifier Email address.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void resendRequestEmails(String resourceGroupName, String certificateOrderName, NameIdentifier nameIdentifier);

    /**
     * Verify domain ownership for this certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param nameIdentifier Email address.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> resendRequestEmailsWithResponse(
        String resourceGroupName, String certificateOrderName, NameIdentifier nameIdentifier, Context context);

    /**
     * Verify domain ownership for this certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param siteSealRequest Site seal request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return site seal.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SiteSealInner retrieveSiteSeal(
        String resourceGroupName, String certificateOrderName, SiteSealRequest siteSealRequest);

    /**
     * Verify domain ownership for this certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param siteSealRequest Site seal request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return site seal.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SiteSealInner> retrieveSiteSealWithResponse(
        String resourceGroupName, String certificateOrderName, SiteSealRequest siteSealRequest, Context context);

    /**
     * Verify domain ownership for this certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void verifyDomainOwnership(String resourceGroupName, String certificateOrderName);

    /**
     * Verify domain ownership for this certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> verifyDomainOwnershipWithResponse(
        String resourceGroupName, String certificateOrderName, Context context);

    /**
     * Retrieve the list of certificate actions.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate order.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of CertificateOrderAction.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<CertificateOrderActionInner> retrieveCertificateActions(String resourceGroupName, String name);

    /**
     * Retrieve the list of certificate actions.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate order.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of CertificateOrderAction.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<CertificateOrderActionInner>> retrieveCertificateActionsWithResponse(
        String resourceGroupName, String name, Context context);

    /**
     * Retrieve email history.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate order.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of CertificateEmail.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<CertificateEmailInner> retrieveCertificateEmailHistory(String resourceGroupName, String name);

    /**
     * Retrieve email history.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate order.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of CertificateEmail.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<CertificateEmailInner>> retrieveCertificateEmailHistoryWithResponse(
        String resourceGroupName, String name, Context context);
}
