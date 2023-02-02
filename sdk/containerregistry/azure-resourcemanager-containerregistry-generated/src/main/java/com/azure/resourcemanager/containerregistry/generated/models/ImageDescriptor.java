// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties for a registry image. */
@Fluent
public final class ImageDescriptor {
    /*
     * The registry login server.
     */
    @JsonProperty(value = "registry")
    private String registry;

    /*
     * The repository name.
     */
    @JsonProperty(value = "repository")
    private String repository;

    /*
     * The tag name.
     */
    @JsonProperty(value = "tag")
    private String tag;

    /*
     * The sha256-based digest of the image manifest.
     */
    @JsonProperty(value = "digest")
    private String digest;

    /** Creates an instance of ImageDescriptor class. */
    public ImageDescriptor() {
    }

    /**
     * Get the registry property: The registry login server.
     *
     * @return the registry value.
     */
    public String registry() {
        return this.registry;
    }

    /**
     * Set the registry property: The registry login server.
     *
     * @param registry the registry value to set.
     * @return the ImageDescriptor object itself.
     */
    public ImageDescriptor withRegistry(String registry) {
        this.registry = registry;
        return this;
    }

    /**
     * Get the repository property: The repository name.
     *
     * @return the repository value.
     */
    public String repository() {
        return this.repository;
    }

    /**
     * Set the repository property: The repository name.
     *
     * @param repository the repository value to set.
     * @return the ImageDescriptor object itself.
     */
    public ImageDescriptor withRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get the tag property: The tag name.
     *
     * @return the tag value.
     */
    public String tag() {
        return this.tag;
    }

    /**
     * Set the tag property: The tag name.
     *
     * @param tag the tag value to set.
     * @return the ImageDescriptor object itself.
     */
    public ImageDescriptor withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get the digest property: The sha256-based digest of the image manifest.
     *
     * @return the digest value.
     */
    public String digest() {
        return this.digest;
    }

    /**
     * Set the digest property: The sha256-based digest of the image manifest.
     *
     * @param digest the digest value to set.
     * @return the ImageDescriptor object itself.
     */
    public ImageDescriptor withDigest(String digest) {
        this.digest = digest;
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
