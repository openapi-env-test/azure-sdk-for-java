// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base class for content key ID location. A derived class must be used to represent the location. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "@odata\\.type",
    defaultImpl = ContentKeyPolicyPlayReadyContentKeyLocation.class)
@JsonTypeName("ContentKeyPolicyPlayReadyContentKeyLocation")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "#Microsoft.Media.ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader",
        value = ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader.class),
    @JsonSubTypes.Type(
        name = "#Microsoft.Media.ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifier",
        value = ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifier.class)
})
@JsonFlatten
@Immutable
public class ContentKeyPolicyPlayReadyContentKeyLocation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContentKeyPolicyPlayReadyContentKeyLocation.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
