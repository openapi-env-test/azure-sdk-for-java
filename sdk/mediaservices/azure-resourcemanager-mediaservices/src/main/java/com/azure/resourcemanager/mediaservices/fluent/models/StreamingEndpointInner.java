// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.mediaservices.models.ArmStreamingEndpointCurrentSku;
import com.azure.resourcemanager.mediaservices.models.CrossSiteAccessPolicies;
import com.azure.resourcemanager.mediaservices.models.StreamingEndpointAccessControl;
import com.azure.resourcemanager.mediaservices.models.StreamingEndpointResourceState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** The streaming endpoint. */
@Fluent
public final class StreamingEndpointInner extends Resource {
    /*
     * The streaming endpoint properties.
     */
    @JsonProperty(value = "properties")
    private StreamingEndpointProperties innerProperties;

    /*
     * The system metadata relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The streaming endpoint sku.
     */
    @JsonProperty(value = "sku")
    private ArmStreamingEndpointCurrentSku sku;

    /** Creates an instance of StreamingEndpointInner class. */
    public StreamingEndpointInner() {
    }

    /**
     * Get the innerProperties property: The streaming endpoint properties.
     *
     * @return the innerProperties value.
     */
    private StreamingEndpointProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the sku property: The streaming endpoint sku.
     *
     * @return the sku value.
     */
    public ArmStreamingEndpointCurrentSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The streaming endpoint sku.
     *
     * @param sku the sku value to set.
     * @return the StreamingEndpointInner object itself.
     */
    public StreamingEndpointInner withSku(ArmStreamingEndpointCurrentSku sku) {
        this.sku = sku;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StreamingEndpointInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StreamingEndpointInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the description property: The streaming endpoint description.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The streaming endpoint description.
     *
     * @param description the description value to set.
     * @return the StreamingEndpointInner object itself.
     */
    public StreamingEndpointInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StreamingEndpointProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the scaleUnits property: The number of scale units. Use the Scale operation to adjust this value.
     *
     * @return the scaleUnits value.
     */
    public Integer scaleUnits() {
        return this.innerProperties() == null ? null : this.innerProperties().scaleUnits();
    }

    /**
     * Set the scaleUnits property: The number of scale units. Use the Scale operation to adjust this value.
     *
     * @param scaleUnits the scaleUnits value to set.
     * @return the StreamingEndpointInner object itself.
     */
    public StreamingEndpointInner withScaleUnits(Integer scaleUnits) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StreamingEndpointProperties();
        }
        this.innerProperties().withScaleUnits(scaleUnits);
        return this;
    }

    /**
     * Get the availabilitySetName property: This feature is deprecated, do not set a value for this property.
     *
     * @return the availabilitySetName value.
     */
    public String availabilitySetName() {
        return this.innerProperties() == null ? null : this.innerProperties().availabilitySetName();
    }

    /**
     * Set the availabilitySetName property: This feature is deprecated, do not set a value for this property.
     *
     * @param availabilitySetName the availabilitySetName value to set.
     * @return the StreamingEndpointInner object itself.
     */
    public StreamingEndpointInner withAvailabilitySetName(String availabilitySetName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StreamingEndpointProperties();
        }
        this.innerProperties().withAvailabilitySetName(availabilitySetName);
        return this;
    }

    /**
     * Get the accessControl property: The access control definition of the streaming endpoint.
     *
     * @return the accessControl value.
     */
    public StreamingEndpointAccessControl accessControl() {
        return this.innerProperties() == null ? null : this.innerProperties().accessControl();
    }

    /**
     * Set the accessControl property: The access control definition of the streaming endpoint.
     *
     * @param accessControl the accessControl value to set.
     * @return the StreamingEndpointInner object itself.
     */
    public StreamingEndpointInner withAccessControl(StreamingEndpointAccessControl accessControl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StreamingEndpointProperties();
        }
        this.innerProperties().withAccessControl(accessControl);
        return this;
    }

    /**
     * Get the maxCacheAge property: Max cache age.
     *
     * @return the maxCacheAge value.
     */
    public Long maxCacheAge() {
        return this.innerProperties() == null ? null : this.innerProperties().maxCacheAge();
    }

    /**
     * Set the maxCacheAge property: Max cache age.
     *
     * @param maxCacheAge the maxCacheAge value to set.
     * @return the StreamingEndpointInner object itself.
     */
    public StreamingEndpointInner withMaxCacheAge(Long maxCacheAge) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StreamingEndpointProperties();
        }
        this.innerProperties().withMaxCacheAge(maxCacheAge);
        return this;
    }

    /**
     * Get the customHostNames property: The custom host names of the streaming endpoint.
     *
     * @return the customHostNames value.
     */
    public List<String> customHostNames() {
        return this.innerProperties() == null ? null : this.innerProperties().customHostNames();
    }

    /**
     * Set the customHostNames property: The custom host names of the streaming endpoint.
     *
     * @param customHostNames the customHostNames value to set.
     * @return the StreamingEndpointInner object itself.
     */
    public StreamingEndpointInner withCustomHostNames(List<String> customHostNames) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StreamingEndpointProperties();
        }
        this.innerProperties().withCustomHostNames(customHostNames);
        return this;
    }

    /**
     * Get the hostname property: The streaming endpoint host name.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.innerProperties() == null ? null : this.innerProperties().hostname();
    }

    /**
     * Get the cdnEnabled property: The CDN enabled flag.
     *
     * @return the cdnEnabled value.
     */
    public Boolean cdnEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().cdnEnabled();
    }

    /**
     * Set the cdnEnabled property: The CDN enabled flag.
     *
     * @param cdnEnabled the cdnEnabled value to set.
     * @return the StreamingEndpointInner object itself.
     */
    public StreamingEndpointInner withCdnEnabled(Boolean cdnEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StreamingEndpointProperties();
        }
        this.innerProperties().withCdnEnabled(cdnEnabled);
        return this;
    }

    /**
     * Get the cdnProvider property: The CDN provider name.
     *
     * @return the cdnProvider value.
     */
    public String cdnProvider() {
        return this.innerProperties() == null ? null : this.innerProperties().cdnProvider();
    }

    /**
     * Set the cdnProvider property: The CDN provider name.
     *
     * @param cdnProvider the cdnProvider value to set.
     * @return the StreamingEndpointInner object itself.
     */
    public StreamingEndpointInner withCdnProvider(String cdnProvider) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StreamingEndpointProperties();
        }
        this.innerProperties().withCdnProvider(cdnProvider);
        return this;
    }

    /**
     * Get the cdnProfile property: The CDN profile name.
     *
     * @return the cdnProfile value.
     */
    public String cdnProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().cdnProfile();
    }

    /**
     * Set the cdnProfile property: The CDN profile name.
     *
     * @param cdnProfile the cdnProfile value to set.
     * @return the StreamingEndpointInner object itself.
     */
    public StreamingEndpointInner withCdnProfile(String cdnProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StreamingEndpointProperties();
        }
        this.innerProperties().withCdnProfile(cdnProfile);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the streaming endpoint.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the resourceState property: The resource state of the streaming endpoint.
     *
     * @return the resourceState value.
     */
    public StreamingEndpointResourceState resourceState() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceState();
    }

    /**
     * Get the crossSiteAccessPolicies property: The streaming endpoint access policies.
     *
     * @return the crossSiteAccessPolicies value.
     */
    public CrossSiteAccessPolicies crossSiteAccessPolicies() {
        return this.innerProperties() == null ? null : this.innerProperties().crossSiteAccessPolicies();
    }

    /**
     * Set the crossSiteAccessPolicies property: The streaming endpoint access policies.
     *
     * @param crossSiteAccessPolicies the crossSiteAccessPolicies value to set.
     * @return the StreamingEndpointInner object itself.
     */
    public StreamingEndpointInner withCrossSiteAccessPolicies(CrossSiteAccessPolicies crossSiteAccessPolicies) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StreamingEndpointProperties();
        }
        this.innerProperties().withCrossSiteAccessPolicies(crossSiteAccessPolicies);
        return this;
    }

    /**
     * Get the freeTrialEndTime property: The free trial expiration time.
     *
     * @return the freeTrialEndTime value.
     */
    public OffsetDateTime freeTrialEndTime() {
        return this.innerProperties() == null ? null : this.innerProperties().freeTrialEndTime();
    }

    /**
     * Get the created property: The exact time the streaming endpoint was created.
     *
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.innerProperties() == null ? null : this.innerProperties().created();
    }

    /**
     * Get the lastModified property: The exact time the streaming endpoint was last modified.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModified();
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
        if (sku() != null) {
            sku().validate();
        }
    }
}
