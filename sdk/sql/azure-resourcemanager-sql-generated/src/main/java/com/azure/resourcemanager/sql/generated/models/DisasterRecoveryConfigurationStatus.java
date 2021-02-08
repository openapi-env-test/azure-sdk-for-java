// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DisasterRecoveryConfigurationStatus. */
public final class DisasterRecoveryConfigurationStatus
    extends ExpandableStringEnum<DisasterRecoveryConfigurationStatus> {
    /** Static value Creating for DisasterRecoveryConfigurationStatus. */
    public static final DisasterRecoveryConfigurationStatus CREATING = fromString("Creating");

    /** Static value Ready for DisasterRecoveryConfigurationStatus. */
    public static final DisasterRecoveryConfigurationStatus READY = fromString("Ready");

    /** Static value FailingOver for DisasterRecoveryConfigurationStatus. */
    public static final DisasterRecoveryConfigurationStatus FAILING_OVER = fromString("FailingOver");

    /** Static value Dropping for DisasterRecoveryConfigurationStatus. */
    public static final DisasterRecoveryConfigurationStatus DROPPING = fromString("Dropping");

    /**
     * Creates or finds a DisasterRecoveryConfigurationStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DisasterRecoveryConfigurationStatus.
     */
    @JsonCreator
    public static DisasterRecoveryConfigurationStatus fromString(String name) {
        return fromString(name, DisasterRecoveryConfigurationStatus.class);
    }

    /** @return known DisasterRecoveryConfigurationStatus values. */
    public static Collection<DisasterRecoveryConfigurationStatus> values() {
        return values(DisasterRecoveryConfigurationStatus.class);
    }
}
