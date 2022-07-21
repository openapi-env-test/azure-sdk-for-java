// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** StaticSiteLinkedBackendARMResource resource specific properties. */
@Fluent
public final class StaticSiteLinkedBackendArmResourceProperties {
    /*
     * The resource id of the backend linked to the static site
     */
    @JsonProperty(value = "backendResourceId")
    private String backendResourceId;

    /*
     * The region of the backend linked to the static site
     */
    @JsonProperty(value = "region")
    private String region;

    /*
     * The date and time on which the backend was linked to the static site.
     */
    @JsonProperty(value = "createdOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdOn;

    /*
     * The provisioning state of the linking process.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the backendResourceId property: The resource id of the backend linked to the static site.
     *
     * @return the backendResourceId value.
     */
    public String backendResourceId() {
        return this.backendResourceId;
    }

    /**
     * Set the backendResourceId property: The resource id of the backend linked to the static site.
     *
     * @param backendResourceId the backendResourceId value to set.
     * @return the StaticSiteLinkedBackendArmResourceProperties object itself.
     */
    public StaticSiteLinkedBackendArmResourceProperties withBackendResourceId(String backendResourceId) {
        this.backendResourceId = backendResourceId;
        return this;
    }

    /**
     * Get the region property: The region of the backend linked to the static site.
     *
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Set the region property: The region of the backend linked to the static site.
     *
     * @param region the region value to set.
     * @return the StaticSiteLinkedBackendArmResourceProperties object itself.
     */
    public StaticSiteLinkedBackendArmResourceProperties withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get the createdOn property: The date and time on which the backend was linked to the static site.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.createdOn;
    }

    /**
     * Get the provisioningState property: The provisioning state of the linking process.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
