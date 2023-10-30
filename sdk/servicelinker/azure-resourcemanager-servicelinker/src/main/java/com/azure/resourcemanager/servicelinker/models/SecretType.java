// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The secret type. */
public final class SecretType extends ExpandableStringEnum<SecretType> {
    /** Static value rawValue for SecretType. */
    public static final SecretType RAW_VALUE = fromString("rawValue");

    /** Static value keyVaultSecretUri for SecretType. */
    public static final SecretType KEY_VAULT_SECRET_URI = fromString("keyVaultSecretUri");

    /** Static value keyVaultSecretReference for SecretType. */
    public static final SecretType KEY_VAULT_SECRET_REFERENCE = fromString("keyVaultSecretReference");

    /**
     * Creates a new instance of SecretType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SecretType() {
    }

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
