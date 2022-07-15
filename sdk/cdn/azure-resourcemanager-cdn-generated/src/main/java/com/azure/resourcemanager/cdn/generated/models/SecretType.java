// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SecretType. */
public final class SecretType extends ExpandableStringEnum<SecretType> {
    /** Static value UrlSigningKey for SecretType. */
    public static final SecretType URL_SIGNING_KEY = fromString("UrlSigningKey");

    /** Static value CustomerCertificate for SecretType. */
    public static final SecretType CUSTOMER_CERTIFICATE = fromString("CustomerCertificate");

    /** Static value ManagedCertificate for SecretType. */
    public static final SecretType MANAGED_CERTIFICATE = fromString("ManagedCertificate");

    /** Static value AzureFirstPartyManagedCertificate for SecretType. */
    public static final SecretType AZURE_FIRST_PARTY_MANAGED_CERTIFICATE =
        fromString("AzureFirstPartyManagedCertificate");

    /**
     * Creates or finds a SecretType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SecretType.
     */
    @JsonCreator
    public static SecretType fromString(String name) {
        return fromString(name, SecretType.class);
    }

    /**
     * Gets known SecretType values.
     *
     * @return known SecretType values.
     */
    public static Collection<SecretType> values() {
        return values(SecretType.class);
    }
}
