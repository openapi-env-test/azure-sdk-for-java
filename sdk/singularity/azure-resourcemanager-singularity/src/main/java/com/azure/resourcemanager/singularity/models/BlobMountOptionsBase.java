// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.singularity.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes options to use when mounting a storage cache container backed by Azure blob storage. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "kind",
    defaultImpl = BlobMountOptionsBase.class)
@JsonTypeName("BlobMountOptionsBase")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Fuse", value = BlobFuseMountOptions.class),
    @JsonSubTypes.Type(name = "Interception", value = BlobInterceptionMountOptions.class)
})
@Immutable
public class BlobMountOptionsBase {
    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
