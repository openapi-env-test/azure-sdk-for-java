// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ConfidentialVMEncryptionType. */
public final class ConfidentialVMEncryptionType extends ExpandableStringEnum<ConfidentialVMEncryptionType> {
    /** Static value EncryptedVMGuestStateOnlyWithPmk for ConfidentialVMEncryptionType. */
    public static final ConfidentialVMEncryptionType ENCRYPTED_VMGUEST_STATE_ONLY_WITH_PMK =
        fromString("EncryptedVMGuestStateOnlyWithPmk");

    /** Static value EncryptedWithPmk for ConfidentialVMEncryptionType. */
    public static final ConfidentialVMEncryptionType ENCRYPTED_WITH_PMK = fromString("EncryptedWithPmk");

    /** Static value EncryptedWithCmk for ConfidentialVMEncryptionType. */
    public static final ConfidentialVMEncryptionType ENCRYPTED_WITH_CMK = fromString("EncryptedWithCmk");

    /**
     * Creates or finds a ConfidentialVMEncryptionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ConfidentialVMEncryptionType.
     */
    @JsonCreator
    public static ConfidentialVMEncryptionType fromString(String name) {
        return fromString(name, ConfidentialVMEncryptionType.class);
    }

    /** @return known ConfidentialVMEncryptionType values. */
    public static Collection<ConfidentialVMEncryptionType> values() {
        return values(ConfidentialVMEncryptionType.class);
    }
}
