// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Uploaded Java source code binary for a deployment. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Source")
@Fluent
public final class SourceUploadedUserSourceInfo extends UploadedUserSourceInfo {
    /*
     * Selector for the artifact to be used for the deployment for multi-module
     * projects. This should be
     * the relative path to the target module/project.
     */
    @JsonProperty(value = "artifactSelector")
    private String artifactSelector;

    /*
     * Runtime version of the source file
     */
    @JsonProperty(value = "runtimeVersion")
    private String runtimeVersion;

    /**
     * Get the artifactSelector property: Selector for the artifact to be used for the deployment for multi-module
     * projects. This should be the relative path to the target module/project.
     *
     * @return the artifactSelector value.
     */
    public String artifactSelector() {
        return this.artifactSelector;
    }

    /**
     * Set the artifactSelector property: Selector for the artifact to be used for the deployment for multi-module
     * projects. This should be the relative path to the target module/project.
     *
     * @param artifactSelector the artifactSelector value to set.
     * @return the SourceUploadedUserSourceInfo object itself.
     */
    public SourceUploadedUserSourceInfo withArtifactSelector(String artifactSelector) {
        this.artifactSelector = artifactSelector;
        return this;
    }

    /**
     * Get the runtimeVersion property: Runtime version of the source file.
     *
     * @return the runtimeVersion value.
     */
    public String runtimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Set the runtimeVersion property: Runtime version of the source file.
     *
     * @param runtimeVersion the runtimeVersion value to set.
     * @return the SourceUploadedUserSourceInfo object itself.
     */
    public SourceUploadedUserSourceInfo withRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SourceUploadedUserSourceInfo withRelativePath(String relativePath) {
        super.withRelativePath(relativePath);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SourceUploadedUserSourceInfo withVersion(String version) {
        super.withVersion(version);
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
