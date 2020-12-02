// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ContentKeyPolicyPlayReadyLicenseType. */
public final class ContentKeyPolicyPlayReadyLicenseType
    extends ExpandableStringEnum<ContentKeyPolicyPlayReadyLicenseType> {
    /** Static value Unknown for ContentKeyPolicyPlayReadyLicenseType. */
    public static final ContentKeyPolicyPlayReadyLicenseType UNKNOWN = fromString("Unknown");

    /** Static value NonPersistent for ContentKeyPolicyPlayReadyLicenseType. */
    public static final ContentKeyPolicyPlayReadyLicenseType NON_PERSISTENT = fromString("NonPersistent");

    /** Static value Persistent for ContentKeyPolicyPlayReadyLicenseType. */
    public static final ContentKeyPolicyPlayReadyLicenseType PERSISTENT = fromString("Persistent");

    /**
     * Creates or finds a ContentKeyPolicyPlayReadyLicenseType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ContentKeyPolicyPlayReadyLicenseType.
     */
    @JsonCreator
    public static ContentKeyPolicyPlayReadyLicenseType fromString(String name) {
        return fromString(name, ContentKeyPolicyPlayReadyLicenseType.class);
    }

    /** @return known ContentKeyPolicyPlayReadyLicenseType values. */
    public static Collection<ContentKeyPolicyPlayReadyLicenseType> values() {
        return values(ContentKeyPolicyPlayReadyLicenseType.class);
    }
}
