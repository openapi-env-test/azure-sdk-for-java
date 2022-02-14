// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.BgpCommunity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of Service Community. */
@Fluent
public final class BgpServiceCommunityPropertiesFormat {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BgpServiceCommunityPropertiesFormat.class);

    /*
     * The name of the bgp community. e.g. Skype.
     */
    @JsonProperty(value = "serviceName")
    private String serviceName;

    /*
     * A list of bgp communities.
     */
    @JsonProperty(value = "bgpCommunities")
    private List<BgpCommunity> bgpCommunities;

    /**
     * Get the serviceName property: The name of the bgp community. e.g. Skype.
     *
     * @return the serviceName value.
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: The name of the bgp community. e.g. Skype.
     *
     * @param serviceName the serviceName value to set.
     * @return the BgpServiceCommunityPropertiesFormat object itself.
     */
    public BgpServiceCommunityPropertiesFormat withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the bgpCommunities property: A list of bgp communities.
     *
     * @return the bgpCommunities value.
     */
    public List<BgpCommunity> bgpCommunities() {
        return this.bgpCommunities;
    }

    /**
     * Set the bgpCommunities property: A list of bgp communities.
     *
     * @param bgpCommunities the bgpCommunities value to set.
     * @return the BgpServiceCommunityPropertiesFormat object itself.
     */
    public BgpServiceCommunityPropertiesFormat withBgpCommunities(List<BgpCommunity> bgpCommunities) {
        this.bgpCommunities = bgpCommunities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (bgpCommunities() != null) {
            bgpCommunities().forEach(e -> e.validate());
        }
    }
}
