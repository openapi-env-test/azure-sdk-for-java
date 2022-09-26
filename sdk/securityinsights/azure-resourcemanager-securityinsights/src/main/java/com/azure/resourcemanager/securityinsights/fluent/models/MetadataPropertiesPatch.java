// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.securityinsights.models.Kind;
import com.azure.resourcemanager.securityinsights.models.MetadataAuthor;
import com.azure.resourcemanager.securityinsights.models.MetadataCategories;
import com.azure.resourcemanager.securityinsights.models.MetadataDependencies;
import com.azure.resourcemanager.securityinsights.models.MetadataSource;
import com.azure.resourcemanager.securityinsights.models.MetadataSupport;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.List;

/** Metadata property bag for patch requests. This is the same as the MetadataProperties, but with nothing required. */
@Fluent
public final class MetadataPropertiesPatch {
    /*
     * Static ID for the content.  Used to identify dependencies and content from solutions or community.
     * Hard-coded/static for out of the box content and solutions. Dynamic for user-created.  This is the resource name
     */
    @JsonProperty(value = "contentId")
    private String contentId;

    /*
     * Full parent resource ID of the content item the metadata is for.  This is the full resource ID including the
     * scope (subscription and resource group)
     */
    @JsonProperty(value = "parentId")
    private String parentId;

    /*
     * Version of the content.  Default and recommended format is numeric (e.g. 1, 1.0, 1.0.0, 1.0.0.0), following ARM
     * template best practices.  Can also be any string, but then we cannot guarantee any version checks
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * The kind of content the metadata is for.
     */
    @JsonProperty(value = "kind")
    private Kind kind;

    /*
     * Source of the content.  This is where/how it was created.
     */
    @JsonProperty(value = "source")
    private MetadataSource source;

    /*
     * The creator of the content item.
     */
    @JsonProperty(value = "author")
    private MetadataAuthor author;

    /*
     * Support information for the metadata - type, name, contact information
     */
    @JsonProperty(value = "support")
    private MetadataSupport support;

    /*
     * Dependencies for the content item, what other content items it requires to work.  Can describe more complex
     * dependencies using a recursive/nested structure. For a single dependency an id/kind/version can be supplied or
     * operator/criteria for complex formats.
     */
    @JsonProperty(value = "dependencies")
    private MetadataDependencies dependencies;

    /*
     * Categories for the solution content item
     */
    @JsonProperty(value = "categories")
    private MetadataCategories categories;

    /*
     * Providers for the solution content item
     */
    @JsonProperty(value = "providers")
    private List<String> providers;

    /*
     * first publish date solution content item
     */
    @JsonProperty(value = "firstPublishDate")
    private LocalDate firstPublishDate;

    /*
     * last publish date for the solution content item
     */
    @JsonProperty(value = "lastPublishDate")
    private LocalDate lastPublishDate;

    /*
     * The custom version of the content. A optional free text
     */
    @JsonProperty(value = "customVersion")
    private String customVersion;

    /*
     * Schema version of the content. Can be used to distinguish between different flow based on the schema version
     */
    @JsonProperty(value = "contentSchemaVersion")
    private String contentSchemaVersion;

    /*
     * the icon identifier. this id can later be fetched from the solution template
     */
    @JsonProperty(value = "icon")
    private String icon;

    /*
     * the tactics the resource covers
     */
    @JsonProperty(value = "threatAnalysisTactics")
    private List<String> threatAnalysisTactics;

    /*
     * the techniques the resource covers, these have to be aligned with the tactics being used
     */
    @JsonProperty(value = "threatAnalysisTechniques")
    private List<String> threatAnalysisTechniques;

    /*
     * preview image file names. These will be taken from the solution artifacts
     */
    @JsonProperty(value = "previewImages")
    private List<String> previewImages;

    /*
     * preview image file names. These will be taken from the solution artifacts. used for dark theme support
     */
    @JsonProperty(value = "previewImagesDark")
    private List<String> previewImagesDark;

    /**
     * Get the contentId property: Static ID for the content. Used to identify dependencies and content from solutions
     * or community. Hard-coded/static for out of the box content and solutions. Dynamic for user-created. This is the
     * resource name.
     *
     * @return the contentId value.
     */
    public String contentId() {
        return this.contentId;
    }

    /**
     * Set the contentId property: Static ID for the content. Used to identify dependencies and content from solutions
     * or community. Hard-coded/static for out of the box content and solutions. Dynamic for user-created. This is the
     * resource name.
     *
     * @param contentId the contentId value to set.
     * @return the MetadataPropertiesPatch object itself.
     */
    public MetadataPropertiesPatch withContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }

    /**
     * Get the parentId property: Full parent resource ID of the content item the metadata is for. This is the full
     * resource ID including the scope (subscription and resource group).
     *
     * @return the parentId value.
     */
    public String parentId() {
        return this.parentId;
    }

    /**
     * Set the parentId property: Full parent resource ID of the content item the metadata is for. This is the full
     * resource ID including the scope (subscription and resource group).
     *
     * @param parentId the parentId value to set.
     * @return the MetadataPropertiesPatch object itself.
     */
    public MetadataPropertiesPatch withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * Get the version property: Version of the content. Default and recommended format is numeric (e.g. 1, 1.0, 1.0.0,
     * 1.0.0.0), following ARM template best practices. Can also be any string, but then we cannot guarantee any version
     * checks.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Version of the content. Default and recommended format is numeric (e.g. 1, 1.0, 1.0.0,
     * 1.0.0.0), following ARM template best practices. Can also be any string, but then we cannot guarantee any version
     * checks.
     *
     * @param version the version value to set.
     * @return the MetadataPropertiesPatch object itself.
     */
    public MetadataPropertiesPatch withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the kind property: The kind of content the metadata is for.
     *
     * @return the kind value.
     */
    public Kind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind of content the metadata is for.
     *
     * @param kind the kind value to set.
     * @return the MetadataPropertiesPatch object itself.
     */
    public MetadataPropertiesPatch withKind(Kind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the source property: Source of the content. This is where/how it was created.
     *
     * @return the source value.
     */
    public MetadataSource source() {
        return this.source;
    }

    /**
     * Set the source property: Source of the content. This is where/how it was created.
     *
     * @param source the source value to set.
     * @return the MetadataPropertiesPatch object itself.
     */
    public MetadataPropertiesPatch withSource(MetadataSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the author property: The creator of the content item.
     *
     * @return the author value.
     */
    public MetadataAuthor author() {
        return this.author;
    }

    /**
     * Set the author property: The creator of the content item.
     *
     * @param author the author value to set.
     * @return the MetadataPropertiesPatch object itself.
     */
    public MetadataPropertiesPatch withAuthor(MetadataAuthor author) {
        this.author = author;
        return this;
    }

    /**
     * Get the support property: Support information for the metadata - type, name, contact information.
     *
     * @return the support value.
     */
    public MetadataSupport support() {
        return this.support;
    }

    /**
     * Set the support property: Support information for the metadata - type, name, contact information.
     *
     * @param support the support value to set.
     * @return the MetadataPropertiesPatch object itself.
     */
    public MetadataPropertiesPatch withSupport(MetadataSupport support) {
        this.support = support;
        return this;
    }

    /**
     * Get the dependencies property: Dependencies for the content item, what other content items it requires to work.
     * Can describe more complex dependencies using a recursive/nested structure. For a single dependency an
     * id/kind/version can be supplied or operator/criteria for complex formats.
     *
     * @return the dependencies value.
     */
    public MetadataDependencies dependencies() {
        return this.dependencies;
    }

    /**
     * Set the dependencies property: Dependencies for the content item, what other content items it requires to work.
     * Can describe more complex dependencies using a recursive/nested structure. For a single dependency an
     * id/kind/version can be supplied or operator/criteria for complex formats.
     *
     * @param dependencies the dependencies value to set.
     * @return the MetadataPropertiesPatch object itself.
     */
    public MetadataPropertiesPatch withDependencies(MetadataDependencies dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    /**
     * Get the categories property: Categories for the solution content item.
     *
     * @return the categories value.
     */
    public MetadataCategories categories() {
        return this.categories;
    }

    /**
     * Set the categories property: Categories for the solution content item.
     *
     * @param categories the categories value to set.
     * @return the MetadataPropertiesPatch object itself.
     */
    public MetadataPropertiesPatch withCategories(MetadataCategories categories) {
        this.categories = categories;
        return this;
    }

    /**
     * Get the providers property: Providers for the solution content item.
     *
     * @return the providers value.
     */
    public List<String> providers() {
        return this.providers;
    }

    /**
     * Set the providers property: Providers for the solution content item.
     *
     * @param providers the providers value to set.
     * @return the MetadataPropertiesPatch object itself.
     */
    public MetadataPropertiesPatch withProviders(List<String> providers) {
        this.providers = providers;
        return this;
    }

    /**
     * Get the firstPublishDate property: first publish date solution content item.
     *
     * @return the firstPublishDate value.
     */
    public LocalDate firstPublishDate() {
        return this.firstPublishDate;
    }

    /**
     * Set the firstPublishDate property: first publish date solution content item.
     *
     * @param firstPublishDate the firstPublishDate value to set.
     * @return the MetadataPropertiesPatch object itself.
     */
    public MetadataPropertiesPatch withFirstPublishDate(LocalDate firstPublishDate) {
        this.firstPublishDate = firstPublishDate;
        return this;
    }

    /**
     * Get the lastPublishDate property: last publish date for the solution content item.
     *
     * @return the lastPublishDate value.
     */
    public LocalDate lastPublishDate() {
        return this.lastPublishDate;
    }

    /**
     * Set the lastPublishDate property: last publish date for the solution content item.
     *
     * @param lastPublishDate the lastPublishDate value to set.
     * @return the MetadataPropertiesPatch object itself.
     */
    public MetadataPropertiesPatch withLastPublishDate(LocalDate lastPublishDate) {
        this.lastPublishDate = lastPublishDate;
        return this;
    }

    /**
     * Get the customVersion property: The custom version of the content. A optional free text.
     *
     * @return the customVersion value.
     */
    public String customVersion() {
        return this.customVersion;
    }

    /**
     * Set the customVersion property: The custom version of the content. A optional free text.
     *
     * @param customVersion the customVersion value to set.
     * @return the MetadataPropertiesPatch object itself.
     */
    public MetadataPropertiesPatch withCustomVersion(String customVersion) {
        this.customVersion = customVersion;
        return this;
    }

    /**
     * Get the contentSchemaVersion property: Schema version of the content. Can be used to distinguish between
     * different flow based on the schema version.
     *
     * @return the contentSchemaVersion value.
     */
    public String contentSchemaVersion() {
        return this.contentSchemaVersion;
    }

    /**
     * Set the contentSchemaVersion property: Schema version of the content. Can be used to distinguish between
     * different flow based on the schema version.
     *
     * @param contentSchemaVersion the contentSchemaVersion value to set.
     * @return the MetadataPropertiesPatch object itself.
     */
    public MetadataPropertiesPatch withContentSchemaVersion(String contentSchemaVersion) {
        this.contentSchemaVersion = contentSchemaVersion;
        return this;
    }

    /**
     * Get the icon property: the icon identifier. this id can later be fetched from the solution template.
     *
     * @return the icon value.
     */
    public String icon() {
        return this.icon;
    }

    /**
     * Set the icon property: the icon identifier. this id can later be fetched from the solution template.
     *
     * @param icon the icon value to set.
     * @return the MetadataPropertiesPatch object itself.
     */
    public MetadataPropertiesPatch withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * Get the threatAnalysisTactics property: the tactics the resource covers.
     *
     * @return the threatAnalysisTactics value.
     */
    public List<String> threatAnalysisTactics() {
        return this.threatAnalysisTactics;
    }

    /**
     * Set the threatAnalysisTactics property: the tactics the resource covers.
     *
     * @param threatAnalysisTactics the threatAnalysisTactics value to set.
     * @return the MetadataPropertiesPatch object itself.
     */
    public MetadataPropertiesPatch withThreatAnalysisTactics(List<String> threatAnalysisTactics) {
        this.threatAnalysisTactics = threatAnalysisTactics;
        return this;
    }

    /**
     * Get the threatAnalysisTechniques property: the techniques the resource covers, these have to be aligned with the
     * tactics being used.
     *
     * @return the threatAnalysisTechniques value.
     */
    public List<String> threatAnalysisTechniques() {
        return this.threatAnalysisTechniques;
    }

    /**
     * Set the threatAnalysisTechniques property: the techniques the resource covers, these have to be aligned with the
     * tactics being used.
     *
     * @param threatAnalysisTechniques the threatAnalysisTechniques value to set.
     * @return the MetadataPropertiesPatch object itself.
     */
    public MetadataPropertiesPatch withThreatAnalysisTechniques(List<String> threatAnalysisTechniques) {
        this.threatAnalysisTechniques = threatAnalysisTechniques;
        return this;
    }

    /**
     * Get the previewImages property: preview image file names. These will be taken from the solution artifacts.
     *
     * @return the previewImages value.
     */
    public List<String> previewImages() {
        return this.previewImages;
    }

    /**
     * Set the previewImages property: preview image file names. These will be taken from the solution artifacts.
     *
     * @param previewImages the previewImages value to set.
     * @return the MetadataPropertiesPatch object itself.
     */
    public MetadataPropertiesPatch withPreviewImages(List<String> previewImages) {
        this.previewImages = previewImages;
        return this;
    }

    /**
     * Get the previewImagesDark property: preview image file names. These will be taken from the solution artifacts.
     * used for dark theme support.
     *
     * @return the previewImagesDark value.
     */
    public List<String> previewImagesDark() {
        return this.previewImagesDark;
    }

    /**
     * Set the previewImagesDark property: preview image file names. These will be taken from the solution artifacts.
     * used for dark theme support.
     *
     * @param previewImagesDark the previewImagesDark value to set.
     * @return the MetadataPropertiesPatch object itself.
     */
    public MetadataPropertiesPatch withPreviewImagesDark(List<String> previewImagesDark) {
        this.previewImagesDark = previewImagesDark;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (source() != null) {
            source().validate();
        }
        if (author() != null) {
            author().validate();
        }
        if (support() != null) {
            support().validate();
        }
        if (dependencies() != null) {
            dependencies().validate();
        }
        if (categories() != null) {
            categories().validate();
        }
    }
}
