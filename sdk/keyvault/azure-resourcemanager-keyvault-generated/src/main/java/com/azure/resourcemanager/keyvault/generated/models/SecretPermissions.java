// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SecretPermissions. */
public final class SecretPermissions extends ExpandableStringEnum<SecretPermissions> {
    /** Static value all for SecretPermissions. */
    public static final SecretPermissions ALL = fromString("all");

    /** Static value get for SecretPermissions. */
    public static final SecretPermissions GET = fromString("get");

    /** Static value list for SecretPermissions. */
    public static final SecretPermissions LIST = fromString("list");

    /** Static value set for SecretPermissions. */
    public static final SecretPermissions SET = fromString("set");

    /** Static value delete for SecretPermissions. */
    public static final SecretPermissions DELETE = fromString("delete");

    /** Static value backup for SecretPermissions. */
    public static final SecretPermissions BACKUP = fromString("backup");

    /** Static value restore for SecretPermissions. */
    public static final SecretPermissions RESTORE = fromString("restore");

    /** Static value recover for SecretPermissions. */
    public static final SecretPermissions RECOVER = fromString("recover");

    /** Static value purge for SecretPermissions. */
    public static final SecretPermissions PURGE = fromString("purge");

    /**
     * Creates or finds a SecretPermissions from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SecretPermissions.
     */
    @JsonCreator
    public static SecretPermissions fromString(String name) {
        return fromString(name, SecretPermissions.class);
    }

    /**
     * Gets known SecretPermissions values.
     *
     * @return known SecretPermissions values.
     */
    public static Collection<SecretPermissions> values() {
        return values(SecretPermissions.class);
    }
}
