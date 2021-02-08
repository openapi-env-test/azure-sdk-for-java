// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Application stack major version. */
@Fluent
public final class StackMajorVersion {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StackMajorVersion.class);

    /*
     * Application stack major version (display only).
     */
    @JsonProperty(value = "displayVersion")
    private String displayVersion;

    /*
     * Application stack major version (runtime only).
     */
    @JsonProperty(value = "runtimeVersion")
    private String runtimeVersion;

    /*
     * <code>true</code> if this is the default major version; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "isDefault")
    private Boolean isDefault;

    /*
     * Minor versions associated with the major version.
     */
    @JsonProperty(value = "minorVersions")
    private List<StackMinorVersion> minorVersions;

    /*
     * <code>true</code> if this supports Application Insights; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "applicationInsights")
    private Boolean applicationInsights;

    /**
     * Get the displayVersion property: Application stack major version (display only).
     *
     * @return the displayVersion value.
     */
    public String displayVersion() {
        return this.displayVersion;
    }

    /**
     * Set the displayVersion property: Application stack major version (display only).
     *
     * @param displayVersion the displayVersion value to set.
     * @return the StackMajorVersion object itself.
     */
    public StackMajorVersion withDisplayVersion(String displayVersion) {
        this.displayVersion = displayVersion;
        return this;
    }

    /**
     * Get the runtimeVersion property: Application stack major version (runtime only).
     *
     * @return the runtimeVersion value.
     */
    public String runtimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Set the runtimeVersion property: Application stack major version (runtime only).
     *
     * @param runtimeVersion the runtimeVersion value to set.
     * @return the StackMajorVersion object itself.
     */
    public StackMajorVersion withRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }

    /**
     * Get the isDefault property: &lt;code&gt;true&lt;/code&gt; if this is the default major version; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isDefault value.
     */
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Set the isDefault property: &lt;code&gt;true&lt;/code&gt; if this is the default major version; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @param isDefault the isDefault value to set.
     * @return the StackMajorVersion object itself.
     */
    public StackMajorVersion withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Get the minorVersions property: Minor versions associated with the major version.
     *
     * @return the minorVersions value.
     */
    public List<StackMinorVersion> minorVersions() {
        return this.minorVersions;
    }

    /**
     * Set the minorVersions property: Minor versions associated with the major version.
     *
     * @param minorVersions the minorVersions value to set.
     * @return the StackMajorVersion object itself.
     */
    public StackMajorVersion withMinorVersions(List<StackMinorVersion> minorVersions) {
        this.minorVersions = minorVersions;
        return this;
    }

    /**
     * Get the applicationInsights property: &lt;code&gt;true&lt;/code&gt; if this supports Application Insights;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the applicationInsights value.
     */
    public Boolean applicationInsights() {
        return this.applicationInsights;
    }

    /**
     * Set the applicationInsights property: &lt;code&gt;true&lt;/code&gt; if this supports Application Insights;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param applicationInsights the applicationInsights value to set.
     * @return the StackMajorVersion object itself.
     */
    public StackMajorVersion withApplicationInsights(Boolean applicationInsights) {
        this.applicationInsights = applicationInsights;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (minorVersions() != null) {
            minorVersions().forEach(e -> e.validate());
        }
    }
}
