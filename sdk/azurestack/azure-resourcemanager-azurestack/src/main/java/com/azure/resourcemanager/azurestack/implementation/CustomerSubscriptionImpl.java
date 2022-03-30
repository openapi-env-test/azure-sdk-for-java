// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestack.fluent.models.CustomerSubscriptionInner;
import com.azure.resourcemanager.azurestack.models.CustomerSubscription;

public final class CustomerSubscriptionImpl implements CustomerSubscription, CustomerSubscription.Definition {
    private CustomerSubscriptionInner innerObject;

    private final com.azure.resourcemanager.azurestack.AzureStackManager serviceManager;

    CustomerSubscriptionImpl(
        CustomerSubscriptionInner innerObject, com.azure.resourcemanager.azurestack.AzureStackManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String tenantId() {
        return this.innerModel().tenantId();
    }

    public CustomerSubscriptionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.AzureStackManager manager() {
        return this.serviceManager;
    }

    private String resourceGroup;

    private String registrationName;

    private String customerSubscriptionName;

    public CustomerSubscriptionImpl withExistingRegistration(String resourceGroup, String registrationName) {
        this.resourceGroup = resourceGroup;
        this.registrationName = registrationName;
        return this;
    }

    public CustomerSubscription create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomerSubscriptions()
                .createWithResponse(
                    resourceGroup, registrationName, customerSubscriptionName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public CustomerSubscription create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomerSubscriptions()
                .createWithResponse(
                    resourceGroup, registrationName, customerSubscriptionName, this.innerModel(), context)
                .getValue();
        return this;
    }

    CustomerSubscriptionImpl(String name, com.azure.resourcemanager.azurestack.AzureStackManager serviceManager) {
        this.innerObject = new CustomerSubscriptionInner();
        this.serviceManager = serviceManager;
        this.customerSubscriptionName = name;
    }

    public CustomerSubscription refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomerSubscriptions()
                .getWithResponse(resourceGroup, registrationName, customerSubscriptionName, Context.NONE)
                .getValue();
        return this;
    }

    public CustomerSubscription refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomerSubscriptions()
                .getWithResponse(resourceGroup, registrationName, customerSubscriptionName, context)
                .getValue();
        return this;
    }

    public CustomerSubscriptionImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public CustomerSubscriptionImpl withTenantId(String tenantId) {
        this.innerModel().withTenantId(tenantId);
        return this;
    }
}
