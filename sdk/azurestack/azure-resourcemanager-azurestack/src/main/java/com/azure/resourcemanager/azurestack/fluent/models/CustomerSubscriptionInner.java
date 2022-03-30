// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Customer subscription. */
@Fluent
public final class CustomerSubscriptionInner extends ProxyResource {
    /*
     * Customer subscription properties.
     */
    @JsonProperty(value = "properties")
    private CustomerSubscriptionProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The entity tag used for optimistic concurrency when modifying the
     * resource.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the innerProperties property: Customer subscription properties.
     *
     * @return the innerProperties value.
     */
    private CustomerSubscriptionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the etag property: The entity tag used for optimistic concurrency when modifying the resource.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The entity tag used for optimistic concurrency when modifying the resource.
     *
     * @param etag the etag value to set.
     * @return the CustomerSubscriptionInner object itself.
     */
    public CustomerSubscriptionInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the tenantId property: Tenant Id.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Set the tenantId property: Tenant Id.
     *
     * @param tenantId the tenantId value to set.
     * @return the CustomerSubscriptionInner object itself.
     */
    public CustomerSubscriptionInner withTenantId(String tenantId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomerSubscriptionProperties();
        }
        this.innerProperties().withTenantId(tenantId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
