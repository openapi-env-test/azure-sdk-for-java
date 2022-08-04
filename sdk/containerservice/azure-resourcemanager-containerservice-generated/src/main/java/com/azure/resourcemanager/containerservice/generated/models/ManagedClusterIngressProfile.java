// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Ingress profile for the container service cluster. */
@Fluent
public final class ManagedClusterIngressProfile {
    /*
     * Web App Routing settings for the ingress profile.
     */
    @JsonProperty(value = "webAppRouting")
    private ManagedClusterIngressProfileWebAppRouting webAppRouting;

    /**
     * Get the webAppRouting property: Web App Routing settings for the ingress profile.
     *
     * @return the webAppRouting value.
     */
    public ManagedClusterIngressProfileWebAppRouting webAppRouting() {
        return this.webAppRouting;
    }

    /**
     * Set the webAppRouting property: Web App Routing settings for the ingress profile.
     *
     * @param webAppRouting the webAppRouting value to set.
     * @return the ManagedClusterIngressProfile object itself.
     */
    public ManagedClusterIngressProfile withWebAppRouting(ManagedClusterIngressProfileWebAppRouting webAppRouting) {
        this.webAppRouting = webAppRouting;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (webAppRouting() != null) {
            webAppRouting().validate();
        }
    }
}
