// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.SkuDescription;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteBuildProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Static Site ARM resource. */
@JsonFlatten
@Fluent
public class StaticSiteArmResourceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StaticSiteArmResourceInner.class);

    /*
     * Description of a SKU for a scalable resource.
     */
    @JsonProperty(value = "sku")
    private SkuDescription sku;

    /*
     * The default autogenerated hostname for the static site.
     */
    @JsonProperty(value = "properties.defaultHostname", access = JsonProperty.Access.WRITE_ONLY)
    private String defaultHostname;

    /*
     * URL for the repository of the static site.
     */
    @JsonProperty(value = "properties.repositoryUrl")
    private String repositoryUrl;

    /*
     * The target branch in the repository.
     */
    @JsonProperty(value = "properties.branch")
    private String branch;

    /*
     * The custom domains associated with this static site.
     */
    @JsonProperty(value = "properties.customDomains", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> customDomains;

    /*
     * A user's github repository token. This is used to setup the Github
     * Actions workflow file and API secrets.
     */
    @JsonProperty(value = "properties.repositoryToken")
    private String repositoryToken;

    /*
     * Build properties to configure on the repository.
     */
    @JsonProperty(value = "properties.buildProperties")
    private StaticSiteBuildProperties buildProperties;

    /*
     * Kind of resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Get the sku property: Description of a SKU for a scalable resource.
     *
     * @return the sku value.
     */
    public SkuDescription sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Description of a SKU for a scalable resource.
     *
     * @param sku the sku value to set.
     * @return the StaticSiteArmResourceInner object itself.
     */
    public StaticSiteArmResourceInner withSku(SkuDescription sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the defaultHostname property: The default autogenerated hostname for the static site.
     *
     * @return the defaultHostname value.
     */
    public String defaultHostname() {
        return this.defaultHostname;
    }

    /**
     * Get the repositoryUrl property: URL for the repository of the static site.
     *
     * @return the repositoryUrl value.
     */
    public String repositoryUrl() {
        return this.repositoryUrl;
    }

    /**
     * Set the repositoryUrl property: URL for the repository of the static site.
     *
     * @param repositoryUrl the repositoryUrl value to set.
     * @return the StaticSiteArmResourceInner object itself.
     */
    public StaticSiteArmResourceInner withRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    /**
     * Get the branch property: The target branch in the repository.
     *
     * @return the branch value.
     */
    public String branch() {
        return this.branch;
    }

    /**
     * Set the branch property: The target branch in the repository.
     *
     * @param branch the branch value to set.
     * @return the StaticSiteArmResourceInner object itself.
     */
    public StaticSiteArmResourceInner withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Get the customDomains property: The custom domains associated with this static site.
     *
     * @return the customDomains value.
     */
    public List<String> customDomains() {
        return this.customDomains;
    }

    /**
     * Get the repositoryToken property: A user's github repository token. This is used to setup the Github Actions
     * workflow file and API secrets.
     *
     * @return the repositoryToken value.
     */
    public String repositoryToken() {
        return this.repositoryToken;
    }

    /**
     * Set the repositoryToken property: A user's github repository token. This is used to setup the Github Actions
     * workflow file and API secrets.
     *
     * @param repositoryToken the repositoryToken value to set.
     * @return the StaticSiteArmResourceInner object itself.
     */
    public StaticSiteArmResourceInner withRepositoryToken(String repositoryToken) {
        this.repositoryToken = repositoryToken;
        return this;
    }

    /**
     * Get the buildProperties property: Build properties to configure on the repository.
     *
     * @return the buildProperties value.
     */
    public StaticSiteBuildProperties buildProperties() {
        return this.buildProperties;
    }

    /**
     * Set the buildProperties property: Build properties to configure on the repository.
     *
     * @param buildProperties the buildProperties value to set.
     * @return the StaticSiteArmResourceInner object itself.
     */
    public StaticSiteArmResourceInner withBuildProperties(StaticSiteBuildProperties buildProperties) {
        this.buildProperties = buildProperties;
        return this;
    }

    /**
     * Get the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Kind of resource.
     *
     * @param kind the kind value to set.
     * @return the StaticSiteArmResourceInner object itself.
     */
    public StaticSiteArmResourceInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StaticSiteArmResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StaticSiteArmResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (buildProperties() != null) {
            buildProperties().validate();
        }
    }
}
