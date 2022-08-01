// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.managementgroups.models.ParentGroupBagInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The details of subscription under management group. */
@Fluent
public final class SubscriptionUnderManagementGroupInner extends ProxyResource {
    /*
     * The generic properties of subscription under a management group.
     */
    @JsonProperty(value = "properties")
    private SubscriptionUnderManagementGroupProperties innerProperties;

    /**
     * Get the innerProperties property: The generic properties of subscription under a management group.
     *
     * @return the innerProperties value.
     */
    private SubscriptionUnderManagementGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tenant property: The AAD Tenant ID associated with the subscription. For example,
     * 00000000-0000-0000-0000-000000000000.
     *
     * @return the tenant value.
     */
    public String tenant() {
        return this.innerProperties() == null ? null : this.innerProperties().tenant();
    }

    /**
     * Set the tenant property: The AAD Tenant ID associated with the subscription. For example,
     * 00000000-0000-0000-0000-000000000000.
     *
     * @param tenant the tenant value to set.
     * @return the SubscriptionUnderManagementGroupInner object itself.
     */
    public SubscriptionUnderManagementGroupInner withTenant(String tenant) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionUnderManagementGroupProperties();
        }
        this.innerProperties().withTenant(tenant);
        return this;
    }

    /**
     * Get the displayName property: The friendly name of the subscription.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The friendly name of the subscription.
     *
     * @param displayName the displayName value to set.
     * @return the SubscriptionUnderManagementGroupInner object itself.
     */
    public SubscriptionUnderManagementGroupInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionUnderManagementGroupProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the parent property: The ID, name and displayName of the parent management group.
     *
     * @return the parent value.
     */
    public ParentGroupBagInfo parent() {
        return this.innerProperties() == null ? null : this.innerProperties().parent();
    }

    /**
     * Set the parent property: The ID, name and displayName of the parent management group.
     *
     * @param parent the parent value to set.
     * @return the SubscriptionUnderManagementGroupInner object itself.
     */
    public SubscriptionUnderManagementGroupInner withParent(ParentGroupBagInfo parent) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionUnderManagementGroupProperties();
        }
        this.innerProperties().withParent(parent);
        return this;
    }

    /**
     * Get the state property: The state of the subscription.
     *
     * @return the state value.
     */
    public String state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: The state of the subscription.
     *
     * @param state the state value to set.
     * @return the SubscriptionUnderManagementGroupInner object itself.
     */
    public SubscriptionUnderManagementGroupInner withState(String state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionUnderManagementGroupProperties();
        }
        this.innerProperties().withState(state);
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
