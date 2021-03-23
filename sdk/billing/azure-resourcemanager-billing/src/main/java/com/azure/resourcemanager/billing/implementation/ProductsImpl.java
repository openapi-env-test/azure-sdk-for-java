// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.billing.fluent.ProductsClient;
import com.azure.resourcemanager.billing.fluent.models.ProductInner;
import com.azure.resourcemanager.billing.fluent.models.ValidateProductTransferEligibilityResultInner;
import com.azure.resourcemanager.billing.models.Product;
import com.azure.resourcemanager.billing.models.Products;
import com.azure.resourcemanager.billing.models.TransferProductRequestProperties;
import com.azure.resourcemanager.billing.models.ValidateProductTransferEligibilityResult;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ProductsImpl implements Products {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProductsImpl.class);

    private final ProductsClient innerClient;

    private final com.azure.resourcemanager.billing.BillingManager serviceManager;

    public ProductsImpl(ProductsClient innerClient, com.azure.resourcemanager.billing.BillingManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Product> listByCustomer(String billingAccountName, String customerName) {
        PagedIterable<ProductInner> inner = this.serviceClient().listByCustomer(billingAccountName, customerName);
        return Utils.mapPage(inner, inner1 -> new ProductImpl(inner1, this.manager()));
    }

    public PagedIterable<Product> listByCustomer(String billingAccountName, String customerName, Context context) {
        PagedIterable<ProductInner> inner =
            this.serviceClient().listByCustomer(billingAccountName, customerName, context);
        return Utils.mapPage(inner, inner1 -> new ProductImpl(inner1, this.manager()));
    }

    public PagedIterable<Product> listByBillingAccount(String billingAccountName) {
        PagedIterable<ProductInner> inner = this.serviceClient().listByBillingAccount(billingAccountName);
        return Utils.mapPage(inner, inner1 -> new ProductImpl(inner1, this.manager()));
    }

    public PagedIterable<Product> listByBillingAccount(String billingAccountName, String filter, Context context) {
        PagedIterable<ProductInner> inner =
            this.serviceClient().listByBillingAccount(billingAccountName, filter, context);
        return Utils.mapPage(inner, inner1 -> new ProductImpl(inner1, this.manager()));
    }

    public PagedIterable<Product> listByBillingProfile(String billingAccountName, String billingProfileName) {
        PagedIterable<ProductInner> inner =
            this.serviceClient().listByBillingProfile(billingAccountName, billingProfileName);
        return Utils.mapPage(inner, inner1 -> new ProductImpl(inner1, this.manager()));
    }

    public PagedIterable<Product> listByBillingProfile(
        String billingAccountName, String billingProfileName, String filter, Context context) {
        PagedIterable<ProductInner> inner =
            this.serviceClient().listByBillingProfile(billingAccountName, billingProfileName, filter, context);
        return Utils.mapPage(inner, inner1 -> new ProductImpl(inner1, this.manager()));
    }

    public PagedIterable<Product> listByInvoiceSection(
        String billingAccountName, String billingProfileName, String invoiceSectionName) {
        PagedIterable<ProductInner> inner =
            this.serviceClient().listByInvoiceSection(billingAccountName, billingProfileName, invoiceSectionName);
        return Utils.mapPage(inner, inner1 -> new ProductImpl(inner1, this.manager()));
    }

    public PagedIterable<Product> listByInvoiceSection(
        String billingAccountName,
        String billingProfileName,
        String invoiceSectionName,
        String filter,
        Context context) {
        PagedIterable<ProductInner> inner =
            this
                .serviceClient()
                .listByInvoiceSection(billingAccountName, billingProfileName, invoiceSectionName, filter, context);
        return Utils.mapPage(inner, inner1 -> new ProductImpl(inner1, this.manager()));
    }

    public Product get(String billingAccountName, String productName) {
        ProductInner inner = this.serviceClient().get(billingAccountName, productName);
        if (inner != null) {
            return new ProductImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Product> getWithResponse(String billingAccountName, String productName, Context context) {
        Response<ProductInner> inner = this.serviceClient().getWithResponse(billingAccountName, productName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProductImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Product update(String billingAccountName, String productName, ProductInner parameters) {
        ProductInner inner = this.serviceClient().update(billingAccountName, productName, parameters);
        if (inner != null) {
            return new ProductImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Product> updateWithResponse(
        String billingAccountName, String productName, ProductInner parameters, Context context) {
        Response<ProductInner> inner =
            this.serviceClient().updateWithResponse(billingAccountName, productName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProductImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Product move(String billingAccountName, String productName, TransferProductRequestProperties parameters) {
        ProductInner inner = this.serviceClient().move(billingAccountName, productName, parameters);
        if (inner != null) {
            return new ProductImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Product> moveWithResponse(
        String billingAccountName, String productName, TransferProductRequestProperties parameters, Context context) {
        Response<ProductInner> inner =
            this.serviceClient().moveWithResponse(billingAccountName, productName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProductImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ValidateProductTransferEligibilityResult validateMove(
        String billingAccountName, String productName, TransferProductRequestProperties parameters) {
        ValidateProductTransferEligibilityResultInner inner =
            this.serviceClient().validateMove(billingAccountName, productName, parameters);
        if (inner != null) {
            return new ValidateProductTransferEligibilityResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ValidateProductTransferEligibilityResult> validateMoveWithResponse(
        String billingAccountName, String productName, TransferProductRequestProperties parameters, Context context) {
        Response<ValidateProductTransferEligibilityResultInner> inner =
            this.serviceClient().validateMoveWithResponse(billingAccountName, productName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ValidateProductTransferEligibilityResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ProductsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.billing.BillingManager manager() {
        return this.serviceManager;
    }
}
