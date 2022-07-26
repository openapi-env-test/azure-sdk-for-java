// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.labservices.models.EnableState;
import com.azure.resourcemanager.labservices.models.OsState;
import com.azure.resourcemanager.labservices.models.OsType;
import com.azure.resourcemanager.labservices.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of an image resource. */
@Fluent
public final class ImageProperties extends ImageUpdateProperties {
    /*
     * Current provisioning state of the image.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The image display name.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * A description of the image.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * URL of the image icon.
     */
    @JsonProperty(value = "iconUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String iconUrl;

    /*
     * The image author.
     */
    @JsonProperty(value = "author", access = JsonProperty.Access.WRITE_ONLY)
    private String author;

    /*
     * The OS Type of the image.
     */
    @JsonProperty(value = "osType", access = JsonProperty.Access.WRITE_ONLY)
    private OsType osType;

    /*
     * The ID of marketplace plan associated with the image (optional).
     */
    @JsonProperty(value = "plan", access = JsonProperty.Access.WRITE_ONLY)
    private String plan;

    /*
     * The status of image terms of use (enabled = accepted, disabled = not
     * accepted).
     */
    @JsonProperty(value = "termsStatus", access = JsonProperty.Access.WRITE_ONLY)
    private EnableState termsStatus;

    /*
     * The ID of an offer associated with the image.
     */
    @JsonProperty(value = "offer", access = JsonProperty.Access.WRITE_ONLY)
    private String offer;

    /*
     * The ID of the publisher of the image.
     */
    @JsonProperty(value = "publisher", access = JsonProperty.Access.WRITE_ONLY)
    private String publisher;

    /*
     * The image SKU.
     */
    @JsonProperty(value = "sku", access = JsonProperty.Access.WRITE_ONLY)
    private String sku;

    /*
     * The image version.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * The ID for the image in the shared gallery.
     */
    @JsonProperty(value = "sharedGalleryId", access = JsonProperty.Access.WRITE_ONLY)
    private String sharedGalleryId;

    /*
     * The available regions of the image in the shared gallery.
     */
    @JsonProperty(value = "availableRegions")
    private List<String> availableRegions;

    /*
     * The OS State of the image.
     */
    @JsonProperty(value = "osState", access = JsonProperty.Access.WRITE_ONLY)
    private OsState osState;

    /**
     * Get the provisioningState property: Current provisioning state of the image.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the displayName property: The image display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the description property: A description of the image.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the iconUrl property: URL of the image icon.
     *
     * @return the iconUrl value.
     */
    public String iconUrl() {
        return this.iconUrl;
    }

    /**
     * Get the author property: The image author.
     *
     * @return the author value.
     */
    public String author() {
        return this.author;
    }

    /**
     * Get the osType property: The OS Type of the image.
     *
     * @return the osType value.
     */
    public OsType osType() {
        return this.osType;
    }

    /**
     * Get the plan property: The ID of marketplace plan associated with the image (optional).
     *
     * @return the plan value.
     */
    public String plan() {
        return this.plan;
    }

    /**
     * Get the termsStatus property: The status of image terms of use (enabled = accepted, disabled = not accepted).
     *
     * @return the termsStatus value.
     */
    public EnableState termsStatus() {
        return this.termsStatus;
    }

    /**
     * Get the offer property: The ID of an offer associated with the image.
     *
     * @return the offer value.
     */
    public String offer() {
        return this.offer;
    }

    /**
     * Get the publisher property: The ID of the publisher of the image.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Get the sku property: The image SKU.
     *
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Get the version property: The image version.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the sharedGalleryId property: The ID for the image in the shared gallery.
     *
     * @return the sharedGalleryId value.
     */
    public String sharedGalleryId() {
        return this.sharedGalleryId;
    }

    /**
     * Get the availableRegions property: The available regions of the image in the shared gallery.
     *
     * @return the availableRegions value.
     */
    public List<String> availableRegions() {
        return this.availableRegions;
    }

    /**
     * Set the availableRegions property: The available regions of the image in the shared gallery.
     *
     * @param availableRegions the availableRegions value to set.
     * @return the ImageProperties object itself.
     */
    public ImageProperties withAvailableRegions(List<String> availableRegions) {
        this.availableRegions = availableRegions;
        return this;
    }

    /**
     * Get the osState property: The OS State of the image.
     *
     * @return the osState value.
     */
    public OsState osState() {
        return this.osState;
    }

    /** {@inheritDoc} */
    @Override
    public ImageProperties withEnabledState(EnableState enabledState) {
        super.withEnabledState(enabledState);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
