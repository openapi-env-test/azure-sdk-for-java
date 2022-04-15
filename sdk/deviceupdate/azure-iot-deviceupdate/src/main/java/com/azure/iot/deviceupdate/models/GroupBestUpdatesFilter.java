package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Group best updates filter. */
@Fluent
public final class GroupBestUpdatesFilter {
    /*
     * Update provider.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /*
     * Update name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Update version.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get the provider property: Update provider.
     *
     * @return the provider value.
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * Set the provider property: Update provider.
     *
     * @param provider the provider value to set.
     * @return the GroupBestUpdatesFilter object itself.
     */
    public GroupBestUpdatesFilter setProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the name property: Update name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Update name.
     *
     * @param name the name value to set.
     * @return the GroupBestUpdatesFilter object itself.
     */
    public GroupBestUpdatesFilter setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the version property: Update version.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: Update version.
     *
     * @param version the version value to set.
     * @return the GroupBestUpdatesFilter object itself.
     */
    public GroupBestUpdatesFilter setVersion(String version) {
        this.version = version;
        return this;
    }
}
