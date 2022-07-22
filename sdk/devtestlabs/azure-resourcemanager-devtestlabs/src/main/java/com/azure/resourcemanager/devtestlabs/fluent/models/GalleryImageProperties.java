// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties of a gallery image. */
@Fluent
public final class GalleryImageProperties {
    /*
     * The author of the gallery image.
     */
    @JsonProperty(value = "author")
    private String author;

    /*
     * The creation date of the gallery image.
     */
    @JsonProperty(value = "createdDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdDate;

    /*
     * The description of the gallery image.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The image reference of the gallery image.
     */
    @JsonProperty(value = "imageReference")
    private GalleryImageReference innerImageReference;

    /*
     * The icon of the gallery image.
     */
    @JsonProperty(value = "icon")
    private String icon;

    /*
     * Indicates whether this gallery image is enabled.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * The third party plan that applies to this image
     */
    @JsonProperty(value = "planId")
    private String planId;

    /*
     * Indicates if the plan has been authorized for programmatic deployment.
     */
    @JsonProperty(value = "isPlanAuthorized")
    private Boolean isPlanAuthorized;

    /**
     * Get the author property: The author of the gallery image.
     *
     * @return the author value.
     */
    public String author() {
        return this.author;
    }

    /**
     * Set the author property: The author of the gallery image.
     *
     * @param author the author value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * Get the createdDate property: The creation date of the gallery image.
     *
     * @return the createdDate value.
     */
    public OffsetDateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Get the description property: The description of the gallery image.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the gallery image.
     *
     * @param description the description value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the innerImageReference property: The image reference of the gallery image.
     *
     * @return the innerImageReference value.
     */
    private GalleryImageReference innerImageReference() {
        return this.innerImageReference;
    }

    /**
     * Get the icon property: The icon of the gallery image.
     *
     * @return the icon value.
     */
    public String icon() {
        return this.icon;
    }

    /**
     * Set the icon property: The icon of the gallery image.
     *
     * @param icon the icon value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * Get the enabled property: Indicates whether this gallery image is enabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether this gallery image is enabled.
     *
     * @param enabled the enabled value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the planId property: The third party plan that applies to this image.
     *
     * @return the planId value.
     */
    public String planId() {
        return this.planId;
    }

    /**
     * Set the planId property: The third party plan that applies to this image.
     *
     * @param planId the planId value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * Get the isPlanAuthorized property: Indicates if the plan has been authorized for programmatic deployment.
     *
     * @return the isPlanAuthorized value.
     */
    public Boolean isPlanAuthorized() {
        return this.isPlanAuthorized;
    }

    /**
     * Set the isPlanAuthorized property: Indicates if the plan has been authorized for programmatic deployment.
     *
     * @param isPlanAuthorized the isPlanAuthorized value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withIsPlanAuthorized(Boolean isPlanAuthorized) {
        this.isPlanAuthorized = isPlanAuthorized;
        return this;
    }

    /**
     * Get the offer property: The offer of the gallery image.
     *
     * @return the offer value.
     */
    public String offer() {
        return this.innerImageReference() == null ? null : this.innerImageReference().offer();
    }

    /**
     * Set the offer property: The offer of the gallery image.
     *
     * @param offer the offer value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withOffer(String offer) {
        if (this.innerImageReference() == null) {
            this.innerImageReference = new GalleryImageReference();
        }
        this.innerImageReference().withOffer(offer);
        return this;
    }

    /**
     * Get the publisher property: The publisher of the gallery image.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.innerImageReference() == null ? null : this.innerImageReference().publisher();
    }

    /**
     * Set the publisher property: The publisher of the gallery image.
     *
     * @param publisher the publisher value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withPublisher(String publisher) {
        if (this.innerImageReference() == null) {
            this.innerImageReference = new GalleryImageReference();
        }
        this.innerImageReference().withPublisher(publisher);
        return this;
    }

    /**
     * Get the sku property: The SKU of the gallery image.
     *
     * @return the sku value.
     */
    public String sku() {
        return this.innerImageReference() == null ? null : this.innerImageReference().sku();
    }

    /**
     * Set the sku property: The SKU of the gallery image.
     *
     * @param sku the sku value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withSku(String sku) {
        if (this.innerImageReference() == null) {
            this.innerImageReference = new GalleryImageReference();
        }
        this.innerImageReference().withSku(sku);
        return this;
    }

    /**
     * Get the osType property: The OS type of the gallery image.
     *
     * @return the osType value.
     */
    public String osType() {
        return this.innerImageReference() == null ? null : this.innerImageReference().osType();
    }

    /**
     * Set the osType property: The OS type of the gallery image.
     *
     * @param osType the osType value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withOsType(String osType) {
        if (this.innerImageReference() == null) {
            this.innerImageReference = new GalleryImageReference();
        }
        this.innerImageReference().withOsType(osType);
        return this;
    }

    /**
     * Get the version property: The version of the gallery image.
     *
     * @return the version value.
     */
    public String version() {
        return this.innerImageReference() == null ? null : this.innerImageReference().version();
    }

    /**
     * Set the version property: The version of the gallery image.
     *
     * @param version the version value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withVersion(String version) {
        if (this.innerImageReference() == null) {
            this.innerImageReference = new GalleryImageReference();
        }
        this.innerImageReference().withVersion(version);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerImageReference() != null) {
            innerImageReference().validate();
        }
    }
}
