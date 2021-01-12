// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.contoso_cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CertificateSource. */
public final class CertificateSource extends ExpandableStringEnum<CertificateSource> {
    /** Static value AzureKeyVault for CertificateSource. */
    public static final CertificateSource AZURE_KEY_VAULT = fromString("AzureKeyVault");

    /** Static value Cdn for CertificateSource. */
    public static final CertificateSource CDN = fromString("Cdn");

    /**
     * Creates or finds a CertificateSource from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CertificateSource.
     */
    @JsonCreator
    public static CertificateSource fromString(String name) {
        return fromString(name, CertificateSource.class);
    }

    /** @return known CertificateSource values. */
    public static Collection<CertificateSource> values() {
        return values(CertificateSource.class);
    }
}
