// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.engagementfabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** EngagementFabric channel description. */
@Fluent
public final class ChannelTypeDescription {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ChannelTypeDescription.class);

    /*
     * Channel type
     */
    @JsonProperty(value = "channelType")
    private String channelType;

    /*
     * Text description for the channel
     */
    @JsonProperty(value = "channelDescription")
    private String channelDescription;

    /*
     * All the available functions for the channel
     */
    @JsonProperty(value = "channelFunctions")
    private List<String> channelFunctions;

    /**
     * Get the channelType property: Channel type.
     *
     * @return the channelType value.
     */
    public String channelType() {
        return this.channelType;
    }

    /**
     * Set the channelType property: Channel type.
     *
     * @param channelType the channelType value to set.
     * @return the ChannelTypeDescription object itself.
     */
    public ChannelTypeDescription withChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }

    /**
     * Get the channelDescription property: Text description for the channel.
     *
     * @return the channelDescription value.
     */
    public String channelDescription() {
        return this.channelDescription;
    }

    /**
     * Set the channelDescription property: Text description for the channel.
     *
     * @param channelDescription the channelDescription value to set.
     * @return the ChannelTypeDescription object itself.
     */
    public ChannelTypeDescription withChannelDescription(String channelDescription) {
        this.channelDescription = channelDescription;
        return this;
    }

    /**
     * Get the channelFunctions property: All the available functions for the channel.
     *
     * @return the channelFunctions value.
     */
    public List<String> channelFunctions() {
        return this.channelFunctions;
    }

    /**
     * Set the channelFunctions property: All the available functions for the channel.
     *
     * @param channelFunctions the channelFunctions value to set.
     * @return the ChannelTypeDescription object itself.
     */
    public ChannelTypeDescription withChannelFunctions(List<String> channelFunctions) {
        this.channelFunctions = channelFunctions;
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
