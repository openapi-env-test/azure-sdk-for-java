// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AccountEncryptionKeyType. */
public final class AccountEncryptionKeyType extends ExpandableStringEnum<AccountEncryptionKeyType> {
    /** Static value SystemKey for AccountEncryptionKeyType. */
    public static final AccountEncryptionKeyType SYSTEM_KEY = fromString("SystemKey");

    /** Static value CustomerKey for AccountEncryptionKeyType. */
    public static final AccountEncryptionKeyType CUSTOMER_KEY = fromString("CustomerKey");

    /**
     * Creates or finds a AccountEncryptionKeyType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AccountEncryptionKeyType.
     */
    @JsonCreator
    public static AccountEncryptionKeyType fromString(String name) {
        return fromString(name, AccountEncryptionKeyType.class);
    }

    /** @return known AccountEncryptionKeyType values. */
    public static Collection<AccountEncryptionKeyType> values() {
        return values(AccountEncryptionKeyType.class);
    }
}
