// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Object that includes an array of Deployment resource name and set them as active. */
@Fluent
public final class ActiveDeploymentCollection {
    /*
     * Collection of Deployment name.
     */
    @JsonProperty(value = "activeDeploymentNames")
    private List<String> activeDeploymentNames;

    /**
     * Get the activeDeploymentNames property: Collection of Deployment name.
     *
     * @return the activeDeploymentNames value.
     */
    public List<String> activeDeploymentNames() {
        return this.activeDeploymentNames;
    }

    /**
     * Set the activeDeploymentNames property: Collection of Deployment name.
     *
     * @param activeDeploymentNames the activeDeploymentNames value to set.
     * @return the ActiveDeploymentCollection object itself.
     */
    public ActiveDeploymentCollection withActiveDeploymentNames(List<String> activeDeploymentNames) {
        this.activeDeploymentNames = activeDeploymentNames;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
