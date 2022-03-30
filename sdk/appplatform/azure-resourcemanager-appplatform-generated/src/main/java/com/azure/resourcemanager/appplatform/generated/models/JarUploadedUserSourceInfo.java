// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Uploaded Jar binary for a deployment. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Jar")
@Fluent
public final class JarUploadedUserSourceInfo extends UploadedUserSourceInfo {
    /*
     * Runtime version of the Jar file
     */
    @JsonProperty(value = "runtimeVersion")
    private String runtimeVersion;

    /*
     * JVM parameter
     */
    @JsonProperty(value = "jvmOptions")
    private String jvmOptions;

    /**
     * Get the runtimeVersion property: Runtime version of the Jar file.
     *
     * @return the runtimeVersion value.
     */
    public String runtimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Set the runtimeVersion property: Runtime version of the Jar file.
     *
     * @param runtimeVersion the runtimeVersion value to set.
     * @return the JarUploadedUserSourceInfo object itself.
     */
    public JarUploadedUserSourceInfo withRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }

    /**
     * Get the jvmOptions property: JVM parameter.
     *
     * @return the jvmOptions value.
     */
    public String jvmOptions() {
        return this.jvmOptions;
    }

    /**
     * Set the jvmOptions property: JVM parameter.
     *
     * @param jvmOptions the jvmOptions value to set.
     * @return the JarUploadedUserSourceInfo object itself.
     */
    public JarUploadedUserSourceInfo withJvmOptions(String jvmOptions) {
        this.jvmOptions = jvmOptions;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public JarUploadedUserSourceInfo withRelativePath(String relativePath) {
        super.withRelativePath(relativePath);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public JarUploadedUserSourceInfo withVersion(String version) {
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
