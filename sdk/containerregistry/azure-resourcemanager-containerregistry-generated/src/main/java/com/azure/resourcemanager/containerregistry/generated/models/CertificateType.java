// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The type of certificate location. */
public final class CertificateType extends ExpandableStringEnum<CertificateType> {
    /** Static value LocalDirectory for CertificateType. */
    public static final CertificateType LOCAL_DIRECTORY = fromString("LocalDirectory");

    /**
     * Creates or finds a CertificateType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CertificateType.
     */
    @JsonCreator
    public static CertificateType fromString(String name) {
        return fromString(name, CertificateType.class);
    }

    /**
     * Gets known CertificateType values.
     *
     * @return known CertificateType values.
     */
    public static Collection<CertificateType> values() {
        return values(CertificateType.class);
    }
}
