/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_01_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Access profile for managed cluster API server.
 */
public class ManagedClusterAPIServerAccessProfile {
    /**
     * Authorized IP Ranges to kubernetes API server.
     */
    @JsonProperty(value = "authorizedIPRanges")
    private List<String> authorizedIPRanges;

    /**
     * Whether to create the cluster as a private cluster or not.
     */
    @JsonProperty(value = "enablePrivateCluster")
    private Boolean enablePrivateCluster;

    /**
     * Get authorized IP Ranges to kubernetes API server.
     *
     * @return the authorizedIPRanges value
     */
    public List<String> authorizedIPRanges() {
        return this.authorizedIPRanges;
    }

    /**
     * Set authorized IP Ranges to kubernetes API server.
     *
     * @param authorizedIPRanges the authorizedIPRanges value to set
     * @return the ManagedClusterAPIServerAccessProfile object itself.
     */
    public ManagedClusterAPIServerAccessProfile withAuthorizedIPRanges(List<String> authorizedIPRanges) {
        this.authorizedIPRanges = authorizedIPRanges;
        return this;
    }

    /**
     * Get whether to create the cluster as a private cluster or not.
     *
     * @return the enablePrivateCluster value
     */
    public Boolean enablePrivateCluster() {
        return this.enablePrivateCluster;
    }

    /**
     * Set whether to create the cluster as a private cluster or not.
     *
     * @param enablePrivateCluster the enablePrivateCluster value to set
     * @return the ManagedClusterAPIServerAccessProfile object itself.
     */
    public ManagedClusterAPIServerAccessProfile withEnablePrivateCluster(Boolean enablePrivateCluster) {
        this.enablePrivateCluster = enablePrivateCluster;
        return this;
    }

}
