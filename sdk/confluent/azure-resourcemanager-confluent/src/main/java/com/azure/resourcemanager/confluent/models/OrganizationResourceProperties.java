// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Organization resource property. */
@Fluent
public class OrganizationResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OrganizationResourceProperties.class);

    /*
     * The creation time of the resource.
     */
    @JsonProperty(value = "createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdTime;

    /*
     * Provision states for confluent RP
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisionState provisioningState;

    /*
     * Id of the Confluent organization.
     */
    @JsonProperty(value = "organizationId", access = JsonProperty.Access.WRITE_ONLY)
    private String organizationId;

    /*
     * SSO url for the Confluent organization.
     */
    @JsonProperty(value = "ssoUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String ssoUrl;

    /*
     * Confluent offer detail
     */
    @JsonProperty(value = "offerDetail")
    private OfferDetail offerDetail;

    /*
     * Subscriber detail
     */
    @JsonProperty(value = "userDetail")
    private UserDetail userDetail;

    /**
     * Get the createdTime property: The creation time of the resource.
     *
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get the provisioningState property: Provision states for confluent RP.
     *
     * @return the provisioningState value.
     */
    public ProvisionState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the organizationId property: Id of the Confluent organization.
     *
     * @return the organizationId value.
     */
    public String organizationId() {
        return this.organizationId;
    }

    /**
     * Get the ssoUrl property: SSO url for the Confluent organization.
     *
     * @return the ssoUrl value.
     */
    public String ssoUrl() {
        return this.ssoUrl;
    }

    /**
     * Get the offerDetail property: Confluent offer detail.
     *
     * @return the offerDetail value.
     */
    public OfferDetail offerDetail() {
        return this.offerDetail;
    }

    /**
     * Set the offerDetail property: Confluent offer detail.
     *
     * @param offerDetail the offerDetail value to set.
     * @return the OrganizationResourceProperties object itself.
     */
    public OrganizationResourceProperties withOfferDetail(OfferDetail offerDetail) {
        this.offerDetail = offerDetail;
        return this;
    }

    /**
     * Get the userDetail property: Subscriber detail.
     *
     * @return the userDetail value.
     */
    public UserDetail userDetail() {
        return this.userDetail;
    }

    /**
     * Set the userDetail property: Subscriber detail.
     *
     * @param userDetail the userDetail value to set.
     * @return the OrganizationResourceProperties object itself.
     */
    public OrganizationResourceProperties withUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (offerDetail() != null) {
            offerDetail().validate();
        }
        if (userDetail() != null) {
            userDetail().validate();
        }
    }
}
