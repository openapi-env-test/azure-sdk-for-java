// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Source information for a deployment. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = UserSourceInfo.class)
@JsonTypeName("UserSourceInfo")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "UploadedUserSourceInfo", value = UploadedUserSourceInfo.class),
    @JsonSubTypes.Type(name = "BuildResult", value = BuildResultUserSourceInfo.class),
    @JsonSubTypes.Type(name = "Container", value = CustomContainerUserSourceInfo.class)
})
@Fluent
public class UserSourceInfo {
    /*
     * Version of the source
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get the version property: Version of the source.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Version of the source.
     *
     * @param version the version value to set.
     * @return the UserSourceInfo object itself.
     */
    public UserSourceInfo withVersion(String version) {
        this.version = version;
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
